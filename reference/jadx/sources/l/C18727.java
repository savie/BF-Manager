package l;

/* JADX INFO: renamed from: l.ᩳ֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18727 extends AbstractC15001 implements InterfaceC9031 {
    public int bitField0_;
    public long numBlocks_;
    public long startBlock_;

    public /* synthetic */ C18727(int i) {
        this();
    }

    public /* synthetic */ C18727(InterfaceC7937 interfaceC7937, int i) {
        this(interfaceC7937);
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_Extent_descriptor;
    }

    @Override // l.AbstractC15001
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_Extent_fieldAccessorTable;
        c7544.m20621(C9776.class, C18727.class);
        return c7544;
    }

    public C18727() {
    }

    public C18727(InterfaceC7937 interfaceC7937) {
        super(interfaceC7937);
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public C18727 mo2313clear() {
        super.mo2313clear();
        this.bitField0_ = 0;
        this.startBlock_ = 0L;
        this.numBlocks_ = 0L;
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public C24478 getDescriptorForType() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_Extent_descriptor;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public C9776 getDefaultInstanceForType() {
        return C9776.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C9776 build() {
        C9776 c9776BuildPartial = buildPartial();
        if (c9776BuildPartial.isInitialized()) {
            return c9776BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c9776BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C9776 buildPartial() {
        C9776 c9776 = new C9776(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c9776);
        }
        onBuilt();
        return c9776;
    }

    private void buildPartial0(C9776 c9776) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c9776.startBlock_ = this.startBlock_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c9776.numBlocks_ = this.numBlocks_;
            i |= 2;
        }
        c9776.bitField0_ |= i;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public C18727 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C9776) {
            return mergeFrom((C9776) interfaceC21013);
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    public C18727 mergeFrom(C9776 c9776) {
        if (c9776 == C9776.getDefaultInstance()) {
            return this;
        }
        if (c9776.hasStartBlock()) {
            setStartBlock(c9776.getStartBlock());
        }
        if (c9776.hasNumBlocks()) {
            setNumBlocks(c9776.getNumBlocks());
        }
        mo2317mergeUnknownFields(c9776.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public C18727 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            this.startBlock_ = abstractC3660.mo11896();
                            this.bitField0_ |= 1;
                        } else if (iMo11876 == 16) {
                            this.numBlocks_ = abstractC3660.mo11896();
                            this.bitField0_ |= 2;
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

    @Override // l.InterfaceC9031
    public boolean hasStartBlock() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC9031
    public long getStartBlock() {
        return this.startBlock_;
    }

    public C18727 setStartBlock(long j) {
        this.startBlock_ = j;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C18727 clearStartBlock() {
        this.bitField0_ &= -2;
        this.startBlock_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC9031
    public boolean hasNumBlocks() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC9031
    public long getNumBlocks() {
        return this.numBlocks_;
    }

    public C18727 setNumBlocks(long j) {
        this.numBlocks_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C18727 clearNumBlocks() {
        this.bitField0_ &= -3;
        this.numBlocks_ = 0L;
        onChanged();
        return this;
    }
}
