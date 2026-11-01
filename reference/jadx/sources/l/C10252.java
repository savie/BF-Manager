package l;

import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ۤۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes3.dex */
public final class C10252 extends Animation {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6018 f34966;

    public C10252(C6018 c6018) {
        this.f34966 = c6018;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        C6018 c6018 = this.f34966;
        c6018.f20462.setScaleX(f);
        c6018.f20462.setScaleY(f);
    }
}
