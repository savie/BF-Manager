package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;
import org.bouncycastle.crypto.engines.ThreefishEngine;
import org.bouncycastle.crypto.params.DHParameters;

/* JADX INFO: renamed from: l.ۜ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C7002 extends AbstractC0584 implements InterfaceC21819 {
    public int bitField0_;
    public long estimateCowSize_;
    public long estimateOpCountMax_;
    public C15135 fecDataExtentBuilder_;
    public C5903 fecDataExtent_;
    public C15135 fecExtentBuilder_;
    public C5903 fecExtent_;
    public int fecRoots_;
    public Object filesystemType_;
    public Object hashTreeAlgorithm_;
    public C15135 hashTreeDataExtentBuilder_;
    public C5903 hashTreeDataExtent_;
    public C15135 hashTreeExtentBuilder_;
    public C5903 hashTreeExtent_;
    public AbstractC23725 hashTreeSalt_;
    public C22190 mergeOperationsBuilder_;
    public List mergeOperations_;
    public C15135 newPartitionInfoBuilder_;
    public C22525 newPartitionInfo_;
    public C22190 newPartitionSignatureBuilder_;
    public List newPartitionSignature_;
    public C15135 oldPartitionInfoBuilder_;
    public C22525 oldPartitionInfo_;
    public C22190 operationsBuilder_;
    public List operations_;
    public Object partitionName_;
    public boolean postinstallOptional_;
    public Object postinstallPath_;
    public boolean runPostinstall_;
    public Object version_;

    public /* synthetic */ C7002(int i) {
        this();
    }

    public /* synthetic */ C7002(InterfaceC6790 interfaceC6790, int i) {
        this(interfaceC6790);
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_descriptor;
    }

    @Override // l.AbstractC0584
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_fieldAccessorTable;
        c6956.m18696(C23231.class, C7002.class);
        return c6956;
    }

    public C7002() {
        this.partitionName_ = "";
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        List list = Collections.EMPTY_LIST;
        this.newPartitionSignature_ = list;
        this.operations_ = list;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC23725.f76778;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.mergeOperations_ = list;
        maybeForceBuilderInitialization();
    }

    public C7002(InterfaceC6790 interfaceC6790) {
        super(interfaceC6790);
        this.partitionName_ = "";
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        List list = Collections.EMPTY_LIST;
        this.newPartitionSignature_ = list;
        this.operations_ = list;
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC23725.f76778;
        this.fecRoots_ = 2;
        this.version_ = "";
        this.mergeOperations_ = list;
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC18245.alwaysUseFieldBuilders) {
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

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public C7002 mo2777clear() {
        super.mo2777clear();
        this.bitField0_ = 0;
        this.partitionName_ = "";
        this.runPostinstall_ = false;
        this.postinstallPath_ = "";
        this.filesystemType_ = "";
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            this.newPartitionSignature_ = Collections.EMPTY_LIST;
        } else {
            this.newPartitionSignature_ = null;
            c22190.m49245();
        }
        this.bitField0_ &= -17;
        this.oldPartitionInfo_ = null;
        C15135 c15135 = this.oldPartitionInfoBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.oldPartitionInfoBuilder_ = null;
        }
        this.newPartitionInfo_ = null;
        C15135 c15136 = this.newPartitionInfoBuilder_;
        if (c15136 != null) {
            c15136.m36296();
            this.newPartitionInfoBuilder_ = null;
        }
        C22190 c22191 = this.operationsBuilder_;
        if (c22191 == null) {
            this.operations_ = Collections.EMPTY_LIST;
        } else {
            this.operations_ = null;
            c22191.m49245();
        }
        this.bitField0_ &= -129;
        this.postinstallOptional_ = false;
        this.hashTreeDataExtent_ = null;
        C15135 c15137 = this.hashTreeDataExtentBuilder_;
        if (c15137 != null) {
            c15137.m36296();
            this.hashTreeDataExtentBuilder_ = null;
        }
        this.hashTreeExtent_ = null;
        C15135 c15138 = this.hashTreeExtentBuilder_;
        if (c15138 != null) {
            c15138.m36296();
            this.hashTreeExtentBuilder_ = null;
        }
        this.hashTreeAlgorithm_ = "";
        this.hashTreeSalt_ = AbstractC23725.f76778;
        this.fecDataExtent_ = null;
        C15135 c15139 = this.fecDataExtentBuilder_;
        if (c15139 != null) {
            c15139.m36296();
            this.fecDataExtentBuilder_ = null;
        }
        this.fecExtent_ = null;
        C15135 c151310 = this.fecExtentBuilder_;
        if (c151310 != null) {
            c151310.m36296();
            this.fecExtentBuilder_ = null;
        }
        this.fecRoots_ = 2;
        this.version_ = "";
        C22190 c22192 = this.mergeOperationsBuilder_;
        if (c22192 == null) {
            this.mergeOperations_ = Collections.EMPTY_LIST;
        } else {
            this.mergeOperations_ = null;
            c22192.m49245();
        }
        this.bitField0_ &= -131073;
        this.estimateCowSize_ = 0L;
        this.estimateOpCountMax_ = 0L;
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public C2806 getDescriptorForType() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_PartitionUpdate_descriptor;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public C23231 getDefaultInstanceForType() {
        return C23231.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C23231 build() {
        C23231 c23231BuildPartial = buildPartial();
        if (c23231BuildPartial.isInitialized()) {
            return c23231BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c23231BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C23231 buildPartial() {
        C23231 c23231 = new C23231(this);
        buildPartialRepeatedFields(c23231);
        if (this.bitField0_ != 0) {
            buildPartial0(c23231);
        }
        onBuilt();
        return c23231;
    }

    private void buildPartialRepeatedFields(C23231 c23231) {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            if ((this.bitField0_ & 16) != 0) {
                this.newPartitionSignature_ = C0561.unmodifiableList(this.newPartitionSignature_);
                this.bitField0_ &= -17;
            }
            c23231.newPartitionSignature_ = this.newPartitionSignature_;
        } else {
            c23231.newPartitionSignature_ = c22190.m49248();
        }
        C22190 c22191 = this.operationsBuilder_;
        if (c22191 == null) {
            if ((this.bitField0_ & 128) != 0) {
                this.operations_ = C0561.unmodifiableList(this.operations_);
                this.bitField0_ &= -129;
            }
            c23231.operations_ = this.operations_;
        } else {
            c23231.operations_ = c22191.m49248();
        }
        C22190 c22192 = this.mergeOperationsBuilder_;
        if (c22192 == null) {
            if ((this.bitField0_ & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0) {
                this.mergeOperations_ = C0561.unmodifiableList(this.mergeOperations_);
                this.bitField0_ &= -131073;
            }
            c23231.mergeOperations_ = this.mergeOperations_;
            return;
        }
        c23231.mergeOperations_ = c22192.m49248();
    }

    private void buildPartial0(C23231 c23231) {
        int i;
        C5903 c5903;
        C5903 c5904;
        C5903 c5905;
        C5903 c5906;
        C22525 c22525;
        C22525 c22526;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c23231.partitionName_ = this.partitionName_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c23231.runPostinstall_ = this.runPostinstall_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c23231.postinstallPath_ = this.postinstallPath_;
            i |= 4;
        }
        if ((i2 & 8) != 0) {
            c23231.filesystemType_ = this.filesystemType_;
            i |= 8;
        }
        if ((i2 & 32) != 0) {
            C15135 c15135 = this.oldPartitionInfoBuilder_;
            if (c15135 == null) {
                c22526 = this.oldPartitionInfo_;
            } else {
                c22526 = (C22525) c15135.m36297();
            }
            c23231.oldPartitionInfo_ = c22526;
            i |= 16;
        }
        if ((i2 & 64) != 0) {
            C15135 c15136 = this.newPartitionInfoBuilder_;
            if (c15136 == null) {
                c22525 = this.newPartitionInfo_;
            } else {
                c22525 = (C22525) c15136.m36297();
            }
            c23231.newPartitionInfo_ = c22525;
            i |= 32;
        }
        if ((i2 & 256) != 0) {
            c23231.postinstallOptional_ = this.postinstallOptional_;
            i |= 64;
        }
        if ((i2 & 512) != 0) {
            C15135 c15137 = this.hashTreeDataExtentBuilder_;
            if (c15137 == null) {
                c5906 = this.hashTreeDataExtent_;
            } else {
                c5906 = (C5903) c15137.m36297();
            }
            c23231.hashTreeDataExtent_ = c5906;
            i |= 128;
        }
        if ((i2 & 1024) != 0) {
            C15135 c15138 = this.hashTreeExtentBuilder_;
            if (c15138 == null) {
                c5905 = this.hashTreeExtent_;
            } else {
                c5905 = (C5903) c15138.m36297();
            }
            c23231.hashTreeExtent_ = c5905;
            i |= 256;
        }
        if ((i2 & 2048) != 0) {
            c23231.hashTreeAlgorithm_ = this.hashTreeAlgorithm_;
            i |= 512;
        }
        if ((i2 & 4096) != 0) {
            c23231.hashTreeSalt_ = this.hashTreeSalt_;
            i |= 1024;
        }
        if ((i2 & 8192) != 0) {
            C15135 c15139 = this.fecDataExtentBuilder_;
            if (c15139 == null) {
                c5904 = this.fecDataExtent_;
            } else {
                c5904 = (C5903) c15139.m36297();
            }
            c23231.fecDataExtent_ = c5904;
            i |= 2048;
        }
        if ((i2 & 16384) != 0) {
            C15135 c151310 = this.fecExtentBuilder_;
            if (c151310 == null) {
                c5903 = this.fecExtent_;
            } else {
                c5903 = (C5903) c151310.m36297();
            }
            c23231.fecExtent_ = c5903;
            i |= 4096;
        }
        if ((i2 & 32768) != 0) {
            c23231.fecRoots_ = this.fecRoots_;
            i |= 8192;
        }
        if ((i2 & 65536) != 0) {
            c23231.version_ = this.version_;
            i |= 16384;
        }
        if ((262144 & i2) != 0) {
            c23231.estimateCowSize_ = this.estimateCowSize_;
            i |= 32768;
        }
        if ((i2 & 524288) != 0) {
            c23231.estimateOpCountMax_ = this.estimateOpCountMax_;
            i |= 65536;
        }
        c23231.bitField0_ |= i;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public C7002 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C23231) {
            return mergeFrom((C23231) interfaceC1332);
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    public C7002 mergeFrom(C23231 c23231) {
        if (c23231 == C23231.getDefaultInstance()) {
            return this;
        }
        if (c23231.hasPartitionName()) {
            this.partitionName_ = c23231.partitionName_;
            this.bitField0_ |= 1;
            onChanged();
        }
        if (c23231.hasRunPostinstall()) {
            setRunPostinstall(c23231.getRunPostinstall());
        }
        if (c23231.hasPostinstallPath()) {
            this.postinstallPath_ = c23231.postinstallPath_;
            this.bitField0_ |= 4;
            onChanged();
        }
        if (c23231.hasFilesystemType()) {
            this.filesystemType_ = c23231.filesystemType_;
            this.bitField0_ |= 8;
            onChanged();
        }
        if (this.newPartitionSignatureBuilder_ == null) {
            if (!c23231.newPartitionSignature_.isEmpty()) {
                if (this.newPartitionSignature_.isEmpty()) {
                    this.newPartitionSignature_ = c23231.newPartitionSignature_;
                    this.bitField0_ &= -17;
                } else {
                    ensureNewPartitionSignatureIsMutable();
                    this.newPartitionSignature_.addAll(c23231.newPartitionSignature_);
                }
                onChanged();
            }
        } else if (!c23231.newPartitionSignature_.isEmpty()) {
            if (this.newPartitionSignatureBuilder_.m49238()) {
                this.newPartitionSignatureBuilder_.m49236();
                this.newPartitionSignatureBuilder_ = null;
                this.newPartitionSignature_ = c23231.newPartitionSignature_;
                this.bitField0_ &= -17;
                this.newPartitionSignatureBuilder_ = AbstractC18245.alwaysUseFieldBuilders ? getNewPartitionSignatureFieldBuilder() : null;
            } else {
                this.newPartitionSignatureBuilder_.m49242(c23231.newPartitionSignature_);
            }
        }
        if (c23231.hasOldPartitionInfo()) {
            mergeOldPartitionInfo(c23231.getOldPartitionInfo());
        }
        if (c23231.hasNewPartitionInfo()) {
            mergeNewPartitionInfo(c23231.getNewPartitionInfo());
        }
        if (this.operationsBuilder_ == null) {
            if (!c23231.operations_.isEmpty()) {
                if (this.operations_.isEmpty()) {
                    this.operations_ = c23231.operations_;
                    this.bitField0_ &= -129;
                } else {
                    ensureOperationsIsMutable();
                    this.operations_.addAll(c23231.operations_);
                }
                onChanged();
            }
        } else if (!c23231.operations_.isEmpty()) {
            if (this.operationsBuilder_.m49238()) {
                this.operationsBuilder_.m49236();
                this.operationsBuilder_ = null;
                this.operations_ = c23231.operations_;
                this.bitField0_ &= -129;
                this.operationsBuilder_ = AbstractC18245.alwaysUseFieldBuilders ? getOperationsFieldBuilder() : null;
            } else {
                this.operationsBuilder_.m49242(c23231.operations_);
            }
        }
        if (c23231.hasPostinstallOptional()) {
            setPostinstallOptional(c23231.getPostinstallOptional());
        }
        if (c23231.hasHashTreeDataExtent()) {
            mergeHashTreeDataExtent(c23231.getHashTreeDataExtent());
        }
        if (c23231.hasHashTreeExtent()) {
            mergeHashTreeExtent(c23231.getHashTreeExtent());
        }
        if (c23231.hasHashTreeAlgorithm()) {
            this.hashTreeAlgorithm_ = c23231.hashTreeAlgorithm_;
            this.bitField0_ |= 2048;
            onChanged();
        }
        if (c23231.hasHashTreeSalt()) {
            setHashTreeSalt(c23231.getHashTreeSalt());
        }
        if (c23231.hasFecDataExtent()) {
            mergeFecDataExtent(c23231.getFecDataExtent());
        }
        if (c23231.hasFecExtent()) {
            mergeFecExtent(c23231.getFecExtent());
        }
        if (c23231.hasFecRoots()) {
            setFecRoots(c23231.getFecRoots());
        }
        if (c23231.hasVersion()) {
            this.version_ = c23231.version_;
            this.bitField0_ |= 65536;
            onChanged();
        }
        if (this.mergeOperationsBuilder_ == null) {
            if (!c23231.mergeOperations_.isEmpty()) {
                if (this.mergeOperations_.isEmpty()) {
                    this.mergeOperations_ = c23231.mergeOperations_;
                    this.bitField0_ &= -131073;
                } else {
                    ensureMergeOperationsIsMutable();
                    this.mergeOperations_.addAll(c23231.mergeOperations_);
                }
                onChanged();
            }
        } else if (!c23231.mergeOperations_.isEmpty()) {
            if (this.mergeOperationsBuilder_.m49238()) {
                this.mergeOperationsBuilder_.m49236();
                this.mergeOperationsBuilder_ = null;
                this.mergeOperations_ = c23231.mergeOperations_;
                this.bitField0_ &= -131073;
                this.mergeOperationsBuilder_ = AbstractC18245.alwaysUseFieldBuilders ? getMergeOperationsFieldBuilder() : null;
            } else {
                this.mergeOperationsBuilder_.m49242(c23231.mergeOperations_);
            }
        }
        if (c23231.hasEstimateCowSize()) {
            setEstimateCowSize(c23231.getEstimateCowSize());
        }
        if (c23231.hasEstimateOpCountMax()) {
            setEstimateOpCountMax(c23231.getEstimateOpCountMax());
        }
        mo2781mergeUnknownFields(c23231.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
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

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public C7002 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    switch (iMo6048) {
                        case 0:
                            break;
                        case 10:
                            this.partitionName_ = abstractC3262.mo6050();
                            this.bitField0_ |= 1;
                            continue;
                        case 16:
                            this.runPostinstall_ = abstractC3262.mo6028();
                            this.bitField0_ |= 2;
                            continue;
                        case 26:
                            this.postinstallPath_ = abstractC3262.mo6050();
                            this.bitField0_ |= 4;
                            continue;
                        case 34:
                            this.filesystemType_ = abstractC3262.mo6050();
                            this.bitField0_ |= 8;
                            continue;
                        case 42:
                            C8414 c8414 = (C8414) abstractC3262.mo6024(C8414.parser(), c2701);
                            C22190 c22190 = this.newPartitionSignatureBuilder_;
                            if (c22190 == null) {
                                ensureNewPartitionSignatureIsMutable();
                                this.newPartitionSignature_.add(c8414);
                            } else {
                                c22190.m49251(c8414);
                                continue;
                            }
                            break;
                        case 50:
                            abstractC3262.mo6027(getOldPartitionInfoFieldBuilder().m36293(), c2701);
                            this.bitField0_ |= 32;
                            continue;
                        case ThreefishEngine.Threefish256Cipher.ROTATION_6_0 /* 58 */:
                            abstractC3262.mo6027(getNewPartitionInfoFieldBuilder().m36293(), c2701);
                            this.bitField0_ |= 64;
                            continue;
                        case 66:
                            C4885 c4885 = (C4885) abstractC3262.mo6024(C4885.parser(), c2701);
                            C22190 c22191 = this.operationsBuilder_;
                            if (c22191 == null) {
                                ensureOperationsIsMutable();
                                this.operations_.add(c4885);
                            } else {
                                c22191.m49251(c4885);
                                continue;
                            }
                            break;
                        case 72:
                            this.postinstallOptional_ = abstractC3262.mo6028();
                            this.bitField0_ |= 256;
                            continue;
                        case 82:
                            abstractC3262.mo6027(getHashTreeDataExtentFieldBuilder().m36293(), c2701);
                            this.bitField0_ |= 512;
                            continue;
                        case 90:
                            abstractC3262.mo6027(getHashTreeExtentFieldBuilder().m36293(), c2701);
                            this.bitField0_ |= 1024;
                            continue;
                        case 98:
                            this.hashTreeAlgorithm_ = abstractC3262.mo6050();
                            this.bitField0_ |= 2048;
                            continue;
                        case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                            this.hashTreeSalt_ = abstractC3262.mo6050();
                            this.bitField0_ |= 4096;
                            continue;
                        case 114:
                            abstractC3262.mo6027(getFecDataExtentFieldBuilder().m36293(), c2701);
                            this.bitField0_ |= 8192;
                            continue;
                        case 122:
                            abstractC3262.mo6027(getFecExtentFieldBuilder().m36293(), c2701);
                            this.bitField0_ |= 16384;
                            continue;
                        case 128:
                            this.fecRoots_ = abstractC3262.mo6041();
                            this.bitField0_ |= 32768;
                            continue;
                        case 138:
                            this.version_ = abstractC3262.mo6050();
                            this.bitField0_ |= 65536;
                            continue;
                        case 146:
                            C12959 c12959 = (C12959) abstractC3262.mo6024(C12959.parser(), c2701);
                            C22190 c22192 = this.mergeOperationsBuilder_;
                            if (c22192 == null) {
                                ensureMergeOperationsIsMutable();
                                this.mergeOperations_.add(c12959);
                            } else {
                                c22192.m49251(c12959);
                                continue;
                            }
                            break;
                        case 152:
                            this.estimateCowSize_ = abstractC3262.mo6047();
                            this.bitField0_ |= 262144;
                            continue;
                        case DHParameters.DEFAULT_MINIMUM_LENGTH /* 160 */:
                            this.estimateOpCountMax_ = abstractC3262.mo6047();
                            this.bitField0_ |= 524288;
                            continue;
                        default:
                            if (!super.parseUnknownField(abstractC3262, c2701, iMo6048)) {
                                break;
                            }
                            break;
                    }
                    z = true;
                } catch (C4529 e) {
                    throw e.m12650();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
        return this;
    }

    @Override // l.InterfaceC21819
    public boolean hasPartitionName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC21819
    public String getPartitionName() {
        Object obj = this.partitionName_;
        if (!(obj instanceof String)) {
            AbstractC23725 abstractC23725 = (AbstractC23725) obj;
            String strM52260 = abstractC23725.m52260();
            if (abstractC23725.mo16494()) {
                this.partitionName_ = strM52260;
            }
            return strM52260;
        }
        return (String) obj;
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

    public C7002 setPartitionName(String str) {
        str.getClass();
        this.partitionName_ = str;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C7002 clearPartitionName() {
        this.partitionName_ = C23231.getDefaultInstance().getPartitionName();
        this.bitField0_ &= -2;
        onChanged();
        return this;
    }

    public C7002 setPartitionNameBytes(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.partitionName_ = abstractC23725;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC21819
    public boolean hasRunPostinstall() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC21819
    public boolean getRunPostinstall() {
        return this.runPostinstall_;
    }

    public C7002 setRunPostinstall(boolean z) {
        this.runPostinstall_ = z;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C7002 clearRunPostinstall() {
        this.bitField0_ &= -3;
        this.runPostinstall_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC21819
    public boolean hasPostinstallPath() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC21819
    public String getPostinstallPath() {
        Object obj = this.postinstallPath_;
        if (!(obj instanceof String)) {
            AbstractC23725 abstractC23725 = (AbstractC23725) obj;
            String strM52260 = abstractC23725.m52260();
            if (abstractC23725.mo16494()) {
                this.postinstallPath_ = strM52260;
            }
            return strM52260;
        }
        return (String) obj;
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

    public C7002 setPostinstallPath(String str) {
        str.getClass();
        this.postinstallPath_ = str;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C7002 clearPostinstallPath() {
        this.postinstallPath_ = C23231.getDefaultInstance().getPostinstallPath();
        this.bitField0_ &= -5;
        onChanged();
        return this;
    }

    public C7002 setPostinstallPathBytes(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.postinstallPath_ = abstractC23725;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC21819
    public boolean hasFilesystemType() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC21819
    public String getFilesystemType() {
        Object obj = this.filesystemType_;
        if (!(obj instanceof String)) {
            AbstractC23725 abstractC23725 = (AbstractC23725) obj;
            String strM52260 = abstractC23725.m52260();
            if (abstractC23725.mo16494()) {
                this.filesystemType_ = strM52260;
            }
            return strM52260;
        }
        return (String) obj;
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

    public C7002 setFilesystemType(String str) {
        str.getClass();
        this.filesystemType_ = str;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C7002 clearFilesystemType() {
        this.filesystemType_ = C23231.getDefaultInstance().getFilesystemType();
        this.bitField0_ &= -9;
        onChanged();
        return this;
    }

    public C7002 setFilesystemTypeBytes(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.filesystemType_ = abstractC23725;
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

    @Override // l.InterfaceC21819
    public List getNewPartitionSignatureList() {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            return C0561.unmodifiableList(this.newPartitionSignature_);
        }
        return c22190.m49235();
    }

    @Override // l.InterfaceC21819
    public int getNewPartitionSignatureCount() {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            return this.newPartitionSignature_.size();
        }
        return c22190.m49252();
    }

    @Override // l.InterfaceC21819
    public C8414 getNewPartitionSignature(int i) {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            return (C8414) this.newPartitionSignature_.get(i);
        }
        return (C8414) c22190.m49249(i);
    }

    public C7002 setNewPartitionSignature(int i, C8414 c8414) {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            c8414.getClass();
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.set(i, c8414);
            onChanged();
            return this;
        }
        c22190.m49246(i, c8414);
        return this;
    }

    public C7002 setNewPartitionSignature(int i, C18997 c18997) {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.set(i, c18997.build());
            onChanged();
            return this;
        }
        c22190.m49246(i, c18997.build());
        return this;
    }

    public C7002 addNewPartitionSignature(C8414 c8414) {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            c8414.getClass();
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(c8414);
            onChanged();
            return this;
        }
        c22190.m49251(c8414);
        return this;
    }

    public C7002 addNewPartitionSignature(int i, C8414 c8414) {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            c8414.getClass();
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(i, c8414);
            onChanged();
            return this;
        }
        c22190.m49250(i, c8414);
        return this;
    }

    public C7002 addNewPartitionSignature(C18997 c18997) {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(c18997.build());
            onChanged();
            return this;
        }
        c22190.m49251(c18997.build());
        return this;
    }

    public C7002 addNewPartitionSignature(int i, C18997 c18997) {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.add(i, c18997.build());
            onChanged();
            return this;
        }
        c22190.m49250(i, c18997.build());
        return this;
    }

    public C7002 addAllNewPartitionSignature(Iterable iterable) {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            ensureNewPartitionSignatureIsMutable();
            AbstractC21607.m48315(iterable, this.newPartitionSignature_);
            onChanged();
            return this;
        }
        c22190.m49242(iterable);
        return this;
    }

    public C7002 clearNewPartitionSignature() {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            this.newPartitionSignature_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }
        c22190.m49245();
        return this;
    }

    public C7002 removeNewPartitionSignature(int i) {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            ensureNewPartitionSignatureIsMutable();
            this.newPartitionSignature_.remove(i);
            onChanged();
            return this;
        }
        c22190.m49237(i);
        return this;
    }

    public C18997 getNewPartitionSignatureBuilder(int i) {
        return (C18997) getNewPartitionSignatureFieldBuilder().m49239(i);
    }

    @Override // l.InterfaceC21819
    public InterfaceC9120 getNewPartitionSignatureOrBuilder(int i) {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 == null) {
            return (InterfaceC9120) this.newPartitionSignature_.get(i);
        }
        return (InterfaceC9120) c22190.m49244(i);
    }

    @Override // l.InterfaceC21819
    public List getNewPartitionSignatureOrBuilderList() {
        C22190 c22190 = this.newPartitionSignatureBuilder_;
        if (c22190 != null) {
            return c22190.m49247();
        }
        return C0561.unmodifiableList(this.newPartitionSignature_);
    }

    public C18997 addNewPartitionSignatureBuilder() {
        return (C18997) getNewPartitionSignatureFieldBuilder().m49241(C8414.getDefaultInstance());
    }

    public C18997 addNewPartitionSignatureBuilder(int i) {
        return (C18997) getNewPartitionSignatureFieldBuilder().m49240(i, C8414.getDefaultInstance());
    }

    public List getNewPartitionSignatureBuilderList() {
        return getNewPartitionSignatureFieldBuilder().m49243();
    }

    private C22190 getNewPartitionSignatureFieldBuilder() {
        if (this.newPartitionSignatureBuilder_ == null) {
            this.newPartitionSignatureBuilder_ = new C22190(this.newPartitionSignature_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
            this.newPartitionSignature_ = null;
        }
        return this.newPartitionSignatureBuilder_;
    }

    @Override // l.InterfaceC21819
    public boolean hasOldPartitionInfo() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC21819
    public C22525 getOldPartitionInfo() {
        C15135 c15135 = this.oldPartitionInfoBuilder_;
        if (c15135 == null) {
            C22525 c22525 = this.oldPartitionInfo_;
            return c22525 == null ? C22525.getDefaultInstance() : c22525;
        }
        return (C22525) c15135.m36295();
    }

    public C7002 setOldPartitionInfo(C22525 c22525) {
        C15135 c15135 = this.oldPartitionInfoBuilder_;
        if (c15135 == null) {
            c22525.getClass();
            this.oldPartitionInfo_ = c22525;
        } else {
            c15135.m36298(c22525);
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C7002 setOldPartitionInfo(C5591 c5591) {
        C15135 c15135 = this.oldPartitionInfoBuilder_;
        if (c15135 == null) {
            this.oldPartitionInfo_ = c5591.build();
        } else {
            c15135.m36298(c5591.build());
        }
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C7002 mergeOldPartitionInfo(C22525 c22525) {
        C22525 c22526;
        C15135 c15135 = this.oldPartitionInfoBuilder_;
        if (c15135 == null) {
            if ((this.bitField0_ & 32) != 0 && (c22526 = this.oldPartitionInfo_) != null && c22526 != C22525.getDefaultInstance()) {
                getOldPartitionInfoBuilder().mergeFrom(c22525);
            } else {
                this.oldPartitionInfo_ = c22525;
            }
        } else {
            c15135.m36294(c22525);
        }
        if (this.oldPartitionInfo_ != null) {
            this.bitField0_ |= 32;
            onChanged();
        }
        return this;
    }

    public C7002 clearOldPartitionInfo() {
        this.bitField0_ &= -33;
        this.oldPartitionInfo_ = null;
        C15135 c15135 = this.oldPartitionInfoBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.oldPartitionInfoBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C5591 getOldPartitionInfoBuilder() {
        this.bitField0_ |= 32;
        onChanged();
        return (C5591) getOldPartitionInfoFieldBuilder().m36293();
    }

    @Override // l.InterfaceC21819
    public InterfaceC13353 getOldPartitionInfoOrBuilder() {
        C15135 c15135 = this.oldPartitionInfoBuilder_;
        if (c15135 != null) {
            return (InterfaceC13353) c15135.m36299();
        }
        C22525 c22525 = this.oldPartitionInfo_;
        return c22525 == null ? C22525.getDefaultInstance() : c22525;
    }

    private C15135 getOldPartitionInfoFieldBuilder() {
        if (this.oldPartitionInfoBuilder_ == null) {
            this.oldPartitionInfoBuilder_ = new C15135(getOldPartitionInfo(), getParentForChildren(), isClean());
            this.oldPartitionInfo_ = null;
        }
        return this.oldPartitionInfoBuilder_;
    }

    @Override // l.InterfaceC21819
    public boolean hasNewPartitionInfo() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC21819
    public C22525 getNewPartitionInfo() {
        C15135 c15135 = this.newPartitionInfoBuilder_;
        if (c15135 == null) {
            C22525 c22525 = this.newPartitionInfo_;
            return c22525 == null ? C22525.getDefaultInstance() : c22525;
        }
        return (C22525) c15135.m36295();
    }

    public C7002 setNewPartitionInfo(C22525 c22525) {
        C15135 c15135 = this.newPartitionInfoBuilder_;
        if (c15135 == null) {
            c22525.getClass();
            this.newPartitionInfo_ = c22525;
        } else {
            c15135.m36298(c22525);
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C7002 setNewPartitionInfo(C5591 c5591) {
        C15135 c15135 = this.newPartitionInfoBuilder_;
        if (c15135 == null) {
            this.newPartitionInfo_ = c5591.build();
        } else {
            c15135.m36298(c5591.build());
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C7002 mergeNewPartitionInfo(C22525 c22525) {
        C22525 c22526;
        C15135 c15135 = this.newPartitionInfoBuilder_;
        if (c15135 == null) {
            if ((this.bitField0_ & 64) != 0 && (c22526 = this.newPartitionInfo_) != null && c22526 != C22525.getDefaultInstance()) {
                getNewPartitionInfoBuilder().mergeFrom(c22525);
            } else {
                this.newPartitionInfo_ = c22525;
            }
        } else {
            c15135.m36294(c22525);
        }
        if (this.newPartitionInfo_ != null) {
            this.bitField0_ |= 64;
            onChanged();
        }
        return this;
    }

    public C7002 clearNewPartitionInfo() {
        this.bitField0_ &= -65;
        this.newPartitionInfo_ = null;
        C15135 c15135 = this.newPartitionInfoBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.newPartitionInfoBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C5591 getNewPartitionInfoBuilder() {
        this.bitField0_ |= 64;
        onChanged();
        return (C5591) getNewPartitionInfoFieldBuilder().m36293();
    }

    @Override // l.InterfaceC21819
    public InterfaceC13353 getNewPartitionInfoOrBuilder() {
        C15135 c15135 = this.newPartitionInfoBuilder_;
        if (c15135 != null) {
            return (InterfaceC13353) c15135.m36299();
        }
        C22525 c22525 = this.newPartitionInfo_;
        return c22525 == null ? C22525.getDefaultInstance() : c22525;
    }

    private C15135 getNewPartitionInfoFieldBuilder() {
        if (this.newPartitionInfoBuilder_ == null) {
            this.newPartitionInfoBuilder_ = new C15135(getNewPartitionInfo(), getParentForChildren(), isClean());
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

    @Override // l.InterfaceC21819
    public List getOperationsList() {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 == null) {
            return C0561.unmodifiableList(this.operations_);
        }
        return c22190.m49235();
    }

    @Override // l.InterfaceC21819
    public int getOperationsCount() {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 == null) {
            return this.operations_.size();
        }
        return c22190.m49252();
    }

    @Override // l.InterfaceC21819
    public C4885 getOperations(int i) {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 == null) {
            return (C4885) this.operations_.get(i);
        }
        return (C4885) c22190.m49249(i);
    }

    public C7002 setOperations(int i, C4885 c4885) {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 == null) {
            c4885.getClass();
            ensureOperationsIsMutable();
            this.operations_.set(i, c4885);
            onChanged();
            return this;
        }
        c22190.m49246(i, c4885);
        return this;
    }

    public C7002 setOperations(int i, C1669 c1669) {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 == null) {
            ensureOperationsIsMutable();
            this.operations_.set(i, c1669.build());
            onChanged();
            return this;
        }
        c22190.m49246(i, c1669.build());
        return this;
    }

    public C7002 addOperations(C4885 c4885) {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 == null) {
            c4885.getClass();
            ensureOperationsIsMutable();
            this.operations_.add(c4885);
            onChanged();
            return this;
        }
        c22190.m49251(c4885);
        return this;
    }

    public C7002 addOperations(int i, C4885 c4885) {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 == null) {
            c4885.getClass();
            ensureOperationsIsMutable();
            this.operations_.add(i, c4885);
            onChanged();
            return this;
        }
        c22190.m49250(i, c4885);
        return this;
    }

    public C7002 addOperations(C1669 c1669) {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 == null) {
            ensureOperationsIsMutable();
            this.operations_.add(c1669.build());
            onChanged();
            return this;
        }
        c22190.m49251(c1669.build());
        return this;
    }

    public C7002 addOperations(int i, C1669 c1669) {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 == null) {
            ensureOperationsIsMutable();
            this.operations_.add(i, c1669.build());
            onChanged();
            return this;
        }
        c22190.m49250(i, c1669.build());
        return this;
    }

    public C7002 addAllOperations(Iterable iterable) {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 == null) {
            ensureOperationsIsMutable();
            AbstractC21607.m48315(iterable, this.operations_);
            onChanged();
            return this;
        }
        c22190.m49242(iterable);
        return this;
    }

    public C7002 clearOperations() {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 == null) {
            this.operations_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -129;
            onChanged();
            return this;
        }
        c22190.m49245();
        return this;
    }

    public C7002 removeOperations(int i) {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 == null) {
            ensureOperationsIsMutable();
            this.operations_.remove(i);
            onChanged();
            return this;
        }
        c22190.m49237(i);
        return this;
    }

    public C1669 getOperationsBuilder(int i) {
        return (C1669) getOperationsFieldBuilder().m49239(i);
    }

    @Override // l.InterfaceC21819
    public InterfaceC11942 getOperationsOrBuilder(int i) {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 == null) {
            return (InterfaceC11942) this.operations_.get(i);
        }
        return (InterfaceC11942) c22190.m49244(i);
    }

    @Override // l.InterfaceC21819
    public List getOperationsOrBuilderList() {
        C22190 c22190 = this.operationsBuilder_;
        if (c22190 != null) {
            return c22190.m49247();
        }
        return C0561.unmodifiableList(this.operations_);
    }

    public C1669 addOperationsBuilder() {
        return (C1669) getOperationsFieldBuilder().m49241(C4885.getDefaultInstance());
    }

    public C1669 addOperationsBuilder(int i) {
        return (C1669) getOperationsFieldBuilder().m49240(i, C4885.getDefaultInstance());
    }

    public List getOperationsBuilderList() {
        return getOperationsFieldBuilder().m49243();
    }

    private C22190 getOperationsFieldBuilder() {
        if (this.operationsBuilder_ == null) {
            this.operationsBuilder_ = new C22190(this.operations_, (this.bitField0_ & 128) != 0, getParentForChildren(), isClean());
            this.operations_ = null;
        }
        return this.operationsBuilder_;
    }

    @Override // l.InterfaceC21819
    public boolean hasPostinstallOptional() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // l.InterfaceC21819
    public boolean getPostinstallOptional() {
        return this.postinstallOptional_;
    }

    public C7002 setPostinstallOptional(boolean z) {
        this.postinstallOptional_ = z;
        this.bitField0_ |= 256;
        onChanged();
        return this;
    }

    public C7002 clearPostinstallOptional() {
        this.bitField0_ &= -257;
        this.postinstallOptional_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC21819
    public boolean hasHashTreeDataExtent() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // l.InterfaceC21819
    public C5903 getHashTreeDataExtent() {
        C15135 c15135 = this.hashTreeDataExtentBuilder_;
        if (c15135 == null) {
            C5903 c5903 = this.hashTreeDataExtent_;
            return c5903 == null ? C5903.getDefaultInstance() : c5903;
        }
        return (C5903) c15135.m36295();
    }

    public C7002 setHashTreeDataExtent(C5903 c5903) {
        C15135 c15135 = this.hashTreeDataExtentBuilder_;
        if (c15135 == null) {
            c5903.getClass();
            this.hashTreeDataExtent_ = c5903;
        } else {
            c15135.m36298(c5903);
        }
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }

    public C7002 setHashTreeDataExtent(C17192 c17192) {
        C15135 c15135 = this.hashTreeDataExtentBuilder_;
        if (c15135 == null) {
            this.hashTreeDataExtent_ = c17192.build();
        } else {
            c15135.m36298(c17192.build());
        }
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }

    public C7002 mergeHashTreeDataExtent(C5903 c5903) {
        C5903 c5904;
        C15135 c15135 = this.hashTreeDataExtentBuilder_;
        if (c15135 == null) {
            if ((this.bitField0_ & 512) != 0 && (c5904 = this.hashTreeDataExtent_) != null && c5904 != C5903.getDefaultInstance()) {
                getHashTreeDataExtentBuilder().mergeFrom(c5903);
            } else {
                this.hashTreeDataExtent_ = c5903;
            }
        } else {
            c15135.m36294(c5903);
        }
        if (this.hashTreeDataExtent_ != null) {
            this.bitField0_ |= 512;
            onChanged();
        }
        return this;
    }

    public C7002 clearHashTreeDataExtent() {
        this.bitField0_ &= -513;
        this.hashTreeDataExtent_ = null;
        C15135 c15135 = this.hashTreeDataExtentBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.hashTreeDataExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C17192 getHashTreeDataExtentBuilder() {
        this.bitField0_ |= 512;
        onChanged();
        return (C17192) getHashTreeDataExtentFieldBuilder().m36293();
    }

    @Override // l.InterfaceC21819
    public InterfaceC23543 getHashTreeDataExtentOrBuilder() {
        C15135 c15135 = this.hashTreeDataExtentBuilder_;
        if (c15135 != null) {
            return (InterfaceC23543) c15135.m36299();
        }
        C5903 c5903 = this.hashTreeDataExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    private C15135 getHashTreeDataExtentFieldBuilder() {
        if (this.hashTreeDataExtentBuilder_ == null) {
            this.hashTreeDataExtentBuilder_ = new C15135(getHashTreeDataExtent(), getParentForChildren(), isClean());
            this.hashTreeDataExtent_ = null;
        }
        return this.hashTreeDataExtentBuilder_;
    }

    @Override // l.InterfaceC21819
    public boolean hasHashTreeExtent() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Override // l.InterfaceC21819
    public C5903 getHashTreeExtent() {
        C15135 c15135 = this.hashTreeExtentBuilder_;
        if (c15135 == null) {
            C5903 c5903 = this.hashTreeExtent_;
            return c5903 == null ? C5903.getDefaultInstance() : c5903;
        }
        return (C5903) c15135.m36295();
    }

    public C7002 setHashTreeExtent(C5903 c5903) {
        C15135 c15135 = this.hashTreeExtentBuilder_;
        if (c15135 == null) {
            c5903.getClass();
            this.hashTreeExtent_ = c5903;
        } else {
            c15135.m36298(c5903);
        }
        this.bitField0_ |= 1024;
        onChanged();
        return this;
    }

    public C7002 setHashTreeExtent(C17192 c17192) {
        C15135 c15135 = this.hashTreeExtentBuilder_;
        if (c15135 == null) {
            this.hashTreeExtent_ = c17192.build();
        } else {
            c15135.m36298(c17192.build());
        }
        this.bitField0_ |= 1024;
        onChanged();
        return this;
    }

    public C7002 mergeHashTreeExtent(C5903 c5903) {
        C5903 c5904;
        C15135 c15135 = this.hashTreeExtentBuilder_;
        if (c15135 == null) {
            if ((this.bitField0_ & 1024) != 0 && (c5904 = this.hashTreeExtent_) != null && c5904 != C5903.getDefaultInstance()) {
                getHashTreeExtentBuilder().mergeFrom(c5903);
            } else {
                this.hashTreeExtent_ = c5903;
            }
        } else {
            c15135.m36294(c5903);
        }
        if (this.hashTreeExtent_ != null) {
            this.bitField0_ |= 1024;
            onChanged();
        }
        return this;
    }

    public C7002 clearHashTreeExtent() {
        this.bitField0_ &= -1025;
        this.hashTreeExtent_ = null;
        C15135 c15135 = this.hashTreeExtentBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.hashTreeExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C17192 getHashTreeExtentBuilder() {
        this.bitField0_ |= 1024;
        onChanged();
        return (C17192) getHashTreeExtentFieldBuilder().m36293();
    }

    @Override // l.InterfaceC21819
    public InterfaceC23543 getHashTreeExtentOrBuilder() {
        C15135 c15135 = this.hashTreeExtentBuilder_;
        if (c15135 != null) {
            return (InterfaceC23543) c15135.m36299();
        }
        C5903 c5903 = this.hashTreeExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    private C15135 getHashTreeExtentFieldBuilder() {
        if (this.hashTreeExtentBuilder_ == null) {
            this.hashTreeExtentBuilder_ = new C15135(getHashTreeExtent(), getParentForChildren(), isClean());
            this.hashTreeExtent_ = null;
        }
        return this.hashTreeExtentBuilder_;
    }

    @Override // l.InterfaceC21819
    public boolean hasHashTreeAlgorithm() {
        return (this.bitField0_ & 2048) != 0;
    }

    @Override // l.InterfaceC21819
    public String getHashTreeAlgorithm() {
        Object obj = this.hashTreeAlgorithm_;
        if (!(obj instanceof String)) {
            AbstractC23725 abstractC23725 = (AbstractC23725) obj;
            String strM52260 = abstractC23725.m52260();
            if (abstractC23725.mo16494()) {
                this.hashTreeAlgorithm_ = strM52260;
            }
            return strM52260;
        }
        return (String) obj;
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

    public C7002 setHashTreeAlgorithm(String str) {
        str.getClass();
        this.hashTreeAlgorithm_ = str;
        this.bitField0_ |= 2048;
        onChanged();
        return this;
    }

    public C7002 clearHashTreeAlgorithm() {
        this.hashTreeAlgorithm_ = C23231.getDefaultInstance().getHashTreeAlgorithm();
        this.bitField0_ &= -2049;
        onChanged();
        return this;
    }

    public C7002 setHashTreeAlgorithmBytes(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.hashTreeAlgorithm_ = abstractC23725;
        this.bitField0_ |= 2048;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC21819
    public boolean hasHashTreeSalt() {
        return (this.bitField0_ & 4096) != 0;
    }

    @Override // l.InterfaceC21819
    public AbstractC23725 getHashTreeSalt() {
        return this.hashTreeSalt_;
    }

    public C7002 setHashTreeSalt(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.hashTreeSalt_ = abstractC23725;
        this.bitField0_ |= 4096;
        onChanged();
        return this;
    }

    public C7002 clearHashTreeSalt() {
        this.bitField0_ &= -4097;
        this.hashTreeSalt_ = C23231.getDefaultInstance().getHashTreeSalt();
        onChanged();
        return this;
    }

    @Override // l.InterfaceC21819
    public boolean hasFecDataExtent() {
        return (this.bitField0_ & 8192) != 0;
    }

    @Override // l.InterfaceC21819
    public C5903 getFecDataExtent() {
        C15135 c15135 = this.fecDataExtentBuilder_;
        if (c15135 == null) {
            C5903 c5903 = this.fecDataExtent_;
            return c5903 == null ? C5903.getDefaultInstance() : c5903;
        }
        return (C5903) c15135.m36295();
    }

    public C7002 setFecDataExtent(C5903 c5903) {
        C15135 c15135 = this.fecDataExtentBuilder_;
        if (c15135 == null) {
            c5903.getClass();
            this.fecDataExtent_ = c5903;
        } else {
            c15135.m36298(c5903);
        }
        this.bitField0_ |= 8192;
        onChanged();
        return this;
    }

    public C7002 setFecDataExtent(C17192 c17192) {
        C15135 c15135 = this.fecDataExtentBuilder_;
        if (c15135 == null) {
            this.fecDataExtent_ = c17192.build();
        } else {
            c15135.m36298(c17192.build());
        }
        this.bitField0_ |= 8192;
        onChanged();
        return this;
    }

    public C7002 mergeFecDataExtent(C5903 c5903) {
        C5903 c5904;
        C15135 c15135 = this.fecDataExtentBuilder_;
        if (c15135 == null) {
            if ((this.bitField0_ & 8192) != 0 && (c5904 = this.fecDataExtent_) != null && c5904 != C5903.getDefaultInstance()) {
                getFecDataExtentBuilder().mergeFrom(c5903);
            } else {
                this.fecDataExtent_ = c5903;
            }
        } else {
            c15135.m36294(c5903);
        }
        if (this.fecDataExtent_ != null) {
            this.bitField0_ |= 8192;
            onChanged();
        }
        return this;
    }

    public C7002 clearFecDataExtent() {
        this.bitField0_ &= -8193;
        this.fecDataExtent_ = null;
        C15135 c15135 = this.fecDataExtentBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.fecDataExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C17192 getFecDataExtentBuilder() {
        this.bitField0_ |= 8192;
        onChanged();
        return (C17192) getFecDataExtentFieldBuilder().m36293();
    }

    @Override // l.InterfaceC21819
    public InterfaceC23543 getFecDataExtentOrBuilder() {
        C15135 c15135 = this.fecDataExtentBuilder_;
        if (c15135 != null) {
            return (InterfaceC23543) c15135.m36299();
        }
        C5903 c5903 = this.fecDataExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    private C15135 getFecDataExtentFieldBuilder() {
        if (this.fecDataExtentBuilder_ == null) {
            this.fecDataExtentBuilder_ = new C15135(getFecDataExtent(), getParentForChildren(), isClean());
            this.fecDataExtent_ = null;
        }
        return this.fecDataExtentBuilder_;
    }

    @Override // l.InterfaceC21819
    public boolean hasFecExtent() {
        return (this.bitField0_ & 16384) != 0;
    }

    @Override // l.InterfaceC21819
    public C5903 getFecExtent() {
        C15135 c15135 = this.fecExtentBuilder_;
        if (c15135 == null) {
            C5903 c5903 = this.fecExtent_;
            return c5903 == null ? C5903.getDefaultInstance() : c5903;
        }
        return (C5903) c15135.m36295();
    }

    public C7002 setFecExtent(C5903 c5903) {
        C15135 c15135 = this.fecExtentBuilder_;
        if (c15135 == null) {
            c5903.getClass();
            this.fecExtent_ = c5903;
        } else {
            c15135.m36298(c5903);
        }
        this.bitField0_ |= 16384;
        onChanged();
        return this;
    }

    public C7002 setFecExtent(C17192 c17192) {
        C15135 c15135 = this.fecExtentBuilder_;
        if (c15135 == null) {
            this.fecExtent_ = c17192.build();
        } else {
            c15135.m36298(c17192.build());
        }
        this.bitField0_ |= 16384;
        onChanged();
        return this;
    }

    public C7002 mergeFecExtent(C5903 c5903) {
        C5903 c5904;
        C15135 c15135 = this.fecExtentBuilder_;
        if (c15135 == null) {
            if ((this.bitField0_ & 16384) != 0 && (c5904 = this.fecExtent_) != null && c5904 != C5903.getDefaultInstance()) {
                getFecExtentBuilder().mergeFrom(c5903);
            } else {
                this.fecExtent_ = c5903;
            }
        } else {
            c15135.m36294(c5903);
        }
        if (this.fecExtent_ != null) {
            this.bitField0_ |= 16384;
            onChanged();
        }
        return this;
    }

    public C7002 clearFecExtent() {
        this.bitField0_ &= -16385;
        this.fecExtent_ = null;
        C15135 c15135 = this.fecExtentBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.fecExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C17192 getFecExtentBuilder() {
        this.bitField0_ |= 16384;
        onChanged();
        return (C17192) getFecExtentFieldBuilder().m36293();
    }

    @Override // l.InterfaceC21819
    public InterfaceC23543 getFecExtentOrBuilder() {
        C15135 c15135 = this.fecExtentBuilder_;
        if (c15135 != null) {
            return (InterfaceC23543) c15135.m36299();
        }
        C5903 c5903 = this.fecExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    private C15135 getFecExtentFieldBuilder() {
        if (this.fecExtentBuilder_ == null) {
            this.fecExtentBuilder_ = new C15135(getFecExtent(), getParentForChildren(), isClean());
            this.fecExtent_ = null;
        }
        return this.fecExtentBuilder_;
    }

    @Override // l.InterfaceC21819
    public boolean hasFecRoots() {
        return (this.bitField0_ & 32768) != 0;
    }

    @Override // l.InterfaceC21819
    public int getFecRoots() {
        return this.fecRoots_;
    }

    public C7002 setFecRoots(int i) {
        this.fecRoots_ = i;
        this.bitField0_ |= 32768;
        onChanged();
        return this;
    }

    public C7002 clearFecRoots() {
        this.bitField0_ &= -32769;
        this.fecRoots_ = 2;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC21819
    public boolean hasVersion() {
        return (this.bitField0_ & 65536) != 0;
    }

    @Override // l.InterfaceC21819
    public String getVersion() {
        Object obj = this.version_;
        if (!(obj instanceof String)) {
            AbstractC23725 abstractC23725 = (AbstractC23725) obj;
            String strM52260 = abstractC23725.m52260();
            if (abstractC23725.mo16494()) {
                this.version_ = strM52260;
            }
            return strM52260;
        }
        return (String) obj;
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

    public C7002 setVersion(String str) {
        str.getClass();
        this.version_ = str;
        this.bitField0_ |= 65536;
        onChanged();
        return this;
    }

    public C7002 clearVersion() {
        this.version_ = C23231.getDefaultInstance().getVersion();
        this.bitField0_ &= -65537;
        onChanged();
        return this;
    }

    public C7002 setVersionBytes(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.version_ = abstractC23725;
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

    @Override // l.InterfaceC21819
    public List getMergeOperationsList() {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 == null) {
            return C0561.unmodifiableList(this.mergeOperations_);
        }
        return c22190.m49235();
    }

    @Override // l.InterfaceC21819
    public int getMergeOperationsCount() {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 == null) {
            return this.mergeOperations_.size();
        }
        return c22190.m49252();
    }

    @Override // l.InterfaceC21819
    public C12959 getMergeOperations(int i) {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 == null) {
            return (C12959) this.mergeOperations_.get(i);
        }
        return (C12959) c22190.m49249(i);
    }

    public C7002 setMergeOperations(int i, C12959 c12959) {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 == null) {
            c12959.getClass();
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.set(i, c12959);
            onChanged();
            return this;
        }
        c22190.m49246(i, c12959);
        return this;
    }

    public C7002 setMergeOperations(int i, C5197 c5197) {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.set(i, c5197.build());
            onChanged();
            return this;
        }
        c22190.m49246(i, c5197.build());
        return this;
    }

    public C7002 addMergeOperations(C12959 c12959) {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 == null) {
            c12959.getClass();
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(c12959);
            onChanged();
            return this;
        }
        c22190.m49251(c12959);
        return this;
    }

    public C7002 addMergeOperations(int i, C12959 c12959) {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 == null) {
            c12959.getClass();
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(i, c12959);
            onChanged();
            return this;
        }
        c22190.m49250(i, c12959);
        return this;
    }

    public C7002 addMergeOperations(C5197 c5197) {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(c5197.build());
            onChanged();
            return this;
        }
        c22190.m49251(c5197.build());
        return this;
    }

    public C7002 addMergeOperations(int i, C5197 c5197) {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.add(i, c5197.build());
            onChanged();
            return this;
        }
        c22190.m49250(i, c5197.build());
        return this;
    }

    public C7002 addAllMergeOperations(Iterable iterable) {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 == null) {
            ensureMergeOperationsIsMutable();
            AbstractC21607.m48315(iterable, this.mergeOperations_);
            onChanged();
            return this;
        }
        c22190.m49242(iterable);
        return this;
    }

    public C7002 clearMergeOperations() {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 == null) {
            this.mergeOperations_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -131073;
            onChanged();
            return this;
        }
        c22190.m49245();
        return this;
    }

    public C7002 removeMergeOperations(int i) {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 == null) {
            ensureMergeOperationsIsMutable();
            this.mergeOperations_.remove(i);
            onChanged();
            return this;
        }
        c22190.m49237(i);
        return this;
    }

    public C5197 getMergeOperationsBuilder(int i) {
        return (C5197) getMergeOperationsFieldBuilder().m49239(i);
    }

    @Override // l.InterfaceC21819
    public InterfaceC6608 getMergeOperationsOrBuilder(int i) {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 == null) {
            return (InterfaceC6608) this.mergeOperations_.get(i);
        }
        return (InterfaceC6608) c22190.m49244(i);
    }

    @Override // l.InterfaceC21819
    public List getMergeOperationsOrBuilderList() {
        C22190 c22190 = this.mergeOperationsBuilder_;
        if (c22190 != null) {
            return c22190.m49247();
        }
        return C0561.unmodifiableList(this.mergeOperations_);
    }

    public C5197 addMergeOperationsBuilder() {
        return (C5197) getMergeOperationsFieldBuilder().m49241(C12959.getDefaultInstance());
    }

    public C5197 addMergeOperationsBuilder(int i) {
        return (C5197) getMergeOperationsFieldBuilder().m49240(i, C12959.getDefaultInstance());
    }

    public List getMergeOperationsBuilderList() {
        return getMergeOperationsFieldBuilder().m49243();
    }

    private C22190 getMergeOperationsFieldBuilder() {
        if (this.mergeOperationsBuilder_ == null) {
            this.mergeOperationsBuilder_ = new C22190(this.mergeOperations_, (this.bitField0_ & WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT) != 0, getParentForChildren(), isClean());
            this.mergeOperations_ = null;
        }
        return this.mergeOperationsBuilder_;
    }

    @Override // l.InterfaceC21819
    public boolean hasEstimateCowSize() {
        return (this.bitField0_ & 262144) != 0;
    }

    @Override // l.InterfaceC21819
    public long getEstimateCowSize() {
        return this.estimateCowSize_;
    }

    public C7002 setEstimateCowSize(long j) {
        this.estimateCowSize_ = j;
        this.bitField0_ |= 262144;
        onChanged();
        return this;
    }

    public C7002 clearEstimateCowSize() {
        this.bitField0_ &= -262145;
        this.estimateCowSize_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC21819
    public boolean hasEstimateOpCountMax() {
        return (this.bitField0_ & 524288) != 0;
    }

    @Override // l.InterfaceC21819
    public long getEstimateOpCountMax() {
        return this.estimateOpCountMax_;
    }

    public C7002 setEstimateOpCountMax(long j) {
        this.estimateOpCountMax_ = j;
        this.bitField0_ |= 524288;
        onChanged();
        return this;
    }

    public C7002 clearEstimateOpCountMax() {
        this.bitField0_ &= -524289;
        this.estimateOpCountMax_ = 0L;
        onChanged();
        return this;
    }
}
