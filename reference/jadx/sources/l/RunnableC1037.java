package l;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: renamed from: l.֨۠, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC1037 implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f3751;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22623 f3752;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ValueAnimator f3753;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0291 f3754;

    public RunnableC1037(View view, C22623 c22623, C0291 c0291, ValueAnimator valueAnimator) {
        this.f3751 = view;
        this.f3752 = c22623;
        this.f3754 = c0291;
        this.f3753 = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2528.m8437(this.f3751, this.f3752, this.f3754);
        this.f3753.start();
    }
}
