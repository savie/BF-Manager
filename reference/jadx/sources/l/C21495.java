package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.᩶ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes.dex */
public final class C21495 extends Animation {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68711;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68712;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2849 f68713;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f68714;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f68715;

    public C21495(C2849 c2849, int i, int i2, float f, float f2) {
        this.f68713 = c2849;
        this.f68712 = i;
        this.f68711 = i2;
        this.f68715 = f;
        this.f68714 = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f68712;
        int i2 = this.f68711;
        C2849 c2849 = this.f68713;
        C2849.m9394(c2849.f9412, ((int) (f * (i - i2))) + i2);
        if (c2849.m9377()) {
            c2849.f9412.setX(this.f68715);
            c2849.f9381.setX(0.0f);
            c2849.f9374.setX(0.0f);
        } else {
            c2849.f9412.setX(this.f68714 - c2849.f9412.getWidth());
            c2849.f9381.setX(c2849.f9412.getWidth() - i);
            c2849.f9374.setX(c2849.f9412.getWidth() - i2);
        }
    }
}
