package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.۬ᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: J26J */
/* JADX INFO: loaded from: classes3.dex */
public final class C13287 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C6936 f44125;

    public C13287(C6936 c6936) {
        this.f44125 = c6936;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C6936 c6936 = this.f44125;
        c6936.f23341.setVisibility(8);
        c6936.f23341.setAlpha(1.0f);
    }
}
