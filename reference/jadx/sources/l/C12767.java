package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.۫֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes4.dex */
public final class C12767 extends Animation {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3072 f40862;

    public C12767(C3072 c3072) {
        this.f40862 = c3072;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C3072 c3072 = this.f40862;
        c3072.f9970.setScaleX(f);
        c3072.f9970.setScaleY(f);
    }
}
