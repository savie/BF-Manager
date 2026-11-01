package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.֫۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C1669 extends AbstractC0584 implements InterfaceC11942 {
    public int bitField0_;
    public long dataLength_;
    public long dataOffset_;
    public AbstractC23725 dataSha256Hash_;
    public C22190 dstExtentsBuilder_;
    public List dstExtents_;
    public long dstLength_;
    public C22190 srcExtentsBuilder_;
    public List srcExtents_;
    public long srcLength_;
    public AbstractC23725 srcSha256Hash_;
    public int type_;

    public /* synthetic */ C1669(int i) {
        this();
    }

    public /* synthetic */ C1669(InterfaceC6790 interfaceC6790, int i) {
        this(interfaceC6790);
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_InstallOperation_descriptor;
    }

    @Override // l.AbstractC0584
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_InstallOperation_fieldAccessorTable;
        c6956.m18696(C4885.class, C1669.class);
        return c6956;
    }

    public C1669() {
        this.type_ = 0;
        List list = Collections.EMPTY_LIST;
        this.srcExtents_ = list;
        this.dstExtents_ = list;
        AbstractC23725 abstractC23725 = AbstractC23725.f76778;
        this.dataSha256Hash_ = abstractC23725;
        this.srcSha256Hash_ = abstractC23725;
    }

    public C1669(InterfaceC6790 interfaceC6790) {
        super(interfaceC6790);
        this.type_ = 0;
        List list = Collections.EMPTY_LIST;
        this.srcExtents_ = list;
        this.dstExtents_ = list;
        AbstractC23725 abstractC23725 = AbstractC23725.f76778;
        this.dataSha256Hash_ = abstractC23725;
        this.srcSha256Hash_ = abstractC23725;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public C1669 mo2777clear() {
        super.mo2777clear();
        this.bitField0_ = 0;
        this.type_ = 0;
        this.dataOffset_ = 0L;
        this.dataLength_ = 0L;
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            this.srcExtents_ = Collections.EMPTY_LIST;
        } else {
            this.srcExtents_ = null;
            c22190.m49245();
        }
        this.bitField0_ &= -9;
        this.srcLength_ = 0L;
        C22190 c22191 = this.dstExtentsBuilder_;
        if (c22191 == null) {
            this.dstExtents_ = Collections.EMPTY_LIST;
        } else {
            this.dstExtents_ = null;
            c22191.m49245();
        }
        this.bitField0_ &= -33;
        this.dstLength_ = 0L;
        AbstractC23725 abstractC23725 = AbstractC23725.f76778;
        this.dataSha256Hash_ = abstractC23725;
        this.srcSha256Hash_ = abstractC23725;
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public C2806 getDescriptorForType() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_InstallOperation_descriptor;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public C4885 getDefaultInstanceForType() {
        return C4885.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C4885 build() {
        C4885 c4885BuildPartial = buildPartial();
        if (c4885BuildPartial.isInitialized()) {
            return c4885BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c4885BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C4885 buildPartial() {
        C4885 c4885 = new C4885(this);
        buildPartialRepeatedFields(c4885);
        if (this.bitField0_ != 0) {
            buildPartial0(c4885);
        }
        onBuilt();
        return c4885;
    }

    private void buildPartialRepeatedFields(C4885 c4885) {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            if ((this.bitField0_ & 8) != 0) {
                this.srcExtents_ = C0561.unmodifiableList(this.srcExtents_);
                this.bitField0_ &= -9;
            }
            c4885.srcExtents_ = this.srcExtents_;
        } else {
            c4885.srcExtents_ = c22190.m49248();
        }
        C22190 c22191 = this.dstExtentsBuilder_;
        if (c22191 == null) {
            if ((this.bitField0_ & 32) != 0) {
                this.dstExtents_ = C0561.unmodifiableList(this.dstExtents_);
                this.bitField0_ &= -33;
            }
            c4885.dstExtents_ = this.dstExtents_;
            return;
        }
        c4885.dstExtents_ = c22191.m49248();
    }

    private void buildPartial0(C4885 c4885) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c4885.type_ = this.type_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c4885.dataOffset_ = this.dataOffset_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c4885.dataLength_ = this.dataLength_;
            i |= 4;
        }
        if ((i2 & 16) != 0) {
            c4885.srcLength_ = this.srcLength_;
            i |= 8;
        }
        if ((i2 & 64) != 0) {
            c4885.dstLength_ = this.dstLength_;
            i |= 16;
        }
        if ((i2 & 128) != 0) {
            c4885.dataSha256Hash_ = this.dataSha256Hash_;
            i |= 32;
        }
        if ((i2 & 256) != 0) {
            c4885.srcSha256Hash_ = this.srcSha256Hash_;
            i |= 64;
        }
        c4885.bitField0_ |= i;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public C1669 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C4885) {
            return mergeFrom((C4885) interfaceC1332);
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    public C1669 mergeFrom(C4885 c4885) {
        if (c4885 == C4885.getDefaultInstance()) {
            return this;
        }
        if (c4885.hasType()) {
            setType(c4885.getType());
        }
        if (c4885.hasDataOffset()) {
            setDataOffset(c4885.getDataOffset());
        }
        if (c4885.hasDataLength()) {
            setDataLength(c4885.getDataLength());
        }
        if (this.srcExtentsBuilder_ == null) {
            if (!c4885.srcExtents_.isEmpty()) {
                if (this.srcExtents_.isEmpty()) {
                    this.srcExtents_ = c4885.srcExtents_;
                    this.bitField0_ &= -9;
                } else {
                    ensureSrcExtentsIsMutable();
                    this.srcExtents_.addAll(c4885.srcExtents_);
                }
                onChanged();
            }
        } else if (!c4885.srcExtents_.isEmpty()) {
            if (this.srcExtentsBuilder_.m49238()) {
                this.srcExtentsBuilder_.m49236();
                this.srcExtentsBuilder_ = null;
                this.srcExtents_ = c4885.srcExtents_;
                this.bitField0_ &= -9;
                this.srcExtentsBuilder_ = AbstractC18245.alwaysUseFieldBuilders ? getSrcExtentsFieldBuilder() : null;
            } else {
                this.srcExtentsBuilder_.m49242(c4885.srcExtents_);
            }
        }
        if (c4885.hasSrcLength()) {
            setSrcLength(c4885.getSrcLength());
        }
        if (this.dstExtentsBuilder_ == null) {
            if (!c4885.dstExtents_.isEmpty()) {
                if (this.dstExtents_.isEmpty()) {
                    this.dstExtents_ = c4885.dstExtents_;
                    this.bitField0_ &= -33;
                } else {
                    ensureDstExtentsIsMutable();
                    this.dstExtents_.addAll(c4885.dstExtents_);
                }
                onChanged();
            }
        } else if (!c4885.dstExtents_.isEmpty()) {
            if (this.dstExtentsBuilder_.m49238()) {
                this.dstExtentsBuilder_.m49236();
                this.dstExtentsBuilder_ = null;
                this.dstExtents_ = c4885.dstExtents_;
                this.bitField0_ &= -33;
                this.dstExtentsBuilder_ = AbstractC18245.alwaysUseFieldBuilders ? getDstExtentsFieldBuilder() : null;
            } else {
                this.dstExtentsBuilder_.m49242(c4885.dstExtents_);
            }
        }
        if (c4885.hasDstLength()) {
            setDstLength(c4885.getDstLength());
        }
        if (c4885.hasDataSha256Hash()) {
            setDataSha256Hash(c4885.getDataSha256Hash());
        }
        if (c4885.hasSrcSha256Hash()) {
            setSrcSha256Hash(c4885.getSrcSha256Hash());
        }
        mo2781mergeUnknownFields(c4885.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return hasType();
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public C1669 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            int iMo6037 = abstractC3262.mo6037();
                            if (EnumC3080.forNumber(iMo6037) == null) {
                                mergeUnknownVarintField(1, iMo6037);
                            } else {
                                this.type_ = iMo6037;
                                this.bitField0_ |= 1;
                            }
                        } else if (iMo6048 == 16) {
                            this.dataOffset_ = abstractC3262.mo6047();
                            this.bitField0_ |= 2;
                        } else if (iMo6048 == 24) {
                            this.dataLength_ = abstractC3262.mo6047();
                            this.bitField0_ |= 4;
                        } else if (iMo6048 == 34) {
                            C5903 c5903 = (C5903) abstractC3262.mo6024(C5903.parser(), c2701);
                            C22190 c22190 = this.srcExtentsBuilder_;
                            if (c22190 == null) {
                                ensureSrcExtentsIsMutable();
                                this.srcExtents_.add(c5903);
                            } else {
                                c22190.m49251(c5903);
                            }
                        } else if (iMo6048 == 40) {
                            this.srcLength_ = abstractC3262.mo6047();
                            this.bitField0_ |= 16;
                        } else if (iMo6048 == 50) {
                            C5903 c5904 = (C5903) abstractC3262.mo6024(C5903.parser(), c2701);
                            C22190 c22191 = this.dstExtentsBuilder_;
                            if (c22191 == null) {
                                ensureDstExtentsIsMutable();
                                this.dstExtents_.add(c5904);
                            } else {
                                c22191.m49251(c5904);
                            }
                        } else if (iMo6048 == 56) {
                            this.dstLength_ = abstractC3262.mo6047();
                            this.bitField0_ |= 64;
                        } else if (iMo6048 == 66) {
                            this.dataSha256Hash_ = abstractC3262.mo6050();
                            this.bitField0_ |= 128;
                        } else if (iMo6048 == 74) {
                            this.srcSha256Hash_ = abstractC3262.mo6050();
                            this.bitField0_ |= 256;
                        } else if (!super.parseUnknownField(abstractC3262, c2701, iMo6048)) {
                        }
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

    @Override // l.InterfaceC11942
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC11942
    public EnumC3080 getType() {
        EnumC3080 enumC3080ForNumber = EnumC3080.forNumber(this.type_);
        return enumC3080ForNumber == null ? EnumC3080.REPLACE : enumC3080ForNumber;
    }

    public C1669 setType(EnumC3080 enumC3080) {
        enumC3080.getClass();
        this.bitField0_ |= 1;
        this.type_ = enumC3080.getNumber();
        onChanged();
        return this;
    }

    public C1669 clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC11942
    public boolean hasDataOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC11942
    public long getDataOffset() {
        return this.dataOffset_;
    }

    public C1669 setDataOffset(long j) {
        this.dataOffset_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C1669 clearDataOffset() {
        this.bitField0_ &= -3;
        this.dataOffset_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC11942
    public boolean hasDataLength() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC11942
    public long getDataLength() {
        return this.dataLength_;
    }

    public C1669 setDataLength(long j) {
        this.dataLength_ = j;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C1669 clearDataLength() {
        this.bitField0_ &= -5;
        this.dataLength_ = 0L;
        onChanged();
        return this;
    }

    private void ensureSrcExtentsIsMutable() {
        if ((this.bitField0_ & 8) == 0) {
            this.srcExtents_ = new ArrayList(this.srcExtents_);
            this.bitField0_ |= 8;
        }
    }

    @Override // l.InterfaceC11942
    public List getSrcExtentsList() {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            return C0561.unmodifiableList(this.srcExtents_);
        }
        return c22190.m49235();
    }

    @Override // l.InterfaceC11942
    public int getSrcExtentsCount() {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            return this.srcExtents_.size();
        }
        return c22190.m49252();
    }

    @Override // l.InterfaceC11942
    public C5903 getSrcExtents(int i) {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            return (C5903) this.srcExtents_.get(i);
        }
        return (C5903) c22190.m49249(i);
    }

    public C1669 setSrcExtents(int i, C5903 c5903) {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            c5903.getClass();
            ensureSrcExtentsIsMutable();
            this.srcExtents_.set(i, c5903);
            onChanged();
            return this;
        }
        c22190.m49246(i, c5903);
        return this;
    }

    public C1669 setSrcExtents(int i, C17192 c17192) {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.set(i, c17192.build());
            onChanged();
            return this;
        }
        c22190.m49246(i, c17192.build());
        return this;
    }

    public C1669 addSrcExtents(C5903 c5903) {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            c5903.getClass();
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(c5903);
            onChanged();
            return this;
        }
        c22190.m49251(c5903);
        return this;
    }

    public C1669 addSrcExtents(int i, C5903 c5903) {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            c5903.getClass();
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(i, c5903);
            onChanged();
            return this;
        }
        c22190.m49250(i, c5903);
        return this;
    }

    public C1669 addSrcExtents(C17192 c17192) {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(c17192.build());
            onChanged();
            return this;
        }
        c22190.m49251(c17192.build());
        return this;
    }

    public C1669 addSrcExtents(int i, C17192 c17192) {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(i, c17192.build());
            onChanged();
            return this;
        }
        c22190.m49250(i, c17192.build());
        return this;
    }

    public C1669 addAllSrcExtents(Iterable iterable) {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            ensureSrcExtentsIsMutable();
            AbstractC21607.m48315(iterable, this.srcExtents_);
            onChanged();
            return this;
        }
        c22190.m49242(iterable);
        return this;
    }

    public C1669 clearSrcExtents() {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            this.srcExtents_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }
        c22190.m49245();
        return this;
    }

    public C1669 removeSrcExtents(int i) {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.remove(i);
            onChanged();
            return this;
        }
        c22190.m49237(i);
        return this;
    }

    public C17192 getSrcExtentsBuilder(int i) {
        return (C17192) getSrcExtentsFieldBuilder().m49239(i);
    }

    @Override // l.InterfaceC11942
    public InterfaceC23543 getSrcExtentsOrBuilder(int i) {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 == null) {
            return (InterfaceC23543) this.srcExtents_.get(i);
        }
        return (InterfaceC23543) c22190.m49244(i);
    }

    @Override // l.InterfaceC11942
    public List getSrcExtentsOrBuilderList() {
        C22190 c22190 = this.srcExtentsBuilder_;
        if (c22190 != null) {
            return c22190.m49247();
        }
        return C0561.unmodifiableList(this.srcExtents_);
    }

    public C17192 addSrcExtentsBuilder() {
        return (C17192) getSrcExtentsFieldBuilder().m49241(C5903.getDefaultInstance());
    }

    public C17192 addSrcExtentsBuilder(int i) {
        return (C17192) getSrcExtentsFieldBuilder().m49240(i, C5903.getDefaultInstance());
    }

    public List getSrcExtentsBuilderList() {
        return getSrcExtentsFieldBuilder().m49243();
    }

    private C22190 getSrcExtentsFieldBuilder() {
        if (this.srcExtentsBuilder_ == null) {
            this.srcExtentsBuilder_ = new C22190(this.srcExtents_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
            this.srcExtents_ = null;
        }
        return this.srcExtentsBuilder_;
    }

    @Override // l.InterfaceC11942
    public boolean hasSrcLength() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC11942
    public long getSrcLength() {
        return this.srcLength_;
    }

    public C1669 setSrcLength(long j) {
        this.srcLength_ = j;
        this.bitField0_ |= 16;
        onChanged();
        return this;
    }

    public C1669 clearSrcLength() {
        this.bitField0_ &= -17;
        this.srcLength_ = 0L;
        onChanged();
        return this;
    }

    private void ensureDstExtentsIsMutable() {
        if ((this.bitField0_ & 32) == 0) {
            this.dstExtents_ = new ArrayList(this.dstExtents_);
            this.bitField0_ |= 32;
        }
    }

    @Override // l.InterfaceC11942
    public List getDstExtentsList() {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 == null) {
            return C0561.unmodifiableList(this.dstExtents_);
        }
        return c22190.m49235();
    }

    @Override // l.InterfaceC11942
    public int getDstExtentsCount() {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 == null) {
            return this.dstExtents_.size();
        }
        return c22190.m49252();
    }

    @Override // l.InterfaceC11942
    public C5903 getDstExtents(int i) {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 == null) {
            return (C5903) this.dstExtents_.get(i);
        }
        return (C5903) c22190.m49249(i);
    }

    public C1669 setDstExtents(int i, C5903 c5903) {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 == null) {
            c5903.getClass();
            ensureDstExtentsIsMutable();
            this.dstExtents_.set(i, c5903);
            onChanged();
            return this;
        }
        c22190.m49246(i, c5903);
        return this;
    }

    public C1669 setDstExtents(int i, C17192 c17192) {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.set(i, c17192.build());
            onChanged();
            return this;
        }
        c22190.m49246(i, c17192.build());
        return this;
    }

    public C1669 addDstExtents(C5903 c5903) {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 == null) {
            c5903.getClass();
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(c5903);
            onChanged();
            return this;
        }
        c22190.m49251(c5903);
        return this;
    }

    public C1669 addDstExtents(int i, C5903 c5903) {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 == null) {
            c5903.getClass();
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(i, c5903);
            onChanged();
            return this;
        }
        c22190.m49250(i, c5903);
        return this;
    }

    public C1669 addDstExtents(C17192 c17192) {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(c17192.build());
            onChanged();
            return this;
        }
        c22190.m49251(c17192.build());
        return this;
    }

    public C1669 addDstExtents(int i, C17192 c17192) {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(i, c17192.build());
            onChanged();
            return this;
        }
        c22190.m49250(i, c17192.build());
        return this;
    }

    public C1669 addAllDstExtents(Iterable iterable) {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 == null) {
            ensureDstExtentsIsMutable();
            AbstractC21607.m48315(iterable, this.dstExtents_);
            onChanged();
            return this;
        }
        c22190.m49242(iterable);
        return this;
    }

    public C1669 clearDstExtents() {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 == null) {
            this.dstExtents_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }
        c22190.m49245();
        return this;
    }

    public C1669 removeDstExtents(int i) {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.remove(i);
            onChanged();
            return this;
        }
        c22190.m49237(i);
        return this;
    }

    public C17192 getDstExtentsBuilder(int i) {
        return (C17192) getDstExtentsFieldBuilder().m49239(i);
    }

    @Override // l.InterfaceC11942
    public InterfaceC23543 getDstExtentsOrBuilder(int i) {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 == null) {
            return (InterfaceC23543) this.dstExtents_.get(i);
        }
        return (InterfaceC23543) c22190.m49244(i);
    }

    @Override // l.InterfaceC11942
    public List getDstExtentsOrBuilderList() {
        C22190 c22190 = this.dstExtentsBuilder_;
        if (c22190 != null) {
            return c22190.m49247();
        }
        return C0561.unmodifiableList(this.dstExtents_);
    }

    public C17192 addDstExtentsBuilder() {
        return (C17192) getDstExtentsFieldBuilder().m49241(C5903.getDefaultInstance());
    }

    public C17192 addDstExtentsBuilder(int i) {
        return (C17192) getDstExtentsFieldBuilder().m49240(i, C5903.getDefaultInstance());
    }

    public List getDstExtentsBuilderList() {
        return getDstExtentsFieldBuilder().m49243();
    }

    private C22190 getDstExtentsFieldBuilder() {
        if (this.dstExtentsBuilder_ == null) {
            this.dstExtentsBuilder_ = new C22190(this.dstExtents_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
            this.dstExtents_ = null;
        }
        return this.dstExtentsBuilder_;
    }

    @Override // l.InterfaceC11942
    public boolean hasDstLength() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC11942
    public long getDstLength() {
        return this.dstLength_;
    }

    public C1669 setDstLength(long j) {
        this.dstLength_ = j;
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C1669 clearDstLength() {
        this.bitField0_ &= -65;
        this.dstLength_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC11942
    public boolean hasDataSha256Hash() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // l.InterfaceC11942
    public AbstractC23725 getDataSha256Hash() {
        return this.dataSha256Hash_;
    }

    public C1669 setDataSha256Hash(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.dataSha256Hash_ = abstractC23725;
        this.bitField0_ |= 128;
        onChanged();
        return this;
    }

    public C1669 clearDataSha256Hash() {
        this.bitField0_ &= -129;
        this.dataSha256Hash_ = C4885.getDefaultInstance().getDataSha256Hash();
        onChanged();
        return this;
    }

    @Override // l.InterfaceC11942
    public boolean hasSrcSha256Hash() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // l.InterfaceC11942
    public AbstractC23725 getSrcSha256Hash() {
        return this.srcSha256Hash_;
    }

    public C1669 setSrcSha256Hash(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.srcSha256Hash_ = abstractC23725;
        this.bitField0_ |= 256;
        onChanged();
        return this;
    }

    public C1669 clearSrcSha256Hash() {
        this.bitField0_ &= -257;
        this.srcSha256Hash_ = C4885.getDefaultInstance().getSrcSha256Hash();
        onChanged();
        return this;
    }
}
