package l;

/* JADX INFO: renamed from: l.ܽ᩶ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D14B */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC17827 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C12606 f58486;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final C20613 f58487;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 f58488;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final int f58489;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C9622 f58490;

    public RunnableC17827(C9622 c9622, InterfaceC2386 interfaceC2386, int i, C20613 c20613, C12606 c12606) {
        this.f58490 = c9622;
        this.f58488 = interfaceC2386;
        this.f58489 = i;
        this.f58487 = c20613;
        this.f58486 = c12606;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            final C11983 c11983Mo2785 = C13461.f42854.mo2785((AbstractC7364) null, this.f58488, this.f58489);
            C21576.m49068(new Runnable() { // from class: l.ܺ᩶ܳ
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC17827.m41670(this.f55768, c11983Mo2785);
                }
            });
        } catch (RuntimeException unused) {
            C6641.m18578(this.f58490, this.f58486);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m41670(RunnableC17827 runnableC17827, C11983 c11983) {
        C9622 c9622 = runnableC17827.f58490;
        C12606 c12606 = runnableC17827.f58486;
        C3034 c3034M18576 = C6641.m18576(c9622, c12606, runnableC17827.f58487, c11983);
        if (c3034M18576 == null || !c12606.m31318().equals(c3034M18576.getTag())) {
            return;
        }
        c3034M18576.m9864(c11983);
        c3034M18576.setTag(null);
    }
}
