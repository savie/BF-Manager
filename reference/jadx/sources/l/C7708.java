package l;

/* JADX INFO: renamed from: l.۟᩷֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C7708 extends AbstractC0584 implements InterfaceC20408 {
    public boolean batchWrites_;
    public int bitField0_;
    public boolean threaded_;

    public /* synthetic */ C7708(int i) {
        this();
    }

    public /* synthetic */ C7708(InterfaceC6790 interfaceC6790, int i) {
        this(interfaceC6790);
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_descriptor;
    }

    @Override // l.AbstractC0584
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_fieldAccessorTable;
        c6956.m18696(C21113.class, C7708.class);
        return c6956;
    }

    public C7708() {
    }

    public C7708(InterfaceC6790 interfaceC6790) {
        super(interfaceC6790);
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public C7708 mo2777clear() {
        super.mo2777clear();
        this.bitField0_ = 0;
        this.threaded_ = false;
        this.batchWrites_ = false;
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public C2806 getDescriptorForType() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_VABCFeatureSet_descriptor;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public C21113 getDefaultInstanceForType() {
        return C21113.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C21113 build() {
        C21113 c21113BuildPartial = buildPartial();
        if (c21113BuildPartial.isInitialized()) {
            return c21113BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c21113BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C21113 buildPartial() {
        C21113 c21113 = new C21113(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c21113);
        }
        onBuilt();
        return c21113;
    }

    private void buildPartial0(C21113 c21113) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c21113.threaded_ = this.threaded_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c21113.batchWrites_ = this.batchWrites_;
            i |= 2;
        }
        c21113.bitField0_ |= i;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public C7708 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C21113) {
            return mergeFrom((C21113) interfaceC1332);
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    public C7708 mergeFrom(C21113 c21113) {
        if (c21113 == C21113.getDefaultInstance()) {
            return this;
        }
        if (c21113.hasThreaded()) {
            setThreaded(c21113.getThreaded());
        }
        if (c21113.hasBatchWrites()) {
            setBatchWrites(c21113.getBatchWrites());
        }
        mo2781mergeUnknownFields(c21113.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public C7708 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            this.threaded_ = abstractC3262.mo6028();
                            this.bitField0_ |= 1;
                        } else if (iMo6048 == 16) {
                            this.batchWrites_ = abstractC3262.mo6028();
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

    @Override // l.InterfaceC20408
    public boolean hasThreaded() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC20408
    public boolean getThreaded() {
        return this.threaded_;
    }

    public C7708 setThreaded(boolean z) {
        this.threaded_ = z;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C7708 clearThreaded() {
        this.bitField0_ &= -2;
        this.threaded_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC20408
    public boolean hasBatchWrites() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC20408
    public boolean getBatchWrites() {
        return this.batchWrites_;
    }

    public C7708 setBatchWrites(boolean z) {
        this.batchWrites_ = z;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C7708 clearBatchWrites() {
        this.bitField0_ &= -3;
        this.batchWrites_ = false;
        onChanged();
        return this;
    }
}
