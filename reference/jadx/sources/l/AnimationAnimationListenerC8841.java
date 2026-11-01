package l;

import android.view.animation.Animation;

/* JADX INFO: renamed from: l.ۡۧܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 85MM */
/* JADX INFO: loaded from: classes3.dex */
public final class AnimationAnimationListenerC8841 implements Animation.AnimationListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6018 f30378;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC8841(C6018 c6018) {
        this.f30378 = c6018;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        InterfaceC16602 interfaceC16602;
        C6018 c6018 = this.f30378;
        if (c6018.f20479) {
            c6018.f20475.setAlpha(255);
            c6018.f20475.start();
            if (c6018.f20472 && (interfaceC16602 = c6018.f20473) != null) {
                interfaceC16602.mo2119();
            }
            c6018.f20487 = c6018.f20462.getTop();
            return;
        }
        c6018.m16338();
    }
}
