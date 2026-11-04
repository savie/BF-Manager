package l;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: l.᩷ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: R9NW */
/* JADX INFO: loaded from: classes.dex */
public final class C21877 extends C10688 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final WindowInsetsAnimation f69710;

    public C21877(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f69710 = windowInsetsAnimation;
    }

    @Override // l.C10688
    /* JADX INFO: renamed from: ۤ */
    public final int mo27237() {
        return this.f69710.getTypeMask();
    }

    @Override // l.C10688
    /* JADX INFO: renamed from: ۙ */
    public final long mo27235() {
        return this.f69710.getDurationMillis();
    }

    @Override // l.C10688
    /* JADX INFO: renamed from: ۙ */
    public final void mo27236(float f) {
        this.f69710.setFraction(f);
    }

    @Override // l.C10688
    /* JADX INFO: renamed from: ᩷ */
    public final float mo27238() {
        return this.f69710.getInterpolatedFraction();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m49567(View view, AbstractC7749 abstractC7749) {
        view.setWindowInsetsAnimationCallback(new C4723(abstractC7749));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C13275 m49568(WindowInsetsAnimation.Bounds bounds) {
        return C13275.m32820(bounds.getLowerBound());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13275 m49566(WindowInsetsAnimation.Bounds bounds) {
        return C13275.m32820(bounds.getUpperBound());
    }
}
