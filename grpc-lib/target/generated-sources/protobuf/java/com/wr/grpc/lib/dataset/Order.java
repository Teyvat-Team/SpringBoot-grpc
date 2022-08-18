// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dataset.proto

package com.wr.grpc.lib.dataset;

/**
 * Protobuf enum {@code dataset.Order}
 */
public enum Order
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>asc = 0;</code>
   */
  asc(0),
  /**
   * <code>desc = 1;</code>
   */
  desc(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>asc = 0;</code>
   */
  public static final int asc_VALUE = 0;
  /**
   * <code>desc = 1;</code>
   */
  public static final int desc_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static Order valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Order forNumber(int value) {
    switch (value) {
      case 0: return asc;
      case 1: return desc;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Order>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Order> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Order>() {
          public Order findValueByNumber(int number) {
            return Order.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.wr.grpc.lib.dataset.DataSetInfo.getDescriptor().getEnumTypes().get(1);
  }

  private static final Order[] VALUES = values();

  public static Order valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Order(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:dataset.Order)
}
