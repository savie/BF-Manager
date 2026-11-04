package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ۚ֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes2.dex */
public final class C5310 extends Animation {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3072 f18687;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = 1.0f - f;
        C3072 c3072 = this.f18687;
        c3072.f9970.setScaleX(f2);
        c3072.f9970.setScaleY(f2);
    }

    public C5310(C3072 c3072) {
        this.f18687 = c3072;
    }
}
