package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.᩸ۢۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C5GL */
/* JADX INFO: loaded from: classes4.dex */
public final class C21492 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ViewOnClickListenerC8793 f69841;

    public C21492(ViewOnClickListenerC8793 viewOnClickListenerC8793) {
        this.f69841 = viewOnClickListenerC8793;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewOnClickListenerC8793 viewOnClickListenerC8793 = this.f69841;
        viewOnClickListenerC8793.f30243.setVisibility(0);
        viewOnClickListenerC8793.f30262 = null;
    }
}
