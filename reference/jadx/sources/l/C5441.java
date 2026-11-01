package l;

/* JADX INFO: renamed from: l.ۚܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5441 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f18757;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Object f18758;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public boolean f18759;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15135 f18760;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f18761;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object f18762;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23081 f18763;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f18764;

    public /* synthetic */ C5441(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m15042();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m15042();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m15042();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m15042();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m15043(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m15043(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m15043(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m15043(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46282;
        c6956.m18696(C22375.class, C5441.class);
        return c6956;
    }

    public C5441() {
        this.f18762 = "";
        this.f18757 = "";
        this.f18758 = "";
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m15041();
        }
    }

    public C5441(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f18762 = "";
        this.f18757 = "";
        this.f18758 = "";
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m15041();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15042() {
        super.mo2777clear();
        this.f18761 = 0;
        this.f18762 = "";
        this.f18757 = "";
        this.f18758 = "";
        this.f18763 = null;
        C15135 c15135 = this.f18760;
        if (c15135 != null) {
            c15135.m36296();
            this.f18760 = null;
        }
        this.f18764 = false;
        this.f18759 = false;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46274;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C22375.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C22375.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C22375 c22375BuildPartial = buildPartial();
        if (c22375BuildPartial.isInitialized()) {
            return c22375BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c22375BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C22375 c22375BuildPartial = buildPartial();
        if (c22375BuildPartial.isInitialized()) {
            return c22375BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c22375BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C22375 buildPartial() {
        C23081 c23081;
        int i = 0;
        C22375 c22375 = new C22375(this, 0);
        int i2 = this.f18761;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c22375.f73057 = this.f18762;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c22375.f73054 = this.f18757;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c22375.f73055 = this.f18758;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                C15135 c15135 = this.f18760;
                if (c15135 == null) {
                    c23081 = this.f18763;
                } else {
                    c23081 = (C23081) c15135.m36297();
                }
                c22375.f73060 = c23081;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c22375.f73061 = this.f18764;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c22375.f73056 = this.f18759;
                i |= 32;
            }
            c22375.f73058 = i | c22375.f73058;
        }
        onBuilt();
        return c22375;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C22375) {
            m15044((C22375) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C22375) {
            m15044((C22375) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15044(C22375 c22375) {
        C23081 c23081;
        if (c22375 == C22375.getDefaultInstance()) {
            return;
        }
        if (c22375.hasName()) {
            this.f18762 = c22375.f73057;
            this.f18761 |= 1;
            onChanged();
        }
        if (c22375.m49623()) {
            this.f18757 = c22375.f73054;
            this.f18761 |= 2;
            onChanged();
        }
        if (c22375.m49620()) {
            this.f18758 = c22375.f73055;
            this.f18761 |= 4;
            onChanged();
        }
        if (c22375.m49624()) {
            C23081 c23081M49619 = c22375.m49619();
            C15135 c15135 = this.f18760;
            if (c15135 == null) {
                if ((this.f18761 & 8) == 0 || (c23081 = this.f18763) == null || c23081 == C23081.getDefaultInstance()) {
                    this.f18763 = c23081M49619;
                } else {
                    this.f18761 |= 8;
                    onChanged();
                    ((C13203) m15041().m36293()).m32673(c23081M49619);
                }
            } else {
                c15135.m36294(c23081M49619);
            }
            if (this.f18763 != null) {
                this.f18761 |= 8;
                onChanged();
            }
        }
        if (c22375.m49626()) {
            this.f18764 = c22375.m49621();
            this.f18761 |= 16;
            onChanged();
        }
        if (c22375.m49625()) {
            this.f18759 = c22375.m49622();
            this.f18761 |= 32;
            onChanged();
        }
        mo2781mergeUnknownFields(c22375.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m15043(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 10) {
                            this.f18762 = abstractC3262.mo6050();
                            this.f18761 |= 1;
                        } else if (iMo6048 == 18) {
                            this.f18757 = abstractC3262.mo6050();
                            this.f18761 |= 2;
                        } else if (iMo6048 == 26) {
                            this.f18758 = abstractC3262.mo6050();
                            this.f18761 |= 4;
                        } else if (iMo6048 == 34) {
                            abstractC3262.mo6027(m15041().m36293(), c2701);
                            this.f18761 |= 8;
                        } else if (iMo6048 == 40) {
                            this.f18764 = abstractC3262.mo6028();
                            this.f18761 |= 16;
                        } else if (iMo6048 == 48) {
                            this.f18759 = abstractC3262.mo6028();
                            this.f18761 |= 32;
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
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        C23081 defaultInstance;
        if ((this.f18761 & 8) == 0) {
            return true;
        }
        C15135 c15135 = this.f18760;
        if (c15135 == null) {
            defaultInstance = this.f18763;
            if (defaultInstance == null) {
                defaultInstance = C23081.getDefaultInstance();
            }
        } else {
            defaultInstance = (C23081) c15135.m36295();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C15135 m15041() {
        C23081 defaultInstance;
        C15135 c15135 = this.f18760;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f18763;
                if (defaultInstance == null) {
                    defaultInstance = C23081.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23081) c15135.m36295();
            }
            this.f18760 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f18763 = null;
        }
        return this.f18760;
    }
}
