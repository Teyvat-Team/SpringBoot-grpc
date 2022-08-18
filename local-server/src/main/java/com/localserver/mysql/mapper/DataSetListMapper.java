package com.localserver.mysql.mapper;

import com.localserver.mysql.model.po.DataSet;
import com.wr.grpc.lib.dataset.Order;
import com.wr.grpc.lib.dataset.OrderBy;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface DataSetListMapper {

    //动态拼接查询语句
    @SelectProvider(type = LearnSqlBuilder.class, method = "queryLearnResouceByParams")
    List<DataSet> queryLearnResouceList(Map<String, Object> params);

    class LearnSqlBuilder {
        //动态构造查询语句
        public String queryLearnResouceByParams(Map<String, Object> params) {
            StringBuffer sql = new StringBuffer();
            sql.append("select id,data_name,data_descr,data_source_type,db_name,create_user,create_time,status from data_set where create_user=").append(params.get("createUser"));
//            sql.append("select * from data_set where create_user=111");
            if (!StringUtils.isEmpty((String) params.get("keyword"))) {
                sql.append(" and data_name like '%").append((String) params.get("keyword")).append("%'");
            }
            if (params.get("orderBy") != null) {
//                sql.append(" order by ").append(params.get("orderBy"));
                sql.append(" order by create_time ");
            }
            if (params.get("order") != null) {
                Order order = (Order) params.get("order");

                if (order == Order.desc)
                    sql.append(" desc ");
            }
            if (params.get("page") != null && params.get("pageSize") != null) {
                Integer page = (Integer) params.get("page");
                Integer pageSize = (Integer) params.get("pageSize");
                sql.append(" limit ").append(page).append(" offset ").append(pageSize * (page - 1));
            }


            System.out.println("查询sql==" + sql.toString());
            return sql.toString();
        }

    }
}

