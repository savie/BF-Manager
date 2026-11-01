package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ᩳۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C17964 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8793 f57457;

    public C17964(ViewOnClickListenerC8793 viewOnClickListenerC8793) {
        this.f57457 = viewOnClickListenerC8793;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f57457;
        viewOnClickListenerC8793.f30253.setVisibility(8);
        viewOnClickListenerC8793.f30262 = null;
    }
}
