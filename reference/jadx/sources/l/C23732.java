package l;

/* JADX INFO: renamed from: l.᩹ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23732 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f76926;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public Object f76927;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f76928;

    public /* synthetic */ C23732(int i) {
        this();
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC0479 mo2313clear() {
        m52997();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC7588 mo2313clear() {
        m52997();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ InterfaceC14299 mo2313clear() {
        m52997();
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final /* bridge */ /* synthetic */ AbstractC15001 mo2313clear() {
        m52997();
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m52999(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m52999(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m52999(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m52999(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40265;
        c7544.m20621(C3594.class, C23732.class);
        return c7544;
    }

    public C23732() {
        this.f76927 = "";
    }

    public C23732(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f76927 = "";
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52997() {
        super.mo2313clear();
        this.f76926 = 0;
        this.f76927 = "";
        this.f76928 = false;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40248;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C3594.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C3594.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C3594 c3594BuildPartial = buildPartial();
        if (c3594BuildPartial.isInitialized()) {
            return c3594BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c3594BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C3594 c3594BuildPartial = buildPartial();
        if (c3594BuildPartial.isInitialized()) {
            return c3594BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c3594BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C3594 buildPartial() {
        int i = 0;
        C3594 c3594 = new C3594(this, 0);
        int i2 = this.f76926;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c3594.f12291 = this.f76927;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c3594.f12294 = this.f76928;
                i |= 2;
            }
            c3594.f12292 = i | c3594.f12292;
        }
        onBuilt();
        return c3594;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C3594) {
            m52998((C3594) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C3594) {
            m52998((C3594) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52998(C3594 c3594) {
        if (c3594 == C3594.getDefaultInstance()) {
            return;
        }
        if (c3594.m11654()) {
            this.f76927 = c3594.f12291;
            this.f76926 |= 1;
            onChanged();
        }
        if (c3594.m11653()) {
            this.f76928 = c3594.m11652();
            this.f76926 |= 2;
            onChanged();
        }
        mo2317mergeUnknownFields(c3594.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m52999(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 10) {
                            this.f76927 = abstractC3660.mo11890();
                            this.f76926 |= 1;
                        } else if (iMo11876 == 16) {
                            this.f76928 = abstractC3660.mo11894();
                            this.f76926 |= 2;
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

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        int i = this.f76926;
        return ((i & 1) == 0 || (i & 2) == 0) ? false : true;
    }
}
