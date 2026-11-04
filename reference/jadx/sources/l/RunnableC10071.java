package l;

/* JADX INFO: renamed from: l.ۢۤ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10071 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C1123 f32295;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f32296;

    public RunnableC10071(C1123 c1123, float f) {
        this.f32295 = c1123;
        this.f32296 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8580 c8580 = this.f32295.f4184;
        if (c8580.f28042.isFinished()) {
            return;
        }
        boolean zComputeScrollOffset = c8580.f28042.computeScrollOffset();
        int iCeil = ((int) Math.ceil(c8580.f28042.getCurrY() * this.f32296)) - c8580.f28024;
        c8580.m23035(iCeil);
        if (iCeil != 0) {
            if (iCeil < 0) {
                if (c8580.f28024 <= (-c8580.f28020.m43268().m54888())) {
                    c8580.f28056.onAbsorb((int) (c8580.f28042.getCurrVelocity() / 1.2f));
                    c8580.invalidate();
                    return;
                }
            } else if (c8580.f28024 >= 0) {
                c8580.f28045.onAbsorb((int) (c8580.f28042.getCurrVelocity() / 1.2f));
                c8580.invalidate();
                return;
            }
        }
        if (zComputeScrollOffset) {
            c8580.post(this);
        }
    }
}
