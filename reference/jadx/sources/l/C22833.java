package l;

/* JADX INFO: renamed from: l.᩺ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22833 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f74283;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f74284;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f74285;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public boolean f74286;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f74287;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f74288;

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C22833(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m50572();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m50572();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m50572();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m50572();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m50573(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m50573(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m50573(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m50573(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46283;
        c6956.m18696(C15072.class, C22833.class);
        return c6956;
    }

    public C22833() {
        this.f74288 = "";
        this.f74287 = "";
    }

    public C22833(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f74288 = "";
        this.f74287 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50572() {
        super.mo2777clear();
        this.f74285 = 0;
        this.f74283 = 0;
        this.f74288 = "";
        this.f74287 = "";
        this.f74284 = false;
        this.f74286 = false;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46290;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C15072.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C15072.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C15072 c15072BuildPartial = buildPartial();
        if (c15072BuildPartial.isInitialized()) {
            return c15072BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c15072BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C15072 c15072BuildPartial = buildPartial();
        if (c15072BuildPartial.isInitialized()) {
            return c15072BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c15072BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C15072 buildPartial() {
        int i = 0;
        C15072 c15072 = new C15072(this, 0);
        int i2 = this.f74285;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c15072.f49134 = this.f74283;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c15072.f49136 = this.f74288;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c15072.f49131 = this.f74287;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c15072.f49135 = this.f74284;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c15072.f49132 = this.f74286;
                i |= 16;
            }
            c15072.f49133 = i | c15072.f49133;
        }
        onBuilt();
        return c15072;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C15072) {
            m50574((C15072) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C15072) {
            m50574((C15072) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50574(C15072 c15072) {
        if (c15072 == C15072.getDefaultInstance()) {
            return;
        }
        if (c15072.m36127()) {
            this.f74283 = c15072.m36121();
            this.f74285 |= 1;
            onChanged();
        }
        if (c15072.m36124()) {
            this.f74288 = c15072.f49136;
            this.f74285 |= 2;
            onChanged();
        }
        if (c15072.hasType()) {
            this.f74287 = c15072.f49131;
            this.f74285 |= 4;
            onChanged();
        }
        if (c15072.m36126()) {
            this.f74284 = c15072.m36128();
            this.f74285 |= 8;
            onChanged();
        }
        if (c15072.m36125()) {
            this.f74286 = c15072.m36122();
            this.f74285 |= 16;
            onChanged();
        }
        mo2781mergeUnknownFields(c15072.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m50573(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            this.f74283 = abstractC3262.mo6040();
                            this.f74285 |= 1;
                        } else if (iMo6048 == 18) {
                            this.f74288 = abstractC3262.mo6050();
                            this.f74285 |= 2;
                        } else if (iMo6048 == 26) {
                            this.f74287 = abstractC3262.mo6050();
                            this.f74285 |= 4;
                        } else if (iMo6048 == 40) {
                            this.f74284 = abstractC3262.mo6028();
                            this.f74285 |= 8;
                        } else if (iMo6048 == 48) {
                            this.f74286 = abstractC3262.mo6028();
                            this.f74285 |= 16;
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
}
