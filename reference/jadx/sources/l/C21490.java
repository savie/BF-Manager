package l;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: l.᩸ۢۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes4.dex */
public final class C21490 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f69837;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f69838;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f69839;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C21490(FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, FloatingActionButton floatingActionButton3) {
        this.f69837 = floatingActionButton;
        this.f69839 = floatingActionButton2;
        this.f69838 = floatingActionButton3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f69837.setVisibility(4);
        this.f69839.setVisibility(4);
        this.f69838.setVisibility(4);
    }
}
