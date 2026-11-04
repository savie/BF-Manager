package l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۙۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4797 extends AbstractC9035 implements InterfaceC10762 {
    public static final int DATA_LENGTH_FIELD_NUMBER = 3;
    public static final int DATA_OFFSET_FIELD_NUMBER = 2;
    public static final int DATA_SHA256_HASH_FIELD_NUMBER = 8;
    public static final C4797 DEFAULT_INSTANCE;
    public static final int DST_EXTENTS_FIELD_NUMBER = 6;
    public static final int DST_LENGTH_FIELD_NUMBER = 7;
    public static final InterfaceC11490 PARSER;
    public static final int SRC_EXTENTS_FIELD_NUMBER = 4;
    public static final int SRC_LENGTH_FIELD_NUMBER = 5;
    public static final int SRC_SHA256_HASH_FIELD_NUMBER = 9;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long dataLength_;
    public long dataOffset_;
    public AbstractC17084 dataSha256Hash_;
    public List dstExtents_;
    public long dstLength_;
    public byte memoizedIsInitialized;
    public List srcExtents_;
    public long srcLength_;
    public AbstractC17084 srcSha256Hash_;
    public int type_;

    public /* synthetic */ C4797(C8286 c8286) {
        this((AbstractC15001) c8286);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C4797.class.getName());
        DEFAULT_INSTANCE = new C4797();
        PARSER = new C2320();
    }

    public C4797(AbstractC15001 abstractC15001) {
        super(abstractC15001);
        this.type_ = 0;
        this.dataOffset_ = 0L;
        this.dataLength_ = 0L;
        this.srcLength_ = 0L;
        this.dstLength_ = 0L;
        AbstractC17084 abstractC17084 = AbstractC17084.f55772;
        this.dataSha256Hash_ = abstractC17084;
        this.srcSha256Hash_ = abstractC17084;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C4797() {
        this.type_ = 0;
        this.dataOffset_ = 0L;
        this.dataLength_ = 0L;
        this.srcLength_ = 0L;
        this.dstLength_ = 0L;
        AbstractC17084 abstractC17084 = AbstractC17084.f55772;
        this.dataSha256Hash_ = abstractC17084;
        this.srcSha256Hash_ = abstractC17084;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
        List list = Collections.EMPTY_LIST;
        this.srcExtents_ = list;
        this.dstExtents_ = list;
        this.dataSha256Hash_ = abstractC17084;
        this.srcSha256Hash_ = abstractC17084;
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_InstallOperation_descriptor;
    }

    @Override // l.AbstractC9035
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_InstallOperation_fieldAccessorTable;
        c7544.m20621(C4797.class, C8286.class);
        return c7544;
    }

    @Override // l.InterfaceC10762
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC10762
    public EnumC13506 getType() {
        EnumC13506 enumC13506ForNumber = EnumC13506.forNumber(this.type_);
        return enumC13506ForNumber == null ? EnumC13506.REPLACE : enumC13506ForNumber;
    }

    @Override // l.InterfaceC10762
    public boolean hasDataOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC10762
    public long getDataOffset() {
        return this.dataOffset_;
    }

    @Override // l.InterfaceC10762
    public boolean hasDataLength() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC10762
    public long getDataLength() {
        return this.dataLength_;
    }

    @Override // l.InterfaceC10762
    public List getSrcExtentsList() {
        return this.srcExtents_;
    }

    @Override // l.InterfaceC10762
    public List getSrcExtentsOrBuilderList() {
        return this.srcExtents_;
    }

    @Override // l.InterfaceC10762
    public int getSrcExtentsCount() {
        return this.srcExtents_.size();
    }

    @Override // l.InterfaceC10762
    public C9776 getSrcExtents(int i) {
        return (C9776) this.srcExtents_.get(i);
    }

    @Override // l.InterfaceC10762
    public InterfaceC9031 getSrcExtentsOrBuilder(int i) {
        return (InterfaceC9031) this.srcExtents_.get(i);
    }

    @Override // l.InterfaceC10762
    public boolean hasSrcLength() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC10762
    public long getSrcLength() {
        return this.srcLength_;
    }

    @Override // l.InterfaceC10762
    public List getDstExtentsList() {
        return this.dstExtents_;
    }

    @Override // l.InterfaceC10762
    public List getDstExtentsOrBuilderList() {
        return this.dstExtents_;
    }

    @Override // l.InterfaceC10762
    public int getDstExtentsCount() {
        return this.dstExtents_.size();
    }

    @Override // l.InterfaceC10762
    public C9776 getDstExtents(int i) {
        return (C9776) this.dstExtents_.get(i);
    }

    @Override // l.InterfaceC10762
    public InterfaceC9031 getDstExtentsOrBuilder(int i) {
        return (InterfaceC9031) this.dstExtents_.get(i);
    }

    @Override // l.InterfaceC10762
    public boolean hasDstLength() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC10762
    public long getDstLength() {
        return this.dstLength_;
    }

    @Override // l.InterfaceC10762
    public boolean hasDataSha256Hash() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC10762
    public AbstractC17084 getDataSha256Hash() {
        return this.dataSha256Hash_;
    }

    @Override // l.InterfaceC10762
    public boolean hasSrcSha256Hash() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC10762
    public AbstractC17084 getSrcSha256Hash() {
        return this.srcSha256Hash_;
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
        if (!hasType()) {
            this.memoizedIsInitialized = (byte) 0;
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
            abstractC14846.mo14023(2, this.dataOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC14846.mo14023(3, this.dataLength_);
        }
        for (int i = 0; i < this.srcExtents_.size(); i++) {
            abstractC14846.mo14025(4, (InterfaceC18775) this.srcExtents_.get(i));
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC14846.mo14023(5, this.srcLength_);
        }
        for (int i2 = 0; i2 < this.dstExtents_.size(); i2++) {
            abstractC14846.mo14025(6, (InterfaceC18775) this.dstExtents_.get(i2));
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC14846.mo14023(7, this.dstLength_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC14846.mo14008(8, this.dataSha256Hash_);
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC14846.mo14008(9, this.srcSha256Hash_);
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
            iM35768 += AbstractC14846.m35773(2, this.dataOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM35768 += AbstractC14846.m35773(3, this.dataLength_);
        }
        for (int i2 = 0; i2 < this.srcExtents_.size(); i2++) {
            iM35768 += AbstractC14846.m35774(4, (InterfaceC18775) this.srcExtents_.get(i2));
        }
        if ((this.bitField0_ & 8) != 0) {
            iM35768 += AbstractC14846.m35773(5, this.srcLength_);
        }
        for (int i3 = 0; i3 < this.dstExtents_.size(); i3++) {
            iM35768 += AbstractC14846.m35774(6, (InterfaceC18775) this.dstExtents_.get(i3));
        }
        if ((this.bitField0_ & 16) != 0) {
            iM35768 += AbstractC14846.m35773(7, this.dstLength_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM35768 += AbstractC14846.m35761(8, this.dataSha256Hash_);
        }
        if ((this.bitField0_ & 64) != 0) {
            iM35768 += AbstractC14846.m35761(9, this.srcSha256Hash_);
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
        if (!(obj instanceof C4797)) {
            return super.equals(obj);
        }
        C4797 c4797 = (C4797) obj;
        if (hasType() != c4797.hasType()) {
            return false;
        }
        if ((hasType() && this.type_ != c4797.type_) || hasDataOffset() != c4797.hasDataOffset()) {
            return false;
        }
        if ((hasDataOffset() && getDataOffset() != c4797.getDataOffset()) || hasDataLength() != c4797.hasDataLength()) {
            return false;
        }
        if ((hasDataLength() && getDataLength() != c4797.getDataLength()) || !getSrcExtentsList().equals(c4797.getSrcExtentsList()) || hasSrcLength() != c4797.hasSrcLength()) {
            return false;
        }
        if ((hasSrcLength() && getSrcLength() != c4797.getSrcLength()) || !getDstExtentsList().equals(c4797.getDstExtentsList()) || hasDstLength() != c4797.hasDstLength()) {
            return false;
        }
        if ((hasDstLength() && getDstLength() != c4797.getDstLength()) || hasDataSha256Hash() != c4797.hasDataSha256Hash()) {
            return false;
        }
        if ((!hasDataSha256Hash() || getDataSha256Hash().equals(c4797.getDataSha256Hash())) && hasSrcSha256Hash() == c4797.hasSrcSha256Hash()) {
            return (!hasSrcSha256Hash() || getSrcSha256Hash().equals(c4797.getSrcSha256Hash())) && getUnknownFields().equals(c4797.getUnknownFields());
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
        if (hasDataOffset()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + C23447.m52660(getDataOffset());
        }
        if (hasDataLength()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + C23447.m52660(getDataLength());
        }
        if (getSrcExtentsCount() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + getSrcExtentsList().hashCode();
        }
        if (hasSrcLength()) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + C23447.m52660(getSrcLength());
        }
        if (getDstExtentsCount() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 6, 53) + getDstExtentsList().hashCode();
        }
        if (hasDstLength()) {
            iHashCode = C18176.m42345(iHashCode, 37, 7, 53) + C23447.m52660(getDstLength());
        }
        if (hasDataSha256Hash()) {
            iHashCode = C18176.m42345(iHashCode, 37, 8, 53) + getDataSha256Hash().hashCode();
        }
        if (hasSrcSha256Hash()) {
            iHashCode = C18176.m42345(iHashCode, 37, 9, 53) + getSrcSha256Hash().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C4797 parseFrom(ByteBuffer byteBuffer) {
        return (C4797) PARSER.parseFrom(byteBuffer);
    }

    public static C4797 parseFrom(ByteBuffer byteBuffer, C24215 c24215) {
        return (C4797) PARSER.parseFrom(byteBuffer, c24215);
    }

    public static C4797 parseFrom(AbstractC17084 abstractC17084) {
        return (C4797) PARSER.parseFrom(abstractC17084);
    }

    public static C4797 parseFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return (C4797) PARSER.parseFrom(abstractC17084, c24215);
    }

    public static C4797 parseFrom(byte[] bArr) {
        return (C4797) PARSER.parseFrom(bArr);
    }

    public static C4797 parseFrom(byte[] bArr, C24215 c24215) {
        return (C4797) PARSER.parseFrom(bArr, c24215);
    }

    public static C4797 parseFrom(InputStream inputStream) {
        return (C4797) AbstractC9035.m24127(PARSER, inputStream);
    }

    public static C4797 parseFrom(InputStream inputStream, C24215 c24215) {
        return (C4797) AbstractC9035.m24128(PARSER, inputStream, c24215);
    }

    public static C4797 parseDelimitedFrom(InputStream inputStream) {
        return (C4797) AbstractC9035.m24107(PARSER, inputStream);
    }

    public static C4797 parseDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return (C4797) AbstractC9035.m24108(PARSER, inputStream, c24215);
    }

    public static C4797 parseFrom(AbstractC3660 abstractC3660) {
        return (C4797) AbstractC9035.m24109(PARSER, abstractC3660);
    }

    public static C4797 parseFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        return (C4797) AbstractC9035.m24110(PARSER, abstractC3660, c24215);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C8286 newBuilderForType() {
        return newBuilder();
    }

    public static C8286 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C8286 newBuilder(C4797 c4797) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c4797);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C8286 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C8286(i) : new C8286(i).mergeFrom(this);
    }

    @Override // l.AbstractC19124
    public C8286 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C8286(interfaceC7937, 0);
    }

    public static C4797 getDefaultInstance() {
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
    public C4797 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
