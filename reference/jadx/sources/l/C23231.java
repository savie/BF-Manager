package l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.᩺᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C23231 extends AbstractC18245 implements InterfaceC21819 {
    public static final C23231 DEFAULT_INSTANCE;
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
    public static final InterfaceC6271 PARSER;
    public static final int PARTITION_NAME_FIELD_NUMBER = 1;
    public static final int POSTINSTALL_OPTIONAL_FIELD_NUMBER = 9;
    public static final int POSTINSTALL_PATH_FIELD_NUMBER = 3;
    public static final int RUN_POSTINSTALL_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 17;
    public static final long serialVersionUID = 0;
    public int bitField0_;
    public long estimateCowSize_;
    public long estimateOpCountMax_;
    public C5903 fecDataExtent_;
    public C5903 fecExtent_;
    public int fecRoots_;
    public volatile Object filesystemType_;
    public volatile Object hashTreeAlgorithm_;
    public C5903 hashTreeDataExtent_;
    public C5903 hashTreeExtent_;
    public AbstractC23725 hashTreeSalt_;
    public byte memoizedIsInitialized;
    public List mergeOperations_;
    public C22525 newPartitionInfo_;
    public List newPartitionSignature_;
    public C22525 oldPartitionInfo_;
    public List operations_;
    public volatile Object partitionName_;
    public boolean postinstallOptional_;
    public volatile Object postinstallPath_;
    public boolean runPostinstall_;
    public volatile Object version_;

    public /* synthetic */ C23231(C7002 c7002) {
        this((AbstractC0584) c7002);
    }

    static {
        C3844.m11171(EnumC13018.PUBLIC, C23231.class.getName());
        DEFAULT_INSTANCE = new C23231();
        PARSER = new C4179();
    }

    public C23231(AbstractC0584 abstractC0584) {
        super(abstractC0584);
        this.partitionName_ = "";
        this.runPostinstall_ = false;
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        this.postinstallOptional_ = false;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC23725.f76778;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.estimateCowSize_ = 0L;
        this.estimateOpCountMax_ = 0L;
        this.memoizedIsInitialized = (byte) -1;
    }

    public C23231() {
        this.partitionName_ = "";
        this.runPostinstall_ = false;
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        this.postinstallOptional_ = false;
        this.hashTreeAlgorithm_ = "";
        AbstractC23725 abstractC23725 = AbstractC23725.f76778;
        this.hashTreeSalt_ = abstractC23725;
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
        this.hashTreeSalt_ = abstractC23725;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.mergeOperations_ = list;
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_descriptor;
    }

    @Override // l.AbstractC18245
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_fieldAccessorTable;
        c6956.m18696(C23231.class, C7002.class);
        return c6956;
    }

    @Override // l.InterfaceC21819
    public boolean hasPartitionName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC21819
    public String getPartitionName() {
        Object obj = this.partitionName_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.partitionName_ = strM52260;
        }
        return strM52260;
    }

    @Override // l.InterfaceC21819
    public AbstractC23725 getPartitionNameBytes() {
        Object obj = this.partitionName_;
        if (obj instanceof String) {
            AbstractC23725 abstractC23725M52256 = AbstractC23725.m52256((String) obj);
            this.partitionName_ = abstractC23725M52256;
            return abstractC23725M52256;
        }
        return (AbstractC23725) obj;
    }

    @Override // l.InterfaceC21819
    public boolean hasRunPostinstall() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC21819
    public boolean getRunPostinstall() {
        return this.runPostinstall_;
    }

    @Override // l.InterfaceC21819
    public boolean hasPostinstallPath() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC21819
    public String getPostinstallPath() {
        Object obj = this.postinstallPath_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.postinstallPath_ = strM52260;
        }
        return strM52260;
    }

    @Override // l.InterfaceC21819
    public AbstractC23725 getPostinstallPathBytes() {
        Object obj = this.postinstallPath_;
        if (obj instanceof String) {
            AbstractC23725 abstractC23725M52256 = AbstractC23725.m52256((String) obj);
            this.postinstallPath_ = abstractC23725M52256;
            return abstractC23725M52256;
        }
        return (AbstractC23725) obj;
    }

    @Override // l.InterfaceC21819
    public boolean hasFilesystemType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC21819
    public String getFilesystemType() {
        Object obj = this.filesystemType_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.filesystemType_ = strM52260;
        }
        return strM52260;
    }

    @Override // l.InterfaceC21819
    public AbstractC23725 getFilesystemTypeBytes() {
        Object obj = this.filesystemType_;
        if (obj instanceof String) {
            AbstractC23725 abstractC23725M52256 = AbstractC23725.m52256((String) obj);
            this.filesystemType_ = abstractC23725M52256;
            return abstractC23725M52256;
        }
        return (AbstractC23725) obj;
    }

    @Override // l.InterfaceC21819
    public List getNewPartitionSignatureList() {
        return this.newPartitionSignature_;
    }

    @Override // l.InterfaceC21819
    public List getNewPartitionSignatureOrBuilderList() {
        return this.newPartitionSignature_;
    }

    @Override // l.InterfaceC21819
    public int getNewPartitionSignatureCount() {
        return this.newPartitionSignature_.size();
    }

    @Override // l.InterfaceC21819
    public C8414 getNewPartitionSignature(int i) {
        return (C8414) this.newPartitionSignature_.get(i);
    }

    @Override // l.InterfaceC21819
    public InterfaceC9120 getNewPartitionSignatureOrBuilder(int i) {
        return (InterfaceC9120) this.newPartitionSignature_.get(i);
    }

    @Override // l.InterfaceC21819
    public boolean hasOldPartitionInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC21819
    public C22525 getOldPartitionInfo() {
        C22525 c22525 = this.oldPartitionInfo_;
        return c22525 == null ? C22525.getDefaultInstance() : c22525;
    }

    @Override // l.InterfaceC21819
    public InterfaceC13353 getOldPartitionInfoOrBuilder() {
        C22525 c22525 = this.oldPartitionInfo_;
        return c22525 == null ? C22525.getDefaultInstance() : c22525;
    }

    @Override // l.InterfaceC21819
    public boolean hasNewPartitionInfo() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC21819
    public C22525 getNewPartitionInfo() {
        C22525 c22525 = this.newPartitionInfo_;
        return c22525 == null ? C22525.getDefaultInstance() : c22525;
    }

    @Override // l.InterfaceC21819
    public InterfaceC13353 getNewPartitionInfoOrBuilder() {
        C22525 c22525 = this.newPartitionInfo_;
        return c22525 == null ? C22525.getDefaultInstance() : c22525;
    }

    @Override // l.InterfaceC21819
    public List getOperationsList() {
        return this.operations_;
    }

    @Override // l.InterfaceC21819
    public List getOperationsOrBuilderList() {
        return this.operations_;
    }

    @Override // l.InterfaceC21819
    public int getOperationsCount() {
        return this.operations_.size();
    }

    @Override // l.InterfaceC21819
    public C4885 getOperations(int i) {
        return (C4885) this.operations_.get(i);
    }

    @Override // l.InterfaceC21819
    public InterfaceC11942 getOperationsOrBuilder(int i) {
        return (InterfaceC11942) this.operations_.get(i);
    }

    @Override // l.InterfaceC21819
    public boolean hasPostinstallOptional() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC21819
    public boolean getPostinstallOptional() {
        return this.postinstallOptional_;
    }

    @Override // l.InterfaceC21819
    public boolean hasHashTreeDataExtent() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // l.InterfaceC21819
    public C5903 getHashTreeDataExtent() {
        C5903 c5903 = this.hashTreeDataExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    @Override // l.InterfaceC21819
    public InterfaceC23543 getHashTreeDataExtentOrBuilder() {
        C5903 c5903 = this.hashTreeDataExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    @Override // l.InterfaceC21819
    public boolean hasHashTreeExtent() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // l.InterfaceC21819
    public C5903 getHashTreeExtent() {
        C5903 c5903 = this.hashTreeExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    @Override // l.InterfaceC21819
    public InterfaceC23543 getHashTreeExtentOrBuilder() {
        C5903 c5903 = this.hashTreeExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    @Override // l.InterfaceC21819
    public boolean hasHashTreeAlgorithm() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // l.InterfaceC21819
    public String getHashTreeAlgorithm() {
        Object obj = this.hashTreeAlgorithm_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.hashTreeAlgorithm_ = strM52260;
        }
        return strM52260;
    }

    @Override // l.InterfaceC21819
    public AbstractC23725 getHashTreeAlgorithmBytes() {
        Object obj = this.hashTreeAlgorithm_;
        if (obj instanceof String) {
            AbstractC23725 abstractC23725M52256 = AbstractC23725.m52256((String) obj);
            this.hashTreeAlgorithm_ = abstractC23725M52256;
            return abstractC23725M52256;
        }
        return (AbstractC23725) obj;
    }

    @Override // l.InterfaceC21819
    public boolean hasHashTreeSalt() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // l.InterfaceC21819
    public AbstractC23725 getHashTreeSalt() {
        return this.hashTreeSalt_;
    }

    @Override // l.InterfaceC21819
    public boolean hasFecDataExtent() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // l.InterfaceC21819
    public C5903 getFecDataExtent() {
        C5903 c5903 = this.fecDataExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    @Override // l.InterfaceC21819
    public InterfaceC23543 getFecDataExtentOrBuilder() {
        C5903 c5903 = this.fecDataExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    @Override // l.InterfaceC21819
    public boolean hasFecExtent() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // l.InterfaceC21819
    public C5903 getFecExtent() {
        C5903 c5903 = this.fecExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    @Override // l.InterfaceC21819
    public InterfaceC23543 getFecExtentOrBuilder() {
        C5903 c5903 = this.fecExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    @Override // l.InterfaceC21819
    public boolean hasFecRoots() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // l.InterfaceC21819
    public int getFecRoots() {
        return this.fecRoots_;
    }

    @Override // l.InterfaceC21819
    public boolean hasVersion() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // l.InterfaceC21819
    public String getVersion() {
        Object obj = this.version_;
        if (obj instanceof String) {
            return (String) obj;
        }
        AbstractC23725 abstractC23725 = (AbstractC23725) obj;
        String strM52260 = abstractC23725.m52260();
        if (abstractC23725.mo16494()) {
            this.version_ = strM52260;
        }
        return strM52260;
    }

    @Override // l.InterfaceC21819
    public AbstractC23725 getVersionBytes() {
        Object obj = this.version_;
        if (obj instanceof String) {
            AbstractC23725 abstractC23725M52256 = AbstractC23725.m52256((String) obj);
            this.version_ = abstractC23725M52256;
            return abstractC23725M52256;
        }
        return (AbstractC23725) obj;
    }

    @Override // l.InterfaceC21819
    public List getMergeOperationsList() {
        return this.mergeOperations_;
    }

    @Override // l.InterfaceC21819
    public List getMergeOperationsOrBuilderList() {
        return this.mergeOperations_;
    }

    @Override // l.InterfaceC21819
    public int getMergeOperationsCount() {
        return this.mergeOperations_.size();
    }

    @Override // l.InterfaceC21819
    public C12959 getMergeOperations(int i) {
        return (C12959) this.mergeOperations_.get(i);
    }

    @Override // l.InterfaceC21819
    public InterfaceC6608 getMergeOperationsOrBuilder(int i) {
        return (InterfaceC6608) this.mergeOperations_.get(i);
    }

    @Override // l.InterfaceC21819
    public boolean hasEstimateCowSize() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // l.InterfaceC21819
    public long getEstimateCowSize() {
        return this.estimateCowSize_;
    }

    @Override // l.InterfaceC21819
    public boolean hasEstimateOpCountMax() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // l.InterfaceC21819
    public long getEstimateOpCountMax() {
        return this.estimateOpCountMax_;
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

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public void writeTo(AbstractC22044 abstractC22044) {
        if ((this.bitField0_ & 1) != 0) {
            AbstractC18245.m42405(abstractC22044, 1, this.partitionName_);
        }
        if ((this.bitField0_ & 2) != 0) {
            abstractC22044.mo14240(2, this.runPostinstall_);
        }
        if ((this.bitField0_ & 4) != 0) {
            AbstractC18245.m42405(abstractC22044, 3, this.postinstallPath_);
        }
        if ((this.bitField0_ & 8) != 0) {
            AbstractC18245.m42405(abstractC22044, 4, this.filesystemType_);
        }
        for (int i = 0; i < this.newPartitionSignature_.size(); i++) {
            abstractC22044.mo14254(5, (InterfaceC23206) this.newPartitionSignature_.get(i));
        }
        if ((this.bitField0_ & 16) != 0) {
            abstractC22044.mo14254(6, getOldPartitionInfo());
        }
        if ((this.bitField0_ & 32) != 0) {
            abstractC22044.mo14254(7, getNewPartitionInfo());
        }
        for (int i2 = 0; i2 < this.operations_.size(); i2++) {
            abstractC22044.mo14254(8, (InterfaceC23206) this.operations_.get(i2));
        }
        if ((this.bitField0_ & 64) != 0) {
            abstractC22044.mo14240(9, this.postinstallOptional_);
        }
        if ((this.bitField0_ & 128) != 0) {
            abstractC22044.mo14254(10, getHashTreeDataExtent());
        }
        if ((this.bitField0_ & 256) != 0) {
            abstractC22044.mo14254(11, getHashTreeExtent());
        }
        if ((this.bitField0_ & 512) != 0) {
            AbstractC18245.m42405(abstractC22044, 12, this.hashTreeAlgorithm_);
        }
        if ((this.bitField0_ & 1024) != 0) {
            abstractC22044.mo14239(13, this.hashTreeSalt_);
        }
        if ((this.bitField0_ & 2048) != 0) {
            abstractC22044.mo14254(14, getFecDataExtent());
        }
        if ((this.bitField0_ & 4096) != 0) {
            abstractC22044.mo14254(15, getFecExtent());
        }
        if ((this.bitField0_ & 8192) != 0) {
            abstractC22044.mo14231(16, this.fecRoots_);
        }
        if ((this.bitField0_ & 16384) != 0) {
            AbstractC18245.m42405(abstractC22044, 17, this.version_);
        }
        for (int i3 = 0; i3 < this.mergeOperations_.size(); i3++) {
            abstractC22044.mo14254(18, (InterfaceC23206) this.mergeOperations_.get(i3));
        }
        if ((this.bitField0_ & 32768) != 0) {
            abstractC22044.mo14253(19, this.estimateCowSize_);
        }
        if ((this.bitField0_ & 65536) != 0) {
            abstractC22044.mo14253(20, this.estimateOpCountMax_);
        }
        getUnknownFields().writeTo(abstractC22044);
    }

    @Override // l.AbstractC18245, l.AbstractC23019, l.InterfaceC23206
    public int getSerializedSize() {
        int i = this.memoizedSize;
        if (i != -1) {
            return i;
        }
        int iM42390 = (this.bitField0_ & 1) != 0 ? AbstractC18245.m42390(1, this.partitionName_) : 0;
        if ((this.bitField0_ & 2) != 0) {
            iM42390 += AbstractC22044.m48961(2);
        }
        if ((this.bitField0_ & 4) != 0) {
            iM42390 += AbstractC18245.m42390(3, this.postinstallPath_);
        }
        if ((this.bitField0_ & 8) != 0) {
            iM42390 += AbstractC18245.m42390(4, this.filesystemType_);
        }
        for (int i2 = 0; i2 < this.newPartitionSignature_.size(); i2++) {
            iM42390 += AbstractC22044.m48963(5, (InterfaceC23206) this.newPartitionSignature_.get(i2));
        }
        if ((this.bitField0_ & 16) != 0) {
            iM42390 += AbstractC22044.m48963(6, getOldPartitionInfo());
        }
        if ((this.bitField0_ & 32) != 0) {
            iM42390 += AbstractC22044.m48963(7, getNewPartitionInfo());
        }
        for (int i3 = 0; i3 < this.operations_.size(); i3++) {
            iM42390 += AbstractC22044.m48963(8, (InterfaceC23206) this.operations_.get(i3));
        }
        if ((this.bitField0_ & 64) != 0) {
            iM42390 += AbstractC22044.m48961(9);
        }
        if ((this.bitField0_ & 128) != 0) {
            iM42390 += AbstractC22044.m48963(10, getHashTreeDataExtent());
        }
        if ((this.bitField0_ & 256) != 0) {
            iM42390 += AbstractC22044.m48963(11, getHashTreeExtent());
        }
        if ((this.bitField0_ & 512) != 0) {
            iM42390 += AbstractC18245.m42390(12, this.hashTreeAlgorithm_);
        }
        if ((this.bitField0_ & 1024) != 0) {
            iM42390 += AbstractC22044.m48968(13, this.hashTreeSalt_);
        }
        if ((this.bitField0_ & 2048) != 0) {
            iM42390 += AbstractC22044.m48963(14, getFecDataExtent());
        }
        if ((this.bitField0_ & 4096) != 0) {
            iM42390 += AbstractC22044.m48963(15, getFecExtent());
        }
        if ((this.bitField0_ & 8192) != 0) {
            iM42390 += AbstractC22044.m48960(16, this.fecRoots_);
        }
        if ((this.bitField0_ & 16384) != 0) {
            iM42390 += AbstractC18245.m42390(17, this.version_);
        }
        for (int i4 = 0; i4 < this.mergeOperations_.size(); i4++) {
            iM42390 += AbstractC22044.m48963(18, (InterfaceC23206) this.mergeOperations_.get(i4));
        }
        if ((this.bitField0_ & 32768) != 0) {
            iM42390 += AbstractC22044.m48962(19, this.estimateCowSize_);
        }
        if ((this.bitField0_ & 65536) != 0) {
            iM42390 += AbstractC22044.m48962(20, this.estimateOpCountMax_);
        }
        int serializedSize = getUnknownFields().getSerializedSize() + iM42390;
        this.memoizedSize = serializedSize;
        return serializedSize;
    }

    @Override // l.AbstractC23019
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23231)) {
            return super.equals(obj);
        }
        C23231 c23231 = (C23231) obj;
        if (hasPartitionName() != c23231.hasPartitionName()) {
            return false;
        }
        if ((hasPartitionName() && !getPartitionName().equals(c23231.getPartitionName())) || hasRunPostinstall() != c23231.hasRunPostinstall()) {
            return false;
        }
        if ((hasRunPostinstall() && getRunPostinstall() != c23231.getRunPostinstall()) || hasPostinstallPath() != c23231.hasPostinstallPath()) {
            return false;
        }
        if ((hasPostinstallPath() && !getPostinstallPath().equals(c23231.getPostinstallPath())) || hasFilesystemType() != c23231.hasFilesystemType()) {
            return false;
        }
        if ((hasFilesystemType() && !getFilesystemType().equals(c23231.getFilesystemType())) || !getNewPartitionSignatureList().equals(c23231.getNewPartitionSignatureList()) || hasOldPartitionInfo() != c23231.hasOldPartitionInfo()) {
            return false;
        }
        if ((hasOldPartitionInfo() && !getOldPartitionInfo().equals(c23231.getOldPartitionInfo())) || hasNewPartitionInfo() != c23231.hasNewPartitionInfo()) {
            return false;
        }
        if ((hasNewPartitionInfo() && !getNewPartitionInfo().equals(c23231.getNewPartitionInfo())) || !getOperationsList().equals(c23231.getOperationsList()) || hasPostinstallOptional() != c23231.hasPostinstallOptional()) {
            return false;
        }
        if ((hasPostinstallOptional() && getPostinstallOptional() != c23231.getPostinstallOptional()) || hasHashTreeDataExtent() != c23231.hasHashTreeDataExtent()) {
            return false;
        }
        if ((hasHashTreeDataExtent() && !getHashTreeDataExtent().equals(c23231.getHashTreeDataExtent())) || hasHashTreeExtent() != c23231.hasHashTreeExtent()) {
            return false;
        }
        if ((hasHashTreeExtent() && !getHashTreeExtent().equals(c23231.getHashTreeExtent())) || hasHashTreeAlgorithm() != c23231.hasHashTreeAlgorithm()) {
            return false;
        }
        if ((hasHashTreeAlgorithm() && !getHashTreeAlgorithm().equals(c23231.getHashTreeAlgorithm())) || hasHashTreeSalt() != c23231.hasHashTreeSalt()) {
            return false;
        }
        if ((hasHashTreeSalt() && !getHashTreeSalt().equals(c23231.getHashTreeSalt())) || hasFecDataExtent() != c23231.hasFecDataExtent()) {
            return false;
        }
        if ((hasFecDataExtent() && !getFecDataExtent().equals(c23231.getFecDataExtent())) || hasFecExtent() != c23231.hasFecExtent()) {
            return false;
        }
        if ((hasFecExtent() && !getFecExtent().equals(c23231.getFecExtent())) || hasFecRoots() != c23231.hasFecRoots()) {
            return false;
        }
        if ((hasFecRoots() && getFecRoots() != c23231.getFecRoots()) || hasVersion() != c23231.hasVersion()) {
            return false;
        }
        if ((hasVersion() && !getVersion().equals(c23231.getVersion())) || !getMergeOperationsList().equals(c23231.getMergeOperationsList()) || hasEstimateCowSize() != c23231.hasEstimateCowSize()) {
            return false;
        }
        if ((!hasEstimateCowSize() || getEstimateCowSize() == c23231.getEstimateCowSize()) && hasEstimateOpCountMax() == c23231.hasEstimateOpCountMax()) {
            return (!hasEstimateOpCountMax() || getEstimateOpCountMax() == c23231.getEstimateOpCountMax()) && getUnknownFields().equals(c23231.getUnknownFields());
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
        if (hasPartitionName()) {
            iHashCode = C17922.m41614(iHashCode, 37, 1, 53) + getPartitionName().hashCode();
        }
        if (hasRunPostinstall()) {
            iHashCode = C17922.m41614(iHashCode, 37, 2, 53) + C9779.m24888(getRunPostinstall());
        }
        if (hasPostinstallPath()) {
            iHashCode = C17922.m41614(iHashCode, 37, 3, 53) + getPostinstallPath().hashCode();
        }
        if (hasFilesystemType()) {
            iHashCode = C17922.m41614(iHashCode, 37, 4, 53) + getFilesystemType().hashCode();
        }
        if (getNewPartitionSignatureCount() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 5, 53) + getNewPartitionSignatureList().hashCode();
        }
        if (hasOldPartitionInfo()) {
            iHashCode = C17922.m41614(iHashCode, 37, 6, 53) + getOldPartitionInfo().hashCode();
        }
        if (hasNewPartitionInfo()) {
            iHashCode = C17922.m41614(iHashCode, 37, 7, 53) + getNewPartitionInfo().hashCode();
        }
        if (getOperationsCount() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 8, 53) + getOperationsList().hashCode();
        }
        if (hasPostinstallOptional()) {
            iHashCode = C17922.m41614(iHashCode, 37, 9, 53) + C9779.m24888(getPostinstallOptional());
        }
        if (hasHashTreeDataExtent()) {
            iHashCode = C17922.m41614(iHashCode, 37, 10, 53) + getHashTreeDataExtent().hashCode();
        }
        if (hasHashTreeExtent()) {
            iHashCode = C17922.m41614(iHashCode, 37, 11, 53) + getHashTreeExtent().hashCode();
        }
        if (hasHashTreeAlgorithm()) {
            iHashCode = C17922.m41614(iHashCode, 37, 12, 53) + getHashTreeAlgorithm().hashCode();
        }
        if (hasHashTreeSalt()) {
            iHashCode = C17922.m41614(iHashCode, 37, 13, 53) + getHashTreeSalt().hashCode();
        }
        if (hasFecDataExtent()) {
            iHashCode = C17922.m41614(iHashCode, 37, 14, 53) + getFecDataExtent().hashCode();
        }
        if (hasFecExtent()) {
            iHashCode = C17922.m41614(iHashCode, 37, 15, 53) + getFecExtent().hashCode();
        }
        if (hasFecRoots()) {
            iHashCode = C17922.m41614(iHashCode, 37, 16, 53) + getFecRoots();
        }
        if (hasVersion()) {
            iHashCode = C17922.m41614(iHashCode, 37, 17, 53) + getVersion().hashCode();
        }
        if (getMergeOperationsCount() > 0) {
            iHashCode = C17922.m41614(iHashCode, 37, 18, 53) + getMergeOperationsList().hashCode();
        }
        if (hasEstimateCowSize()) {
            iHashCode = C17922.m41614(iHashCode, 37, 19, 53) + C9779.m24887(getEstimateCowSize());
        }
        if (hasEstimateOpCountMax()) {
            iHashCode = C17922.m41614(iHashCode, 37, 20, 53) + C9779.m24887(getEstimateOpCountMax());
        }
        int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
        this.memoizedHashCode = iHashCode2;
        return iHashCode2;
    }

    public static C23231 parseFrom(ByteBuffer byteBuffer) {
        return (C23231) PARSER.parseFrom(byteBuffer);
    }

    public static C23231 parseFrom(ByteBuffer byteBuffer, C2701 c2701) {
        return (C23231) PARSER.parseFrom(byteBuffer, c2701);
    }

    public static C23231 parseFrom(AbstractC23725 abstractC23725) {
        return (C23231) PARSER.parseFrom(abstractC23725);
    }

    public static C23231 parseFrom(AbstractC23725 abstractC23725, C2701 c2701) {
        return (C23231) PARSER.parseFrom(abstractC23725, c2701);
    }

    public static C23231 parseFrom(byte[] bArr) {
        return (C23231) PARSER.parseFrom(bArr);
    }

    public static C23231 parseFrom(byte[] bArr, C2701 c2701) {
        return (C23231) PARSER.parseFrom(bArr, c2701);
    }

    public static C23231 parseFrom(InputStream inputStream) {
        return (C23231) AbstractC18245.m42418(PARSER, inputStream);
    }

    public static C23231 parseFrom(InputStream inputStream, C2701 c2701) {
        return (C23231) AbstractC18245.m42419(PARSER, inputStream, c2701);
    }

    public static C23231 parseDelimitedFrom(InputStream inputStream) {
        return (C23231) AbstractC18245.m42395(PARSER, inputStream);
    }

    public static C23231 parseDelimitedFrom(InputStream inputStream, C2701 c2701) {
        return (C23231) AbstractC18245.m42396(PARSER, inputStream, c2701);
    }

    public static C23231 parseFrom(AbstractC3262 abstractC3262) {
        return (C23231) AbstractC18245.m42397(PARSER, abstractC3262);
    }

    public static C23231 parseFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        return (C23231) AbstractC18245.m42398(PARSER, abstractC3262, c2701);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C7002 newBuilderForType() {
        return newBuilder();
    }

    public static C7002 newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static C7002 newBuilder(C23231 c23231) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(c23231);
    }

    @Override // l.AbstractC23019, l.InterfaceC23206
    public C7002 toBuilder() {
        int i = 0;
        return this == DEFAULT_INSTANCE ? new C7002(i) : new C7002(i).mergeFrom(this);
    }

    @Override // l.AbstractC23019
    public C7002 newBuilderForType(InterfaceC6790 interfaceC6790) {
        return new C7002(interfaceC6790, 0);
    }

    public static C23231 getDefaultInstance() {
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
    public C23231 getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }
}
