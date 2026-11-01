package l;

/* JADX INFO: renamed from: l.᩵ᩴᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: M8D1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19654 extends C7659 {

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public boolean f63104;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public AbstractC0998 f63105;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public boolean f63106;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public boolean f63107;

    public C19654() {
        super("Input");
        this.f63104 = false;
        this.f63106 = false;
        this.f63107 = true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m44782(C15879 c15879) {
        m38175(c15879, new C8365(this, false));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44785(C15879 c15879) {
        m38175(c15879, new C8365(this, true));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m44786(int i) {
        double[] dArrM36893 = m36893();
        boolean z = this.f63106;
        this.f63106 = false;
        if (this.f63107) {
            if (dArrM36893[i] >= 0.01d) {
                this.f63107 = false;
                return true;
            }
        } else if (dArrM36893[i] < 0.01d) {
            this.f63107 = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m44787() {
        return this.f63107;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m44783() {
        if (this.f63104) {
            AbstractC0998 abstractC0998M38176 = this.f63105;
            if (abstractC0998M38176 == null) {
                abstractC0998M38176 = m38176();
            }
            abstractC0998M38176.mo3820(false);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m44781(C19654 c19654, boolean z) {
        if (z) {
            AbstractC0998 abstractC0998M38176 = c19654.f63105;
            if (abstractC0998M38176 == null) {
                abstractC0998M38176 = c19654.m38176();
            }
            abstractC0998M38176.mo3820(true);
            c19654.f63106 = true;
        }
        c19654.m20216(z ? 1.0d : 0.0d);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m44784(AbstractC0998 abstractC0998) {
        this.f63105 = abstractC0998;
        this.f63104 = true;
        abstractC0998.mo3820(false);
    }
}
