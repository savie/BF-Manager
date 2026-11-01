package l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩸۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C21425 extends AbstractC18245 implements InterfaceC18603 {
    public static final int APEX_INFO_FIELD_NUMBER = 17;
    public static final int BLOCK_SIZE_FIELD_NUMBER = 3;
    public static final C21425 DEFAULT_INSTANCE;
    public static final int DYNAMIC_PARTITION_METADATA_FIELD_NUMBER = 15;
    public static final int MAX_TIMESTAMP_FIELD_NUMBER = 14;
    public static final int MINOR_VERSION_FIELD_NUMBER = 12;
    public static final InterfaceC6271 PARSER;
    public static final int PARTIAL_UPDATE_FIELD_NUMBER = 16;
    public static final int PARTITIONS_FIELD_NUMBER = 13;
    public static final int SECURITY_PATCH_LEVEL_FIELD_NUMBER = 18;
    public static final int SIGNATURES_OFFSET_FIELD_NUMBER = 4;
    public static final int SIGNATURES_SIZE_FIELD_NUMBER = 5;
    public static final long serialVersionUID = 0;
    public List apexInfo_;
    public int bitField0_;
    public int blockSize_;
    public C20015 dynamicPartitionMetadata_;
    public long maxTimestamp_;
    public byte memoizedIsInitialized;
    public int minorVersion_;
    public boolean partialUpdate_;
    public List partitions_;
    public volatile Object securityPatchLevel_;
    public long signaturesOffset_;
    public long signaturesSize_;

    public /* synthetic */ C21425(C15076 c15076) {
        this((AbstractC0584) c15076);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C21425.class.getName());
        DEFAULT_INSTANCE = new C21425();
        PARSER = new C22837();
    }

    public C21425(AbstractC0584 abstractC0584) {
        super(abstractC0584);
        this.blockSize_ = 4096;
        this.signaturesOffset_ = 0L;
        this.signaturesSize_ = 0L;
        this.minorVersion_ = 0;
        this.maxTimestamp_ = 0L;
        this.partialUpdate_ = false;
        this.securityPatchLevel_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public C21425() {
        this.blockSize_ = 4096;
        this.signaturesOffset_ = 0L;
        this.signaturesSize_ = 0L;
        this.minorVersion_ = 0;
        this.maxTimestamp_ = 0L;
        this.partialUpdate_ = false;
        this.securityPatchLevel_ = "";
        this.memoizedIsInitialized = (byte) -1;
        this.blockSize_ = 4096;
        List list = Collections.EMPTY_LIST;
        this.partitions_ = list;
        this.apexInfo_ = list;
        this.securityPatchLevel_ = "";
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_descriptor;
    }

    @Override // l.AbstractC18245
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_fieldAccessorTable;
        c6956.m18696(C21425.class, C15076.class);
        return c6956;
    }

    @Override // l.InterfaceC18603
    public boolean hasBlockSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC18603
    public int getBlockSize() {
        return this.blockSize_;
    }

    @Override // l.InterfaceC18603
    public boolean hasSignaturesOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC18603
    public long getSignaturesOffset() {
        return this.signaturesOffset_;
    }

    @Override // l.InterfaceC18603
    public boolean hasSignaturesSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC18603
    public long getSignaturesSize() {
        return this.signaturesSize_;
    }

    @Override // l.InterfaceC18603
    public boolean hasMinorVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC18603
    public int getMinorVersion() {
        return this.minorVersion_;
    }

    @Override // l.InterfaceC18603
    public List getPartitionsList() {
        return this.partitions_;
    }

    @Override // l.InterfaceC18603
    public List getPartitionsOrBuilderList() {
        return this.partitions_;
    }

    @Override // l.InterfaceC18603
    public int getPartitionsCount() {
        return this.partitions_.size();
    }

    @Override // l.InterfaceC18603
    public C23231 getPartitions(int i) {
        return (C23231) this.partitions_.get(i);
    }

    @Override // l.InterfaceC18603
    public InterfaceC21819 getPartitionsOrBuilder(int i) {
        return (InterfaceC21819) this.partitions_.get(i);
    }

    @Override // l.InterfaceC18603
    public boolean hasMaxTimestamp() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC18603
    public long getMaxTimestamp() {
        return this.maxTimestamp_;
    }

    @Override // l.InterfaceC18603
    public boolean hasDynamicPartitionMetadata() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC18603
    public C20015 getDynamicPartitionMetadata() {
        C20015 c20015 = this.dynamicPartitionMetadata_;
        return c20015 == null ? C20015.getDefaultInstance() : c20015;
    }

    @Override // l.InterfaceC18603
    public InterfaceC16487 getDynamicPartitionMetadataOrBuilder() {
        C20015 c20015 = this.dynamicPartitionMetadata_;
        return c20015 == null ? C20015.getDefaultInstance() : c20015;
    }

    @Override // l.InterfaceC18603
    public boolean hasPartialUpdate() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC18603
    public boolean getPartialUpdate() {
        return this.partialUpdate_;
    }

    @Override // l.InterfaceC18603
    public List getApexInfoList() {
        return this.apexInfo_;
    }

    @Override // l.InterfaceC18603
    public List getApexInfoOrBuilderList() {
        return this.apexInfo_;
    }

    @Override // l.InterfaceC18603
    public int getApexInfoCount() {
        return this.apexInfo_.size();
    }

    @Override // l.InterfaceC18603
    public C4491 getApexInfo(int i) {
        return (C4491) this.apexInfo_.get(i);
    }

    @Override // l.InterfaceC18603
    public InterfaceC11548 getApexInfoOrBuilder(int i) {
        return (InterfaceC11548) this.apexInfo_.get(i);
    }

    @Override // l.InterfaceC18603
    public boolean hasSecurityPatchLevel() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // l.InterfaceC18603
    public String getSecurityPatchLevel() {
        Object obj = this.securityPatchLevel_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.securityPatchLevel_ = strM52260;
        }
        return strM52260;
    }

    @Override // l.InterfaceC18603
    public AbstractC23725 getSecurityPatchLevelBytes() {
        Object obj = this.securityPatchLevel_;
        if (obj instanceof String) {
            AbstractC23725 abstractC23725M52256 = AbstractC23725.m52256((String) obj);
            this.securityPatchLevel_ = abstractC23725M52256;
            return abstractC23725M52256;
        }
        return (AbstractC23725) obj;
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
        for (int i = 0; i < getPartitionsCount(); i++) {
            if (!getPartitions(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        if (hasDynamicPartitionMetadata() && !getDynamicPartitionMetadata().isInitialized()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public void writeTo(AbstractC22044 abstractC22044) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC22044.mo14231(3, this.blockSize_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC22044.mo14253(4, this.signaturesOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC22044.mo14253(5, this.signaturesSize_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC22044.mo14231(12, this.minorVersion_);
        }
        for (int i = 0; i < this.partitions_.size(); i++) {
            abstractC22044.mo14254(13, (InterfaceC23206) this.partitions_.get(i));
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC22044.mo14253(14, this.maxTimestamp_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC22044.mo14254(15, getDynamicPartitionMetadata());
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC22044.mo14240(16, this.partialUpdate_);
        }
        for (int i2 = 0; i2 < this.apexInfo_.size(); i2++) {
            abstractC22044.mo14254(17, (InterfaceC23206) this.apexInfo_.get(i2));
        }
        if ((this.bitField0_ & 128) != 0) {
            AbstractC18245.m42405(abstractC22044, 18, this.securityPatchLevel_);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM48960 = (this.bitField0_ & 1) != 0 ? AbstractC22044.m48960(3, this.blockSize_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM48960 += AbstractC22044.m48962(4, this.signaturesOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM48960 += AbstractC22044.m48962(5, this.signaturesSize_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM48960 += AbstractC22044.m48960(12, this.minorVersion_);
        }
        for (int i2 = 0; i2 < this.partitions_.size(); i2++) {
            iM48960 += AbstractC22044.m48963(13, (InterfaceC23206) this.partitions_.get(i2));
        }
        if ((this.bitField0_ & 16) != 0) {
            iM48960 += AbstractC22044.m48967(14, this.maxTimestamp_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM48960 += AbstractC22044.m48963(15, getDynamicPartitionMetadata());
        }
        if ((this.bitField0_ & 64) != 0) {
            iM48960 += AbstractC22044.m48961(16);
        }
        for (int i3 = 0; i3 < this.apexInfo_.size(); i3++) {
            iM48960 += AbstractC22044.m48963(17, (InterfaceC23206) this.apexInfo_.get(i3));
        }
        if ((this.bitField0_ & 128) != 0) {
            iM48960 += AbstractC18245.m42390(18, this.securityPatchLevel_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM48960;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C21425)) {
            return super.equals(obj);
        }
        C21425 c21425 = (C21425) obj;
        if (hasBlockSize() != c21425.hasBlockSize()) {
            return false;
        }
        if ((hasBlockSize() && getBlockSize() != c21425.getBlockSize()) || hasSignaturesOffset() != c21425.hasSignaturesOffset()) {
            return false;
        }
        if ((hasSignaturesOffset() && getSignaturesOffset() != c21425.getSignaturesOffset()) || hasSignaturesSize() != c21425.hasSignaturesSize()) {
            return false;
        }
        if ((hasSignaturesSize() && getSignaturesSize() != c21425.getSignaturesSize()) || hasMinorVersion() != c21425.hasMinorVersion()) {
            return false;
        }
        if ((hasMinorVersion() && getMinorVersion() != c21425.getMinorVersion()) || !getPartitionsList().equals(c21425.getPartitionsList()) || hasMaxTimestamp() != c21425.hasMaxTimestamp()) {
            return false;
        }
        if ((hasMaxTimestamp() && getMaxTimestamp() != c21425.getMaxTimestamp()) || hasDynamicPartitionMetadata() != c21425.hasDynamicPartitionMetadata()) {
            return false;
        }
        if ((hasDynamicPartitionMetadata() && !getDynamicPartitionMetadata().equals(c21425.getDynamicPartitionMetadata())) || hasPartialUpdate() != c21425.hasPartialUpdate()) {
            return false;
        }
        if ((!hasPartialUpdate() || getPartialUpdate() == c21425.getPartialUpdate()) && getApexInfoList().equals(c21425.getApexInfoList()) && hasSecurityPatchLevel() == c21425.hasSecurityPatchLevel()) {
            return (!hasSecurityPatchLevel() || getSecurityPatchLevel().equals(c21425.getSecurityPatchLevel())) && getUnknownFields().equals(c21425.getUnknownFields());
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
        if (hasBlockSize()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + getBlockSize();
        }
        if (hasSignaturesOffset()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + C9779.m24887(getSignaturesOffset());
        }
        if (hasSignaturesSize()) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + C9779.m24887(getSignaturesSize());
        }
        if (hasMinorVersion()) {
            iHashCode = C17922.m41614(iHashCode, 37, 12, 53) + getMinorVersion();
        }
        if (getPartitionsCount() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 13, 53) + getPartitionsList().hashCode();
        }
        if (hasMaxTimestamp()) {
            iHashCode = C17922.m41614(iHashCode, 37, 14, 53) + C9779.m24887(getMaxTimestamp());
        }
        if (hasDynamicPartitionMetadata()) {
            iHashCode = C17922.m41614(iHashCode, 37, 15, 53) + getDynamicPartitionMetadata().hashCode();
        }
        if (hasPartialUpdate()) {
            iHashCode = C17922.m41614(iHashCode, 37, 16, 53) + C9779.m24888(getPartialUpdate());
        }
        if (getApexInfoCount() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 17, 53) + getApexInfoList().hashCode();
        }
        if (hasSecurityPatchLevel()) {
            iHashCode = C17922.m41614(iHashCode, 37, 18, 53) + getSecurityPatchLevel().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C21425 parseFrom(ByteBuffer byteBuffer) {
        return (C21425) PARSER.parseFrom(byteBuffer);
    }

    public static C21425 parseFrom(ByteBuffer byteBuffer, C2701 c2701) {
        return (C21425) PARSER.parseFrom(byteBuffer, c2701);
    }

    public static C21425 parseFrom(AbstractC23725 abstractC23725) {
        return (C21425) PARSER.parseFrom(abstractC23725);
    }

    public static C21425 parseFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return (C21425) PARSER.parseFrom(abstractC23725, c2701);
    }

    public static C21425 parseFrom(byte[] bArr) {
        return (C21425) PARSER.parseFrom(bArr);
    }

    public static C21425 parseFrom(byte[] bArr, C2701 c2701) {
        return (C21425) PARSER.parseFrom(bArr, c2701);
    }

    public static C21425 parseFrom(InputStream inputStream) {
        return (C21425) AbstractC18245.m42418(PARSER, inputStream);
    }

    public static C21425 parseFrom(InputStream inputStream, C2701 c2701) {
        return (C21425) AbstractC18245.m42419(PARSER, inputStream, c2701);
    }

    public static C21425 parseDelimitedFrom(InputStream inputStream) {
        return (C21425) AbstractC18245.m42395(PARSER, inputStream);
    }

    public static C21425 parseDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return (C21425) AbstractC18245.m42396(PARSER, inputStream, c2701);
    }

    public static C21425 parseFrom(AbstractC3262 abstractC3262) {
        return (C21425) AbstractC18245.m42397(PARSER, abstractC3262);
    }

    public static C21425 parseFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        return (C21425) AbstractC18245.m42398(PARSER, abstractC3262, c2701);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C15076 newBuilderForType() {
        return newBuilder();
    }

    public static C15076 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C15076 newBuilder(C21425 c21425) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c21425);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C15076 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C15076(i) : new C15076(i).mergeFrom(this);
    }

    @Override // l.AbstractC23019
    public C15076 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C15076(interfaceC6790, 0);
    }

    public static C21425 getDefaultInstance() {
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
    public C21425 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
