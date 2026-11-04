package l;

/* JADX INFO: renamed from: l.ۛܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6556 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C9998 f22012;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C21472 f22013;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f22014;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f22015;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f22016;

    public /* synthetic */ C6556(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m18461();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m18461();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m18461();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m18461();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        mergeFrom(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        mergeFrom(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        mergeFrom(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        mergeFrom(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40253;
        c7544.m20621(C24456.class, C6556.class);
        return c7544;
    }

    public C6556() {
        this.f22016 = "";
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m18460();
        }
    }

    public C6556(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f22016 = "";
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m18460();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18461() {
        super.mo2313clear();
        this.f22014 = 0;
        this.f22016 = "";
        this.f22015 = 0;
        this.f22013 = null;
        C9998 c9998 = this.f22012;
        if (c9998 != null) {
            c9998.m25851();
            this.f22012 = null;
        }
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40303;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C24456.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C24456.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C24456 c24456BuildPartial = buildPartial();
        if (c24456BuildPartial.isInitialized()) {
            return c24456BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c24456BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C24456 c24456BuildPartial = buildPartial();
        if (c24456BuildPartial.isInitialized()) {
            return c24456BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c24456BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C24456 buildPartial() {
        C21472 c21472;
        int i = 0;
        C24456 c24456 = new C24456(this, 0);
        int i2 = this.f22014;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c24456.f79393 = this.f22016;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c24456.f79390 = this.f22015;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C9998 c9998 = this.f22012;
                if (c9998 == null) {
                    c21472 = this.f22013;
                } else {
                    c21472 = (C21472) c9998.m25854();
                }
                c24456.f79391 = c21472;
                i |= 4;
            }
            c24456.f79392 = i | c24456.f79392;
        }
        onBuilt();
        return c24456;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C24456) {
            m18464((C24456) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C24456) {
            m18464((C24456) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18464(C24456 c24456) {
        C21472 c21472;
        if (c24456 == C24456.getDefaultInstance()) {
            return;
        }
        if (c24456.hasName()) {
            this.f22016 = c24456.f79393;
            this.f22014 |= 1;
            onChanged();
        }
        if (c24456.m54706()) {
            m18462(c24456.m54705());
        }
        if (c24456.m54707()) {
            C21472 c21472M54704 = c24456.m54704();
            C9998 c9998 = this.f22012;
            if (c9998 == null) {
                if ((this.f22014 & 4) == 0 || (c21472 = this.f22013) == null || c21472 == C21472.getDefaultInstance()) {
                    this.f22013 = c21472M54704;
                } else {
                    this.f22014 |= 4;
                    onChanged();
                    ((C14758) m18460().m25856()).m35488(c21472M54704);
                }
            } else {
                c9998.m25850(c21472M54704);
            }
            if (this.f22013 != null) {
                this.f22014 |= 4;
                onChanged();
            }
        }
        mo2317mergeUnknownFields(c24456.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final C6556 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 10) {
                            this.f22016 = abstractC3660.mo11890();
                            this.f22014 |= 1;
                        } else if (iMo11876 == 16) {
                            this.f22015 = abstractC3660.mo11892();
                            this.f22014 |= 2;
                        } else if (iMo11876 == 26) {
                            abstractC3660.mo11881(m18460().m25856(), c24215);
                            this.f22014 |= 4;
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18463(String str) {
        str.getClass();
        this.f22016 = str;
        this.f22014 |= 1;
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18462(int i) {
        this.f22015 = i;
        this.f22014 |= 2;
        onChanged();
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        C21472 defaultInstance;
        if ((this.f22014 & 4) == 0) {
            return true;
        }
        C9998 c9998 = this.f22012;
        if (c9998 == null) {
            defaultInstance = this.f22013;
            if (defaultInstance == null) {
                defaultInstance = C21472.getDefaultInstance();
            }
        } else {
            defaultInstance = (C21472) c9998.m25853();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C9998 m18460() {
        C21472 defaultInstance;
        C9998 c9998 = this.f22012;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f22013;
                if (defaultInstance == null) {
                    defaultInstance = C21472.getDefaultInstance();
                }
            } else {
                defaultInstance = (C21472) c9998.m25853();
            }
            this.f22012 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f22013 = null;
        }
        return this.f22012;
    }
}
