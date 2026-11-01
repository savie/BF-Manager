package l;

/* JADX INFO: renamed from: l.ۗۤ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C3163 extends AbstractC0584 implements InterfaceC11548 {
    public int bitField0_;
    public long decompressedSize_;
    public boolean isCompressed_;
    public Object packageName_;
    public long version_;

    public /* synthetic */ C3163(int i) {
        this();
    }

    public /* synthetic */ C3163(InterfaceC6790 interfaceC6790, int i) {
        this(interfaceC6790);
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_ApexInfo_descriptor;
    }

    @Override // l.AbstractC0584
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_ApexInfo_fieldAccessorTable;
        c6956.m18696(C4491.class, C3163.class);
        return c6956;
    }

    public C3163() {
        this.packageName_ = "";
    }

    public C3163(InterfaceC6790 interfaceC6790) {
        super(interfaceC6790);
        this.packageName_ = "";
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public C3163 mo2777clear() {
        super.mo2777clear();
        this.bitField0_ = 0;
        this.packageName_ = "";
        this.version_ = 0L;
        this.isCompressed_ = false;
        this.decompressedSize_ = 0L;
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public C2806 getDescriptorForType() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_ApexInfo_descriptor;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public C4491 getDefaultInstanceForType() {
        return C4491.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C4491 build() {
        C4491 c4491BuildPartial = buildPartial();
        if (c4491BuildPartial.isInitialized()) {
            return c4491BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c4491BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C4491 buildPartial() {
        C4491 c4491 = new C4491(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c4491);
        }
        onBuilt();
        return c4491;
    }

    private void buildPartial0(C4491 c4491) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c4491.packageName_ = this.packageName_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c4491.version_ = this.version_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c4491.isCompressed_ = this.isCompressed_;
            i |= 4;
        }
        if ((i2 & 8) != 0) {
            c4491.decompressedSize_ = this.decompressedSize_;
            i |= 8;
        }
        c4491.bitField0_ |= i;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public C3163 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C4491) {
            return mergeFrom((C4491) interfaceC1332);
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    public C3163 mergeFrom(C4491 c4491) {
        if (c4491 == C4491.getDefaultInstance()) {
            return this;
        }
        if (c4491.hasPackageName()) {
            this.packageName_ = c4491.packageName_;
            this.bitField0_ |= 1;
            onChanged();
        }
        if (c4491.hasVersion()) {
            setVersion(c4491.getVersion());
        }
        if (c4491.hasIsCompressed()) {
            setIsCompressed(c4491.getIsCompressed());
        }
        if (c4491.hasDecompressedSize()) {
            setDecompressedSize(c4491.getDecompressedSize());
        }
        mo2781mergeUnknownFields(c4491.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public C3163 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 10) {
                            this.packageName_ = abstractC3262.mo6050();
                            this.bitField0_ |= 1;
                        } else if (iMo6048 == 16) {
                            this.version_ = abstractC3262.mo6049();
                            this.bitField0_ |= 2;
                        } else if (iMo6048 == 24) {
                            this.isCompressed_ = abstractC3262.mo6028();
                            this.bitField0_ |= 4;
                        } else if (iMo6048 == 32) {
                            this.decompressedSize_ = abstractC3262.mo6049();
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

    @Override // l.InterfaceC11548
    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC11548
    public String getPackageName() {
        Object obj = this.packageName_;
        if (!(obj instanceof String)) {
            AbstractC23725 abstractC23725 = (AbstractC23725) obj;
            String strM52260 = abstractC23725.m52260();
            if (abstractC23725.mo16494()) {
                this.packageName_ = strM52260;
            }
            return strM52260;
        }
        return (String) obj;
    }

    @Override // l.InterfaceC11548
    public AbstractC23725 getPackageNameBytes() {
        Object obj = this.packageName_;
        if (obj instanceof String) {
            AbstractC23725 abstractC23725M52256 = AbstractC23725.m52256((String) obj);
            this.packageName_ = abstractC23725M52256;
            return abstractC23725M52256;
        }
        return (AbstractC23725) obj;
    }

    public C3163 setPackageName(String str) {
        str.getClass();
        this.packageName_ = str;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C3163 clearPackageName() {
        this.packageName_ = C4491.getDefaultInstance().getPackageName();
        this.bitField0_ &= -2;
        onChanged();
        return this;
    }

    public C3163 setPackageNameBytes(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.packageName_ = abstractC23725;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC11548
    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC11548
    public long getVersion() {
        return this.version_;
    }

    public C3163 setVersion(long j) {
        this.version_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C3163 clearVersion() {
        this.bitField0_ &= -3;
        this.version_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC11548
    public boolean hasIsCompressed() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC11548
    public boolean getIsCompressed() {
        return this.isCompressed_;
    }

    public C3163 setIsCompressed(boolean z) {
        this.isCompressed_ = z;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C3163 clearIsCompressed() {
        this.bitField0_ &= -5;
        this.isCompressed_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC11548
    public boolean hasDecompressedSize() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC11548
    public long getDecompressedSize() {
        return this.decompressedSize_;
    }

    public C3163 setDecompressedSize(long j) {
        this.decompressedSize_ = j;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C3163 clearDecompressedSize() {
        this.bitField0_ &= -9;
        this.decompressedSize_ = 0L;
        onChanged();
        return this;
    }
}
