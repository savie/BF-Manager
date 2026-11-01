package l;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: l.ۨۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes4.dex */
public final class C11610 extends C2436 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final WindowInsetsAnimation f39010;

    public C11610(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f39010 = windowInsetsAnimation;
    }

    @Override // l.C2436
    /* JADX INFO: renamed from: ۨ */
    public final int mo7421() {
        return this.f39010.getTypeMask();
    }

    @Override // l.C2436
    /* JADX INFO: renamed from: ۙ */
    public final long mo7419() {
        return this.f39010.getDurationMillis();
    }

    @Override // l.C2436
    /* JADX INFO: renamed from: ۙ */
    public final void mo7420(float f) {
        this.f39010.setFraction(f);
    }

    @Override // l.C2436
    /* JADX INFO: renamed from: ܰ */
    public final float mo7422() {
        return this.f39010.getInterpolatedFraction();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28941(View view, AbstractC17026 abstractC17026) {
        view.setWindowInsetsAnimationCallback(new C13727(abstractC17026));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C13954 m28942(WindowInsetsAnimation.Bounds bounds) {
        return C13954.m33794(bounds.getLowerBound());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13954 m28940(WindowInsetsAnimation.Bounds bounds) {
        return C13954.m33794(bounds.getUpperBound());
    }
}
