package l;

/* JADX INFO: renamed from: l.᩹ۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C23443 extends AbstractC15001 implements InterfaceC12254 {
    public int bitField0_;
    public AbstractC17084 data_;
    public int unpaddedSignatureSize_;
    public int version_;

    public /* synthetic */ C23443(int i) {
        this();
    }

    public /* synthetic */ C23443(InterfaceC7937 interfaceC7937, int i) {
        this(interfaceC7937);
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_descriptor;
    }

    @Override // l.AbstractC15001
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_fieldAccessorTable;
        c7544.m20621(C3305.class, C23443.class);
        return c7544;
    }

    public C23443() {
        this.data_ = AbstractC17084.f55772;
    }

    public C23443(InterfaceC7937 interfaceC7937) {
        super(interfaceC7937);
        this.data_ = AbstractC17084.f55772;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public C23443 mo2313clear() {
        super.mo2313clear();
        this.bitField0_ = 0;
        this.version_ = 0;
        this.data_ = AbstractC17084.f55772;
        this.unpaddedSignatureSize_ = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public C24478 getDescriptorForType() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_Signatures_Signature_descriptor;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public C3305 getDefaultInstanceForType() {
        return C3305.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C3305 build() {
        C3305 c3305BuildPartial = buildPartial();
        if (c3305BuildPartial.isInitialized()) {
            return c3305BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c3305BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C3305 buildPartial() {
        C3305 c3305 = new C3305(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c3305);
        }
        onBuilt();
        return c3305;
    }

    private void buildPartial0(C3305 c3305) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c3305.version_ = this.version_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c3305.data_ = this.data_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c3305.unpaddedSignatureSize_ = this.unpaddedSignatureSize_;
            i |= 4;
        }
        c3305.bitField0_ |= i;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public C23443 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C3305) {
            return mergeFrom((C3305) interfaceC21013);
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    public C23443 mergeFrom(C3305 c3305) {
        if (c3305 == C3305.getDefaultInstance()) {
            return this;
        }
        if (c3305.hasVersion()) {
            setVersion(c3305.getVersion());
        }
        if (c3305.hasData()) {
            setData(c3305.getData());
        }
        if (c3305.hasUnpaddedSignatureSize()) {
            setUnpaddedSignatureSize(c3305.getUnpaddedSignatureSize());
        }
        mo2317mergeUnknownFields(c3305.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public C23443 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            this.version_ = abstractC3660.mo11889();
                            this.bitField0_ |= 1;
                        } else if (iMo11876 == 18) {
                            this.data_ = abstractC3660.mo11890();
                            this.bitField0_ |= 2;
                        } else if (iMo11876 == 29) {
                            this.unpaddedSignatureSize_ = abstractC3660.mo11874();
                            this.bitField0_ |= 4;
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

    @Override // l.InterfaceC12254
    @Deprecated
    public boolean hasVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC12254
    @Deprecated
    public int getVersion() {
        return this.version_;
    }

    @Deprecated
    public C23443 setVersion(int i) {
        this.version_ = i;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Deprecated
    public C23443 clearVersion() {
        this.bitField0_ &= -2;
        this.version_ = 0;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC12254
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC12254
    public AbstractC17084 getData() {
        return this.data_;
    }

    public C23443 setData(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.data_ = abstractC17084;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C23443 clearData() {
        this.bitField0_ &= -3;
        this.data_ = C3305.getDefaultInstance().getData();
        onChanged();
        return this;
    }

    @Override // l.InterfaceC12254
    public boolean hasUnpaddedSignatureSize() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC12254
    public int getUnpaddedSignatureSize() {
        return this.unpaddedSignatureSize_;
    }

    public C23443 setUnpaddedSignatureSize(int i) {
        this.unpaddedSignatureSize_ = i;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C23443 clearUnpaddedSignatureSize() {
        this.bitField0_ &= -5;
        this.unpaddedSignatureSize_ = 0;
        onChanged();
        return this;
    }
}
