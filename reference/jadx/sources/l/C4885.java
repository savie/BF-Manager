package l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ۙ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4885 extends AbstractC18245 implements InterfaceC11942 {
    public static final int DATA_LENGTH_FIELD_NUMBER = 3;
    public static final int DATA_OFFSET_FIELD_NUMBER = 2;
    public static final int DATA_SHA256_HASH_FIELD_NUMBER = 8;
    public static final C4885 DEFAULT_INSTANCE;
    public static final int DST_EXTENTS_FIELD_NUMBER = 6;
    public static final int DST_LENGTH_FIELD_NUMBER = 7;
    public static final InterfaceC6271 PARSER;
    public static final int SRC_EXTENTS_FIELD_NUMBER = 4;
    public static final int SRC_LENGTH_FIELD_NUMBER = 5;
    public static final int SRC_SHA256_HASH_FIELD_NUMBER = 9;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long dataLength_;
    public long dataOffset_;
    public AbstractC23725 dataSha256Hash_;
    public List dstExtents_;
    public long dstLength_;
    public byte memoizedIsInitialized;
    public List srcExtents_;
    public long srcLength_;
    public AbstractC23725 srcSha256Hash_;
    public int type_;

    public /* synthetic */ C4885(C1669 c1669) {
        this((AbstractC0584) c1669);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C4885.class.getName());
        DEFAULT_INSTANCE = new C4885();
        PARSER = new C14371();
    }

    public C4885(AbstractC0584 abstractC0584) {
        super(abstractC0584);
        this.type_ = 0;
        this.dataOffset_ = 0L;
        this.dataLength_ = 0L;
        this.srcLength_ = 0L;
        this.dstLength_ = 0L;
        AbstractC23725 abstractC23725 = AbstractC23725.f76778;
        this.dataSha256Hash_ = abstractC23725;
        this.srcSha256Hash_ = abstractC23725;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C4885() {
        this.type_ = 0;
        this.dataOffset_ = 0L;
        this.dataLength_ = 0L;
        this.srcLength_ = 0L;
        this.dstLength_ = 0L;
        AbstractC23725 abstractC23725 = AbstractC23725.f76778;
        this.dataSha256Hash_ = abstractC23725;
        this.srcSha256Hash_ = abstractC23725;
        this.memoizedIsInitialized = (byte) -1;
        this.type_ = 0;
        List list = Collections.EMPTY_LIST;
        this.srcExtents_ = list;
        this.dstExtents_ = list;
        this.dataSha256Hash_ = abstractC23725;
        this.srcSha256Hash_ = abstractC23725;
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_InstallOperation_descriptor;
    }

    @Override // l.AbstractC18245
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_InstallOperation_fieldAccessorTable;
        c6956.m18696(C4885.class, C1669.class);
        return c6956;
    }

    @Override // l.InterfaceC11942
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC11942
    public EnumC3080 getType() {
        EnumC3080 enumC3080ForNumber = EnumC3080.forNumber(this.type_);
        return enumC3080ForNumber == null ? EnumC3080.REPLACE : enumC3080ForNumber;
    }

    @Override // l.InterfaceC11942
    public boolean hasDataOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC11942
    public long getDataOffset() {
        return this.dataOffset_;
    }

    @Override // l.InterfaceC11942
    public boolean hasDataLength() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC11942
    public long getDataLength() {
        return this.dataLength_;
    }

    @Override // l.InterfaceC11942
    public List getSrcExtentsList() {
        return this.srcExtents_;
    }

    @Override // l.InterfaceC11942
    public List getSrcExtentsOrBuilderList() {
        return this.srcExtents_;
    }

    @Override // l.InterfaceC11942
    public int getSrcExtentsCount() {
        return this.srcExtents_.size();
    }

    @Override // l.InterfaceC11942
    public C5903 getSrcExtents(int i) {
        return (C5903) this.srcExtents_.get(i);
    }

    @Override // l.InterfaceC11942
    public InterfaceC23543 getSrcExtentsOrBuilder(int i) {
        return (InterfaceC23543) this.srcExtents_.get(i);
    }

    @Override // l.InterfaceC11942
    public boolean hasSrcLength() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC11942
    public long getSrcLength() {
        return this.srcLength_;
    }

    @Override // l.InterfaceC11942
    public List getDstExtentsList() {
        return this.dstExtents_;
    }

    @Override // l.InterfaceC11942
    public List getDstExtentsOrBuilderList() {
        return this.dstExtents_;
    }

    @Override // l.InterfaceC11942
    public int getDstExtentsCount() {
        return this.dstExtents_.size();
    }

    @Override // l.InterfaceC11942
    public C5903 getDstExtents(int i) {
        return (C5903) this.dstExtents_.get(i);
    }

    @Override // l.InterfaceC11942
    public InterfaceC23543 getDstExtentsOrBuilder(int i) {
        return (InterfaceC23543) this.dstExtents_.get(i);
    }

    @Override // l.InterfaceC11942
    public boolean hasDstLength() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC11942
    public long getDstLength() {
        return this.dstLength_;
    }

    @Override // l.InterfaceC11942
    public boolean hasDataSha256Hash() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC11942
    public AbstractC23725 getDataSha256Hash() {
        return this.dataSha256Hash_;
    }

    @Override // l.InterfaceC11942
    public boolean hasSrcSha256Hash() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC11942
    public AbstractC23725 getSrcSha256Hash() {
        return this.srcSha256Hash_;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC15445
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

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public void writeTo(AbstractC22044 abstractC22044) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC22044.mo14252(1, this.type_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC22044.mo14253(2, this.dataOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC22044.mo14253(3, this.dataLength_);
        }
        for (int i = 0; i < this.srcExtents_.size(); i++) {
            abstractC22044.mo14254(4, (InterfaceC23206) this.srcExtents_.get(i));
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC22044.mo14253(5, this.srcLength_);
        }
        for (int i2 = 0; i2 < this.dstExtents_.size(); i2++) {
            abstractC22044.mo14254(6, (InterfaceC23206) this.dstExtents_.get(i2));
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC22044.mo14253(7, this.dstLength_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC22044.mo14239(8, this.dataSha256Hash_);
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC22044.mo14239(9, this.srcSha256Hash_);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48966 = (this.bitField0_ & 1) != 0 ? AbstractC22044.m48966(1, this.type_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM48966 += AbstractC22044.m48962(2, this.dataOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM48966 += AbstractC22044.m48962(3, this.dataLength_);
        }
        for (int i2 = 0; i2 < this.srcExtents_.size(); i2++) {
            iM48966 += AbstractC22044.m48963(4, (InterfaceC23206) this.srcExtents_.get(i2));
        }
        if ((this.bitField0_ & 8) != 0) {
            iM48966 += AbstractC22044.m48962(5, this.srcLength_);
        }
        for (int i3 = 0; i3 < this.dstExtents_.size(); i3++) {
            iM48966 += AbstractC22044.m48963(6, (InterfaceC23206) this.dstExtents_.get(i3));
        }
        if ((this.bitField0_ & 16) != 0) {
            iM48966 += AbstractC22044.m48962(7, this.dstLength_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM48966 += AbstractC22044.m48968(8, this.dataSha256Hash_);
        }
        if ((this.bitField0_ & 64) != 0) {
            iM48966 += AbstractC22044.m48968(9, this.srcSha256Hash_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48966;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4885)) {
            return super.equals(obj);
        }
        C4885 c4885 = (C4885) obj;
        if (hasType() != c4885.hasType()) {
            return false;
        }
        if ((hasType() && this.type_ != c4885.type_) || hasDataOffset() != c4885.hasDataOffset()) {
            return false;
        }
        if ((hasDataOffset() && getDataOffset() != c4885.getDataOffset()) || hasDataLength() != c4885.hasDataLength()) {
            return false;
        }
        if ((hasDataLength() && getDataLength() != c4885.getDataLength()) || !getSrcExtentsList().equals(c4885.getSrcExtentsList()) || hasSrcLength() != c4885.hasSrcLength()) {
            return false;
        }
        if ((hasSrcLength() && getSrcLength() != c4885.getSrcLength()) || !getDstExtentsList().equals(c4885.getDstExtentsList()) || hasDstLength() != c4885.hasDstLength()) {
            return false;
        }
        if ((hasDstLength() && getDstLength() != c4885.getDstLength()) || hasDataSha256Hash() != c4885.hasDataSha256Hash()) {
            return false;
        }
        if ((!hasDataSha256Hash() || getDataSha256Hash().equals(c4885.getDataSha256Hash())) && hasSrcSha256Hash() == c4885.hasSrcSha256Hash()) {
            return (!hasSrcSha256Hash() || getSrcSha256Hash().equals(c4885.getSrcSha256Hash())) && getUnknownFields().equals(c4885.getUnknownFields());
        }
        return false;
    }

    @Override // l.AbstractC23019
    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = getDescriptor().hashCode() + 779;
        if (hasType()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + this.type_;
        }
        if (hasDataOffset()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + C9779.m24887(getDataOffset());
        }
        if (hasDataLength()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + C9779.m24887(getDataLength());
        }
        if (getSrcExtentsCount() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + getSrcExtentsList().hashCode();
        }
        if (hasSrcLength()) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + C9779.m24887(getSrcLength());
        }
        if (getDstExtentsCount() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 6, 53) + getDstExtentsList().hashCode();
        }
        if (hasDstLength()) {
            iHashCode = C17922.m41614(iHashCode, 37, 7, 53) + C9779.m24887(getDstLength());
        }
        if (hasDataSha256Hash()) {
            iHashCode = C17922.m41614(iHashCode, 37, 8, 53) + getDataSha256Hash().hashCode();
        }
        if (hasSrcSha256Hash()) {
            iHashCode = C17922.m41614(iHashCode, 37, 9, 53) + getSrcSha256Hash().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C4885 parseFrom(ByteBuffer byteBuffer) {
        return (C4885) PARSER.parseFrom(byteBuffer);
    }

    public static C4885 parseFrom(ByteBuffer byteBuffer, C2701 c2701) {
        return (C4885) PARSER.parseFrom(byteBuffer, c2701);
    }

    public static C4885 parseFrom(AbstractC23725 abstractC23725) {
        return (C4885) PARSER.parseFrom(abstractC23725);
    }

    public static C4885 parseFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return (C4885) PARSER.parseFrom(abstractC23725, c2701);
    }

    public static C4885 parseFrom(byte[] bArr) {
        return (C4885) PARSER.parseFrom(bArr);
    }

    public static C4885 parseFrom(byte[] bArr, C2701 c2701) {
        return (C4885) PARSER.parseFrom(bArr, c2701);
    }

    public static C4885 parseFrom(InputStream inputStream) {
        return (C4885) AbstractC18245.m42418(PARSER, inputStream);
    }

    public static C4885 parseFrom(InputStream inputStream, C2701 c2701) {
        return (C4885) AbstractC18245.m42419(PARSER, inputStream, c2701);
    }

    public static C4885 parseDelimitedFrom(InputStream inputStream) {
        return (C4885) AbstractC18245.m42395(PARSER, inputStream);
    }

    public static C4885 parseDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return (C4885) AbstractC18245.m42396(PARSER, inputStream, c2701);
    }

    public static C4885 parseFrom(AbstractC3262 abstractC3262) {
        return (C4885) AbstractC18245.m42397(PARSER, abstractC3262);
    }

    public static C4885 parseFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        return (C4885) AbstractC18245.m42398(PARSER, abstractC3262, c2701);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C1669 newBuilderForType() {
        return newBuilder();
    }

    public static C1669 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C1669 newBuilder(C4885 c4885) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c4885);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C1669 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C1669(i) : new C1669(i).mergeFrom(this);
    }

    @Override // l.AbstractC23019
    public C1669 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C1669(interfaceC6790, 0);
    }

    public static C4885 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static InterfaceC6271 parser() {
        return PARSER;
    }

    @Override // l.AbstractC18245, l.InterfaceC23206
    public InterfaceC6271 getParserForType() {
        return PARSER;
    }

    @Override // l.AbstractC23019, l.InterfaceC15445, l.InterfaceC18266
    public C4885 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
