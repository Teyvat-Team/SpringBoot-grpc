// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datasource.proto

package com.wr.grpc.lib.datasource;

public final class DataSourceInfo {
  private DataSourceInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_datasource_ListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_datasource_ListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_datasource_ListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_datasource_ListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_datasource_Data_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_datasource_Data_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020datasource.proto\022\ndatasource\032\nbase.pro" +
      "to\"\r\n\013ListRequest\"Q\n\014ListResponse\022\036\n\004dat" +
      "a\030\001 \003(\0132\020.datasource.Data\022!\n\010baseResp\030\377\001" +
      " \001(\0132\016.base.BaseResp\"6\n\004Data\022\026\n\016dataSour" +
      "ceName\030\001 \001(\t\022\026\n\016dataSourceType\030\002 \001(\t2P\n\021" +
      "DataSourceService\022;\n\004List\022\027.datasource.L" +
      "istRequest\032\030.datasource.ListResponse\"\000B." +
      "\n\032com.wr.grpc.lib.datasourceB\016DataSource" +
      "InfoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.wr.grpc.lib.ResultCode.getDescriptor(),
        });
    internal_static_datasource_ListRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_datasource_ListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_datasource_ListRequest_descriptor,
        new java.lang.String[] { });
    internal_static_datasource_ListResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_datasource_ListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_datasource_ListResponse_descriptor,
        new java.lang.String[] { "Data", "BaseResp", });
    internal_static_datasource_Data_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_datasource_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_datasource_Data_descriptor,
        new java.lang.String[] { "DataSourceName", "DataSourceType", });
    com.wr.grpc.lib.ResultCode.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}