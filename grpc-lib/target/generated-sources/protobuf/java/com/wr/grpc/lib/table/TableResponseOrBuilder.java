// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: table.proto

package com.wr.grpc.lib.table;

public interface TableResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:table.TableResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .table.TableList data = 1;</code>
   */
  java.util.List<com.wr.grpc.lib.table.TableList> 
      getDataList();
  /**
   * <code>repeated .table.TableList data = 1;</code>
   */
  com.wr.grpc.lib.table.TableList getData(int index);
  /**
   * <code>repeated .table.TableList data = 1;</code>
   */
  int getDataCount();
  /**
   * <code>repeated .table.TableList data = 1;</code>
   */
  java.util.List<? extends com.wr.grpc.lib.table.TableListOrBuilder> 
      getDataOrBuilderList();
  /**
   * <code>repeated .table.TableList data = 1;</code>
   */
  com.wr.grpc.lib.table.TableListOrBuilder getDataOrBuilder(
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