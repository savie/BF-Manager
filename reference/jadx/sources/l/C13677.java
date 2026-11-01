package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ܰ۟ܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: S8GQ */
/* JADX INFO: loaded from: classes3.dex */
public final class C13677 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C3797 f45093;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7409 f45094;

    public C13677(C3797 c3797, C7409 c7409) {
        this.f45093 = c3797;
        this.f45094 = c7409;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f45093.m11047(3);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3797 c3797 = this.f45093;
        c3797.m11047(1);
        if (c3797.f13701) {
            this.f45094.post(c3797.f13678);
            c3797.f13701 = false;
        }
    }
}
