package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩵֨۫, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C20219 extends AbstractC15001 implements InterfaceC23949 {
    public int bitField0_;
    public Object name_;
    public C1072 partitionNames_;
    public long size_;

    public /* synthetic */ C20219(int i) {
        this();
    }

    public /* synthetic */ C20219(InterfaceC7937 interfaceC7937, int i) {
        this(interfaceC7937);
    }

    public static final C24478 getDescriptor() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_descriptor;
    }

    @Override // l.AbstractC15001
    public C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C18221.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_fieldAccessorTable;
        c7544.m20621(C12014.class, C20219.class);
        return c7544;
    }

    public C20219() {
        this.name_ = "";
        this.partitionNames_ = C1072.m4023();
    }

    public C20219(InterfaceC7937 interfaceC7937) {
        super(interfaceC7937);
        this.name_ = "";
        this.partitionNames_ = C1072.m4023();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public C20219 mo2313clear() {
        super.mo2313clear();
        this.bitField0_ = 0;
        this.name_ = "";
        this.size_ = 0L;
        this.partitionNames_ = C1072.m4023();
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public C24478 getDescriptorForType() {
        return C18221.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_descriptor;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public C12014 getDefaultInstanceForType() {
        return C12014.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C12014 build() {
        C12014 c12014BuildPartial = buildPartial();
        if (c12014BuildPartial.isInitialized()) {
            return c12014BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c12014BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public C12014 buildPartial() {
        C12014 c12014 = new C12014(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c12014);
        }
        onBuilt();
        return c12014;
    }

    private void buildPartial0(C12014 c12014) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c12014.name_ = this.name_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c12014.size_ = this.size_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            this.partitionNames_.mo23372();
            c12014.partitionNames_ = this.partitionNames_;
        }
        c12014.bitField0_ |= i;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public C20219 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C12014) {
            return mergeFrom((C12014) interfaceC21013);
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    public C20219 mergeFrom(C12014 c12014) {
        if (c12014 == C12014.getDefaultInstance()) {
            return this;
        }
        if (c12014.hasName()) {
            this.name_ = c12014.name_;
            this.bitField0_ |= 1;
            onChanged();
        }
        if (c12014.hasSize()) {
            setSize(c12014.getSize());
        }
        if (!c12014.partitionNames_.isEmpty()) {
            if (this.partitionNames_.isEmpty()) {
                this.partitionNames_ = c12014.partitionNames_;
                this.bitField0_ |= 4;
            } else {
                ensurePartitionNamesIsMutable();
                this.partitionNames_.addAll(c12014.partitionNames_);
            }
            onChanged();
        }
        mo2317mergeUnknownFields(c12014.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return hasName();
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public C20219 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 10) {
                            this.name_ = abstractC3660.mo11890();
                            this.bitField0_ |= 1;
                        } else if (iMo11876 == 16) {
                            this.size_ = abstractC3660.mo11896();
                            this.bitField0_ |= 2;
                        } else if (iMo11876 == 26) {
                            AbstractC17084 abstractC17084Mo11890 = abstractC3660.mo11890();
                            ensurePartitionNamesIsMutable();
                            this.partitionNames_.mo4028(abstractC17084Mo11890);
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

    @Override // l.InterfaceC23949
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC23949
    public String getName() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            AbstractC17084 abstractC17084 = (AbstractC17084) obj;
            String strM40221 = abstractC17084.m40221();
            if (abstractC17084.mo29729()) {
                this.name_ = strM40221;
            }
            return strM40221;
        }
        return (String) obj;
    }

    @Override // l.InterfaceC23949
    public AbstractC17084 getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            AbstractC17084 abstractC17084M40219 = AbstractC17084.m40219((String) obj);
            this.name_ = abstractC17084M40219;
            return abstractC17084M40219;
        }
        return (AbstractC17084) obj;
    }

    public C20219 setName(String str) {
        str.getClass();
        this.name_ = str;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C20219 clearName() {
        this.name_ = C12014.getDefaultInstance().getName();
        this.bitField0_ &= -2;
        onChanged();
        return this;
    }

    public C20219 setNameBytes(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        this.name_ = abstractC17084;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC23949
    public boolean hasSize() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC23949
    public long getSize() {
        return this.size_;
    }

    public C20219 setSize(long j) {
        this.size_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C20219 clearSize() {
        this.bitField0_ &= -3;
        this.size_ = 0L;
        onChanged();
        return this;
    }

    private void ensurePartitionNamesIsMutable() {
        if (!this.partitionNames_.mo23371()) {
            this.partitionNames_ = new C1072(this.partitionNames_);
        }
        this.bitField0_ |= 4;
    }

    @Override // l.InterfaceC23949
    public InterfaceC3287 getPartitionNamesList() {
        this.partitionNames_.mo23372();
        return this.partitionNames_;
    }

    @Override // l.InterfaceC23949
    public int getPartitionNamesCount() {
        return this.partitionNames_.size();
    }

    @Override // l.InterfaceC23949
    public String getPartitionNames(int i) {
        return this.partitionNames_.get(i);
    }

    @Override // l.InterfaceC23949
    public AbstractC17084 getPartitionNamesBytes(int i) {
        return this.partitionNames_.m4027(i);
    }

    public C20219 setPartitionNames(int i, String str) {
        str.getClass();
        ensurePartitionNamesIsMutable();
        this.partitionNames_.set(i, str);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C20219 addPartitionNames(String str) {
        str.getClass();
        ensurePartitionNamesIsMutable();
        this.partitionNames_.add(str);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C20219 addAllPartitionNames(Iterable iterable) {
        ensurePartitionNamesIsMutable();
        AbstractC1225.m4447(iterable, (List) this.partitionNames_);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C20219 clearPartitionNames() {
        this.partitionNames_ = C1072.m4023();
        this.bitField0_ &= -5;
        onChanged();
        return this;
    }

    public C20219 addPartitionNamesBytes(AbstractC17084 abstractC17084) {
        abstractC17084.getClass();
        ensurePartitionNamesIsMutable();
        this.partitionNames_.mo4028(abstractC17084);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }
}
