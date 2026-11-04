package l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.ܽ֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C17235 extends AbstractC9035 implements InterfaceC23203 {
    public static final int APEX_INFO_FIELD_NUMBER = 17;
    public static final int BLOCK_SIZE_FIELD_NUMBER = 3;
    public static final C17235 DEFAULT_INSTANCE;
    public static final int DYNAMIC_PARTITION_METADATA_FIELD_NUMBER = 15;
    public static final int MAX_TIMESTAMP_FIELD_NUMBER = 14;
    public static final int MINOR_VERSION_FIELD_NUMBER = 12;
    public static final InterfaceC11490 PARSER;
    public static final int PARTIAL_UPDATE_FIELD_NUMBER = 16;
    public static final int PARTITIONS_FIELD_NUMBER = 13;
    public static final int SECURITY_PATCH_LEVEL_FIELD_NUMBER = 18;
    public static final int SIGNATURES_OFFSET_FIELD_NUMBER = 4;
    public static final int SIGNATURES_SIZE_FIELD_NUMBER = 5;
    public static final long serialVersionUID = 0;
    public List apexInfo_;
    public int bitField0_;
    public int blockSize_;
    public C20965 dynamicPartitionMetadata_;
    public long maxTimestamp_;
    public byte memoizedIsInitialized;
    public int minorVersion_;
    public boolean partialUpdate_;
    public List partitions_;
    public volatile Object securityPatchLevel_;
    public long signaturesOffset_;
    public long signaturesSize_;

    public /* synthetic */ C17235(C16489 c16489) {
        this((AbstractC15001) c16489);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C17235.class.getName());
        DEFAULT_INSTANCE = new C17235();
        PARSER = new C24695();
    }

    public C17235(AbstractC15001 abstractC15001) {
        super(abstractC15001);
        this.blockSize_ = 4096;
        this.signaturesOffset_ = 0L;
        this.signaturesSize_ = 0L;
        this.minorVersion_ = 0;
        this.maxTimestamp_ = 0L;
        this.partialUpdate_ = false;
        this.securityPatchLevel_ = "";
        this.memoizedIsInitialized = (byte) -1;
    }

    public C17235() {
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

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_descriptor;
    }

    @Override // l.AbstractC9035
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_fieldAccessorTable;
        c7544.m20621(C17235.class, C16489.class);
        return c7544;
    }

    @Override // l.InterfaceC23203
    public boolean hasBlockSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC23203
    public int getBlockSize() {
        return this.blockSize_;
    }

    @Override // l.InterfaceC23203
    public boolean hasSignaturesOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC23203
    public long getSignaturesOffset() {
        return this.signaturesOffset_;
    }

    @Override // l.InterfaceC23203
    public boolean hasSignaturesSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC23203
    public long getSignaturesSize() {
        return this.signaturesSize_;
    }

    @Override // l.InterfaceC23203
    public boolean hasMinorVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC23203
    public int getMinorVersion() {
        return this.minorVersion_;
    }

    @Override // l.InterfaceC23203
    public List getPartitionsList() {
        return this.partitions_;
    }

    @Override // l.InterfaceC23203
    public List getPartitionsOrBuilderList() {
        return this.partitions_;
    }

    @Override // l.InterfaceC23203
    public int getPartitionsCount() {
        return this.partitions_.size();
    }

    @Override // l.InterfaceC23203
    public C24935 getPartitions(int i) {
        return (C24935) this.partitions_.get(i);
    }

    @Override // l.InterfaceC23203
    public InterfaceC17475 getPartitionsOrBuilder(int i) {
        return (InterfaceC17475) this.partitions_.get(i);
    }

    @Override // l.InterfaceC23203
    public boolean hasMaxTimestamp() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC23203
    public long getMaxTimestamp() {
        return this.maxTimestamp_;
    }

    @Override // l.InterfaceC23203
    public boolean hasDynamicPartitionMetadata() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC23203
    public C20965 getDynamicPartitionMetadata() {
        C20965 c20965 = this.dynamicPartitionMetadata_;
        return c20965 == null ? C20965.getDefaultInstance() : c20965;
    }

    @Override // l.InterfaceC23203
    public InterfaceC0082 getDynamicPartitionMetadataOrBuilder() {
        C20965 c20965 = this.dynamicPartitionMetadata_;
        return c20965 == null ? C20965.getDefaultInstance() : c20965;
    }

    @Override // l.InterfaceC23203
    public boolean hasPartialUpdate() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC23203
    public boolean getPartialUpdate() {
        return this.partialUpdate_;
    }

    @Override // l.InterfaceC23203
    public List getApexInfoList() {
        return this.apexInfo_;
    }

    @Override // l.InterfaceC23203
    public List getApexInfoOrBuilderList() {
        return this.apexInfo_;
    }

    @Override // l.InterfaceC23203
    public int getApexInfoCount() {
        return this.apexInfo_.size();
    }

    @Override // l.InterfaceC23203
    public C4557 getApexInfo(int i) {
        return (C4557) this.apexInfo_.get(i);
    }

    @Override // l.InterfaceC23203
    public InterfaceC10522 getApexInfoOrBuilder(int i) {
        return (InterfaceC10522) this.apexInfo_.get(i);
    }

    @Override // l.InterfaceC23203
    public boolean hasSecurityPatchLevel() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // l.InterfaceC23203
    public String getSecurityPatchLevel() {
        Object obj = this.securityPatchLevel_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.securityPatchLevel_ = strM40221;
        }
        return strM40221;
    }

    @Override // l.InterfaceC23203
    public AbstractC17084 getSecurityPatchLevelBytes() {
        Object obj = this.securityPatchLevel_;
        if (obj instanceof String) {
            AbstractC17084 abstractC17084M40219 = AbstractC17084.m40219((String) obj);
            this.securityPatchLevel_ = abstractC17084M40219;
            return abstractC17084M40219;
        }
        return (AbstractC17084) obj;
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

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public void writeTo(AbstractC14846 abstractC14846) {
        if ((this.bitField0_ & 1) != 0) {
            abstractC14846.mo14027(3, this.blockSize_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14846.mo14023(4, this.signaturesOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            abstractC14846.mo14023(5, this.signaturesSize_);
        }
        if ((this.bitField0_ & 8) != 0) {
            abstractC14846.mo14027(12, this.minorVersion_);
        }
        for (int i = 0; i < this.partitions_.size(); i++) {
            abstractC14846.mo14025(13, (InterfaceC18775) this.partitions_.get(i));
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC14846.mo14023(14, this.maxTimestamp_);
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC14846.mo14025(15, getDynamicPartitionMetadata());
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC14846.mo14010(16, this.partialUpdate_);
        }
        for (int i2 = 0; i2 < this.apexInfo_.size(); i2++) {
            abstractC14846.mo14025(17, (InterfaceC18775) this.apexInfo_.get(i2));
        }
        if ((this.bitField0_ & 128) != 0) {
            AbstractC9035.m24111(abstractC14846, 18, this.securityPatchLevel_);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM35764 = (this.bitField0_ & 1) != 0 ? AbstractC14846.m35764(3, this.blockSize_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM35764 += AbstractC14846.m35773(4, this.signaturesOffset_);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM35764 += AbstractC14846.m35773(5, this.signaturesSize_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM35764 += AbstractC14846.m35764(12, this.minorVersion_);
        }
        for (int i2 = 0; i2 < this.partitions_.size(); i2++) {
            iM35764 += AbstractC14846.m35774(13, (InterfaceC18775) this.partitions_.get(i2));
        }
        if ((this.bitField0_ & 16) != 0) {
            iM35764 += AbstractC14846.m35760(14, this.maxTimestamp_);
        }
        if ((this.bitField0_ & 32) != 0) {
            iM35764 += AbstractC14846.m35774(15, getDynamicPartitionMetadata());
        }
        if ((this.bitField0_ & 64) != 0) {
            iM35764 += AbstractC14846.m35772(16);
        }
        for (int i3 = 0; i3 < this.apexInfo_.size(); i3++) {
            iM35764 += AbstractC14846.m35774(17, (InterfaceC18775) this.apexInfo_.get(i3));
        }
        if ((this.bitField0_ & 128) != 0) {
            iM35764 += AbstractC9035.m24096(18, this.securityPatchLevel_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM35764;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C17235)) {
            return super.equals(obj);
        }
        C17235 c17235 = (C17235) obj;
        if (hasBlockSize() != c17235.hasBlockSize()) {
            return false;
        }
        if ((hasBlockSize() && getBlockSize() != c17235.getBlockSize()) || hasSignaturesOffset() != c17235.hasSignaturesOffset()) {
            return false;
        }
        if ((hasSignaturesOffset() && getSignaturesOffset() != c17235.getSignaturesOffset()) || hasSignaturesSize() != c17235.hasSignaturesSize()) {
            return false;
        }
        if ((hasSignaturesSize() && getSignaturesSize() != c17235.getSignaturesSize()) || hasMinorVersion() != c17235.hasMinorVersion()) {
            return false;
        }
        if ((hasMinorVersion() && getMinorVersion() != c17235.getMinorVersion()) || !getPartitionsList().equals(c17235.getPartitionsList()) || hasMaxTimestamp() != c17235.hasMaxTimestamp()) {
            return false;
        }
        if ((hasMaxTimestamp() && getMaxTimestamp() != c17235.getMaxTimestamp()) || hasDynamicPartitionMetadata() != c17235.hasDynamicPartitionMetadata()) {
            return false;
        }
        if ((hasDynamicPartitionMetadata() && !getDynamicPartitionMetadata().equals(c17235.getDynamicPartitionMetadata())) || hasPartialUpdate() != c17235.hasPartialUpdate()) {
            return false;
        }
        if ((!hasPartialUpdate() || getPartialUpdate() == c17235.getPartialUpdate()) && getApexInfoList().equals(c17235.getApexInfoList()) && hasSecurityPatchLevel() == c17235.hasSecurityPatchLevel()) {
            return (!hasSecurityPatchLevel() || getSecurityPatchLevel().equals(c17235.getSecurityPatchLevel())) && getUnknownFields().equals(c17235.getUnknownFields());
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
        if (hasBlockSize()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + getBlockSize();
        }
        if (hasSignaturesOffset()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + C23447.m52660(getSignaturesOffset());
        }
        if (hasSignaturesSize()) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + C23447.m52660(getSignaturesSize());
        }
        if (hasMinorVersion()) {
            iHashCode = C18176.m42345(iHashCode, 37, 12, 53) + getMinorVersion();
        }
        if (getPartitionsCount() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 13, 53) + getPartitionsList().hashCode();
        }
        if (hasMaxTimestamp()) {
            iHashCode = C18176.m42345(iHashCode, 37, 14, 53) + C23447.m52660(getMaxTimestamp());
        }
        if (hasDynamicPartitionMetadata()) {
            iHashCode = C18176.m42345(iHashCode, 37, 15, 53) + getDynamicPartitionMetadata().hashCode();
        }
        if (hasPartialUpdate()) {
            iHashCode = C18176.m42345(iHashCode, 37, 16, 53) + C23447.m52661(getPartialUpdate());
        }
        if (getApexInfoCount() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 17, 53) + getApexInfoList().hashCode();
        }
        if (hasSecurityPatchLevel()) {
            iHashCode = C18176.m42345(iHashCode, 37, 18, 53) + getSecurityPatchLevel().hashCode();
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C17235 parseFrom(ByteBuffer byteBuffer) {
        return (C17235) PARSER.parseFrom(byteBuffer);
    }

    public static C17235 parseFrom(ByteBuffer byteBuffer, C24215 c24215) {
        return (C17235) PARSER.parseFrom(byteBuffer, c24215);
    }

    public static C17235 parseFrom(AbstractC17084 abstractC17084) {
        return (C17235) PARSER.parseFrom(abstractC17084);
    }

    public static C17235 parseFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return (C17235) PARSER.parseFrom(abstractC17084, c24215);
    }

    public static C17235 parseFrom(byte[] bArr) {
        return (C17235) PARSER.parseFrom(bArr);
    }

    public static C17235 parseFrom(byte[] bArr, C24215 c24215) {
        return (C17235) PARSER.parseFrom(bArr, c24215);
    }

    public static C17235 parseFrom(InputStream inputStream) {
        return (C17235) AbstractC9035.m24127(PARSER, inputStream);
    }

    public static C17235 parseFrom(InputStream inputStream, C24215 c24215) {
        return (C17235) AbstractC9035.m24128(PARSER, inputStream, c24215);
    }

    public static C17235 parseDelimitedFrom(InputStream inputStream) {
        return (C17235) AbstractC9035.m24107(PARSER, inputStream);
    }

    public static C17235 parseDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return (C17235) AbstractC9035.m24108(PARSER, inputStream, c24215);
    }

    public static C17235 parseFrom(AbstractC3660 abstractC3660) {
        return (C17235) AbstractC9035.m24109(PARSER, abstractC3660);
    }

    public static C17235 parseFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        return (C17235) AbstractC9035.m24110(PARSER, abstractC3660, c24215);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C16489 newBuilderForType() {
        return newBuilder();
    }

    public static C16489 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C16489 newBuilder(C17235 c17235) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c17235);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C16489 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C16489(i) : new C16489(i).mergeFrom(this);
    }

    @Override // l.AbstractC19124
    public C16489 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C16489(interfaceC7937, 0);
    }

    public static C17235 getDefaultInstance() {
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
    public C17235 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
