package l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩻ۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C24935 extends AbstractC9035 implements InterfaceC17475 {
    public static final C24935 DEFAULT_INSTANCE;
    public static final int ESTIMATE_COW_SIZE_FIELD_NUMBER = 19;
    public static final int ESTIMATE_OP_COUNT_MAX_FIELD_NUMBER = 20;
    public static final int FEC_DATA_EXTENT_FIELD_NUMBER = 14;
    public static final int FEC_EXTENT_FIELD_NUMBER = 15;
    public static final int FEC_ROOTS_FIELD_NUMBER = 16;
    public static final int FILESYSTEM_TYPE_FIELD_NUMBER = 4;
    public static final int HASH_TREE_ALGORITHM_FIELD_NUMBER = 12;
    public static final int HASH_TREE_DATA_EXTENT_FIELD_NUMBER = 10;
    public static final int HASH_TREE_EXTENT_FIELD_NUMBER = 11;
    public static final int HASH_TREE_SALT_FIELD_NUMBER = 13;
    public static final int MERGE_OPERATIONS_FIELD_NUMBER = 18;
    public static final int NEW_PARTITION_INFO_FIELD_NUMBER = 7;
    public static final int NEW_PARTITION_SIGNATURE_FIELD_NUMBER = 5;
    public static final int OLD_PARTITION_INFO_FIELD_NUMBER = 6;
    public static final int OPERATIONS_FIELD_NUMBER = 8;
    public static final InterfaceC11490 PARSER;
    public static final int PARTITION_NAME_FIELD_NUMBER = 1;
    public static final int POSTINSTALL_OPTIONAL_FIELD_NUMBER = 9;
    public static final int POSTINSTALL_PATH_FIELD_NUMBER = 3;
    public static final int RUN_POSTINSTALL_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 17;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long estimateCowSize_;
    public long estimateOpCountMax_;
    public C9776 fecDataExtent_;
    public C9776 fecExtent_;
    public int fecRoots_;
    public volatile Object filesystemType_;
    public volatile Object hashTreeAlgorithm_;
    public C9776 hashTreeDataExtent_;
    public C9776 hashTreeExtent_;
    public AbstractC17084 hashTreeSalt_;
    public byte memoizedIsInitialized;
    public List mergeOperations_;
    public C15237 newPartitionInfo_;
    public List newPartitionSignature_;
    public C15237 oldPartitionInfo_;
    public List operations_;
    public volatile Object partitionName_;
    public boolean postinstallOptional_;
    public volatile Object postinstallPath_;
    public boolean runPostinstall_;
    public volatile Object version_;

    public /* synthetic */ C24935(C11508 c11508) {
        this((AbstractC15001) c11508);
    }

    static {
        C0304.m1888(EnumC18203.PUBLIC, C24935.class.getName());
        DEFAULT_INSTANCE = new C24935();
        PARSER = new C1814();
    }

    public C24935(AbstractC15001 abstractC15001) {
        super(abstractC15001);
        this.partitionName_ = "";
        this.runPostinstall_ = false;
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        this.postinstallOptional_ = false;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC17084.f55772;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.estimateCowSize_ = 0L;
        this.estimateOpCountMax_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C24935() {
        this.partitionName_ = "";
        this.runPostinstall_ = false;
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        this.postinstallOptional_ = false;
        this.hashTreeAlgorithm_ = "";
        AbstractC17084 abstractC17084 = AbstractC17084.f55772;
        this.hashTreeSalt_ = abstractC17084;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.estimateCowSize_ = 0L;
        this.estimateOpCountMax_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
        this.partitionName_ = "";
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        List list = Collections.EMPTY_LIST;
        this.newPartitionSignature_ = list;
        this.operations_ = list;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = abstractC17084;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.mergeOperations_ = list;
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_descriptor;
    }

    @Override // l.AbstractC9035
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_fieldAccessorTable;
        c7544.m20621(C24935.class, C11508.class);
        return c7544;
    }

    @Override // l.InterfaceC17475
    public boolean hasPartitionName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC17475
    public String getPartitionName() {
        Object obj = this.partitionName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.partitionName_ = strM40221;
        }
        return strM40221;
    }

    @Override // l.InterfaceC17475
    public AbstractC17084 getPartitionNameBytes() {
        Object obj = this.partitionName_;
        if (obj instanceof String) {
            AbstractC17084 abstractC17084M40219 = AbstractC17084.m40219((String) obj);
            this.partitionName_ = abstractC17084M40219;
            return abstractC17084M40219;
        }
        return (AbstractC17084) obj;
    }

    @Override // l.InterfaceC17475
    public boolean hasRunPostinstall() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC17475
    public boolean getRunPostinstall() {
        return this.runPostinstall_;
    }

    @Override // l.InterfaceC17475
    public boolean hasPostinstallPath() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC17475
    public String getPostinstallPath() {
        Object obj = this.postinstallPath_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.postinstallPath_ = strM40221;
        }
        return strM40221;
    }

    @Override // l.InterfaceC17475
    public AbstractC17084 getPostinstallPathBytes() {
        Object obj = this.postinstallPath_;
        if (obj instanceof String) {
            AbstractC17084 abstractC17084M40219 = AbstractC17084.m40219((String) obj);
            this.postinstallPath_ = abstractC17084M40219;
            return abstractC17084M40219;
        }
        return (AbstractC17084) obj;
    }

    @Override // l.InterfaceC17475
    public boolean hasFilesystemType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC17475
    public String getFilesystemType() {
        Object obj = this.filesystemType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.filesystemType_ = strM40221;
        }
        return strM40221;
    }

    @Override // l.InterfaceC17475
    public AbstractC17084 getFilesystemTypeBytes() {
        Object obj = this.filesystemType_;
        if (obj instanceof String) {
            AbstractC17084 abstractC17084M40219 = AbstractC17084.m40219((String) obj);
            this.filesystemType_ = abstractC17084M40219;
            return abstractC17084M40219;
        }
        return (AbstractC17084) obj;
    }

    @Override // l.InterfaceC17475
    public List getNewPartitionSignatureList() {
        return this.newPartitionSignature_;
    }

    @Override // l.InterfaceC17475
    public List getNewPartitionSignatureOrBuilderList() {
        return this.newPartitionSignature_;
    }

    @Override // l.InterfaceC17475
    public int getNewPartitionSignatureCount() {
        return this.newPartitionSignature_.size();
    }

    @Override // l.InterfaceC17475
    public C3305 getNewPartitionSignature(int i) {
        return (C3305) this.newPartitionSignature_.get(i);
    }

    @Override // l.InterfaceC17475
    public InterfaceC12254 getNewPartitionSignatureOrBuilder(int i) {
        return (InterfaceC12254) this.newPartitionSignature_.get(i);
    }

    @Override // l.InterfaceC17475
    public boolean hasOldPartitionInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC17475
    public C15237 getOldPartitionInfo() {
        C15237 c15237 = this.oldPartitionInfo_;
        return c15237 == null ? C15237.getDefaultInstance() : c15237;
    }

    @Override // l.InterfaceC17475
    public InterfaceC5543 getOldPartitionInfoOrBuilder() {
        C15237 c15237 = this.oldPartitionInfo_;
        return c15237 == null ? C15237.getDefaultInstance() : c15237;
    }

    @Override // l.InterfaceC17475
    public boolean hasNewPartitionInfo() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC17475
    public C15237 getNewPartitionInfo() {
        C15237 c15237 = this.newPartitionInfo_;
        return c15237 == null ? C15237.getDefaultInstance() : c15237;
    }

    @Override // l.InterfaceC17475
    public InterfaceC5543 getNewPartitionInfoOrBuilder() {
        C15237 c15237 = this.newPartitionInfo_;
        return c15237 == null ? C15237.getDefaultInstance() : c15237;
    }

    @Override // l.InterfaceC17475
    public List getOperationsList() {
        return this.operations_;
    }

    @Override // l.InterfaceC17475
    public List getOperationsOrBuilderList() {
        return this.operations_;
    }

    @Override // l.InterfaceC17475
    public int getOperationsCount() {
        return this.operations_.size();
    }

    @Override // l.InterfaceC17475
    public C4797 getOperations(int i) {
        return (C4797) this.operations_.get(i);
    }

    @Override // l.InterfaceC17475
    public InterfaceC10762 getOperationsOrBuilder(int i) {
        return (InterfaceC10762) this.operations_.get(i);
    }

    @Override // l.InterfaceC17475
    public boolean hasPostinstallOptional() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC17475
    public boolean getPostinstallOptional() {
        return this.postinstallOptional_;
    }

    @Override // l.InterfaceC17475
    public boolean hasHashTreeDataExtent() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // l.InterfaceC17475
    public C9776 getHashTreeDataExtent() {
        C9776 c9776 = this.hashTreeDataExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    @Override // l.InterfaceC17475
    public InterfaceC9031 getHashTreeDataExtentOrBuilder() {
        C9776 c9776 = this.hashTreeDataExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    @Override // l.InterfaceC17475
    public boolean hasHashTreeExtent() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // l.InterfaceC17475
    public C9776 getHashTreeExtent() {
        C9776 c9776 = this.hashTreeExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    @Override // l.InterfaceC17475
    public InterfaceC9031 getHashTreeExtentOrBuilder() {
        C9776 c9776 = this.hashTreeExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    @Override // l.InterfaceC17475
    public boolean hasHashTreeAlgorithm() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // l.InterfaceC17475
    public String getHashTreeAlgorithm() {
        Object obj = this.hashTreeAlgorithm_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.hashTreeAlgorithm_ = strM40221;
        }
        return strM40221;
    }

    @Override // l.InterfaceC17475
    public AbstractC17084 getHashTreeAlgorithmBytes() {
        Object obj = this.hashTreeAlgorithm_;
        if (obj instanceof String) {
            AbstractC17084 abstractC17084M40219 = AbstractC17084.m40219((String) obj);
            this.hashTreeAlgorithm_ = abstractC17084M40219;
            return abstractC17084M40219;
        }
        return (AbstractC17084) obj;
    }

    @Override // l.InterfaceC17475
    public boolean hasHashTreeSalt() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // l.InterfaceC17475
    public AbstractC17084 getHashTreeSalt() {
        return this.hashTreeSalt_;
    }

    @Override // l.InterfaceC17475
    public boolean hasFecDataExtent() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // l.InterfaceC17475
    public C9776 getFecDataExtent() {
        C9776 c9776 = this.fecDataExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    @Override // l.InterfaceC17475
    public InterfaceC9031 getFecDataExtentOrBuilder() {
        C9776 c9776 = this.fecDataExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    @Override // l.InterfaceC17475
    public boolean hasFecExtent() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // l.InterfaceC17475
    public C9776 getFecExtent() {
        C9776 c9776 = this.fecExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    @Override // l.InterfaceC17475
    public InterfaceC9031 getFecExtentOrBuilder() {
        C9776 c9776 = this.fecExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    @Override // l.InterfaceC17475
    public boolean hasFecRoots() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // l.InterfaceC17475
    public int getFecRoots() {
        return this.fecRoots_;
    }

    @Override // l.InterfaceC17475
    public boolean hasVersion() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // l.InterfaceC17475
    public String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC17084 abstractC17084 = (AbstractC17084) obj;
        String strM40221 = abstractC17084.m40221();
        if (abstractC17084.mo29729()) {
            this.version_ = strM40221;
        }
        return strM40221;
    }

    @Override // l.InterfaceC17475
    public AbstractC17084 getVersionBytes() {
        Object obj = this.version_;
        if (obj instanceof String) {
            AbstractC17084 abstractC17084M40219 = AbstractC17084.m40219((String) obj);
            this.version_ = abstractC17084M40219;
            return abstractC17084M40219;
        }
        return (AbstractC17084) obj;
    }

    @Override // l.InterfaceC17475
    public List getMergeOperationsList() {
        return this.mergeOperations_;
    }

    @Override // l.InterfaceC17475
    public List getMergeOperationsOrBuilderList() {
        return this.mergeOperations_;
    }

    @Override // l.InterfaceC17475
    public int getMergeOperationsCount() {
        return this.mergeOperations_.size();
    }

    @Override // l.InterfaceC17475
    public C5303 getMergeOperations(int i) {
        return (C5303) this.mergeOperations_.get(i);
    }

    @Override // l.InterfaceC17475
    public InterfaceC11268 getMergeOperationsOrBuilder(int i) {
        return (InterfaceC11268) this.mergeOperations_.get(i);
    }

    @Override // l.InterfaceC17475
    public boolean hasEstimateCowSize() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // l.InterfaceC17475
    public long getEstimateCowSize() {
        return this.estimateCowSize_;
    }

    @Override // l.InterfaceC17475
    public boolean hasEstimateOpCountMax() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // l.InterfaceC17475
    public long getEstimateOpCountMax() {
        return this.estimateOpCountMax_;
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
        if (!hasPartitionName()) {
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }
        for (int i = 0; i < getOperationsCount(); i++) {
            if (!getOperations(i).isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
        }
        this.memoizedIsInitialized = (byte) 1;
        return true;
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public void writeTo(AbstractC14846 abstractC14846) {
        if ((this.bitField0_ & 1) != 0) {
            AbstractC9035.m24111(abstractC14846, 1, this.partitionName_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC14846.mo14010(2, this.runPostinstall_);
        }
        if ((this.bitField0_ & 4) != 0) {
            AbstractC9035.m24111(abstractC14846, 3, this.postinstallPath_);
        }
        if ((this.bitField0_ & 8) != 0) {
            AbstractC9035.m24111(abstractC14846, 4, this.filesystemType_);
        }
        for (int i = 0; i < this.newPartitionSignature_.size(); i++) {
            abstractC14846.mo14025(5, (InterfaceC18775) this.newPartitionSignature_.get(i));
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC14846.mo14025(6, getOldPartitionInfo());
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC14846.mo14025(7, getNewPartitionInfo());
        }
        for (int i2 = 0; i2 < this.operations_.size(); i2++) {
            abstractC14846.mo14025(8, (InterfaceC18775) this.operations_.get(i2));
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC14846.mo14010(9, this.postinstallOptional_);
        }
        if ((this.bitField0_ & 128) != 0) {
            abstractC14846.mo14025(10, getHashTreeDataExtent());
        }
        if ((this.bitField0_ & 256) != 0) {
            abstractC14846.mo14025(11, getHashTreeExtent());
        }
        if ((this.bitField0_ & 512) != 0) {
            AbstractC9035.m24111(abstractC14846, 12, this.hashTreeAlgorithm_);
        }
        if ((this.bitField0_ & 1024) != 0) {
            abstractC14846.mo14008(13, this.hashTreeSalt_);
        }
        if ((this.bitField0_ & 2048) != 0) {
            abstractC14846.mo14025(14, getFecDataExtent());
        }
        if ((this.bitField0_ & 4096) != 0) {
            abstractC14846.mo14025(15, getFecExtent());
        }
        if ((this.bitField0_ & 8192) != 0) {
            abstractC14846.mo14027(16, this.fecRoots_);
        }
        if ((this.bitField0_ & 16384) != 0) {
            AbstractC9035.m24111(abstractC14846, 17, this.version_);
        }
        for (int i3 = 0; i3 < this.mergeOperations_.size(); i3++) {
            abstractC14846.mo14025(18, (InterfaceC18775) this.mergeOperations_.get(i3));
        }
        if ((this.bitField0_ & 32768) != 0) {
            abstractC14846.mo14023(19, this.estimateCowSize_);
        }
        if ((this.bitField0_ & 65536) != 0) {
            abstractC14846.mo14023(20, this.estimateOpCountMax_);
        }
        getUnknownFields().writeTo(abstractC14846);
    }

    @Override // l.AbstractC9035, l.AbstractC19124, l.InterfaceC18775
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM24096 = (this.bitField0_ & 1) != 0 ? AbstractC9035.m24096(1, this.partitionName_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM24096 += AbstractC14846.m35772(2);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM24096 += AbstractC9035.m24096(3, this.postinstallPath_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM24096 += AbstractC9035.m24096(4, this.filesystemType_);
        }
        for (int i2 = 0; i2 < this.newPartitionSignature_.size(); i2++) {
            iM24096 += AbstractC14846.m35774(5, (InterfaceC18775) this.newPartitionSignature_.get(i2));
        }
        if ((this.bitField0_ & 16) != 0) {
            iM24096 += AbstractC14846.m35774(6, getOldPartitionInfo());
        }
        if ((this.bitField0_ & 32) != 0) {
            iM24096 += AbstractC14846.m35774(7, getNewPartitionInfo());
        }
        for (int i3 = 0; i3 < this.operations_.size(); i3++) {
            iM24096 += AbstractC14846.m35774(8, (InterfaceC18775) this.operations_.get(i3));
        }
        if ((this.bitField0_ & 64) != 0) {
            iM24096 += AbstractC14846.m35772(9);
        }
        if ((this.bitField0_ & 128) != 0) {
            iM24096 += AbstractC14846.m35774(10, getHashTreeDataExtent());
        }
        if ((this.bitField0_ & 256) != 0) {
            iM24096 += AbstractC14846.m35774(11, getHashTreeExtent());
        }
        if ((this.bitField0_ & 512) != 0) {
            iM24096 += AbstractC9035.m24096(12, this.hashTreeAlgorithm_);
        }
        if ((this.bitField0_ & 1024) != 0) {
            iM24096 += AbstractC14846.m35761(13, this.hashTreeSalt_);
        }
        if ((this.bitField0_ & 2048) != 0) {
            iM24096 += AbstractC14846.m35774(14, getFecDataExtent());
        }
        if ((this.bitField0_ & 4096) != 0) {
            iM24096 += AbstractC14846.m35774(15, getFecExtent());
        }
        if ((this.bitField0_ & 8192) != 0) {
            iM24096 += AbstractC14846.m35764(16, this.fecRoots_);
        }
        if ((this.bitField0_ & 16384) != 0) {
            iM24096 += AbstractC9035.m24096(17, this.version_);
        }
        for (int i4 = 0; i4 < this.mergeOperations_.size(); i4++) {
            iM24096 += AbstractC14846.m35774(18, (InterfaceC18775) this.mergeOperations_.get(i4));
        }
        if ((this.bitField0_ & 32768) != 0) {
            iM24096 += AbstractC14846.m35773(19, this.estimateCowSize_);
        }
        if ((this.bitField0_ & 65536) != 0) {
            iM24096 += AbstractC14846.m35773(20, this.estimateOpCountMax_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM24096;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC19124
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C24935)) {
            return super.equals(obj);
        }
        C24935 c24935 = (C24935) obj;
        if (hasPartitionName() != c24935.hasPartitionName()) {
            return false;
        }
        if ((hasPartitionName() && !getPartitionName().equals(c24935.getPartitionName())) || hasRunPostinstall() != c24935.hasRunPostinstall()) {
            return false;
        }
        if ((hasRunPostinstall() && getRunPostinstall() != c24935.getRunPostinstall()) || hasPostinstallPath() != c24935.hasPostinstallPath()) {
            return false;
        }
        if ((hasPostinstallPath() && !getPostinstallPath().equals(c24935.getPostinstallPath())) || hasFilesystemType() != c24935.hasFilesystemType()) {
            return false;
        }
        if ((hasFilesystemType() && !getFilesystemType().equals(c24935.getFilesystemType())) || !getNewPartitionSignatureList().equals(c24935.getNewPartitionSignatureList()) || hasOldPartitionInfo() != c24935.hasOldPartitionInfo()) {
            return false;
        }
        if ((hasOldPartitionInfo() && !getOldPartitionInfo().equals(c24935.getOldPartitionInfo())) || hasNewPartitionInfo() != c24935.hasNewPartitionInfo()) {
            return false;
        }
        if ((hasNewPartitionInfo() && !getNewPartitionInfo().equals(c24935.getNewPartitionInfo())) || !getOperationsList().equals(c24935.getOperationsList()) || hasPostinstallOptional() != c24935.hasPostinstallOptional()) {
            return false;
        }
        if ((hasPostinstallOptional() && getPostinstallOptional() != c24935.getPostinstallOptional()) || hasHashTreeDataExtent() != c24935.hasHashTreeDataExtent()) {
            return false;
        }
        if ((hasHashTreeDataExtent() && !getHashTreeDataExtent().equals(c24935.getHashTreeDataExtent())) || hasHashTreeExtent() != c24935.hasHashTreeExtent()) {
            return false;
        }
        if ((hasHashTreeExtent() && !getHashTreeExtent().equals(c24935.getHashTreeExtent())) || hasHashTreeAlgorithm() != c24935.hasHashTreeAlgorithm()) {
            return false;
        }
        if ((hasHashTreeAlgorithm() && !getHashTreeAlgorithm().equals(c24935.getHashTreeAlgorithm())) || hasHashTreeSalt() != c24935.hasHashTreeSalt()) {
            return false;
        }
        if ((hasHashTreeSalt() && !getHashTreeSalt().equals(c24935.getHashTreeSalt())) || hasFecDataExtent() != c24935.hasFecDataExtent()) {
            return false;
        }
        if ((hasFecDataExtent() && !getFecDataExtent().equals(c24935.getFecDataExtent())) || hasFecExtent() != c24935.hasFecExtent()) {
            return false;
        }
        if ((hasFecExtent() && !getFecExtent().equals(c24935.getFecExtent())) || hasFecRoots() != c24935.hasFecRoots()) {
            return false;
        }
        if ((hasFecRoots() && getFecRoots() != c24935.getFecRoots()) || hasVersion() != c24935.hasVersion()) {
            return false;
        }
        if ((hasVersion() && !getVersion().equals(c24935.getVersion())) || !getMergeOperationsList().equals(c24935.getMergeOperationsList()) || hasEstimateCowSize() != c24935.hasEstimateCowSize()) {
            return false;
        }
        if ((!hasEstimateCowSize() || getEstimateCowSize() == c24935.getEstimateCowSize()) && hasEstimateOpCountMax() == c24935.hasEstimateOpCountMax()) {
            return (!hasEstimateOpCountMax() || getEstimateOpCountMax() == c24935.getEstimateOpCountMax()) && getUnknownFields().equals(c24935.getUnknownFields());
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
        if (hasPartitionName()) {
            iHashCode = C18176.m42345(iHashCode, 37, 1, 53) + getPartitionName().hashCode();
        }
        if (hasRunPostinstall()) {
            iHashCode = C18176.m42345(iHashCode, 37, 2, 53) + C23447.m52661(getRunPostinstall());
        }
        if (hasPostinstallPath()) {
            iHashCode = C18176.m42345(iHashCode, 37, 3, 53) + getPostinstallPath().hashCode();
        }
        if (hasFilesystemType()) {
            iHashCode = C18176.m42345(iHashCode, 37, 4, 53) + getFilesystemType().hashCode();
        }
        if (getNewPartitionSignatureCount() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 5, 53) + getNewPartitionSignatureList().hashCode();
        }
        if (hasOldPartitionInfo()) {
            iHashCode = C18176.m42345(iHashCode, 37, 6, 53) + getOldPartitionInfo().hashCode();
        }
        if (hasNewPartitionInfo()) {
            iHashCode = C18176.m42345(iHashCode, 37, 7, 53) + getNewPartitionInfo().hashCode();
        }
        if (getOperationsCount() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 8, 53) + getOperationsList().hashCode();
        }
        if (hasPostinstallOptional()) {
            iHashCode = C18176.m42345(iHashCode, 37, 9, 53) + C23447.m52661(getPostinstallOptional());
        }
        if (hasHashTreeDataExtent()) {
            iHashCode = C18176.m42345(iHashCode, 37, 10, 53) + getHashTreeDataExtent().hashCode();
        }
        if (hasHashTreeExtent()) {
            iHashCode = C18176.m42345(iHashCode, 37, 11, 53) + getHashTreeExtent().hashCode();
        }
        if (hasHashTreeAlgorithm()) {
            iHashCode = C18176.m42345(iHashCode, 37, 12, 53) + getHashTreeAlgorithm().hashCode();
        }
        if (hasHashTreeSalt()) {
            iHashCode = C18176.m42345(iHashCode, 37, 13, 53) + getHashTreeSalt().hashCode();
        }
        if (hasFecDataExtent()) {
            iHashCode = C18176.m42345(iHashCode, 37, 14, 53) + getFecDataExtent().hashCode();
        }
        if (hasFecExtent()) {
            iHashCode = C18176.m42345(iHashCode, 37, 15, 53) + getFecExtent().hashCode();
        }
        if (hasFecRoots()) {
            iHashCode = C18176.m42345(iHashCode, 37, 16, 53) + getFecRoots();
        }
        if (hasVersion()) {
            iHashCode = C18176.m42345(iHashCode, 37, 17, 53) + getVersion().hashCode();
        }
        if (getMergeOperationsCount() > 0) {
            iHashCode = C18176.m42345(iHashCode, 37, 18, 53) + getMergeOperationsList().hashCode();
        }
        if (hasEstimateCowSize()) {
            iHashCode = C18176.m42345(iHashCode, 37, 19, 53) + C23447.m52660(getEstimateCowSize());
        }
        if (hasEstimateOpCountMax()) {
            iHashCode = C18176.m42345(iHashCode, 37, 20, 53) + C23447.m52660(getEstimateOpCountMax());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C24935 parseFrom(ByteBuffer byteBuffer) {
        return (C24935) PARSER.parseFrom(byteBuffer);
    }

    public static C24935 parseFrom(ByteBuffer byteBuffer, C24215 c24215) {
        return (C24935) PARSER.parseFrom(byteBuffer, c24215);
    }

    public static C24935 parseFrom(AbstractC17084 abstractC17084) {
        return (C24935) PARSER.parseFrom(abstractC17084);
    }

    public static C24935 parseFrom(AbstractC17084 abstractC17084, C24215 c24215) {
        return (C24935) PARSER.parseFrom(abstractC17084, c24215);
    }

    public static C24935 parseFrom(byte[] bArr) {
        return (C24935) PARSER.parseFrom(bArr);
    }

    public static C24935 parseFrom(byte[] bArr, C24215 c24215) {
        return (C24935) PARSER.parseFrom(bArr, c24215);
    }

    public static C24935 parseFrom(InputStream inputStream) {
        return (C24935) AbstractC9035.m24127(PARSER, inputStream);
    }

    public static C24935 parseFrom(InputStream inputStream, C24215 c24215) {
        return (C24935) AbstractC9035.m24128(PARSER, inputStream, c24215);
    }

    public static C24935 parseDelimitedFrom(InputStream inputStream) {
        return (C24935) AbstractC9035.m24107(PARSER, inputStream);
    }

    public static C24935 parseDelimitedFrom(InputStream inputStream, C24215 c24215) {
        return (C24935) AbstractC9035.m24108(PARSER, inputStream, c24215);
    }

    public static C24935 parseFrom(AbstractC3660 abstractC3660) {
        return (C24935) AbstractC9035.m24109(PARSER, abstractC3660);
    }

    public static C24935 parseFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        return (C24935) AbstractC9035.m24110(PARSER, abstractC3660, c24215);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C11508 newBuilderForType() {
        return newBuilder();
    }

    public static C11508 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C11508 newBuilder(C24935 c24935) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c24935);
    }

    @Override // l.AbstractC19124, l.InterfaceC18775
    public C11508 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C11508(i) : new C11508(i).mergeFrom(this);
    }

    @Override // l.AbstractC19124
    public C11508 newBuilderForType(InterfaceC7937 interfaceC7937) {
        return new C11508(interfaceC7937, 0);
    }

    public static C24935 getDefaultInstance() {
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
    public C24935 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
