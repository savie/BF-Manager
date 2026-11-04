package l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: l.۠֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C8286 extends AbstractC15001 implements InterfaceC10762 {
    public int bitField0_;
    public long dataLength_;
    public long dataOffset_;
    public AbstractC17084 dataSha256Hash_;
    public C14473 dstExtentsBuilder_;
    public List dstExtents_;
    public long dstLength_;
    public C14473 srcExtentsBuilder_;
    public List srcExtents_;
    public long srcLength_;
    public AbstractC17084 srcSha256Hash_;
    public int type_;

    public /* synthetic */ C8286(int i) {
        this();
    }

    public /* synthetic */ C8286(InterfaceC7937 interfaceC7937, int i) {
        this(interfaceC7937);
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_InstallOperation_descriptor;
    }

    @Override // l.AbstractC15001
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_InstallOperation_fieldAccessorTable;
        c7544.m20621(C4797.class, C8286.class);
        return c7544;
    }

    public C8286() {
        this.type_ = 0;
        List list = Collections.EMPTY_LIST;
        this.srcExtents_ = list;
        this.dstExtents_ = list;
        AbstractC17084 abstractC17084 = AbstractC17084.f55772;
        this.dataSha256Hash_ = abstractC17084;
        this.srcSha256Hash_ = abstractC17084;
    }

    public C8286(InterfaceC7937 interfaceC7937) {
        super(interfaceC7937);
        this.type_ = 0;
        List list = Collections.EMPTY_LIST;
        this.srcExtents_ = list;
        this.dstExtents_ = list;
        AbstractC17084 abstractC17084 = AbstractC17084.f55772;
        this.dataSha256Hash_ = abstractC17084;
        this.srcSha256Hash_ = abstractC17084;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public C8286 mo2313clear() {
        super.mo2313clear();
        this.bitField0_ = 0;
        this.type_ = 0;
        this.dataOffset_ = 0L;
        this.dataLength_ = 0L;
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            this.srcExtents_ = Collections.EMPTY_LIST;
        } else {
            this.srcExtents_ = null;
            c14473.m34945();
        }
        this.bitField0_ &= -9;
        this.srcLength_ = 0L;
        C14473 c14474 = this.dstExtentsBuilder_;
        if (c14474 == null) {
            this.dstExtents_ = Collections.EMPTY_LIST;
        } else {
            this.dstExtents_ = null;
            c14474.m34945();
        }
        this.bitField0_ &= -33;
        this.dstLength_ = 0L;
        AbstractC17084 abstractC17084 = AbstractC17084.f55772;
        this.dataSha256Hash_ = abstractC17084;
        this.srcSha256Hash_ = abstractC17084;
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public C24478 getDescriptorForType() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_InstallOperation_descriptor;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public C4797 getDefaultInstanceForType() {
        return C4797.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C4797 build() {
        C4797 c4797BuildPartial = buildPartial();
        if (c4797BuildPartial.isInitialized()) {
            return c4797BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c4797BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C4797 buildPartial() {
        C4797 c4797 = new C4797(this);
        buildPartialRepeatedFields(c4797);
        if (this.bitField0_ != 0) {
            buildPartial0(c4797);
        }
        onBuilt();
        return c4797;
    }

    private void buildPartialRepeatedFields(C4797 c4797) {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            if ((this.bitField0_ & 8) != 0) {
                this.srcExtents_ = C4681.unmodifiableList(this.srcExtents_);
                this.bitField0_ &= -9;
            }
            c4797.srcExtents_ = this.srcExtents_;
        } else {
            c4797.srcExtents_ = c14473.m34950();
        }
        C14473 c14474 = this.dstExtentsBuilder_;
        if (c14474 == null) {
            if ((this.bitField0_ & 32) != 0) {
                this.dstExtents_ = C4681.unmodifiableList(this.dstExtents_);
                this.bitField0_ &= -33;
            }
            c4797.dstExtents_ = this.dstExtents_;
            return;
        }
        c4797.dstExtents_ = c14474.m34950();
    }

    private void buildPartial0(C4797 c4797) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c4797.type_ = this.type_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c4797.dataOffset_ = this.dataOffset_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c4797.dataLength_ = this.dataLength_;
            i |= 4;
        }
        if ((i2 & 16) != 0) {
            c4797.srcLength_ = this.srcLength_;
            i |= 8;
        }
        if ((i2 & 64) != 0) {
            c4797.dstLength_ = this.dstLength_;
            i |= 16;
        }
        if ((i2 & 128) != 0) {
            c4797.dataSha256Hash_ = this.dataSha256Hash_;
            i |= 32;
        }
        if ((i2 & 256) != 0) {
            c4797.srcSha256Hash_ = this.srcSha256Hash_;
            i |= 64;
        }
        c4797.bitField0_ |= i;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public C8286 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C4797) {
            return mergeFrom((C4797) interfaceC21013);
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    public C8286 mergeFrom(C4797 c4797) {
        if (c4797 == C4797.getDefaultInstance()) {
            return this;
        }
        if (c4797.hasType()) {
            setType(c4797.getType());
        }
        if (c4797.hasDataOffset()) {
            setDataOffset(c4797.getDataOffset());
        }
        if (c4797.hasDataLength()) {
            setDataLength(c4797.getDataLength());
        }
        if (this.srcExtentsBuilder_ == null) {
            if (!c4797.srcExtents_.isEmpty()) {
                if (this.srcExtents_.isEmpty()) {
                    this.srcExtents_ = c4797.srcExtents_;
                    this.bitField0_ &= -9;
                } else {
                    ensureSrcExtentsIsMutable();
                    this.srcExtents_.addAll(c4797.srcExtents_);
                }
                onChanged();
            }
        } else if (!c4797.srcExtents_.isEmpty()) {
            if (this.srcExtentsBuilder_.m34938()) {
                this.srcExtentsBuilder_.m34954();
                this.srcExtentsBuilder_ = null;
                this.srcExtents_ = c4797.srcExtents_;
                this.bitField0_ &= -9;
                this.srcExtentsBuilder_ = AbstractC9035.alwaysUseFieldBuilders ? getSrcExtentsFieldBuilder() : null;
            } else {
                this.srcExtentsBuilder_.m34942(c4797.srcExtents_);
            }
        }
        if (c4797.hasSrcLength()) {
            setSrcLength(c4797.getSrcLength());
        }
        if (this.dstExtentsBuilder_ == null) {
            if (!c4797.dstExtents_.isEmpty()) {
                if (this.dstExtents_.isEmpty()) {
                    this.dstExtents_ = c4797.dstExtents_;
                    this.bitField0_ &= -33;
                } else {
                    ensureDstExtentsIsMutable();
                    this.dstExtents_.addAll(c4797.dstExtents_);
                }
                onChanged();
            }
        } else if (!c4797.dstExtents_.isEmpty()) {
            if (this.dstExtentsBuilder_.m34938()) {
                this.dstExtentsBuilder_.m34954();
                this.dstExtentsBuilder_ = null;
                this.dstExtents_ = c4797.dstExtents_;
                this.bitField0_ &= -33;
                this.dstExtentsBuilder_ = AbstractC9035.alwaysUseFieldBuilders ? getDstExtentsFieldBuilder() : null;
            } else {
                this.dstExtentsBuilder_.m34942(c4797.dstExtents_);
            }
        }
        if (c4797.hasDstLength()) {
            setDstLength(c4797.getDstLength());
        }
        if (c4797.hasDataSha256Hash()) {
            setDataSha256Hash(c4797.getDataSha256Hash());
        }
        if (c4797.hasSrcSha256Hash()) {
            setSrcSha256Hash(c4797.getSrcSha256Hash());
        }
        mo2317mergeUnknownFields(c4797.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return hasType();
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public C8286 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            int iMo11882 = abstractC3660.mo11882();
                            if (EnumC13506.forNumber(iMo11882) == null) {
                                mergeUnknownVarintField(1, iMo11882);
                            } else {
                                this.type_ = iMo11882;
                                this.bitField0_ |= 1;
                            }
                        } else if (iMo11876 == 16) {
                            this.dataOffset_ = abstractC3660.mo11896();
                            this.bitField0_ |= 2;
                        } else if (iMo11876 == 24) {
                            this.dataLength_ = abstractC3660.mo11896();
                            this.bitField0_ |= 4;
                        } else if (iMo11876 == 34) {
                            C9776 c9776 = (C9776) abstractC3660.mo11877(C9776.parser(), c24215);
                            C14473 c14473 = this.srcExtentsBuilder_;
                            if (c14473 == null) {
                                ensureSrcExtentsIsMutable();
                                this.srcExtents_.add(c9776);
                            } else {
                                c14473.m34953(c9776);
                            }
                        } else if (iMo11876 == 40) {
                            this.srcLength_ = abstractC3660.mo11896();
                            this.bitField0_ |= 16;
                        } else if (iMo11876 == 50) {
                            C9776 c9777 = (C9776) abstractC3660.mo11877(C9776.parser(), c24215);
                            C14473 c14474 = this.dstExtentsBuilder_;
                            if (c14474 == null) {
                                ensureDstExtentsIsMutable();
                                this.dstExtents_.add(c9777);
                            } else {
                                c14474.m34953(c9777);
                            }
                        } else if (iMo11876 == 56) {
                            this.dstLength_ = abstractC3660.mo11896();
                            this.bitField0_ |= 64;
                        } else if (iMo11876 == 66) {
                            this.dataSha256Hash_ = abstractC3660.mo11890();
                            this.bitField0_ |= 128;
                        } else if (iMo11876 == 74) {
                            this.srcSha256Hash_ = abstractC3660.mo11890();
                            this.bitField0_ |= 256;
                        } else if (!super.parseUnknownField(abstractC3660, c24215, iMo11876)) {
                        }
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

    @Override // l.InterfaceC10762
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC10762
    public EnumC13506 getType() {
        EnumC13506 enumC13506ForNumber = EnumC13506.forNumber(this.type_);
        return enumC13506ForNumber == null ? EnumC13506.REPLACE : enumC13506ForNumber;
    }

    public C8286 setType(EnumC13506 enumC13506) {
        enumC13506.getClass();
        this.bitField0_ |= 1;
        this.type_ = enumC13506.getNumber();
        onChanged();
        return this;
    }

    public C8286 clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC10762
    public boolean hasDataOffset() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC10762
    public long getDataOffset() {
        return this.dataOffset_;
    }

    public C8286 setDataOffset(long j) {
        this.dataOffset_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C8286 clearDataOffset() {
        this.bitField0_ &= -3;
        this.dataOffset_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC10762
    public boolean hasDataLength() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC10762
    public long getDataLength() {
        return this.dataLength_;
    }

    public C8286 setDataLength(long j) {
        this.dataLength_ = j;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C8286 clearDataLength() {
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

    @Override // l.InterfaceC10762
    public List getSrcExtentsList() {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            return C4681.unmodifiableList(this.srcExtents_);
        }
        return c14473.m34947();
    }

    @Override // l.InterfaceC10762
    public int getSrcExtentsCount() {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            return this.srcExtents_.size();
        }
        return c14473.m34948();
    }

    @Override // l.InterfaceC10762
    public C9776 getSrcExtents(int i) {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            return (C9776) this.srcExtents_.get(i);
        }
        return (C9776) c14473.m34951(i);
    }

    public C8286 setSrcExtents(int i, C9776 c9776) {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            c9776.getClass();
            ensureSrcExtentsIsMutable();
            this.srcExtents_.set(i, c9776);
            onChanged();
            return this;
        }
        c14473.m34946(i, c9776);
        return this;
    }

    public C8286 setSrcExtents(int i, C18727 c18727) {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.set(i, c18727.build());
            onChanged();
            return this;
        }
        c14473.m34946(i, c18727.build());
        return this;
    }

    public C8286 addSrcExtents(C9776 c9776) {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            c9776.getClass();
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(c9776);
            onChanged();
            return this;
        }
        c14473.m34953(c9776);
        return this;
    }

    public C8286 addSrcExtents(int i, C9776 c9776) {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            c9776.getClass();
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(i, c9776);
            onChanged();
            return this;
        }
        c14473.m34952(i, c9776);
        return this;
    }

    public C8286 addSrcExtents(C18727 c18727) {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(c18727.build());
            onChanged();
            return this;
        }
        c14473.m34953(c18727.build());
        return this;
    }

    public C8286 addSrcExtents(int i, C18727 c18727) {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.add(i, c18727.build());
            onChanged();
            return this;
        }
        c14473.m34952(i, c18727.build());
        return this;
    }

    public C8286 addAllSrcExtents(Iterable iterable) {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            ensureSrcExtentsIsMutable();
            AbstractC1225.m4447(iterable, this.srcExtents_);
            onChanged();
            return this;
        }
        c14473.m34942(iterable);
        return this;
    }

    public C8286 clearSrcExtents() {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            this.srcExtents_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -9;
            onChanged();
            return this;
        }
        c14473.m34945();
        return this;
    }

    public C8286 removeSrcExtents(int i) {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            ensureSrcExtentsIsMutable();
            this.srcExtents_.remove(i);
            onChanged();
            return this;
        }
        c14473.m34955(i);
        return this;
    }

    public C18727 getSrcExtentsBuilder(int i) {
        return (C18727) getSrcExtentsFieldBuilder().m34939(i);
    }

    @Override // l.InterfaceC10762
    public InterfaceC9031 getSrcExtentsOrBuilder(int i) {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 == null) {
            return (InterfaceC9031) this.srcExtents_.get(i);
        }
        return (InterfaceC9031) c14473.m34944(i);
    }

    @Override // l.InterfaceC10762
    public List getSrcExtentsOrBuilderList() {
        C14473 c14473 = this.srcExtentsBuilder_;
        if (c14473 != null) {
            return c14473.m34943();
        }
        return C4681.unmodifiableList(this.srcExtents_);
    }

    public C18727 addSrcExtentsBuilder() {
        return (C18727) getSrcExtentsFieldBuilder().m34941(C9776.getDefaultInstance());
    }

    public C18727 addSrcExtentsBuilder(int i) {
        return (C18727) getSrcExtentsFieldBuilder().m34940(i, C9776.getDefaultInstance());
    }

    public List getSrcExtentsBuilderList() {
        return getSrcExtentsFieldBuilder().m34949();
    }

    private C14473 getSrcExtentsFieldBuilder() {
        if (this.srcExtentsBuilder_ == null) {
            this.srcExtentsBuilder_ = new C14473(this.srcExtents_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
            this.srcExtents_ = null;
        }
        return this.srcExtentsBuilder_;
    }

    @Override // l.InterfaceC10762
    public boolean hasSrcLength() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // l.InterfaceC10762
    public long getSrcLength() {
        return this.srcLength_;
    }

    public C8286 setSrcLength(long j) {
        this.srcLength_ = j;
        this.bitField0_ |= 16;
        onChanged();
        return this;
    }

    public C8286 clearSrcLength() {
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

    @Override // l.InterfaceC10762
    public List getDstExtentsList() {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 == null) {
            return C4681.unmodifiableList(this.dstExtents_);
        }
        return c14473.m34947();
    }

    @Override // l.InterfaceC10762
    public int getDstExtentsCount() {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 == null) {
            return this.dstExtents_.size();
        }
        return c14473.m34948();
    }

    @Override // l.InterfaceC10762
    public C9776 getDstExtents(int i) {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 == null) {
            return (C9776) this.dstExtents_.get(i);
        }
        return (C9776) c14473.m34951(i);
    }

    public C8286 setDstExtents(int i, C9776 c9776) {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 == null) {
            c9776.getClass();
            ensureDstExtentsIsMutable();
            this.dstExtents_.set(i, c9776);
            onChanged();
            return this;
        }
        c14473.m34946(i, c9776);
        return this;
    }

    public C8286 setDstExtents(int i, C18727 c18727) {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.set(i, c18727.build());
            onChanged();
            return this;
        }
        c14473.m34946(i, c18727.build());
        return this;
    }

    public C8286 addDstExtents(C9776 c9776) {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 == null) {
            c9776.getClass();
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(c9776);
            onChanged();
            return this;
        }
        c14473.m34953(c9776);
        return this;
    }

    public C8286 addDstExtents(int i, C9776 c9776) {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 == null) {
            c9776.getClass();
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(i, c9776);
            onChanged();
            return this;
        }
        c14473.m34952(i, c9776);
        return this;
    }

    public C8286 addDstExtents(C18727 c18727) {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(c18727.build());
            onChanged();
            return this;
        }
        c14473.m34953(c18727.build());
        return this;
    }

    public C8286 addDstExtents(int i, C18727 c18727) {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.add(i, c18727.build());
            onChanged();
            return this;
        }
        c14473.m34952(i, c18727.build());
        return this;
    }

    public C8286 addAllDstExtents(Iterable iterable) {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 == null) {
            ensureDstExtentsIsMutable();
            AbstractC1225.m4447(iterable, this.dstExtents_);
            onChanged();
            return this;
        }
        c14473.m34942(iterable);
        return this;
    }

    public C8286 clearDstExtents() {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 == null) {
            this.dstExtents_ = Collections.EMPTY_LIST;
            this.bitField0_ &= -33;
            onChanged();
            return this;
        }
        c14473.m34945();
        return this;
    }

    public C8286 removeDstExtents(int i) {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 == null) {
            ensureDstExtentsIsMutable();
            this.dstExtents_.remove(i);
            onChanged();
            return this;
        }
        c14473.m34955(i);
        return this;
    }

    public C18727 getDstExtentsBuilder(int i) {
        return (C18727) getDstExtentsFieldBuilder().m34939(i);
    }

    @Override // l.InterfaceC10762
    public InterfaceC9031 getDstExtentsOrBuilder(int i) {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 == null) {
            return (InterfaceC9031) this.dstExtents_.get(i);
        }
        return (InterfaceC9031) c14473.m34944(i);
    }

    @Override // l.InterfaceC10762
    public List getDstExtentsOrBuilderList() {
        C14473 c14473 = this.dstExtentsBuilder_;
        if (c14473 != null) {
            return c14473.m34943();
        }
        return C4681.unmodifiableList(this.dstExtents_);
    }

    public C18727 addDstExtentsBuilder() {
        return (C18727) getDstExtentsFieldBuilder().m34941(C9776.getDefaultInstance());
    }

    public C18727 addDstExtentsBuilder(int i) {
        return (C18727) getDstExtentsFieldBuilder().m34940(i, C9776.getDefaultInstance());
    }

    public List getDstExtentsBuilderList() {
        return getDstExtentsFieldBuilder().m34949();
    }

    private C14473 getDstExtentsFieldBuilder() {
        if (this.dstExtentsBuilder_ == null) {
            this.dstExtentsBuilder_ = new C14473(this.dstExtents_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
            this.dstExtents_ = null;
        }
        return this.dstExtentsBuilder_;
    }

    @Override // l.InterfaceC10762
    public boolean hasDstLength() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // l.InterfaceC10762
    public long getDstLength() {
        return this.dstLength_;
    }

    public C8286 setDstLength(long j) {
        this.dstLength_ = j;
        this.bitField0_ |= 64;
        onChanged();
        return this;
    }

    public C8286 clearDstLength() {
        this.bitField0_ &= -65;
        this.dstLength_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC10762
    public boolean hasDataSha256Hash() {
        return (this.bitField0_ & 128) != 0;
    }

    @Override // l.InterfaceC10762
    public AbstractC17084 getDataSha256Hash() {
        return this.dataSha256Hash_;
    }

    public C8286 setDataSha256Hash(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.dataSha256Hash_ = abstractC17084;
        this.bitField0_ |= 128;
        onChanged();
        return this;
    }

    public C8286 clearDataSha256Hash() {
        this.bitField0_ &= -129;
        this.dataSha256Hash_ = C4797.getDefaultInstance().getDataSha256Hash();
        onChanged();
        return this;
    }

    @Override // l.InterfaceC10762
    public boolean hasSrcSha256Hash() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // l.InterfaceC10762
    public AbstractC17084 getSrcSha256Hash() {
        return this.srcSha256Hash_;
    }

    public C8286 setSrcSha256Hash(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.srcSha256Hash_ = abstractC17084;
        this.bitField0_ |= 256;
        onChanged();
        return this;
    }

    public C8286 clearSrcSha256Hash() {
        this.bitField0_ &= -257;
        this.srcSha256Hash_ = C4797.getDefaultInstance().getSrcSha256Hash();
        onChanged();
        return this;
    }
}
