package l;

/* JADX INFO: renamed from: l.ᩳܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19234 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f62218;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f62219;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f62220;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f62221;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public Object f62222;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public Object f62223;

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C19234(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m44563();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m44563();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m44563();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m44563();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m44564(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m44564(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m44564(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m44564(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40305;
        c7544.m20621(C10283.class, C19234.class);
        return c7544;
    }

    public C19234() {
        this.f62223 = "";
        this.f62222 = "";
    }

    public C19234(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f62223 = "";
        this.f62222 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44563() {
        super.mo2313clear();
        this.f62220 = 0;
        this.f62221 = 0;
        this.f62223 = "";
        this.f62222 = "";
        this.f62219 = false;
        this.f62218 = false;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40261;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C10283.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C10283.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C10283 c10283BuildPartial = buildPartial();
        if (c10283BuildPartial.isInitialized()) {
            return c10283BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c10283BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C10283 c10283BuildPartial = buildPartial();
        if (c10283BuildPartial.isInitialized()) {
            return c10283BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c10283BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C10283 buildPartial() {
        int i = 0;
        C10283 c10283 = new C10283(this, 0);
        int i2 = this.f62220;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c10283.f32839 = this.f62221;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c10283.f32845 = this.f62223;
                i |= 2;
            }
            if ((i2 & 4) != 0) {
                c10283.f32841 = this.f62222;
                i |= 4;
            }
            if ((i2 & 8) != 0) {
                c10283.f32844 = this.f62219;
                i |= 8;
            }
            if ((i2 & 16) != 0) {
                c10283.f32840 = this.f62218;
                i |= 16;
            }
            c10283.f32842 = i | c10283.f32842;
        }
        onBuilt();
        return c10283;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C10283) {
            m44565((C10283) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C10283) {
            m44565((C10283) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44565(C10283 c10283) {
        if (c10283 == C10283.getDefaultInstance()) {
            return;
        }
        if (c10283.m26511()) {
            this.f62221 = c10283.m26506();
            this.f62220 |= 1;
            onChanged();
        }
        if (c10283.m26510()) {
            this.f62223 = c10283.f32845;
            this.f62220 |= 2;
            onChanged();
        }
        if (c10283.hasType()) {
            this.f62222 = c10283.f32841;
            this.f62220 |= 4;
            onChanged();
        }
        if (c10283.m26512()) {
            this.f62219 = c10283.m26513();
            this.f62220 |= 8;
            onChanged();
        }
        if (c10283.m26509()) {
            this.f62218 = c10283.m26508();
            this.f62220 |= 16;
            onChanged();
        }
        mo2317mergeUnknownFields(c10283.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44564(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            this.f62221 = abstractC3660.mo11892();
                            this.f62220 |= 1;
                        } else if (iMo11876 == 18) {
                            this.f62223 = abstractC3660.mo11890();
                            this.f62220 |= 2;
                        } else if (iMo11876 == 26) {
                            this.f62222 = abstractC3660.mo11890();
                            this.f62220 |= 4;
                        } else if (iMo11876 == 40) {
                            this.f62219 = abstractC3660.mo11894();
                            this.f62220 |= 8;
                        } else if (iMo11876 == 48) {
                            this.f62218 = abstractC3660.mo11894();
                            this.f62220 |= 16;
                        } else if (!super.parseUnknownField(abstractC3660, c24215, iMo11876)) {
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
}
