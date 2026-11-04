package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ۘᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class C4341 extends Animation {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15708;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2849 f15709;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ float f15710;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15711;

    public C4341(C2849 c2849, int i, int i2, float f) {
        this.f15709 = c2849;
        this.f15708 = i;
        this.f15711 = i2;
        this.f15710 = f;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.f15708;
        int i2 = this.f15711;
        int i3 = (int) (f * (i - i2));
        C2849 c2849 = this.f15709;
        C2849.m9369(c2849.f9412, i3 + i2);
        if (c2849.f9405) {
            c2849.f9412.setY(this.f15710 - (c2849.f9412.getHeight() - i2));
            C2849.m9360(c2849);
        }
    }
}
