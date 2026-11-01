package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: renamed from: l.ᩳ᩹ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: RB93 */
/* JADX INFO: loaded from: classes4.dex */
public final class AnimationAnimationListenerC18336 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f58492;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7753 f58493;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16386 f58494;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewGroup f58495;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public AnimationAnimationListenerC18336(View view, ViewGroup viewGroup, C7753 c7753, C16386 c16386) {
        this.f58494 = c16386;
        this.f58495 = viewGroup;
        this.f58492 = view;
        this.f58493 = c7753;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (AbstractC8894.m23060(2)) {
            C13638.toString(this.f58494);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f58495.post(new RunnableC21864(this));
        if (AbstractC8894.m23060(2)) {
            C13638.toString(this.f58494);
        }
    }
}
