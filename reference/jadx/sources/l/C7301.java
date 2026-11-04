package l;

/* JADX INFO: renamed from: l.ۜܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7301 extends AbstractC5307 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f24030;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f24031;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public int f24032;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public int f24033;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f24034;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public int f24035;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f24036;

    public C7301(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f24030 = 0;
        this.f24034 = 0;
        this.f24033 = 0;
        this.f24031 = 0;
        this.f24035 = 0;
        this.f24032 = 0;
    }

    public /* synthetic */ C7301(int i) {
        this();
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m19974();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC5307 mo2313clear() {
        m19974();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m19974();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m19974();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m19974();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m19971(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m19971(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m19971(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m19971(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40268;
        c7544.m20621(C16471.class, C7301.class);
        return c7544;
    }

    public C7301() {
        this.f24030 = 0;
        this.f24034 = 0;
        this.f24033 = 0;
        this.f24031 = 0;
        this.f24035 = 0;
        this.f24032 = 0;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m19974() {
        super.mo2313clear();
        this.f24036 = 0;
        this.f24030 = 0;
        this.f24034 = 0;
        this.f24033 = 0;
        this.f24031 = 0;
        this.f24035 = 0;
        this.f24032 = 0;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40291;
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C16471.getDefaultInstance();
    }

    @Override // l.AbstractC5307, l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C16471.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C16471 build() {
        C16471 c16471BuildPartial = buildPartial();
        if (c16471BuildPartial.isInitialized()) {
            return c16471BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c16471BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C16471 buildPartial() {
        int i;
        C16471 c16471 = new C16471(this);
        int i2 = this.f24036;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c16471.f53416 = this.f24030;
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                c16471.f53421 = this.f24034;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c16471.f53417 = this.f24033;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c16471.f53419 = this.f24031;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c16471.f53420 = this.f24035;
                i |= 16;
            }
            if ((i2 & 32) != 0) {
                c16471.f53418 = this.f24032;
                i |= 32;
            }
            c16471.f53423 = i | c16471.f53423;
        }
        onBuilt();
        return c16471;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C16471) {
            m19969((C16471) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C16471) {
            m19969((C16471) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7301 m19969(C16471 c16471) {
        if (c16471 == C16471.getDefaultInstance()) {
            return this;
        }
        if (c16471.m39071()) {
            m19972(c16471.m39074());
        }
        if (c16471.m39076()) {
            EnumC4539 enumC4539M39079 = c16471.m39079();
            enumC4539M39079.getClass();
            this.f24036 |= 2;
            this.f24034 = enumC4539M39079.getNumber();
            onChanged();
        }
        if (c16471.m39069()) {
            m19970(c16471.m39077());
        }
        if (c16471.m39072()) {
            EnumC24677 enumC24677M39068 = c16471.m39068();
            enumC24677M39068.getClass();
            this.f24036 |= 8;
            this.f24031 = enumC24677M39068.getNumber();
            onChanged();
        }
        if (c16471.m39078()) {
            m19973(c16471.m39073());
        }
        if (c16471.m39070()) {
            EnumC19455 enumC19455M39075 = c16471.m39075();
            enumC19455M39075.getClass();
            this.f24036 |= 32;
            this.f24032 = enumC19455M39075.getNumber();
            onChanged();
        }
        m15943((AbstractC11272) c16471);
        mo2317mergeUnknownFields(c16471.getUnknownFields());
        onChanged();
        return this;
    }

    @Override // l.AbstractC5307, l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return m15945();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19971(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            int iMo11882 = abstractC3660.mo11882();
                            if (EnumC10504.m26958(iMo11882) == null) {
                                mergeUnknownVarintField(1, iMo11882);
                            } else {
                                this.f24030 = iMo11882;
                                this.f24036 |= 1;
                            }
                        } else if (iMo11876 == 16) {
                            int iMo11883 = abstractC3660.mo11882();
                            if (EnumC4539.m14271(iMo11883) == null) {
                                mergeUnknownVarintField(2, iMo11883);
                            } else {
                                this.f24034 = iMo11883;
                                this.f24036 |= 2;
                            }
                        } else if (iMo11876 == 24) {
                            int iMo11884 = abstractC3660.mo11882();
                            if (EnumC1556.m5486(iMo11884) == null) {
                                mergeUnknownVarintField(3, iMo11884);
                            } else {
                                this.f24033 = iMo11884;
                                this.f24036 |= 4;
                            }
                        } else if (iMo11876 == 32) {
                            int iMo11885 = abstractC3660.mo11882();
                            if (EnumC24677.m55019(iMo11885) == null) {
                                mergeUnknownVarintField(4, iMo11885);
                            } else {
                                this.f24031 = iMo11885;
                                this.f24036 |= 8;
                            }
                        } else if (iMo11876 == 40) {
                            int iMo11886 = abstractC3660.mo11882();
                            if (EnumC12742.m31553(iMo11886) == null) {
                                mergeUnknownVarintField(5, iMo11886);
                            } else {
                                this.f24035 = iMo11886;
                                this.f24036 |= 16;
                            }
                        } else if (iMo11876 == 48) {
                            int iMo11887 = abstractC3660.mo11882();
                            if (EnumC19455.m44962(iMo11887) == null) {
                                mergeUnknownVarintField(6, iMo11887);
                            } else {
                                this.f24032 = iMo11887;
                                this.f24036 |= 32;
                            }
                        } else if (!parseUnknownField(abstractC3660, c24215, iMo11876)) {
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19972(EnumC10504 enumC10504) {
        enumC10504.getClass();
        this.f24036 |= 1;
        this.f24030 = enumC10504.getNumber();
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19970(EnumC1556 enumC1556) {
        enumC1556.getClass();
        this.f24036 |= 4;
        this.f24033 = enumC1556.getNumber();
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m19973(EnumC12742 enumC12742) {
        enumC12742.getClass();
        this.f24036 |= 16;
        this.f24035 = enumC12742.getNumber();
        onChanged();
    }
}
