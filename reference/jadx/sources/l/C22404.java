package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.᩹ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes.dex */
public final class C22404 extends Animation {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f73120;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12527 f73121;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f73122;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f73123;

    public C22404(C12527 c12527, float f, float f2, int i) {
        this.f73121 = c12527;
        this.f73123 = f;
        this.f73120 = f2;
        this.f73122 = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f73123;
        float fM1792 = C0280.m1792(this.f73120, f2, f, f2);
        C12527 c12527 = this.f73121;
        c12527.f41913.setX(fM1792 + (c12527.m31123() ? 0.0f : c12527.f41904.getWidth() - this.f73122));
    }
}
