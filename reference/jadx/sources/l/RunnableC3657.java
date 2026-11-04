package l;

/* JADX INFO: renamed from: l.ۗ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D14B */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3657 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f12517;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final C12606 f12518;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9622 f12519;

    public RunnableC3657(C9622 c9622, AbstractC22044 abstractC22044, C12606 c12606) {
        this.f12519 = c9622;
        this.f12517 = abstractC22044;
        this.f12518 = c12606;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C16335 c16335;
        C12606 c12606 = this.f12518;
        C9622 c9622 = this.f12519;
        AbstractC22044 abstractC22044 = this.f12517;
        try {
            C6004 c6004 = abstractC22044.mo2934() ? new C6004(abstractC22044) : null;
            if (c6004 == null) {
                C20613 c20613 = C20613.f66045;
                c16335 = new C16335(c20613, c20613.f66114);
            } else {
                C13461 c13461 = C13461.f42854;
                C20613 c20613Mo3626 = c13461.mo3626(c6004);
                int iMo2786 = c13461.mo2786(c6004);
                if (iMo2786 != 0) {
                    c16335 = new C16335(c6004, c20613Mo3626, iMo2786);
                } else {
                    c16335 = new C16335(c20613Mo3626, c20613Mo3626.f66114);
                }
            }
            if (c16335.m38828()) {
                if (C6641.m18581(c9622, c12606)) {
                    C20811.f66645.submit(new RunnableC17827(this.f12519, c16335.f53053, c16335.f53054, c16335.f53056, c12606));
                    return;
                }
                return;
            }
            C21576.m49068(new Runnable() { // from class: l.᩹᩶ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC3657.m11852(this.f77080, c16335);
                }
            });
        } catch (RuntimeException unused) {
            C6641.m18578(c9622, c12606);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m11852(RunnableC3657 runnableC3657, C16335 c16335) {
        C9622 c9622 = runnableC3657.f12519;
        C12606 c12606 = runnableC3657.f12518;
        C3034 c3034M18576 = C6641.m18576(c9622, c12606, c16335.f53056, c16335.f53055);
        if (c3034M18576 == null || !c12606.m31318().equals(c3034M18576.getTag())) {
            return;
        }
        c3034M18576.m9864(c16335.f53055);
        c3034M18576.setTag(null);
    }
}
