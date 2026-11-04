package l;

import android.media.metrics.PlaybackMetrics;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳ۠۫, reason: contains not printable characters */
/* JADX INFO: compiled from: P1ZZ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC18945 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61436;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61437;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f61438;

    public /* synthetic */ RunnableC18945(int i, Object obj, Object obj2) {
        this.f61436 = i;
        this.f61438 = obj;
        this.f61437 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f61436;
        Object obj = this.f61437;
        Object obj2 = this.f61438;
        switch (i) {
            case 0:
                C9248 c9248 = (C9248) obj2;
                int i2 = C9248.f30101;
                c9248.m43868(R.string.MT_Protector);
                c9248.mo29447(((AbstractC22044) obj).getName());
                break;
            default:
                ((C23722) obj2).f76905.reportPlaybackMetrics((PlaybackMetrics) obj);
                break;
        }
    }
}
