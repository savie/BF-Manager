package l;

/* JADX INFO: renamed from: l.ۢܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9676 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public Object f32619;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f32620;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f32621;

    public /* synthetic */ C9676(int i) {
        this();
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0584 mo2777clear() {
        m24611();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC3967 mo2777clear() {
        m24611();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC6977 mo2777clear() {
        m24611();
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC22500 mo2777clear() {
        m24611();
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m24612(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m24612(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m24612(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m24612(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46296;
        c6956.m18696(C3324.class, C9676.class);
        return c6956;
    }

    public C9676() {
        this.f32619 = "";
    }

    public C9676(InterfaceC6790 interfaceC6790, int i) {
        super(interfaceC6790);
        this.f32619 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24611() {
        super.mo2777clear();
        this.f32620 = 0;
        this.f32619 = "";
        this.f32621 = false;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46307;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C3324.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C3324.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C3324 c3324BuildPartial = buildPartial();
        if (c3324BuildPartial.isInitialized()) {
            return c3324BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c3324BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C3324 c3324BuildPartial = buildPartial();
        if (c3324BuildPartial.isInitialized()) {
            return c3324BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c3324BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C3324 buildPartial() {
        int i = 0;
        C3324 c3324 = new C3324(this, 0);
        int i2 = this.f32620;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c3324.f12311 = this.f32619;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c3324.f12312 = this.f32621;
                i |= 2;
            }
            c3324.f12310 = i | c3324.f12310;
        }
        onBuilt();
        return c3324;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C3324) {
            m24613((C3324) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C3324) {
            m24613((C3324) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24613(C3324 c3324) {
        if (c3324 == C3324.getDefaultInstance()) {
            return;
        }
        if (c3324.m9855()) {
            this.f32619 = c3324.f12311;
            this.f32620 |= 1;
            onChanged();
        }
        if (c3324.m9853()) {
            this.f32621 = c3324.m9854();
            this.f32620 |= 2;
            onChanged();
        }
        mo2781mergeUnknownFields(c3324.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m24612(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 10) {
                            this.f32619 = abstractC3262.mo6050();
                            this.f32620 |= 1;
                        } else if (iMo6048 == 16) {
                            this.f32621 = abstractC3262.mo6028();
                            this.f32620 |= 2;
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
        int i = this.f32620;
        return ((i & 1) == 0 || (i & 2) == 0) ? false : true;
    }
}
