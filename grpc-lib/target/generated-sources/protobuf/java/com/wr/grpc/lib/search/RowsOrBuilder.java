// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: search.proto

package com.wr.grpc.lib.search;

public interface RowsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:search.Rows)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .search.RowItem row = 1;</code>
   */
  java.util.List<com.wr.grpc.lib.search.RowItem> 
      getRowList();
  /**
   * <code>repeated .search.RowItem row = 1;</code>
   */
  com.wr.grpc.lib.search.RowItem getRow(int index);
  /**
   * <code>repeated .search.RowItem row = 1;</code>
   */
  int getRowCount();
  /**
   * <code>repeated .search.RowItem row = 1;</code>
   */
  java.util.List<? extends com.wr.grpc.lib.search.RowItemOrBuilder> 
      getRowOrBuilderList();
  /**
   * <code>repeated .search.RowItem row = 1;</code>
   */
  com.wr.grpc.lib.search.RowItemOrBuilder getRowOrBuilder(
      int index);
}
