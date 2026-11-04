package l;

import android.view.View;

/* JADX INFO: renamed from: l.۫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I67T */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC13297 implements Runnable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3602 f42450;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f42451;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f42452;

    public RunnableC13297(C3602 c3602, View view, View view2) {
        this.f42450 = c3602;
        this.f42451 = view;
        this.f42452 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3602.m11669(this.f42450.f12340, this.f42451, this.f42452);
    }
}
