package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: renamed from: l.ۧ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 86WH */
/* JADX INFO: loaded from: classes3.dex */
public final class C10862 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23562 f36937;

    public C10862(C23562 c23562) {
        this.f36937 = c23562;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C23562 c23562 = this.f36937;
        if (c23562.f76288 != animator) {
            return;
        }
        c23562.f76288 = null;
        c23562.m51944();
    }
}
