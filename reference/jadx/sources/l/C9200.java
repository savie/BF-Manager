package l;

/* JADX INFO: renamed from: l.ۡ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9200 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f31276;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f31277;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f31278;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f31279;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f31280;

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C9200(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m23659();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m23659();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m23659();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m23659();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m23660(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m23660(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m23660(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m23660(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46272;
        c6956.m18696(C10611.class, C9200.class);
        return c6956;
    }

    public C9200() {
        this.f31279 = 0;
        this.f31276 = 0;
        this.f31280 = "";
        this.f31277 = 0;
    }

    public C9200(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f31279 = 0;
        this.f31276 = 0;
        this.f31280 = "";
        this.f31277 = 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23659() {
        super.mo2777clear();
        this.f31278 = 0;
        this.f31279 = 0;
        this.f31276 = 0;
        this.f31280 = "";
        this.f31277 = 0;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46289;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C10611.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C10611.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C10611 c10611BuildPartial = buildPartial();
        if (c10611BuildPartial.isInitialized()) {
            return c10611BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c10611BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C10611 c10611BuildPartial = buildPartial();
        if (c10611BuildPartial.isInitialized()) {
            return c10611BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c10611BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C10611 buildPartial() {
        int i = 0;
        C10611 c10611 = new C10611(this, 0);
        int i2 = this.f31278;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c10611.f36267 = this.f31279;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c10611.f36264 = this.f31276;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c10611.f36269 = this.f31280;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c10611.f36265 = this.f31277;
                i |= 8;
            }
            c10611.f36266 = i | c10611.f36266;
        }
        onBuilt();
        return c10611;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C10611) {
            m23661((C10611) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C10611) {
            m23661((C10611) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23661(C10611 c10611) {
        if (c10611 == C10611.getDefaultInstance()) {
            return;
        }
        if (c10611.m26787()) {
            EnumC12167 enumC12167M26784 = c10611.m26784();
            enumC12167M26784.getClass();
            this.f31278 |= 1;
            this.f31279 = enumC12167M26784.getNumber();
            onChanged();
        }
        if (c10611.m26789()) {
            EnumC12167 enumC12167M26783 = c10611.m26783();
            enumC12167M26783.getClass();
            this.f31278 |= 2;
            this.f31276 = enumC12167M26783.getNumber();
            onChanged();
        }
        if (c10611.m26786()) {
            this.f31280 = c10611.f36269;
            this.f31278 |= 4;
            onChanged();
        }
        if (c10611.m26788()) {
            EnumC12167 enumC12167M26790 = c10611.m26790();
            enumC12167M26790.getClass();
            this.f31278 |= 8;
            this.f31277 = enumC12167M26790.getNumber();
            onChanged();
        }
        mo2781mergeUnknownFields(c10611.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23660(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            int iMo6037 = abstractC3262.mo6037();
                            if (EnumC12167.m30252(iMo6037) == null) {
                                mergeUnknownVarintField(1, iMo6037);
                            } else {
                                this.f31279 = iMo6037;
                                this.f31278 |= 1;
                            }
                        } else if (iMo6048 == 16) {
                            int iMo6038 = abstractC3262.mo6037();
                            if (EnumC12167.m30252(iMo6038) == null) {
                                mergeUnknownVarintField(2, iMo6038);
                            } else {
                                this.f31276 = iMo6038;
                                this.f31278 |= 2;
                            }
                        } else if (iMo6048 == 26) {
                            this.f31280 = abstractC3262.mo6050();
                            this.f31278 |= 4;
                        } else if (iMo6048 == 32) {
                            int iMo6039 = abstractC3262.mo6037();
                            if (EnumC12167.m30252(iMo6039) == null) {
                                mergeUnknownVarintField(4, iMo6039);
                            } else {
                                this.f31277 = iMo6039;
                                this.f31278 |= 8;
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
