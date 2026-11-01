package l;

import android.media.metrics.PlaybackErrorEvent;

/* JADX INFO: renamed from: l.ۛܿۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: 48U6 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6195 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21074;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f21075;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f21076;

    public /* synthetic */ RunnableC6195(int i, Object obj, Object obj2) {
        this.f21075 = i;
        this.f21076 = obj;
        this.f21074 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f21075) {
            case 0:
                ((C14663) this.f21076).f47952.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f21074);
                break;
            default:
                C13842.m33679((C13842) this.f21076, (C12629) this.f21074);
                break;
        }
    }
}
