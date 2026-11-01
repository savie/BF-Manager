package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.۠ܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class C8293 extends Animation {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f28804;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12527 f28805;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28806;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f28807;

    public C8293(C12527 c12527, int i, int i2, float f) {
        this.f28805 = c12527;
        this.f28806 = i;
        this.f28807 = i2;
        this.f28804 = f;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f28806;
        int i2 = this.f28807;
        int i3 = (int) (f * (i - i2));
        C12527 c12527 = this.f28805;
        C12527.m31098(c12527.f41904, i3 + i2);
        if (c12527.f41924) {
            c12527.f41904.setY(this.f28804 - (c12527.f41904.getHeight() - i2));
            C12527.m31109(c12527);
        }
    }
}
