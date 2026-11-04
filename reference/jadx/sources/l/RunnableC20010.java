package l;

import android.view.View;

/* JADX INFO: renamed from: l.ᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes5.dex */
public final class RunnableC20010 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3602 f64292;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f64293;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f64294;

    public RunnableC20010(C3602 c3602, View view, View view2) {
        this.f64292 = c3602;
        this.f64293 = view;
        this.f64294 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3602.m11669(this.f64292.f12313, this.f64293, this.f64294);
    }
}
