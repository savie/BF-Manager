package l;

/* JADX INFO: renamed from: l.ۨ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U940 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11586 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f38948;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f38949;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f38950;

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C11586(int i) {
        this();
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m28879(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m28879(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m28879(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m28879(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C1001.f4677;
        c6956.m18696(C22169.class, C11586.class);
        return c6956;
    }

    public C11586() {
        this.f38948 = 0;
    }

    public C11586(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f38948 = 0;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final AbstractC0584 mo2777clear() {
        super.mo2777clear();
        this.f38949 = 0;
        this.f38950 = false;
        this.f38948 = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final AbstractC3967 mo2777clear() {
        super.mo2777clear();
        this.f38949 = 0;
        this.f38950 = false;
        this.f38948 = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final InterfaceC6977 mo2777clear() {
        super.mo2777clear();
        this.f38949 = 0;
        this.f38950 = false;
        this.f38948 = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final InterfaceC22500 mo2777clear() {
        super.mo2777clear();
        this.f38949 = 0;
        this.f38950 = false;
        this.f38948 = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C1001.f4675;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C22169.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C22169.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C22169 c22169BuildPartial = buildPartial();
        if (c22169BuildPartial.isInitialized()) {
            return c22169BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c22169BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C22169 c22169BuildPartial = buildPartial();
        if (c22169BuildPartial.isInitialized()) {
            return c22169BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c22169BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C22169 buildPartial() {
        int i = 0;
        C22169 c22169 = new C22169(this, 0);
        int i2 = this.f38949;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c22169.f72521 = this.f38950;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c22169.f72520 = this.f38948;
                i |= 2;
            }
            c22169.f72519 = i | c22169.f72519;
        }
        onBuilt();
        return c22169;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C22169) {
            m28881((C22169) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C22169) {
            m28881((C22169) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28881(C22169 c22169) {
        if (c22169 == C22169.getDefaultInstance()) {
            return;
        }
        if (c22169.m49186()) {
            this.f38950 = c22169.m49187();
            this.f38949 |= 1;
            onChanged();
        }
        if (c22169.m49188()) {
            m28880(c22169.m49185());
        }
        mo2781mergeUnknownFields(c22169.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28879(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            this.f38950 = abstractC3262.mo6028();
                            this.f38949 |= 1;
                        } else if (iMo6048 == 16) {
                            int iMo6037 = abstractC3262.mo6037();
                            if (EnumC5235.m14429(iMo6037) == null) {
                                mergeUnknownVarintField(2, iMo6037);
                            } else {
                                this.f38948 = iMo6037;
                                this.f38949 |= 2;
                            }
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28880(EnumC5235 enumC5235) {
        enumC5235.getClass();
        this.f38949 |= 2;
        this.f38948 = enumC5235.getNumber();
        onChanged();
    }
}
