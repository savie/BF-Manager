package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.֫֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes2.dex */
public final class C1581 extends Animation {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3072 f5476;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5477;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5478;

    public C1581(C3072 c3072, int i, int i2) {
        this.f5476 = c3072;
        this.f5477 = i;
        this.f5478 = i2;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C22464 c22464 = this.f5476.f9979;
        int i = this.f5477;
        c22464.setAlpha((int) (((this.f5478 - i) * f) + i));
    }
}
