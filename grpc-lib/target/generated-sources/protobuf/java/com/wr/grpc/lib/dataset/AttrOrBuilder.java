// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dataset.proto

package com.wr.grpc.lib.dataset;

public interface AttrOrBuilder extends
    // @@protoc_insertion_point(interface_extends:dataset.Attr)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string dimension = 1;</code>
   * @return A list containing the dimension.
   */
  java.util.List<java.lang.String>
      getDimensionList();
  /**
   * <code>repeated string dimension = 1;</code>
   * @return The count of dimension.
   */
  int getDimensionCount();
  /**
   * <code>repeated string dimension = 1;</code>
   * @param index The index of the element to return.
   * @return The dimension at the given index.
   */
  java.lang.String getDimension(int index);
  /**
   * <code>repeated string dimension = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dimension at the given index.
   */
  com.google.protobuf.ByteString
      getDimensionBytes(int index);

  /**
   * <code>repeated string matrix = 2;</code>
   * @return A list containing the matrix.
   */
  java.util.List<java.lang.String>
      getMatrixList();
  /**
   * <code>repeated string matrix = 2;</code>
   * @return The count of matrix.
   */
  int getMatrixCount();
  /**
   * <code>repeated string matrix = 2;</code>
   * @param index The index of the element to return.
   * @return The matrix at the given index.
   */
  java.lang.String getMatrix(int index);
  /**
   * <code>repeated string matrix = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the matrix at the given index.
   */
  com.google.protobuf.ByteString
      getMatrixBytes(int index);
}
