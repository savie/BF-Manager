package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.۟ۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C7429 extends Animation {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6018 f24795;

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        float f2 = 1.0f - f;
        C6018 c6018 = this.f24795;
        c6018.f20462.setScaleX(f2);
        c6018.f20462.setScaleY(f2);
    }

    public C7429(C6018 c6018) {
        this.f24795 = c6018;
    }
}
