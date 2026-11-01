package l;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.ۨ֫ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N3PE */
/* JADX INFO: loaded from: classes3.dex */
public final class C11394 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC2220 f38397;

    public C11394(AbstractC2220 abstractC2220) {
        this.f38397 = abstractC2220;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f38397.onAnimationStart(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f38397.onAnimationEnd(drawable);
    }
}
