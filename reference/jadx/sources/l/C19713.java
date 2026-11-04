package l;

/* JADX INFO: renamed from: l.ᩴۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C19713 extends AbstractC15001 implements InterfaceC5543 {
    public int bitField0_;
    public AbstractC17084 hash_;
    public long size_;

    public /* synthetic */ C19713(int i) {
        this();
    }

    public /* synthetic */ C19713(InterfaceC7937 interfaceC7937, int i) {
        this(interfaceC7937);
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_descriptor;
    }

    @Override // l.AbstractC15001
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_fieldAccessorTable;
        c7544.m20621(C15237.class, C19713.class);
        return c7544;
    }

    public C19713() {
        this.hash_ = AbstractC17084.f55772;
    }

    public C19713(InterfaceC7937 interfaceC7937) {
        super(interfaceC7937);
        this.hash_ = AbstractC17084.f55772;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public C19713 mo2313clear() {
        super.mo2313clear();
        this.bitField0_ = 0;
        this.size_ = 0L;
        this.hash_ = AbstractC17084.f55772;
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public C24478 getDescriptorForType() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_PartitionInfo_descriptor;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public C15237 getDefaultInstanceForType() {
        return C15237.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C15237 build() {
        C15237 c15237BuildPartial = buildPartial();
        if (c15237BuildPartial.isInitialized()) {
            return c15237BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c15237BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C15237 buildPartial() {
        C15237 c15237 = new C15237(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c15237);
        }
        onBuilt();
        return c15237;
    }

    private void buildPartial0(C15237 c15237) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c15237.size_ = this.size_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c15237.hash_ = this.hash_;
            i |= 2;
        }
        c15237.bitField0_ |= i;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public C19713 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C15237) {
            return mergeFrom((C15237) interfaceC21013);
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    public C19713 mergeFrom(C15237 c15237) {
        if (c15237 == C15237.getDefaultInstance()) {
            return this;
        }
        if (c15237.hasSize()) {
            setSize(c15237.getSize());
        }
        if (c15237.hasHash()) {
            setHash(c15237.getHash());
        }
        mo2317mergeUnknownFields(c15237.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public C19713 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            this.size_ = abstractC3660.mo11896();
                            this.bitField0_ |= 1;
                        } else if (iMo11876 == 18) {
                            this.hash_ = abstractC3660.mo11890();
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

    @Override // l.InterfaceC5543
    public boolean hasSize() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC5543
    public long getSize() {
        return this.size_;
    }

    public C19713 setSize(long j) {
        this.size_ = j;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C19713 clearSize() {
        this.bitField0_ &= -2;
        this.size_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC5543
    public boolean hasHash() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC5543
    public AbstractC17084 getHash() {
        return this.hash_;
    }

    public C19713 setHash(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.hash_ = abstractC17084;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C19713 clearHash() {
        this.bitField0_ &= -3;
        this.hash_ = C15237.getDefaultInstance().getHash();
        onChanged();
        return this;
    }
}
