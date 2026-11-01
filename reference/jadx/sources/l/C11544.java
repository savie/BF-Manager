package l;

/* JADX INFO: renamed from: l.ۨۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11544 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f38788;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C0959 f38789;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f38790;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C15135 f38791;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f38792;

    public /* synthetic */ C11544(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m28722();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m28722();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m28722();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m28722();
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
        C6956 c6956 = C14097.f46285;
        c6956.m18696(C2370.class, C11544.class);
        return c6956;
    }

    public C11544() {
        this.f38792 = "";
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m28721();
        }
    }

    public C11544(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f38792 = "";
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m28721();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28722() {
        super.mo2777clear();
        this.f38790 = 0;
        this.f38792 = "";
        this.f38788 = 0;
        this.f38789 = null;
        C15135 c15135 = this.f38791;
        if (c15135 != null) {
            c15135.m36296();
            this.f38791 = null;
        }
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46312;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C2370.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C2370.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C2370 c2370BuildPartial = buildPartial();
        if (c2370BuildPartial.isInitialized()) {
            return c2370BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c2370BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C2370 c2370BuildPartial = buildPartial();
        if (c2370BuildPartial.isInitialized()) {
            return c2370BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c2370BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C2370 buildPartial() {
        C0959 c0959;
        int i = 0;
        C2370 c2370 = new C2370(this, 0);
        int i2 = this.f38790;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c2370.f8376 = this.f38792;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c2370.f8379 = this.f38788;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C15135 c15135 = this.f38791;
                if (c15135 == null) {
                    c0959 = this.f38789;
                } else {
                    c0959 = (C0959) c15135.m36297();
                }
                c2370.f8377 = c0959;
                i |= 4;
            }
            c2370.f8378 = i | c2370.f8378;
        }
        onBuilt();
        return c2370;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C2370) {
            m28725((C2370) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C2370) {
            m28725((C2370) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28725(C2370 c2370) {
        C0959 c0959;
        if (c2370 == C2370.getDefaultInstance()) {
            return;
        }
        if (c2370.hasName()) {
            this.f38792 = c2370.f8376;
            this.f38790 |= 1;
            onChanged();
        }
        if (c2370.m7221()) {
            m28723(c2370.m7222());
        }
        if (c2370.m7223()) {
            C0959 c0959M7220 = c2370.m7220();
            C15135 c15135 = this.f38791;
            if (c15135 == null) {
                if ((this.f38790 & 4) == 0 || (c0959 = this.f38789) == null || c0959 == C0959.getDefaultInstance()) {
                    this.f38789 = c0959M7220;
                } else {
                    this.f38790 |= 4;
                    onChanged();
                    ((C22127) m28721().m36293()).m49090(c0959M7220);
                }
            } else {
                c15135.m36294(c0959M7220);
            }
            if (this.f38789 != null) {
                this.f38790 |= 4;
                onChanged();
            }
        }
        mo2781mergeUnknownFields(c2370.getUnknownFields());
        onChanged();
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final C11544 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 10) {
                            this.f38792 = abstractC3262.mo6050();
                            this.f38790 |= 1;
                        } else if (iMo6048 == 16) {
                            this.f38788 = abstractC3262.mo6040();
                            this.f38790 |= 2;
                        } else if (iMo6048 == 26) {
                            abstractC3262.mo6027(m28721().m36293(), c2701);
                            this.f38790 |= 4;
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28724(String str) {
        str.getClass();
        this.f38792 = str;
        this.f38790 |= 1;
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28723(int i) {
        this.f38788 = i;
        this.f38790 |= 2;
        onChanged();
    }

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        C0959 defaultInstance;
        if ((this.f38790 & 4) == 0) {
            return true;
        }
        C15135 c15135 = this.f38791;
        if (c15135 == null) {
            defaultInstance = this.f38789;
            if (defaultInstance == null) {
                defaultInstance = C0959.getDefaultInstance();
            }
        } else {
            defaultInstance = (C0959) c15135.m36295();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C15135 m28721() {
        C0959 defaultInstance;
        C15135 c15135 = this.f38791;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f38789;
                if (defaultInstance == null) {
                    defaultInstance = C0959.getDefaultInstance();
                }
            } else {
                defaultInstance = (C0959) c15135.m36295();
            }
            this.f38791 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f38789 = null;
        }
        return this.f38791;
    }
}
