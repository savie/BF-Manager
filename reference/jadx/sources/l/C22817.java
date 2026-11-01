package l;

import android.animation.Animator;
import android.widget.TextView;

/* JADX INFO: renamed from: l.᩺ۜۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: U8VQ */
/* JADX INFO: loaded from: classes.dex */
public final class C22817 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ TextView f74233;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C22817(TextView textView) {
        this.f74233 = textView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TextView textView = this.f74233;
        textView.setText("");
        textView.setAlpha(1.0f);
    }
}
