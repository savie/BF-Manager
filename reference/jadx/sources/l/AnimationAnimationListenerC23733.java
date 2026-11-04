package l;

import android.view.animation.Animation;

/* JADX INFO: renamed from: l.᩹ᩳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC23733 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2849 f76929;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public AnimationAnimationListenerC23733(C2849 c2849) {
        this.f76929 = c2849;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        C2849 c2849 = this.f76929;
        c2849.f9371.setEnabled(false);
        c2849.f9381.setVisibility(0);
        c2849.f9374.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f76929.f9412.post(new Runnable() { // from class: l.ܶᩳᩴ
            @Override // java.lang.Runnable
            public final void run() {
                C2849 c2849 = this.f52866.f76929;
                c2849.m9398();
                c2849.m9380();
            }
        });
    }
}
