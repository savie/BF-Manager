package l;

/* JADX INFO: renamed from: l.ۚۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5473 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f19070;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f19071;

    public /* synthetic */ RunnableC5473(int i, Object obj) {
        this.f19070 = i;
        this.f19071 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f19070;
        Object obj = this.f19071;
        switch (i) {
            case 0:
                ((ActivityC15913) obj).m37902();
                break;
            default:
                C16281 c16281 = (C16281) obj;
                int i2 = ActivityC7135.f23493;
                if (c16281 != null) {
                    c16281.close();
                }
                break;
        }
    }
}
