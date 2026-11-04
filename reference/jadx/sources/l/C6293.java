package l;

/* JADX INFO: renamed from: l.ۛۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U940 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6293 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f21358;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f21359;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f21360;

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C6293(int i) {
        this();
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m17979(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m17979(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m17979(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m17979(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C21209.f67698;
        c7544.m20621(C14495.class, C6293.class);
        return c7544;
    }

    public C6293() {
        this.f21359 = 0;
    }

    public C6293(InterfaceC7937 interfaceC7937, int i) {
        super(interfaceC7937);
        this.f21359 = 0;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final AbstractC0479 mo2313clear() {
        super.mo2313clear();
        this.f21358 = 0;
        this.f21360 = false;
        this.f21359 = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final InterfaceC7588 mo2313clear() {
        super.mo2313clear();
        this.f21358 = 0;
        this.f21360 = false;
        this.f21359 = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final InterfaceC14299 mo2313clear() {
        super.mo2313clear();
        this.f21358 = 0;
        this.f21360 = false;
        this.f21359 = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final AbstractC15001 mo2313clear() {
        super.mo2313clear();
        this.f21358 = 0;
        this.f21360 = false;
        this.f21359 = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C21209.f67696;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C14495.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C14495.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C14495 c14495BuildPartial = buildPartial();
        if (c14495BuildPartial.isInitialized()) {
            return c14495BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c14495BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C14495 c14495BuildPartial = buildPartial();
        if (c14495BuildPartial.isInitialized()) {
            return c14495BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c14495BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C14495 buildPartial() {
        int i = 0;
        C14495 c14495 = new C14495(this, 0);
        int i2 = this.f21358;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c14495.f45614 = this.f21360;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c14495.f45611 = this.f21359;
                i |= 2;
            }
            c14495.f45612 = i | c14495.f45612;
        }
        onBuilt();
        return c14495;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C14495) {
            m17981((C14495) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C14495) {
            m17981((C14495) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17981(C14495 c14495) {
        if (c14495 == C14495.getDefaultInstance()) {
            return;
        }
        if (c14495.m35011()) {
            this.f21360 = c14495.m35010();
            this.f21358 |= 1;
            onChanged();
        }
        if (c14495.m35012()) {
            m17980(c14495.m35009());
        }
        mo2317mergeUnknownFields(c14495.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17979(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            this.f21360 = abstractC3660.mo11894();
                            this.f21358 |= 1;
                        } else if (iMo11876 == 16) {
                            int iMo11882 = abstractC3660.mo11882();
                            if (EnumC4055.m13048(iMo11882) == null) {
                                mergeUnknownVarintField(2, iMo11882);
                            } else {
                                this.f21359 = iMo11882;
                                this.f21358 |= 2;
                            }
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17980(EnumC4055 enumC4055) {
        enumC4055.getClass();
        this.f21358 |= 2;
        this.f21359 = enumC4055.getNumber();
        onChanged();
    }
}
