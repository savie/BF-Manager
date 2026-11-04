package l;

/* JADX INFO: renamed from: l.֡ۡܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: C1ZO */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0323 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C19714 f1759;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9271 f1760;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1761;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f1762;

    public RunnableC0323(C9271 c9271, C19714 c19714, int i, int i2) {
        this.f1760 = c9271;
        this.f1759 = c19714;
        this.f1761 = i;
        this.f1762 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C9271 c9271 = this.f1760;
        if (c9271.f30160 != this) {
            return;
        }
        c9271.f30160 = null;
        C7781 c7781 = c9271.f30162;
        int i = this.f1761;
        C19714 c19714 = this.f1759;
        if (c7781.m21168(i, c19714)) {
            C9271.m24464(c9271, c19714, this.f1762);
        }
    }
}
