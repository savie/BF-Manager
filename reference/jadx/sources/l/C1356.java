package l;

/* JADX INFO: renamed from: l.֨ᩳܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBFE */
/* JADX INFO: loaded from: classes3.dex */
public final class C1356 extends AbstractC5568 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public AbstractC17216 f4837;

    public C1356(AbstractC17216 abstractC17216, C19738 c19738) {
        super(abstractC17216.m40437(), c19738);
        this.f4837 = abstractC17216;
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void mo4995(AbstractC21976 abstractC21976) {
        C0063 c0063M40438 = this.f4837.m40438();
        C0063 c0063M49712 = abstractC21976.m49712(c0063M40438);
        if (c0063M49712 != c0063M40438) {
            this.f4837 = this.f4837.mo7778(m16508(), c0063M49712);
            m16506().m45470().m55729(this, c0063M40438);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4985(int i, C20946 c20946) {
        C0063 c0063M40438 = this.f4837.m40438();
        int size = c0063M40438.size();
        C0063 c0063 = new C0063(size);
        int i2 = 0;
        while (i2 < size) {
            c0063.m31604(i2, i2 == i ? c20946 : c0063M40438.m31619get(i2));
            i2++;
        }
        c0063.mo15005();
        C20946 c20946M31619get = c0063M40438.m31619get(i);
        if (c20946M31619get.m47903() != c20946.m47903()) {
            m16506().m45470().m55732(this, c20946M31619get, c20946);
        }
        this.f4837 = this.f4837.mo7778(m16508(), c0063);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4986(C0063 c0063) {
        if (this.f4837.m40438().size() != c0063.size()) {
            throw new RuntimeException("Sources counts don't match");
        }
        this.f4837 = this.f4837.mo7778(m16508(), c0063);
    }

    @Override // l.AbstractC5568
    public final Object clone() {
        return (C1356) super.clone();
    }

    @Override // l.AbstractC5568
    public final AbstractC5568 clone() {
        return (C1356) super.clone();
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C0063 mo4992() {
        return this.f4837.m40438();
    }

    @Override // l.InterfaceC6052
    /* JADX INFO: renamed from: ۙ */
    public final String mo1843() {
        return mo4997().mo1843();
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final AbstractC17216 mo4997() {
        return this.f4837.mo7778(m16508(), this.f4837.m40438());
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public final boolean mo4983() {
        C18708 c18708M40434 = this.f4837.m40434();
        if (c18708M40434.m43508() == 1) {
            boolean z = C2847.m9356() && mo4991() != null;
            int iM43509 = c18708M40434.m43509();
            if (iM43509 == 2 || iM43509 == 5 || iM43509 == 55) {
                return z;
            }
        }
        return true;
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C18708 mo4988() {
        return this.f4837.m40434();
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC17216 mo4993() {
        return this.f4837;
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20946 mo4991() {
        C20946 c20946M16508;
        if (this.f4837.m40434().m43509() == 54) {
            c20946M16508 = this.f4837.m40438().m31619get(0);
        } else {
            c20946M16508 = m16508();
        }
        if (c20946M16508 == null || c20946M16508.m47896() == null) {
            return null;
        }
        return c20946M16508;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m4984() {
        C0063 c0063M40438 = this.f4837.m40438();
        this.f4837 = this.f4837.mo40436();
        m16506().m45470().m55729(this, c0063M40438);
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo4990() {
        return this.f4837.m40434().m43509() == 2;
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean mo4994() {
        return this.f4837.m40434().m43509() == 4;
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean mo4996() {
        return this.f4837.m40439();
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo4987(InterfaceC13025 interfaceC13025) {
        if (mo4990()) {
            interfaceC13025.mo6341(this);
        } else {
            interfaceC13025.mo6343(this);
        }
    }

    @Override // l.AbstractC5568
    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public final boolean mo4989() {
        return mo4990();
    }
}
