package l;

/* JADX INFO: renamed from: l.ܿ۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C17192 extends AbstractC0584 implements InterfaceC23543 {
    public int bitField0_;
    public long numBlocks_;
    public long startBlock_;

    public /* synthetic */ C17192(int i) {
        this();
    }

    public /* synthetic */ C17192(InterfaceC6790 interfaceC6790, int i) {
        this(interfaceC6790);
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_Extent_descriptor;
    }

    @Override // l.AbstractC0584
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_Extent_fieldAccessorTable;
        c6956.m18696(C5903.class, C17192.class);
        return c6956;
    }

    public C17192() {
    }

    public C17192(InterfaceC6790 interfaceC6790) {
        super(interfaceC6790);
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public C17192 mo2777clear() {
        super.mo2777clear();
        this.bitField0_ = 0;
        this.startBlock_ = 0L;
        this.numBlocks_ = 0L;
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public C2806 getDescriptorForType() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_Extent_descriptor;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public C5903 getDefaultInstanceForType() {
        return C5903.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C5903 build() {
        C5903 c5903BuildPartial = buildPartial();
        if (c5903BuildPartial.isInitialized()) {
            return c5903BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c5903BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C5903 buildPartial() {
        C5903 c5903 = new C5903(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c5903);
        }
        onBuilt();
        return c5903;
    }

    private void buildPartial0(C5903 c5903) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c5903.startBlock_ = this.startBlock_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c5903.numBlocks_ = this.numBlocks_;
            i |= 2;
        }
        c5903.bitField0_ |= i;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public C17192 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C5903) {
            return mergeFrom((C5903) interfaceC1332);
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    public C17192 mergeFrom(C5903 c5903) {
        if (c5903 == C5903.getDefaultInstance()) {
            return this;
        }
        if (c5903.hasStartBlock()) {
            setStartBlock(c5903.getStartBlock());
        }
        if (c5903.hasNumBlocks()) {
            setNumBlocks(c5903.getNumBlocks());
        }
        mo2781mergeUnknownFields(c5903.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public C17192 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            this.startBlock_ = abstractC3262.mo6047();
                            this.bitField0_ |= 1;
                        } else if (iMo6048 == 16) {
                            this.numBlocks_ = abstractC3262.mo6047();
                            this.bitField0_ |= 2;
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

    @Override // l.InterfaceC23543
    public boolean hasStartBlock() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC23543
    public long getStartBlock() {
        return this.startBlock_;
    }

    public C17192 setStartBlock(long j) {
        this.startBlock_ = j;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C17192 clearStartBlock() {
        this.bitField0_ &= -2;
        this.startBlock_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC23543
    public boolean hasNumBlocks() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC23543
    public long getNumBlocks() {
        return this.numBlocks_;
    }

    public C17192 setNumBlocks(long j) {
        this.numBlocks_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C17192 clearNumBlocks() {
        this.bitField0_ &= -3;
        this.numBlocks_ = 0L;
        onChanged();
        return this;
    }
}
