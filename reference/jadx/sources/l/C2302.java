package l;

/* JADX INFO: renamed from: l.ۖ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2302 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f7461;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f7462;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f7463;

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C2302(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m7784();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m7784();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m7784();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m7784();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m7785(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m7785(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m7785(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m7785(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40266;
        c7544.m20621(C8268.class, C2302.class);
        return c7544;
    }

    public C2302() {
        this.f7463 = 0;
        this.f7462 = "";
    }

    public C2302(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f7463 = 0;
        this.f7462 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7784() {
        super.mo2313clear();
        this.f7461 = 0;
        this.f7463 = 0;
        this.f7462 = "";
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40252;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C8268.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C8268.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C8268 c8268BuildPartial = buildPartial();
        if (c8268BuildPartial.isInitialized()) {
            return c8268BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c8268BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C8268 c8268BuildPartial = buildPartial();
        if (c8268BuildPartial.isInitialized()) {
            return c8268BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c8268BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C8268 buildPartial() {
        int i = 0;
        C8268 c8268 = new C8268(this, 0);
        int i2 = this.f7461;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c8268.f27212 = this.f7463;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c8268.f27209 = this.f7462;
                i |= 2;
            }
            c8268.f27210 = i | c8268.f27210;
        }
        onBuilt();
        return c8268;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C8268) {
            m7786((C8268) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C8268) {
            m7786((C8268) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7786(C8268 c8268) {
        if (c8268 == C8268.getDefaultInstance()) {
            return;
        }
        if (c8268.m22321()) {
            EnumC5810 enumC5810M22320 = c8268.m22320();
            enumC5810M22320.getClass();
            this.f7461 |= 1;
            this.f7463 = enumC5810M22320.getNumber();
            onChanged();
        }
        if (c8268.m22322()) {
            this.f7462 = c8268.f27209;
            this.f7461 |= 2;
            onChanged();
        }
        mo2317mergeUnknownFields(c8268.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7785(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 18) {
                            this.f7462 = abstractC3660.mo11890();
                            this.f7461 |= 2;
                        } else if (iMo11876 == 24) {
                            int iMo11882 = abstractC3660.mo11882();
                            if (EnumC5810.m16936(iMo11882) == null) {
                                mergeUnknownVarintField(3, iMo11882);
                            } else {
                                this.f7463 = iMo11882;
                                this.f7461 |= 1;
                            }
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
    }
}
