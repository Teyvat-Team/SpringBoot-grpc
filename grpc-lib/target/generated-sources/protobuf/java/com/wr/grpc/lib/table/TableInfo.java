// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: table.proto

package com.wr.grpc.lib.table;

public final class TableInfo {
  private TableInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_table_TableRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_table_TableRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_table_TableResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_table_TableResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_table_TableList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_table_TableList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_table_DBTable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_table_DBTable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_table_TableSchemaRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_table_TableSchemaRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_table_TableSchemaResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_table_TableSchemaResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_table_Schema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_table_Schema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_table_DataTableInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_table_DataTableInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_table_DataTableInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_table_DataTableInfoResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_table_DimensionList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_table_DimensionList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_table_MetricList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_table_MetricList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_table_FunctionList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_table_FunctionList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013table.proto\022\005table\032\nbase.proto\"&\n\014Tabl" +
      "eRequest\022\026\n\016dataSourceName\030\001 \001(\t\"R\n\rTabl" +
      "eResponse\022\036\n\004data\030\001 \003(\0132\020.table.TableLis" +
      "t\022!\n\010baseResp\030\377\001 \001(\0132\016.base.BaseResp\"<\n\t" +
      "TableList\022\016\n\006dbName\030\001 \001(\t\022\037\n\007dbTable\030\002 \003" +
      "(\0132\016.table.DBTable\"-\n\007DBTable\022\021\n\ttableNa" +
      "me\030\001 \001(\t\022\017\n\007tableId\030\002 \001(\t\"M\n\022TableSchema" +
      "Request\022\026\n\016dataSourceName\030\001 \001(\t\022\016\n\006dbNam" +
      "e\030\002 \001(\t\022\017\n\007tableId\030\003 \001(\t\"W\n\023TableSchemaR" +
      "esponse\022\035\n\006schema\030\001 \003(\0132\r.table.Schema\022!" +
      "\n\010baseResp\030\377\001 \001(\0132\016.base.BaseResp\"H\n\006Sch" +
      "ema\022\014\n\004name\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022\r\n\005descr" +
      "\030\003 \001(\t\022\023\n\013isPartition\030\004 \001(\010\">\n\024DataTable" +
      "InfoRequest\022\021\n\tdatasetId\030\001 \001(\t\022\023\n\013dataTa" +
      "bleId\030\002 \001(\t\"\365\002\n\025DataTableInfoResponse\022\022\n" +
      "\ncreateTime\030\001 \001(\t\022\014\n\004name\030\002 \001(\t\022\r\n\005descr" +
      "\030\003 \001(\t\022\026\n\016dataSourceType\030\004 \001(\t\022\n\n\002id\030\005 \001" +
      "(\t\022\022\n\ncreateUser\030\006 \001(\t\022\016\n\006dbName\030\007 \001(\t\022\021" +
      "\n\ttableName\030\010 \001(\t\022\017\n\007tableId\030\t \001(\t\022\035\n\006sc" +
      "hema\030\n \003(\0132\r.table.Schema\022+\n\rdimensionLi" +
      "st\030\013 \003(\0132\024.table.DimensionList\022%\n\nmetric" +
      "List\030\014 \003(\0132\021.table.MetricList\022)\n\014functio" +
      "nList\030\r \003(\0132\023.table.FunctionList\022!\n\010base" +
      "Resp\030\377\001 \001(\0132\016.base.BaseResp\"O\n\rDimension" +
      "List\022\014\n\004name\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022\r\n\005desc" +
      "r\030\003 \001(\t\022\023\n\013isPartition\030\004 \001(\010\"L\n\nMetricLi" +
      "st\022\014\n\004name\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022\r\n\005descr\030" +
      "\003 \001(\t\022\023\n\013isPartition\030\004 \001(\010\"+\n\014FunctionLi" +
      "st\022\014\n\004name\030\001 \001(\t\022\r\n\005value\030\002 \001(\t2\313\001\n\014Tabl" +
      "eService\0223\n\004List\022\023.table.TableRequest\032\024." +
      "table.TableResponse\"\000\022A\n\006Schema\022\031.table." +
      "TableSchemaRequest\032\032.table.TableSchemaRe" +
      "sponse\"\000\022C\n\004Info\022\033.table.DataTableInfoRe" +
      "quest\032\034.table.DataTableInfoResponse\"\000B$\n" +
      "\025com.wr.grpc.lib.tableB\tTableInfoP\001b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.wr.grpc.lib.ResultCode.getDescriptor(),
        });
    internal_static_table_TableRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_table_TableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_table_TableRequest_descriptor,
        new java.lang.String[] { "DataSourceName", });
    internal_static_table_TableResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_table_TableResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_table_TableResponse_descriptor,
        new java.lang.String[] { "Data", "BaseResp", });
    internal_static_table_TableList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_table_TableList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_table_TableList_descriptor,
        new java.lang.String[] { "DbName", "DbTable", });
    internal_static_table_DBTable_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_table_DBTable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_table_DBTable_descriptor,
        new java.lang.String[] { "TableName", "TableId", });
    internal_static_table_TableSchemaRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_table_TableSchemaRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_table_TableSchemaRequest_descriptor,
        new java.lang.String[] { "DataSourceName", "DbName", "TableId", });
    internal_static_table_TableSchemaResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_table_TableSchemaResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_table_TableSchemaResponse_descriptor,
        new java.lang.String[] { "Schema", "BaseResp", });
    internal_static_table_Schema_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_table_Schema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_table_Schema_descriptor,
        new java.lang.String[] { "Name", "Type", "Descr", "IsPartition", });
    internal_static_table_DataTableInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_table_DataTableInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_table_DataTableInfoRequest_descriptor,
        new java.lang.String[] { "DatasetId", "DataTableId", });
    internal_static_table_DataTableInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_table_DataTableInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_table_DataTableInfoResponse_descriptor,
        new java.lang.String[] { "CreateTime", "Name", "Descr", "DataSourceType", "Id", "CreateUser", "DbName", "TableName", "TableId", "Schema", "DimensionList", "MetricList", "FunctionList", "BaseResp", });
    internal_static_table_DimensionList_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_table_DimensionList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_table_DimensionList_descriptor,
        new java.lang.String[] { "Name", "Type", "Descr", "IsPartition", });
    internal_static_table_MetricList_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_table_MetricList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_table_MetricList_descriptor,
        new java.lang.String[] { "Name", "Type", "Descr", "IsPartition", });
    internal_static_table_FunctionList_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_table_FunctionList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_table_FunctionList_descriptor,
        new java.lang.String[] { "Name", "Value", });
    com.wr.grpc.lib.ResultCode.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
