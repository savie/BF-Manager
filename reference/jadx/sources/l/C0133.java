package l;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: l.֡ۖ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N3PE */
/* JADX INFO: loaded from: classes2.dex */
public final class C0133 extends Animatable2.AnimationCallback {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC7591 f1096;

    public C0133(AbstractC7591 abstractC7591) {
        this.f1096 = abstractC7591;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        this.f1096.onAnimationStart(drawable);
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        this.f1096.onAnimationEnd(drawable);
    }
}
