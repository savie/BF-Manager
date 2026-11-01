package l;

/* JADX INFO: renamed from: l.᩷ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D14B */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21047 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C20342 f68563;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f68564;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11897 f68565;

    public RunnableC21047(C11897 c11897, AbstractC20745 abstractC20745, C20342 c20342) {
        this.f68565 = c11897;
        this.f68564 = abstractC20745;
        this.f68563 = c20342;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C10465 c10465;
        C20342 c20342 = this.f68563;
        C11897 c11897 = this.f68565;
        AbstractC20745 abstractC20745 = this.f68564;
        try {
            C6794 c6794 = abstractC20745.mo33975() ? new C6794(abstractC20745) : null;
            if (c6794 == null) {
                C0690 c0690 = C0690.f2873;
                c10465 = new C10465(c0690, c0690.f2943);
            } else {
                C3971 c3971 = C3971.f14739;
                C0690 c0690Mo7924 = c3971.mo7924(c6794);
                int iMo7926 = c3971.mo7926(c6794);
                if (iMo7926 != 0) {
                    c10465 = new C10465(c6794, c0690Mo7924, iMo7926);
                } else {
                    c10465 = new C10465(c0690Mo7924, c0690Mo7924.f2943);
                }
            }
            if (c10465.m26442()) {
                if (C0585.m2788(c11897, c20342)) {
                    C16109.f52090.submit(new RunnableC9054(this.f68565, c10465.f35765, c10465.f35766, c10465.f35764, c20342));
                    return;
                }
                return;
            }
            C16737.m39273(new Runnable() { // from class: l.۟ᩳ᩹
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC21047.m47461(this.f25231, c10465);
                }
            });
        } catch (RuntimeException unused) {
            C0585.m2785(c11897, c20342);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m47461(RunnableC21047 runnableC21047, C10465 c10465) {
        C11897 c11897 = runnableC21047.f68565;
        C20342 c20342 = runnableC21047.f68563;
        C11072 c11072M2783 = C0585.m2783(c11897, c20342, c10465.f35764, c10465.f35767);
        if (c11072M2783 == null || !c20342.m45905().equals(c11072M2783.getTag())) {
            return;
        }
        c11072M2783.m27921(c10465.f35767);
        c11072M2783.setTag(null);
    }
}
