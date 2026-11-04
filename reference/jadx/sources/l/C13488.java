package l;

/* JADX INFO: renamed from: l.۬֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13488 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f42903;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f42904;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f42905;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f42906;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f42907;

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C13488(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m33165();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m33165();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m33165();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m33165();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m33166(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m33166(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m33166(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m33166(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40278;
        c7544.m20621(C4758.class, C13488.class);
        return c7544;
    }

    public C13488() {
        this.f42903 = 0;
        this.f42906 = 0;
        this.f42907 = "";
        this.f42904 = 0;
    }

    public C13488(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f42903 = 0;
        this.f42906 = 0;
        this.f42907 = "";
        this.f42904 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33165() {
        super.mo2313clear();
        this.f42905 = 0;
        this.f42903 = 0;
        this.f42906 = 0;
        this.f42907 = "";
        this.f42904 = 0;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40263;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C4758.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C4758.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C4758 c4758BuildPartial = buildPartial();
        if (c4758BuildPartial.isInitialized()) {
            return c4758BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c4758BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C4758 c4758BuildPartial = buildPartial();
        if (c4758BuildPartial.isInitialized()) {
            return c4758BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c4758BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C4758 buildPartial() {
        int i = 0;
        C4758 c4758 = new C4758(this, 0);
        int i2 = this.f42905;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c4758.f16711 = this.f42903;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c4758.f16714 = this.f42906;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c4758.f16716 = this.f42907;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c4758.f16712 = this.f42904;
                i |= 8;
            }
            c4758.f16713 = i | c4758.f16713;
        }
        onBuilt();
        return c4758;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C4758) {
            m33167((C4758) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C4758) {
            m33167((C4758) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33167(C4758 c4758) {
        if (c4758 == C4758.getDefaultInstance()) {
            return;
        }
        if (c4758.m14680()) {
            EnumC5810 enumC5810M14679 = c4758.m14679();
            enumC5810M14679.getClass();
            this.f42905 |= 1;
            this.f42903 = enumC5810M14679.getNumber();
            onChanged();
        }
        if (c4758.m14682()) {
            EnumC5810 enumC5810M14677 = c4758.m14677();
            enumC5810M14677.getClass();
            this.f42905 |= 2;
            this.f42906 = enumC5810M14677.getNumber();
            onChanged();
        }
        if (c4758.m14681()) {
            this.f42907 = c4758.f16716;
            this.f42905 |= 4;
            onChanged();
        }
        if (c4758.m14683()) {
            EnumC5810 enumC5810M14684 = c4758.m14684();
            enumC5810M14684.getClass();
            this.f42905 |= 8;
            this.f42904 = enumC5810M14684.getNumber();
            onChanged();
        }
        mo2317mergeUnknownFields(c4758.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33166(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            int iMo11882 = abstractC3660.mo11882();
                            if (EnumC5810.m16936(iMo11882) == null) {
                                mergeUnknownVarintField(1, iMo11882);
                            } else {
                                this.f42903 = iMo11882;
                                this.f42905 |= 1;
                            }
                        } else if (iMo11876 == 16) {
                            int iMo11883 = abstractC3660.mo11882();
                            if (EnumC5810.m16936(iMo11883) == null) {
                                mergeUnknownVarintField(2, iMo11883);
                            } else {
                                this.f42906 = iMo11883;
                                this.f42905 |= 2;
                            }
                        } else if (iMo11876 == 26) {
                            this.f42907 = abstractC3660.mo11890();
                            this.f42905 |= 4;
                        } else if (iMo11876 == 32) {
                            int iMo11884 = abstractC3660.mo11882();
                            if (EnumC5810.m16936(iMo11884) == null) {
                                mergeUnknownVarintField(4, iMo11884);
                            } else {
                                this.f42904 = iMo11884;
                                this.f42905 |= 8;
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
