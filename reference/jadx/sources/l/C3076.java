package l;

/* JADX INFO: renamed from: l.ۗۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3076 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C15135 f11643;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public C15135 f11644;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f11645;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public C23539 f11646;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C23539 f11647;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f11648;

    public /* synthetic */ C3076(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m9258();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m9258();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m9258();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m9258();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m9259(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m9259(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m9259(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m9259(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46265;
        c6956.m18696(C4965.class, C3076.class);
        return c6956;
    }

    public C3076() {
        this.f11648 = 0;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m9256();
            m9257();
        }
    }

    public C3076(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f11648 = 0;
        if (AbstractC18245.alwaysUseFieldBuilders) {
            m9256();
            m9257();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9258() {
        super.mo2777clear();
        this.f11645 = 0;
        this.f11648 = 0;
        this.f11647 = null;
        C15135 c15135 = this.f11644;
        if (c15135 != null) {
            c15135.m36296();
            this.f11644 = null;
        }
        this.f11646 = null;
        C15135 c15136 = this.f11643;
        if (c15136 != null) {
            c15136.m36296();
            this.f11643 = null;
        }
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46316;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C4965.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C4965.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C4965 c4965BuildPartial = buildPartial();
        if (c4965BuildPartial.isInitialized()) {
            return c4965BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c4965BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C4965 c4965BuildPartial = buildPartial();
        if (c4965BuildPartial.isInitialized()) {
            return c4965BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c4965BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C4965 buildPartial() {
        C23539 c23539;
        C23539 c235310;
        int i = 0;
        C4965 c4965 = new C4965(this, 0);
        int i2 = this.f11645;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c4965.f17334 = this.f11648;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                C15135 c15135 = this.f11644;
                if (c15135 == null) {
                    c235310 = this.f11647;
                } else {
                    c235310 = (C23539) c15135.m36297();
                }
                c4965.f17331 = c235310;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                C15135 c15136 = this.f11643;
                if (c15136 == null) {
                    c23539 = this.f11646;
                } else {
                    c23539 = (C23539) c15136.m36297();
                }
                c4965.f17330 = c23539;
                i |= 4;
            }
            c4965.f17332 = i | c4965.f17332;
        }
        onBuilt();
        return c4965;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C4965) {
            m9260((C4965) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C4965) {
            m9260((C4965) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9260(C4965 c4965) {
        C23539 c23539;
        C23539 c235310;
        if (c4965 == C4965.getDefaultInstance()) {
            return;
        }
        if (c4965.m13775()) {
            EnumC12167 enumC12167M13772 = c4965.m13772();
            enumC12167M13772.getClass();
            this.f11645 |= 1;
            this.f11648 = enumC12167M13772.getNumber();
            onChanged();
        }
        if (c4965.m13774()) {
            C23539 c23539M13771 = c4965.m13771();
            C15135 c15135 = this.f11644;
            if (c15135 == null) {
                if ((this.f11645 & 2) == 0 || (c235310 = this.f11647) == null || c235310 == C23539.getDefaultInstance()) {
                    this.f11647 = c23539M13771;
                } else {
                    this.f11645 |= 2;
                    onChanged();
                    ((C19305) m9256().m36293()).m44291(c23539M13771);
                }
            } else {
                c15135.m36294(c23539M13771);
            }
            if (this.f11647 != null) {
                this.f11645 |= 2;
                onChanged();
            }
        }
        if (c4965.m13773()) {
            C23539 c23539M13770 = c4965.m13770();
            C15135 c15136 = this.f11643;
            if (c15136 == null) {
                if ((this.f11645 & 4) == 0 || (c23539 = this.f11646) == null || c23539 == C23539.getDefaultInstance()) {
                    this.f11646 = c23539M13770;
                } else {
                    this.f11645 |= 4;
                    onChanged();
                    ((C19305) m9257().m36293()).m44291(c23539M13770);
                }
            } else {
                c15136.m36294(c23539M13770);
            }
            if (this.f11646 != null) {
                this.f11645 |= 4;
                onChanged();
            }
        }
        mo2781mergeUnknownFields(c4965.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m9259(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 24) {
                            int iMo6037 = abstractC3262.mo6037();
                            if (EnumC12167.m30252(iMo6037) == null) {
                                mergeUnknownVarintField(3, iMo6037);
                            } else {
                                this.f11648 = iMo6037;
                                this.f11645 |= 1;
                            }
                        } else if (iMo6048 == 34) {
                            abstractC3262.mo6027(m9256().m36293(), c2701);
                            this.f11645 |= 2;
                        } else if (iMo6048 == 42) {
                            abstractC3262.mo6027(m9257().m36293(), c2701);
                            this.f11645 |= 4;
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
        C23539 defaultInstance;
        C23539 defaultInstance2;
        if ((this.f11645 & 2) != 0) {
            C15135 c15135 = this.f11644;
            if (c15135 == null) {
                defaultInstance2 = this.f11647;
                if (defaultInstance2 == null) {
                    defaultInstance2 = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance2 = (C23539) c15135.m36295();
            }
            if (!defaultInstance2.isInitialized()) {
                return false;
            }
        }
        if ((this.f11645 & 4) == 0) {
            return true;
        }
        C15135 c15136 = this.f11643;
        if (c15136 == null) {
            defaultInstance = this.f11646;
            if (defaultInstance == null) {
                defaultInstance = C23539.getDefaultInstance();
            }
        } else {
            defaultInstance = (C23539) c15136.m36295();
        }
        return defaultInstance.isInitialized();
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private C15135 m9256() {
        C23539 defaultInstance;
        C15135 c15135 = this.f11644;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f11647;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            this.f11644 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f11647 = null;
        }
        return this.f11644;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    private C15135 m9257() {
        C23539 defaultInstance;
        C15135 c15135 = this.f11643;
        if (c15135 == null) {
            if (c15135 == null) {
                defaultInstance = this.f11646;
                if (defaultInstance == null) {
                    defaultInstance = C23539.getDefaultInstance();
                }
            } else {
                defaultInstance = (C23539) c15135.m36295();
            }
            this.f11643 = new C15135(defaultInstance, getParentForChildren(), isClean());
            this.f11646 = null;
        }
        return this.f11643;
    }
}
