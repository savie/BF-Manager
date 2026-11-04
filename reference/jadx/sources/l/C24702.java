package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.᩻֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes.dex */
public final class C24702 extends Animation {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3072 f79917;

    public C24702(C3072 c3072) {
        this.f79917 = c3072;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C3072 c3072 = this.f79917;
        c3072.getClass();
        int iAbs = c3072.f9984 - Math.abs(c3072.f9959);
        int i = c3072.f9968;
        c3072.m10025((i + ((int) ((iAbs - i) * f))) - c3072.f9970.getTop());
        c3072.f9979.m50653(1.0f - f);
    }
}
