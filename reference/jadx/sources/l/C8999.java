package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ۡܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8999 extends Animation {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f30784;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30785;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12527 f30786;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f30787;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f30788;

    public C8999(C12527 c12527, int i, int i2, float f, float f2) {
        this.f30786 = c12527;
        this.f30785 = i;
        this.f30787 = i2;
        this.f30788 = f;
        this.f30784 = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f30785;
        int i2 = this.f30787;
        C12527 c12527 = this.f30786;
        C12527.m31116(c12527.f41904, ((int) (f * (i - i2))) + i2);
        if (c12527.m31123()) {
            c12527.f41904.setX(this.f30788);
            c12527.f41918.setX(0.0f);
            c12527.f41946.setX(0.0f);
        } else {
            c12527.f41904.setX(this.f30784 - c12527.f41904.getWidth());
            c12527.f41918.setX(c12527.f41904.getWidth() - i);
            c12527.f41946.setX(c12527.f41904.getWidth() - i2);
        }
    }
}
