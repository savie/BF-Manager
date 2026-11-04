package l;

import android.media.metrics.PlaybackErrorEvent;

/* JADX INFO: renamed from: l.ᩴܰ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: T8WR */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC19877 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f63946;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63947;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f63948;

    public /* synthetic */ RunnableC19877(int i, Object obj, Object obj2) {
        this.f63946 = i;
        this.f63948 = obj;
        this.f63947 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f63946) {
            case 0:
                ViewOnClickListenerC15401.m36880((ViewOnClickListenerC15401) this.f63948, (C22861) this.f63947);
                break;
            default:
                ((C23722) this.f63948).f76905.reportPlaybackErrorEvent((PlaybackErrorEvent) this.f63947);
                break;
        }
    }
}
