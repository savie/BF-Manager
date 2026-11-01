package l;

import java.util.List;

/* JADX INFO: renamed from: l.᩵۟֨, reason: contains not printable characters */
/* JADX INFO: compiled from: C9PC */
/* JADX INFO: loaded from: classes5.dex */
public final class C19309 extends AbstractC0584 implements InterfaceC7314 {
    public int bitField0_;
    public Object name_;
    public C21463 partitionNames_;
    public long size_;

    public /* synthetic */ C19309(int i) {
        this();
    }

    public /* synthetic */ C19309(InterfaceC6790 interfaceC6790, int i) {
        this(interfaceC6790);
    }

    public static final C2806 getDescriptor() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_descriptor;
    }

    @Override // l.AbstractC0584
    public C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C0651.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_fieldAccessorTable;
        c6956.m18696(C8726.class, C19309.class);
        return c6956;
    }

    public C19309() {
        this.name_ = "";
        this.partitionNames_ = C21463.m48084();
    }

    public C19309(InterfaceC6790 interfaceC6790) {
        super(interfaceC6790);
        this.name_ = "";
        this.partitionNames_ = C21463.m48084();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public C19309 mo2777clear() {
        super.mo2777clear();
        this.bitField0_ = 0;
        this.name_ = "";
        this.size_ = 0L;
        this.partitionNames_ = C21463.m48084();
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public C2806 getDescriptorForType() {
        return C0651.internal_static_bin_mt_manager_visitor_payload_DynamicPartitionGroup_descriptor;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public C8726 getDefaultInstanceForType() {
        return C8726.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C8726 build() {
        C8726 c8726BuildPartial = buildPartial();
        if (c8726BuildPartial.isInitialized()) {
            return c8726BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c8726BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public C8726 buildPartial() {
        C8726 c8726 = new C8726(this);
        if (this.bitField0_ != 0) {
            buildPartial0(c8726);
        }
        onBuilt();
        return c8726;
    }

    private void buildPartial0(C8726 c8726) {
        int i;
        int i2 = this.bitField0_;
        if ((i2 & 1) != 0) {
            c8726.name_ = this.name_;
            i = 1;
        } else {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            c8726.size_ = this.size_;
            i |= 2;
        }
        if ((i2 & 4) != 0) {
            this.partitionNames_.mo6483();
            c8726.partitionNames_ = this.partitionNames_;
        }
        c8726.bitField0_ |= i;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public C19309 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C8726) {
            return mergeFrom((C8726) interfaceC1332);
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    public C19309 mergeFrom(C8726 c8726) {
        if (c8726 == C8726.getDefaultInstance()) {
            return this;
        }
        if (c8726.hasName()) {
            this.name_ = c8726.name_;
            this.bitField0_ |= 1;
            onChanged();
        }
        if (c8726.hasSize()) {
            setSize(c8726.getSize());
        }
        if (!c8726.partitionNames_.isEmpty()) {
            if (this.partitionNames_.isEmpty()) {
                this.partitionNames_ = c8726.partitionNames_;
                this.bitField0_ |= 4;
            } else {
                ensurePartitionNamesIsMutable();
                this.partitionNames_.addAll(c8726.partitionNames_);
            }
            onChanged();
        }
        mo2781mergeUnknownFields(c8726.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return hasName();
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public C19309 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 10) {
                            this.name_ = abstractC3262.mo6050();
                            this.bitField0_ |= 1;
                        } else if (iMo6048 == 16) {
                            this.size_ = abstractC3262.mo6047();
                            this.bitField0_ |= 2;
                        } else if (iMo6048 == 26) {
                            AbstractC23725 abstractC23725Mo6050 = abstractC3262.mo6050();
                            ensurePartitionNamesIsMutable();
                            this.partitionNames_.mo21383(abstractC23725Mo6050);
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

    @Override // l.InterfaceC7314
    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // l.InterfaceC7314
    public String getName() {
        Object obj = this.name_;
        if (!(obj instanceof String)) {
            AbstractC23725 abstractC23725 = (AbstractC23725) obj;
            String strM52260 = abstractC23725.m52260();
            if (abstractC23725.mo16494()) {
                this.name_ = strM52260;
            }
            return strM52260;
        }
        return (String) obj;
    }

    @Override // l.InterfaceC7314
    public AbstractC23725 getNameBytes() {
        Object obj = this.name_;
        if (obj instanceof String) {
            AbstractC23725 abstractC23725M52256 = AbstractC23725.m52256((String) obj);
            this.name_ = abstractC23725M52256;
            return abstractC23725M52256;
        }
        return (AbstractC23725) obj;
    }

    public C19309 setName(String str) {
        str.getClass();
        this.name_ = str;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    public C19309 clearName() {
        this.name_ = C8726.getDefaultInstance().getName();
        this.bitField0_ &= -2;
        onChanged();
        return this;
    }

    public C19309 setNameBytes(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        this.name_ = abstractC23725;
        this.bitField0_ |= 1;
        onChanged();
        return this;
    }

    @Override // l.InterfaceC7314
    public boolean hasSize() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // l.InterfaceC7314
    public long getSize() {
        return this.size_;
    }

    public C19309 setSize(long j) {
        this.size_ = j;
        this.bitField0_ |= 2;
        onChanged();
        return this;
    }

    public C19309 clearSize() {
        this.bitField0_ &= -3;
        this.size_ = 0L;
        onChanged();
        return this;
    }

    private void ensurePartitionNamesIsMutable() {
        if (!this.partitionNames_.mo6484()) {
            this.partitionNames_ = new C21463(this.partitionNames_);
        }
        this.bitField0_ |= 4;
    }

    @Override // l.InterfaceC7314
    public InterfaceC3448 getPartitionNamesList() {
        this.partitionNames_.mo6483();
        return this.partitionNames_;
    }

    @Override // l.InterfaceC7314
    public int getPartitionNamesCount() {
        return this.partitionNames_.size();
    }

    @Override // l.InterfaceC7314
    public String getPartitionNames(int i) {
        return this.partitionNames_.get(i);
    }

    @Override // l.InterfaceC7314
    public AbstractC23725 getPartitionNamesBytes(int i) {
        return this.partitionNames_.m48086(i);
    }

    public C19309 setPartitionNames(int i, String str) {
        str.getClass();
        ensurePartitionNamesIsMutable();
        this.partitionNames_.set(i, str);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C19309 addPartitionNames(String str) {
        str.getClass();
        ensurePartitionNamesIsMutable();
        this.partitionNames_.add(str);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C19309 addAllPartitionNames(Iterable iterable) {
        ensurePartitionNamesIsMutable();
        AbstractC21607.m48315(iterable, (List) this.partitionNames_);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }

    public C19309 clearPartitionNames() {
        this.partitionNames_ = C21463.m48084();
        this.bitField0_ &= -5;
        onChanged();
        return this;
    }

    public C19309 addPartitionNamesBytes(AbstractC23725 abstractC23725) {
        abstractC23725.getClass();
        ensurePartitionNamesIsMutable();
        this.partitionNames_.mo21383(abstractC23725);
        this.bitField0_ |= 4;
        onChanged();
        return this;
    }
}
