package l;

/* JADX INFO: renamed from: l.֨۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1029 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C6995 f3738;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f3739;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9998 f3740;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f3741;

    public /* synthetic */ C1029(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m3936();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m3936();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m3936();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m3936();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m3937(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m3937(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m3937(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m3937(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40284;
        c7544.m20621(C9231.class, C1029.class);
        return c7544;
    }

    public C1029() {
        this.f3741 = "";
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m3935();
        }
    }

    public C1029(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f3741 = "";
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m3935();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3936() {
        super.mo2313clear();
        this.f3739 = 0;
        this.f3741 = "";
        this.f3738 = null;
        C9998 c9998 = this.f3740;
        if (c9998 != null) {
            c9998.m25851();
            this.f3740 = null;
        }
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40288;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C9231.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C9231.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C9231 c9231BuildPartial = buildPartial();
        if (c9231BuildPartial.isInitialized()) {
            return c9231BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c9231BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C9231 c9231BuildPartial = buildPartial();
        if (c9231BuildPartial.isInitialized()) {
            return c9231BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c9231BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C9231 buildPartial() {
        C6995 c6995;
        int i = 0;
        C9231 c9231 = new C9231(this, 0);
        int i2 = this.f3739;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c9231.f30069 = this.f3741;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                C9998 c9998 = this.f3740;
                if (c9998 == null) {
                    c6995 = this.f3738;
                } else {
                    c6995 = (C6995) c9998.m25854();
                }
                c9231.f30067 = c6995;
                i |= 2;
            }
            c9231.f30068 = i | c9231.f30068;
        }
        onBuilt();
        return c9231;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C9231) {
            m3938((C9231) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C9231) {
            m3938((C9231) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3938(C9231 c9231) {
        C6995 c6995;
        if (c9231 == C9231.getDefaultInstance()) {
            return;
        }
        if (c9231.hasName()) {
            this.f3741 = c9231.f30069;
            this.f3739 |= 1;
            onChanged();
        }
        if (c9231.m24420()) {
            C6995 c6995M24421 = c9231.m24421();
            C9998 c9998 = this.f3740;
            if (c9998 == null) {
                if ((this.f3739 & 2) == 0 || (c6995 = this.f3738) == null || c6995 == C6995.getDefaultInstance()) {
                    this.f3738 = c6995M24421;
                } else {
                    this.f3739 |= 2;
                    onChanged();
                    ((C8486) m3935().m25856()).m22808(c6995M24421);
                }
            } else {
                c9998.m25850(c6995M24421);
            }
            if (this.f3738 != null) {
                this.f3739 |= 2;
                onChanged();
            }
        }
        mo2317mergeUnknownFields(c9231.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m3937(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 10) {
                            this.f3741 = abstractC3660.mo11890();
                            this.f3739 |= 1;
                        } else if (iMo11876 == 18) {
                            abstractC3660.mo11881(m3935().m25856(), c24215);
                            this.f3739 |= 2;
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
        C6995 defaultInstance;
        if ((this.f3739 & 2) == 0) {
            return true;
        }
        C9998 c9998 = this.f3740;
        if (c9998 == null) {
            defaultInstance = this.f3738;
            if (defaultInstance == null) {
                defaultInstance = C6995.getDefaultInstance();
            }
        } else {
            defaultInstance = (C6995) c9998.m25853();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C9998 m3935() {
        C6995 defaultInstance;
        C9998 c9998 = this.f3740;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f3738;
                if (defaultInstance == null) {
                    defaultInstance = C6995.getDefaultInstance();
                }
            } else {
                defaultInstance = (C6995) c9998.m25853();
            }
            this.f3740 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f3738 = null;
        }
        return this.f3740;
    }
}
