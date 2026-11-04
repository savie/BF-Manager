package l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l.ۚ֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C5303 extends AbstractC9035 implements InterfaceC11268 {
    public static final C5303 DEFAULT_INSTANCE;
    public static final int DST_EXTENT_FIELD_NUMBER = 3;
    public static final InterfaceC11490 PARSER;
    public static final int SRC_EXTENT_FIELD_NUMBER = 2;
    public static final int SRC_OFFSET_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public C9776 dstExtent_;
    public byte memoizedIsInitialized;
    public C9776 srcExtent_;
    public int srcOffset_;
    public int type_;

    public /* synthetic */ C5303(C19473 c19473) {
        this((AbstractC15001) c19473);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C5303.class.getName());
        DEFAULT_INSTANCE = new C5303();
        PARSER = new C22457();
    }

    public C5303(AbstractC15001 abstractC15001) {
        super(abstractC15001);
        this.type_ = 0;
        this.srcOffset_ = 0;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C5303() {
        this.srcOffset_ = 0;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_descriptor;
    }

    @Override // l.AbstractC9035
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_fieldAccessorTable;
        c7544.m20621(C5303.class, C19473.class);
        return c7544;
    }

    @Override // l.InterfaceC11268
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC11268
    public EnumC12760 getType() {
        EnumC12760 enumC12760ForNumber = EnumC12760.forNumber(this.type_);
        return enumC12760ForNumber == null ? EnumC12760.COW_COPY : enumC12760ForNumber;
    }

    @Override // l.InterfaceC11268
    public boolean hasSrcExtent() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC11268
    public C9776 getSrcExtent() {
        C9776 c9776 = this.srcExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    @Override // l.InterfaceC11268
    public InterfaceC9031 getSrcExtentOrBuilder() {
        C9776 c9776 = this.srcExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    @Override // l.InterfaceC11268
    public boolean hasDstExtent() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC11268
    public C9776 getDstExtent() {
        C9776 c9776 = this.dstExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    @Override // l.InterfaceC11268
    public InterfaceC9031 getDstExtentOrBuilder() {
        C9776 c9776 = this.dstExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    @Override // l.InterfaceC11268
    public boolean hasSrcOffset() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC11268
    public int getSrcOffset() {
        return this.srcOffset_;
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
            abstractC14846.mo14022(1, this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14846.mo14025(2, getSrcExtent());
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC14846.mo14025(3, getDstExtent());
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC14846.mo14027(4, this.srcOffset_);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35768 = (this.bitField0_ & 1) != 0 ? AbstractC14846.m35768(1, this.type_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM35768 += AbstractC14846.m35774(2, getSrcExtent());
        }
        if ((this.bitField0_ & 4) != 0) {
            iM35768 += AbstractC14846.m35774(3, getDstExtent());
        }
        if ((this.bitField0_ & 8) != 0) {
            iM35768 += AbstractC14846.m35764(4, this.srcOffset_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35768;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5303)) {
            return super.equals(obj);
        }
        C5303 c5303 = (C5303) obj;
        if (hasType() != c5303.hasType()) {
            return false;
        }
        if ((hasType() && this.type_ != c5303.type_) || hasSrcExtent() != c5303.hasSrcExtent()) {
            return false;
        }
        if ((hasSrcExtent() && !getSrcExtent().equals(c5303.getSrcExtent())) || hasDstExtent() != c5303.hasDstExtent()) {
            return false;
        }
        if ((!hasDstExtent() || getDstExtent().equals(c5303.getDstExtent())) && hasSrcOffset() == c5303.hasSrcOffset()) {
            return (!hasSrcOffset() || getSrcOffset() == c5303.getSrcOffset()) && getUnknownFields().equals(c5303.getUnknownFields());
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
        if (hasType()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + this.type_;
        }
        if (hasSrcExtent()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + getSrcExtent().hashCode();
        }
        if (hasDstExtent()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + getDstExtent().hashCode();
        }
        if (hasSrcOffset()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + getSrcOffset();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C5303 parseFrom(ByteBuffer byteBuffer) {
        return (C5303) PARSER.parseFrom(byteBuffer);
    }

    public static C5303 parseFrom(ByteBuffer byteBuffer, C24215 c24215) {
        return (C5303) PARSER.parseFrom(byteBuffer, c24215);
    }

    public static C5303 parseFrom(AbstractC17084 abstractC17084) {
        return (C5303) PARSER.parseFrom(abstractC17084);
    }

    public static C5303 parseFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return (C5303) PARSER.parseFrom(abstractC17084, c24215);
    }

    public static C5303 parseFrom(byte[] bArr) {
        return (C5303) PARSER.parseFrom(bArr);
    }

    public static C5303 parseFrom(byte[] bArr, C24215 c24215) {
        return (C5303) PARSER.parseFrom(bArr, c24215);
    }

    public static C5303 parseFrom(InputStream inputStream) {
        return (C5303) AbstractC9035.m24127(PARSER, inputStream);
    }

    public static C5303 parseFrom(InputStream inputStream, C24215 c24215) {
        return (C5303) AbstractC9035.m24128(PARSER, inputStream, c24215);
    }

    public static C5303 parseDelimitedFrom(InputStream inputStream) {
        return (C5303) AbstractC9035.m24107(PARSER, inputStream);
    }

    public static C5303 parseDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return (C5303) AbstractC9035.m24108(PARSER, inputStream, c24215);
    }

    public static C5303 parseFrom(AbstractC3660 abstractC3660) {
        return (C5303) AbstractC9035.m24109(PARSER, abstractC3660);
    }

    public static C5303 parseFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        return (C5303) AbstractC9035.m24110(PARSER, abstractC3660, c24215);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C19473 newBuilderForType() {
        return newBuilder();
    }

    public static C19473 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C19473 newBuilder(C5303 c5303) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c5303);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C19473 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C19473(i) : new C19473(i).mergeFrom(this);
    }

    @Override // l.AbstractC19124
    public C19473 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C19473(interfaceC7937, 0);
    }

    public static C5303 getDefaultInstance() {
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
    public C5303 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
