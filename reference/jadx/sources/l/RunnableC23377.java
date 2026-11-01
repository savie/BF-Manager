package l;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: l.᩻֫, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC23377 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ValueAnimator f75728;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5259 f75729;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f75730;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12088 f75731;

    public RunnableC23377(View view, C5259 c5259, C12088 c12088, ValueAnimator valueAnimator) {
        this.f75730 = view;
        this.f75729 = c5259;
        this.f75731 = c12088;
        this.f75728 = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1503.m5194(this.f75730, this.f75729, this.f75731);
        this.f75728.start();
    }
}
