package l;

import android.view.animation.Animation;

/* JADX INFO: renamed from: l.ܳ֨᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes4.dex */
public final class AnimationAnimationListenerC15004 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3072 f49014;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC15004(C3072 c3072) {
        this.f49014 = c3072;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        InterfaceC17242 interfaceC17242;
        C3072 c3072 = this.f49014;
        if (c3072.f9978) {
            c3072.f9979.setAlpha(255);
            c3072.f9979.start();
            if (c3072.f9964 && (interfaceC17242 = c3072.f9986) != null) {
                interfaceC17242.mo4897();
            }
            c3072.f9969 = c3072.f9970.getTop();
            return;
        }
        c3072.m10024();
    }
}
