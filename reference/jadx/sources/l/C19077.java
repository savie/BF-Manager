package l;

/* JADX INFO: renamed from: l.ᩴ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19077 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f61649;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f61650;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f61651;

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C19077(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m43849();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m43849();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m43849();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m43849();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m43850(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m43850(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m43850(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m43850(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46269;
        c6956.m18696(C8494.class, C19077.class);
        return c6956;
    }

    public C19077() {
        this.f61651 = 0;
        this.f61649 = "";
    }

    public C19077(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f61651 = 0;
        this.f61649 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43849() {
        super.mo2777clear();
        this.f61650 = 0;
        this.f61651 = 0;
        this.f61649 = "";
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46301;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C8494.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C8494.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C8494 c8494BuildPartial = buildPartial();
        if (c8494BuildPartial.isInitialized()) {
            return c8494BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c8494BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C8494 c8494BuildPartial = buildPartial();
        if (c8494BuildPartial.isInitialized()) {
            return c8494BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c8494BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C8494 buildPartial() {
        int i = 0;
        C8494 c8494 = new C8494(this, 0);
        int i2 = this.f61650;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c8494.f29440 = this.f61651;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c8494.f29439 = this.f61649;
                i |= 2;
            }
            c8494.f29438 = i | c8494.f29438;
        }
        onBuilt();
        return c8494;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C8494) {
            m43851((C8494) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C8494) {
            m43851((C8494) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43851(C8494 c8494) {
        if (c8494 == C8494.getDefaultInstance()) {
            return;
        }
        if (c8494.m22197()) {
            EnumC12167 enumC12167M22198 = c8494.m22198();
            enumC12167M22198.getClass();
            this.f61650 |= 1;
            this.f61651 = enumC12167M22198.getNumber();
            onChanged();
        }
        if (c8494.m22199()) {
            this.f61649 = c8494.f29439;
            this.f61650 |= 2;
            onChanged();
        }
        mo2781mergeUnknownFields(c8494.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m43850(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 18) {
                            this.f61649 = abstractC3262.mo6050();
                            this.f61650 |= 2;
                        } else if (iMo6048 == 24) {
                            int iMo6037 = abstractC3262.mo6037();
                            if (EnumC12167.m30252(iMo6037) == null) {
                                mergeUnknownVarintField(3, iMo6037);
                            } else {
                                this.f61651 = iMo6037;
                                this.f61650 |= 1;
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
}
