package l;

/* JADX INFO: renamed from: l.ۘ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4012 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f13702;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public boolean f13703;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public C9998 f13704;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Object f13705;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f13706;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f13707;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public C18928 f13708;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f13709;

    public /* synthetic */ C4012(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m12973();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m12973();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m12973();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m12973();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m12974(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m12974(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m12974(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m12974(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40273;
        c7544.m20621(C14452.class, C4012.class);
        return c7544;
    }

    public C4012() {
        this.f13702 = "";
        this.f13707 = "";
        this.f13705 = "";
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m12972();
        }
    }

    public C4012(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f13702 = "";
        this.f13707 = "";
        this.f13705 = "";
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m12972();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12973() {
        super.mo2313clear();
        this.f13706 = 0;
        this.f13702 = "";
        this.f13707 = "";
        this.f13705 = "";
        this.f13708 = null;
        C9998 c9998 = this.f13704;
        if (c9998 != null) {
            c9998.m25851();
            this.f13704 = null;
        }
        this.f13709 = false;
        this.f13703 = false;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40251;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C14452.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C14452.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C14452 c14452BuildPartial = buildPartial();
        if (c14452BuildPartial.isInitialized()) {
            return c14452BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c14452BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C14452 c14452BuildPartial = buildPartial();
        if (c14452BuildPartial.isInitialized()) {
            return c14452BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c14452BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C14452 buildPartial() {
        C18928 c18928;
        int i = 0;
        C14452 c14452 = new C14452(this, 0);
        int i2 = this.f13706;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c14452.f45473 = this.f13702;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c14452.f45476 = this.f13707;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c14452.f45474 = this.f13705;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C9998 c9998 = this.f13704;
                if (c9998 == null) {
                    c18928 = this.f13708;
                } else {
                    c18928 = (C18928) c9998.m25854();
                }
                c14452.f45477 = c18928;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c14452.f45478 = this.f13709;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c14452.f45472 = this.f13703;
                i |= 32;
            }
            c14452.f45475 = i | c14452.f45475;
        }
        onBuilt();
        return c14452;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C14452) {
            m12975((C14452) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C14452) {
            m12975((C14452) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12975(C14452 c14452) {
        C18928 c18928;
        if (c14452 == C14452.getDefaultInstance()) {
            return;
        }
        if (c14452.hasName()) {
            this.f13702 = c14452.f45473;
            this.f13706 |= 1;
            onChanged();
        }
        if (c14452.m34900()) {
            this.f13707 = c14452.f45476;
            this.f13706 |= 2;
            onChanged();
        }
        if (c14452.m34897()) {
            this.f13705 = c14452.f45474;
            this.f13706 |= 4;
            onChanged();
        }
        if (c14452.m34904()) {
            C18928 c18928M34899 = c14452.m34899();
            C9998 c9998 = this.f13704;
            if (c9998 == null) {
                if ((this.f13706 & 8) == 0 || (c18928 = this.f13708) == null || c18928 == C18928.getDefaultInstance()) {
                    this.f13708 = c18928M34899;
                } else {
                    this.f13706 |= 8;
                    onChanged();
                    ((C18182) m12972().m25856()).m42350(c18928M34899);
                }
            } else {
                c9998.m25850(c18928M34899);
            }
            if (this.f13708 != null) {
                this.f13706 |= 8;
                onChanged();
            }
        }
        if (c14452.m34902()) {
            this.f13709 = c14452.m34898();
            this.f13706 |= 16;
            onChanged();
        }
        if (c14452.m34903()) {
            this.f13703 = c14452.m34901();
            this.f13706 |= 32;
            onChanged();
        }
        mo2317mergeUnknownFields(c14452.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m12974(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 10) {
                            this.f13702 = abstractC3660.mo11890();
                            this.f13706 |= 1;
                        } else if (iMo11876 == 18) {
                            this.f13707 = abstractC3660.mo11890();
                            this.f13706 |= 2;
                        } else if (iMo11876 == 26) {
                            this.f13705 = abstractC3660.mo11890();
                            this.f13706 |= 4;
                        } else if (iMo11876 == 34) {
                            abstractC3660.mo11881(m12972().m25856(), c24215);
                            this.f13706 |= 8;
                        } else if (iMo11876 == 40) {
                            this.f13709 = abstractC3660.mo11894();
                            this.f13706 |= 16;
                        } else if (iMo11876 == 48) {
                            this.f13703 = abstractC3660.mo11894();
                            this.f13706 |= 32;
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
        C18928 defaultInstance;
        if ((this.f13706 & 8) == 0) {
            return true;
        }
        C9998 c9998 = this.f13704;
        if (c9998 == null) {
            defaultInstance = this.f13708;
            if (defaultInstance == null) {
                defaultInstance = C18928.getDefaultInstance();
            }
        } else {
            defaultInstance = (C18928) c9998.m25853();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C9998 m12972() {
        C18928 defaultInstance;
        C9998 c9998 = this.f13704;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f13708;
                if (defaultInstance == null) {
                    defaultInstance = C18928.getDefaultInstance();
                }
            } else {
                defaultInstance = (C18928) c9998.m25853();
            }
            this.f13704 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f13708 = null;
        }
        return this.f13704;
    }
}
