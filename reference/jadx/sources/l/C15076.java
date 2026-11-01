package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܶ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C15076 extends AbstractC0584 implements InterfaceC18603 {
    public C22190 apexInfoBuilder_;
    public List apexInfo_;
    public int bitField0_;
    public int blockSize_;
    public C15135 dynamicPartitionMetadataBuilder_;
    public C20015 dynamicPartitionMetadata_;
    public long maxTimestamp_;
    public int minorVersion_;
    public boolean partialUpdate_;
    public C22190 partitionsBuilder_;
    public List partitions_;
    public Object securityPatchLevel_;
    public long signaturesOffset_;
    public long signaturesSize_;

    public /* synthetic */ C15076(int i) {
        this();
    }

    public /* synthetic */ C15076(InterfaceC6790 interfaceC6790, int i) {
        this(interfaceC6790);
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_descriptor;
    }

    @Override // l.AbstractC0584
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_fieldAccessorTable;
        c6956.m18696(C21425.class, C15076.class);
        return c6956;
    }

    public C15076() {
        this.blockSize_ = 4096;
        List list = Collections.EMPTY_LIST;
        this.partitions_ = list;
        this.apexInfo_ = list;
        this.securityPatchLevel_ = "";
        maybeForceBuilderInitialization();
    }

    public C15076(InterfaceC6790 interfaceC6790) {
        super(interfaceC6790);
        this.blockSize_ = 4096;
        List list = Collections.EMPTY_LIST;
        this.partitions_ = list;
        this.apexInfo_ = list;
        this.securityPatchLevel_ = "";
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC18245.alwaysUseFieldBuilders) {
            getPartitionsFieldBuilder();
            getDynamicPartitionMetadataFieldBuilder();
            getApexInfoFieldBuilder();
        }
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public C15076 mo2777clear() {
        super.mo2777clear();
        this.bitField0_ = 0;
        this.blockSize_ = 4096;
        this.signaturesOffset_ = 0L;
        this.signaturesSize_ = 0L;
        this.minorVersion_ = 0;
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            this.partitions_ = Collections.EMPTY_LIST;
        } else {
            this.partitions_ = null;
            c22190.m49245();
        }
        this.bitField0_ &= -17;
        this.maxTimestamp_ = 0L;
        this.dynamicPartitionMetadata_ = null;
        C15135 c15135 = this.dynamicPartitionMetadataBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.dynamicPartitionMetadataBuilder_ = null;
        }
        this.partialUpdate_ = false;
        C22190 c22191 = this.apexInfoBuilder_;
        if (c22191 == null) {
            this.apexInfo_ = Collections.EMPTY_LIST;
        } else {
            this.apexInfo_ = null;
            c22191.m49245();
        }
        this.bitField0_ &= -257;
        this.securityPatchLevel_ = "";
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public C2806 getDescriptorForType() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_descriptor;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public C21425 getDefaultInstanceForType() {
        return C21425.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C21425 build() {
        C21425 c21425BuildPartial = buildPartial();
        if (c21425BuildPartial.isInitialized()) {
            return c21425BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c21425BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C21425 buildPartial() {
        C21425 c21425 = new C21425(this);
        buildPartialRepeatedFields(c21425);
        if (this.bitField0_ != 0) {
            buildPartial0(c21425);
        }
        onBuilt();
        return c21425;
    }

    private void buildPartialRepeatedFields(C21425 c21425) {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            if ((this.bitField0_ & 16) != 0) {
                this.partitions_ = C0561.unmodifiableList(this.partitions_);
                this.bitField0_ &= -17;
            }
            c21425.partitions_ = this.partitions_;
        } else {
            c21425.partitions_ = c22190.m49248();
        }
        C22190 c22191 = this.apexInfoBuilder_;
        if (c22191 == null) {
            if ((this.bitField0_ & 256) != 0) {
                this.apexInfo_ = C0561.unmodifiableList(this.apexInfo_);
                this.bitField0_ &= -257;
            }
            c21425.apexInfo_ = this.apexInfo_;
            return;
        }
        c21425.apexInfo_ = c22191.m49248();
    }

    private void buildPartial0(C21425 c21425) {
        int i;
        C20015 c20015;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c21425.blockSize_ = this.blockSize_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c21425.signaturesOffset_ = this.signaturesOffset_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c21425.signaturesSize_ = this.signaturesSize_;
            i |= 4;
        }
        if ((i2 & 8) != 0) {
            c21425.minorVersion_ = this.minorVersion_;
            i |= 8;
        }
        if ((i2 & 32) != 0) {
            c21425.maxTimestamp_ = this.maxTimestamp_;
            i |= 16;
        }
        if ((i2 & 64) != 0) {
            C15135 c15135 = this.dynamicPartitionMetadataBuilder_;
            if (c15135 == null) {
                c20015 = this.dynamicPartitionMetadata_;
            } else {
                c20015 = (C20015) c15135.m36297();
            }
            c21425.dynamicPartitionMetadata_ = c20015;
            i |= 32;
        }
        if ((i2 & 128) != 0) {
            c21425.partialUpdate_ = this.partialUpdate_;
            i |= 64;
        }
        if ((i2 & 512) != 0) {
            c21425.securityPatchLevel_ = this.securityPatchLevel_;
            i |= 128;
        }
        c21425.bitField0_ |= i;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public C15076 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C21425) {
            return mergeFrom((C21425) interfaceC1332);
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    public C15076 mergeFrom(C21425 c21425) {
        if (c21425 == C21425.getDefaultInstance()) {
            return this;
        }
        if (c21425.hasBlockSize()) {
            setBlockSize(c21425.getBlockSize());
        }
        if (c21425.hasSignaturesOffset()) {
            setSignaturesOffset(c21425.getSignaturesOffset());
        }
        if (c21425.hasSignaturesSize()) {
            setSignaturesSize(c21425.getSignaturesSize());
        }
        if (c21425.hasMinorVersion()) {
            setMinorVersion(c21425.getMinorVersion());
        }
        if (this.partitionsBuilder_ == null) {
            if (!c21425.partitions_.isEmpty()) {
                if (this.partitions_.isEmpty()) {
                    this.partitions_ = c21425.partitions_;
                    this.bitField0_ &= -17;
                } else {
                    ensurePartitionsIsMutable();
                    this.partitions_.addAll(c21425.partitions_);
                }
                onChanged();
            }
        } else if (!c21425.partitions_.isEmpty()) {
            if (this.partitionsBuilder_.m49238()) {
                this.partitionsBuilder_.m49236();
                this.partitionsBuilder_ = null;
                this.partitions_ = c21425.partitions_;
                this.bitField0_ &= -17;
                this.partitionsBuilder_ = AbstractC18245.alwaysUseFieldBuilders ? getPartitionsFieldBuilder() : null;
            } else {
                this.partitionsBuilder_.m49242(c21425.partitions_);
            }
        }
        if (c21425.hasMaxTimestamp()) {
            setMaxTimestamp(c21425.getMaxTimestamp());
        }
        if (c21425.hasDynamicPartitionMetadata()) {
            mergeDynamicPartitionMetadata(c21425.getDynamicPartitionMetadata());
        }
        if (c21425.hasPartialUpdate()) {
            setPartialUpdate(c21425.getPartialUpdate());
        }
        if (this.apexInfoBuilder_ == null) {
            if (!c21425.apexInfo_.isEmpty()) {
                if (this.apexInfo_.isEmpty()) {
                    this.apexInfo_ = c21425.apexInfo_;
                    this.bitField0_ &= -257;
                } else {
                    ensureApexInfoIsMutable();
                    this.apexInfo_.addAll(c21425.apexInfo_);
                }
                onChanged();
            }
        } else if (!c21425.apexInfo_.isEmpty()) {
            if (this.apexInfoBuilder_.m49238()) {
                this.apexInfoBuilder_.m49236();
                this.apexInfoBuilder_ = null;
                this.apexInfo_ = c21425.apexInfo_;
                this.bitField0_ &= -257;
                this.apexInfoBuilder_ = AbstractC18245.alwaysUseFieldBuilders ? getApexInfoFieldBuilder() : null;
            } else {
                this.apexInfoBuilder_.m49242(c21425.apexInfo_);
            }
        }
        if (c21425.hasSecurityPatchLevel()) {
            this.securityPatchLevel_ = c21425.securityPatchLevel_;
            this.bitField0_ |= 512;
            onChanged();
        }
        mo2781mergeUnknownFields(c21425.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        for (int i = 0; i < getPartitionsCount(); i++) {
            if (!getPartitions(i).isInitialized()) {
                return false;
            }
        }
        return !hasDynamicPartitionMetadata() || getDynamicPartitionMetadata().isInitialized();
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public C15076 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    switch (iMo6048) {
                        case 0:
                            break;
                        case 24:
                            this.blockSize_ = abstractC3262.mo6041();
                            this.bitField0_ |= 1;
                            continue;
                        case 32:
                            this.signaturesOffset_ = abstractC3262.mo6047();
                            this.bitField0_ |= 2;
                            continue;
                        case 40:
                            this.signaturesSize_ = abstractC3262.mo6047();
                            this.bitField0_ |= 4;
                            continue;
                        case 96:
                            this.minorVersion_ = abstractC3262.mo6041();
                            this.bitField0_ |= 8;
                            continue;
                        case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                            C23231 c23231 = (C23231) abstractC3262.mo6024(C23231.parser(), c2701);
                            C22190 c22190 = this.partitionsBuilder_;
                            if (c22190 == null) {
                                ensurePartitionsIsMutable();
                                this.partitions_.add(c23231);
                            } else {
                                c22190.m49251(c23231);
                                continue;
                            }
                            break;
                        case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            this.maxTimestamp_ = abstractC3262.mo6049();
                            this.bitField0_ |= 32;
                            continue;
                        case 122:
                            abstractC3262.mo6027(getDynamicPartitionMetadataFieldBuilder().m36293(), c2701);
                            this.bitField0_ |= 64;
                            continue;
                        case 128:
                            this.partialUpdate_ = abstractC3262.mo6028();
                            this.bitField0_ |= 128;
                            continue;
                        case 138:
                            C4491 c4491 = (C4491) abstractC3262.mo6024(C4491.parser(), c2701);
                            C22190 c22191 = this.apexInfoBuilder_;
                            if (c22191 == null) {
                                ensureApexInfoIsMutable();
                                this.apexInfo_.add(c4491);
                            } else {
                                c22191.m49251(c4491);
                                continue;
                            }
                            break;
                        case 146:
                            this.securityPatchLevel_ = abstractC3262.mo6050();
                            this.bitField0_ |= 512;
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

    @Override // l.InterfaceC18603
    public boolean hasBlockSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC18603
    public int getBlockSize() {
        return this.blockSize_;
    }

    public C15076 setBlockSize(int i) {
        this.blockSize_ = i;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C15076 clearBlockSize() {
        this.bitField0_ &= -2;
        this.blockSize_ = 4096;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC18603
    public boolean hasSignaturesOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC18603
    public long getSignaturesOffset() {
        return this.signaturesOffset_;
    }

    public C15076 setSignaturesOffset(long j) {
        this.signaturesOffset_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C15076 clearSignaturesOffset() {
        this.bitField0_ &= -3;
        this.signaturesOffset_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC18603
    public boolean hasSignaturesSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC18603
    public long getSignaturesSize() {
        return this.signaturesSize_;
    }

    public C15076 setSignaturesSize(long j) {
        this.signaturesSize_ = j;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C15076 clearSignaturesSize() {
        this.bitField0_ &= -5;
        this.signaturesSize_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC18603
    public boolean hasMinorVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC18603
    public int getMinorVersion() {
        return this.minorVersion_;
    }

    public C15076 setMinorVersion(int i) {
        this.minorVersion_ = i;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C15076 clearMinorVersion() {
        this.bitField0_ &= -9;
        this.minorVersion_ = 0;
        onChanged();
        return this;
    }

    private void ensurePartitionsIsMutable() {
        if ((this.bitField0_ & 16) == 0) {
            this.partitions_ = new ArrayList(this.partitions_);
            this.bitField0_ |= 16;
        }
    }

    @Override // l.InterfaceC18603
    public List getPartitionsList() {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            return C0561.unmodifiableList(this.partitions_);
        }
        return c22190.m49235();
    }

    @Override // l.InterfaceC18603
    public int getPartitionsCount() {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            return this.partitions_.size();
        }
        return c22190.m49252();
    }

    @Override // l.InterfaceC18603
    public C23231 getPartitions(int i) {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            return (C23231) this.partitions_.get(i);
        }
        return (C23231) c22190.m49249(i);
    }

    public C15076 setPartitions(int i, C23231 c23231) {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            c23231.getClass();
            ensurePartitionsIsMutable();
            this.partitions_.set(i, c23231);
            onChanged();
            return this;
        }
        c22190.m49246(i, c23231);
        return this;
    }

    public C15076 setPartitions(int i, C7002 c7002) {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.set(i, c7002.build());
            onChanged();
            return this;
        }
        c22190.m49246(i, c7002.build());
        return this;
    }

    public C15076 addPartitions(C23231 c23231) {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            c23231.getClass();
            ensurePartitionsIsMutable();
            this.partitions_.add(c23231);
            onChanged();
            return this;
        }
        c22190.m49251(c23231);
        return this;
    }

    public C15076 addPartitions(int i, C23231 c23231) {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            c23231.getClass();
            ensurePartitionsIsMutable();
            this.partitions_.add(i, c23231);
            onChanged();
            return this;
        }
        c22190.m49250(i, c23231);
        return this;
    }

    public C15076 addPartitions(C7002 c7002) {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.add(c7002.build());
            onChanged();
            return this;
        }
        c22190.m49251(c7002.build());
        return this;
    }

    public C15076 addPartitions(int i, C7002 c7002) {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.add(i, c7002.build());
            onChanged();
            return this;
        }
        c22190.m49250(i, c7002.build());
        return this;
    }

    public C15076 addAllPartitions(Iterable iterable) {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            ensurePartitionsIsMutable();
            AbstractC21607.m48315(iterable, this.partitions_);
            onChanged();
            return this;
        }
        c22190.m49242(iterable);
        return this;
    }

    public C15076 clearPartitions() {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            this.partitions_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }
        c22190.m49245();
        return this;
    }

    public C15076 removePartitions(int i) {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.remove(i);
            onChanged();
            return this;
        }
        c22190.m49237(i);
        return this;
    }

    public C7002 getPartitionsBuilder(int i) {
        return (C7002) getPartitionsFieldBuilder().m49239(i);
    }

    @Override // l.InterfaceC18603
    public InterfaceC21819 getPartitionsOrBuilder(int i) {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 == null) {
            return (InterfaceC21819) this.partitions_.get(i);
        }
        return (InterfaceC21819) c22190.m49244(i);
    }

    @Override // l.InterfaceC18603
    public List getPartitionsOrBuilderList() {
        C22190 c22190 = this.partitionsBuilder_;
        if (c22190 != null) {
            return c22190.m49247();
        }
        return C0561.unmodifiableList(this.partitions_);
    }

    public C7002 addPartitionsBuilder() {
        return (C7002) getPartitionsFieldBuilder().m49241(C23231.getDefaultInstance());
    }

    public C7002 addPartitionsBuilder(int i) {
        return (C7002) getPartitionsFieldBuilder().m49240(i, C23231.getDefaultInstance());
    }

    public List getPartitionsBuilderList() {
        return getPartitionsFieldBuilder().m49243();
    }

    private C22190 getPartitionsFieldBuilder() {
        if (this.partitionsBuilder_ == null) {
            this.partitionsBuilder_ = new C22190(this.partitions_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
            this.partitions_ = null;
        }
        return this.partitionsBuilder_;
    }

    @Override // l.InterfaceC18603
    public boolean hasMaxTimestamp() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC18603
    public long getMaxTimestamp() {
        return this.maxTimestamp_;
    }

    public C15076 setMaxTimestamp(long j) {
        this.maxTimestamp_ = j;
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C15076 clearMaxTimestamp() {
        this.bitField0_ &= -33;
        this.maxTimestamp_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC18603
    public boolean hasDynamicPartitionMetadata() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC18603
    public C20015 getDynamicPartitionMetadata() {
        C15135 c15135 = this.dynamicPartitionMetadataBuilder_;
        if (c15135 == null) {
            C20015 c20015 = this.dynamicPartitionMetadata_;
            return c20015 == null ? C20015.getDefaultInstance() : c20015;
        }
        return (C20015) c15135.m36295();
    }

    public C15076 setDynamicPartitionMetadata(C20015 c20015) {
        C15135 c15135 = this.dynamicPartitionMetadataBuilder_;
        if (c15135 == null) {
            c20015.getClass();
            this.dynamicPartitionMetadata_ = c20015;
        } else {
            c15135.m36298(c20015);
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C15076 setDynamicPartitionMetadata(C15782 c15782) {
        C15135 c15135 = this.dynamicPartitionMetadataBuilder_;
        if (c15135 == null) {
            this.dynamicPartitionMetadata_ = c15782.build();
        } else {
            c15135.m36298(c15782.build());
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C15076 mergeDynamicPartitionMetadata(C20015 c20015) {
        C20015 c20016;
        C15135 c15135 = this.dynamicPartitionMetadataBuilder_;
        if (c15135 == null) {
            if ((this.bitField0_ & 64) != 0 && (c20016 = this.dynamicPartitionMetadata_) != null && c20016 != C20015.getDefaultInstance()) {
                getDynamicPartitionMetadataBuilder().mergeFrom(c20015);
            } else {
                this.dynamicPartitionMetadata_ = c20015;
            }
        } else {
            c15135.m36294(c20015);
        }
        if (this.dynamicPartitionMetadata_ != null) {
            this.bitField0_ |= 64;
            onChanged();
        }
        return this;
    }

    public C15076 clearDynamicPartitionMetadata() {
        this.bitField0_ &= -65;
        this.dynamicPartitionMetadata_ = null;
        C15135 c15135 = this.dynamicPartitionMetadataBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.dynamicPartitionMetadataBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C15782 getDynamicPartitionMetadataBuilder() {
        this.bitField0_ |= 64;
        onChanged();
        return (C15782) getDynamicPartitionMetadataFieldBuilder().m36293();
    }

    @Override // l.InterfaceC18603
    public InterfaceC16487 getDynamicPartitionMetadataOrBuilder() {
        C15135 c15135 = this.dynamicPartitionMetadataBuilder_;
        if (c15135 != null) {
            return (InterfaceC16487) c15135.m36299();
        }
        C20015 c20015 = this.dynamicPartitionMetadata_;
        return c20015 == null ? C20015.getDefaultInstance() : c20015;
    }

    private C15135 getDynamicPartitionMetadataFieldBuilder() {
        if (this.dynamicPartitionMetadataBuilder_ == null) {
            this.dynamicPartitionMetadataBuilder_ = new C15135(getDynamicPartitionMetadata(), getParentForChildren(), isClean());
            this.dynamicPartitionMetadata_ = null;
        }
        return this.dynamicPartitionMetadataBuilder_;
    }

    @Override // l.InterfaceC18603
    public boolean hasPartialUpdate() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // l.InterfaceC18603
    public boolean getPartialUpdate() {
        return this.partialUpdate_;
    }

    public C15076 setPartialUpdate(boolean z) {
        this.partialUpdate_ = z;
        this.bitField0_ |= 128;
        onChanged();
        return this;
    }

    public C15076 clearPartialUpdate() {
        this.bitField0_ &= -129;
        this.partialUpdate_ = false;
        onChanged();
        return this;
    }

    private void ensureApexInfoIsMutable() {
        if ((this.bitField0_ & 256) == 0) {
            this.apexInfo_ = new ArrayList(this.apexInfo_);
            this.bitField0_ |= 256;
        }
    }

    @Override // l.InterfaceC18603
    public List getApexInfoList() {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 == null) {
            return C0561.unmodifiableList(this.apexInfo_);
        }
        return c22190.m49235();
    }

    @Override // l.InterfaceC18603
    public int getApexInfoCount() {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 == null) {
            return this.apexInfo_.size();
        }
        return c22190.m49252();
    }

    @Override // l.InterfaceC18603
    public C4491 getApexInfo(int i) {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 == null) {
            return (C4491) this.apexInfo_.get(i);
        }
        return (C4491) c22190.m49249(i);
    }

    public C15076 setApexInfo(int i, C4491 c4491) {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 == null) {
            c4491.getClass();
            ensureApexInfoIsMutable();
            this.apexInfo_.set(i, c4491);
            onChanged();
            return this;
        }
        c22190.m49246(i, c4491);
        return this;
    }

    public C15076 setApexInfo(int i, C3163 c3163) {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.set(i, c3163.build());
            onChanged();
            return this;
        }
        c22190.m49246(i, c3163.build());
        return this;
    }

    public C15076 addApexInfo(C4491 c4491) {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 == null) {
            c4491.getClass();
            ensureApexInfoIsMutable();
            this.apexInfo_.add(c4491);
            onChanged();
            return this;
        }
        c22190.m49251(c4491);
        return this;
    }

    public C15076 addApexInfo(int i, C4491 c4491) {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 == null) {
            c4491.getClass();
            ensureApexInfoIsMutable();
            this.apexInfo_.add(i, c4491);
            onChanged();
            return this;
        }
        c22190.m49250(i, c4491);
        return this;
    }

    public C15076 addApexInfo(C3163 c3163) {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.add(c3163.build());
            onChanged();
            return this;
        }
        c22190.m49251(c3163.build());
        return this;
    }

    public C15076 addApexInfo(int i, C3163 c3163) {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.add(i, c3163.build());
            onChanged();
            return this;
        }
        c22190.m49250(i, c3163.build());
        return this;
    }

    public C15076 addAllApexInfo(Iterable iterable) {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 == null) {
            ensureApexInfoIsMutable();
            AbstractC21607.m48315(iterable, this.apexInfo_);
            onChanged();
            return this;
        }
        c22190.m49242(iterable);
        return this;
    }

    public C15076 clearApexInfo() {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 == null) {
            this.apexInfo_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }
        c22190.m49245();
        return this;
    }

    public C15076 removeApexInfo(int i) {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.remove(i);
            onChanged();
            return this;
        }
        c22190.m49237(i);
        return this;
    }

    public C3163 getApexInfoBuilder(int i) {
        return (C3163) getApexInfoFieldBuilder().m49239(i);
    }

    @Override // l.InterfaceC18603
    public InterfaceC11548 getApexInfoOrBuilder(int i) {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 == null) {
            return (InterfaceC11548) this.apexInfo_.get(i);
        }
        return (InterfaceC11548) c22190.m49244(i);
    }

    @Override // l.InterfaceC18603
    public List getApexInfoOrBuilderList() {
        C22190 c22190 = this.apexInfoBuilder_;
        if (c22190 != null) {
            return c22190.m49247();
        }
        return C0561.unmodifiableList(this.apexInfo_);
    }

    public C3163 addApexInfoBuilder() {
        return (C3163) getApexInfoFieldBuilder().m49241(C4491.getDefaultInstance());
    }

    public C3163 addApexInfoBuilder(int i) {
        return (C3163) getApexInfoFieldBuilder().m49240(i, C4491.getDefaultInstance());
    }

    public List getApexInfoBuilderList() {
        return getApexInfoFieldBuilder().m49243();
    }

    private C22190 getApexInfoFieldBuilder() {
        if (this.apexInfoBuilder_ == null) {
            this.apexInfoBuilder_ = new C22190(this.apexInfo_, (this.bitField0_ & 256) != 0, getParentForChildren(), isClean());
            this.apexInfo_ = null;
        }
        return this.apexInfoBuilder_;
    }

    @Override // l.InterfaceC18603
    public boolean hasSecurityPatchLevel() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // l.InterfaceC18603
    public String getSecurityPatchLevel() {
        Object obj = this.securityPatchLevel_;
        if (!(obj instanceof String)) {
            AbstractC23725 abstractC23725 = (AbstractC23725) obj;
            String strM52260 = abstractC23725.m52260();
            if (abstractC23725.mo16494()) {
                this.securityPatchLevel_ = strM52260;
            }
            return strM52260;
        }
        return (String) obj;
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

    public C15076 setSecurityPatchLevel(String str) {
        str.getClass();
        this.securityPatchLevel_ = str;
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }

    public C15076 clearSecurityPatchLevel() {
        this.securityPatchLevel_ = C21425.getDefaultInstance().getSecurityPatchLevel();
        this.bitField0_ &= -513;
        onChanged();
        return this;
    }

    public C15076 setSecurityPatchLevelBytes(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.securityPatchLevel_ = abstractC23725;
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }
}
