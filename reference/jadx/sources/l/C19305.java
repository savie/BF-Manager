package l;

/* JADX INFO: renamed from: l.᩵ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19305 extends AbstractC12580 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f62284;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public int f62285;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public int f62286;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f62287;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f62288;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f62289;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f62290;

    public C19305(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f62288 = 0;
        this.f62284 = 0;
        this.f62285 = 0;
        this.f62286 = 0;
        this.f62289 = 0;
        this.f62287 = 0;
    }

    public /* synthetic */ C19305(int i) {
        this();
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m44296();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m44296();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m44296();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC12580 mo2777clear() {
        m44296();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m44296();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m44292(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m44292(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m44292(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m44292(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46279;
        c6956.m18696(C23539.class, C19305.class);
        return c6956;
    }

    public C19305() {
        this.f62288 = 0;
        this.f62284 = 0;
        this.f62285 = 0;
        this.f62286 = 0;
        this.f62289 = 0;
        this.f62287 = 0;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m44296() {
        super.mo2777clear();
        this.f62290 = 0;
        this.f62288 = 0;
        this.f62284 = 0;
        this.f62285 = 0;
        this.f62286 = 0;
        this.f62289 = 0;
        this.f62287 = 0;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46308;
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C23539.getDefaultInstance();
    }

    @Override // l.AbstractC12580, l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C23539.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C23539 build() {
        C23539 c23539BuildPartial = buildPartial();
        if (c23539BuildPartial.isInitialized()) {
            return c23539BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c23539BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C23539 buildPartial() {
        int i;
        C23539 c23539 = new C23539(this);
        int i2 = this.f62290;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c23539.f76226 = this.f62288;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c23539.f76222 = this.f62284;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c23539.f76224 = this.f62285;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c23539.f76229 = this.f62286;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c23539.f76223 = this.f62289;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c23539.f76225 = this.f62287;
                i |= 32;
            }
            c23539.f76228 = i | c23539.f76228;
        }
        onBuilt();
        return c23539;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C23539) {
            m44291((C23539) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C23539) {
            m44291((C23539) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19305 m44291(C23539 c23539) {
        if (c23539 == C23539.getDefaultInstance()) {
            return this;
        }
        if (c23539.m51873()) {
            m44295(c23539.m51875());
        }
        if (c23539.m51879()) {
            EnumC10133 enumC10133M51882 = c23539.m51882();
            enumC10133M51882.getClass();
            this.f62290 |= 2;
            this.f62284 = enumC10133M51882.getNumber();
            onChanged();
        }
        if (c23539.m51880()) {
            m44294(c23539.m51878());
        }
        if (c23539.m51876()) {
            EnumC10839 enumC10839M51872 = c23539.m51872();
            enumC10839M51872.getClass();
            this.f62290 |= 8;
            this.f62286 = enumC10839M51872.getNumber();
            onChanged();
        }
        if (c23539.m51871()) {
            m44293(c23539.m51877());
        }
        if (c23539.m51874()) {
            EnumC20011 enumC20011M51881 = c23539.m51881();
            enumC20011M51881.getClass();
            this.f62290 |= 32;
            this.f62287 = enumC20011M51881.getNumber();
            onChanged();
        }
        m31299((AbstractC6229) c23539);
        mo2781mergeUnknownFields(c23539.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC12580, l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return m31301();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44292(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            int iMo6037 = abstractC3262.mo6037();
                            if (EnumC20716.m46566(iMo6037) == null) {
                                mergeUnknownVarintField(1, iMo6037);
                            } else {
                                this.f62288 = iMo6037;
                                this.f62290 |= 1;
                            }
                        } else if (iMo6048 == 16) {
                            int iMo6038 = abstractC3262.mo6037();
                            if (EnumC10133.m25756(iMo6038) == null) {
                                mergeUnknownVarintField(2, iMo6038);
                            } else {
                                this.f62284 = iMo6038;
                                this.f62290 |= 2;
                            }
                        } else if (iMo6048 == 24) {
                            int iMo6039 = abstractC3262.mo6037();
                            if (EnumC17188.m40106(iMo6039) == null) {
                                mergeUnknownVarintField(3, iMo6039);
                            } else {
                                this.f62285 = iMo6039;
                                this.f62290 |= 4;
                            }
                        } else if (iMo6048 == 32) {
                            int iMo60310 = abstractC3262.mo6037();
                            if (EnumC10839.m27163(iMo60310) == null) {
                                mergeUnknownVarintField(4, iMo60310);
                            } else {
                                this.f62286 = iMo60310;
                                this.f62290 |= 8;
                            }
                        } else if (iMo6048 == 40) {
                            int iMo60311 = abstractC3262.mo6037();
                            if (EnumC16483.m38745(iMo60311) == null) {
                                mergeUnknownVarintField(5, iMo60311);
                            } else {
                                this.f62289 = iMo60311;
                                this.f62290 |= 16;
                            }
                        } else if (iMo6048 == 48) {
                            int iMo60312 = abstractC3262.mo6037();
                            if (EnumC20011.m45309(iMo60312) == null) {
                                mergeUnknownVarintField(6, iMo60312);
                            } else {
                                this.f62287 = iMo60312;
                                this.f62290 |= 32;
                            }
                        } else if (!parseUnknownField(abstractC3262, c2701, iMo6048)) {
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
    public final void m44295(EnumC20716 enumC20716) {
        enumC20716.getClass();
        this.f62290 |= 1;
        this.f62288 = enumC20716.getNumber();
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44294(EnumC17188 enumC17188) {
        enumC17188.getClass();
        this.f62290 |= 4;
        this.f62285 = enumC17188.getNumber();
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44293(EnumC16483 enumC16483) {
        enumC16483.getClass();
        this.f62290 |= 16;
        this.f62289 = enumC16483.getNumber();
        onChanged();
    }
}
