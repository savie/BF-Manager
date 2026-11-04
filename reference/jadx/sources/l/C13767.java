package l;

/* JADX INFO: renamed from: l.۬ۢ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes4.dex */
public final class C13767 extends AbstractC15001 implements InterfaceC10522 {
    public int bitField0_;
    public long decompressedSize_;
    public boolean isCompressed_;
    public Object packageName_;
    public long version_;

    public /* synthetic */ C13767(int i) {
        this();
    }

    public /* synthetic */ C13767(InterfaceC7937 interfaceC7937, int i) {
        this(interfaceC7937);
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_ApexInfo_descriptor;
    }

    @Override // l.AbstractC15001
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_ApexInfo_fieldAccessorTable;
        c7544.m20621(C4557.class, C13767.class);
        return c7544;
    }

    public C13767() {
        this.packageName_ = "";
    }

    public C13767(InterfaceC7937 interfaceC7937) {
        super(interfaceC7937);
        this.packageName_ = "";
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public C13767 mo2313clear() {
        super.mo2313clear();
        this.bitField0_ = 0;
        this.packageName_ = "";
        this.version_ = 0L;
        this.isCompressed_ = false;
        this.decompressedSize_ = 0L;
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public C24478 getDescriptorForType() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_ApexInfo_descriptor;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public C4557 getDefaultInstanceForType() {
        return C4557.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C4557 build() {
        C4557 c4557BuildPartial = buildPartial();
        if (c4557BuildPartial.isInitialized()) {
            return c4557BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c4557BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C4557 buildPartial() {
        C4557 c4557 = new C4557(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c4557);
        }
        onBuilt();
        return c4557;
    }

    private void buildPartial0(C4557 c4557) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c4557.packageName_ = this.packageName_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c4557.version_ = this.version_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            c4557.isCompressed_ = this.isCompressed_;
            i |= 4;
        }
        if ((i2 & 8) != 0) {
            c4557.decompressedSize_ = this.decompressedSize_;
            i |= 8;
        }
        c4557.bitField0_ |= i;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public C13767 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C4557) {
            return mergeFrom((C4557) interfaceC21013);
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    public C13767 mergeFrom(C4557 c4557) {
        if (c4557 == C4557.getDefaultInstance()) {
            return this;
        }
        if (c4557.hasPackageName()) {
            this.packageName_ = c4557.packageName_;
            this.bitField0_ |= 1;
            onChanged();
        }
        if (c4557.hasVersion()) {
            setVersion(c4557.getVersion());
        }
        if (c4557.hasIsCompressed()) {
            setIsCompressed(c4557.getIsCompressed());
        }
        if (c4557.hasDecompressedSize()) {
            setDecompressedSize(c4557.getDecompressedSize());
        }
        mo2317mergeUnknownFields(c4557.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public C13767 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 10) {
                            this.packageName_ = abstractC3660.mo11890();
                            this.bitField0_ |= 1;
                        } else if (iMo11876 == 16) {
                            this.version_ = abstractC3660.mo11893();
                            this.bitField0_ |= 2;
                        } else if (iMo11876 == 24) {
                            this.isCompressed_ = abstractC3660.mo11894();
                            this.bitField0_ |= 4;
                        } else if (iMo11876 == 32) {
                            this.decompressedSize_ = abstractC3660.mo11893();
                            this.bitField0_ |= 8;
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

    @Override // l.InterfaceC10522
    public boolean hasPackageName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC10522
    public String getPackageName() {
        Object obj = this.packageName_;
        if (!(obj instanceof String)) {
            AbstractC17084 abstractC17084 = (AbstractC17084) obj;
            String strM40221 = abstractC17084.m40221();
            if (abstractC17084.mo29729()) {
                this.packageName_ = strM40221;
            }
            return strM40221;
        }
        return (String) obj;
    }

    @Override // l.InterfaceC10522
    public AbstractC17084 getPackageNameBytes() {
        Object obj = this.packageName_;
        if (obj instanceof String) {
            AbstractC17084 abstractC17084M40219 = AbstractC17084.m40219((String) obj);
            this.packageName_ = abstractC17084M40219;
            return abstractC17084M40219;
        }
        return (AbstractC17084) obj;
    }

    public C13767 setPackageName(String str) {
        str.getClass();
        this.packageName_ = str;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C13767 clearPackageName() {
        this.packageName_ = C4557.getDefaultInstance().getPackageName();
        this.bitField0_ &= -2;
        onChanged();
        return this;
    }

    public C13767 setPackageNameBytes(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.packageName_ = abstractC17084;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC10522
    public boolean hasVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC10522
    public long getVersion() {
        return this.version_;
    }

    public C13767 setVersion(long j) {
        this.version_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C13767 clearVersion() {
        this.bitField0_ &= -3;
        this.version_ = 0L;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC10522
    public boolean hasIsCompressed() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // l.InterfaceC10522
    public boolean getIsCompressed() {
        return this.isCompressed_;
    }

    public C13767 setIsCompressed(boolean z) {
        this.isCompressed_ = z;
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C13767 clearIsCompressed() {
        this.bitField0_ &= -5;
        this.isCompressed_ = false;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC10522
    public boolean hasDecompressedSize() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // l.InterfaceC10522
    public long getDecompressedSize() {
        return this.decompressedSize_;
    }

    public C13767 setDecompressedSize(long j) {
        this.decompressedSize_ = j;
        this.bitField0_ |= 8;
        onChanged();
        return this;
    }

    public C13767 clearDecompressedSize() {
        this.bitField0_ &= -9;
        this.decompressedSize_ = 0L;
        onChanged();
        return this;
    }
}
