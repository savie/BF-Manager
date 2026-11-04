package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.֡۬᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes2.dex */
public final class C0464 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7922 f2074;

    public C0464(C7922 c7922) {
        this.f2074 = c7922;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C7922 c7922 = this.f2074;
        if (c7922.f26330 != animator) {
            return;
        }
        c7922.f26330 = null;
        c7922.m21480();
    }
}
