package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ᩴܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18876 extends Animation {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f61117;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61118;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12527 f61119;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f61120;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f61121;

    public C18876(C12527 c12527, int i, int i2, float f, float f2) {
        this.f61119 = c12527;
        this.f61118 = i;
        this.f61120 = i2;
        this.f61121 = f;
        this.f61117 = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f61118;
        int i2 = this.f61120;
        C12527 c12527 = this.f61119;
        C12527.m31116(c12527.f41904, ((int) (f * (i - i2))) + i2);
        if (c12527.m31123()) {
            c12527.f41904.setX(this.f61121);
            c12527.f41918.setX(0.0f);
            c12527.f41946.setX(0.0f);
        } else {
            c12527.f41904.setX(this.f61117 - c12527.f41904.getWidth());
            c12527.f41918.setX(c12527.f41904.getWidth() - i2);
            c12527.f41946.setX(c12527.f41904.getWidth() - i);
        }
    }
}
