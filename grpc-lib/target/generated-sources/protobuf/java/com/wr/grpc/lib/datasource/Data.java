// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: datasource.proto

package com.wr.grpc.lib.datasource;

/**
 * Protobuf type {@code datasource.Data}
 */
public final class Data extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:datasource.Data)
    DataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Data.newBuilder() to construct.
  private Data(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Data() {
    dataSourceName_ = "";
    dataSourceType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Data();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Data(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            dataSourceName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            dataSourceType_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.wr.grpc.lib.datasource.DataSourceInfo.internal_static_datasource_Data_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.wr.grpc.lib.datasource.DataSourceInfo.internal_static_datasource_Data_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.wr.grpc.lib.datasource.Data.class, com.wr.grpc.lib.datasource.Data.Builder.class);
  }

  public static final int DATASOURCENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object dataSourceName_;
  /**
   * <code>string dataSourceName = 1;</code>
   * @return The dataSourceName.
   */
  @java.lang.Override
  public java.lang.String getDataSourceName() {
    java.lang.Object ref = dataSourceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataSourceName_ = s;
      return s;
    }
  }
  /**
   * <code>string dataSourceName = 1;</code>
   * @return The bytes for dataSourceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataSourceNameBytes() {
    java.lang.Object ref = dataSourceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataSourceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATASOURCETYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object dataSourceType_;
  /**
   * <code>string dataSourceType = 2;</code>
   * @return The dataSourceType.
   */
  @java.lang.Override
  public java.lang.String getDataSourceType() {
    java.lang.Object ref = dataSourceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dataSourceType_ = s;
      return s;
    }
  }
  /**
   * <code>string dataSourceType = 2;</code>
   * @return The bytes for dataSourceType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDataSourceTypeBytes() {
    java.lang.Object ref = dataSourceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dataSourceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getDataSourceNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, dataSourceName_);
    }
    if (!getDataSourceTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dataSourceType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getDataSourceNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, dataSourceName_);
    }
    if (!getDataSourceTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, dataSourceType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.wr.grpc.lib.datasource.Data)) {
      return super.equals(obj);
    }
    com.wr.grpc.lib.datasource.Data other = (com.wr.grpc.lib.datasource.Data) obj;

    if (!getDataSourceName()
        .equals(other.getDataSourceName())) return false;
    if (!getDataSourceType()
        .equals(other.getDataSourceType())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATASOURCENAME_FIELD_NUMBER;
    hash = (53 * hash) + getDataSourceName().hashCode();
    hash = (37 * hash) + DATASOURCETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDataSourceType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.wr.grpc.lib.datasource.Data parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wr.grpc.lib.datasource.Data parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wr.grpc.lib.datasource.Data parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wr.grpc.lib.datasource.Data parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wr.grpc.lib.datasource.Data parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.wr.grpc.lib.datasource.Data parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.wr.grpc.lib.datasource.Data parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wr.grpc.lib.datasource.Data parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wr.grpc.lib.datasource.Data parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.wr.grpc.lib.datasource.Data parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.wr.grpc.lib.datasource.Data parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.wr.grpc.lib.datasource.Data parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.wr.grpc.lib.datasource.Data prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code datasource.Data}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:datasource.Data)
      com.wr.grpc.lib.datasource.DataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.wr.grpc.lib.datasource.DataSourceInfo.internal_static_datasource_Data_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.wr.grpc.lib.datasource.DataSourceInfo.internal_static_datasource_Data_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.wr.grpc.lib.datasource.Data.class, com.wr.grpc.lib.datasource.Data.Builder.class);
    }

    // Construct using com.wr.grpc.lib.datasource.Data.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      dataSourceName_ = "";

      dataSourceType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.wr.grpc.lib.datasource.DataSourceInfo.internal_static_datasource_Data_descriptor;
    }

    @java.lang.Override
    public com.wr.grpc.lib.datasource.Data getDefaultInstanceForType() {
      return com.wr.grpc.lib.datasource.Data.getDefaultInstance();
    }

    @java.lang.Override
    public com.wr.grpc.lib.datasource.Data build() {
      com.wr.grpc.lib.datasource.Data result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.wr.grpc.lib.datasource.Data buildPartial() {
      com.wr.grpc.lib.datasource.Data result = new com.wr.grpc.lib.datasource.Data(this);
      result.dataSourceName_ = dataSourceName_;
      result.dataSourceType_ = dataSourceType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.wr.grpc.lib.datasource.Data) {
        return mergeFrom((com.wr.grpc.lib.datasource.Data)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.wr.grpc.lib.datasource.Data other) {
      if (other == com.wr.grpc.lib.datasource.Data.getDefaultInstance()) return this;
      if (!other.getDataSourceName().isEmpty()) {
        dataSourceName_ = other.dataSourceName_;
        onChanged();
      }
      if (!other.getDataSourceType().isEmpty()) {
        dataSourceType_ = other.dataSourceType_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.wr.grpc.lib.datasource.Data parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.wr.grpc.lib.datasource.Data) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object dataSourceName_ = "";
    /**
     * <code>string dataSourceName = 1;</code>
     * @return The dataSourceName.
     */
    public java.lang.String getDataSourceName() {
      java.lang.Object ref = dataSourceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataSourceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dataSourceName = 1;</code>
     * @return The bytes for dataSourceName.
     */
    public com.google.protobuf.ByteString
        getDataSourceNameBytes() {
      java.lang.Object ref = dataSourceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataSourceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dataSourceName = 1;</code>
     * @param value The dataSourceName to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dataSourceName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dataSourceName = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataSourceName() {
      
      dataSourceName_ = getDefaultInstance().getDataSourceName();
      onChanged();
      return this;
    }
    /**
     * <code>string dataSourceName = 1;</code>
     * @param value The bytes for dataSourceName to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dataSourceName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dataSourceType_ = "";
    /**
     * <code>string dataSourceType = 2;</code>
     * @return The dataSourceType.
     */
    public java.lang.String getDataSourceType() {
      java.lang.Object ref = dataSourceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dataSourceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string dataSourceType = 2;</code>
     * @return The bytes for dataSourceType.
     */
    public com.google.protobuf.ByteString
        getDataSourceTypeBytes() {
      java.lang.Object ref = dataSourceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dataSourceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string dataSourceType = 2;</code>
     * @param value The dataSourceType to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dataSourceType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string dataSourceType = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataSourceType() {
      
      dataSourceType_ = getDefaultInstance().getDataSourceType();
      onChanged();
      return this;
    }
    /**
     * <code>string dataSourceType = 2;</code>
     * @param value The bytes for dataSourceType to set.
     * @return This builder for chaining.
     */
    public Builder setDataSourceTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dataSourceType_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:datasource.Data)
  }

  // @@protoc_insertion_point(class_scope:datasource.Data)
  private static final com.wr.grpc.lib.datasource.Data DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.wr.grpc.lib.datasource.Data();
  }

  public static com.wr.grpc.lib.datasource.Data getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Data>
      PARSER = new com.google.protobuf.AbstractParser<Data>() {
    @java.lang.Override
    public Data parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Data(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Data> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Data> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.wr.grpc.lib.datasource.Data getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

