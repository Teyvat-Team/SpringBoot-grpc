// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dataset.proto

package com.wr.grpc.lib.dataset;

public interface DeleteDatasetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dataset.DeleteDatasetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool data = 1;</code>
   * @return The data.
   */
  boolean getData();

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