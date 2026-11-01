package l;

/* JADX INFO: renamed from: l.ܿܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17436 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C21463 f55531;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC23890 f55532;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f55533;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public InterfaceC23890 f55534;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f55535;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f55536;

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C17436(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m40645();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m40645();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m40645();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m40645();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m40646(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m40646(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m40646(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m40646(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46305;
        c6956.m18696(C6147.class, C17436.class);
        return c6956;
    }

    public C17436() {
        this.f55534 = AbstractC18245.m42411();
        this.f55532 = AbstractC18245.m42411();
        this.f55536 = "";
        this.f55535 = "";
        this.f55531 = C21463.m48084();
    }

    public C17436(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f55534 = AbstractC18245.m42411();
        this.f55532 = AbstractC18245.m42411();
        this.f55536 = "";
        this.f55535 = "";
        this.f55531 = C21463.m48084();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40645() {
        super.mo2777clear();
        this.f55533 = 0;
        this.f55534 = AbstractC18245.m42411();
        this.f55532 = AbstractC18245.m42411();
        this.f55536 = "";
        this.f55535 = "";
        this.f55531 = C21463.m48084();
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46319;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C6147.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C6147.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C6147 c6147BuildPartial = buildPartial();
        if (c6147BuildPartial.isInitialized()) {
            return c6147BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c6147BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C6147 c6147BuildPartial = buildPartial();
        if (c6147BuildPartial.isInitialized()) {
            return c6147BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c6147BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C6147 buildPartial() {
        int i = 0;
        C6147 c6147 = new C6147(this, 0);
        int i2 = this.f55533;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                this.f55534.mo6483();
                c6147.f20998 = this.f55534;
            }
            if ((i2 & 2) != 0) {
                this.f55532.mo6483();
                c6147.f20994 = this.f55532;
            }
            if ((i2 & 4) != 0) {
                c6147.f20999 = this.f55536;
                i = 1;
            }
            if ((i2 & 8) != 0) {
                c6147.f21000 = this.f55535;
                i |= 2;
            }
            if ((i2 & 16) != 0) {
                this.f55531.mo6483();
                c6147.f20992 = this.f55531;
            }
            c6147.f20996 = i | c6147.f20996;
        }
        onBuilt();
        return c6147;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C6147) {
            m40647((C6147) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C6147) {
            m40647((C6147) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40647(C6147 c6147) {
        if (c6147 == C6147.getDefaultInstance()) {
            return;
        }
        if (!c6147.f20998.isEmpty()) {
            if (this.f55534.isEmpty()) {
                InterfaceC23890 interfaceC23890 = c6147.f20998;
                this.f55534 = interfaceC23890;
                interfaceC23890.mo6483();
                this.f55533 |= 1;
            } else {
                m40644();
                this.f55534.addAll(c6147.f20998);
            }
            onChanged();
        }
        if (!c6147.f20994.isEmpty()) {
            if (this.f55532.isEmpty()) {
                InterfaceC23890 interfaceC23891 = c6147.f20994;
                this.f55532 = interfaceC23891;
                interfaceC23891.mo6483();
                this.f55533 |= 2;
            } else {
                m40643();
                this.f55532.addAll(c6147.f20994);
            }
            onChanged();
        }
        if (c6147.m17150()) {
            this.f55536 = c6147.f20999;
            this.f55533 |= 4;
            onChanged();
        }
        if (c6147.m17152()) {
            this.f55535 = c6147.f21000;
            this.f55533 |= 8;
            onChanged();
        }
        if (!c6147.f20992.isEmpty()) {
            if (this.f55531.isEmpty()) {
                this.f55531 = c6147.f20992;
                this.f55533 |= 16;
            } else {
                if (!this.f55531.mo6484()) {
                    this.f55531 = new C21463(this.f55531);
                }
                this.f55533 |= 16;
                this.f55531.addAll(c6147.f20992);
            }
            onChanged();
        }
        mo2781mergeUnknownFields(c6147.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40646(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            int iMo6040 = abstractC3262.mo6040();
                            m40644();
                            this.f55534.mo45940(iMo6040);
                        } else if (iMo6048 == 10) {
                            int iMo6035 = abstractC3262.mo6035(abstractC3262.mo6044());
                            m40644();
                            while (abstractC3262.mo6038() > 0) {
                                this.f55534.mo45940(abstractC3262.mo6040());
                            }
                            abstractC3262.mo6039(iMo6035);
                        } else if (iMo6048 == 16) {
                            int iMo6041 = abstractC3262.mo6040();
                            m40643();
                            this.f55532.mo45940(iMo6041);
                        } else if (iMo6048 == 18) {
                            int iMo6036 = abstractC3262.mo6035(abstractC3262.mo6044());
                            m40643();
                            while (abstractC3262.mo6038() > 0) {
                                this.f55532.mo45940(abstractC3262.mo6040());
                            }
                            abstractC3262.mo6039(iMo6036);
                        } else if (iMo6048 == 26) {
                            this.f55536 = abstractC3262.mo6050();
                            this.f55533 |= 4;
                        } else if (iMo6048 == 34) {
                            this.f55535 = abstractC3262.mo6050();
                            this.f55533 |= 8;
                        } else if (iMo6048 == 50) {
                            AbstractC23725 abstractC23725Mo6050 = abstractC3262.mo6050();
                            if (!this.f55531.mo6484()) {
                                this.f55531 = new C21463(this.f55531);
                            }
                            this.f55533 |= 16;
                            this.f55531.mo21383(abstractC23725Mo6050);
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

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private void m40644() {
        if (!this.f55534.mo6484()) {
            this.f55534 = (InterfaceC23890) AbstractC18245.m42400((InterfaceC2016) this.f55534);
        }
        this.f55533 |= 1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m40643() {
        if (!this.f55532.mo6484()) {
            this.f55532 = (InterfaceC23890) AbstractC18245.m42400((InterfaceC2016) this.f55532);
        }
        this.f55533 |= 2;
    }
}
