package l;

/* JADX INFO: renamed from: l.ۤۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10050 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15135 f34335;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f34336;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f34337;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C18599 f34338;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f34339;

    public /* synthetic */ C10050(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m25444();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m25444();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m25444();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m25444();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        mergeFrom(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        mergeFrom(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        mergeFrom(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        mergeFrom(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46270;
        c6956.m18696(C7227.class, C10050.class);
        return c6956;
    }

    public C10050() {
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m25442();
        }
    }

    public C10050(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m25442();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25444() {
        super.mo2777clear();
        this.f34337 = 0;
        this.f34336 = 0;
        this.f34339 = 0;
        this.f34338 = null;
        C15135 c15135 = this.f34335;
        if (c15135 != null) {
            c15135.m36296();
            this.f34335 = null;
        }
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46293;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C7227.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C7227.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C7227 c7227BuildPartial = buildPartial();
        if (c7227BuildPartial.isInitialized()) {
            return c7227BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c7227BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C7227 c7227BuildPartial = buildPartial();
        if (c7227BuildPartial.isInitialized()) {
            return c7227BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c7227BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C7227 buildPartial() {
        C18599 c18599;
        int i = 0;
        C7227 c7227 = new C7227(this, 0);
        int i2 = this.f34337;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c7227.f24075 = this.f34336;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c7227.f24078 = this.f34339;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C15135 c15135 = this.f34335;
                if (c15135 == null) {
                    c18599 = this.f34338;
                } else {
                    c18599 = (C18599) c15135.m36297();
                }
                c7227.f24077 = c18599;
                i |= 4;
            }
            c7227.f24076 = i | c7227.f24076;
        }
        onBuilt();
        return c7227;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C7227) {
            m25443((C7227) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C7227) {
            m25443((C7227) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10050 m25443(C7227 c7227) {
        C18599 c18599;
        if (c7227 == C7227.getDefaultInstance()) {
            return this;
        }
        if (c7227.m19257()) {
            m25446(c7227.m19254());
        }
        if (c7227.m19258()) {
            m25445(c7227.m19255());
        }
        if (c7227.m19256()) {
            C18599 c18599M19253 = c7227.m19253();
            C15135 c15135 = this.f34335;
            if (c15135 == null) {
                if ((this.f34337 & 4) == 0 || (c18599 = this.f34338) == null || c18599 == C18599.getDefaultInstance()) {
                    this.f34338 = c18599M19253;
                } else {
                    this.f34337 |= 4;
                    onChanged();
                    ((C3781) m25442().m36293()).m11032(c18599M19253);
                }
            } else {
                c15135.m36294(c18599M19253);
            }
            if (this.f34338 != null) {
                this.f34337 |= 4;
                onChanged();
            }
        }
        mo2781mergeUnknownFields(c7227.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final C10050 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            this.f34336 = abstractC3262.mo6040();
                            this.f34337 |= 1;
                        } else if (iMo6048 == 16) {
                            this.f34339 = abstractC3262.mo6040();
                            this.f34337 |= 2;
                        } else if (iMo6048 == 26) {
                            abstractC3262.mo6027(m25442().m36293(), c2701);
                            this.f34337 |= 4;
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m25446(int i) {
        this.f34336 = i;
        this.f34337 |= 1;
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m25445(int i) {
        this.f34339 = i;
        this.f34337 |= 2;
        onChanged();
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        C18599 defaultInstance;
        if ((this.f34337 & 4) == 0) {
            return true;
        }
        C15135 c15135 = this.f34335;
        if (c15135 == null) {
            defaultInstance = this.f34338;
            if (defaultInstance == null) {
                defaultInstance = C18599.getDefaultInstance();
            }
        } else {
            defaultInstance = (C18599) c15135.m36295();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C15135 m25442() {
        C18599 defaultInstance;
        C15135 c15135 = this.f34335;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f34338;
                if (defaultInstance == null) {
                    defaultInstance = C18599.getDefaultInstance();
                }
            } else {
                defaultInstance = (C18599) c15135.m36295();
            }
            this.f34335 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f34338 = null;
        }
        return this.f34335;
    }
}
