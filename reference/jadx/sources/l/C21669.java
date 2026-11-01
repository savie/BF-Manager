package l;

/* JADX INFO: renamed from: l.᩸ܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21669 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15135 f70273;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f70274;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C19553 f70275;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f70276;

    public /* synthetic */ C21669(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m48400();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m48400();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m48400();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m48400();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m48401(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m48401(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m48401(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m48401(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46311;
        c6956.m18696(C18141.class, C21669.class);
        return c6956;
    }

    public C21669() {
        this.f70276 = "";
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m48399();
        }
    }

    public C21669(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f70276 = "";
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m48399();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48400() {
        super.mo2777clear();
        this.f70274 = 0;
        this.f70276 = "";
        this.f70275 = null;
        C15135 c15135 = this.f70273;
        if (c15135 != null) {
            c15135.m36296();
            this.f70273 = null;
        }
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46321;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C18141.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C18141.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C18141 c18141BuildPartial = buildPartial();
        if (c18141BuildPartial.isInitialized()) {
            return c18141BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c18141BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C18141 c18141BuildPartial = buildPartial();
        if (c18141BuildPartial.isInitialized()) {
            return c18141BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c18141BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C18141 buildPartial() {
        C19553 c19553;
        int i = 0;
        C18141 c18141 = new C18141(this, 0);
        int i2 = this.f70274;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c18141.f58007 = this.f70276;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                C15135 c15135 = this.f70273;
                if (c15135 == null) {
                    c19553 = this.f70275;
                } else {
                    c19553 = (C19553) c15135.m36297();
                }
                c18141.f58009 = c19553;
                i |= 2;
            }
            c18141.f58008 = i | c18141.f58008;
        }
        onBuilt();
        return c18141;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C18141) {
            m48402((C18141) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C18141) {
            m48402((C18141) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48402(C18141 c18141) {
        C19553 c19553;
        if (c18141 == C18141.getDefaultInstance()) {
            return;
        }
        if (c18141.hasName()) {
            this.f70276 = c18141.f58007;
            this.f70274 |= 1;
            onChanged();
        }
        if (c18141.m42230()) {
            C19553 c19553M42231 = c18141.m42231();
            C15135 c15135 = this.f70273;
            if (c15135 == null) {
                if ((this.f70274 & 2) == 0 || (c19553 = this.f70275) == null || c19553 == C19553.getDefaultInstance()) {
                    this.f70275 = c19553M42231;
                } else {
                    this.f70274 |= 2;
                    onChanged();
                    ((C8264) m48399().m36293()).m21663(c19553M42231);
                }
            } else {
                c15135.m36294(c19553M42231);
            }
            if (this.f70275 != null) {
                this.f70274 |= 2;
                onChanged();
            }
        }
        mo2781mergeUnknownFields(c18141.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m48401(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 10) {
                            this.f70276 = abstractC3262.mo6050();
                            this.f70274 |= 1;
                        } else if (iMo6048 == 18) {
                            abstractC3262.mo6027(m48399().m36293(), c2701);
                            this.f70274 |= 2;
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
        C19553 defaultInstance;
        if ((this.f70274 & 2) == 0) {
            return true;
        }
        C15135 c15135 = this.f70273;
        if (c15135 == null) {
            defaultInstance = this.f70275;
            if (defaultInstance == null) {
                defaultInstance = C19553.getDefaultInstance();
            }
        } else {
            defaultInstance = (C19553) c15135.m36295();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C15135 m48399() {
        C19553 defaultInstance;
        C15135 c15135 = this.f70273;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f70275;
                if (defaultInstance == null) {
                    defaultInstance = C19553.getDefaultInstance();
                }
            } else {
                defaultInstance = (C19553) c15135.m36295();
            }
            this.f70273 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f70275 = null;
        }
        return this.f70273;
    }
}
