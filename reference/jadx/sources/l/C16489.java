package l;

import com.umeng.commonsdk.statistics.UMErrorCode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moe.shizuku.server.IShizukuService;

/* JADX INFO: renamed from: l.ܺ֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C16489 extends AbstractC15001 implements InterfaceC23203 {
    public C14473 apexInfoBuilder_;
    public List apexInfo_;
    public int bitField0_;
    public int blockSize_;
    public C9998 dynamicPartitionMetadataBuilder_;
    public C20965 dynamicPartitionMetadata_;
    public long maxTimestamp_;
    public int minorVersion_;
    public boolean partialUpdate_;
    public C14473 partitionsBuilder_;
    public List partitions_;
    public Object securityPatchLevel_;
    public long signaturesOffset_;
    public long signaturesSize_;

    public /* synthetic */ C16489(int i) {
        this();
    }

    public /* synthetic */ C16489(InterfaceC7937 interfaceC7937, int i) {
        this(interfaceC7937);
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_descriptor;
    }

    @Override // l.AbstractC15001
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_fieldAccessorTable;
        c7544.m20621(C17235.class, C16489.class);
        return c7544;
    }

    public C16489() {
        this.blockSize_ = 4096;
        List list = Collections.EMPTY_LIST;
        this.partitions_ = list;
        this.apexInfo_ = list;
        this.securityPatchLevel_ = "";
        maybeForceBuilderInitialization();
    }

    public C16489(InterfaceC7937 interfaceC7937) {
        super(interfaceC7937);
        this.blockSize_ = 4096;
        List list = Collections.EMPTY_LIST;
        this.partitions_ = list;
        this.apexInfo_ = list;
        this.securityPatchLevel_ = "";
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC9035.alwaysUseFieldBuilders) {
            getPartitionsFieldBuilder();
            getDynamicPartitionMetadataFieldBuilder();
            getApexInfoFieldBuilder();
        }
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public C16489 mo2313clear() {
        super.mo2313clear();
        this.bitField0_ = 0;
        this.blockSize_ = 4096;
        this.signaturesOffset_ = 0L;
        this.signaturesSize_ = 0L;
        this.minorVersion_ = 0;
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            this.partitions_ = Collections.EMPTY_LIST;
        } else {
            this.partitions_ = null;
            c14473.m34945();
        }
        this.bitField0_ &= -17;
        this.maxTimestamp_ = 0L;
        this.dynamicPartitionMetadata_ = null;
        C9998 c9998 = this.dynamicPartitionMetadataBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.dynamicPartitionMetadataBuilder_ = null;
        }
        this.partialUpdate_ = false;
        C14473 c14474 = this.apexInfoBuilder_;
        if (c14474 == null) {
            this.apexInfo_ = Collections.EMPTY_LIST;
        } else {
            this.apexInfo_ = null;
            c14474.m34945();
        }
        this.bitField0_ &= -257;
        this.securityPatchLevel_ = "";
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public C24478 getDescriptorForType() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_DeltaArchiveManifest_descriptor;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public C17235 getDefaultInstanceForType() {
        return C17235.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C17235 build() {
        C17235 c17235BuildPartial = buildPartial();
        if (c17235BuildPartial.isInitialized()) {
            return c17235BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c17235BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C17235 buildPartial() {
        C17235 c17235 = new C17235(this);
        buildPartialRepeatedFields(c17235);
        if (this.bitField0_ != 0) {
            buildPartial0(c17235);
        }
        onBuilt();
        return c17235;
    }

    private void buildPartialRepeatedFields(C17235 c17235) {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            if ((this.bitField0_ & 16) != 0) {
                this.partitions_ = C4681.unmodifiableList(this.partitions_);
                this.bitField0_ &= -17;
            }
            c17235.partitions_ = this.partitions_;
        } else {
            c17235.partitions_ = c14473.m34950();
        }
        C14473 c14474 = this.apexInfoBuilder_;
        if (c14474 == null) {
            if ((this.bitField0_ & 256) != 0) {
                this.apexInfo_ = C4681.unmodifiableList(this.apexInfo_);
                this.bitField0_ &= -257;
            }
            c17235.apexInfo_ = this.apexInfo_;
            return;
        }
        c17235.apexInfo_ = c14474.m34950();
    }

    private void buildPartial0(C17235 c17235) {
        int i;
        C20965 c20965;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c17235.blockSize_ = this.blockSize_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c17235.signaturesOffset_ = this.signaturesOffset_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c17235.signaturesSize_ = this.signaturesSize_;
            i |= 4;
        }
        if ((i2 & 8) != 0) {
            c17235.minorVersion_ = this.minorVersion_;
            i |= 8;
        }
        if ((i2 & 32) != 0) {
            c17235.maxTimestamp_ = this.maxTimestamp_;
            i |= 16;
        }
        if ((i2 & 64) != 0) {
            C9998 c9998 = this.dynamicPartitionMetadataBuilder_;
            if (c9998 == null) {
                c20965 = this.dynamicPartitionMetadata_;
            } else {
                c20965 = (C20965) c9998.m25854();
            }
            c17235.dynamicPartitionMetadata_ = c20965;
            i |= 32;
        }
        if ((i2 & 128) != 0) {
            c17235.partialUpdate_ = this.partialUpdate_;
            i |= 64;
        }
        if ((i2 & 512) != 0) {
            c17235.securityPatchLevel_ = this.securityPatchLevel_;
            i |= 128;
        }
        c17235.bitField0_ |= i;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public C16489 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C17235) {
            return mergeFrom((C17235) interfaceC21013);
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    public C16489 mergeFrom(C17235 c17235) {
        if (c17235 == C17235.getDefaultInstance()) {
            return this;
        }
        if (c17235.hasBlockSize()) {
            setBlockSize(c17235.getBlockSize());
        }
        if (c17235.hasSignaturesOffset()) {
            setSignaturesOffset(c17235.getSignaturesOffset());
        }
        if (c17235.hasSignaturesSize()) {
            setSignaturesSize(c17235.getSignaturesSize());
        }
        if (c17235.hasMinorVersion()) {
            setMinorVersion(c17235.getMinorVersion());
        }
        if (this.partitionsBuilder_ == null) {
            if (!c17235.partitions_.isEmpty()) {
                if (this.partitions_.isEmpty()) {
                    this.partitions_ = c17235.partitions_;
                    this.bitField0_ &= -17;
                } else {
                    ensurePartitionsIsMutable();
                    this.partitions_.addAll(c17235.partitions_);
                }
                onChanged();
            }
        } else if (!c17235.partitions_.isEmpty()) {
            if (this.partitionsBuilder_.m34938()) {
                this.partitionsBuilder_.m34954();
                this.partitionsBuilder_ = null;
                this.partitions_ = c17235.partitions_;
                this.bitField0_ &= -17;
                this.partitionsBuilder_ = AbstractC9035.alwaysUseFieldBuilders ? getPartitionsFieldBuilder() : null;
            } else {
                this.partitionsBuilder_.m34942(c17235.partitions_);
            }
        }
        if (c17235.hasMaxTimestamp()) {
            setMaxTimestamp(c17235.getMaxTimestamp());
        }
        if (c17235.hasDynamicPartitionMetadata()) {
            mergeDynamicPartitionMetadata(c17235.getDynamicPartitionMetadata());
        }
        if (c17235.hasPartialUpdate()) {
            setPartialUpdate(c17235.getPartialUpdate());
        }
        if (this.apexInfoBuilder_ == null) {
            if (!c17235.apexInfo_.isEmpty()) {
                if (this.apexInfo_.isEmpty()) {
                    this.apexInfo_ = c17235.apexInfo_;
                    this.bitField0_ &= -257;
                } else {
                    ensureApexInfoIsMutable();
                    this.apexInfo_.addAll(c17235.apexInfo_);
                }
                onChanged();
            }
        } else if (!c17235.apexInfo_.isEmpty()) {
            if (this.apexInfoBuilder_.m34938()) {
                this.apexInfoBuilder_.m34954();
                this.apexInfoBuilder_ = null;
                this.apexInfo_ = c17235.apexInfo_;
                this.bitField0_ &= -257;
                this.apexInfoBuilder_ = AbstractC9035.alwaysUseFieldBuilders ? getApexInfoFieldBuilder() : null;
            } else {
                this.apexInfoBuilder_.m34942(c17235.apexInfo_);
            }
        }
        if (c17235.hasSecurityPatchLevel()) {
            this.securityPatchLevel_ = c17235.securityPatchLevel_;
            this.bitField0_ |= 512;
            onChanged();
        }
        mo2317mergeUnknownFields(c17235.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        for (int i = 0; i < getPartitionsCount(); i++) {
            if (!getPartitions(i).isInitialized()) {
                return false;
            }
        }
        return !hasDynamicPartitionMetadata() || getDynamicPartitionMetadata().isInitialized();
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public C16489 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    switch (iMo11876) {
                        case 0:
                            break;
                        case 24:
                            this.blockSize_ = abstractC3660.mo11889();
                            this.bitField0_ |= 1;
                            continue;
                        case 32:
                            this.signaturesOffset_ = abstractC3660.mo11896();
                            this.bitField0_ |= 2;
                            continue;
                        case 40:
                            this.signaturesSize_ = abstractC3660.mo11896();
                            this.bitField0_ |= 4;
                            continue;
                        case 96:
                            this.minorVersion_ = abstractC3660.mo11889();
                            this.bitField0_ |= 8;
                            continue;
                        case IShizukuService.Stub.TRANSACTION_getFlagsForUid /* 106 */:
                            C24935 c24935 = (C24935) abstractC3660.mo11877(C24935.parser(), c24215);
                            C14473 c14473 = this.partitionsBuilder_;
                            if (c14473 == null) {
                                ensurePartitionsIsMutable();
                                this.partitions_.add(c24935);
                            } else {
                                c14473.m34953(c24935);
                                continue;
                            }
                            break;
                        case UMErrorCode.E_UM_BE_DEFLATE_FAILED /* 112 */:
                            this.maxTimestamp_ = abstractC3660.mo11893();
                            this.bitField0_ |= 32;
                            continue;
                        case 122:
                            abstractC3660.mo11881(getDynamicPartitionMetadataFieldBuilder().m25856(), c24215);
                            this.bitField0_ |= 64;
                            continue;
                        case 128:
                            this.partialUpdate_ = abstractC3660.mo11894();
                            this.bitField0_ |= 128;
                            continue;
                        case 138:
                            C4557 c4557 = (C4557) abstractC3660.mo11877(C4557.parser(), c24215);
                            C14473 c14474 = this.apexInfoBuilder_;
                            if (c14474 == null) {
                                ensureApexInfoIsMutable();
                                this.apexInfo_.add(c4557);
                            } else {
                                c14474.m34953(c4557);
                                continue;
                            }
                            break;
                        case 146:
                            this.securityPatchLevel_ = abstractC3660.mo11890();
                            this.bitField0_ |= 512;
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

    @Override // l.InterfaceC23203
    public boolean hasBlockSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC23203
    public int getBlockSize() {
        return this.blockSize_;
    }

    public C16489 setBlockSize(int i) {
        this.blockSize_ = i;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C16489 clearBlockSize() {
        this.bitField0_ &= -2;
        this.blockSize_ = 4096;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC23203
    public boolean hasSignaturesOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC23203
    public long getSignaturesOffset() {
        return this.signaturesOffset_;
    }

    public C16489 setSignaturesOffset(long j) {
        this.signaturesOffset_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C16489 clearSignaturesOffset() {
        this.bitField0_ &= -3;
        this.signaturesOffset_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC23203
    public boolean hasSignaturesSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC23203
    public long getSignaturesSize() {
        return this.signaturesSize_;
    }

    public C16489 setSignaturesSize(long j) {
        this.signaturesSize_ = j;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C16489 clearSignaturesSize() {
        this.bitField0_ &= -5;
        this.signaturesSize_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC23203
    public boolean hasMinorVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC23203
    public int getMinorVersion() {
        return this.minorVersion_;
    }

    public C16489 setMinorVersion(int i) {
        this.minorVersion_ = i;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C16489 clearMinorVersion() {
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

    @Override // l.InterfaceC23203
    public List getPartitionsList() {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            return C4681.unmodifiableList(this.partitions_);
        }
        return c14473.m34947();
    }

    @Override // l.InterfaceC23203
    public int getPartitionsCount() {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            return this.partitions_.size();
        }
        return c14473.m34948();
    }

    @Override // l.InterfaceC23203
    public C24935 getPartitions(int i) {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            return (C24935) this.partitions_.get(i);
        }
        return (C24935) c14473.m34951(i);
    }

    public C16489 setPartitions(int i, C24935 c24935) {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            c24935.getClass();
            ensurePartitionsIsMutable();
            this.partitions_.set(i, c24935);
            onChanged();
            return this;
        }
        c14473.m34946(i, c24935);
        return this;
    }

    public C16489 setPartitions(int i, C11508 c11508) {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.set(i, c11508.build());
            onChanged();
            return this;
        }
        c14473.m34946(i, c11508.build());
        return this;
    }

    public C16489 addPartitions(C24935 c24935) {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            c24935.getClass();
            ensurePartitionsIsMutable();
            this.partitions_.add(c24935);
            onChanged();
            return this;
        }
        c14473.m34953(c24935);
        return this;
    }

    public C16489 addPartitions(int i, C24935 c24935) {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            c24935.getClass();
            ensurePartitionsIsMutable();
            this.partitions_.add(i, c24935);
            onChanged();
            return this;
        }
        c14473.m34952(i, c24935);
        return this;
    }

    public C16489 addPartitions(C11508 c11508) {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.add(c11508.build());
            onChanged();
            return this;
        }
        c14473.m34953(c11508.build());
        return this;
    }

    public C16489 addPartitions(int i, C11508 c11508) {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.add(i, c11508.build());
            onChanged();
            return this;
        }
        c14473.m34952(i, c11508.build());
        return this;
    }

    public C16489 addAllPartitions(Iterable iterable) {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            ensurePartitionsIsMutable();
            AbstractC1225.m4447(iterable, this.partitions_);
            onChanged();
            return this;
        }
        c14473.m34942(iterable);
        return this;
    }

    public C16489 clearPartitions() {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            this.partitions_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -17;
            onChanged();
            return this;
        }
        c14473.m34945();
        return this;
    }

    public C16489 removePartitions(int i) {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            ensurePartitionsIsMutable();
            this.partitions_.remove(i);
            onChanged();
            return this;
        }
        c14473.m34955(i);
        return this;
    }

    public C11508 getPartitionsBuilder(int i) {
        return (C11508) getPartitionsFieldBuilder().m34939(i);
    }

    @Override // l.InterfaceC23203
    public InterfaceC17475 getPartitionsOrBuilder(int i) {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 == null) {
            return (InterfaceC17475) this.partitions_.get(i);
        }
        return (InterfaceC17475) c14473.m34944(i);
    }

    @Override // l.InterfaceC23203
    public List getPartitionsOrBuilderList() {
        C14473 c14473 = this.partitionsBuilder_;
        if (c14473 != null) {
            return c14473.m34943();
        }
        return C4681.unmodifiableList(this.partitions_);
    }

    public C11508 addPartitionsBuilder() {
        return (C11508) getPartitionsFieldBuilder().m34941(C24935.getDefaultInstance());
    }

    public C11508 addPartitionsBuilder(int i) {
        return (C11508) getPartitionsFieldBuilder().m34940(i, C24935.getDefaultInstance());
    }

    public List getPartitionsBuilderList() {
        return getPartitionsFieldBuilder().m34949();
    }

    private C14473 getPartitionsFieldBuilder() {
        if (this.partitionsBuilder_ == null) {
            this.partitionsBuilder_ = new C14473(this.partitions_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
            this.partitions_ = null;
        }
        return this.partitionsBuilder_;
    }

    @Override // l.InterfaceC23203
    public boolean hasMaxTimestamp() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // l.InterfaceC23203
    public long getMaxTimestamp() {
        return this.maxTimestamp_;
    }

    public C16489 setMaxTimestamp(long j) {
        this.maxTimestamp_ = j;
        this.bitField0_ |= 32;
        onChanged();
        return this;
    }

    public C16489 clearMaxTimestamp() {
        this.bitField0_ &= -33;
        this.maxTimestamp_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC23203
    public boolean hasDynamicPartitionMetadata() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC23203
    public C20965 getDynamicPartitionMetadata() {
        C9998 c9998 = this.dynamicPartitionMetadataBuilder_;
        if (c9998 == null) {
            C20965 c20965 = this.dynamicPartitionMetadata_;
            return c20965 == null ? C20965.getDefaultInstance() : c20965;
        }
        return (C20965) c9998.m25853();
    }

    public C16489 setDynamicPartitionMetadata(C20965 c20965) {
        C9998 c9998 = this.dynamicPartitionMetadataBuilder_;
        if (c9998 == null) {
            c20965.getClass();
            this.dynamicPartitionMetadata_ = c20965;
        } else {
            c9998.m25855(c20965);
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C16489 setDynamicPartitionMetadata(C14251 c14251) {
        C9998 c9998 = this.dynamicPartitionMetadataBuilder_;
        if (c9998 == null) {
            this.dynamicPartitionMetadata_ = c14251.build();
        } else {
            c9998.m25855(c14251.build());
        }
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C16489 mergeDynamicPartitionMetadata(C20965 c20965) {
        C20965 c20966;
        C9998 c9998 = this.dynamicPartitionMetadataBuilder_;
        if (c9998 == null) {
            if ((this.bitField0_ & 64) != 0 && (c20966 = this.dynamicPartitionMetadata_) != null && c20966 != C20965.getDefaultInstance()) {
                getDynamicPartitionMetadataBuilder().mergeFrom(c20965);
            } else {
                this.dynamicPartitionMetadata_ = c20965;
            }
        } else {
            c9998.m25850(c20965);
        }
        if (this.dynamicPartitionMetadata_ != null) {
            this.bitField0_ |= 64;
            onChanged();
        }
        return this;
    }

    public C16489 clearDynamicPartitionMetadata() {
        this.bitField0_ &= -65;
        this.dynamicPartitionMetadata_ = null;
        C9998 c9998 = this.dynamicPartitionMetadataBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.dynamicPartitionMetadataBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C14251 getDynamicPartitionMetadataBuilder() {
        this.bitField0_ |= 64;
        onChanged();
        return (C14251) getDynamicPartitionMetadataFieldBuilder().m25856();
    }

    @Override // l.InterfaceC23203
    public InterfaceC0082 getDynamicPartitionMetadataOrBuilder() {
        C9998 c9998 = this.dynamicPartitionMetadataBuilder_;
        if (c9998 != null) {
            return (InterfaceC0082) c9998.m25852();
        }
        C20965 c20965 = this.dynamicPartitionMetadata_;
        return c20965 == null ? C20965.getDefaultInstance() : c20965;
    }

    private C9998 getDynamicPartitionMetadataFieldBuilder() {
        if (this.dynamicPartitionMetadataBuilder_ == null) {
            this.dynamicPartitionMetadataBuilder_ = new C9998(getDynamicPartitionMetadata(), getParentForChildren(), isClean());
            this.dynamicPartitionMetadata_ = null;
        }
        return this.dynamicPartitionMetadataBuilder_;
    }

    @Override // l.InterfaceC23203
    public boolean hasPartialUpdate() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // l.InterfaceC23203
    public boolean getPartialUpdate() {
        return this.partialUpdate_;
    }

    public C16489 setPartialUpdate(boolean z) {
        this.partialUpdate_ = z;
        this.bitField0_ |= 128;
        onChanged();
        return this;
    }

    public C16489 clearPartialUpdate() {
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

    @Override // l.InterfaceC23203
    public List getApexInfoList() {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 == null) {
            return C4681.unmodifiableList(this.apexInfo_);
        }
        return c14473.m34947();
    }

    @Override // l.InterfaceC23203
    public int getApexInfoCount() {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 == null) {
            return this.apexInfo_.size();
        }
        return c14473.m34948();
    }

    @Override // l.InterfaceC23203
    public C4557 getApexInfo(int i) {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 == null) {
            return (C4557) this.apexInfo_.get(i);
        }
        return (C4557) c14473.m34951(i);
    }

    public C16489 setApexInfo(int i, C4557 c4557) {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 == null) {
            c4557.getClass();
            ensureApexInfoIsMutable();
            this.apexInfo_.set(i, c4557);
            onChanged();
            return this;
        }
        c14473.m34946(i, c4557);
        return this;
    }

    public C16489 setApexInfo(int i, C13767 c13767) {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.set(i, c13767.build());
            onChanged();
            return this;
        }
        c14473.m34946(i, c13767.build());
        return this;
    }

    public C16489 addApexInfo(C4557 c4557) {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 == null) {
            c4557.getClass();
            ensureApexInfoIsMutable();
            this.apexInfo_.add(c4557);
            onChanged();
            return this;
        }
        c14473.m34953(c4557);
        return this;
    }

    public C16489 addApexInfo(int i, C4557 c4557) {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 == null) {
            c4557.getClass();
            ensureApexInfoIsMutable();
            this.apexInfo_.add(i, c4557);
            onChanged();
            return this;
        }
        c14473.m34952(i, c4557);
        return this;
    }

    public C16489 addApexInfo(C13767 c13767) {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.add(c13767.build());
            onChanged();
            return this;
        }
        c14473.m34953(c13767.build());
        return this;
    }

    public C16489 addApexInfo(int i, C13767 c13767) {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.add(i, c13767.build());
            onChanged();
            return this;
        }
        c14473.m34952(i, c13767.build());
        return this;
    }

    public C16489 addAllApexInfo(Iterable iterable) {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 == null) {
            ensureApexInfoIsMutable();
            AbstractC1225.m4447(iterable, this.apexInfo_);
            onChanged();
            return this;
        }
        c14473.m34942(iterable);
        return this;
    }

    public C16489 clearApexInfo() {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 == null) {
            this.apexInfo_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -257;
            onChanged();
            return this;
        }
        c14473.m34945();
        return this;
    }

    public C16489 removeApexInfo(int i) {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 == null) {
            ensureApexInfoIsMutable();
            this.apexInfo_.remove(i);
            onChanged();
            return this;
        }
        c14473.m34955(i);
        return this;
    }

    public C13767 getApexInfoBuilder(int i) {
        return (C13767) getApexInfoFieldBuilder().m34939(i);
    }

    @Override // l.InterfaceC23203
    public InterfaceC10522 getApexInfoOrBuilder(int i) {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 == null) {
            return (InterfaceC10522) this.apexInfo_.get(i);
        }
        return (InterfaceC10522) c14473.m34944(i);
    }

    @Override // l.InterfaceC23203
    public List getApexInfoOrBuilderList() {
        C14473 c14473 = this.apexInfoBuilder_;
        if (c14473 != null) {
            return c14473.m34943();
        }
        return C4681.unmodifiableList(this.apexInfo_);
    }

    public C13767 addApexInfoBuilder() {
        return (C13767) getApexInfoFieldBuilder().m34941(C4557.getDefaultInstance());
    }

    public C13767 addApexInfoBuilder(int i) {
        return (C13767) getApexInfoFieldBuilder().m34940(i, C4557.getDefaultInstance());
    }

    public List getApexInfoBuilderList() {
        return getApexInfoFieldBuilder().m34949();
    }

    private C14473 getApexInfoFieldBuilder() {
        if (this.apexInfoBuilder_ == null) {
            this.apexInfoBuilder_ = new C14473(this.apexInfo_, (this.bitField0_ & 256) != 0, getParentForChildren(), isClean());
            this.apexInfo_ = null;
        }
        return this.apexInfoBuilder_;
    }

    @Override // l.InterfaceC23203
    public boolean hasSecurityPatchLevel() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // l.InterfaceC23203
    public String getSecurityPatchLevel() {
        Object obj = this.securityPatchLevel_;
        if (!(obj instanceof String)) {
            AbstractC17084 abstractC17084 = (AbstractC17084) obj;
            String strM40221 = abstractC17084.m40221();
            if (abstractC17084.mo29729()) {
                this.securityPatchLevel_ = strM40221;
            }
            return strM40221;
        }
        return (String) obj;
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

    public C16489 setSecurityPatchLevel(String str) {
        str.getClass();
        this.securityPatchLevel_ = str;
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }

    public C16489 clearSecurityPatchLevel() {
        this.securityPatchLevel_ = C17235.getDefaultInstance().getSecurityPatchLevel();
        this.bitField0_ &= -513;
        onChanged();
        return this;
    }

    public C16489 setSecurityPatchLevelBytes(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.securityPatchLevel_ = abstractC17084;
        this.bitField0_ |= 512;
        onChanged();
        return this;
    }
}
