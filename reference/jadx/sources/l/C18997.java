package l;

/* JADX INFO: renamed from: l.ᩴ᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C18997 extends AbstractC0584 implements InterfaceC9120 {
    public int bitField0_;
    public AbstractC23725 data_;
    public int unpaddedSignatureSize_;
    public int version_;

    public /* synthetic */ C18997(int i) {
        this();
    }

    public /* synthetic */ C18997(InterfaceC6790 interfaceC6790, int i) {
        this(interfaceC6790);
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_descriptor;
    }

    @Override // l.AbstractC0584
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_fieldAccessorTable;
        c6956.m18696(C8414.class, C18997.class);
        return c6956;
    }

    public C18997() {
        this.data_ = AbstractC23725.f76778;
    }

    public C18997(InterfaceC6790 interfaceC6790) {
        super(interfaceC6790);
        this.data_ = AbstractC23725.f76778;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public C18997 mo2777clear() {
        super.mo2777clear();
        this.bitField0_ = 0;
        this.version_ = 0;
        this.data_ = AbstractC23725.f76778;
        this.unpaddedSignatureSize_ = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public C2806 getDescriptorForType() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_descriptor;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public C8414 getDefaultInstanceForType() {
        return C8414.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C8414 build() {
        C8414 c8414BuildPartial = buildPartial();
        if (c8414BuildPartial.isInitialized()) {
            return c8414BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c8414BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C8414 buildPartial() {
        C8414 c8414 = new C8414(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c8414);
        }
        onBuilt();
        return c8414;
    }

    private void buildPartial0(C8414 c8414) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c8414.version_ = this.version_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c8414.data_ = this.data_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c8414.unpaddedSignatureSize_ = this.unpaddedSignatureSize_;
            i |= 4;
        }
        c8414.bitField0_ |= i;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public C18997 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C8414) {
            return mergeFrom((C8414) interfaceC1332);
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    public C18997 mergeFrom(C8414 c8414) {
        if (c8414 == C8414.getDefaultInstance()) {
            return this;
        }
        if (c8414.hasVersion()) {
            setVersion(c8414.getVersion());
        }
        if (c8414.hasData()) {
            setData(c8414.getData());
        }
        if (c8414.hasUnpaddedSignatureSize()) {
            setUnpaddedSignatureSize(c8414.getUnpaddedSignatureSize());
        }
        mo2781mergeUnknownFields(c8414.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public C18997 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            this.version_ = abstractC3262.mo6041();
                            this.bitField0_ |= 1;
                        } else if (iMo6048 == 18) {
                            this.data_ = abstractC3262.mo6050();
                            this.bitField0_ |= 2;
                        } else if (iMo6048 == 29) {
                            this.unpaddedSignatureSize_ = abstractC3262.mo6023();
                            this.bitField0_ |= 4;
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

    @Override // l.InterfaceC9120
    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC9120
    @Deprecated
    public int getVersion() {
        return this.version_;
    }

    @Deprecated
    public C18997 setVersion(int i) {
        this.version_ = i;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Deprecated
    public C18997 clearVersion() {
        this.bitField0_ &= -2;
        this.version_ = 0;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC9120
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC9120
    public AbstractC23725 getData() {
        return this.data_;
    }

    public C18997 setData(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.data_ = abstractC23725;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C18997 clearData() {
        this.bitField0_ &= -3;
        this.data_ = C8414.getDefaultInstance().getData();
        onChanged();
        return this;
    }

    @Override // l.InterfaceC9120
    public boolean hasUnpaddedSignatureSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC9120
    public int getUnpaddedSignatureSize() {
        return this.unpaddedSignatureSize_;
    }

    public C18997 setUnpaddedSignatureSize(int i) {
        this.unpaddedSignatureSize_ = i;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C18997 clearUnpaddedSignatureSize() {
        this.bitField0_ &= -5;
        this.unpaddedSignatureSize_ = 0;
        onChanged();
        return this;
    }
}
