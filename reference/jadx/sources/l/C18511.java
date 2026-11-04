package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ܿᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C18511 extends Animation {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60199;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2849 f60200;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f60201;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f60202;

    public C18511(C2849 c2849, int i, int i2, float f) {
        this.f60200 = c2849;
        this.f60199 = i;
        this.f60201 = i2;
        this.f60202 = f;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f60199;
        int i2 = this.f60201;
        int i3 = (int) (f * (i - i2));
        C2849 c2849 = this.f60200;
        C2849.m9369(c2849.f9412, i2 + i3);
        if (c2849.f9405) {
            c2849.f9412.setY(this.f60202 - c2849.f9412.getHeight());
            C2849.m9360(c2849);
        }
    }
}
