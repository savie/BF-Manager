package l;

/* JADX INFO: renamed from: l.ܺۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15695 extends AbstractC0584 implements InterfaceC18266 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f50951;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public int f50952;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f50953;

    @Override // l.AbstractC0584, l.InterfaceC15445
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C15695(int i) {
        this();
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC3967 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m37396mergeFrom(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC6977 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m37396mergeFrom(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ AbstractC21607 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m37396mergeFrom(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC3967, l.AbstractC21607, l.InterfaceC6977
    public final /* bridge */ /* synthetic */ InterfaceC22500 mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        m37396mergeFrom(abstractC3262, c2701);
        return this;
    }

    @Override // l.AbstractC0584
    public final C6956 internalGetFieldAccessorTable() {
        C6956 c6956 = C14097.f46322;
        c6956.m18696(C19928.class, C15695.class);
        return c6956;
    }

    public C15695() {
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final AbstractC0584 mo2777clear() {
        super.mo2777clear();
        this.f50952 = 0;
        this.f50951 = 0;
        this.f50953 = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final AbstractC3967 mo2777clear() {
        super.mo2777clear();
        this.f50952 = 0;
        this.f50951 = 0;
        this.f50953 = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final InterfaceC6977 mo2777clear() {
        super.mo2777clear();
        this.f50952 = 0;
        this.f50951 = 0;
        this.f50953 = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.AbstractC3967
    /* JADX INFO: renamed from: clear */
    public final InterfaceC22500 mo2777clear() {
        super.mo2777clear();
        this.f50952 = 0;
        this.f50951 = 0;
        this.f50953 = 0;
        return this;
    }

    @Override // l.AbstractC0584, l.InterfaceC22500, l.InterfaceC18266
    public final C2806 getDescriptorForType() {
        return C14097.f46277;
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC1332 getDefaultInstanceForType() {
        return C19928.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC15445, l.InterfaceC18266
    public final InterfaceC23206 getDefaultInstanceForType() {
        return C19928.getDefaultInstance();
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC1332 build() {
        C19928 c19928BuildPartial = buildPartial();
        if (c19928BuildPartial.isInitialized()) {
            return c19928BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c19928BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final InterfaceC23206 build() {
        C19928 c19928BuildPartial = buildPartial();
        if (c19928BuildPartial.isInitialized()) {
            return c19928BuildPartial;
        }
        throw AbstractC3967.m11452((InterfaceC1332) c19928BuildPartial);
    }

    @Override // l.AbstractC3967, l.InterfaceC6977, l.InterfaceC22500
    public final C19928 buildPartial() {
        int i = 0;
        C19928 c19928 = new C19928(this, 0);
        int i2 = this.f50952;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c19928.f63862 = this.f50951;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c19928.f63863 = this.f50953;
                i |= 2;
            }
            c19928.f63861 = i | c19928.f63861;
        }
        onBuilt();
        return c19928;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final AbstractC3967 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C19928) {
            m37395((C19928) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    @Override // l.AbstractC3967, l.InterfaceC22500
    public final InterfaceC22500 mergeFrom(InterfaceC1332 interfaceC1332) {
        if (interfaceC1332 instanceof C19928) {
            m37395((C19928) interfaceC1332);
            return this;
        }
        super.mergeFrom(interfaceC1332);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m37395(C19928 c19928) {
        if (c19928 == C19928.getDefaultInstance()) {
            return;
        }
        if (c19928.m45228()) {
            this.f50951 = c19928.m45225();
            this.f50952 |= 1;
            onChanged();
        }
        if (c19928.m45226()) {
            this.f50953 = c19928.m45227();
            this.f50952 |= 2;
            onChanged();
        }
        mo2781mergeUnknownFields(c19928.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final void m37396mergeFrom(AbstractC3262 abstractC3262, C2701 c2701) {
        c2701.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo6048 = abstractC3262.mo6048();
                    if (iMo6048 != 0) {
                        if (iMo6048 == 8) {
                            this.f50951 = abstractC3262.mo6040();
                            this.f50952 |= 1;
                        } else if (iMo6048 == 16) {
                            this.f50953 = abstractC3262.mo6040();
                            this.f50952 |= 2;
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
