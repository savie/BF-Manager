package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.᩺ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes.dex */
public final class C24479 extends Animation {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f79441;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f79442;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2849 f79443;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f79444;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f79445;

    public C24479(C2849 c2849, int i, int i2, float f, float f2) {
        this.f79443 = c2849;
        this.f79442 = i;
        this.f79441 = i2;
        this.f79445 = f;
        this.f79444 = f2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f79442;
        int i2 = this.f79441;
        C2849 c2849 = this.f79443;
        C2849.m9394(c2849.f9412, ((int) (f * (i - i2))) + i2);
        if (c2849.m9377()) {
            c2849.f9412.setX(this.f79445);
            c2849.f9381.setX(0.0f);
            c2849.f9374.setX(0.0f);
        } else {
            c2849.f9412.setX(this.f79444 - c2849.f9412.getWidth());
            c2849.f9381.setX(c2849.f9412.getWidth() - i2);
            c2849.f9374.setX(c2849.f9412.getWidth() - i);
        }
    }
}
