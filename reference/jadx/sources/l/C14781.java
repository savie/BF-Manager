package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ܰᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes4.dex */
public final class C14781 extends Animation {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f48360;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2849 f48361;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f48362;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f48363;

    public C14781(C2849 c2849, float f, float f2, int i) {
        this.f48361 = c2849;
        this.f48363 = f;
        this.f48362 = f2;
        this.f48360 = i;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.f48363;
        float fM45884 = C19967.m45884(this.f48362, f2, f, f2);
        C2849 c2849 = this.f48361;
        c2849.f9371.setX(fM45884 + (c2849.m9377() ? 0.0f : c2849.f9412.getWidth() - this.f48360));
    }
}
