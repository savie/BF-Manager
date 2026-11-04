package l;

/* JADX INFO: renamed from: l.ۙܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5064 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C2826 f17645;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f17646;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f17647;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C9998 f17648;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f17649;

    public /* synthetic */ C5064(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m15326();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m15326();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m15326();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m15326();
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
        C7544 c7544 = C12543.f40301;
        c7544.m20621(C22218.class, C5064.class);
        return c7544;
    }

    public C5064() {
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m15324();
        }
    }

    public C5064(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        if (AbstractC9035.alwaysUseFieldBuilders) {
            m15324();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15326() {
        super.mo2313clear();
        this.f17647 = 0;
        this.f17646 = 0;
        this.f17649 = 0;
        this.f17645 = null;
        C9998 c9998 = this.f17648;
        if (c9998 != null) {
            c9998.m25851();
            this.f17648 = null;
        }
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40270;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C22218.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C22218.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C22218 c22218BuildPartial = buildPartial();
        if (c22218BuildPartial.isInitialized()) {
            return c22218BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c22218BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C22218 c22218BuildPartial = buildPartial();
        if (c22218BuildPartial.isInitialized()) {
            return c22218BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c22218BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C22218 buildPartial() {
        C2826 c2826;
        int i = 0;
        C22218 c22218 = new C22218(this, 0);
        int i2 = this.f17647;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c22218.f71567 = this.f17646;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c22218.f71570 = this.f17649;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C9998 c9998 = this.f17648;
                if (c9998 == null) {
                    c2826 = this.f17645;
                } else {
                    c2826 = (C2826) c9998.m25854();
                }
                c22218.f71566 = c2826;
                i |= 4;
            }
            c22218.f71568 = i | c22218.f71568;
        }
        onBuilt();
        return c22218;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C22218) {
            m15325((C22218) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C22218) {
            m15325((C22218) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5064 m15325(C22218 c22218) {
        C2826 c2826;
        if (c22218 == C22218.getDefaultInstance()) {
            return this;
        }
        if (c22218.m50250()) {
            m15328(c22218.m50248());
        }
        if (c22218.m50251()) {
            m15327(c22218.m50247());
        }
        if (c22218.m50249()) {
            C2826 c2826M50246 = c22218.m50246();
            C9998 c9998 = this.f17648;
            if (c9998 == null) {
                if ((this.f17647 & 4) == 0 || (c2826 = this.f17645) == null || c2826 == C2826.getDefaultInstance()) {
                    this.f17645 = c2826M50246;
                } else {
                    this.f17647 |= 4;
                    onChanged();
                    ((C0589) m15324().m25856()).m2682(c2826M50246);
                }
            } else {
                c9998.m25850(c2826M50246);
            }
            if (this.f17645 != null) {
                this.f17647 |= 4;
                onChanged();
            }
        }
        mo2317mergeUnknownFields(c22218.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final C5064 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            this.f17646 = abstractC3660.mo11892();
                            this.f17647 |= 1;
                        } else if (iMo11876 == 16) {
                            this.f17649 = abstractC3660.mo11892();
                            this.f17647 |= 2;
                        } else if (iMo11876 == 26) {
                            abstractC3660.mo11881(m15324().m25856(), c24215);
                            this.f17647 |= 4;
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

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m15328(int i) {
        this.f17646 = i;
        this.f17647 |= 1;
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15327(int i) {
        this.f17649 = i;
        this.f17647 |= 2;
        onChanged();
    }

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        C2826 defaultInstance;
        if ((this.f17647 & 4) == 0) {
            return true;
        }
        C9998 c9998 = this.f17648;
        if (c9998 == null) {
            defaultInstance = this.f17645;
            if (defaultInstance == null) {
                defaultInstance = C2826.getDefaultInstance();
            }
        } else {
            defaultInstance = (C2826) c9998.m25853();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    private C9998 m15324() {
        C2826 defaultInstance;
        C9998 c9998 = this.f17648;
        if (c9998 == null) {
            if (c9998 == null) {
                defaultInstance = this.f17645;
                if (defaultInstance == null) {
                    defaultInstance = C2826.getDefaultInstance();
                }
            } else {
                defaultInstance = (C2826) c9998.m25853();
            }
            this.f17648 = new C9998(defaultInstance, getParentForChildren(), isClean());
            this.f17645 = null;
        }
        return this.f17648;
    }
}
