// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: http_client.proto

package com.snowcattle.game.message.protogenerate.http.room.client;

public final class GameRoomHttpClientProBuf {
	private static final com.google.protobuf.Descriptors.Descriptor
			internal_static_RoomHeartHttpClientProBuf_descriptor;
	private static final
	com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
			internal_static_RoomHeartHttpClientProBuf_fieldAccessorTable;
	private static com.google.protobuf.Descriptors.FileDescriptor
			descriptor;

	static {
		java.lang.String[] descriptorData = {
				"\n\021http_client.proto\032\014common.proto\"\033\n\031Roo" +
						"mHeartHttpClientProBufBV\n:com.snowcattle" +
						".game.message.protogenerate.http.room.cl" +
						"ientB\030GameRoomHttpClientProBuf"
		};
		com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
				new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
					public com.google.protobuf.ExtensionRegistry assignDescriptors(
							com.google.protobuf.Descriptors.FileDescriptor root) {
						descriptor = root;
						return null;
					}
				};
		com.google.protobuf.Descriptors.FileDescriptor
				.internalBuildGeneratedFileFrom(descriptorData,
						new com.google.protobuf.Descriptors.FileDescriptor[]{
								com.snowcattle.game.message.protogenerate.common.GameCommonMessageProBuf.getDescriptor(),
						}, assigner);
		internal_static_RoomHeartHttpClientProBuf_descriptor =
				getDescriptor().getMessageTypes().get(0);
		internal_static_RoomHeartHttpClientProBuf_fieldAccessorTable = new
				com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
				internal_static_RoomHeartHttpClientProBuf_descriptor,
				new java.lang.String[]{});
		com.snowcattle.game.message.protogenerate.common.GameCommonMessageProBuf.getDescriptor();
	}

	private GameRoomHttpClientProBuf() {
	}

	public static void registerAllExtensions(
			com.google.protobuf.ExtensionRegistryLite registry) {
	}

	public static void registerAllExtensions(
			com.google.protobuf.ExtensionRegistry registry) {
		registerAllExtensions(
				(com.google.protobuf.ExtensionRegistryLite) registry);
	}

	public static com.google.protobuf.Descriptors.FileDescriptor
	getDescriptor() {
		return descriptor;
	}

	public interface RoomHeartHttpClientProBufOrBuilder extends
			// @@protoc_insertion_point(interface_extends:RoomHeartHttpClientProBuf)
			com.google.protobuf.MessageOrBuilder {
	}

	/**
	 * <pre>
	 * 心跳协议
	 * </pre>
	 *
	 * Protobuf type {@code RoomHeartHttpClientProBuf}
	 */
	public static final class RoomHeartHttpClientProBuf extends
			com.google.protobuf.GeneratedMessageV3 implements
			// @@protoc_insertion_point(message_implements:RoomHeartHttpClientProBuf)
			RoomHeartHttpClientProBufOrBuilder {
		@java.lang.Deprecated
		public static final com.google.protobuf.Parser<RoomHeartHttpClientProBuf>
				PARSER = new com.google.protobuf.AbstractParser<RoomHeartHttpClientProBuf>() {
			public RoomHeartHttpClientProBuf parsePartialFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws com.google.protobuf.InvalidProtocolBufferException {
				return new RoomHeartHttpClientProBuf(input, extensionRegistry);
			}
		};
		private static final long serialVersionUID = 0L;
		// @@protoc_insertion_point(class_scope:RoomHeartHttpClientProBuf)
		private static final com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf DEFAULT_INSTANCE;

		static {
			DEFAULT_INSTANCE = new com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf();
		}

		private byte memoizedIsInitialized = -1;

		// Use RoomHeartHttpClientProBuf.newBuilder() to construct.
		private RoomHeartHttpClientProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
			super(builder);
		}

		private RoomHeartHttpClientProBuf() {
		}

		private RoomHeartHttpClientProBuf(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			this();
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
						default: {
							if (!parseUnknownField(input, unknownFields,
									extensionRegistry, tag)) {
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
			return com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.internal_static_RoomHeartHttpClientProBuf_descriptor;
		}

		public static com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf parseFrom(
				com.google.protobuf.ByteString data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf parseFrom(
				com.google.protobuf.ByteString data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf parseFrom(byte[] data)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data);
		}

		public static com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf parseFrom(
				byte[] data,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return PARSER.parseFrom(data, extensionRegistry);
		}

		public static com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf parseFrom(java.io.InputStream input)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseWithIOException(PARSER, input);
		}

		public static com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf parseFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public static com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf parseDelimitedFrom(java.io.InputStream input)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseDelimitedWithIOException(PARSER, input);
		}

		public static com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf parseDelimitedFrom(
				java.io.InputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
		}

		public static com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf parseFrom(
				com.google.protobuf.CodedInputStream input)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseWithIOException(PARSER, input);
		}

		public static com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf parseFrom(
				com.google.protobuf.CodedInputStream input,
				com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws java.io.IOException {
			return com.google.protobuf.GeneratedMessageV3
					.parseWithIOException(PARSER, input, extensionRegistry);
		}

		public static Builder newBuilder() {
			return DEFAULT_INSTANCE.toBuilder();
		}

		public static Builder newBuilder(com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf prototype) {
			return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
		}

		public static com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf getDefaultInstance() {
			return DEFAULT_INSTANCE;
		}

		public static com.google.protobuf.Parser<RoomHeartHttpClientProBuf> parser() {
			return PARSER;
		}

		@java.lang.Override
		public final com.google.protobuf.UnknownFieldSet
		getUnknownFields() {
			return this.unknownFields;
		}

		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
		internalGetFieldAccessorTable() {
			return com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.internal_static_RoomHeartHttpClientProBuf_fieldAccessorTable
					.ensureFieldAccessorsInitialized(
							com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf.class, com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf.Builder.class);
		}

		public final boolean isInitialized() {
			byte isInitialized = memoizedIsInitialized;
			if (isInitialized == 1) return true;
			if (isInitialized == 0) return false;

			memoizedIsInitialized = 1;
			return true;
		}

		public void writeTo(com.google.protobuf.CodedOutputStream output)
				throws java.io.IOException {
			unknownFields.writeTo(output);
		}

		public int getSerializedSize() {
			int size = memoizedSize;
			if (size != -1) return size;

			size = 0;
			size += unknownFields.getSerializedSize();
			memoizedSize = size;
			return size;
		}

		@java.lang.Override
		public boolean equals(final java.lang.Object obj) {
			if (obj == this) {
				return true;
			}
			if (!(obj instanceof com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf)) {
				return super.equals(obj);
			}
			com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf other = (com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf) obj;

			boolean result = true;
			result = result && unknownFields.equals(other.unknownFields);
			return result;
		}

		@java.lang.Override
		public int hashCode() {
			if (memoizedHashCode != 0) {
				return memoizedHashCode;
			}
			int hash = 41;
			hash = (19 * hash) + getDescriptor().hashCode();
			hash = (29 * hash) + unknownFields.hashCode();
			memoizedHashCode = hash;
			return hash;
		}

		public Builder newBuilderForType() {
			return newBuilder();
		}

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

		@java.lang.Override
		public com.google.protobuf.Parser<RoomHeartHttpClientProBuf> getParserForType() {
			return PARSER;
		}

		public com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf getDefaultInstanceForType() {
			return DEFAULT_INSTANCE;
		}

		/**
		 * <pre>
		 * 心跳协议
		 * </pre>
		 *
		 * Protobuf type {@code RoomHeartHttpClientProBuf}
		 */
		public static final class Builder extends
				com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
				// @@protoc_insertion_point(builder_implements:RoomHeartHttpClientProBuf)
				com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBufOrBuilder {
			// Construct using com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf.newBuilder()
			private Builder() {
				maybeForceBuilderInitialization();
			}

			private Builder(
					com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
				super(parent);
				maybeForceBuilderInitialization();
			}

			public static final com.google.protobuf.Descriptors.Descriptor
			getDescriptor() {
				return com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.internal_static_RoomHeartHttpClientProBuf_descriptor;
			}

			protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
			internalGetFieldAccessorTable() {
				return com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.internal_static_RoomHeartHttpClientProBuf_fieldAccessorTable
						.ensureFieldAccessorsInitialized(
								com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf.class, com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf.Builder.class);
			}

			private void maybeForceBuilderInitialization() {
				if (com.google.protobuf.GeneratedMessageV3
						.alwaysUseFieldBuilders) {
				}
			}

			public Builder clear() {
				super.clear();
				return this;
			}

			public com.google.protobuf.Descriptors.Descriptor
			getDescriptorForType() {
				return com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.internal_static_RoomHeartHttpClientProBuf_descriptor;
			}

			public com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf getDefaultInstanceForType() {
				return com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf.getDefaultInstance();
			}

			public com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf build() {
				com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf result = buildPartial();
				if (!result.isInitialized()) {
					throw newUninitializedMessageException(result);
				}
				return result;
			}

			public com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf buildPartial() {
				com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf result = new com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf(this);
				onBuilt();
				return result;
			}

			public Builder clone() {
				return (Builder) super.clone();
			}

			public Builder setField(
					com.google.protobuf.Descriptors.FieldDescriptor field,
					Object value) {
				return (Builder) super.setField(field, value);
			}

			public Builder clearField(
					com.google.protobuf.Descriptors.FieldDescriptor field) {
				return (Builder) super.clearField(field);
			}

			public Builder clearOneof(
					com.google.protobuf.Descriptors.OneofDescriptor oneof) {
				return (Builder) super.clearOneof(oneof);
			}

			public Builder setRepeatedField(
					com.google.protobuf.Descriptors.FieldDescriptor field,
					int index, Object value) {
				return (Builder) super.setRepeatedField(field, index, value);
			}

			public Builder addRepeatedField(
					com.google.protobuf.Descriptors.FieldDescriptor field,
					Object value) {
				return (Builder) super.addRepeatedField(field, value);
			}

			public Builder mergeFrom(com.google.protobuf.Message other) {
				if (other instanceof com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf) {
					return mergeFrom((com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf) other);
				} else {
					super.mergeFrom(other);
					return this;
				}
			}

			public Builder mergeFrom(com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf other) {
				if (other == com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf.getDefaultInstance())
					return this;
				this.mergeUnknownFields(other.unknownFields);
				onChanged();
				return this;
			}

			public final boolean isInitialized() {
				return true;
			}

			public Builder mergeFrom(
					com.google.protobuf.CodedInputStream input,
					com.google.protobuf.ExtensionRegistryLite extensionRegistry)
					throws java.io.IOException {
				com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf parsedMessage = null;
				try {
					parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
				} catch (com.google.protobuf.InvalidProtocolBufferException e) {
					parsedMessage = (com.snowcattle.game.message.protogenerate.http.room.client.GameRoomHttpClientProBuf.RoomHeartHttpClientProBuf) e.getUnfinishedMessage();
					throw e.unwrapIOException();
				} finally {
					if (parsedMessage != null) {
						mergeFrom(parsedMessage);
					}
				}
				return this;
			}

			public final Builder setUnknownFields(
					final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.setUnknownFields(unknownFields);
			}

			public final Builder mergeUnknownFields(
					final com.google.protobuf.UnknownFieldSet unknownFields) {
				return super.mergeUnknownFields(unknownFields);
			}


			// @@protoc_insertion_point(builder_scope:RoomHeartHttpClientProBuf)
		}

	}

	// @@protoc_insertion_point(outer_class_scope)
}
