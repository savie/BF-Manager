package l;

/* JADX INFO: renamed from: l.ۛ᩸ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: RBFE */
/* JADX INFO: loaded from: classes3.dex */
public final class C6330 extends AbstractC22454 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public AbstractC15546 f21373;

    public C6330(AbstractC15546 abstractC15546, C11871 c11871) {
        super(abstractC15546.m37185(), c11871);
        this.f21373 = abstractC15546;
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo17427(AbstractC12568 abstractC12568) {
        C0727 c0727M37186 = this.f21373.m37186();
        C0727 c0727M31288 = abstractC12568.m31288(c0727M37186);
        if (c0727M31288 != c0727M37186) {
            this.f21373 = this.f21373.mo6698(m49955(), c0727M31288);
            m49949().m29609().m11673(this, c0727M37186);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17418(int i, C16251 c16251) {
        C0727 c0727M37186 = this.f21373.m37186();
        int size = c0727M37186.size();
        C0727 c0727 = new C0727(size);
        int i2 = 0;
        while (i2 < size) {
            c0727.m15261(i2, i2 == i ? c16251 : c0727M37186.m15275get(i2));
            i2++;
        }
        c0727.mo9637();
        C16251 c16251M15275get = c0727M37186.m15275get(i);
        if (c16251M15275get.m38400() != c16251.m38400()) {
            m49949().m29609().m11678(this, c16251M15275get, c16251);
        }
        this.f21373 = this.f21373.mo6698(m49955(), c0727);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17419(C0727 c0727) {
        if (this.f21373.m37186().size() != c0727.size()) {
            throw new RuntimeException("Sources counts don't match");
        }
        this.f21373 = this.f21373.mo6698(m49955(), c0727);
    }

    @Override // l.AbstractC22454
    public final Object clone() {
        return (C6330) super.clone();
    }

    @Override // l.AbstractC22454
    public final AbstractC22454 clone() {
        return (C6330) super.clone();
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final C0727 mo17429() {
        return this.f21373.m37186();
    }

    @Override // l.InterfaceC19653
    /* JADX INFO: renamed from: ۙ */
    public final String mo2376() {
        return mo17421().mo2376();
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final AbstractC15546 mo17421() {
        return this.f21373.mo6698(m49955(), this.f21373.m37186());
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final boolean mo17422() {
        C12723 c12723M37181 = this.f21373.m37181();
        if (c12723M37181.m31577() == 1) {
            boolean z = C23970.m52817() && mo17432() != null;
            int iM31572 = c12723M37181.m31572();
            if (iM31572 == 2 || iM31572 == 5 || iM31572 == 55) {
                return z;
            }
        }
        return true;
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final C12723 mo17426() {
        return this.f21373.m37181();
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final AbstractC15546 mo17428() {
        return this.f21373;
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C16251 mo17432() {
        C16251 c16251M49955;
        if (this.f21373.m37181().m31572() == 54) {
            c16251M49955 = this.f21373.m37186().m15275get(0);
        } else {
            c16251M49955 = m49955();
        }
        if (c16251M49955 == null || c16251M49955.m38386() == null) {
            return null;
        }
        return c16251M49955;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m17431() {
        C0727 c0727M37186 = this.f21373.m37186();
        this.f21373 = this.f21373.mo26774();
        m49949().m29609().m11673(this, c0727M37186);
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean mo17423() {
        return this.f21373.m37181().m31572() == 2;
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final boolean mo17430() {
        return this.f21373.m37181().m31572() == 4;
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean mo17425() {
        return this.f21373.m37184();
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo17420(InterfaceC5520 interfaceC5520) {
        if (mo17423()) {
            interfaceC5520.mo4612(this);
        } else {
            interfaceC5520.mo4614(this);
        }
    }

    @Override // l.AbstractC22454
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean mo17424() {
        return mo17423();
    }
}
