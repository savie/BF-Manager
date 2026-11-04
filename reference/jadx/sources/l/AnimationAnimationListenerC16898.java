package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: l.ܺܳۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes4.dex */
public final class AnimationAnimationListenerC16898 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12423 f55257;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C20981 f55258;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f55259;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f55260;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public AnimationAnimationListenerC16898(View view, ViewGroup viewGroup, C12423 c12423, C20981 c20981) {
        this.f55258 = c20981;
        this.f55259 = viewGroup;
        this.f55260 = view;
        this.f55257 = c12423;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (AbstractC3191.m10427(2)) {
            C17359.toString(this.f55258);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f55259.post(new RunnableC25104(this));
        if (AbstractC3191.m10427(2)) {
            C17359.toString(this.f55258);
        }
    }
}
