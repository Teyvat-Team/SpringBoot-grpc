// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: search.proto

package com.wr.grpc.lib.search;

public final class SearchInfo {
  private SearchInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_search_SearchInterfaceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_search_SearchInterfaceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_search_SearchInterfaceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_search_SearchInterfaceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_search_SelectList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_search_SelectList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_search_Rows_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_search_Rows_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_search_Sort_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_search_Sort_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_search_RowItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_search_RowItem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014search.proto\022\006search\032\nbase.proto\"\327\001\n\026S" +
      "earchInterfaceRequest\022\021\n\tdatasetId\030\001 \001(\t" +
      "\022\017\n\007tableId\030\002 \001(\t\022\r\n\005cache\030\003 \001(\010\022&\n\nsele" +
      "ctList\030\004 \003(\0132\022.search.SelectList\022\022\n\nwher" +
      "eCause\030\005 \001(\t\022\023\n\013groupByList\030\006 \003(\t\022\032\n\004sor" +
      "t\030\007 \003(\0132\014.search.Sort\022\016\n\006offset\030\010 \001(\005\022\r\n" +
      "\005limit\030\t \001(\005\"\242\001\n\027SearchInterfaceResponse" +
      "\022\014\n\004cost\030\001 \001(\t\022\013\n\003sql\030\002 \001(\t\022\033\n\005table\030\003 \003" +
      "(\0132\014.search.Rows\022\016\n\006offset\030\004 \001(\005\022\r\n\005limi" +
      "t\030\005 \001(\005\022\r\n\005total\030\006 \001(\005\022!\n\010baseResp\030\377\001 \001(" +
      "\0132\016.base.BaseResp\"-\n\nSelectList\022\020\n\010funct" +
      "ion\030\001 \001(\t\022\r\n\005field\030\002 \001(\t\"$\n\004Rows\022\034\n\003row\030" +
      "\001 \003(\0132\017.search.RowItem\"$\n\004Sort\022\r\n\005field\030" +
      "\001 \001(\t\022\r\n\005order\030\002 \001(\t\"%\n\007RowItem\022\013\n\003key\030\001" +
      " \001(\t\022\r\n\005value\030\002 \001(\t2[\n\rSearchService\022J\n\005" +
      "Query\022\036.search.SearchInterfaceRequest\032\037." +
      "search.SearchInterfaceResponse\"\000B&\n\026com." +
      "wr.grpc.lib.searchB\nSearchInfoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.wr.grpc.lib.ResultCode.getDescriptor(),
        });
    internal_static_search_SearchInterfaceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_search_SearchInterfaceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_search_SearchInterfaceRequest_descriptor,
        new java.lang.String[] { "DatasetId", "TableId", "Cache", "SelectList", "WhereCause", "GroupByList", "Sort", "Offset", "Limit", });
    internal_static_search_SearchInterfaceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_search_SearchInterfaceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_search_SearchInterfaceResponse_descriptor,
        new java.lang.String[] { "Cost", "Sql", "Table", "Offset", "Limit", "Total", "BaseResp", });
    internal_static_search_SelectList_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_search_SelectList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_search_SelectList_descriptor,
        new java.lang.String[] { "Function", "Field", });
    internal_static_search_Rows_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_search_Rows_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_search_Rows_descriptor,
        new java.lang.String[] { "Row", });
    internal_static_search_Sort_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_search_Sort_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_search_Sort_descriptor,
        new java.lang.String[] { "Field", "Order", });
    internal_static_search_RowItem_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_search_RowItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_search_RowItem_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.wr.grpc.lib.ResultCode.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
