// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: table.proto

package com.wr.grpc.lib.table;

public interface TableSchemaResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:table.TableSchemaResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 表名
   * </pre>
   *
   * <code>repeated .table.Schema schema = 1;</code>
   */
  java.util.List<com.wr.grpc.lib.table.Schema> 
      getSchemaList();
  /**
   * <pre>
   * 表名
   * </pre>
   *
   * <code>repeated .table.Schema schema = 1;</code>
   */
  com.wr.grpc.lib.table.Schema getSchema(int index);
  /**
   * <pre>
   * 表名
   * </pre>
   *
   * <code>repeated .table.Schema schema = 1;</code>
   */
  int getSchemaCount();
  /**
   * <pre>
   * 表名
   * </pre>
   *
   * <code>repeated .table.Schema schema = 1;</code>
   */
  java.util.List<? extends com.wr.grpc.lib.table.SchemaOrBuilder> 
      getSchemaOrBuilderList();
  /**
   * <pre>
   * 表名
   * </pre>
   *
   * <code>repeated .table.Schema schema = 1;</code>
   */
  com.wr.grpc.lib.table.SchemaOrBuilder getSchemaOrBuilder(
      int index);

  /**
   * <code>.base.BaseResp baseResp = 255;</code>
   * @return Whether the baseResp field is set.
   */
  boolean hasBaseResp();
  /**
   * <code>.base.BaseResp baseResp = 255;</code>
   * @return The baseResp.
   */
  com.wr.grpc.lib.BaseResp getBaseResp();
  /**
   * <code>.base.BaseResp baseResp = 255;</code>
   */
  com.wr.grpc.lib.BaseRespOrBuilder getBaseRespOrBuilder();
}
