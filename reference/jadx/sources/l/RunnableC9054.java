package l;

/* JADX INFO: renamed from: l.ۡᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D14B */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9054 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final int f30884;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C0690 f30885;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2557 f30886;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C20342 f30887;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final C11897 f30888;

    public RunnableC9054(C11897 c11897, InterfaceC2557 interfaceC2557, int i, C0690 c0690, C20342 c20342) {
        this.f30888 = c11897;
        this.f30886 = interfaceC2557;
        this.f30884 = i;
        this.f30885 = c0690;
        this.f30887 = c20342;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            final C14600 c14600Mo7925 = C3971.f14739.mo7925((AbstractC11462) null, this.f30886, this.f30884);
            C16737.m39273(new Runnable() { // from class: l.᩵ᩳ᩹
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC9054.m23385(this.f63058, c14600Mo7925);
                }
            });
        } catch (RuntimeException unused) {
            C0585.m2785(this.f30888, this.f30887);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m23385(RunnableC9054 runnableC9054, C14600 c14600) {
        C11897 c11897 = runnableC9054.f30888;
        C20342 c20342 = runnableC9054.f30887;
        C11072 c11072M2783 = C0585.m2783(c11897, c20342, runnableC9054.f30885, c14600);
        if (c11072M2783 == null || !c20342.m45905().equals(c11072M2783.getTag())) {
            return;
        }
        c11072M2783.m27921(c14600);
        c11072M2783.setTag(null);
    }
}
