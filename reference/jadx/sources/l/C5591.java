package l;

/* JADX INFO: renamed from: l.ۚ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C5591 extends AbstractC0584 implements InterfaceC13353 {
    public int bitField0_;
    public AbstractC23725 hash_;
    public long size_;

    public /* synthetic */ C5591(int i) {
        this();
    }

    public /* synthetic */ C5591(InterfaceC6790 interfaceC6790, int i) {
        this(interfaceC6790);
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_descriptor;
    }

    @Override // l.AbstractC0584
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_fieldAccessorTable;
        c6956.m18696(C22525.class, C5591.class);
        return c6956;
    }

    public C5591() {
        this.hash_ = AbstractC23725.f76778;
    }

    public C5591(InterfaceC6790 interfaceC6790) {
        super(interfaceC6790);
        this.hash_ = AbstractC23725.f76778;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public C5591 mo2777clear() {
        super.mo2777clear();
        this.bitField0_ = 0;
        this.size_ = 0L;
        this.hash_ = AbstractC23725.f76778;
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public C2806 getDescriptorForType() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_descriptor;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public C22525 getDefaultInstanceForType() {
        return C22525.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C22525 build() {
        C22525 c22525BuildPartial = buildPartial();
        if (c22525BuildPartial.isInitialized()) {
            return c22525BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c22525BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C22525 buildPartial() {
        C22525 c22525 = new C22525(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c22525);
        }
        onBuilt();
        return c22525;
    }

    private void buildPartial0(C22525 c22525) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c22525.size_ = this.size_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c22525.hash_ = this.hash_;
            i |= 2;
        }
        c22525.bitField0_ |= i;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public C5591 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C22525) {
            return mergeFrom((C22525) interfaceC1332);
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    public C5591 mergeFrom(C22525 c22525) {
        if (c22525 == C22525.getDefaultInstance()) {
            return this;
        }
        if (c22525.hasSize()) {
            setSize(c22525.getSize());
        }
        if (c22525.hasHash()) {
            setHash(c22525.getHash());
        }
        mo2781mergeUnknownFields(c22525.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public C5591 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            this.size_ = abstractC3262.mo6047();
                            this.bitField0_ |= 1;
                        } else if (iMo6048 == 18) {
                            this.hash_ = abstractC3262.mo6050();
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

    @Override // l.InterfaceC13353
    public boolean hasSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC13353
    public long getSize() {
        return this.size_;
    }

    public C5591 setSize(long j) {
        this.size_ = j;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C5591 clearSize() {
        this.bitField0_ &= -2;
        this.size_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC13353
    public boolean hasHash() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC13353
    public AbstractC23725 getHash() {
        return this.hash_;
    }

    public C5591 setHash(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.hash_ = abstractC23725;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C5591 clearHash() {
        this.bitField0_ &= -3;
        this.hash_ = C22525.getDefaultInstance().getHash();
        onChanged();
        return this;
    }
}
