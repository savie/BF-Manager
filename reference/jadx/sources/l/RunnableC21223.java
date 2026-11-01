package l;

/* JADX INFO: renamed from: l.᩸֡ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81UC */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC21223 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17695 f69137;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f69138;

    public RunnableC21223(C17695 c17695, float f) {
        this.f69137 = c17695;
        this.f69138 = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C19107 c19107 = this.f69137.f56191;
        if (c19107.f61728.isFinished()) {
            return;
        }
        boolean zComputeScrollOffset = c19107.f61728.computeScrollOffset();
        int iCeil = ((int) Math.ceil(c19107.f61728.getCurrY() * this.f69138)) - c19107.f61733;
        c19107.m43877(iCeil);
        if (iCeil != 0) {
            if (iCeil < 0) {
                if (c19107.f61733 <= (-c19107.f61714.m15433().m13572())) {
                    c19107.f61709.onAbsorb((int) (c19107.f61728.getCurrVelocity() / 1.2f));
                    c19107.invalidate();
                    return;
                }
            } else if (c19107.f61733 >= 0) {
                c19107.f61698.onAbsorb((int) (c19107.f61728.getCurrVelocity() / 1.2f));
                c19107.invalidate();
                return;
            }
        }
        if (zComputeScrollOffset) {
            c19107.post(this);
        }
    }
}
