package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.᩶ۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes4.dex */
public final class C20130 extends Animation {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6018 f65365;

    public C20130(C6018 c6018) {
        this.f65365 = c6018;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C6018 c6018 = this.f65365;
        c6018.getClass();
        int iAbs = c6018.f20481 - Math.abs(c6018.f20459);
        int i = c6018.f20456;
        c6018.m16339((i + ((int) ((iAbs - i) * f))) - c6018.f20462.getTop());
        c6018.f20475.m21440(1.0f - f);
    }
}
