package l;

/* JADX INFO: renamed from: l.ۗ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3047 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C16471 f9872;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9998 f9873;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f9874;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9998 f9875;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C16471 f9876;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f9877;

    public /* synthetic */ C3047(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m9900();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m9900();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m9900();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m9900();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m9901(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m9901(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m9901(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m9901(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40289;
        c7544.m20621(C20201.class, C3047.class);
        return c7544;
    }

    public C3047() {
        this.f9877 = 0;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m9898();
            m9899();
        }
    }

    public C3047(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f9877 = 0;
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m9898();
            m9899();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9900() {
        super.mo2313clear();
        this.f9874 = 0;
        this.f9877 = 0;
        this.f9876 = null;
        C9998 c9998 = this.f9873;
        if (c9998 != null) {
            c9998.m25851();
            this.f9873 = null;
        }
        this.f9872 = null;
        C9998 c9999 = this.f9875;
        if (c9999 != null) {
            c9999.m25851();
            this.f9875 = null;
        }
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40297;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C20201.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C20201.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C20201 c20201BuildPartial = buildPartial();
        if (c20201BuildPartial.isInitialized()) {
            return c20201BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c20201BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C20201 c20201BuildPartial = buildPartial();
        if (c20201BuildPartial.isInitialized()) {
            return c20201BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c20201BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C20201 buildPartial() {
        C16471 c16471;
        C16471 c16472;
        int i = 0;
        C20201 c20201 = new C20201(this, 0);
        int i2 = this.f9874;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c20201.f64852 = this.f9877;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                C9998 c9998 = this.f9873;
                if (c9998 == null) {
                    c16472 = this.f9876;
                } else {
                    c16472 = (C16471) c9998.m25854();
                }
                c20201.f64849 = c16472;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C9998 c9999 = this.f9875;
                if (c9999 == null) {
                    c16471 = this.f9872;
                } else {
                    c16471 = (C16471) c9999.m25854();
                }
                c20201.f64851 = c16471;
                i |= 4;
            }
            c20201.f64850 = i | c20201.f64850;
        }
        onBuilt();
        return c20201;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C20201) {
            m9902((C20201) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C20201) {
            m9902((C20201) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9902(C20201 c20201) {
        C16471 c16471;
        C16471 c16472;
        if (c20201 == C20201.getDefaultInstance()) {
            return;
        }
        if (c20201.m46467()) {
            EnumC5810 enumC5810M46463 = c20201.m46463();
            enumC5810M46463.getClass();
            this.f9874 |= 1;
            this.f9877 = enumC5810M46463.getNumber();
            onChanged();
        }
        if (c20201.m46466()) {
            C16471 c16471M46464 = c20201.m46464();
            C9998 c9998 = this.f9873;
            if (c9998 == null) {
                if ((this.f9874 & 2) == 0 || (c16472 = this.f9876) == null || c16472 == C16471.getDefaultInstance()) {
                    this.f9876 = c16471M46464;
                } else {
                    this.f9874 |= 2;
                    onChanged();
                    ((C7301) m9898().m25856()).m19969(c16471M46464);
                }
            } else {
                c9998.m25850(c16471M46464);
            }
            if (this.f9876 != null) {
                this.f9874 |= 2;
                onChanged();
            }
        }
        if (c20201.m46465()) {
            C16471 c16471M46462 = c20201.m46462();
            C9998 c9999 = this.f9875;
            if (c9999 == null) {
                if ((this.f9874 & 4) == 0 || (c16471 = this.f9872) == null || c16471 == C16471.getDefaultInstance()) {
                    this.f9872 = c16471M46462;
                } else {
                    this.f9874 |= 4;
                    onChanged();
                    ((C7301) m9899().m25856()).m19969(c16471M46462);
                }
            } else {
                c9999.m25850(c16471M46462);
            }
            if (this.f9872 != null) {
                this.f9874 |= 4;
                onChanged();
            }
        }
        mo2317mergeUnknownFields(c20201.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9901(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 24) {
                            int iMo11882 = abstractC3660.mo11882();
                            if (EnumC5810.m16936(iMo11882) == null) {
                                mergeUnknownVarintField(3, iMo11882);
                            } else {
                                this.f9877 = iMo11882;
                                this.f9874 |= 1;
                            }
                        } else if (iMo11876 == 34) {
                            abstractC3660.mo11881(m9898().m25856(), c24215);
                            this.f9874 |= 2;
                        } else if (iMo11876 == 42) {
                            abstractC3660.mo11881(m9899().m25856(), c24215);
                            this.f9874 |= 4;
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

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        C16471 defaultInstance;
        C16471 defaultInstance2;
        if ((this.f9874 & 2) != 0) {
            C9998 c9998 = this.f9873;
            if (c9998 == null) {
                defaultInstance2 = this.f9876;
                if (defaultInstance2 == null) {
                    defaultInstance2 = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance2 = (C16471) c9998.m25853();
            }
            if (!defaultInstance2.isInitialized()) {
                return false;
            }
        }
        if ((this.f9874 & 4) == 0) {
            return true;
        }
        C9998 c9999 = this.f9875;
        if (c9999 == null) {
            defaultInstance = this.f9872;
            if (defaultInstance == null) {
                defaultInstance = C16471.getDefaultInstance();
            }
        } else {
            defaultInstance = (C16471) c9999.m25853();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    private C9998 m9898() {
        C16471 defaultInstance;
        C9998 c9998 = this.f9873;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f9876;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            this.f9873 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f9876 = null;
        }
        return this.f9873;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C9998 m9899() {
        C16471 defaultInstance;
        C9998 c9998 = this.f9875;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f9872;
                if (defaultInstance == null) {
                    defaultInstance = C16471.getDefaultInstance();
                }
            } else {
                defaultInstance = (C16471) c9998.m25853();
            }
            this.f9875 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f9872 = null;
        }
        return this.f9875;
    }
}
