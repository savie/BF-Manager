package l;

/* JADX INFO: renamed from: l.ۗۨ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: A8GL */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC3400 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f11059;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20554 f11060;

    public RunnableC3400(C20554 c20554) {
        this.f11060 = c20554;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m11139(float f, float f2, boolean z) {
        if (this.f11059) {
            return;
        }
        this.f11059 = true;
        this.f11060.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11059 = false;
        int i = C20554.f65795;
        this.f11060.getClass();
    }
}
