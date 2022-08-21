package com.localserver.grpc;

import com.localserver.utils.ClickHouseJDBC;
import com.wr.grpc.lib.BaseResp;
import com.wr.grpc.lib.search.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import javax.management.Query;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xulong
 * @date 2022/8/19
 */
@GrpcService
public class SearchService extends SearchServiceGrpc.SearchServiceImplBase {

    /**
     * 查询接口
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void query(SearchInterfaceRequest request, StreamObserver<SearchInterfaceResponse> responseObserver) {
        StringBuilder sql = new StringBuilder("select ");
        List<SelectList> selectLists = request.getSelectListList();
        Map<String, String> mp = new HashMap<>();
        int length = request.getGroupByListCount()-1;
        if (length >= 0) {
            for (int i = 0; i < length; i++) {
                sql.append(request.getGroupByList(i) + ",");
            }
            if (selectLists.size() == 0)
                sql.append(request.getGroupByList(length) + " ");
            else
                sql.append(request.getGroupByList(length) + ", ");
        }

        length = selectLists.size()-1;
        if (length >= 0) {
            for (int i = 0; i < length; i++) {
                sql.append(selectLists.get(i).getFunction() + "(" + selectLists.get(i).getField() + "), ");
                mp.put(selectLists.get(i).getField(), selectLists.get(i).getFunction());
            }
            sql.append(selectLists.get(length).getFunction() + "(" + selectLists.get(length).getField() + ") from " + request.getTableId() + " ");
            mp.put(selectLists.get(length).getField(), selectLists.get(length).getFunction());
        }
        if (request.getWhereCause() != null && request.getWhereCause().length() != 0)
            sql.append("where " + request.getWhereCause());

        length = request.getGroupByListCount()-1;
        if (length >= 0) {
            sql.append(" group by ");
            for (int i = 0; i < length; i++) {
                sql.append(request.getGroupByList(i) + ",");
            }
            sql.append(request.getGroupByList(length) + " ");
        }

        length = request.getSortCount()-1;
        if (length >= 0) {
            sql.append("order by ");
            for (int i = 0; i < length; i++) {
                String str = request.getSort(i).getField();
                if (mp.get(str) != null)
                    str = mp.get(str) + "("+str+")";
                sql.append(str + " " + request.getSort(i).getOrder() + ",");
            }
            String str = request.getSort(length).getField();
            if (mp.get(str) != null)
                str = mp.get(str) + "("+str+")";
            sql.append(str+ " "+ request.getSort(length).getOrder());
        }
        // 求总的记录数的sql语句
        String sqlcount = new String("select count(*) from (" + sql.toString() + ")");

        sql.append(" limit " + request.getOffset() + "," + request.getLimit());

        SearchInterfaceResponse.Builder builder = SearchInterfaceResponse.newBuilder();
        List<Rows> table = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            connection= ClickHouseJDBC.getConnection();
            statement = connection.createStatement();
             // 求总行数
            ResultSet rs = statement.executeQuery(sqlcount.toString());
            rs.next();
            int total = rs.getInt(1);
            builder.setTotal(total);
            //5.执行sql
            long stime = System.currentTimeMillis();
            resultSet = statement.executeQuery(sql.toString());
            long etime = System.currentTimeMillis();
            builder.setCost(String.valueOf(etime-stime));  // 查找花费时间
            try{

                String content = sql.toString();
                File file =new File("sqlexecuterecord.txt");
                if(!file.exists()){
                    file.createNewFile();
                }
                FileWriter fileWritter = new FileWriter(file.getName()+"\n"+stime+"\n"+etime+"\n",true);
                fileWritter.write(content);
                fileWritter.close();
                System.out.println("finish");
            }catch(IOException e){
                e.printStackTrace();
            }
            builder.setSql(sql.toString());
            ResultSetMetaData rsmd = resultSet.getMetaData();

            List<Rows> RowsList = new ArrayList<>();
            while(resultSet.next()) {
                Rows.Builder rows = Rows.newBuilder();
                List<RowItem> rowItemList = new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    RowItem item = RowItem.newBuilder().setKey(rsmd.getColumnName(i)).setValue(resultSet.getString(rsmd.getColumnName(i))).build();
                    rowItemList.add(item);
                }
                rows.addAllRow(rowItemList);
                RowsList.add(rows.build());
            }
            builder.addAllTable(RowsList);
            BaseResp.Builder success = BaseResp.newBuilder().setCode(200).setMessage("success");
            SearchInterfaceResponse response = builder.setBaseResp(success).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }catch (Exception e) {
            BaseResp.Builder success = BaseResp.newBuilder().setCode(404).setMessage("不支持的sql操作");
            SearchInterfaceResponse response = builder.setBaseResp(success).build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            System.out.println(e.getMessage());
        } finally {
            ClickHouseJDBC.close(statement, connection, resultSet);
        }
    }
}
