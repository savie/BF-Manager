package l;

/* JADX INFO: renamed from: l.ۚ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C5197 extends AbstractC0584 implements InterfaceC6608 {
    public int bitField0_;
    public C15135 dstExtentBuilder_;
    public C5903 dstExtent_;
    public C15135 srcExtentBuilder_;
    public C5903 srcExtent_;
    public int srcOffset_;
    public int type_;

    public /* synthetic */ C5197(int i) {
        this();
    }

    public /* synthetic */ C5197(InterfaceC6790 interfaceC6790, int i) {
        this(interfaceC6790);
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_descriptor;
    }

    @Override // l.AbstractC0584
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_fieldAccessorTable;
        c6956.m18696(C12959.class, C5197.class);
        return c6956;
    }

    public C5197() {
        this.type_ = 0;
        maybeForceBuilderInitialization();
    }

    public C5197(InterfaceC6790 interfaceC6790) {
        super(interfaceC6790);
        this.type_ = 0;
        maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
        if (AbstractC18245.alwaysUseFieldBuilders) {
            getSrcExtentFieldBuilder();
            getDstExtentFieldBuilder();
        }
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public C5197 mo2777clear() {
        super.mo2777clear();
        this.bitField0_ = 0;
        this.type_ = 0;
        this.srcExtent_ = null;
        C15135 c15135 = this.srcExtentBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.srcExtentBuilder_ = null;
        }
        this.dstExtent_ = null;
        C15135 c15136 = this.dstExtentBuilder_;
        if (c15136 != null) {
            c15136.m36296();
            this.dstExtentBuilder_ = null;
        }
        this.srcOffset_ = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public C2806 getDescriptorForType() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_CowMergeOperation_descriptor;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public C12959 getDefaultInstanceForType() {
        return C12959.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C12959 build() {
        C12959 c12959BuildPartial = buildPartial();
        if (c12959BuildPartial.isInitialized()) {
            return c12959BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c12959BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C12959 buildPartial() {
        C12959 c12959 = new C12959(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c12959);
        }
        onBuilt();
        return c12959;
    }

    private void buildPartial0(C12959 c12959) {
        int i;
        C5903 c5903;
        C5903 c5904;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c12959.type_ = this.type_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            C15135 c15135 = this.srcExtentBuilder_;
            if (c15135 == null) {
                c5904 = this.srcExtent_;
            } else {
                c5904 = (C5903) c15135.m36297();
            }
            c12959.srcExtent_ = c5904;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            C15135 c15136 = this.dstExtentBuilder_;
            if (c15136 == null) {
                c5903 = this.dstExtent_;
            } else {
                c5903 = (C5903) c15136.m36297();
            }
            c12959.dstExtent_ = c5903;
            i |= 4;
        }
        if ((i2 & 8) != 0) {
            c12959.srcOffset_ = this.srcOffset_;
            i |= 8;
        }
        c12959.bitField0_ |= i;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public C5197 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C12959) {
            return mergeFrom((C12959) interfaceC1332);
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    public C5197 mergeFrom(C12959 c12959) {
        if (c12959 == C12959.getDefaultInstance()) {
            return this;
        }
        if (c12959.hasType()) {
            setType(c12959.getType());
        }
        if (c12959.hasSrcExtent()) {
            mergeSrcExtent(c12959.getSrcExtent());
        }
        if (c12959.hasDstExtent()) {
            mergeDstExtent(c12959.getDstExtent());
        }
        if (c12959.hasSrcOffset()) {
            setSrcOffset(c12959.getSrcOffset());
        }
        mo2781mergeUnknownFields(c12959.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public C5197 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            int iMo6037 = abstractC3262.mo6037();
                            if (EnumC0963.forNumber(iMo6037) == null) {
                                mergeUnknownVarintField(1, iMo6037);
                            } else {
                                this.type_ = iMo6037;
                                this.bitField0_ |= 1;
                            }
                        } else if (iMo6048 == 18) {
                            abstractC3262.mo6027(getSrcExtentFieldBuilder().m36293(), c2701);
                            this.bitField0_ |= 2;
                        } else if (iMo6048 == 26) {
                            abstractC3262.mo6027(getDstExtentFieldBuilder().m36293(), c2701);
                            this.bitField0_ |= 4;
                        } else if (iMo6048 == 32) {
                            this.srcOffset_ = abstractC3262.mo6041();
                            this.bitField0_ |= 8;
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

    @Override // l.InterfaceC6608
    public boolean hasType() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC6608
    public EnumC0963 getType() {
        EnumC0963 enumC0963ForNumber = EnumC0963.forNumber(this.type_);
        return enumC0963ForNumber == null ? EnumC0963.COW_COPY : enumC0963ForNumber;
    }

    public C5197 setType(EnumC0963 enumC0963) {
        enumC0963.getClass();
        this.bitField0_ |= 1;
        this.type_ = enumC0963.getNumber();
        onChanged();
        return this;
    }

    public C5197 clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC6608
    public boolean hasSrcExtent() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC6608
    public C5903 getSrcExtent() {
        C15135 c15135 = this.srcExtentBuilder_;
        if (c15135 == null) {
            C5903 c5903 = this.srcExtent_;
            return c5903 == null ? C5903.getDefaultInstance() : c5903;
        }
        return (C5903) c15135.m36295();
    }

    public C5197 setSrcExtent(C5903 c5903) {
        C15135 c15135 = this.srcExtentBuilder_;
        if (c15135 == null) {
            c5903.getClass();
            this.srcExtent_ = c5903;
        } else {
            c15135.m36298(c5903);
        }
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C5197 setSrcExtent(C17192 c17192) {
        C15135 c15135 = this.srcExtentBuilder_;
        if (c15135 == null) {
            this.srcExtent_ = c17192.build();
        } else {
            c15135.m36298(c17192.build());
        }
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C5197 mergeSrcExtent(C5903 c5903) {
        C5903 c5904;
        C15135 c15135 = this.srcExtentBuilder_;
        if (c15135 == null) {
            if ((this.bitField0_ & 2) != 0 && (c5904 = this.srcExtent_) != null && c5904 != C5903.getDefaultInstance()) {
                getSrcExtentBuilder().mergeFrom(c5903);
            } else {
                this.srcExtent_ = c5903;
            }
        } else {
            c15135.m36294(c5903);
        }
        if (this.srcExtent_ != null) {
            this.bitField0_ |= 2;
            onChanged();
        }
        return this;
    }

    public C5197 clearSrcExtent() {
        this.bitField0_ &= -3;
        this.srcExtent_ = null;
        C15135 c15135 = this.srcExtentBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.srcExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C17192 getSrcExtentBuilder() {
        this.bitField0_ |= 2;
        onChanged();
        return (C17192) getSrcExtentFieldBuilder().m36293();
    }

    @Override // l.InterfaceC6608
    public InterfaceC23543 getSrcExtentOrBuilder() {
        C15135 c15135 = this.srcExtentBuilder_;
        if (c15135 != null) {
            return (InterfaceC23543) c15135.m36299();
        }
        C5903 c5903 = this.srcExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    private C15135 getSrcExtentFieldBuilder() {
        if (this.srcExtentBuilder_ == null) {
            this.srcExtentBuilder_ = new C15135(getSrcExtent(), getParentForChildren(), isClean());
            this.srcExtent_ = null;
        }
        return this.srcExtentBuilder_;
    }

    @Override // l.InterfaceC6608
    public boolean hasDstExtent() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC6608
    public C5903 getDstExtent() {
        C15135 c15135 = this.dstExtentBuilder_;
        if (c15135 == null) {
            C5903 c5903 = this.dstExtent_;
            return c5903 == null ? C5903.getDefaultInstance() : c5903;
        }
        return (C5903) c15135.m36295();
    }

    public C5197 setDstExtent(C5903 c5903) {
        C15135 c15135 = this.dstExtentBuilder_;
        if (c15135 == null) {
            c5903.getClass();
            this.dstExtent_ = c5903;
        } else {
            c15135.m36298(c5903);
        }
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C5197 setDstExtent(C17192 c17192) {
        C15135 c15135 = this.dstExtentBuilder_;
        if (c15135 == null) {
            this.dstExtent_ = c17192.build();
        } else {
            c15135.m36298(c17192.build());
        }
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C5197 mergeDstExtent(C5903 c5903) {
        C5903 c5904;
        C15135 c15135 = this.dstExtentBuilder_;
        if (c15135 == null) {
            if ((this.bitField0_ & 4) != 0 && (c5904 = this.dstExtent_) != null && c5904 != C5903.getDefaultInstance()) {
                getDstExtentBuilder().mergeFrom(c5903);
            } else {
                this.dstExtent_ = c5903;
            }
        } else {
            c15135.m36294(c5903);
        }
        if (this.dstExtent_ != null) {
            this.bitField0_ |= 4;
            onChanged();
        }
        return this;
    }

    public C5197 clearDstExtent() {
        this.bitField0_ &= -5;
        this.dstExtent_ = null;
        C15135 c15135 = this.dstExtentBuilder_;
        if (c15135 != null) {
            c15135.m36296();
            this.dstExtentBuilder_ = null;
        }
        onChanged();
        return this;
    }

    public C17192 getDstExtentBuilder() {
        this.bitField0_ |= 4;
        onChanged();
        return (C17192) getDstExtentFieldBuilder().m36293();
    }

    @Override // l.InterfaceC6608
    public InterfaceC23543 getDstExtentOrBuilder() {
        C15135 c15135 = this.dstExtentBuilder_;
        if (c15135 != null) {
            return (InterfaceC23543) c15135.m36299();
        }
        C5903 c5903 = this.dstExtent_;
        return c5903 == null ? C5903.getDefaultInstance() : c5903;
    }

    private C15135 getDstExtentFieldBuilder() {
        if (this.dstExtentBuilder_ == null) {
            this.dstExtentBuilder_ = new C15135(getDstExtent(), getParentForChildren(), isClean());
            this.dstExtent_ = null;
        }
        return this.dstExtentBuilder_;
    }

    @Override // l.InterfaceC6608
    public boolean hasSrcOffset() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC6608
    public int getSrcOffset() {
        return this.srcOffset_;
    }

    public C5197 setSrcOffset(int i) {
        this.srcOffset_ = i;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C5197 clearSrcOffset() {
        this.bitField0_ &= -9;
        this.srcOffset_ = 0;
        onChanged();
        return this;
    }
}
