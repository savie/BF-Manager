package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.᩻ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes.dex */
public final class C25225 extends Animation {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f81479;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2849 f81480;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f81481;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f81482;

    public C25225(C2849 c2849, float f, float f2, int i) {
        this.f81480 = c2849;
        this.f81482 = f;
        this.f81481 = f2;
        this.f81479 = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f81482;
        float fM45884 = C19967.m45884(this.f81481, f2, f, f2);
        C2849 c2849 = this.f81480;
        c2849.f9371.setX(fM45884 + (c2849.m9377() ? 0.0f : c2849.f9412.getWidth() - this.f81479));
    }
}
