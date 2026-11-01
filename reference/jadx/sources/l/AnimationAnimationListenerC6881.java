package l;

import android.view.animation.Animation;

/* JADX INFO: renamed from: l.ۜܽۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9CC */
/* JADX INFO: loaded from: classes2.dex */
public final class AnimationAnimationListenerC6881 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12527 f23180;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public AnimationAnimationListenerC6881(C12527 c12527) {
        this.f23180 = c12527;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        C12527 c12527 = this.f23180;
        c12527.f41913.setEnabled(false);
        c12527.f41918.setVisibility(0);
        c12527.f41946.setVisibility(0);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f23180.f41904.post(new Runnable() { // from class: l.ۘܽۚ
            @Override // java.lang.Runnable
            public final void run() {
                C12527 c12527 = this.f14959.f23180;
                c12527.m31089();
                c12527.m31113();
            }
        });
    }
}
