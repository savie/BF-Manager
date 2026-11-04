package l;

/* JADX INFO: renamed from: l.ܺܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16996 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f55534;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f55535;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f55536;

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C16996(int i) {
        this();
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m40053(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m40053(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m40053(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m40053(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40272;
        c7544.m20621(C17742.class, C16996.class);
        return c7544;
    }

    public C16996() {
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final AbstractC0479 mo2313clear() {
        super.mo2313clear();
        this.f55534 = 0;
        this.f55535 = 0;
        this.f55536 = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final InterfaceC7588 mo2313clear() {
        super.mo2313clear();
        this.f55534 = 0;
        this.f55535 = 0;
        this.f55536 = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final InterfaceC14299 mo2313clear() {
        super.mo2313clear();
        this.f55534 = 0;
        this.f55535 = 0;
        this.f55536 = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final AbstractC15001 mo2313clear() {
        super.mo2313clear();
        this.f55534 = 0;
        this.f55535 = 0;
        this.f55536 = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40250;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C17742.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C17742.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C17742 c17742BuildPartial = buildPartial();
        if (c17742BuildPartial.isInitialized()) {
            return c17742BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c17742BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C17742 c17742BuildPartial = buildPartial();
        if (c17742BuildPartial.isInitialized()) {
            return c17742BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c17742BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C17742 buildPartial() {
        int i = 0;
        C17742 c17742 = new C17742(this, 0);
        int i2 = this.f55534;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c17742.f58276 = this.f55535;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c17742.f58279 = this.f55536;
                i |= 2;
            }
            c17742.f58277 = i | c17742.f58277;
        }
        onBuilt();
        return c17742;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C17742) {
            m40054((C17742) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C17742) {
            m40054((C17742) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40054(C17742 c17742) {
        if (c17742 == C17742.getDefaultInstance()) {
            return;
        }
        if (c17742.m41552()) {
            this.f55535 = c17742.m41549();
            this.f55534 |= 1;
            onChanged();
        }
        if (c17742.m41551()) {
            this.f55536 = c17742.m41550();
            this.f55534 |= 2;
            onChanged();
        }
        mo2317mergeUnknownFields(c17742.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40053(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            this.f55535 = abstractC3660.mo11892();
                            this.f55534 |= 1;
                        } else if (iMo11876 == 16) {
                            this.f55536 = abstractC3660.mo11892();
                            this.f55534 |= 2;
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
