package com.localserver.mysql.controller;

import cn.hutool.core.date.DateTime;
import com.alibaba.fastjson.JSONObject;
import com.localserver.clickhouse.model.po.SchemaTable;
import com.localserver.clickhouse.service.ISchemaService;
import com.localserver.mysql.model.po.CreateTable;
import com.localserver.mysql.model.po.DataModel;
import com.localserver.mysql.model.po.DataSet;
import com.localserver.mysql.model.po.DatasetId;
import com.localserver.mysql.model.po.datasetResponse.DataSetList;
import com.localserver.mysql.model.po.datasetResponse.DataSetListResponse;
import com.localserver.mysql.model.po.datasetResponse.DataSetListResponseData;
import com.localserver.mysql.model.po.datasetResponse.Schema;
import com.localserver.mysql.service.IDataModelService;
import com.localserver.mysql.service.IDatasetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/dataset")
@ResponseBody
public class DataSetController {

    @Autowired
    IDatasetService datasetservice;

    @Autowired
    IDataModelService dataModelService;

    @Autowired
    ISchemaService schemaService;

    @RequestMapping(value = "datasetList", method = RequestMethod.GET)
    public String selectDataset(@RequestParam(value = "createUser") String createUser,
                                @RequestParam(value = "orderBy", required = false) String orderBy,
                                @RequestParam(value = "order", required = false) String order,
                                @RequestParam(value = "page", required = false) Integer page,
                                @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                @RequestParam(value = "keyword", required = false) String keyword) {
        Map<String, Object> params = new HashMap<>();
        params.put("createUser", createUser);
        params.put("orderBy", orderBy);
        params.put("order", order);
        params.put("page", page);
        params.put("pageSize", pageSize);
        params.put("keyword", keyword);
        List<DataSet> datasets = datasetservice.listDataset(params);
        List<DataSetListResponseData> dataSetListResponse = new ArrayList<>();
        for (int i = 0; i < datasets.size(); i++) {
            DataSetListResponseData dataSetListResponseData = new DataSetListResponseData();
            List<DataSetList> dataSetLists = new ArrayList<>();

            Integer datasetId = datasets.get(i).getId();
            List<String> table_names = datasetservice.listTableByDatasetId(datasetId);

            for (int j = 0; j < table_names.size(); j++) {
                String tableName = table_names.get(j);
                List<SchemaTable> schemas = schemaService.selectSchema(tableName);


                DataSetList dataSetList = new DataSetList();
                dataSetList.setCreateTime(String.valueOf(datasets.get(i).getCreateTime()));
                dataSetList.setName(datasets.get(i).getDbName());
                dataSetList.setDescr(datasets.get(i).getDataDescr());
                dataSetList.setDataSourceType(datasets.get(i).getDataSourceType());
                dataSetList.setId(String.valueOf(datasets.get(i).getId()));
                dataSetList.setCreateUser(datasets.get(i).getCreateUser());
                dataSetList.setDbName(schemas.get(0).getDatabase());
                dataSetList.setTableName(tableName);
                dataSetList.setTableId(tableName);
                List<Schema> sch = new ArrayList<>();
                for (int k = 0; k < schemas.size(); k++) {
                    sch.add(new Schema(schemas.get(k).getName(), schemas.get(k).getType(),
                            schemas.get(k).getComment(), false));
                }
                dataSetList.setSchema(sch.toArray(new Schema[sch.size()]));
                dataSetLists.add(dataSetList);
            }
            dataSetListResponseData.setDataSetList(dataSetLists.toArray(new DataSetList[dataSetLists.size()]));
            dataSetListResponseData.setTotalCount(dataSetLists.size());

            dataSetListResponse.add(dataSetListResponseData);
        }
        DataSetListResponse dataSetListResponseData = new DataSetListResponse();
        dataSetListResponseData.setDataSetListResponseData(dataSetListResponse.toArray(new DataSetListResponseData[dataSetListResponse.size()]));
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("dataSetListResponseData", dataSetListResponseData);
        return jsonObject.toJSONString();
    }

    @Transactional
    @RequestMapping(value = "createDataset", method = RequestMethod.POST)
    public String insertDataset(@RequestBody CreateTable[] createTable) {
        DataSet dataset = new DataSet();
        dataset.setDataName(createTable[0].getName());
        dataset.setDataDescr(createTable[0].getDescr());
        dataset.setDataDescr(createTable[0].getDataSourceName());
        dataset.setDbName(createTable[0].getDbName());
        dataset.setCreateTime(String.valueOf(new Timestamp(new DateTime().getTime())));
        dataset.setCreateUser(createTable[0].getCreateUser());
        Integer dataset_id = datasetservice.insertDataset(dataset);

        for (int i = 0; i < createTable.length; i++) {
            for (int j = 0; j < createTable[i].getAttr().getDimension().length; j++) {
                DataModel dataModel = new DataModel();
                dataModel.setAppId(dataset_id);
                dataModel.setTableName(createTable[i].getTableId());
                dataModel.setFieldName(createTable[i].getAttr().getDimension()[j]);
                dataModel.setDataType(0);
                dataModel.setViewType(0);
                dataModelService.insertDataModel(dataModel);
            }
            for (int j = 0; j < createTable[i].getAttr().getMatrix().length; j++) {
                DataModel dataModel = new DataModel();
                dataModel.setAppId(dataset_id);
                dataModel.setTableName(createTable[i].getTableId());
                dataModel.setFieldName(createTable[i].getAttr().getMatrix()[j]);
                dataModel.setDataType(1);
                dataModel.setViewType(0);
                dataModelService.insertDataModel(dataModel);
            }
        }
        JSONObject jsonObject = new JSONObject();
        DatasetId datasetId = new DatasetId(dataset_id);
        jsonObject.put("dataSetId", datasetId);
        return jsonObject.toJSONString();
    }


//    @GetMapping("/list")
//    public String testRes() {
//        System.out.println(personService + "值");
//        List<Person> list = personService.list();
//        for (Person person : list) {
//            System.out.println(person.getFirstName());
//            System.out.println(person.getLastName());
//        }
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("data", list);
//        return jsonObject.toJSONString();
//    }


}
