package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۢ֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C9776 extends AbstractC9035 implements InterfaceC9031 {
    public static final C9776 DEFAULT_INSTANCE;
    public static final int NUM_BLOCKS_FIELD_NUMBER = 2;
    public static final InterfaceC11490 PARSER;
    public static final int START_BLOCK_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public byte memoizedIsInitialized;
    public long numBlocks_;
    public long startBlock_;

    public /* synthetic */ C9776(C18727 c18727) {
        this((AbstractC15001) c18727);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C9776.class.getName());
        DEFAULT_INSTANCE = new C9776();
        PARSER = new C7540();
    }

    public C9776(AbstractC15001 abstractC15001) {
        super(abstractC15001);
        this.startBlock_ = 0L;
        this.numBlocks_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C9776() {
        this.startBlock_ = 0L;
        this.numBlocks_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_Extent_descriptor;
    }

    @Override // l.AbstractC9035
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_Extent_fieldAccessorTable;
        c7544.m20621(C9776.class, C18727.class);
        return c7544;
    }

    @Override // l.InterfaceC9031
    public boolean hasStartBlock() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC9031
    public long getStartBlock() {
        return this.startBlock_;
    }

    @Override // l.InterfaceC9031
    public boolean hasNumBlocks() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC9031
    public long getNumBlocks() {
        return this.numBlocks_;
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
            abstractC14846.mo14023(1, this.startBlock_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14846.mo14023(2, this.numBlocks_);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35773 = (this.bitField0_ & 1) != 0 ? AbstractC14846.m35773(1, this.startBlock_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM35773 += AbstractC14846.m35773(2, this.numBlocks_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35773;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9776)) {
            return super.equals(obj);
        }
        C9776 c9776 = (C9776) obj;
        if (hasStartBlock() != c9776.hasStartBlock()) {
            return false;
        }
        if ((!hasStartBlock() || getStartBlock() == c9776.getStartBlock()) && hasNumBlocks() == c9776.hasNumBlocks()) {
            return (!hasNumBlocks() || getNumBlocks() == c9776.getNumBlocks()) && getUnknownFields().equals(c9776.getUnknownFields());
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
        if (hasStartBlock()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + C23447.m52660(getStartBlock());
        }
        if (hasNumBlocks()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + C23447.m52660(getNumBlocks());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C9776 parseFrom(ByteBuffer byteBuffer) {
        return (C9776) PARSER.parseFrom(byteBuffer);
    }

    public static C9776 parseFrom(ByteBuffer byteBuffer, C24215 c24215) {
        return (C9776) PARSER.parseFrom(byteBuffer, c24215);
    }

    public static C9776 parseFrom(AbstractC17084 abstractC17084) {
        return (C9776) PARSER.parseFrom(abstractC17084);
    }

    public static C9776 parseFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return (C9776) PARSER.parseFrom(abstractC17084, c24215);
    }

    public static C9776 parseFrom(byte[] bArr) {
        return (C9776) PARSER.parseFrom(bArr);
    }

    public static C9776 parseFrom(byte[] bArr, C24215 c24215) {
        return (C9776) PARSER.parseFrom(bArr, c24215);
    }

    public static C9776 parseFrom(InputStream inputStream) {
        return (C9776) AbstractC9035.m24127(PARSER, inputStream);
    }

    public static C9776 parseFrom(InputStream inputStream, C24215 c24215) {
        return (C9776) AbstractC9035.m24128(PARSER, inputStream, c24215);
    }

    public static C9776 parseDelimitedFrom(InputStream inputStream) {
        return (C9776) AbstractC9035.m24107(PARSER, inputStream);
    }

    public static C9776 parseDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return (C9776) AbstractC9035.m24108(PARSER, inputStream, c24215);
    }

    public static C9776 parseFrom(AbstractC3660 abstractC3660) {
        return (C9776) AbstractC9035.m24109(PARSER, abstractC3660);
    }

    public static C9776 parseFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        return (C9776) AbstractC9035.m24110(PARSER, abstractC3660, c24215);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C18727 newBuilderForType() {
        return newBuilder();
    }

    public static C18727 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C18727 newBuilder(C9776 c9776) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c9776);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C18727 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C18727(i) : new C18727(i).mergeFrom(this);
    }

    @Override // l.AbstractC19124
    public C18727 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C18727(interfaceC7937, 0);
    }

    public static C9776 getDefaultInstance() {
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
    public C9776 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
