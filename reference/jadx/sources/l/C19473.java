package l;

/* JADX INFO: renamed from: l.ᩴ֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C19473 extends AbstractC15001 implements InterfaceC11268 {
    public int bitField0_;
    public C9998 dstExtentBuilder_;
    public C9776 dstExtent_;
    public C9998 srcExtentBuilder_;
    public C9776 srcExtent_;
    public int srcOffset_;
    public int type_;

    public /* synthetic */ C19473(int i) {
        this();
    }

    public /* synthetic */ C19473(InterfaceC7937 interfaceC7937, int i) {
        this(interfaceC7937);
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_descriptor;
    }

    @Override // l.AbstractC15001
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_fieldAccessorTable;
        c7544.m20621(C5303.class, C19473.class);
        return c7544;
    }

    public C19473() {
        this.type_ = 0;
        maybeForceBuilderInitialization();
    }

    public C19473(InterfaceC7937 interfaceC7937) {
        super(interfaceC7937);
        this.type_ = 0;
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC9035.alwaysUseFieldBuilders) {
            getSrcExtentFieldBuilder();
            getDstExtentFieldBuilder();
        }
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public C19473 mo2313clear() {
        super.mo2313clear();
        this.bitField0_ = 0;
        this.type_ = 0;
        this.srcExtent_ = null;
        C9998 c9998 = this.srcExtentBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.srcExtentBuilder_ = null;
        }
        this.dstExtent_ = null;
        C9998 c9999 = this.dstExtentBuilder_;
        if (c9999 != null) {
            c9999.m25851();
            this.dstExtentBuilder_ = null;
        }
        this.srcOffset_ = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public C24478 getDescriptorForType() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_descriptor;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public C5303 getDefaultInstanceForType() {
        return C5303.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C5303 build() {
        C5303 c5303BuildPartial = buildPartial();
        if (c5303BuildPartial.isInitialized()) {
            return c5303BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c5303BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C5303 buildPartial() {
        C5303 c5303 = new C5303(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c5303);
        }
        onBuilt();
        return c5303;
    }

    private void buildPartial0(C5303 c5303) {
        int i;
        C9776 c9776;
        C9776 c9777;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c5303.type_ = this.type_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            C9998 c9998 = this.srcExtentBuilder_;
            if (c9998 == null) {
                c9777 = this.srcExtent_;
            } else {
                c9777 = (C9776) c9998.m25854();
            }
            c5303.srcExtent_ = c9777;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            C9998 c9999 = this.dstExtentBuilder_;
            if (c9999 == null) {
                c9776 = this.dstExtent_;
            } else {
                c9776 = (C9776) c9999.m25854();
            }
            c5303.dstExtent_ = c9776;
            i |= 4;
        }
        if ((i2 & 8) != 0) {
            c5303.srcOffset_ = this.srcOffset_;
            i |= 8;
        }
        c5303.bitField0_ |= i;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public C19473 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C5303) {
            return mergeFrom((C5303) interfaceC21013);
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    public C19473 mergeFrom(C5303 c5303) {
        if (c5303 == C5303.getDefaultInstance()) {
            return this;
        }
        if (c5303.hasType()) {
            setType(c5303.getType());
        }
        if (c5303.hasSrcExtent()) {
            mergeSrcExtent(c5303.getSrcExtent());
        }
        if (c5303.hasDstExtent()) {
            mergeDstExtent(c5303.getDstExtent());
        }
        if (c5303.hasSrcOffset()) {
            setSrcOffset(c5303.getSrcOffset());
        }
        mo2317mergeUnknownFields(c5303.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public C19473 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            int iMo11882 = abstractC3660.mo11882();
                            if (EnumC12760.forNumber(iMo11882) == null) {
                                mergeUnknownVarintField(1, iMo11882);
                            } else {
                                this.type_ = iMo11882;
                                this.bitField0_ |= 1;
                            }
                        } else if (iMo11876 == 18) {
                            abstractC3660.mo11881(getSrcExtentFieldBuilder().m25856(), c24215);
                            this.bitField0_ |= 2;
                        } else if (iMo11876 == 26) {
                            abstractC3660.mo11881(getDstExtentFieldBuilder().m25856(), c24215);
                            this.bitField0_ |= 4;
                        } else if (iMo11876 == 32) {
                            this.srcOffset_ = abstractC3660.mo11889();
                            this.bitField0_ |= 8;
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

    @Override // l.InterfaceC11268
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC11268
    public EnumC12760 getType() {
        EnumC12760 enumC12760ForNumber = EnumC12760.forNumber(this.type_);
        return enumC12760ForNumber == null ? EnumC12760.COW_COPY : enumC12760ForNumber;
    }

    public C19473 setType(EnumC12760 enumC12760) {
        enumC12760.getClass();
        this.bitField0_ |= 1;
        this.type_ = enumC12760.getNumber();
        onChanged();
        return this;
    }

    public C19473 clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC11268
    public boolean hasSrcExtent() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC11268
    public C9776 getSrcExtent() {
        C9998 c9998 = this.srcExtentBuilder_;
        if (c9998 == null) {
            C9776 c9776 = this.srcExtent_;
            return c9776 == null ? C9776.getDefaultInstance() : c9776;
        }
        return (C9776) c9998.m25853();
    }

    public C19473 setSrcExtent(C9776 c9776) {
        C9998 c9998 = this.srcExtentBuilder_;
        if (c9998 == null) {
            c9776.getClass();
            this.srcExtent_ = c9776;
        } else {
            c9998.m25855(c9776);
        }
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C19473 setSrcExtent(C18727 c18727) {
        C9998 c9998 = this.srcExtentBuilder_;
        if (c9998 == null) {
            this.srcExtent_ = c18727.build();
        } else {
            c9998.m25855(c18727.build());
        }
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C19473 mergeSrcExtent(C9776 c9776) {
        C9776 c9777;
        C9998 c9998 = this.srcExtentBuilder_;
        if (c9998 == null) {
            if ((this.bitField0_ & 2) != 0 && (c9777 = this.srcExtent_) != null && c9777 != C9776.getDefaultInstance()) {
                getSrcExtentBuilder().mergeFrom(c9776);
            } else {
                this.srcExtent_ = c9776;
            }
        } else {
            c9998.m25850(c9776);
        }
        if (this.srcExtent_ != null) {
            this.bitField0_ |= 2;
            onChanged();
        }
        return this;
    }

    public C19473 clearSrcExtent() {
        this.bitField0_ &= -3;
        this.srcExtent_ = null;
        C9998 c9998 = this.srcExtentBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.srcExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C18727 getSrcExtentBuilder() {
        this.bitField0_ |= 2;
        onChanged();
        return (C18727) getSrcExtentFieldBuilder().m25856();
    }

    @Override // l.InterfaceC11268
    public InterfaceC9031 getSrcExtentOrBuilder() {
        C9998 c9998 = this.srcExtentBuilder_;
        if (c9998 != null) {
            return (InterfaceC9031) c9998.m25852();
        }
        C9776 c9776 = this.srcExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    private C9998 getSrcExtentFieldBuilder() {
        if (this.srcExtentBuilder_ == null) {
            this.srcExtentBuilder_ = new C9998(getSrcExtent(), getParentForChildren(), isClean());
            this.srcExtent_ = null;
        }
        return this.srcExtentBuilder_;
    }

    @Override // l.InterfaceC11268
    public boolean hasDstExtent() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC11268
    public C9776 getDstExtent() {
        C9998 c9998 = this.dstExtentBuilder_;
        if (c9998 == null) {
            C9776 c9776 = this.dstExtent_;
            return c9776 == null ? C9776.getDefaultInstance() : c9776;
        }
        return (C9776) c9998.m25853();
    }

    public C19473 setDstExtent(C9776 c9776) {
        C9998 c9998 = this.dstExtentBuilder_;
        if (c9998 == null) {
            c9776.getClass();
            this.dstExtent_ = c9776;
        } else {
            c9998.m25855(c9776);
        }
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C19473 setDstExtent(C18727 c18727) {
        C9998 c9998 = this.dstExtentBuilder_;
        if (c9998 == null) {
            this.dstExtent_ = c18727.build();
        } else {
            c9998.m25855(c18727.build());
        }
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C19473 mergeDstExtent(C9776 c9776) {
        C9776 c9777;
        C9998 c9998 = this.dstExtentBuilder_;
        if (c9998 == null) {
            if ((this.bitField0_ & 4) != 0 && (c9777 = this.dstExtent_) != null && c9777 != C9776.getDefaultInstance()) {
                getDstExtentBuilder().mergeFrom(c9776);
            } else {
                this.dstExtent_ = c9776;
            }
        } else {
            c9998.m25850(c9776);
        }
        if (this.dstExtent_ != null) {
            this.bitField0_ |= 4;
            onChanged();
        }
        return this;
    }

    public C19473 clearDstExtent() {
        this.bitField0_ &= -5;
        this.dstExtent_ = null;
        C9998 c9998 = this.dstExtentBuilder_;
        if (c9998 != null) {
            c9998.m25851();
            this.dstExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C18727 getDstExtentBuilder() {
        this.bitField0_ |= 4;
        onChanged();
        return (C18727) getDstExtentFieldBuilder().m25856();
    }

    @Override // l.InterfaceC11268
    public InterfaceC9031 getDstExtentOrBuilder() {
        C9998 c9998 = this.dstExtentBuilder_;
        if (c9998 != null) {
            return (InterfaceC9031) c9998.m25852();
        }
        C9776 c9776 = this.dstExtent_;
        return c9776 == null ? C9776.getDefaultInstance() : c9776;
    }

    private C9998 getDstExtentFieldBuilder() {
        if (this.dstExtentBuilder_ == null) {
            this.dstExtentBuilder_ = new C9998(getDstExtent(), getParentForChildren(), isClean());
            this.dstExtent_ = null;
        }
        return this.dstExtentBuilder_;
    }

    @Override // l.InterfaceC11268
    public boolean hasSrcOffset() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC11268
    public int getSrcOffset() {
        return this.srcOffset_;
    }

    public C19473 setSrcOffset(int i) {
        this.srcOffset_ = i;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C19473 clearSrcOffset() {
        this.bitField0_ &= -9;
        this.srcOffset_ = 0;
        onChanged();
        return this;
    }
}
