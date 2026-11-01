package l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: l.۟֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 151S */
/* JADX INFO: loaded from: classes2.dex */
public final class C7148 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC15616 f23886;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ View f23887;

    public C7148(InterfaceC15616 interfaceC15616, View view) {
        this.f23886 = interfaceC15616;
        this.f23887 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f23886.onAnimationCancel();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f23886.onAnimationEnd();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f23886.mo12847();
    }
}
