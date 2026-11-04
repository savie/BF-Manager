package l;

/* JADX INFO: renamed from: l.ۖ֨ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8D1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2322 extends C13508 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public boolean f7495;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public AbstractC4053 f7496;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f7497;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public boolean f7498;

    public C2322() {
        super("Input");
        this.f7495 = false;
        this.f7497 = false;
        this.f7498 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m7824(C4930 c4930) {
        m49678(c4930, new C9033(this, false));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7827(C4930 c4930) {
        m49678(c4930, new C9033(this, true));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m7828(int i) {
        double[] dArrM20606 = m20606();
        boolean z = this.f7497;
        this.f7497 = false;
        if (this.f7498) {
            if (dArrM20606[i] >= 0.01d) {
                this.f7498 = false;
                return true;
            }
        } else if (dArrM20606[i] < 0.01d) {
            this.f7498 = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m7829() {
        return this.f7498;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final void m7825() {
        if (this.f7495) {
            AbstractC4053 abstractC4053M49680 = this.f7496;
            if (abstractC4053M49680 == null) {
                abstractC4053M49680 = m49680();
            }
            abstractC4053M49680.mo13041(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m7823(C2322 c2322, boolean z) {
        if (z) {
            AbstractC4053 abstractC4053M49680 = c2322.f7496;
            if (abstractC4053M49680 == null) {
                abstractC4053M49680 = c2322.m49680();
            }
            abstractC4053M49680.mo13041(true);
            c2322.f7497 = true;
        }
        c2322.m33181(z ? 1.0d : 0.0d);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m7826(AbstractC4053 abstractC4053) {
        this.f7496 = abstractC4053;
        this.f7495 = true;
        abstractC4053.mo13041(false);
    }
}
