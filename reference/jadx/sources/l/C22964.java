package l;

/* JADX INFO: renamed from: l.᩸ܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22964 extends AbstractC15001 implements InterfaceC9078 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f74592;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f74593;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f74594;

    @Override // l.AbstractC15001, l.InterfaceC9824
    public final boolean isInitialized() {
        return true;
    }

    public /* synthetic */ C22964(int i) {
        this();
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC0479 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m51822mergeFrom(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ AbstractC1225 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m51822mergeFrom(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC7588 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m51822mergeFrom(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC0479, l.AbstractC1225, l.InterfaceC7588
    public final /* bridge */ /* synthetic */ InterfaceC14299 mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        m51822mergeFrom(abstractC3660, c24215);
        return this;
    }

    @Override // l.AbstractC15001
    public final C7544 internalGetFieldAccessorTable() {
        C7544 c7544 = C12543.f40281;
        c7544.m20621(C19980.class, C22964.class);
        return c7544;
    }

    public C22964() {
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final AbstractC0479 mo2313clear() {
        super.mo2313clear();
        this.f74592 = 0;
        this.f74593 = 0;
        this.f74594 = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final InterfaceC7588 mo2313clear() {
        super.mo2313clear();
        this.f74592 = 0;
        this.f74593 = 0;
        this.f74594 = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final InterfaceC14299 mo2313clear() {
        super.mo2313clear();
        this.f74592 = 0;
        this.f74593 = 0;
        this.f74594 = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.AbstractC0479
    /* JADX INFO: renamed from: clear */
    public final AbstractC15001 mo2313clear() {
        super.mo2313clear();
        this.f74592 = 0;
        this.f74593 = 0;
        this.f74594 = 0;
        return this;
    }

    @Override // l.AbstractC15001, l.InterfaceC14299, l.InterfaceC9078
    public final C24478 getDescriptorForType() {
        return C12543.f40293;
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC18775 getDefaultInstanceForType() {
        return C19980.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC9824
    public final InterfaceC21013 getDefaultInstanceForType() {
        return C19980.getDefaultInstance();
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC18775 build() {
        C19980 c19980BuildPartial = buildPartial();
        if (c19980BuildPartial.isInitialized()) {
            return c19980BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c19980BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final InterfaceC21013 build() {
        C19980 c19980BuildPartial = buildPartial();
        if (c19980BuildPartial.isInitialized()) {
            return c19980BuildPartial;
        }
        throw AbstractC0479.m2311((InterfaceC21013) c19980BuildPartial);
    }

    @Override // l.AbstractC0479, l.InterfaceC7588
    public final C19980 buildPartial() {
        int i = 0;
        C19980 c19980 = new C19980(this, 0);
        int i2 = this.f74592;
        if (i2 != 0) {
            if ((i2 & 1) != 0) {
                c19980.f64197 = this.f74593;
                i = 1;
            }
            if ((i2 & 2) != 0) {
                c19980.f64200 = this.f74594;
                i |= 2;
            }
            c19980.f64198 = i | c19980.f64198;
        }
        onBuilt();
        return c19980;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final AbstractC0479 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C19980) {
            m51821((C19980) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    @Override // l.AbstractC0479, l.InterfaceC14299
    public final InterfaceC14299 mergeFrom(InterfaceC21013 interfaceC21013) {
        if (interfaceC21013 instanceof C19980) {
            m51821((C19980) interfaceC21013);
            return this;
        }
        super.mergeFrom(interfaceC21013);
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m51821(C19980 c19980) {
        if (c19980 == C19980.getDefaultInstance()) {
            return;
        }
        if (c19980.m45908()) {
            this.f74593 = c19980.m45905();
            this.f74592 |= 1;
            onChanged();
        }
        if (c19980.m45907()) {
            this.f74594 = c19980.m45906();
            this.f74592 |= 2;
            onChanged();
        }
        mo2317mergeUnknownFields(c19980.getUnknownFields());
        onChanged();
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public final void m51822mergeFrom(AbstractC3660 abstractC3660, C24215 c24215) {
        c24215.getClass();
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iMo11876 = abstractC3660.mo11876();
                    if (iMo11876 != 0) {
                        if (iMo11876 == 8) {
                            this.f74593 = abstractC3660.mo11892();
                            this.f74592 |= 1;
                        } else if (iMo11876 == 16) {
                            this.f74594 = abstractC3660.mo11892();
                            this.f74592 |= 2;
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
