package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۘۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4051 extends AbstractC9035 implements InterfaceC21205 {
    public static final int BATCH_WRITES_FIELD_NUMBER = 2;
    public static final C4051 DEFAULT_INSTANCE;
    public static final InterfaceC11490 PARSER;
    public static final int THREADED_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public boolean batchWrites_;
    public int bitField0_;
    public byte memoizedIsInitialized;
    public boolean threaded_;

    public /* synthetic */ C4051(C24189 c24189) {
        this((AbstractC15001) c24189);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C4051.class.getName());
        DEFAULT_INSTANCE = new C4051();
        PARSER = new C6289();
    }

    public C4051(AbstractC15001 abstractC15001) {
        super(abstractC15001);
        this.threaded_ = false;
        this.batchWrites_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C4051() {
        this.threaded_ = false;
        this.batchWrites_ = false;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_descriptor;
    }

    @Override // l.AbstractC9035
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_fieldAccessorTable;
        c7544.m20621(C4051.class, C24189.class);
        return c7544;
    }

    @Override // l.InterfaceC21205
    public boolean hasThreaded() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC21205
    public boolean getThreaded() {
        return this.threaded_;
    }

    @Override // l.InterfaceC21205
    public boolean hasBatchWrites() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC21205
    public boolean getBatchWrites() {
        return this.batchWrites_;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC9824
    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public void writeTo(AbstractC14846 abstractC14846) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC14846.mo14010(1, this.threaded_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14846.mo14010(2, this.batchWrites_);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35772 = (this.bitField0_ & 1) != 0 ? AbstractC14846.m35772(1) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM35772 += AbstractC14846.m35772(2);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35772;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4051)) {
            return super.equals(obj);
        }
        C4051 c4051 = (C4051) obj;
        if (hasThreaded() != c4051.hasThreaded()) {
            return false;
        }
        if ((!hasThreaded() || getThreaded() == c4051.getThreaded()) && hasBatchWrites() == c4051.hasBatchWrites()) {
            return (!hasBatchWrites() || getBatchWrites() == c4051.getBatchWrites()) && getUnknownFields().equals(c4051.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC19124
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasThreaded()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + C23447.m52661(getThreaded());
        }
        if (hasBatchWrites()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + C23447.m52661(getBatchWrites());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C4051 parseFrom(ByteBuffer byteBuffer) {
        return (C4051) PARSER.parseFrom(byteBuffer);
    }

    public static C4051 parseFrom(ByteBuffer byteBuffer, C24215 c24215) {
        return (C4051) PARSER.parseFrom(byteBuffer, c24215);
    }

    public static C4051 parseFrom(AbstractC17084 abstractC17084) {
        return (C4051) PARSER.parseFrom(abstractC17084);
    }

    public static C4051 parseFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return (C4051) PARSER.parseFrom(abstractC17084, c24215);
    }

    public static C4051 parseFrom(byte[] bArr) {
        return (C4051) PARSER.parseFrom(bArr);
    }

    public static C4051 parseFrom(byte[] bArr, C24215 c24215) {
        return (C4051) PARSER.parseFrom(bArr, c24215);
    }

    public static C4051 parseFrom(InputStream inputStream) {
        return (C4051) AbstractC9035.m24127(PARSER, inputStream);
    }

    public static C4051 parseFrom(InputStream inputStream, C24215 c24215) {
        return (C4051) AbstractC9035.m24128(PARSER, inputStream, c24215);
    }

    public static C4051 parseDelimitedFrom(InputStream inputStream) {
        return (C4051) AbstractC9035.m24107(PARSER, inputStream);
    }

    public static C4051 parseDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return (C4051) AbstractC9035.m24108(PARSER, inputStream, c24215);
    }

    public static C4051 parseFrom(AbstractC3660 abstractC3660) {
        return (C4051) AbstractC9035.m24109(PARSER, abstractC3660);
    }

    public static C4051 parseFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        return (C4051) AbstractC9035.m24110(PARSER, abstractC3660, c24215);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C24189 newBuilderForType() {
        return newBuilder();
    }

    public static C24189 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C24189 newBuilder(C4051 c4051) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c4051);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C24189 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C24189(i) : new C24189(i).mergeFrom(this);
    }

    @Override // l.AbstractC19124
    public C24189 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C24189(interfaceC7937, 0);
    }

    public static C4051 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static InterfaceC11490 parser() {
        return PARSER;
    }

    @Override // l.AbstractC9035, l.InterfaceC18775
    public InterfaceC11490 getParserForType() {
        return PARSER;
    }

    @Override // l.AbstractC19124, l.InterfaceC9824
    public C4051 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
