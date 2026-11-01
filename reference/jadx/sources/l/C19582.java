package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.᩵ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C19582 extends Animation {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f62905;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12527 f62906;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f62907;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f62908;

    public C19582(C12527 c12527, float f, float f2, int i) {
        this.f62906 = c12527;
        this.f62908 = f;
        this.f62905 = f2;
        this.f62907 = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f62908;
        float fM1792 = C0280.m1792(this.f62905, f2, f, f2);
        C12527 c12527 = this.f62906;
        c12527.f41913.setX(fM1792 + (c12527.m31123() ? 0.0f : c12527.f41904.getWidth() - this.f62907));
    }
}
