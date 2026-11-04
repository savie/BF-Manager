package l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: l.֫ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X8B6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1744 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5950;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5951;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractActivityC17204 f5952;

    public /* synthetic */ RunnableC1744(AbstractActivityC17204 abstractActivityC17204, Object obj, int i) {
        this.f5950 = i;
        this.f5952 = abstractActivityC17204;
        this.f5951 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5950) {
            case 0:
                ActivityC15913.m37931((ActivityC15913) this.f5952, (AtomicBoolean) this.f5951);
                break;
            default:
                ActivityC7135.m19582((ActivityC7135) this.f5952, (C18322) this.f5951);
                break;
        }
    }
}
