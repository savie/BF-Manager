package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ۤܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes3.dex */
public final class C10410 extends Animation {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35588;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12527 f35589;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f35590;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f35591;

    public C10410(C12527 c12527, int i, int i2, float f) {
        this.f35589 = c12527;
        this.f35590 = i;
        this.f35588 = i2;
        this.f35591 = f;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f35590;
        int i2 = this.f35588;
        int i3 = (int) (f * (i - i2));
        C12527 c12527 = this.f35589;
        C12527.m31098(c12527.f41904, i2 + i3);
        if (c12527.f41924) {
            c12527.f41904.setY(this.f35591 - c12527.f41904.getHeight());
            C12527.m31109(c12527);
        }
    }
}
