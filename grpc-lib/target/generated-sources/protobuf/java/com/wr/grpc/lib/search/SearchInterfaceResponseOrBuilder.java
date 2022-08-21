// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: search.proto

package com.wr.grpc.lib.search;

public interface SearchInterfaceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:search.SearchInterfaceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string cost = 1;</code>
   * @return The cost.
   */
  java.lang.String getCost();
  /**
   * <code>string cost = 1;</code>
   * @return The bytes for cost.
   */
  com.google.protobuf.ByteString
      getCostBytes();

  /**
   * <code>string sql = 2;</code>
   * @return The sql.
   */
  java.lang.String getSql();
  /**
   * <code>string sql = 2;</code>
   * @return The bytes for sql.
   */
  com.google.protobuf.ByteString
      getSqlBytes();

  /**
   * <code>repeated .search.Rows table = 3;</code>
   */
  java.util.List<com.wr.grpc.lib.search.Rows> 
      getTableList();
  /**
   * <code>repeated .search.Rows table = 3;</code>
   */
  com.wr.grpc.lib.search.Rows getTable(int index);
  /**
   * <code>repeated .search.Rows table = 3;</code>
   */
  int getTableCount();
  /**
   * <code>repeated .search.Rows table = 3;</code>
   */
  java.util.List<? extends com.wr.grpc.lib.search.RowsOrBuilder> 
      getTableOrBuilderList();
  /**
   * <code>repeated .search.Rows table = 3;</code>
   */
  com.wr.grpc.lib.search.RowsOrBuilder getTableOrBuilder(
      int index);

  /**
   * <pre>
   * 从 0 开始的偏置值
   * </pre>
   *
   * <code>int32 offset = 4;</code>
   * @return The offset.
   */
  int getOffset();

  /**
   * <code>int32 limit = 5;</code>
   * @return The limit.
   */
  int getLimit();

  /**
   * <code>int32 total = 6;</code>
   * @return The total.
   */
  int getTotal();

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
