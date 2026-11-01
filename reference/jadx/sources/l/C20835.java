package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.᩷ۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes4.dex */
public final class C20835 extends Animation {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67709;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6018 f67710;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f67711;

    public C20835(C6018 c6018, int i, int i2) {
        this.f67710 = c6018;
        this.f67709 = i;
        this.f67711 = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C8135 c8135 = this.f67710.f20475;
        int i = this.f67709;
        c8135.setAlpha((int) (((this.f67711 - i) * f) + i));
    }
}
