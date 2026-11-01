package l;

import android.media.metrics.TrackChangeEvent;

/* JADX INFO: renamed from: l.ۢۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964K */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC9395 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31828;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f31829;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f31830;

    public /* synthetic */ RunnableC9395(int i, Object obj, Object obj2) {
        this.f31829 = i;
        this.f31830 = obj;
        this.f31828 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31829) {
            case 0:
                DialogInterfaceOnClickListenerC8128.m21406((DialogInterfaceOnClickListenerC8128) this.f31830, (C17485) this.f31828);
                break;
            default:
                ((C14663) this.f31830).f47952.reportTrackChangeEvent((TrackChangeEvent) this.f31828);
                break;
        }
    }
}
