package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۧۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C11508 extends AbstractC15001 implements InterfaceC17475 {
    public int bitField0_;
    public long estimateCowSize_;
    public long estimateOpCountMax_;
    public C9998 fecDataExtentBuilder_;
    public C9776 fecDataExtent_;
    public C9998 fecExtentBuilder_;
    public C9776 fecExtent_;
    public int fecRoots_;
    public Object filesystemType_;
    public Object hashTreeAlgorithm_;
    public C9998 hashTreeDataExtentBuilder_;
    public C9776 hashTreeDataExtent_;
    public C9998 hashTreeExtentBuilder_;
    public C9776 hashTreeExtent_;
    public AbstractC17084 hashTreeSalt_;
    public C14473 mergeOperationsBuilder_;
    public List mergeOperations_;
    public C9998 newPartitionInfoBuilder_;
    public C15237 newPartitionInfo_;
    public C14473 newPartitionSignatureBuilder_;
    public List newPartitionSignature_;
    public C9998 oldPartitionInfoBuilder_;
    public C15237 oldPartitionInfo_;
    public C14473 operationsBuilder_;
    public List operations_;
    public Object partitionName_;
    public boolean postinstallOptional_;
    public Object postinstallPath_;
    public boolean runPostinstall_;
    public Object version_;

    public /* synthetic */ C11508(int i) {
        this();
    }

    public /* synthetic */ C11508(InterfaceC7937 interfaceC7937, int i) {
        this(interfaceC7937);
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_descriptor;
    }

    @Override // l.AbstractC15001
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_fieldAccessorTable;
        c7544.m20621(C24935.class, C11508.class);
        return c7544;
    }

    public C11508() {
        this.partitionName_ = "";
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        List list = Collections.EMPTY_LIST;
        this.newPartitionSignature_ = list;
        this.operations_ = list;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC17084.f55772;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.mergeOperations_ = list;
        maybeForceBuilderInitialization();
    }

    public C11508(InterfaceC7937 interfaceC7937) {
        super(interfaceC7937);
        this.partitionName_ = "";
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        List list = Collections.EMPTY_LIST;
        this.newPartitionSignature_ = list;
        this.operations_ = list;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC17084.f55772;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.mergeOperations_ = list;
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC9035.alwaysUseFieldBuilders) {
            getNewPartitionSignatureFieldBuilder();
            getOldPartitionInfoFieldBuilder();
            getNewPartitionInfoFieldBuilder();
            getOperationsFieldBuilder();
            getHashTreeDataExtentFieldBuilder();
            getHashTreeExtentFieldBuilder();
            getFecDataExtentFieldBuilder();
            getFecExtentFieldBuilder();
            getMergeOperationsFieldBuilder();
        }
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public C11508 mo2313clear() {
        super.mo2313clear();
        this.bitField0_ = 0;
        this.partitionName_ = "";
        this.runPostinstall_ = false;
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            this.newPartitionSignature_ = Collections.EMPTY_LIST;
        } else {
            this.newPartitionSignature_ = null;
            c14473.m34945();
        }
        this.bitField0_ &= -17;
        this.oldPartitionInfo_ = null;
        C9998 c9998 = this.oldPartitionInfoBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.oldPartitionInfoBuilder_ = null;
        }
        this.newPartitionInfo_ = null;
        C9998 c9999 = this.newPartitionInfoBuilder_;
        if (c9999 != null) {
            c9999.m25851();
            this.newPartitionInfoBuilder_ = null;
        }
        C14473 c14474 = this.operationsBuilder_;
        if (c14474 == null) {
            this.operations_ = Collections.EMPTY_LIST;
        } else {
            this.operations_ = null;
            c14474.m34945();
        }
        this.bitField0_ &= -129;
        this.postinstallOptional_ = false;
        this.hashTreeDataExtent_ = null;
        C9998 c99910 = this.hashTreeDataExtentBuilder_;
        if (c99910 != null) {
            c99910.m25851();
            this.hashTreeDataExtentBuilder_ = null;
        }
        this.hashTreeExtent_ = null;
        C9998 c99911 = this.hashTreeExtentBuilder_;
        if (c99911 != null) {
            c99911.m25851();
            this.hashTreeExtentBuilder_ = null;
        }
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC17084.f55772;
        this.fecDataExtent_ = null;
        C9998 c99912 = this.fecDataExtentBuilder_;
        if (c99912 != null) {
            c99912.m25851();
            this.fecDataExtentBuilder_ = null;
        }
        this.fecExtent_ = null;
        C9998 c99913 = this.fecExtentBuilder_;
        if (c99913 != null) {
            c99913.m25851();
            this.fecExtentBuilder_ = null;
        }
        this.fecRoots_ = 2;
        this.version_ = "";
        C14473 c14475 = this.mergeOperationsBuilder_;
        if (c14475 == null) {
            this.mergeOperations_ = Collections.EMPTY_LIST;
        } else {
            this.mergeOperations_ = null;
            c14475.m34945();
        }
        this.bitField0_ &= -131073;
        this.estimateCowSize_ = 0L;
        this.estimateOpCountMax_ = 0L;
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public C24478 getDescriptorForType() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_descriptor;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public C24935 getDefaultInstanceForType() {
        return C24935.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C24935 build() {
        C24935 c24935BuildPartial = buildPartial();
        if (c24935BuildPartial.isInitialized()) {
            return c24935BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c24935BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C24935 buildPartial() {
        C24935 c24935 = new C24935(this);
        buildPartialRepeatedFields(c24935);
        if (this.bitField0_ != 0) {
            buildPartial0(c24935);
        }
        onBuilt();
        return c24935;
    }

    private void buildPartialRepeatedFields(C24935 c24935) {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            if ((this.bitField0_ & 16) != 0) {
                this.newPartitionSignature_ = C4681.unmodifiableList(this.newPartitionSignature_);
                this.bitField0_ &= -17;
            }
            c24935.newPartitionSignature_ = this.newPartitionSignature_;
        } else {
            c24935.newPartitionSignature_ = c14473.m34950();
        }
        C14473 c14474 = this.operationsBuilder_;
        if (c14474 == null) {
            if ((this.bitField0_ & 128) != 0) {
                this.operations_ = C4681.unmodifiableList(this.operations_);
                this.bitField0_ &= -129;
            }
            c24935.operations_ = this.operations_;
        } else {
            c24935.operations_ = c14474.m34950();
        }
        C14473 c14475 = this.mergeOperationsBuilder_;
        if (c14475 == null) {
            if ((this.bitField0_ & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                this.mergeOperations_ = C4681.unmodifiableList(this.mergeOperations_);
                this.bitField0_ &= -131073;
            }
            c24935.mergeOperations_ = this.mergeOperations_;
            return;
        }
        c24935.mergeOperations_ = c14475.m34950();
    }

    private void buildPartial0(C24935 c24935) {
        int i;
        C9776 c9776;
        C9776 c9777;
        C9776 c9778;
        C9776 c9779;
        C15237 c15237;
        C15237 c15238;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c24935.partitionName_ = this.partitionName_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c24935.runPostinstall_ = this.runPostinstall_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c24935.postinstallPath_ = this.postinstallPath_;
            i |= 4;
        }
        if ((i2 & 8) != 0) {
            c24935.filesystemType_ = this.filesystemType_;
            i |= 8;
        }
        if ((i2 & 32) != 0) {
            C9998 c9998 = this.oldPartitionInfoBuilder_;
            if (c9998 == null) {
                c15238 = this.oldPartitionInfo_;
            } else {
                c15238 = (C15237) c9998.m25854();
            }
            c24935.oldPartitionInfo_ = c15238;
            i |= 16;
        }
        if ((i2 & 64) != 0) {
            C9998 c9999 = this.newPartitionInfoBuilder_;
            if (c9999 == null) {
                c15237 = this.newPartitionInfo_;
            } else {
                c15237 = (C15237) c9999.m25854();
            }
            c24935.newPartitionInfo_ = c15237;
            i |= 32;
        }
        if ((i2 & 256) != 0) {
            c24935.postinstallOptional_ = this.postinstallOptional_;
            i |= 64;
        }
        if ((i2 & 512) != 0) {
            C9998 c99910 = this.hashTreeDataExtentBuilder_;
            if (c99910 == null) {
                c9779 = this.hashTreeDataExtent_;
            } else {
                c9779 = (C9776) c99910.m25854();
            }
            c24935.hashTreeDataExtent_ = c9779;
            i |= 128;
        }
        if ((i2 & 1024) != 0) {
            C9998 c99911 = this.hashTreeExtentBuilder_;
            if (c99911 == null) {
                c9778 = this.hashTreeExtent_;
            } else {
                c9778 = (C9776) c99911.m25854();
            }
            c24935.hashTreeExtent_ = c9778;
            i |= 256;
        }
        if ((i2 & 2048) != 0) {
            c24935.hashTreeAlgorithm_ = this.hashTreeAlgorithm_;
            i |= 512;
        }
        if ((i2 & 4096) != 0) {
            c24935.hashTreeSalt_ = this.hashTreeSalt_;
            i |= 1024;
        }
        if ((i2 & 8192) != 0) {
            C9998 c99912 = this.fecDataExtentBuilder_;
            if (c99912 == null) {
                c9777 = this.fecDataExtent_;
            } else {
                c9777 = (C9776) c99912.m25854();
            }
            c24935.fecDataExtent_ = c9777;
            i |= 2048;
        }
        if ((i2 & 16384) != 0) {
            C9998 c99913 = this.fecExtentBuilder_;
            if (c99913 == null) {
                c9776 = this.fecExtent_;
            } else {
                c9776 = (C9776) c99913.m25854();
            }
            c24935.fecExtent_ = c9776;
            i |= 4096;
        }
        if ((i2 & 32768) != 0) {
            c24935.fecRoots_ = this.fecRoots_;
            i |= 8192;
        }
        if ((i2 & 65536) != 0) {
            c24935.version_ = this.version_;
            i |= 16384;
        }
        if ((262144 & i2) != 0) {
            c24935.estimateCowSize_ = this.estimateCowSize_;
            i |= 32768;
        }
        if ((i2 & 524288) != 0) {
            c24935.estimateOpCountMax_ = this.estimateOpCountMax_;
            i |= 65536;
        }
        c24935.bitField0_ |= i;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public C11508 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C24935) {
            return mergeFrom((C24935) interfaceC21013);
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    public C11508 mergeFrom(C24935 c24935) {
        if (c24935 == C24935.getDefaultInstance()) {
            return this;
        }
        if (c24935.hasPartitionName()) {
            this.partitionName_ = c24935.partitionName_;
            this.bitField0_ |= 1;
            onChanged();
        }
        if (c24935.hasRunPostinstall()) {
            setRunPostinstall(c24935.getRunPostinstall());
        }
        if (c24935.hasPostinstallPath()) {
            this.postinstallPath_ = c24935.postinstallPath_;
            this.bitField0_ |= 4;
            onChanged();
        }
        if (c24935.hasFilesystemType()) {
            this.filesystemType_ = c24935.filesystemType_;
            this.bitField0_ |= 8;
            onChanged();
        }
        if (this.newPartitionSignatureBuilder_ == null) {
            if (!c24935.newPartitionSignature_.isEmpty()) {
                if (this.newPartitionSignature_.isEmpty()) {
                    this.newPartitionSignature_ = c24935.newPartitionSignature_;
                    this.bitField0_ &= -17;
                } else {
                    ensureNewPartitionSignatureIsMutable();
                    this.newPartitionSignature_.addAll(c24935.newPartitionSignature_);
                }
                onChanged();
            }
        } else if (!c24935.newPartitionSignature_.isEmpty()) {
            if (this.newPartitionSignatureBuilder_.m34938()) {
                this.newPartitionSignatureBuilder_.m34954();
                this.newPartitionSignatureBuilder_ = null;
                this.newPartitionSignature_ = c24935.newPartitionSignature_;
                this.bitField0_ &= -17;
                this.newPartitionSignatureBuilder_ = AbstractC9035.alwaysUseFieldBuilders ? getNewPartitionSignatureFieldBuilder() : null;
            } else {
                this.newPartitionSignatureBuilder_.m34942(c24935.newPartitionSignature_);
            }
        }
        if (c24935.hasOldPartitionInfo()) {
            mergeOldPartitionInfo(c24935.getOldPartitionInfo());
        }
        if (c24935.hasNewPartitionInfo()) {
            mergeNewPartitionInfo(c24935.getNewPartitionInfo());
        }
        if (this.operationsBuilder_ == null) {
            if (!c24935.operations_.isEmpty()) {
                if (this.operations_.isEmpty()) {
                    this.operations_ = c24935.operations_;
                    this.bitField0_ &= -129;
                } else {
                    ensureOperationsIsMutable();
                    this.operations_.addAll(c24935.operations_);
                }
                onChanged();
            }
        } else if (!c24935.operations_.isEmpty()) {
            if (this.operationsBuilder_.m34938()) {
                this.operationsBuilder_.m34954();
                this.operationsBuilder_ = null;
                this.operations_ = c24935.operations_;
                this.bitField0_ &= -129;
                this.operationsBuilder_ = AbstractC9035.alwaysUseFieldBuilders ? getOperationsFieldBuilder() : null;
            } else {
                this.operationsBuilder_.m34942(c24935.operations_);
            }
        }
        if (c24935.hasPostinstallOptional()) {
            setPostinstallOptional(c24935.getPostinstallOptional());
        }
        if (c24935.hasHashTreeDataExtent()) {
            mergeHashTreeDataExtent(c24935.getHashTreeDataExtent());
        }
        if (c24935.hasHashTreeExtent()) {
            mergeHashTreeExtent(c24935.getHashTreeExtent());
        }
        if (c24935.hasHashTreeAlgorithm()) {
            this.hashTreeAlgorithm_ = c24935.hashTreeAlgorithm_;
            this.bitField0_ |= 2048;
            onChanged();
        }
        if (c24935.hasHashTreeSalt()) {
            setHashTreeSalt(c24935.getHashTreeSalt());
        }
        if (c24935.hasFecDataExtent()) {
            mergeFecDataExtent(c24935.getFecDataExtent());
        }
        if (c24935.hasFecExtent()) {
            mergeFecExtent(c24935.getFecExtent());
        }
        if (c24935.hasFecRoots()) {
            setFecRoots(c24935.getFecRoots());
        }
        if (c24935.hasVersion()) {
            this.version_ = c24935.version_;
            this.bitField0_ |= 65536;
            onChanged();
        }
        if (this.mergeOperationsBuilder_ == null) {
            if (!c24935.mergeOperations_.isEmpty()) {
                if (this.mergeOperations_.isEmpty()) {
                    this.mergeOperations_ = c24935.mergeOperations_;
                    this.bitField0_ &= -131073;
                } else {
                    ensureMergeOperationsIsMutable();
                    this.mergeOperations_.addAll(c24935.mergeOperations_);
                }
                onChanged();
            }
        } else if (!c24935.mergeOperations_.isEmpty()) {
            if (this.mergeOperationsBuilder_.m34938()) {
                this.mergeOperationsBuilder_.m34954();
                this.mergeOperationsBuilder_ = null;
                this.mergeOperations_ = c24935.mergeOperations_;
                this.bitField0_ &= -131073;
                this.mergeOperationsBuilder_ = AbstractC9035.alwaysUseFieldBuilders ? getMergeOperationsFieldBuilder() : null;
            } else {
                this.mergeOperationsBuilder_.m34942(c24935.mergeOperations_);
            }
        }
        if (c24935.hasEstimateCowSize()) {
            setEstimateCowSize(c24935.getEstimateCowSize());
        }
        if (c24935.hasEstimateOpCountMax()) {
            setEstimateOpCountMax(c24935.getEstimateOpCountMax());
        }
        mo2317mergeUnknownFields(c24935.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        if (!hasPartitionName()) {
            return false;
        }
        for (int i = 0; i < getOperationsCount(); i++) {
            if (!getOperations(i).isInitialized()) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public C11508 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    switch (iMo11876) {
                        case 0:
                            break;
                        case 10:
                            this.partitionName_ = abstractC3660.mo11890();
                            this.bitField0_ |= 1;
                            continue;
                        case 16:
                            this.runPostinstall_ = abstractC3660.mo11894();
                            this.bitField0_ |= 2;
                            continue;
                        case 26:
                            this.postinstallPath_ = abstractC3660.mo11890();
                            this.bitField0_ |= 4;
                            continue;
                        case 34:
                            this.filesystemType_ = abstractC3660.mo11890();
                            this.bitField0_ |= 8;
                            continue;
                        case 42:
                            C3305 c3305 = (C3305) abstractC3660.mo11877(C3305.parser(), c24215);
                            C14473 c14473 = this.newPartitionSignatureBuilder_;
                            if (c14473 == null) {
                                ensureNewPartitionSignatureIsMutable();
                                this.newPartitionSignature_.add(c3305);
                            } else {
                                c14473.m34953(c3305);
                                continue;
                            }
                            break;
                        case 50:
                            abstractC3660.mo11881(getOldPartitionInfoFieldBuilder().m25856(), c24215);
                            this.bitField0_ |= 32;
                            continue;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            abstractC3660.mo11881(getNewPartitionInfoFieldBuilder().m25856(), c24215);
                            this.bitField0_ |= 64;
                            continue;
                        case 66:
                            C4797 c4797 = (C4797) abstractC3660.mo11877(C4797.parser(), c24215);
                            C14473 c14474 = this.operationsBuilder_;
                            if (c14474 == null) {
                                ensureOperationsIsMutable();
                                this.operations_.add(c4797);
                            } else {
                                c14474.m34953(c4797);
                                continue;
                            }
                            break;
                        case 72:
                            this.postinstallOptional_ = abstractC3660.mo11894();
                            this.bitField0_ |= 256;
                            continue;
                        case 82:
                            abstractC3660.mo11881(getHashTreeDataExtentFieldBuilder().m25856(), c24215);
                            this.bitField0_ |= 512;
                            continue;
                        case 90:
                            abstractC3660.mo11881(getHashTreeExtentFieldBuilder().m25856(), c24215);
                            this.bitField0_ |= 1024;
                            continue;
                        case 98:
                            this.hashTreeAlgorithm_ = abstractC3660.mo11890();
                            this.bitField0_ |= 2048;
                            continue;
                        case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                            this.hashTreeSalt_ = abstractC3660.mo11890();
                            this.bitField0_ |= 4096;
                            continue;
                        case 114:
                            abstractC3660.mo11881(getFecDataExtentFieldBuilder().m25856(), c24215);
                            this.bitField0_ |= 8192;
                            continue;
                        case 122:
                            abstractC3660.mo11881(getFecExtentFieldBuilder().m25856(), c24215);
                            this.bitField0_ |= 16384;
                            continue;
                        case 128:
                            this.fecRoots_ = abstractC3660.mo11889();
                            this.bitField0_ |= 32768;
                            continue;
                        case 138:
                            this.version_ = abstractC3660.mo11890();
                            this.bitField0_ |= 65536;
                            continue;
                        case 146:
                            C5303 c5303 = (C5303) abstractC3660.mo11877(C5303.parser(), c24215);
                            C14473 c14475 = this.mergeOperationsBuilder_;
                            if (c14475 == null) {
                                ensureMergeOperationsIsMutable();
                                this.mergeOperations_.add(c5303);
                            } else {
                                c14475.m34953(c5303);
                                continue;
                            }
                            break;
                        case 152:
                            this.estimateCowSize_ = abstractC3660.mo11896();
                            this.bitField0_ |= 262144;
                            continue;
                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                            this.estimateOpCountMax_ = abstractC3660.mo11896();
                            this.bitField0_ |= 524288;
                            continue;
                        default:
                            if (!super.parseUnknownField(abstractC3660, c24215, iMo11876)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (C20463 e) {
                    throw e.m46971();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
        return this;
    }

    @Override // l.InterfaceC17475
    public boolean hasPartitionName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC17475
    public String getPartitionName() {
        Object obj = this.partitionName_;
        if (!(obj instanceof String)) {
            AbstractC17084 abstractC17084 = (AbstractC17084) obj;
            String strM40221 = abstractC17084.m40221();
            if (abstractC17084.mo29729()) {
                this.partitionName_ = strM40221;
            }
            return strM40221;
        }
        return (String) obj;
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

    public C11508 setPartitionName(String str) {
        str.getClass();
        this.partitionName_ = str;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C11508 clearPartitionName() {
        this.partitionName_ = C24935.getDefaultInstance().getPartitionName();
        this.bitField0_ &= -2;
        onChanged();
        return this;
    }

    public C11508 setPartitionNameBytes(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.partitionName_ = abstractC17084;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC17475
    public boolean hasRunPostinstall() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC17475
    public boolean getRunPostinstall() {
        return this.runPostinstall_;
    }

    public C11508 setRunPostinstall(boolean z) {
        this.runPostinstall_ = z;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C11508 clearRunPostinstall() {
        this.bitField0_ &= -3;
        this.runPostinstall_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC17475
    public boolean hasPostinstallPath() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC17475
    public String getPostinstallPath() {
        Object obj = this.postinstallPath_;
        if (!(obj instanceof String)) {
            AbstractC17084 abstractC17084 = (AbstractC17084) obj;
            String strM40221 = abstractC17084.m40221();
            if (abstractC17084.mo29729()) {
                this.postinstallPath_ = strM40221;
            }
            return strM40221;
        }
        return (String) obj;
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

    public C11508 setPostinstallPath(String str) {
        str.getClass();
        this.postinstallPath_ = str;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C11508 clearPostinstallPath() {
        this.postinstallPath_ = C24935.getDefaultInstance().getPostinstallPath();
        this.bitField0_ &= -5;
        onChanged();
        return this;
    }

    public C11508 setPostinstallPathBytes(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.postinstallPath_ = abstractC17084;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC17475
    public boolean hasFilesystemType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC17475
    public String getFilesystemType() {
        Object obj = this.filesystemType_;
        if (!(obj instanceof String)) {
            AbstractC17084 abstractC17084 = (AbstractC17084) obj;
            String strM40221 = abstractC17084.m40221();
            if (abstractC17084.mo29729()) {
                this.filesystemType_ = strM40221;
            }
            return strM40221;
        }
        return (String) obj;
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

    public C11508 setFilesystemType(String str) {
        str.getClass();
        this.filesystemType_ = str;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C11508 clearFilesystemType() {
        this.filesystemType_ = C24935.getDefaultInstance().getFilesystemType();
        this.bitField0_ &= -9;
        onChanged();
        return this;
    }

    public C11508 setFilesystemTypeBytes(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.filesystemType_ = abstractC17084;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    private void ensureNewPartitionSignatureIsMutable() {
        if ((this.bitField0_ & 16) == 0) {
            this.newPartitionSignature_ = new ArrayList(this.newPartitionSignature_);
            this.bitField0_ |= 16;
        }
    }

    @Override // l.InterfaceC17475
    public List getNewPartitionSignatureList() {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            return C4681.unmodifiableList(this.newPartitionSignature_);
        }
        return c14473.m34947();
    }

    @Override // l.InterfaceC17475
    public int getNewPartitionSignatureCount() {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            return this.newPartitionSignature_.size();
        }
        return c14473.m34948();
    }

    @Override // l.InterfaceC17475
    public C3305 getNewPartitionSignature(int i) {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            return (C3305) this.newPartitionSignature_.get(i);
        }
        return (C3305) c14473.m34951(i);
    }

    public C11508 setNewPartitionSignature(int i, C3305 c3305) {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            c3305.getClass();
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.set(i, c3305);
            onChanged();
            return this;
        }
        c14473.m34946(i, c3305);
        return this;
    }

    public C11508 setNewPartitionSignature(int i, C23443 c23443) {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.set(i, c23443.build());
            onChanged();
            return this;
        }
        c14473.m34946(i, c23443.build());
        return this;
    }

    public C11508 addNewPartitionSignature(C3305 c3305) {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            c3305.getClass();
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(c3305);
            onChanged();
            return this;
        }
        c14473.m34953(c3305);
        return this;
    }

    public C11508 addNewPartitionSignature(int i, C3305 c3305) {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            c3305.getClass();
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(i, c3305);
            onChanged();
            return this;
        }
        c14473.m34952(i, c3305);
        return this;
    }

    public C11508 addNewPartitionSignature(C23443 c23443) {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(c23443.build());
            onChanged();
            return this;
        }
        c14473.m34953(c23443.build());
        return this;
    }

    public C11508 addNewPartitionSignature(int i, C23443 c23443) {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(i, c23443.build());
            onChanged();
            return this;
        }
        c14473.m34952(i, c23443.build());
        return this;
    }

    public C11508 addAllNewPartitionSignature(Iterable iterable) {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            ensureNewPartitionSignatureIsMutable();
            AbstractC1225.m4447(iterable, this.newPartitionSignature_);
            onChanged();
            return this;
        }
        c14473.m34942(iterable);
        return this;
    }

    public C11508 clearNewPartitionSignature() {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            this.newPartitionSignature_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }
        c14473.m34945();
        return this;
    }

    public C11508 removeNewPartitionSignature(int i) {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.remove(i);
            onChanged();
            return this;
        }
        c14473.m34955(i);
        return this;
    }

    public C23443 getNewPartitionSignatureBuilder(int i) {
        return (C23443) getNewPartitionSignatureFieldBuilder().m34939(i);
    }

    @Override // l.InterfaceC17475
    public InterfaceC12254 getNewPartitionSignatureOrBuilder(int i) {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 == null) {
            return (InterfaceC12254) this.newPartitionSignature_.get(i);
        }
        return (InterfaceC12254) c14473.m34944(i);
    }

    @Override // l.InterfaceC17475
    public List getNewPartitionSignatureOrBuilderList() {
        C14473 c14473 = this.newPartitionSignatureBuilder_;
        if (c14473 != null) {
            return c14473.m34943();
        }
        return C4681.unmodifiableList(this.newPartitionSignature_);
    }

    public C23443 addNewPartitionSignatureBuilder() {
        return (C23443) getNewPartitionSignatureFieldBuilder().m34941(C3305.getDefaultInstance());
    }

    public C23443 addNewPartitionSignatureBuilder(int i) {
        return (C23443) getNewPartitionSignatureFieldBuilder().m34940(i, C3305.getDefaultInstance());
    }

    public List getNewPartitionSignatureBuilderList() {
        return getNewPartitionSignatureFieldBuilder().m34949();
    }

    private C14473 getNewPartitionSignatureFieldBuilder() {
        if (this.newPartitionSignatureBuilder_ == null) {
            this.newPartitionSignatureBuilder_ = new C14473(this.newPartitionSignature_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
            this.newPartitionSignature_ = null;
        }
        return this.newPartitionSignatureBuilder_;
    }

    @Override // l.InterfaceC17475
    public boolean hasOldPartitionInfo() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC17475
    public C15237 getOldPartitionInfo() {
        C9998 c9998 = this.oldPartitionInfoBuilder_;
        if (c9998 == null) {
            C15237 c15237 = this.oldPartitionInfo_;
            return c15237 == null ? C15237.getDefaultInstance() : c15237;
        }
        return (C15237) c9998.m25853();
    }

    public C11508 setOldPartitionInfo(C15237 c15237) {
        C9998 c9998 = this.oldPartitionInfoBuilder_;
        if (c9998 == null) {
            c15237.getClass();
            this.oldPartitionInfo_ = c15237;
        } else {
            c9998.m25855(c15237);
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C11508 setOldPartitionInfo(C19713 c19713) {
        C9998 c9998 = this.oldPartitionInfoBuilder_;
        if (c9998 == null) {
            this.oldPartitionInfo_ = c19713.build();
        } else {
            c9998.m25855(c19713.build());
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C11508 mergeOldPartitionInfo(C15237 c15237) {
        C15237 c15238;
        C9998 c9998 = this.oldPartitionInfoBuilder_;
        if (c9998 == null) {
            if ((this.bitField0_ & 32) != 0 && (c15238 = this.oldPartitionInfo_) != null && c15238 != C15237.getDefaultInstance()) {
                getOldPartitionInfoBuilder().mergeFrom(c15237);
            } else {
                this.oldPartitionInfo_ = c15237;
            }
        } else {
            c9998.m25850(c15237);
        }
        if (this.oldPartitionInfo_ != null) {
            this.bitField0_ |= 32;
            onChanged();
        }
        return this;
    }

    public C11508 clearOldPartitionInfo() {
        this.bitField0_ &= -33;
        this.oldPartitionInfo_ = null;
        C9998 c9998 = this.oldPartitionInfoBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.oldPartitionInfoBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C19713 getOldPartitionInfoBuilder() {
        this.bitField0_ |= 32;
        onChanged();
        return (C19713) getOldPartitionInfoFieldBuilder().m25856();
    }

    @Override // l.InterfaceC17475
    public InterfaceC5543 getOldPartitionInfoOrBuilder() {
        C9998 c9998 = this.oldPartitionInfoBuilder_;
        if (c9998 != null) {
            return (InterfaceC5543) c9998.m25852();
        }
        C15237 c15237 = this.oldPartitionInfo_;
        return c15237 == null ? C15237.getDefaultInstance() : c15237;
    }

    private C9998 getOldPartitionInfoFieldBuilder() {
        if (this.oldPartitionInfoBuilder_ == null) {
            this.oldPartitionInfoBuilder_ = new C9998(getOldPartitionInfo(), getParentForChildren(), isClean());
            this.oldPartitionInfo_ = null;
        }
        return this.oldPartitionInfoBuilder_;
    }

    @Override // l.InterfaceC17475
    public boolean hasNewPartitionInfo() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC17475
    public C15237 getNewPartitionInfo() {
        C9998 c9998 = this.newPartitionInfoBuilder_;
        if (c9998 == null) {
            C15237 c15237 = this.newPartitionInfo_;
            return c15237 == null ? C15237.getDefaultInstance() : c15237;
        }
        return (C15237) c9998.m25853();
    }

    public C11508 setNewPartitionInfo(C15237 c15237) {
        C9998 c9998 = this.newPartitionInfoBuilder_;
        if (c9998 == null) {
            c15237.getClass();
            this.newPartitionInfo_ = c15237;
        } else {
            c9998.m25855(c15237);
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C11508 setNewPartitionInfo(C19713 c19713) {
        C9998 c9998 = this.newPartitionInfoBuilder_;
        if (c9998 == null) {
            this.newPartitionInfo_ = c19713.build();
        } else {
            c9998.m25855(c19713.build());
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C11508 mergeNewPartitionInfo(C15237 c15237) {
        C15237 c15238;
        C9998 c9998 = this.newPartitionInfoBuilder_;
        if (c9998 == null) {
            if ((this.bitField0_ & 64) != 0 && (c15238 = this.newPartitionInfo_) != null && c15238 != C15237.getDefaultInstance()) {
                getNewPartitionInfoBuilder().mergeFrom(c15237);
            } else {
                this.newPartitionInfo_ = c15237;
            }
        } else {
            c9998.m25850(c15237);
        }
        if (this.newPartitionInfo_ != null) {
            this.bitField0_ |= 64;
            onChanged();
        }
        return this;
    }

    public C11508 clearNewPartitionInfo() {
        this.bitField0_ &= -65;
        this.newPartitionInfo_ = null;
        C9998 c9998 = this.newPartitionInfoBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.newPartitionInfoBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C19713 getNewPartitionInfoBuilder() {
        this.bitField0_ |= 64;
        onChanged();
        return (C19713) getNewPartitionInfoFieldBuilder().m25856();
    }

    @Override // l.InterfaceC17475
    public InterfaceC5543 getNewPartitionInfoOrBuilder() {
        C9998 c9998 = this.newPartitionInfoBuilder_;
        if (c9998 != null) {
            return (InterfaceC5543) c9998.m25852();
        }
        C15237 c15237 = this.newPartitionInfo_;
        return c15237 == null ? C15237.getDefaultInstance() : c15237;
    }

    private C9998 getNewPartitionInfoFieldBuilder() {
        if (this.newPartitionInfoBuilder_ == null) {
            this.newPartitionInfoBuilder_ = new C9998(getNewPartitionInfo(), getParentForChildren(), isClean());
            this.newPartitionInfo_ = null;
        }
        return this.newPartitionInfoBuilder_;
    }

    private void ensureOperationsIsMutable() {
        if ((this.bitField0_ & 128) == 0) {
            this.operations_ = new ArrayList(this.operations_);
            this.bitField0_ |= 128;
        }
    }

    @Override // l.InterfaceC17475
    public List getOperationsList() {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 == null) {
            return C4681.unmodifiableList(this.operations_);
        }
        return c14473.m34947();
    }

    @Override // l.InterfaceC17475
    public int getOperationsCount() {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 == null) {
            return this.operations_.size();
        }
        return c14473.m34948();
    }

    @Override // l.InterfaceC17475
    public C4797 getOperations(int i) {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 == null) {
            return (C4797) this.operations_.get(i);
        }
        return (C4797) c14473.m34951(i);
    }

    public C11508 setOperations(int i, C4797 c4797) {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 == null) {
            c4797.getClass();
            ensureOperationsIsMutable();
            this.operations_.set(i, c4797);
            onChanged();
            return this;
        }
        c14473.m34946(i, c4797);
        return this;
    }

    public C11508 setOperations(int i, C8286 c8286) {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 == null) {
            ensureOperationsIsMutable();
            this.operations_.set(i, c8286.build());
            onChanged();
            return this;
        }
        c14473.m34946(i, c8286.build());
        return this;
    }

    public C11508 addOperations(C4797 c4797) {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 == null) {
            c4797.getClass();
            ensureOperationsIsMutable();
            this.operations_.add(c4797);
            onChanged();
            return this;
        }
        c14473.m34953(c4797);
        return this;
    }

    public C11508 addOperations(int i, C4797 c4797) {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 == null) {
            c4797.getClass();
            ensureOperationsIsMutable();
            this.operations_.add(i, c4797);
            onChanged();
            return this;
        }
        c14473.m34952(i, c4797);
        return this;
    }

    public C11508 addOperations(C8286 c8286) {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 == null) {
            ensureOperationsIsMutable();
            this.operations_.add(c8286.build());
            onChanged();
            return this;
        }
        c14473.m34953(c8286.build());
        return this;
    }

    public C11508 addOperations(int i, C8286 c8286) {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 == null) {
            ensureOperationsIsMutable();
            this.operations_.add(i, c8286.build());
            onChanged();
            return this;
        }
        c14473.m34952(i, c8286.build());
        return this;
    }

    public C11508 addAllOperations(Iterable iterable) {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 == null) {
            ensureOperationsIsMutable();
            AbstractC1225.m4447(iterable, this.operations_);
            onChanged();
            return this;
        }
        c14473.m34942(iterable);
        return this;
    }

    public C11508 clearOperations() {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 == null) {
            this.operations_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }
        c14473.m34945();
        return this;
    }

    public C11508 removeOperations(int i) {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 == null) {
            ensureOperationsIsMutable();
            this.operations_.remove(i);
            onChanged();
            return this;
        }
        c14473.m34955(i);
        return this;
    }

    public C8286 getOperationsBuilder(int i) {
        return (C8286) getOperationsFieldBuilder().m34939(i);
    }

    @Override // l.InterfaceC17475
    public InterfaceC10762 getOperationsOrBuilder(int i) {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 == null) {
            return (InterfaceC10762) this.operations_.get(i);
        }
        return (InterfaceC10762) c14473.m34944(i);
    }

    @Override // l.InterfaceC17475
    public List getOperationsOrBuilderList() {
        C14473 c14473 = this.operationsBuilder_;
        if (c14473 != null) {
            return c14473.m34943();
        }
        return C4681.unmodifiableList(this.operations_);
    }

    public C8286 addOperationsBuilder() {
        return (C8286) getOperationsFieldBuilder().m34941(C4797.getDefaultInstance());
    }

    public C8286 addOperationsBuilder(int i) {
        return (C8286) getOperationsFieldBuilder().m34940(i, C4797.getDefaultInstance());
    }

    public List getOperationsBuilderList() {
        return getOperationsFieldBuilder().m34949();
    }

    private C14473 getOperationsFieldBuilder() {
        if (this.operationsBuilder_ == null) {
            this.operationsBuilder_ = new C14473(this.operations_, (this.bitField0_ & 128) != 0, getParentForChildren(), isClean());
            this.operations_ = null;
        }
        return this.operationsBuilder_;
    }

    @Override // l.InterfaceC17475
    public boolean hasPostinstallOptional() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // l.InterfaceC17475
    public boolean getPostinstallOptional() {
        return this.postinstallOptional_;
    }

    public C11508 setPostinstallOptional(boolean z) {
        this.postinstallOptional_ = z;
        this.bitField0_ |= 256;
        onChanged();
        return this;
    }

    public C11508 clearPostinstallOptional() {
        this.bitField0_ &= -257;
        this.postinstallOptional_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC17475
    public boolean hasHashTreeDataExtent() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // l.InterfaceC17475
    public C9776 getHashTreeDataExtent() {
        C9998 c9998 = this.hashTreeDataExtentBuilder_;
        if (c9998 == null) {
            C9776 c9776 = this.hashTreeDataExtent_;
            return c9776 == null ? C9776.getDefaultInstance() : c9776;
        }
        return (C9776) c9998.m25853();
    }

    public C11508 setHashTreeDataExtent(C9776 c9776) {
        C9998 c9998 = this.hashTreeDataExtentBuilder_;
        if (c9998 == null) {
            c9776.getClass();
            this.hashTreeDataExtent_ = c9776;
        } else {
            c9998.m25855(c9776);
        }
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }

    public C11508 setHashTreeDataExtent(C18727 c18727) {
        C9998 c9998 = this.hashTreeDataExtentBuilder_;
        if (c9998 == null) {
            this.hashTreeDataExtent_ = c18727.build();
        } else {
            c9998.m25855(c18727.build());
        }
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }

    public C11508 mergeHashTreeDataExtent(C9776 c9776) {
        C9776 c9777;
        C9998 c9998 = this.hashTreeDataExtentBuilder_;
        if (c9998 == null) {
            if ((this.bitField0_ & 512) != 0 && (c9777 = this.hashTreeDataExtent_) != null && c9777 != C9776.getDefaultInstance()) {
                getHashTreeDataExtentBuilder().mergeFrom(c9776);
            } else {
                this.hashTreeDataExtent_ = c9776;
            }
        } else {
            c9998.m25850(c9776);
        }
        if (this.hashTreeDataExtent_ != null) {
            this.bitField0_ |= 512;
            onChanged();
        }
        return this;
    }

    public C11508 clearHashTreeDataExtent() {
        this.bitField0_ &= -513;
        this.hashTreeDataExtent_ = null;
        C9998 c9998 = this.hashTreeDataExtentBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.hashTreeDataExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C18727 getHashTreeDataExtentBuilder() {
        this.bitField0_ |= 512;
        onChanged();
        return (C18727) getHashTreeDataExtentFieldBuilder().m25856();
    }

    @Override // l.InterfaceC17475
    public InterfaceC9031 getHashTreeDataExtentOrBuilder() {
        C9998 c9998 = this.hashTreeDataExtentBuilder_;
        if (c9998 != null) {
            return (InterfaceC9031) c9998.m25852();
        }
        C9776 c9776 = this.hashTreeDataExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    private C9998 getHashTreeDataExtentFieldBuilder() {
        if (this.hashTreeDataExtentBuilder_ == null) {
            this.hashTreeDataExtentBuilder_ = new C9998(getHashTreeDataExtent(), getParentForChildren(), isClean());
            this.hashTreeDataExtent_ = null;
        }
        return this.hashTreeDataExtentBuilder_;
    }

    @Override // l.InterfaceC17475
    public boolean hasHashTreeExtent() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // l.InterfaceC17475
    public C9776 getHashTreeExtent() {
        C9998 c9998 = this.hashTreeExtentBuilder_;
        if (c9998 == null) {
            C9776 c9776 = this.hashTreeExtent_;
            return c9776 == null ? C9776.getDefaultInstance() : c9776;
        }
        return (C9776) c9998.m25853();
    }

    public C11508 setHashTreeExtent(C9776 c9776) {
        C9998 c9998 = this.hashTreeExtentBuilder_;
        if (c9998 == null) {
            c9776.getClass();
            this.hashTreeExtent_ = c9776;
        } else {
            c9998.m25855(c9776);
        }
        this.bitField0_ |= 1024;
        onChanged();
        return this;
    }

    public C11508 setHashTreeExtent(C18727 c18727) {
        C9998 c9998 = this.hashTreeExtentBuilder_;
        if (c9998 == null) {
            this.hashTreeExtent_ = c18727.build();
        } else {
            c9998.m25855(c18727.build());
        }
        this.bitField0_ |= 1024;
        onChanged();
        return this;
    }

    public C11508 mergeHashTreeExtent(C9776 c9776) {
        C9776 c9777;
        C9998 c9998 = this.hashTreeExtentBuilder_;
        if (c9998 == null) {
            if ((this.bitField0_ & 1024) != 0 && (c9777 = this.hashTreeExtent_) != null && c9777 != C9776.getDefaultInstance()) {
                getHashTreeExtentBuilder().mergeFrom(c9776);
            } else {
                this.hashTreeExtent_ = c9776;
            }
        } else {
            c9998.m25850(c9776);
        }
        if (this.hashTreeExtent_ != null) {
            this.bitField0_ |= 1024;
            onChanged();
        }
        return this;
    }

    public C11508 clearHashTreeExtent() {
        this.bitField0_ &= -1025;
        this.hashTreeExtent_ = null;
        C9998 c9998 = this.hashTreeExtentBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.hashTreeExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C18727 getHashTreeExtentBuilder() {
        this.bitField0_ |= 1024;
        onChanged();
        return (C18727) getHashTreeExtentFieldBuilder().m25856();
    }

    @Override // l.InterfaceC17475
    public InterfaceC9031 getHashTreeExtentOrBuilder() {
        C9998 c9998 = this.hashTreeExtentBuilder_;
        if (c9998 != null) {
            return (InterfaceC9031) c9998.m25852();
        }
        C9776 c9776 = this.hashTreeExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    private C9998 getHashTreeExtentFieldBuilder() {
        if (this.hashTreeExtentBuilder_ == null) {
            this.hashTreeExtentBuilder_ = new C9998(getHashTreeExtent(), getParentForChildren(), isClean());
            this.hashTreeExtent_ = null;
        }
        return this.hashTreeExtentBuilder_;
    }

    @Override // l.InterfaceC17475
    public boolean hasHashTreeAlgorithm() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // l.InterfaceC17475
    public String getHashTreeAlgorithm() {
        Object obj = this.hashTreeAlgorithm_;
        if (!(obj instanceof String)) {
            AbstractC17084 abstractC17084 = (AbstractC17084) obj;
            String strM40221 = abstractC17084.m40221();
            if (abstractC17084.mo29729()) {
                this.hashTreeAlgorithm_ = strM40221;
            }
            return strM40221;
        }
        return (String) obj;
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

    public C11508 setHashTreeAlgorithm(String str) {
        str.getClass();
        this.hashTreeAlgorithm_ = str;
        this.bitField0_ |= 2048;
        onChanged();
        return this;
    }

    public C11508 clearHashTreeAlgorithm() {
        this.hashTreeAlgorithm_ = C24935.getDefaultInstance().getHashTreeAlgorithm();
        this.bitField0_ &= -2049;
        onChanged();
        return this;
    }

    public C11508 setHashTreeAlgorithmBytes(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.hashTreeAlgorithm_ = abstractC17084;
        this.bitField0_ |= 2048;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC17475
    public boolean hasHashTreeSalt() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // l.InterfaceC17475
    public AbstractC17084 getHashTreeSalt() {
        return this.hashTreeSalt_;
    }

    public C11508 setHashTreeSalt(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.hashTreeSalt_ = abstractC17084;
        this.bitField0_ |= 4096;
        onChanged();
        return this;
    }

    public C11508 clearHashTreeSalt() {
        this.bitField0_ &= -4097;
        this.hashTreeSalt_ = C24935.getDefaultInstance().getHashTreeSalt();
        onChanged();
        return this;
    }

    @Override // l.InterfaceC17475
    public boolean hasFecDataExtent() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // l.InterfaceC17475
    public C9776 getFecDataExtent() {
        C9998 c9998 = this.fecDataExtentBuilder_;
        if (c9998 == null) {
            C9776 c9776 = this.fecDataExtent_;
            return c9776 == null ? C9776.getDefaultInstance() : c9776;
        }
        return (C9776) c9998.m25853();
    }

    public C11508 setFecDataExtent(C9776 c9776) {
        C9998 c9998 = this.fecDataExtentBuilder_;
        if (c9998 == null) {
            c9776.getClass();
            this.fecDataExtent_ = c9776;
        } else {
            c9998.m25855(c9776);
        }
        this.bitField0_ |= 8192;
        onChanged();
        return this;
    }

    public C11508 setFecDataExtent(C18727 c18727) {
        C9998 c9998 = this.fecDataExtentBuilder_;
        if (c9998 == null) {
            this.fecDataExtent_ = c18727.build();
        } else {
            c9998.m25855(c18727.build());
        }
        this.bitField0_ |= 8192;
        onChanged();
        return this;
    }

    public C11508 mergeFecDataExtent(C9776 c9776) {
        C9776 c9777;
        C9998 c9998 = this.fecDataExtentBuilder_;
        if (c9998 == null) {
            if ((this.bitField0_ & 8192) != 0 && (c9777 = this.fecDataExtent_) != null && c9777 != C9776.getDefaultInstance()) {
                getFecDataExtentBuilder().mergeFrom(c9776);
            } else {
                this.fecDataExtent_ = c9776;
            }
        } else {
            c9998.m25850(c9776);
        }
        if (this.fecDataExtent_ != null) {
            this.bitField0_ |= 8192;
            onChanged();
        }
        return this;
    }

    public C11508 clearFecDataExtent() {
        this.bitField0_ &= -8193;
        this.fecDataExtent_ = null;
        C9998 c9998 = this.fecDataExtentBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.fecDataExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C18727 getFecDataExtentBuilder() {
        this.bitField0_ |= 8192;
        onChanged();
        return (C18727) getFecDataExtentFieldBuilder().m25856();
    }

    @Override // l.InterfaceC17475
    public InterfaceC9031 getFecDataExtentOrBuilder() {
        C9998 c9998 = this.fecDataExtentBuilder_;
        if (c9998 != null) {
            return (InterfaceC9031) c9998.m25852();
        }
        C9776 c9776 = this.fecDataExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    private C9998 getFecDataExtentFieldBuilder() {
        if (this.fecDataExtentBuilder_ == null) {
            this.fecDataExtentBuilder_ = new C9998(getFecDataExtent(), getParentForChildren(), isClean());
            this.fecDataExtent_ = null;
        }
        return this.fecDataExtentBuilder_;
    }

    @Override // l.InterfaceC17475
    public boolean hasFecExtent() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // l.InterfaceC17475
    public C9776 getFecExtent() {
        C9998 c9998 = this.fecExtentBuilder_;
        if (c9998 == null) {
            C9776 c9776 = this.fecExtent_;
            return c9776 == null ? C9776.getDefaultInstance() : c9776;
        }
        return (C9776) c9998.m25853();
    }

    public C11508 setFecExtent(C9776 c9776) {
        C9998 c9998 = this.fecExtentBuilder_;
        if (c9998 == null) {
            c9776.getClass();
            this.fecExtent_ = c9776;
        } else {
            c9998.m25855(c9776);
        }
        this.bitField0_ |= 16384;
        onChanged();
        return this;
    }

    public C11508 setFecExtent(C18727 c18727) {
        C9998 c9998 = this.fecExtentBuilder_;
        if (c9998 == null) {
            this.fecExtent_ = c18727.build();
        } else {
            c9998.m25855(c18727.build());
        }
        this.bitField0_ |= 16384;
        onChanged();
        return this;
    }

    public C11508 mergeFecExtent(C9776 c9776) {
        C9776 c9777;
        C9998 c9998 = this.fecExtentBuilder_;
        if (c9998 == null) {
            if ((this.bitField0_ & 16384) != 0 && (c9777 = this.fecExtent_) != null && c9777 != C9776.getDefaultInstance()) {
                getFecExtentBuilder().mergeFrom(c9776);
            } else {
                this.fecExtent_ = c9776;
            }
        } else {
            c9998.m25850(c9776);
        }
        if (this.fecExtent_ != null) {
            this.bitField0_ |= 16384;
            onChanged();
        }
        return this;
    }

    public C11508 clearFecExtent() {
        this.bitField0_ &= -16385;
        this.fecExtent_ = null;
        C9998 c9998 = this.fecExtentBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.fecExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C18727 getFecExtentBuilder() {
        this.bitField0_ |= 16384;
        onChanged();
        return (C18727) getFecExtentFieldBuilder().m25856();
    }

    @Override // l.InterfaceC17475
    public InterfaceC9031 getFecExtentOrBuilder() {
        C9998 c9998 = this.fecExtentBuilder_;
        if (c9998 != null) {
            return (InterfaceC9031) c9998.m25852();
        }
        C9776 c9776 = this.fecExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    private C9998 getFecExtentFieldBuilder() {
        if (this.fecExtentBuilder_ == null) {
            this.fecExtentBuilder_ = new C9998(getFecExtent(), getParentForChildren(), isClean());
            this.fecExtent_ = null;
        }
        return this.fecExtentBuilder_;
    }

    @Override // l.InterfaceC17475
    public boolean hasFecRoots() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // l.InterfaceC17475
    public int getFecRoots() {
        return this.fecRoots_;
    }

    public C11508 setFecRoots(int i) {
        this.fecRoots_ = i;
        this.bitField0_ |= 32768;
        onChanged();
        return this;
    }

    public C11508 clearFecRoots() {
        this.bitField0_ &= -32769;
        this.fecRoots_ = 2;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC17475
    public boolean hasVersion() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // l.InterfaceC17475
    public String getVersion() {
        Object obj = this.version_;
        if (!(obj instanceof String)) {
            AbstractC17084 abstractC17084 = (AbstractC17084) obj;
            String strM40221 = abstractC17084.m40221();
            if (abstractC17084.mo29729()) {
                this.version_ = strM40221;
            }
            return strM40221;
        }
        return (String) obj;
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

    public C11508 setVersion(String str) {
        str.getClass();
        this.version_ = str;
        this.bitField0_ |= 65536;
        onChanged();
        return this;
    }

    public C11508 clearVersion() {
        this.version_ = C24935.getDefaultInstance().getVersion();
        this.bitField0_ &= -65537;
        onChanged();
        return this;
    }

    public C11508 setVersionBytes(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.version_ = abstractC17084;
        this.bitField0_ |= 65536;
        onChanged();
        return this;
    }

    private void ensureMergeOperationsIsMutable() {
        if ((this.bitField0_ & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) == 0) {
            this.mergeOperations_ = new ArrayList(this.mergeOperations_);
            this.bitField0_ |= WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        }
    }

    @Override // l.InterfaceC17475
    public List getMergeOperationsList() {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 == null) {
            return C4681.unmodifiableList(this.mergeOperations_);
        }
        return c14473.m34947();
    }

    @Override // l.InterfaceC17475
    public int getMergeOperationsCount() {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 == null) {
            return this.mergeOperations_.size();
        }
        return c14473.m34948();
    }

    @Override // l.InterfaceC17475
    public C5303 getMergeOperations(int i) {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 == null) {
            return (C5303) this.mergeOperations_.get(i);
        }
        return (C5303) c14473.m34951(i);
    }

    public C11508 setMergeOperations(int i, C5303 c5303) {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 == null) {
            c5303.getClass();
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.set(i, c5303);
            onChanged();
            return this;
        }
        c14473.m34946(i, c5303);
        return this;
    }

    public C11508 setMergeOperations(int i, C19473 c19473) {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.set(i, c19473.build());
            onChanged();
            return this;
        }
        c14473.m34946(i, c19473.build());
        return this;
    }

    public C11508 addMergeOperations(C5303 c5303) {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 == null) {
            c5303.getClass();
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(c5303);
            onChanged();
            return this;
        }
        c14473.m34953(c5303);
        return this;
    }

    public C11508 addMergeOperations(int i, C5303 c5303) {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 == null) {
            c5303.getClass();
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(i, c5303);
            onChanged();
            return this;
        }
        c14473.m34952(i, c5303);
        return this;
    }

    public C11508 addMergeOperations(C19473 c19473) {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(c19473.build());
            onChanged();
            return this;
        }
        c14473.m34953(c19473.build());
        return this;
    }

    public C11508 addMergeOperations(int i, C19473 c19473) {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(i, c19473.build());
            onChanged();
            return this;
        }
        c14473.m34952(i, c19473.build());
        return this;
    }

    public C11508 addAllMergeOperations(Iterable iterable) {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 == null) {
            ensureMergeOperationsIsMutable();
            AbstractC1225.m4447(iterable, this.mergeOperations_);
            onChanged();
            return this;
        }
        c14473.m34942(iterable);
        return this;
    }

    public C11508 clearMergeOperations() {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 == null) {
            this.mergeOperations_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -131073;
            onChanged();
            return this;
        }
        c14473.m34945();
        return this;
    }

    public C11508 removeMergeOperations(int i) {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.remove(i);
            onChanged();
            return this;
        }
        c14473.m34955(i);
        return this;
    }

    public C19473 getMergeOperationsBuilder(int i) {
        return (C19473) getMergeOperationsFieldBuilder().m34939(i);
    }

    @Override // l.InterfaceC17475
    public InterfaceC11268 getMergeOperationsOrBuilder(int i) {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 == null) {
            return (InterfaceC11268) this.mergeOperations_.get(i);
        }
        return (InterfaceC11268) c14473.m34944(i);
    }

    @Override // l.InterfaceC17475
    public List getMergeOperationsOrBuilderList() {
        C14473 c14473 = this.mergeOperationsBuilder_;
        if (c14473 != null) {
            return c14473.m34943();
        }
        return C4681.unmodifiableList(this.mergeOperations_);
    }

    public C19473 addMergeOperationsBuilder() {
        return (C19473) getMergeOperationsFieldBuilder().m34941(C5303.getDefaultInstance());
    }

    public C19473 addMergeOperationsBuilder(int i) {
        return (C19473) getMergeOperationsFieldBuilder().m34940(i, C5303.getDefaultInstance());
    }

    public List getMergeOperationsBuilderList() {
        return getMergeOperationsFieldBuilder().m34949();
    }

    private C14473 getMergeOperationsFieldBuilder() {
        if (this.mergeOperationsBuilder_ == null) {
            this.mergeOperationsBuilder_ = new C14473(this.mergeOperations_, (this.bitField0_ & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0, getParentForChildren(), isClean());
            this.mergeOperations_ = null;
        }
        return this.mergeOperationsBuilder_;
    }

    @Override // l.InterfaceC17475
    public boolean hasEstimateCowSize() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // l.InterfaceC17475
    public long getEstimateCowSize() {
        return this.estimateCowSize_;
    }

    public C11508 setEstimateCowSize(long j) {
        this.estimateCowSize_ = j;
        this.bitField0_ |= 262144;
        onChanged();
        return this;
    }

    public C11508 clearEstimateCowSize() {
        this.bitField0_ &= -262145;
        this.estimateCowSize_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC17475
    public boolean hasEstimateOpCountMax() {
        return (this.bitField0_ & 524288) != 0;
    }

    @Override // l.InterfaceC17475
    public long getEstimateOpCountMax() {
        return this.estimateOpCountMax_;
    }

    public C11508 setEstimateOpCountMax(long j) {
        this.estimateOpCountMax_ = j;
        this.bitField0_ |= 524288;
        onChanged();
        return this;
    }

    public C11508 clearEstimateOpCountMax() {
        this.bitField0_ &= -524289;
        this.estimateOpCountMax_ = 0L;
        onChanged();
        return this;
    }
}
