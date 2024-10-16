/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2020 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2024 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.netmgt.telemetry.protocols.jti.adapter.proto;

public final class FirewallOuterClass {
  private FirewallOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.jnprFirewallExt);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FirewallOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Firewall)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .FirewallStats firewall_stats = 1;</code>
     */
    java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats> 
        getFirewallStatsList();
    /**
     * <code>repeated .FirewallStats firewall_stats = 1;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats getFirewallStats(int index);
    /**
     * <code>repeated .FirewallStats firewall_stats = 1;</code>
     */
    int getFirewallStatsCount();
    /**
     * <code>repeated .FirewallStats firewall_stats = 1;</code>
     */
    java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStatsOrBuilder> 
        getFirewallStatsOrBuilderList();
    /**
     * <code>repeated .FirewallStats firewall_stats = 1;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStatsOrBuilder getFirewallStatsOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Top-level message
   * </pre>
   *
   * Protobuf type {@code Firewall}
   */
  public static final class Firewall extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Firewall)
      FirewallOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Firewall.newBuilder() to construct.
    private Firewall(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Firewall() {
      firewallStats_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Firewall();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_Firewall_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_Firewall_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall.Builder.class);
    }

    public static final int FIREWALL_STATS_FIELD_NUMBER = 1;
    private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats> firewallStats_;
    /**
     * <code>repeated .FirewallStats firewall_stats = 1;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats> getFirewallStatsList() {
      return firewallStats_;
    }
    /**
     * <code>repeated .FirewallStats firewall_stats = 1;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStatsOrBuilder> 
        getFirewallStatsOrBuilderList() {
      return firewallStats_;
    }
    /**
     * <code>repeated .FirewallStats firewall_stats = 1;</code>
     */
    @java.lang.Override
    public int getFirewallStatsCount() {
      return firewallStats_.size();
    }
    /**
     * <code>repeated .FirewallStats firewall_stats = 1;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats getFirewallStats(int index) {
      return firewallStats_.get(index);
    }
    /**
     * <code>repeated .FirewallStats firewall_stats = 1;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStatsOrBuilder getFirewallStatsOrBuilder(
        int index) {
      return firewallStats_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      for (int i = 0; i < getFirewallStatsCount(); i++) {
        if (!getFirewallStats(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < firewallStats_.size(); i++) {
        output.writeMessage(1, firewallStats_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < firewallStats_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, firewallStats_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall) obj;

      if (!getFirewallStatsList()
          .equals(other.getFirewallStatsList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getFirewallStatsCount() > 0) {
        hash = (37 * hash) + FIREWALL_STATS_FIELD_NUMBER;
        hash = (53 * hash) + getFirewallStatsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall prototype) {
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
     * <pre>
     * Top-level message
     * </pre>
     *
     * Protobuf type {@code Firewall}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Firewall)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_Firewall_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_Firewall_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (firewallStatsBuilder_ == null) {
          firewallStats_ = java.util.Collections.emptyList();
        } else {
          firewallStats_ = null;
          firewallStatsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_Firewall_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall(this);
        int from_bitField0_ = bitField0_;
        if (firewallStatsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            firewallStats_ = java.util.Collections.unmodifiableList(firewallStats_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.firewallStats_ = firewallStats_;
        } else {
          result.firewallStats_ = firewallStatsBuilder_.build();
        }
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall.getDefaultInstance()) return this;
        if (firewallStatsBuilder_ == null) {
          if (!other.firewallStats_.isEmpty()) {
            if (firewallStats_.isEmpty()) {
              firewallStats_ = other.firewallStats_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureFirewallStatsIsMutable();
              firewallStats_.addAll(other.firewallStats_);
            }
            onChanged();
          }
        } else {
          if (!other.firewallStats_.isEmpty()) {
            if (firewallStatsBuilder_.isEmpty()) {
              firewallStatsBuilder_.dispose();
              firewallStatsBuilder_ = null;
              firewallStats_ = other.firewallStats_;
              bitField0_ = (bitField0_ & ~0x00000001);
              firewallStatsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getFirewallStatsFieldBuilder() : null;
            } else {
              firewallStatsBuilder_.addAllMessages(other.firewallStats_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        for (int i = 0; i < getFirewallStatsCount(); i++) {
          if (!getFirewallStats(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats m =
                    input.readMessage(
                        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.PARSER,
                        extensionRegistry);
                if (firewallStatsBuilder_ == null) {
                  ensureFirewallStatsIsMutable();
                  firewallStats_.add(m);
                } else {
                  firewallStatsBuilder_.addMessage(m);
                }
                break;
              } // case 10
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats> firewallStats_ =
        java.util.Collections.emptyList();
      private void ensureFirewallStatsIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          firewallStats_ = new java.util.ArrayList<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats>(firewallStats_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStatsOrBuilder> firewallStatsBuilder_;

      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats> getFirewallStatsList() {
        if (firewallStatsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(firewallStats_);
        } else {
          return firewallStatsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public int getFirewallStatsCount() {
        if (firewallStatsBuilder_ == null) {
          return firewallStats_.size();
        } else {
          return firewallStatsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats getFirewallStats(int index) {
        if (firewallStatsBuilder_ == null) {
          return firewallStats_.get(index);
        } else {
          return firewallStatsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public Builder setFirewallStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats value) {
        if (firewallStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFirewallStatsIsMutable();
          firewallStats_.set(index, value);
          onChanged();
        } else {
          firewallStatsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public Builder setFirewallStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.Builder builderForValue) {
        if (firewallStatsBuilder_ == null) {
          ensureFirewallStatsIsMutable();
          firewallStats_.set(index, builderForValue.build());
          onChanged();
        } else {
          firewallStatsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public Builder addFirewallStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats value) {
        if (firewallStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFirewallStatsIsMutable();
          firewallStats_.add(value);
          onChanged();
        } else {
          firewallStatsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public Builder addFirewallStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats value) {
        if (firewallStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureFirewallStatsIsMutable();
          firewallStats_.add(index, value);
          onChanged();
        } else {
          firewallStatsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public Builder addFirewallStats(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.Builder builderForValue) {
        if (firewallStatsBuilder_ == null) {
          ensureFirewallStatsIsMutable();
          firewallStats_.add(builderForValue.build());
          onChanged();
        } else {
          firewallStatsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public Builder addFirewallStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.Builder builderForValue) {
        if (firewallStatsBuilder_ == null) {
          ensureFirewallStatsIsMutable();
          firewallStats_.add(index, builderForValue.build());
          onChanged();
        } else {
          firewallStatsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public Builder addAllFirewallStats(
          java.lang.Iterable<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats> values) {
        if (firewallStatsBuilder_ == null) {
          ensureFirewallStatsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, firewallStats_);
          onChanged();
        } else {
          firewallStatsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public Builder clearFirewallStats() {
        if (firewallStatsBuilder_ == null) {
          firewallStats_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          firewallStatsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public Builder removeFirewallStats(int index) {
        if (firewallStatsBuilder_ == null) {
          ensureFirewallStatsIsMutable();
          firewallStats_.remove(index);
          onChanged();
        } else {
          firewallStatsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.Builder getFirewallStatsBuilder(
          int index) {
        return getFirewallStatsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStatsOrBuilder getFirewallStatsOrBuilder(
          int index) {
        if (firewallStatsBuilder_ == null) {
          return firewallStats_.get(index);  } else {
          return firewallStatsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStatsOrBuilder> 
           getFirewallStatsOrBuilderList() {
        if (firewallStatsBuilder_ != null) {
          return firewallStatsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(firewallStats_);
        }
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.Builder addFirewallStatsBuilder() {
        return getFirewallStatsFieldBuilder().addBuilder(
            org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.getDefaultInstance());
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.Builder addFirewallStatsBuilder(
          int index) {
        return getFirewallStatsFieldBuilder().addBuilder(
            index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.getDefaultInstance());
      }
      /**
       * <code>repeated .FirewallStats firewall_stats = 1;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.Builder> 
           getFirewallStatsBuilderList() {
        return getFirewallStatsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStatsOrBuilder> 
          getFirewallStatsFieldBuilder() {
        if (firewallStatsBuilder_ == null) {
          firewallStatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStatsOrBuilder>(
                  firewallStats_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          firewallStats_ = null;
        }
        return firewallStatsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Firewall)
    }

    // @@protoc_insertion_point(class_scope:Firewall)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Firewall>
        PARSER = new com.google.protobuf.AbstractParser<Firewall>() {
      @java.lang.Override
      public Firewall parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<Firewall> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Firewall> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface FirewallStatsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FirewallStats)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string filter_name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the filterName field is set.
     */
    boolean hasFilterName();
    /**
     * <code>required string filter_name = 1 [(.telemetry_options) = { ... }</code>
     * @return The filterName.
     */
    java.lang.String getFilterName();
    /**
     * <code>required string filter_name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for filterName.
     */
    com.google.protobuf.ByteString
        getFilterNameBytes();

    /**
     * <pre>
     * The Unix timestamp (seconds since 00:00:00 UTC 1970-01-01) of
     * last filter state change event such as filter add, filter change,
     * or counter clear.
     * </pre>
     *
     * <code>optional uint64 timestamp = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the timestamp field is set.
     */
    boolean hasTimestamp();
    /**
     * <pre>
     * The Unix timestamp (seconds since 00:00:00 UTC 1970-01-01) of
     * last filter state change event such as filter add, filter change,
     * or counter clear.
     * </pre>
     *
     * <code>optional uint64 timestamp = 2 [(.telemetry_options) = { ... }</code>
     * @return The timestamp.
     */
    long getTimestamp();

    /**
     * <code>repeated .MemoryUsage memory_usage = 3;</code>
     */
    java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage> 
        getMemoryUsageList();
    /**
     * <code>repeated .MemoryUsage memory_usage = 3;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage getMemoryUsage(int index);
    /**
     * <code>repeated .MemoryUsage memory_usage = 3;</code>
     */
    int getMemoryUsageCount();
    /**
     * <code>repeated .MemoryUsage memory_usage = 3;</code>
     */
    java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsageOrBuilder> 
        getMemoryUsageOrBuilderList();
    /**
     * <code>repeated .MemoryUsage memory_usage = 3;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsageOrBuilder getMemoryUsageOrBuilder(
        int index);

    /**
     * <code>repeated .CounterStats counter_stats = 4;</code>
     */
    java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats> 
        getCounterStatsList();
    /**
     * <code>repeated .CounterStats counter_stats = 4;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats getCounterStats(int index);
    /**
     * <code>repeated .CounterStats counter_stats = 4;</code>
     */
    int getCounterStatsCount();
    /**
     * <code>repeated .CounterStats counter_stats = 4;</code>
     */
    java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStatsOrBuilder> 
        getCounterStatsOrBuilderList();
    /**
     * <code>repeated .CounterStats counter_stats = 4;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStatsOrBuilder getCounterStatsOrBuilder(
        int index);

    /**
     * <code>repeated .PolicerStats policer_stats = 5;</code>
     */
    java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats> 
        getPolicerStatsList();
    /**
     * <code>repeated .PolicerStats policer_stats = 5;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats getPolicerStats(int index);
    /**
     * <code>repeated .PolicerStats policer_stats = 5;</code>
     */
    int getPolicerStatsCount();
    /**
     * <code>repeated .PolicerStats policer_stats = 5;</code>
     */
    java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStatsOrBuilder> 
        getPolicerStatsOrBuilderList();
    /**
     * <code>repeated .PolicerStats policer_stats = 5;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStatsOrBuilder getPolicerStatsOrBuilder(
        int index);

    /**
     * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
     */
    java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats> 
        getHierarchicalPolicerStatsList();
    /**
     * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats getHierarchicalPolicerStats(int index);
    /**
     * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
     */
    int getHierarchicalPolicerStatsCount();
    /**
     * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
     */
    java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStatsOrBuilder> 
        getHierarchicalPolicerStatsOrBuilderList();
    /**
     * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStatsOrBuilder getHierarchicalPolicerStatsOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Firewall filter statistics
   * </pre>
   *
   * Protobuf type {@code FirewallStats}
   */
  public static final class FirewallStats extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FirewallStats)
      FirewallStatsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FirewallStats.newBuilder() to construct.
    private FirewallStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FirewallStats() {
      filterName_ = "";
      memoryUsage_ = java.util.Collections.emptyList();
      counterStats_ = java.util.Collections.emptyList();
      policerStats_ = java.util.Collections.emptyList();
      hierarchicalPolicerStats_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FirewallStats();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_FirewallStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_FirewallStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.Builder.class);
    }

    private int bitField0_;
    public static final int FILTER_NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object filterName_;
    /**
     * <code>required string filter_name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the filterName field is set.
     */
    @java.lang.Override
    public boolean hasFilterName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string filter_name = 1 [(.telemetry_options) = { ... }</code>
     * @return The filterName.
     */
    @java.lang.Override
    public java.lang.String getFilterName() {
      java.lang.Object ref = filterName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          filterName_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string filter_name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for filterName.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFilterNameBytes() {
      java.lang.Object ref = filterName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filterName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 2;
    private long timestamp_;
    /**
     * <pre>
     * The Unix timestamp (seconds since 00:00:00 UTC 1970-01-01) of
     * last filter state change event such as filter add, filter change,
     * or counter clear.
     * </pre>
     *
     * <code>optional uint64 timestamp = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the timestamp field is set.
     */
    @java.lang.Override
    public boolean hasTimestamp() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The Unix timestamp (seconds since 00:00:00 UTC 1970-01-01) of
     * last filter state change event such as filter add, filter change,
     * or counter clear.
     * </pre>
     *
     * <code>optional uint64 timestamp = 2 [(.telemetry_options) = { ... }</code>
     * @return The timestamp.
     */
    @java.lang.Override
    public long getTimestamp() {
      return timestamp_;
    }

    public static final int MEMORY_USAGE_FIELD_NUMBER = 3;
    private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage> memoryUsage_;
    /**
     * <code>repeated .MemoryUsage memory_usage = 3;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage> getMemoryUsageList() {
      return memoryUsage_;
    }
    /**
     * <code>repeated .MemoryUsage memory_usage = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsageOrBuilder> 
        getMemoryUsageOrBuilderList() {
      return memoryUsage_;
    }
    /**
     * <code>repeated .MemoryUsage memory_usage = 3;</code>
     */
    @java.lang.Override
    public int getMemoryUsageCount() {
      return memoryUsage_.size();
    }
    /**
     * <code>repeated .MemoryUsage memory_usage = 3;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage getMemoryUsage(int index) {
      return memoryUsage_.get(index);
    }
    /**
     * <code>repeated .MemoryUsage memory_usage = 3;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsageOrBuilder getMemoryUsageOrBuilder(
        int index) {
      return memoryUsage_.get(index);
    }

    public static final int COUNTER_STATS_FIELD_NUMBER = 4;
    private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats> counterStats_;
    /**
     * <code>repeated .CounterStats counter_stats = 4;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats> getCounterStatsList() {
      return counterStats_;
    }
    /**
     * <code>repeated .CounterStats counter_stats = 4;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStatsOrBuilder> 
        getCounterStatsOrBuilderList() {
      return counterStats_;
    }
    /**
     * <code>repeated .CounterStats counter_stats = 4;</code>
     */
    @java.lang.Override
    public int getCounterStatsCount() {
      return counterStats_.size();
    }
    /**
     * <code>repeated .CounterStats counter_stats = 4;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats getCounterStats(int index) {
      return counterStats_.get(index);
    }
    /**
     * <code>repeated .CounterStats counter_stats = 4;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStatsOrBuilder getCounterStatsOrBuilder(
        int index) {
      return counterStats_.get(index);
    }

    public static final int POLICER_STATS_FIELD_NUMBER = 5;
    private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats> policerStats_;
    /**
     * <code>repeated .PolicerStats policer_stats = 5;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats> getPolicerStatsList() {
      return policerStats_;
    }
    /**
     * <code>repeated .PolicerStats policer_stats = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStatsOrBuilder> 
        getPolicerStatsOrBuilderList() {
      return policerStats_;
    }
    /**
     * <code>repeated .PolicerStats policer_stats = 5;</code>
     */
    @java.lang.Override
    public int getPolicerStatsCount() {
      return policerStats_.size();
    }
    /**
     * <code>repeated .PolicerStats policer_stats = 5;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats getPolicerStats(int index) {
      return policerStats_.get(index);
    }
    /**
     * <code>repeated .PolicerStats policer_stats = 5;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStatsOrBuilder getPolicerStatsOrBuilder(
        int index) {
      return policerStats_.get(index);
    }

    public static final int HIERARCHICAL_POLICER_STATS_FIELD_NUMBER = 6;
    private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats> hierarchicalPolicerStats_;
    /**
     * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
     */
    @java.lang.Override
    public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats> getHierarchicalPolicerStatsList() {
      return hierarchicalPolicerStats_;
    }
    /**
     * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStatsOrBuilder> 
        getHierarchicalPolicerStatsOrBuilderList() {
      return hierarchicalPolicerStats_;
    }
    /**
     * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
     */
    @java.lang.Override
    public int getHierarchicalPolicerStatsCount() {
      return hierarchicalPolicerStats_.size();
    }
    /**
     * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats getHierarchicalPolicerStats(int index) {
      return hierarchicalPolicerStats_.get(index);
    }
    /**
     * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStatsOrBuilder getHierarchicalPolicerStatsOrBuilder(
        int index) {
      return hierarchicalPolicerStats_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasFilterName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      for (int i = 0; i < getMemoryUsageCount(); i++) {
        if (!getMemoryUsage(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getCounterStatsCount(); i++) {
        if (!getCounterStats(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getPolicerStatsCount(); i++) {
        if (!getPolicerStats(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      for (int i = 0; i < getHierarchicalPolicerStatsCount(); i++) {
        if (!getHierarchicalPolicerStats(i).isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, filterName_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, timestamp_);
      }
      for (int i = 0; i < memoryUsage_.size(); i++) {
        output.writeMessage(3, memoryUsage_.get(i));
      }
      for (int i = 0; i < counterStats_.size(); i++) {
        output.writeMessage(4, counterStats_.get(i));
      }
      for (int i = 0; i < policerStats_.size(); i++) {
        output.writeMessage(5, policerStats_.get(i));
      }
      for (int i = 0; i < hierarchicalPolicerStats_.size(); i++) {
        output.writeMessage(6, hierarchicalPolicerStats_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, filterName_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, timestamp_);
      }
      for (int i = 0; i < memoryUsage_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, memoryUsage_.get(i));
      }
      for (int i = 0; i < counterStats_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, counterStats_.get(i));
      }
      for (int i = 0; i < policerStats_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, policerStats_.get(i));
      }
      for (int i = 0; i < hierarchicalPolicerStats_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, hierarchicalPolicerStats_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats) obj;

      if (hasFilterName() != other.hasFilterName()) return false;
      if (hasFilterName()) {
        if (!getFilterName()
            .equals(other.getFilterName())) return false;
      }
      if (hasTimestamp() != other.hasTimestamp()) return false;
      if (hasTimestamp()) {
        if (getTimestamp()
            != other.getTimestamp()) return false;
      }
      if (!getMemoryUsageList()
          .equals(other.getMemoryUsageList())) return false;
      if (!getCounterStatsList()
          .equals(other.getCounterStatsList())) return false;
      if (!getPolicerStatsList()
          .equals(other.getPolicerStatsList())) return false;
      if (!getHierarchicalPolicerStatsList()
          .equals(other.getHierarchicalPolicerStatsList())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasFilterName()) {
        hash = (37 * hash) + FILTER_NAME_FIELD_NUMBER;
        hash = (53 * hash) + getFilterName().hashCode();
      }
      if (hasTimestamp()) {
        hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getTimestamp());
      }
      if (getMemoryUsageCount() > 0) {
        hash = (37 * hash) + MEMORY_USAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMemoryUsageList().hashCode();
      }
      if (getCounterStatsCount() > 0) {
        hash = (37 * hash) + COUNTER_STATS_FIELD_NUMBER;
        hash = (53 * hash) + getCounterStatsList().hashCode();
      }
      if (getPolicerStatsCount() > 0) {
        hash = (37 * hash) + POLICER_STATS_FIELD_NUMBER;
        hash = (53 * hash) + getPolicerStatsList().hashCode();
      }
      if (getHierarchicalPolicerStatsCount() > 0) {
        hash = (37 * hash) + HIERARCHICAL_POLICER_STATS_FIELD_NUMBER;
        hash = (53 * hash) + getHierarchicalPolicerStatsList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats prototype) {
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
     * <pre>
     * Firewall filter statistics
     * </pre>
     *
     * Protobuf type {@code FirewallStats}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FirewallStats)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStatsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_FirewallStats_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_FirewallStats_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        filterName_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        timestamp_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (memoryUsageBuilder_ == null) {
          memoryUsage_ = java.util.Collections.emptyList();
        } else {
          memoryUsage_ = null;
          memoryUsageBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000004);
        if (counterStatsBuilder_ == null) {
          counterStats_ = java.util.Collections.emptyList();
        } else {
          counterStats_ = null;
          counterStatsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        if (policerStatsBuilder_ == null) {
          policerStats_ = java.util.Collections.emptyList();
        } else {
          policerStats_ = null;
          policerStatsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000010);
        if (hierarchicalPolicerStatsBuilder_ == null) {
          hierarchicalPolicerStats_ = java.util.Collections.emptyList();
        } else {
          hierarchicalPolicerStats_ = null;
          hierarchicalPolicerStatsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000020);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_FirewallStats_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.filterName_ = filterName_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.timestamp_ = timestamp_;
          to_bitField0_ |= 0x00000002;
        }
        if (memoryUsageBuilder_ == null) {
          if (((bitField0_ & 0x00000004) != 0)) {
            memoryUsage_ = java.util.Collections.unmodifiableList(memoryUsage_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.memoryUsage_ = memoryUsage_;
        } else {
          result.memoryUsage_ = memoryUsageBuilder_.build();
        }
        if (counterStatsBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0)) {
            counterStats_ = java.util.Collections.unmodifiableList(counterStats_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.counterStats_ = counterStats_;
        } else {
          result.counterStats_ = counterStatsBuilder_.build();
        }
        if (policerStatsBuilder_ == null) {
          if (((bitField0_ & 0x00000010) != 0)) {
            policerStats_ = java.util.Collections.unmodifiableList(policerStats_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.policerStats_ = policerStats_;
        } else {
          result.policerStats_ = policerStatsBuilder_.build();
        }
        if (hierarchicalPolicerStatsBuilder_ == null) {
          if (((bitField0_ & 0x00000020) != 0)) {
            hierarchicalPolicerStats_ = java.util.Collections.unmodifiableList(hierarchicalPolicerStats_);
            bitField0_ = (bitField0_ & ~0x00000020);
          }
          result.hierarchicalPolicerStats_ = hierarchicalPolicerStats_;
        } else {
          result.hierarchicalPolicerStats_ = hierarchicalPolicerStatsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats.getDefaultInstance()) return this;
        if (other.hasFilterName()) {
          bitField0_ |= 0x00000001;
          filterName_ = other.filterName_;
          onChanged();
        }
        if (other.hasTimestamp()) {
          setTimestamp(other.getTimestamp());
        }
        if (memoryUsageBuilder_ == null) {
          if (!other.memoryUsage_.isEmpty()) {
            if (memoryUsage_.isEmpty()) {
              memoryUsage_ = other.memoryUsage_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureMemoryUsageIsMutable();
              memoryUsage_.addAll(other.memoryUsage_);
            }
            onChanged();
          }
        } else {
          if (!other.memoryUsage_.isEmpty()) {
            if (memoryUsageBuilder_.isEmpty()) {
              memoryUsageBuilder_.dispose();
              memoryUsageBuilder_ = null;
              memoryUsage_ = other.memoryUsage_;
              bitField0_ = (bitField0_ & ~0x00000004);
              memoryUsageBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getMemoryUsageFieldBuilder() : null;
            } else {
              memoryUsageBuilder_.addAllMessages(other.memoryUsage_);
            }
          }
        }
        if (counterStatsBuilder_ == null) {
          if (!other.counterStats_.isEmpty()) {
            if (counterStats_.isEmpty()) {
              counterStats_ = other.counterStats_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureCounterStatsIsMutable();
              counterStats_.addAll(other.counterStats_);
            }
            onChanged();
          }
        } else {
          if (!other.counterStats_.isEmpty()) {
            if (counterStatsBuilder_.isEmpty()) {
              counterStatsBuilder_.dispose();
              counterStatsBuilder_ = null;
              counterStats_ = other.counterStats_;
              bitField0_ = (bitField0_ & ~0x00000008);
              counterStatsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCounterStatsFieldBuilder() : null;
            } else {
              counterStatsBuilder_.addAllMessages(other.counterStats_);
            }
          }
        }
        if (policerStatsBuilder_ == null) {
          if (!other.policerStats_.isEmpty()) {
            if (policerStats_.isEmpty()) {
              policerStats_ = other.policerStats_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensurePolicerStatsIsMutable();
              policerStats_.addAll(other.policerStats_);
            }
            onChanged();
          }
        } else {
          if (!other.policerStats_.isEmpty()) {
            if (policerStatsBuilder_.isEmpty()) {
              policerStatsBuilder_.dispose();
              policerStatsBuilder_ = null;
              policerStats_ = other.policerStats_;
              bitField0_ = (bitField0_ & ~0x00000010);
              policerStatsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPolicerStatsFieldBuilder() : null;
            } else {
              policerStatsBuilder_.addAllMessages(other.policerStats_);
            }
          }
        }
        if (hierarchicalPolicerStatsBuilder_ == null) {
          if (!other.hierarchicalPolicerStats_.isEmpty()) {
            if (hierarchicalPolicerStats_.isEmpty()) {
              hierarchicalPolicerStats_ = other.hierarchicalPolicerStats_;
              bitField0_ = (bitField0_ & ~0x00000020);
            } else {
              ensureHierarchicalPolicerStatsIsMutable();
              hierarchicalPolicerStats_.addAll(other.hierarchicalPolicerStats_);
            }
            onChanged();
          }
        } else {
          if (!other.hierarchicalPolicerStats_.isEmpty()) {
            if (hierarchicalPolicerStatsBuilder_.isEmpty()) {
              hierarchicalPolicerStatsBuilder_.dispose();
              hierarchicalPolicerStatsBuilder_ = null;
              hierarchicalPolicerStats_ = other.hierarchicalPolicerStats_;
              bitField0_ = (bitField0_ & ~0x00000020);
              hierarchicalPolicerStatsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getHierarchicalPolicerStatsFieldBuilder() : null;
            } else {
              hierarchicalPolicerStatsBuilder_.addAllMessages(other.hierarchicalPolicerStats_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasFilterName()) {
          return false;
        }
        for (int i = 0; i < getMemoryUsageCount(); i++) {
          if (!getMemoryUsage(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getCounterStatsCount(); i++) {
          if (!getCounterStats(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getPolicerStatsCount(); i++) {
          if (!getPolicerStats(i).isInitialized()) {
            return false;
          }
        }
        for (int i = 0; i < getHierarchicalPolicerStatsCount(); i++) {
          if (!getHierarchicalPolicerStats(i).isInitialized()) {
            return false;
          }
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                filterName_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                timestamp_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage m =
                    input.readMessage(
                        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.PARSER,
                        extensionRegistry);
                if (memoryUsageBuilder_ == null) {
                  ensureMemoryUsageIsMutable();
                  memoryUsage_.add(m);
                } else {
                  memoryUsageBuilder_.addMessage(m);
                }
                break;
              } // case 26
              case 34: {
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats m =
                    input.readMessage(
                        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.PARSER,
                        extensionRegistry);
                if (counterStatsBuilder_ == null) {
                  ensureCounterStatsIsMutable();
                  counterStats_.add(m);
                } else {
                  counterStatsBuilder_.addMessage(m);
                }
                break;
              } // case 34
              case 42: {
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats m =
                    input.readMessage(
                        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.PARSER,
                        extensionRegistry);
                if (policerStatsBuilder_ == null) {
                  ensurePolicerStatsIsMutable();
                  policerStats_.add(m);
                } else {
                  policerStatsBuilder_.addMessage(m);
                }
                break;
              } // case 42
              case 50: {
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats m =
                    input.readMessage(
                        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.PARSER,
                        extensionRegistry);
                if (hierarchicalPolicerStatsBuilder_ == null) {
                  ensureHierarchicalPolicerStatsIsMutable();
                  hierarchicalPolicerStats_.add(m);
                } else {
                  hierarchicalPolicerStatsBuilder_.addMessage(m);
                }
                break;
              } // case 50
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object filterName_ = "";
      /**
       * <code>required string filter_name = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the filterName field is set.
       */
      public boolean hasFilterName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string filter_name = 1 [(.telemetry_options) = { ... }</code>
       * @return The filterName.
       */
      public java.lang.String getFilterName() {
        java.lang.Object ref = filterName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            filterName_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string filter_name = 1 [(.telemetry_options) = { ... }</code>
       * @return The bytes for filterName.
       */
      public com.google.protobuf.ByteString
          getFilterNameBytes() {
        java.lang.Object ref = filterName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          filterName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string filter_name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The filterName to set.
       * @return This builder for chaining.
       */
      public Builder setFilterName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        filterName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string filter_name = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearFilterName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        filterName_ = getDefaultInstance().getFilterName();
        onChanged();
        return this;
      }
      /**
       * <code>required string filter_name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The bytes for filterName to set.
       * @return This builder for chaining.
       */
      public Builder setFilterNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        filterName_ = value;
        onChanged();
        return this;
      }

      private long timestamp_ ;
      /**
       * <pre>
       * The Unix timestamp (seconds since 00:00:00 UTC 1970-01-01) of
       * last filter state change event such as filter add, filter change,
       * or counter clear.
       * </pre>
       *
       * <code>optional uint64 timestamp = 2 [(.telemetry_options) = { ... }</code>
       * @return Whether the timestamp field is set.
       */
      @java.lang.Override
      public boolean hasTimestamp() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * The Unix timestamp (seconds since 00:00:00 UTC 1970-01-01) of
       * last filter state change event such as filter add, filter change,
       * or counter clear.
       * </pre>
       *
       * <code>optional uint64 timestamp = 2 [(.telemetry_options) = { ... }</code>
       * @return The timestamp.
       */
      @java.lang.Override
      public long getTimestamp() {
        return timestamp_;
      }
      /**
       * <pre>
       * The Unix timestamp (seconds since 00:00:00 UTC 1970-01-01) of
       * last filter state change event such as filter add, filter change,
       * or counter clear.
       * </pre>
       *
       * <code>optional uint64 timestamp = 2 [(.telemetry_options) = { ... }</code>
       * @param value The timestamp to set.
       * @return This builder for chaining.
       */
      public Builder setTimestamp(long value) {
        bitField0_ |= 0x00000002;
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The Unix timestamp (seconds since 00:00:00 UTC 1970-01-01) of
       * last filter state change event such as filter add, filter change,
       * or counter clear.
       * </pre>
       *
       * <code>optional uint64 timestamp = 2 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearTimestamp() {
        bitField0_ = (bitField0_ & ~0x00000002);
        timestamp_ = 0L;
        onChanged();
        return this;
      }

      private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage> memoryUsage_ =
        java.util.Collections.emptyList();
      private void ensureMemoryUsageIsMutable() {
        if (!((bitField0_ & 0x00000004) != 0)) {
          memoryUsage_ = new java.util.ArrayList<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage>(memoryUsage_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsageOrBuilder> memoryUsageBuilder_;

      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage> getMemoryUsageList() {
        if (memoryUsageBuilder_ == null) {
          return java.util.Collections.unmodifiableList(memoryUsage_);
        } else {
          return memoryUsageBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public int getMemoryUsageCount() {
        if (memoryUsageBuilder_ == null) {
          return memoryUsage_.size();
        } else {
          return memoryUsageBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage getMemoryUsage(int index) {
        if (memoryUsageBuilder_ == null) {
          return memoryUsage_.get(index);
        } else {
          return memoryUsageBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public Builder setMemoryUsage(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage value) {
        if (memoryUsageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMemoryUsageIsMutable();
          memoryUsage_.set(index, value);
          onChanged();
        } else {
          memoryUsageBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public Builder setMemoryUsage(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.Builder builderForValue) {
        if (memoryUsageBuilder_ == null) {
          ensureMemoryUsageIsMutable();
          memoryUsage_.set(index, builderForValue.build());
          onChanged();
        } else {
          memoryUsageBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public Builder addMemoryUsage(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage value) {
        if (memoryUsageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMemoryUsageIsMutable();
          memoryUsage_.add(value);
          onChanged();
        } else {
          memoryUsageBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public Builder addMemoryUsage(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage value) {
        if (memoryUsageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureMemoryUsageIsMutable();
          memoryUsage_.add(index, value);
          onChanged();
        } else {
          memoryUsageBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public Builder addMemoryUsage(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.Builder builderForValue) {
        if (memoryUsageBuilder_ == null) {
          ensureMemoryUsageIsMutable();
          memoryUsage_.add(builderForValue.build());
          onChanged();
        } else {
          memoryUsageBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public Builder addMemoryUsage(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.Builder builderForValue) {
        if (memoryUsageBuilder_ == null) {
          ensureMemoryUsageIsMutable();
          memoryUsage_.add(index, builderForValue.build());
          onChanged();
        } else {
          memoryUsageBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public Builder addAllMemoryUsage(
          java.lang.Iterable<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage> values) {
        if (memoryUsageBuilder_ == null) {
          ensureMemoryUsageIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, memoryUsage_);
          onChanged();
        } else {
          memoryUsageBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public Builder clearMemoryUsage() {
        if (memoryUsageBuilder_ == null) {
          memoryUsage_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          memoryUsageBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public Builder removeMemoryUsage(int index) {
        if (memoryUsageBuilder_ == null) {
          ensureMemoryUsageIsMutable();
          memoryUsage_.remove(index);
          onChanged();
        } else {
          memoryUsageBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.Builder getMemoryUsageBuilder(
          int index) {
        return getMemoryUsageFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsageOrBuilder getMemoryUsageOrBuilder(
          int index) {
        if (memoryUsageBuilder_ == null) {
          return memoryUsage_.get(index);  } else {
          return memoryUsageBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsageOrBuilder> 
           getMemoryUsageOrBuilderList() {
        if (memoryUsageBuilder_ != null) {
          return memoryUsageBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(memoryUsage_);
        }
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.Builder addMemoryUsageBuilder() {
        return getMemoryUsageFieldBuilder().addBuilder(
            org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.getDefaultInstance());
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.Builder addMemoryUsageBuilder(
          int index) {
        return getMemoryUsageFieldBuilder().addBuilder(
            index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.getDefaultInstance());
      }
      /**
       * <code>repeated .MemoryUsage memory_usage = 3;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.Builder> 
           getMemoryUsageBuilderList() {
        return getMemoryUsageFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsageOrBuilder> 
          getMemoryUsageFieldBuilder() {
        if (memoryUsageBuilder_ == null) {
          memoryUsageBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsageOrBuilder>(
                  memoryUsage_,
                  ((bitField0_ & 0x00000004) != 0),
                  getParentForChildren(),
                  isClean());
          memoryUsage_ = null;
        }
        return memoryUsageBuilder_;
      }

      private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats> counterStats_ =
        java.util.Collections.emptyList();
      private void ensureCounterStatsIsMutable() {
        if (!((bitField0_ & 0x00000008) != 0)) {
          counterStats_ = new java.util.ArrayList<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats>(counterStats_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStatsOrBuilder> counterStatsBuilder_;

      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats> getCounterStatsList() {
        if (counterStatsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(counterStats_);
        } else {
          return counterStatsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public int getCounterStatsCount() {
        if (counterStatsBuilder_ == null) {
          return counterStats_.size();
        } else {
          return counterStatsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats getCounterStats(int index) {
        if (counterStatsBuilder_ == null) {
          return counterStats_.get(index);
        } else {
          return counterStatsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public Builder setCounterStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats value) {
        if (counterStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCounterStatsIsMutable();
          counterStats_.set(index, value);
          onChanged();
        } else {
          counterStatsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public Builder setCounterStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.Builder builderForValue) {
        if (counterStatsBuilder_ == null) {
          ensureCounterStatsIsMutable();
          counterStats_.set(index, builderForValue.build());
          onChanged();
        } else {
          counterStatsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public Builder addCounterStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats value) {
        if (counterStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCounterStatsIsMutable();
          counterStats_.add(value);
          onChanged();
        } else {
          counterStatsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public Builder addCounterStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats value) {
        if (counterStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCounterStatsIsMutable();
          counterStats_.add(index, value);
          onChanged();
        } else {
          counterStatsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public Builder addCounterStats(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.Builder builderForValue) {
        if (counterStatsBuilder_ == null) {
          ensureCounterStatsIsMutable();
          counterStats_.add(builderForValue.build());
          onChanged();
        } else {
          counterStatsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public Builder addCounterStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.Builder builderForValue) {
        if (counterStatsBuilder_ == null) {
          ensureCounterStatsIsMutable();
          counterStats_.add(index, builderForValue.build());
          onChanged();
        } else {
          counterStatsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public Builder addAllCounterStats(
          java.lang.Iterable<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats> values) {
        if (counterStatsBuilder_ == null) {
          ensureCounterStatsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, counterStats_);
          onChanged();
        } else {
          counterStatsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public Builder clearCounterStats() {
        if (counterStatsBuilder_ == null) {
          counterStats_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          counterStatsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public Builder removeCounterStats(int index) {
        if (counterStatsBuilder_ == null) {
          ensureCounterStatsIsMutable();
          counterStats_.remove(index);
          onChanged();
        } else {
          counterStatsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.Builder getCounterStatsBuilder(
          int index) {
        return getCounterStatsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStatsOrBuilder getCounterStatsOrBuilder(
          int index) {
        if (counterStatsBuilder_ == null) {
          return counterStats_.get(index);  } else {
          return counterStatsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStatsOrBuilder> 
           getCounterStatsOrBuilderList() {
        if (counterStatsBuilder_ != null) {
          return counterStatsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(counterStats_);
        }
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.Builder addCounterStatsBuilder() {
        return getCounterStatsFieldBuilder().addBuilder(
            org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.getDefaultInstance());
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.Builder addCounterStatsBuilder(
          int index) {
        return getCounterStatsFieldBuilder().addBuilder(
            index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.getDefaultInstance());
      }
      /**
       * <code>repeated .CounterStats counter_stats = 4;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.Builder> 
           getCounterStatsBuilderList() {
        return getCounterStatsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStatsOrBuilder> 
          getCounterStatsFieldBuilder() {
        if (counterStatsBuilder_ == null) {
          counterStatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStatsOrBuilder>(
                  counterStats_,
                  ((bitField0_ & 0x00000008) != 0),
                  getParentForChildren(),
                  isClean());
          counterStats_ = null;
        }
        return counterStatsBuilder_;
      }

      private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats> policerStats_ =
        java.util.Collections.emptyList();
      private void ensurePolicerStatsIsMutable() {
        if (!((bitField0_ & 0x00000010) != 0)) {
          policerStats_ = new java.util.ArrayList<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats>(policerStats_);
          bitField0_ |= 0x00000010;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStatsOrBuilder> policerStatsBuilder_;

      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats> getPolicerStatsList() {
        if (policerStatsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(policerStats_);
        } else {
          return policerStatsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public int getPolicerStatsCount() {
        if (policerStatsBuilder_ == null) {
          return policerStats_.size();
        } else {
          return policerStatsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats getPolicerStats(int index) {
        if (policerStatsBuilder_ == null) {
          return policerStats_.get(index);
        } else {
          return policerStatsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public Builder setPolicerStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats value) {
        if (policerStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePolicerStatsIsMutable();
          policerStats_.set(index, value);
          onChanged();
        } else {
          policerStatsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public Builder setPolicerStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.Builder builderForValue) {
        if (policerStatsBuilder_ == null) {
          ensurePolicerStatsIsMutable();
          policerStats_.set(index, builderForValue.build());
          onChanged();
        } else {
          policerStatsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public Builder addPolicerStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats value) {
        if (policerStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePolicerStatsIsMutable();
          policerStats_.add(value);
          onChanged();
        } else {
          policerStatsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public Builder addPolicerStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats value) {
        if (policerStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePolicerStatsIsMutable();
          policerStats_.add(index, value);
          onChanged();
        } else {
          policerStatsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public Builder addPolicerStats(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.Builder builderForValue) {
        if (policerStatsBuilder_ == null) {
          ensurePolicerStatsIsMutable();
          policerStats_.add(builderForValue.build());
          onChanged();
        } else {
          policerStatsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public Builder addPolicerStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.Builder builderForValue) {
        if (policerStatsBuilder_ == null) {
          ensurePolicerStatsIsMutable();
          policerStats_.add(index, builderForValue.build());
          onChanged();
        } else {
          policerStatsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public Builder addAllPolicerStats(
          java.lang.Iterable<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats> values) {
        if (policerStatsBuilder_ == null) {
          ensurePolicerStatsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, policerStats_);
          onChanged();
        } else {
          policerStatsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public Builder clearPolicerStats() {
        if (policerStatsBuilder_ == null) {
          policerStats_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          policerStatsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public Builder removePolicerStats(int index) {
        if (policerStatsBuilder_ == null) {
          ensurePolicerStatsIsMutable();
          policerStats_.remove(index);
          onChanged();
        } else {
          policerStatsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.Builder getPolicerStatsBuilder(
          int index) {
        return getPolicerStatsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStatsOrBuilder getPolicerStatsOrBuilder(
          int index) {
        if (policerStatsBuilder_ == null) {
          return policerStats_.get(index);  } else {
          return policerStatsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStatsOrBuilder> 
           getPolicerStatsOrBuilderList() {
        if (policerStatsBuilder_ != null) {
          return policerStatsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(policerStats_);
        }
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.Builder addPolicerStatsBuilder() {
        return getPolicerStatsFieldBuilder().addBuilder(
            org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.getDefaultInstance());
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.Builder addPolicerStatsBuilder(
          int index) {
        return getPolicerStatsFieldBuilder().addBuilder(
            index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.getDefaultInstance());
      }
      /**
       * <code>repeated .PolicerStats policer_stats = 5;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.Builder> 
           getPolicerStatsBuilderList() {
        return getPolicerStatsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStatsOrBuilder> 
          getPolicerStatsFieldBuilder() {
        if (policerStatsBuilder_ == null) {
          policerStatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStatsOrBuilder>(
                  policerStats_,
                  ((bitField0_ & 0x00000010) != 0),
                  getParentForChildren(),
                  isClean());
          policerStats_ = null;
        }
        return policerStatsBuilder_;
      }

      private java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats> hierarchicalPolicerStats_ =
        java.util.Collections.emptyList();
      private void ensureHierarchicalPolicerStatsIsMutable() {
        if (!((bitField0_ & 0x00000020) != 0)) {
          hierarchicalPolicerStats_ = new java.util.ArrayList<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats>(hierarchicalPolicerStats_);
          bitField0_ |= 0x00000020;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStatsOrBuilder> hierarchicalPolicerStatsBuilder_;

      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats> getHierarchicalPolicerStatsList() {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(hierarchicalPolicerStats_);
        } else {
          return hierarchicalPolicerStatsBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public int getHierarchicalPolicerStatsCount() {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          return hierarchicalPolicerStats_.size();
        } else {
          return hierarchicalPolicerStatsBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats getHierarchicalPolicerStats(int index) {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          return hierarchicalPolicerStats_.get(index);
        } else {
          return hierarchicalPolicerStatsBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public Builder setHierarchicalPolicerStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats value) {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHierarchicalPolicerStatsIsMutable();
          hierarchicalPolicerStats_.set(index, value);
          onChanged();
        } else {
          hierarchicalPolicerStatsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public Builder setHierarchicalPolicerStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.Builder builderForValue) {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          ensureHierarchicalPolicerStatsIsMutable();
          hierarchicalPolicerStats_.set(index, builderForValue.build());
          onChanged();
        } else {
          hierarchicalPolicerStatsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public Builder addHierarchicalPolicerStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats value) {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHierarchicalPolicerStatsIsMutable();
          hierarchicalPolicerStats_.add(value);
          onChanged();
        } else {
          hierarchicalPolicerStatsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public Builder addHierarchicalPolicerStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats value) {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHierarchicalPolicerStatsIsMutable();
          hierarchicalPolicerStats_.add(index, value);
          onChanged();
        } else {
          hierarchicalPolicerStatsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public Builder addHierarchicalPolicerStats(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.Builder builderForValue) {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          ensureHierarchicalPolicerStatsIsMutable();
          hierarchicalPolicerStats_.add(builderForValue.build());
          onChanged();
        } else {
          hierarchicalPolicerStatsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public Builder addHierarchicalPolicerStats(
          int index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.Builder builderForValue) {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          ensureHierarchicalPolicerStatsIsMutable();
          hierarchicalPolicerStats_.add(index, builderForValue.build());
          onChanged();
        } else {
          hierarchicalPolicerStatsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public Builder addAllHierarchicalPolicerStats(
          java.lang.Iterable<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats> values) {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          ensureHierarchicalPolicerStatsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, hierarchicalPolicerStats_);
          onChanged();
        } else {
          hierarchicalPolicerStatsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public Builder clearHierarchicalPolicerStats() {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          hierarchicalPolicerStats_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000020);
          onChanged();
        } else {
          hierarchicalPolicerStatsBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public Builder removeHierarchicalPolicerStats(int index) {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          ensureHierarchicalPolicerStatsIsMutable();
          hierarchicalPolicerStats_.remove(index);
          onChanged();
        } else {
          hierarchicalPolicerStatsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.Builder getHierarchicalPolicerStatsBuilder(
          int index) {
        return getHierarchicalPolicerStatsFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStatsOrBuilder getHierarchicalPolicerStatsOrBuilder(
          int index) {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          return hierarchicalPolicerStats_.get(index);  } else {
          return hierarchicalPolicerStatsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public java.util.List<? extends org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStatsOrBuilder> 
           getHierarchicalPolicerStatsOrBuilderList() {
        if (hierarchicalPolicerStatsBuilder_ != null) {
          return hierarchicalPolicerStatsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(hierarchicalPolicerStats_);
        }
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.Builder addHierarchicalPolicerStatsBuilder() {
        return getHierarchicalPolicerStatsFieldBuilder().addBuilder(
            org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.getDefaultInstance());
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.Builder addHierarchicalPolicerStatsBuilder(
          int index) {
        return getHierarchicalPolicerStatsFieldBuilder().addBuilder(
            index, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.getDefaultInstance());
      }
      /**
       * <code>repeated .HierarchicalPolicerStats hierarchical_policer_stats = 6;</code>
       */
      public java.util.List<org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.Builder> 
           getHierarchicalPolicerStatsBuilderList() {
        return getHierarchicalPolicerStatsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStatsOrBuilder> 
          getHierarchicalPolicerStatsFieldBuilder() {
        if (hierarchicalPolicerStatsBuilder_ == null) {
          hierarchicalPolicerStatsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStatsOrBuilder>(
                  hierarchicalPolicerStats_,
                  ((bitField0_ & 0x00000020) != 0),
                  getParentForChildren(),
                  isClean());
          hierarchicalPolicerStats_ = null;
        }
        return hierarchicalPolicerStatsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:FirewallStats)
    }

    // @@protoc_insertion_point(class_scope:FirewallStats)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<FirewallStats>
        PARSER = new com.google.protobuf.AbstractParser<FirewallStats>() {
      @java.lang.Override
      public FirewallStats parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<FirewallStats> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FirewallStats> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.FirewallStats getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface MemoryUsageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MemoryUsage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The router has typically several types of memories (e.g. CPU's memory,
     * ASIC's forwarding memories) in which the firewall object is written.
     * This field indicates the name of the memory subsystem whose utilization
     * is being reported.
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <pre>
     * The router has typically several types of memories (e.g. CPU's memory,
     * ASIC's forwarding memories) in which the firewall object is written.
     * This field indicates the name of the memory subsystem whose utilization
     * is being reported.
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <pre>
     * The router has typically several types of memories (e.g. CPU's memory,
     * ASIC's forwarding memories) in which the firewall object is written.
     * This field indicates the name of the memory subsystem whose utilization
     * is being reported.
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * The amount of the memory allocated in bytes to the filter
     * </pre>
     *
     * <code>optional uint64 allocated = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the allocated field is set.
     */
    boolean hasAllocated();
    /**
     * <pre>
     * The amount of the memory allocated in bytes to the filter
     * </pre>
     *
     * <code>optional uint64 allocated = 2 [(.telemetry_options) = { ... }</code>
     * @return The allocated.
     */
    long getAllocated();
  }
  /**
   * <pre>
   * Memory usage
   * </pre>
   *
   * Protobuf type {@code MemoryUsage}
   */
  public static final class MemoryUsage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MemoryUsage)
      MemoryUsageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MemoryUsage.newBuilder() to construct.
    private MemoryUsage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MemoryUsage() {
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MemoryUsage();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_MemoryUsage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_MemoryUsage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * The router has typically several types of memories (e.g. CPU's memory,
     * ASIC's forwarding memories) in which the firewall object is written.
     * This field indicates the name of the memory subsystem whose utilization
     * is being reported.
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The router has typically several types of memories (e.g. CPU's memory,
     * ASIC's forwarding memories) in which the firewall object is written.
     * This field indicates the name of the memory subsystem whose utilization
     * is being reported.
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * The router has typically several types of memories (e.g. CPU's memory,
     * ASIC's forwarding memories) in which the firewall object is written.
     * This field indicates the name of the memory subsystem whose utilization
     * is being reported.
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ALLOCATED_FIELD_NUMBER = 2;
    private long allocated_;
    /**
     * <pre>
     * The amount of the memory allocated in bytes to the filter
     * </pre>
     *
     * <code>optional uint64 allocated = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the allocated field is set.
     */
    @java.lang.Override
    public boolean hasAllocated() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The amount of the memory allocated in bytes to the filter
     * </pre>
     *
     * <code>optional uint64 allocated = 2 [(.telemetry_options) = { ... }</code>
     * @return The allocated.
     */
    @java.lang.Override
    public long getAllocated() {
      return allocated_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, allocated_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, allocated_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasAllocated() != other.hasAllocated()) return false;
      if (hasAllocated()) {
        if (getAllocated()
            != other.getAllocated()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasAllocated()) {
        hash = (37 * hash) + ALLOCATED_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getAllocated());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage prototype) {
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
     * <pre>
     * Memory usage
     * </pre>
     *
     * Protobuf type {@code MemoryUsage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MemoryUsage)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_MemoryUsage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_MemoryUsage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        allocated_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_MemoryUsage_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.allocated_ = allocated_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasAllocated()) {
          setAllocated(other.getAllocated());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                allocated_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * The router has typically several types of memories (e.g. CPU's memory,
       * ASIC's forwarding memories) in which the firewall object is written.
       * This field indicates the name of the memory subsystem whose utilization
       * is being reported.
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * The router has typically several types of memories (e.g. CPU's memory,
       * ASIC's forwarding memories) in which the firewall object is written.
       * This field indicates the name of the memory subsystem whose utilization
       * is being reported.
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * The router has typically several types of memories (e.g. CPU's memory,
       * ASIC's forwarding memories) in which the firewall object is written.
       * This field indicates the name of the memory subsystem whose utilization
       * is being reported.
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * The router has typically several types of memories (e.g. CPU's memory,
       * ASIC's forwarding memories) in which the firewall object is written.
       * This field indicates the name of the memory subsystem whose utilization
       * is being reported.
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The router has typically several types of memories (e.g. CPU's memory,
       * ASIC's forwarding memories) in which the firewall object is written.
       * This field indicates the name of the memory subsystem whose utilization
       * is being reported.
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The router has typically several types of memories (e.g. CPU's memory,
       * ASIC's forwarding memories) in which the firewall object is written.
       * This field indicates the name of the memory subsystem whose utilization
       * is being reported.
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private long allocated_ ;
      /**
       * <pre>
       * The amount of the memory allocated in bytes to the filter
       * </pre>
       *
       * <code>optional uint64 allocated = 2 [(.telemetry_options) = { ... }</code>
       * @return Whether the allocated field is set.
       */
      @java.lang.Override
      public boolean hasAllocated() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * The amount of the memory allocated in bytes to the filter
       * </pre>
       *
       * <code>optional uint64 allocated = 2 [(.telemetry_options) = { ... }</code>
       * @return The allocated.
       */
      @java.lang.Override
      public long getAllocated() {
        return allocated_;
      }
      /**
       * <pre>
       * The amount of the memory allocated in bytes to the filter
       * </pre>
       *
       * <code>optional uint64 allocated = 2 [(.telemetry_options) = { ... }</code>
       * @param value The allocated to set.
       * @return This builder for chaining.
       */
      public Builder setAllocated(long value) {
        bitField0_ |= 0x00000002;
        allocated_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The amount of the memory allocated in bytes to the filter
       * </pre>
       *
       * <code>optional uint64 allocated = 2 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearAllocated() {
        bitField0_ = (bitField0_ & ~0x00000002);
        allocated_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:MemoryUsage)
    }

    // @@protoc_insertion_point(class_scope:MemoryUsage)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<MemoryUsage>
        PARSER = new com.google.protobuf.AbstractParser<MemoryUsage>() {
      @java.lang.Override
      public MemoryUsage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<MemoryUsage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MemoryUsage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.MemoryUsage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CounterStatsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CounterStats)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Counter name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <pre>
     * Counter name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <pre>
     * Counter name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * The total number of packets seen by the counter
     * </pre>
     *
     * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the packets field is set.
     */
    boolean hasPackets();
    /**
     * <pre>
     * The total number of packets seen by the counter
     * </pre>
     *
     * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
     * @return The packets.
     */
    long getPackets();

    /**
     * <pre>
     * The total number of bytes seen by the counter
     * </pre>
     *
     * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the bytes field is set.
     */
    boolean hasBytes();
    /**
     * <pre>
     * The total number of bytes seen by the counter
     * </pre>
     *
     * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return The bytes.
     */
    long getBytes();
  }
  /**
   * <pre>
   * Counter statistics
   * </pre>
   *
   * Protobuf type {@code CounterStats}
   */
  public static final class CounterStats extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CounterStats)
      CounterStatsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CounterStats.newBuilder() to construct.
    private CounterStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CounterStats() {
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CounterStats();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_CounterStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_CounterStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * Counter name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Counter name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * Counter name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PACKETS_FIELD_NUMBER = 2;
    private long packets_;
    /**
     * <pre>
     * The total number of packets seen by the counter
     * </pre>
     *
     * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the packets field is set.
     */
    @java.lang.Override
    public boolean hasPackets() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The total number of packets seen by the counter
     * </pre>
     *
     * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
     * @return The packets.
     */
    @java.lang.Override
    public long getPackets() {
      return packets_;
    }

    public static final int BYTES_FIELD_NUMBER = 3;
    private long bytes_;
    /**
     * <pre>
     * The total number of bytes seen by the counter
     * </pre>
     *
     * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the bytes field is set.
     */
    @java.lang.Override
    public boolean hasBytes() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The total number of bytes seen by the counter
     * </pre>
     *
     * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return The bytes.
     */
    @java.lang.Override
    public long getBytes() {
      return bytes_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, packets_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, bytes_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, packets_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, bytes_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasPackets() != other.hasPackets()) return false;
      if (hasPackets()) {
        if (getPackets()
            != other.getPackets()) return false;
      }
      if (hasBytes() != other.hasBytes()) return false;
      if (hasBytes()) {
        if (getBytes()
            != other.getBytes()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasPackets()) {
        hash = (37 * hash) + PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getPackets());
      }
      if (hasBytes()) {
        hash = (37 * hash) + BYTES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getBytes());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats prototype) {
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
     * <pre>
     * Counter statistics
     * </pre>
     *
     * Protobuf type {@code CounterStats}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CounterStats)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStatsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_CounterStats_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_CounterStats_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        packets_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        bytes_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_CounterStats_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.packets_ = packets_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.bytes_ = bytes_;
          to_bitField0_ |= 0x00000004;
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasPackets()) {
          setPackets(other.getPackets());
        }
        if (other.hasBytes()) {
          setBytes(other.getBytes());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                packets_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                bytes_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * Counter name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Counter name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Counter name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Counter name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Counter name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private long packets_ ;
      /**
       * <pre>
       * The total number of packets seen by the counter
       * </pre>
       *
       * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
       * @return Whether the packets field is set.
       */
      @java.lang.Override
      public boolean hasPackets() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * The total number of packets seen by the counter
       * </pre>
       *
       * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
       * @return The packets.
       */
      @java.lang.Override
      public long getPackets() {
        return packets_;
      }
      /**
       * <pre>
       * The total number of packets seen by the counter
       * </pre>
       *
       * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
       * @param value The packets to set.
       * @return This builder for chaining.
       */
      public Builder setPackets(long value) {
        bitField0_ |= 0x00000002;
        packets_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of packets seen by the counter
       * </pre>
       *
       * <code>optional uint64 packets = 2 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearPackets() {
        bitField0_ = (bitField0_ & ~0x00000002);
        packets_ = 0L;
        onChanged();
        return this;
      }

      private long bytes_ ;
      /**
       * <pre>
       * The total number of bytes seen by the counter
       * </pre>
       *
       * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
       * @return Whether the bytes field is set.
       */
      @java.lang.Override
      public boolean hasBytes() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * The total number of bytes seen by the counter
       * </pre>
       *
       * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
       * @return The bytes.
       */
      @java.lang.Override
      public long getBytes() {
        return bytes_;
      }
      /**
       * <pre>
       * The total number of bytes seen by the counter
       * </pre>
       *
       * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
       * @param value The bytes to set.
       * @return This builder for chaining.
       */
      public Builder setBytes(long value) {
        bitField0_ |= 0x00000004;
        bytes_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of bytes seen by the counter
       * </pre>
       *
       * <code>optional uint64 bytes = 3 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearBytes() {
        bitField0_ = (bitField0_ & ~0x00000004);
        bytes_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:CounterStats)
    }

    // @@protoc_insertion_point(class_scope:CounterStats)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CounterStats>
        PARSER = new com.google.protobuf.AbstractParser<CounterStats>() {
      @java.lang.Override
      public CounterStats parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<CounterStats> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CounterStats> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.CounterStats getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface PolicerStatsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PolicerStats)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Policer instance name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <pre>
     * Policer instance name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <pre>
     * Policer instance name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * The total number of packets marked out-of-specification by the policer
     * </pre>
     *
     * <code>optional uint64 out_of_spec_packets = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the outOfSpecPackets field is set.
     */
    boolean hasOutOfSpecPackets();
    /**
     * <pre>
     * The total number of packets marked out-of-specification by the policer
     * </pre>
     *
     * <code>optional uint64 out_of_spec_packets = 2 [(.telemetry_options) = { ... }</code>
     * @return The outOfSpecPackets.
     */
    long getOutOfSpecPackets();

    /**
     * <pre>
     * The total number of bytes marked out-of-specification by the policer
     * </pre>
     *
     * <code>optional uint64 out_of_spec_bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the outOfSpecBytes field is set.
     */
    boolean hasOutOfSpecBytes();
    /**
     * <pre>
     * The total number of bytes marked out-of-specification by the policer
     * </pre>
     *
     * <code>optional uint64 out_of_spec_bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return The outOfSpecBytes.
     */
    long getOutOfSpecBytes();

    /**
     * <pre>
     * Additional statistics when enhanced policer statistics are available
     * </pre>
     *
     * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
     * @return Whether the extendedPolicerStats field is set.
     */
    boolean hasExtendedPolicerStats();
    /**
     * <pre>
     * Additional statistics when enhanced policer statistics are available
     * </pre>
     *
     * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
     * @return The extendedPolicerStats.
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats getExtendedPolicerStats();
    /**
     * <pre>
     * Additional statistics when enhanced policer statistics are available
     * </pre>
     *
     * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
     */
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStatsOrBuilder getExtendedPolicerStatsOrBuilder();
  }
  /**
   * <pre>
   * Policer statistics
   * </pre>
   *
   * Protobuf type {@code PolicerStats}
   */
  public static final class PolicerStats extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PolicerStats)
      PolicerStatsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PolicerStats.newBuilder() to construct.
    private PolicerStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PolicerStats() {
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PolicerStats();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_PolicerStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_PolicerStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * Policer instance name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Policer instance name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * Policer instance name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OUT_OF_SPEC_PACKETS_FIELD_NUMBER = 2;
    private long outOfSpecPackets_;
    /**
     * <pre>
     * The total number of packets marked out-of-specification by the policer
     * </pre>
     *
     * <code>optional uint64 out_of_spec_packets = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the outOfSpecPackets field is set.
     */
    @java.lang.Override
    public boolean hasOutOfSpecPackets() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The total number of packets marked out-of-specification by the policer
     * </pre>
     *
     * <code>optional uint64 out_of_spec_packets = 2 [(.telemetry_options) = { ... }</code>
     * @return The outOfSpecPackets.
     */
    @java.lang.Override
    public long getOutOfSpecPackets() {
      return outOfSpecPackets_;
    }

    public static final int OUT_OF_SPEC_BYTES_FIELD_NUMBER = 3;
    private long outOfSpecBytes_;
    /**
     * <pre>
     * The total number of bytes marked out-of-specification by the policer
     * </pre>
     *
     * <code>optional uint64 out_of_spec_bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the outOfSpecBytes field is set.
     */
    @java.lang.Override
    public boolean hasOutOfSpecBytes() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The total number of bytes marked out-of-specification by the policer
     * </pre>
     *
     * <code>optional uint64 out_of_spec_bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return The outOfSpecBytes.
     */
    @java.lang.Override
    public long getOutOfSpecBytes() {
      return outOfSpecBytes_;
    }

    public static final int EXTENDED_POLICER_STATS_FIELD_NUMBER = 4;
    private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats extendedPolicerStats_;
    /**
     * <pre>
     * Additional statistics when enhanced policer statistics are available
     * </pre>
     *
     * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
     * @return Whether the extendedPolicerStats field is set.
     */
    @java.lang.Override
    public boolean hasExtendedPolicerStats() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * Additional statistics when enhanced policer statistics are available
     * </pre>
     *
     * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
     * @return The extendedPolicerStats.
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats getExtendedPolicerStats() {
      return extendedPolicerStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.getDefaultInstance() : extendedPolicerStats_;
    }
    /**
     * <pre>
     * Additional statistics when enhanced policer statistics are available
     * </pre>
     *
     * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
     */
    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStatsOrBuilder getExtendedPolicerStatsOrBuilder() {
      return extendedPolicerStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.getDefaultInstance() : extendedPolicerStats_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, outOfSpecPackets_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, outOfSpecBytes_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(4, getExtendedPolicerStats());
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, outOfSpecPackets_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, outOfSpecBytes_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getExtendedPolicerStats());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasOutOfSpecPackets() != other.hasOutOfSpecPackets()) return false;
      if (hasOutOfSpecPackets()) {
        if (getOutOfSpecPackets()
            != other.getOutOfSpecPackets()) return false;
      }
      if (hasOutOfSpecBytes() != other.hasOutOfSpecBytes()) return false;
      if (hasOutOfSpecBytes()) {
        if (getOutOfSpecBytes()
            != other.getOutOfSpecBytes()) return false;
      }
      if (hasExtendedPolicerStats() != other.hasExtendedPolicerStats()) return false;
      if (hasExtendedPolicerStats()) {
        if (!getExtendedPolicerStats()
            .equals(other.getExtendedPolicerStats())) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasOutOfSpecPackets()) {
        hash = (37 * hash) + OUT_OF_SPEC_PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getOutOfSpecPackets());
      }
      if (hasOutOfSpecBytes()) {
        hash = (37 * hash) + OUT_OF_SPEC_BYTES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getOutOfSpecBytes());
      }
      if (hasExtendedPolicerStats()) {
        hash = (37 * hash) + EXTENDED_POLICER_STATS_FIELD_NUMBER;
        hash = (53 * hash) + getExtendedPolicerStats().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats prototype) {
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
     * <pre>
     * Policer statistics
     * </pre>
     *
     * Protobuf type {@code PolicerStats}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PolicerStats)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStatsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_PolicerStats_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_PolicerStats_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.newBuilder()
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
          getExtendedPolicerStatsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        outOfSpecPackets_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        outOfSpecBytes_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        if (extendedPolicerStatsBuilder_ == null) {
          extendedPolicerStats_ = null;
        } else {
          extendedPolicerStatsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_PolicerStats_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.outOfSpecPackets_ = outOfSpecPackets_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.outOfSpecBytes_ = outOfSpecBytes_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          if (extendedPolicerStatsBuilder_ == null) {
            result.extendedPolicerStats_ = extendedPolicerStats_;
          } else {
            result.extendedPolicerStats_ = extendedPolicerStatsBuilder_.build();
          }
          to_bitField0_ |= 0x00000008;
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasOutOfSpecPackets()) {
          setOutOfSpecPackets(other.getOutOfSpecPackets());
        }
        if (other.hasOutOfSpecBytes()) {
          setOutOfSpecBytes(other.getOutOfSpecBytes());
        }
        if (other.hasExtendedPolicerStats()) {
          mergeExtendedPolicerStats(other.getExtendedPolicerStats());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                outOfSpecPackets_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                outOfSpecBytes_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 34: {
                input.readMessage(
                    getExtendedPolicerStatsFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * Policer instance name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Policer instance name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Policer instance name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Policer instance name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Policer instance name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Policer instance name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private long outOfSpecPackets_ ;
      /**
       * <pre>
       * The total number of packets marked out-of-specification by the policer
       * </pre>
       *
       * <code>optional uint64 out_of_spec_packets = 2 [(.telemetry_options) = { ... }</code>
       * @return Whether the outOfSpecPackets field is set.
       */
      @java.lang.Override
      public boolean hasOutOfSpecPackets() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * The total number of packets marked out-of-specification by the policer
       * </pre>
       *
       * <code>optional uint64 out_of_spec_packets = 2 [(.telemetry_options) = { ... }</code>
       * @return The outOfSpecPackets.
       */
      @java.lang.Override
      public long getOutOfSpecPackets() {
        return outOfSpecPackets_;
      }
      /**
       * <pre>
       * The total number of packets marked out-of-specification by the policer
       * </pre>
       *
       * <code>optional uint64 out_of_spec_packets = 2 [(.telemetry_options) = { ... }</code>
       * @param value The outOfSpecPackets to set.
       * @return This builder for chaining.
       */
      public Builder setOutOfSpecPackets(long value) {
        bitField0_ |= 0x00000002;
        outOfSpecPackets_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of packets marked out-of-specification by the policer
       * </pre>
       *
       * <code>optional uint64 out_of_spec_packets = 2 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearOutOfSpecPackets() {
        bitField0_ = (bitField0_ & ~0x00000002);
        outOfSpecPackets_ = 0L;
        onChanged();
        return this;
      }

      private long outOfSpecBytes_ ;
      /**
       * <pre>
       * The total number of bytes marked out-of-specification by the policer
       * </pre>
       *
       * <code>optional uint64 out_of_spec_bytes = 3 [(.telemetry_options) = { ... }</code>
       * @return Whether the outOfSpecBytes field is set.
       */
      @java.lang.Override
      public boolean hasOutOfSpecBytes() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * The total number of bytes marked out-of-specification by the policer
       * </pre>
       *
       * <code>optional uint64 out_of_spec_bytes = 3 [(.telemetry_options) = { ... }</code>
       * @return The outOfSpecBytes.
       */
      @java.lang.Override
      public long getOutOfSpecBytes() {
        return outOfSpecBytes_;
      }
      /**
       * <pre>
       * The total number of bytes marked out-of-specification by the policer
       * </pre>
       *
       * <code>optional uint64 out_of_spec_bytes = 3 [(.telemetry_options) = { ... }</code>
       * @param value The outOfSpecBytes to set.
       * @return This builder for chaining.
       */
      public Builder setOutOfSpecBytes(long value) {
        bitField0_ |= 0x00000004;
        outOfSpecBytes_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of bytes marked out-of-specification by the policer
       * </pre>
       *
       * <code>optional uint64 out_of_spec_bytes = 3 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearOutOfSpecBytes() {
        bitField0_ = (bitField0_ & ~0x00000004);
        outOfSpecBytes_ = 0L;
        onChanged();
        return this;
      }

      private org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats extendedPolicerStats_;
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStatsOrBuilder> extendedPolicerStatsBuilder_;
      /**
       * <pre>
       * Additional statistics when enhanced policer statistics are available
       * </pre>
       *
       * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
       * @return Whether the extendedPolicerStats field is set.
       */
      public boolean hasExtendedPolicerStats() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * Additional statistics when enhanced policer statistics are available
       * </pre>
       *
       * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
       * @return The extendedPolicerStats.
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats getExtendedPolicerStats() {
        if (extendedPolicerStatsBuilder_ == null) {
          return extendedPolicerStats_ == null ? org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.getDefaultInstance() : extendedPolicerStats_;
        } else {
          return extendedPolicerStatsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * Additional statistics when enhanced policer statistics are available
       * </pre>
       *
       * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
       */
      public Builder setExtendedPolicerStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats value) {
        if (extendedPolicerStatsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          extendedPolicerStats_ = value;
          onChanged();
        } else {
          extendedPolicerStatsBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <pre>
       * Additional statistics when enhanced policer statistics are available
       * </pre>
       *
       * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
       */
      public Builder setExtendedPolicerStats(
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.Builder builderForValue) {
        if (extendedPolicerStatsBuilder_ == null) {
          extendedPolicerStats_ = builderForValue.build();
          onChanged();
        } else {
          extendedPolicerStatsBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <pre>
       * Additional statistics when enhanced policer statistics are available
       * </pre>
       *
       * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
       */
      public Builder mergeExtendedPolicerStats(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats value) {
        if (extendedPolicerStatsBuilder_ == null) {
          if (((bitField0_ & 0x00000008) != 0) &&
              extendedPolicerStats_ != null &&
              extendedPolicerStats_ != org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.getDefaultInstance()) {
            extendedPolicerStats_ =
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.newBuilder(extendedPolicerStats_).mergeFrom(value).buildPartial();
          } else {
            extendedPolicerStats_ = value;
          }
          onChanged();
        } else {
          extendedPolicerStatsBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000008;
        return this;
      }
      /**
       * <pre>
       * Additional statistics when enhanced policer statistics are available
       * </pre>
       *
       * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
       */
      public Builder clearExtendedPolicerStats() {
        if (extendedPolicerStatsBuilder_ == null) {
          extendedPolicerStats_ = null;
          onChanged();
        } else {
          extendedPolicerStatsBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }
      /**
       * <pre>
       * Additional statistics when enhanced policer statistics are available
       * </pre>
       *
       * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.Builder getExtendedPolicerStatsBuilder() {
        bitField0_ |= 0x00000008;
        onChanged();
        return getExtendedPolicerStatsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * Additional statistics when enhanced policer statistics are available
       * </pre>
       *
       * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
       */
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStatsOrBuilder getExtendedPolicerStatsOrBuilder() {
        if (extendedPolicerStatsBuilder_ != null) {
          return extendedPolicerStatsBuilder_.getMessageOrBuilder();
        } else {
          return extendedPolicerStats_ == null ?
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.getDefaultInstance() : extendedPolicerStats_;
        }
      }
      /**
       * <pre>
       * Additional statistics when enhanced policer statistics are available
       * </pre>
       *
       * <code>optional .ExtendedPolicerStats extended_policer_stats = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStatsOrBuilder> 
          getExtendedPolicerStatsFieldBuilder() {
        if (extendedPolicerStatsBuilder_ == null) {
          extendedPolicerStatsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.Builder, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStatsOrBuilder>(
                  getExtendedPolicerStats(),
                  getParentForChildren(),
                  isClean());
          extendedPolicerStats_ = null;
        }
        return extendedPolicerStatsBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PolicerStats)
    }

    // @@protoc_insertion_point(class_scope:PolicerStats)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<PolicerStats>
        PARSER = new com.google.protobuf.AbstractParser<PolicerStats>() {
      @java.lang.Override
      public PolicerStats parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<PolicerStats> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PolicerStats> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.PolicerStats getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ExtendedPolicerStatsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ExtendedPolicerStats)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The total number of packets subjected to policing
     * </pre>
     *
     * <code>optional uint64 offered_packets = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the offeredPackets field is set.
     */
    boolean hasOfferedPackets();
    /**
     * <pre>
     * The total number of packets subjected to policing
     * </pre>
     *
     * <code>optional uint64 offered_packets = 1 [(.telemetry_options) = { ... }</code>
     * @return The offeredPackets.
     */
    long getOfferedPackets();

    /**
     * <pre>
     * The total number of bytes subjected to policing
     * </pre>
     *
     * <code>optional uint64 offered_bytes = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the offeredBytes field is set.
     */
    boolean hasOfferedBytes();
    /**
     * <pre>
     * The total number of bytes subjected to policing
     * </pre>
     *
     * <code>optional uint64 offered_bytes = 2 [(.telemetry_options) = { ... }</code>
     * @return The offeredBytes.
     */
    long getOfferedBytes();

    /**
     * <pre>
     * The total number of packets not discarded by the policer
     * </pre>
     *
     * <code>optional uint64 transmitted_packets = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the transmittedPackets field is set.
     */
    boolean hasTransmittedPackets();
    /**
     * <pre>
     * The total number of packets not discarded by the policer
     * </pre>
     *
     * <code>optional uint64 transmitted_packets = 3 [(.telemetry_options) = { ... }</code>
     * @return The transmittedPackets.
     */
    long getTransmittedPackets();

    /**
     * <pre>
     * The total number of bytes not discarded by the policer
     * </pre>
     *
     * <code>optional uint64 transmitted_bytes = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the transmittedBytes field is set.
     */
    boolean hasTransmittedBytes();
    /**
     * <pre>
     * The total number of bytes not discarded by the policer
     * </pre>
     *
     * <code>optional uint64 transmitted_bytes = 4 [(.telemetry_options) = { ... }</code>
     * @return The transmittedBytes.
     */
    long getTransmittedBytes();
  }
  /**
   * <pre>
   * Extended policer statistics when enhanced policer statistics are available
   * </pre>
   *
   * Protobuf type {@code ExtendedPolicerStats}
   */
  public static final class ExtendedPolicerStats extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ExtendedPolicerStats)
      ExtendedPolicerStatsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ExtendedPolicerStats.newBuilder() to construct.
    private ExtendedPolicerStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ExtendedPolicerStats() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ExtendedPolicerStats();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_ExtendedPolicerStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_ExtendedPolicerStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.Builder.class);
    }

    private int bitField0_;
    public static final int OFFERED_PACKETS_FIELD_NUMBER = 1;
    private long offeredPackets_;
    /**
     * <pre>
     * The total number of packets subjected to policing
     * </pre>
     *
     * <code>optional uint64 offered_packets = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the offeredPackets field is set.
     */
    @java.lang.Override
    public boolean hasOfferedPackets() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The total number of packets subjected to policing
     * </pre>
     *
     * <code>optional uint64 offered_packets = 1 [(.telemetry_options) = { ... }</code>
     * @return The offeredPackets.
     */
    @java.lang.Override
    public long getOfferedPackets() {
      return offeredPackets_;
    }

    public static final int OFFERED_BYTES_FIELD_NUMBER = 2;
    private long offeredBytes_;
    /**
     * <pre>
     * The total number of bytes subjected to policing
     * </pre>
     *
     * <code>optional uint64 offered_bytes = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the offeredBytes field is set.
     */
    @java.lang.Override
    public boolean hasOfferedBytes() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The total number of bytes subjected to policing
     * </pre>
     *
     * <code>optional uint64 offered_bytes = 2 [(.telemetry_options) = { ... }</code>
     * @return The offeredBytes.
     */
    @java.lang.Override
    public long getOfferedBytes() {
      return offeredBytes_;
    }

    public static final int TRANSMITTED_PACKETS_FIELD_NUMBER = 3;
    private long transmittedPackets_;
    /**
     * <pre>
     * The total number of packets not discarded by the policer
     * </pre>
     *
     * <code>optional uint64 transmitted_packets = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the transmittedPackets field is set.
     */
    @java.lang.Override
    public boolean hasTransmittedPackets() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The total number of packets not discarded by the policer
     * </pre>
     *
     * <code>optional uint64 transmitted_packets = 3 [(.telemetry_options) = { ... }</code>
     * @return The transmittedPackets.
     */
    @java.lang.Override
    public long getTransmittedPackets() {
      return transmittedPackets_;
    }

    public static final int TRANSMITTED_BYTES_FIELD_NUMBER = 4;
    private long transmittedBytes_;
    /**
     * <pre>
     * The total number of bytes not discarded by the policer
     * </pre>
     *
     * <code>optional uint64 transmitted_bytes = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the transmittedBytes field is set.
     */
    @java.lang.Override
    public boolean hasTransmittedBytes() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * The total number of bytes not discarded by the policer
     * </pre>
     *
     * <code>optional uint64 transmitted_bytes = 4 [(.telemetry_options) = { ... }</code>
     * @return The transmittedBytes.
     */
    @java.lang.Override
    public long getTransmittedBytes() {
      return transmittedBytes_;
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt64(1, offeredPackets_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, offeredBytes_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, transmittedPackets_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt64(4, transmittedBytes_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, offeredPackets_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, offeredBytes_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, transmittedPackets_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, transmittedBytes_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats) obj;

      if (hasOfferedPackets() != other.hasOfferedPackets()) return false;
      if (hasOfferedPackets()) {
        if (getOfferedPackets()
            != other.getOfferedPackets()) return false;
      }
      if (hasOfferedBytes() != other.hasOfferedBytes()) return false;
      if (hasOfferedBytes()) {
        if (getOfferedBytes()
            != other.getOfferedBytes()) return false;
      }
      if (hasTransmittedPackets() != other.hasTransmittedPackets()) return false;
      if (hasTransmittedPackets()) {
        if (getTransmittedPackets()
            != other.getTransmittedPackets()) return false;
      }
      if (hasTransmittedBytes() != other.hasTransmittedBytes()) return false;
      if (hasTransmittedBytes()) {
        if (getTransmittedBytes()
            != other.getTransmittedBytes()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasOfferedPackets()) {
        hash = (37 * hash) + OFFERED_PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getOfferedPackets());
      }
      if (hasOfferedBytes()) {
        hash = (37 * hash) + OFFERED_BYTES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getOfferedBytes());
      }
      if (hasTransmittedPackets()) {
        hash = (37 * hash) + TRANSMITTED_PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getTransmittedPackets());
      }
      if (hasTransmittedBytes()) {
        hash = (37 * hash) + TRANSMITTED_BYTES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getTransmittedBytes());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats prototype) {
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
     * <pre>
     * Extended policer statistics when enhanced policer statistics are available
     * </pre>
     *
     * Protobuf type {@code ExtendedPolicerStats}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ExtendedPolicerStats)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStatsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_ExtendedPolicerStats_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_ExtendedPolicerStats_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        offeredPackets_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        offeredBytes_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        transmittedPackets_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        transmittedBytes_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_ExtendedPolicerStats_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.offeredPackets_ = offeredPackets_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.offeredBytes_ = offeredBytes_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.transmittedPackets_ = transmittedPackets_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.transmittedBytes_ = transmittedBytes_;
          to_bitField0_ |= 0x00000008;
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats.getDefaultInstance()) return this;
        if (other.hasOfferedPackets()) {
          setOfferedPackets(other.getOfferedPackets());
        }
        if (other.hasOfferedBytes()) {
          setOfferedBytes(other.getOfferedBytes());
        }
        if (other.hasTransmittedPackets()) {
          setTransmittedPackets(other.getTransmittedPackets());
        }
        if (other.hasTransmittedBytes()) {
          setTransmittedBytes(other.getTransmittedBytes());
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                offeredPackets_ = input.readUInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              case 16: {
                offeredBytes_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                transmittedPackets_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                transmittedBytes_ = input.readUInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private long offeredPackets_ ;
      /**
       * <pre>
       * The total number of packets subjected to policing
       * </pre>
       *
       * <code>optional uint64 offered_packets = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the offeredPackets field is set.
       */
      @java.lang.Override
      public boolean hasOfferedPackets() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * The total number of packets subjected to policing
       * </pre>
       *
       * <code>optional uint64 offered_packets = 1 [(.telemetry_options) = { ... }</code>
       * @return The offeredPackets.
       */
      @java.lang.Override
      public long getOfferedPackets() {
        return offeredPackets_;
      }
      /**
       * <pre>
       * The total number of packets subjected to policing
       * </pre>
       *
       * <code>optional uint64 offered_packets = 1 [(.telemetry_options) = { ... }</code>
       * @param value The offeredPackets to set.
       * @return This builder for chaining.
       */
      public Builder setOfferedPackets(long value) {
        bitField0_ |= 0x00000001;
        offeredPackets_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of packets subjected to policing
       * </pre>
       *
       * <code>optional uint64 offered_packets = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearOfferedPackets() {
        bitField0_ = (bitField0_ & ~0x00000001);
        offeredPackets_ = 0L;
        onChanged();
        return this;
      }

      private long offeredBytes_ ;
      /**
       * <pre>
       * The total number of bytes subjected to policing
       * </pre>
       *
       * <code>optional uint64 offered_bytes = 2 [(.telemetry_options) = { ... }</code>
       * @return Whether the offeredBytes field is set.
       */
      @java.lang.Override
      public boolean hasOfferedBytes() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * The total number of bytes subjected to policing
       * </pre>
       *
       * <code>optional uint64 offered_bytes = 2 [(.telemetry_options) = { ... }</code>
       * @return The offeredBytes.
       */
      @java.lang.Override
      public long getOfferedBytes() {
        return offeredBytes_;
      }
      /**
       * <pre>
       * The total number of bytes subjected to policing
       * </pre>
       *
       * <code>optional uint64 offered_bytes = 2 [(.telemetry_options) = { ... }</code>
       * @param value The offeredBytes to set.
       * @return This builder for chaining.
       */
      public Builder setOfferedBytes(long value) {
        bitField0_ |= 0x00000002;
        offeredBytes_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of bytes subjected to policing
       * </pre>
       *
       * <code>optional uint64 offered_bytes = 2 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearOfferedBytes() {
        bitField0_ = (bitField0_ & ~0x00000002);
        offeredBytes_ = 0L;
        onChanged();
        return this;
      }

      private long transmittedPackets_ ;
      /**
       * <pre>
       * The total number of packets not discarded by the policer
       * </pre>
       *
       * <code>optional uint64 transmitted_packets = 3 [(.telemetry_options) = { ... }</code>
       * @return Whether the transmittedPackets field is set.
       */
      @java.lang.Override
      public boolean hasTransmittedPackets() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * The total number of packets not discarded by the policer
       * </pre>
       *
       * <code>optional uint64 transmitted_packets = 3 [(.telemetry_options) = { ... }</code>
       * @return The transmittedPackets.
       */
      @java.lang.Override
      public long getTransmittedPackets() {
        return transmittedPackets_;
      }
      /**
       * <pre>
       * The total number of packets not discarded by the policer
       * </pre>
       *
       * <code>optional uint64 transmitted_packets = 3 [(.telemetry_options) = { ... }</code>
       * @param value The transmittedPackets to set.
       * @return This builder for chaining.
       */
      public Builder setTransmittedPackets(long value) {
        bitField0_ |= 0x00000004;
        transmittedPackets_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of packets not discarded by the policer
       * </pre>
       *
       * <code>optional uint64 transmitted_packets = 3 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearTransmittedPackets() {
        bitField0_ = (bitField0_ & ~0x00000004);
        transmittedPackets_ = 0L;
        onChanged();
        return this;
      }

      private long transmittedBytes_ ;
      /**
       * <pre>
       * The total number of bytes not discarded by the policer
       * </pre>
       *
       * <code>optional uint64 transmitted_bytes = 4 [(.telemetry_options) = { ... }</code>
       * @return Whether the transmittedBytes field is set.
       */
      @java.lang.Override
      public boolean hasTransmittedBytes() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * The total number of bytes not discarded by the policer
       * </pre>
       *
       * <code>optional uint64 transmitted_bytes = 4 [(.telemetry_options) = { ... }</code>
       * @return The transmittedBytes.
       */
      @java.lang.Override
      public long getTransmittedBytes() {
        return transmittedBytes_;
      }
      /**
       * <pre>
       * The total number of bytes not discarded by the policer
       * </pre>
       *
       * <code>optional uint64 transmitted_bytes = 4 [(.telemetry_options) = { ... }</code>
       * @param value The transmittedBytes to set.
       * @return This builder for chaining.
       */
      public Builder setTransmittedBytes(long value) {
        bitField0_ |= 0x00000008;
        transmittedBytes_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of bytes not discarded by the policer
       * </pre>
       *
       * <code>optional uint64 transmitted_bytes = 4 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearTransmittedBytes() {
        bitField0_ = (bitField0_ & ~0x00000008);
        transmittedBytes_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:ExtendedPolicerStats)
    }

    // @@protoc_insertion_point(class_scope:ExtendedPolicerStats)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<ExtendedPolicerStats>
        PARSER = new com.google.protobuf.AbstractParser<ExtendedPolicerStats>() {
      @java.lang.Override
      public ExtendedPolicerStats parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<ExtendedPolicerStats> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ExtendedPolicerStats> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.ExtendedPolicerStats getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HierarchicalPolicerStatsOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HierarchicalPolicerStats)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Hierarchical policer instance name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the name field is set.
     */
    boolean hasName();
    /**
     * <pre>
     * Hierarchical policer instance name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <pre>
     * Hierarchical policer instance name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * The total number of packets marked out-of-specification by
     * the premium policer
     * </pre>
     *
     * <code>optional uint64 premium_packets = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the premiumPackets field is set.
     */
    boolean hasPremiumPackets();
    /**
     * <pre>
     * The total number of packets marked out-of-specification by
     * the premium policer
     * </pre>
     *
     * <code>optional uint64 premium_packets = 2 [(.telemetry_options) = { ... }</code>
     * @return The premiumPackets.
     */
    long getPremiumPackets();

    /**
     * <pre>
     * The total number of bytes marked out-of-specification by
     * the premium policer
     * </pre>
     *
     * <code>optional uint64 premium_bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the premiumBytes field is set.
     */
    boolean hasPremiumBytes();
    /**
     * <pre>
     * The total number of bytes marked out-of-specification by
     * the premium policer
     * </pre>
     *
     * <code>optional uint64 premium_bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return The premiumBytes.
     */
    long getPremiumBytes();

    /**
     * <pre>
     * The total number of packets marked out-of-specification by
     * the aggregate policer
     * </pre>
     *
     * <code>optional uint64 aggregate_packets = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the aggregatePackets field is set.
     */
    boolean hasAggregatePackets();
    /**
     * <pre>
     * The total number of packets marked out-of-specification by
     * the aggregate policer
     * </pre>
     *
     * <code>optional uint64 aggregate_packets = 4 [(.telemetry_options) = { ... }</code>
     * @return The aggregatePackets.
     */
    long getAggregatePackets();

    /**
     * <pre>
     * The total number of bytes marked out-of-specification by
     * the aggregate policer
     * </pre>
     *
     * <code>optional uint64 aggregate_bytes = 5 [(.telemetry_options) = { ... }</code>
     * @return Whether the aggregateBytes field is set.
     */
    boolean hasAggregateBytes();
    /**
     * <pre>
     * The total number of bytes marked out-of-specification by
     * the aggregate policer
     * </pre>
     *
     * <code>optional uint64 aggregate_bytes = 5 [(.telemetry_options) = { ... }</code>
     * @return The aggregateBytes.
     */
    long getAggregateBytes();
  }
  /**
   * <pre>
   * Hierarchical policer statistics
   * </pre>
   *
   * Protobuf type {@code HierarchicalPolicerStats}
   */
  public static final class HierarchicalPolicerStats extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HierarchicalPolicerStats)
      HierarchicalPolicerStatsOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HierarchicalPolicerStats.newBuilder() to construct.
    private HierarchicalPolicerStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HierarchicalPolicerStats() {
      name_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HierarchicalPolicerStats();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_HierarchicalPolicerStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_HierarchicalPolicerStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.Builder.class);
    }

    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object name_;
    /**
     * <pre>
     * Hierarchical policer instance name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return Whether the name field is set.
     */
    @java.lang.Override
    public boolean hasName() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Hierarchical policer instance name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * Hierarchical policer instance name
     * </pre>
     *
     * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int PREMIUM_PACKETS_FIELD_NUMBER = 2;
    private long premiumPackets_;
    /**
     * <pre>
     * The total number of packets marked out-of-specification by
     * the premium policer
     * </pre>
     *
     * <code>optional uint64 premium_packets = 2 [(.telemetry_options) = { ... }</code>
     * @return Whether the premiumPackets field is set.
     */
    @java.lang.Override
    public boolean hasPremiumPackets() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * The total number of packets marked out-of-specification by
     * the premium policer
     * </pre>
     *
     * <code>optional uint64 premium_packets = 2 [(.telemetry_options) = { ... }</code>
     * @return The premiumPackets.
     */
    @java.lang.Override
    public long getPremiumPackets() {
      return premiumPackets_;
    }

    public static final int PREMIUM_BYTES_FIELD_NUMBER = 3;
    private long premiumBytes_;
    /**
     * <pre>
     * The total number of bytes marked out-of-specification by
     * the premium policer
     * </pre>
     *
     * <code>optional uint64 premium_bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return Whether the premiumBytes field is set.
     */
    @java.lang.Override
    public boolean hasPremiumBytes() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * The total number of bytes marked out-of-specification by
     * the premium policer
     * </pre>
     *
     * <code>optional uint64 premium_bytes = 3 [(.telemetry_options) = { ... }</code>
     * @return The premiumBytes.
     */
    @java.lang.Override
    public long getPremiumBytes() {
      return premiumBytes_;
    }

    public static final int AGGREGATE_PACKETS_FIELD_NUMBER = 4;
    private long aggregatePackets_;
    /**
     * <pre>
     * The total number of packets marked out-of-specification by
     * the aggregate policer
     * </pre>
     *
     * <code>optional uint64 aggregate_packets = 4 [(.telemetry_options) = { ... }</code>
     * @return Whether the aggregatePackets field is set.
     */
    @java.lang.Override
    public boolean hasAggregatePackets() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <pre>
     * The total number of packets marked out-of-specification by
     * the aggregate policer
     * </pre>
     *
     * <code>optional uint64 aggregate_packets = 4 [(.telemetry_options) = { ... }</code>
     * @return The aggregatePackets.
     */
    @java.lang.Override
    public long getAggregatePackets() {
      return aggregatePackets_;
    }

    public static final int AGGREGATE_BYTES_FIELD_NUMBER = 5;
    private long aggregateBytes_;
    /**
     * <pre>
     * The total number of bytes marked out-of-specification by
     * the aggregate policer
     * </pre>
     *
     * <code>optional uint64 aggregate_bytes = 5 [(.telemetry_options) = { ... }</code>
     * @return Whether the aggregateBytes field is set.
     */
    @java.lang.Override
    public boolean hasAggregateBytes() {
      return ((bitField0_ & 0x00000010) != 0);
    }
    /**
     * <pre>
     * The total number of bytes marked out-of-specification by
     * the aggregate policer
     * </pre>
     *
     * <code>optional uint64 aggregate_bytes = 5 [(.telemetry_options) = { ... }</code>
     * @return The aggregateBytes.
     */
    @java.lang.Override
    public long getAggregateBytes() {
      return aggregateBytes_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, premiumPackets_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeUInt64(3, premiumBytes_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeUInt64(4, aggregatePackets_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        output.writeUInt64(5, aggregateBytes_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, premiumPackets_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, premiumBytes_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, aggregatePackets_);
      }
      if (((bitField0_ & 0x00000010) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, aggregateBytes_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats)) {
        return super.equals(obj);
      }
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats other = (org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats) obj;

      if (hasName() != other.hasName()) return false;
      if (hasName()) {
        if (!getName()
            .equals(other.getName())) return false;
      }
      if (hasPremiumPackets() != other.hasPremiumPackets()) return false;
      if (hasPremiumPackets()) {
        if (getPremiumPackets()
            != other.getPremiumPackets()) return false;
      }
      if (hasPremiumBytes() != other.hasPremiumBytes()) return false;
      if (hasPremiumBytes()) {
        if (getPremiumBytes()
            != other.getPremiumBytes()) return false;
      }
      if (hasAggregatePackets() != other.hasAggregatePackets()) return false;
      if (hasAggregatePackets()) {
        if (getAggregatePackets()
            != other.getAggregatePackets()) return false;
      }
      if (hasAggregateBytes() != other.hasAggregateBytes()) return false;
      if (hasAggregateBytes()) {
        if (getAggregateBytes()
            != other.getAggregateBytes()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasName()) {
        hash = (37 * hash) + NAME_FIELD_NUMBER;
        hash = (53 * hash) + getName().hashCode();
      }
      if (hasPremiumPackets()) {
        hash = (37 * hash) + PREMIUM_PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getPremiumPackets());
      }
      if (hasPremiumBytes()) {
        hash = (37 * hash) + PREMIUM_BYTES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getPremiumBytes());
      }
      if (hasAggregatePackets()) {
        hash = (37 * hash) + AGGREGATE_PACKETS_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getAggregatePackets());
      }
      if (hasAggregateBytes()) {
        hash = (37 * hash) + AGGREGATE_BYTES_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getAggregateBytes());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats parseFrom(
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
    public static Builder newBuilder(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats prototype) {
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
     * <pre>
     * Hierarchical policer statistics
     * </pre>
     *
     * Protobuf type {@code HierarchicalPolicerStats}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HierarchicalPolicerStats)
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStatsOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_HierarchicalPolicerStats_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_HierarchicalPolicerStats_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.class, org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.Builder.class);
      }

      // Construct using org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        premiumPackets_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        premiumBytes_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        aggregatePackets_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000008);
        aggregateBytes_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.internal_static_HierarchicalPolicerStats_descriptor;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats getDefaultInstanceForType() {
        return org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.getDefaultInstance();
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats build() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats buildPartial() {
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats result = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.name_ = name_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.premiumPackets_ = premiumPackets_;
          to_bitField0_ |= 0x00000002;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.premiumBytes_ = premiumBytes_;
          to_bitField0_ |= 0x00000004;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.aggregatePackets_ = aggregatePackets_;
          to_bitField0_ |= 0x00000008;
        }
        if (((from_bitField0_ & 0x00000010) != 0)) {
          result.aggregateBytes_ = aggregateBytes_;
          to_bitField0_ |= 0x00000010;
        }
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats) {
          return mergeFrom((org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats other) {
        if (other == org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats.getDefaultInstance()) return this;
        if (other.hasName()) {
          bitField0_ |= 0x00000001;
          name_ = other.name_;
          onChanged();
        }
        if (other.hasPremiumPackets()) {
          setPremiumPackets(other.getPremiumPackets());
        }
        if (other.hasPremiumBytes()) {
          setPremiumBytes(other.getPremiumBytes());
        }
        if (other.hasAggregatePackets()) {
          setAggregatePackets(other.getAggregatePackets());
        }
        if (other.hasAggregateBytes()) {
          setAggregateBytes(other.getAggregateBytes());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasName()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                name_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                premiumPackets_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 24: {
                premiumBytes_ = input.readUInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
              case 32: {
                aggregatePackets_ = input.readUInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
              case 40: {
                aggregateBytes_ = input.readUInt64();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object name_ = "";
      /**
       * <pre>
       * Hierarchical policer instance name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return Whether the name field is set.
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Hierarchical policer instance name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return The name.
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Hierarchical policer instance name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return The bytes for name.
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Hierarchical policer instance name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Hierarchical policer instance name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Hierarchical policer instance name
       * </pre>
       *
       * <code>required string name = 1 [(.telemetry_options) = { ... }</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        name_ = value;
        onChanged();
        return this;
      }

      private long premiumPackets_ ;
      /**
       * <pre>
       * The total number of packets marked out-of-specification by
       * the premium policer
       * </pre>
       *
       * <code>optional uint64 premium_packets = 2 [(.telemetry_options) = { ... }</code>
       * @return Whether the premiumPackets field is set.
       */
      @java.lang.Override
      public boolean hasPremiumPackets() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * The total number of packets marked out-of-specification by
       * the premium policer
       * </pre>
       *
       * <code>optional uint64 premium_packets = 2 [(.telemetry_options) = { ... }</code>
       * @return The premiumPackets.
       */
      @java.lang.Override
      public long getPremiumPackets() {
        return premiumPackets_;
      }
      /**
       * <pre>
       * The total number of packets marked out-of-specification by
       * the premium policer
       * </pre>
       *
       * <code>optional uint64 premium_packets = 2 [(.telemetry_options) = { ... }</code>
       * @param value The premiumPackets to set.
       * @return This builder for chaining.
       */
      public Builder setPremiumPackets(long value) {
        bitField0_ |= 0x00000002;
        premiumPackets_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of packets marked out-of-specification by
       * the premium policer
       * </pre>
       *
       * <code>optional uint64 premium_packets = 2 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearPremiumPackets() {
        bitField0_ = (bitField0_ & ~0x00000002);
        premiumPackets_ = 0L;
        onChanged();
        return this;
      }

      private long premiumBytes_ ;
      /**
       * <pre>
       * The total number of bytes marked out-of-specification by
       * the premium policer
       * </pre>
       *
       * <code>optional uint64 premium_bytes = 3 [(.telemetry_options) = { ... }</code>
       * @return Whether the premiumBytes field is set.
       */
      @java.lang.Override
      public boolean hasPremiumBytes() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <pre>
       * The total number of bytes marked out-of-specification by
       * the premium policer
       * </pre>
       *
       * <code>optional uint64 premium_bytes = 3 [(.telemetry_options) = { ... }</code>
       * @return The premiumBytes.
       */
      @java.lang.Override
      public long getPremiumBytes() {
        return premiumBytes_;
      }
      /**
       * <pre>
       * The total number of bytes marked out-of-specification by
       * the premium policer
       * </pre>
       *
       * <code>optional uint64 premium_bytes = 3 [(.telemetry_options) = { ... }</code>
       * @param value The premiumBytes to set.
       * @return This builder for chaining.
       */
      public Builder setPremiumBytes(long value) {
        bitField0_ |= 0x00000004;
        premiumBytes_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of bytes marked out-of-specification by
       * the premium policer
       * </pre>
       *
       * <code>optional uint64 premium_bytes = 3 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearPremiumBytes() {
        bitField0_ = (bitField0_ & ~0x00000004);
        premiumBytes_ = 0L;
        onChanged();
        return this;
      }

      private long aggregatePackets_ ;
      /**
       * <pre>
       * The total number of packets marked out-of-specification by
       * the aggregate policer
       * </pre>
       *
       * <code>optional uint64 aggregate_packets = 4 [(.telemetry_options) = { ... }</code>
       * @return Whether the aggregatePackets field is set.
       */
      @java.lang.Override
      public boolean hasAggregatePackets() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <pre>
       * The total number of packets marked out-of-specification by
       * the aggregate policer
       * </pre>
       *
       * <code>optional uint64 aggregate_packets = 4 [(.telemetry_options) = { ... }</code>
       * @return The aggregatePackets.
       */
      @java.lang.Override
      public long getAggregatePackets() {
        return aggregatePackets_;
      }
      /**
       * <pre>
       * The total number of packets marked out-of-specification by
       * the aggregate policer
       * </pre>
       *
       * <code>optional uint64 aggregate_packets = 4 [(.telemetry_options) = { ... }</code>
       * @param value The aggregatePackets to set.
       * @return This builder for chaining.
       */
      public Builder setAggregatePackets(long value) {
        bitField0_ |= 0x00000008;
        aggregatePackets_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of packets marked out-of-specification by
       * the aggregate policer
       * </pre>
       *
       * <code>optional uint64 aggregate_packets = 4 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearAggregatePackets() {
        bitField0_ = (bitField0_ & ~0x00000008);
        aggregatePackets_ = 0L;
        onChanged();
        return this;
      }

      private long aggregateBytes_ ;
      /**
       * <pre>
       * The total number of bytes marked out-of-specification by
       * the aggregate policer
       * </pre>
       *
       * <code>optional uint64 aggregate_bytes = 5 [(.telemetry_options) = { ... }</code>
       * @return Whether the aggregateBytes field is set.
       */
      @java.lang.Override
      public boolean hasAggregateBytes() {
        return ((bitField0_ & 0x00000010) != 0);
      }
      /**
       * <pre>
       * The total number of bytes marked out-of-specification by
       * the aggregate policer
       * </pre>
       *
       * <code>optional uint64 aggregate_bytes = 5 [(.telemetry_options) = { ... }</code>
       * @return The aggregateBytes.
       */
      @java.lang.Override
      public long getAggregateBytes() {
        return aggregateBytes_;
      }
      /**
       * <pre>
       * The total number of bytes marked out-of-specification by
       * the aggregate policer
       * </pre>
       *
       * <code>optional uint64 aggregate_bytes = 5 [(.telemetry_options) = { ... }</code>
       * @param value The aggregateBytes to set.
       * @return This builder for chaining.
       */
      public Builder setAggregateBytes(long value) {
        bitField0_ |= 0x00000010;
        aggregateBytes_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The total number of bytes marked out-of-specification by
       * the aggregate policer
       * </pre>
       *
       * <code>optional uint64 aggregate_bytes = 5 [(.telemetry_options) = { ... }</code>
       * @return This builder for chaining.
       */
      public Builder clearAggregateBytes() {
        bitField0_ = (bitField0_ & ~0x00000010);
        aggregateBytes_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:HierarchicalPolicerStats)
    }

    // @@protoc_insertion_point(class_scope:HierarchicalPolicerStats)
    private static final org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats();
    }

    public static org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<HierarchicalPolicerStats>
        PARSER = new com.google.protobuf.AbstractParser<HierarchicalPolicerStats>() {
      @java.lang.Override
      public HierarchicalPolicerStats parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<HierarchicalPolicerStats> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HierarchicalPolicerStats> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.HierarchicalPolicerStats getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int JNPR_FIREWALL_EXT_FIELD_NUMBER = 6;
  /**
   * <code>extend .JuniperNetworksSensors { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.JuniperNetworksSensors,
      org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall> jnprFirewallExt = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall.class,
        org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.FirewallOuterClass.Firewall.getDefaultInstance());
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Firewall_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Firewall_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FirewallStats_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FirewallStats_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MemoryUsage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MemoryUsage_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CounterStats_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CounterStats_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PolicerStats_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PolicerStats_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ExtendedPolicerStats_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ExtendedPolicerStats_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HierarchicalPolicerStats_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HierarchicalPolicerStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016firewall.proto\032\023telemetry_top.proto\"2\n" +
      "\010Firewall\022&\n\016firewall_stats\030\001 \003(\0132\016.Fire" +
      "wallStats\"\364\001\n\rFirewallStats\022\032\n\013filter_na" +
      "me\030\001 \002(\tB\005\202@\002\010\001\022\030\n\ttimestamp\030\002 \001(\004B\005\202@\002\020" +
      "\001\022\"\n\014memory_usage\030\003 \003(\0132\014.MemoryUsage\022$\n" +
      "\rcounter_stats\030\004 \003(\0132\r.CounterStats\022$\n\rp" +
      "olicer_stats\030\005 \003(\0132\r.PolicerStats\022=\n\032hie" +
      "rarchical_policer_stats\030\006 \003(\0132\031.Hierarch" +
      "icalPolicerStats\"<\n\013MemoryUsage\022\023\n\004name\030" +
      "\001 \002(\tB\005\202@\002\010\001\022\030\n\tallocated\030\002 \001(\004B\005\202@\002 \001\"Q" +
      "\n\014CounterStats\022\023\n\004name\030\001 \002(\tB\005\202@\002\010\001\022\026\n\007p" +
      "ackets\030\002 \001(\004B\005\202@\002\030\001\022\024\n\005bytes\030\003 \001(\004B\005\202@\002\030" +
      "\001\"\240\001\n\014PolicerStats\022\023\n\004name\030\001 \002(\tB\005\202@\002\010\001\022" +
      "\"\n\023out_of_spec_packets\030\002 \001(\004B\005\202@\002\030\001\022 \n\021o" +
      "ut_of_spec_bytes\030\003 \001(\004B\005\202@\002\030\001\0225\n\026extende" +
      "d_policer_stats\030\004 \001(\0132\025.ExtendedPolicerS" +
      "tats\"\232\001\n\024ExtendedPolicerStats\022\036\n\017offered" +
      "_packets\030\001 \001(\004B\005\202@\002\030\001\022\034\n\roffered_bytes\030\002" +
      " \001(\004B\005\202@\002\030\001\022\"\n\023transmitted_packets\030\003 \001(\004" +
      "B\005\202@\002\030\001\022 \n\021transmitted_bytes\030\004 \001(\004B\005\202@\002\030" +
      "\001\"\257\001\n\030HierarchicalPolicerStats\022\023\n\004name\030\001" +
      " \002(\tB\005\202@\002\010\001\022\036\n\017premium_packets\030\002 \001(\004B\005\202@" +
      "\002\030\001\022\034\n\rpremium_bytes\030\003 \001(\004B\005\202@\002\030\001\022 \n\021agg" +
      "regate_packets\030\004 \001(\004B\005\202@\002\030\001\022\036\n\017aggregate" +
      "_bytes\030\005 \001(\004B\005\202@\002\030\001:=\n\021jnpr_firewall_ext" +
      "\022\027.JuniperNetworksSensors\030\006 \001(\0132\t.Firewa" +
      "llB:\n8org.opennms.netmgt.telemetry.proto" +
      "cols.jti.adapter.proto"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.getDescriptor(),
        });
    internal_static_Firewall_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Firewall_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Firewall_descriptor,
        new java.lang.String[] { "FirewallStats", });
    internal_static_FirewallStats_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_FirewallStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FirewallStats_descriptor,
        new java.lang.String[] { "FilterName", "Timestamp", "MemoryUsage", "CounterStats", "PolicerStats", "HierarchicalPolicerStats", });
    internal_static_MemoryUsage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_MemoryUsage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MemoryUsage_descriptor,
        new java.lang.String[] { "Name", "Allocated", });
    internal_static_CounterStats_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_CounterStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CounterStats_descriptor,
        new java.lang.String[] { "Name", "Packets", "Bytes", });
    internal_static_PolicerStats_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_PolicerStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PolicerStats_descriptor,
        new java.lang.String[] { "Name", "OutOfSpecPackets", "OutOfSpecBytes", "ExtendedPolicerStats", });
    internal_static_ExtendedPolicerStats_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ExtendedPolicerStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ExtendedPolicerStats_descriptor,
        new java.lang.String[] { "OfferedPackets", "OfferedBytes", "TransmittedPackets", "TransmittedBytes", });
    internal_static_HierarchicalPolicerStats_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_HierarchicalPolicerStats_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HierarchicalPolicerStats_descriptor,
        new java.lang.String[] { "Name", "PremiumPackets", "PremiumBytes", "AggregatePackets", "AggregateBytes", });
    jnprFirewallExt.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.telemetryOptions);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    org.opennms.netmgt.telemetry.protocols.jti.adapter.proto.TelemetryTop.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
