package l;

/* JADX INFO: renamed from: l.᩺ۡ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes2.dex */
public final class C24189 extends AbstractC15001 implements InterfaceC21205 {
    public boolean batchWrites_;
    public int bitField0_;
    public boolean threaded_;

    public /* synthetic */ C24189(int i) {
        this();
    }

    public /* synthetic */ C24189(InterfaceC7937 interfaceC7937, int i) {
        this(interfaceC7937);
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_descriptor;
    }

    @Override // l.AbstractC15001
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_fieldAccessorTable;
        c7544.m20621(C4051.class, C24189.class);
        return c7544;
    }

    public C24189() {
    }

    public C24189(InterfaceC7937 interfaceC7937) {
        super(interfaceC7937);
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public C24189 mo2313clear() {
        super.mo2313clear();
        this.bitField0_ = 0;
        this.threaded_ = false;
        this.batchWrites_ = false;
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public C24478 getDescriptorForType() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_descriptor;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public C4051 getDefaultInstanceForType() {
        return C4051.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C4051 build() {
        C4051 c4051BuildPartial = buildPartial();
        if (c4051BuildPartial.isInitialized()) {
            return c4051BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c4051BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C4051 buildPartial() {
        C4051 c4051 = new C4051(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c4051);
        }
        onBuilt();
        return c4051;
    }

    private void buildPartial0(C4051 c4051) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c4051.threaded_ = this.threaded_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c4051.batchWrites_ = this.batchWrites_;
            i |= 2;
        }
        c4051.bitField0_ |= i;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public C24189 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C4051) {
            return mergeFrom((C4051) interfaceC21013);
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    public C24189 mergeFrom(C4051 c4051) {
        if (c4051 == C4051.getDefaultInstance()) {
            return this;
        }
        if (c4051.hasThreaded()) {
            setThreaded(c4051.getThreaded());
        }
        if (c4051.hasBatchWrites()) {
            setBatchWrites(c4051.getBatchWrites());
        }
        mo2317mergeUnknownFields(c4051.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public C24189 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            this.threaded_ = abstractC3660.mo11894();
                            this.bitField0_ |= 1;
                        } else if (iMo11876 == 16) {
                            this.batchWrites_ = abstractC3660.mo11894();
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

    @Override // l.InterfaceC21205
    public boolean hasThreaded() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC21205
    public boolean getThreaded() {
        return this.threaded_;
    }

    public C24189 setThreaded(boolean z) {
        this.threaded_ = z;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C24189 clearThreaded() {
        this.bitField0_ &= -2;
        this.threaded_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC21205
    public boolean hasBatchWrites() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC21205
    public boolean getBatchWrites() {
        return this.batchWrites_;
    }

    public C24189 setBatchWrites(boolean z) {
        this.batchWrites_ = z;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C24189 clearBatchWrites() {
        this.bitField0_ &= -3;
        this.batchWrites_ = false;
        onChanged();
        return this;
    }
}
