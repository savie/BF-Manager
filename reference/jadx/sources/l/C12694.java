package l;

import android.animation.Animator;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: l.۫᩹ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1KV */
/* JADX INFO: loaded from: classes3.dex */
public final class C12694 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f42369;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f42370;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f42371;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ FloatingActionButton f42372;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C12694(FloatingActionButton floatingActionButton, FloatingActionButton floatingActionButton2, FloatingActionButton floatingActionButton3, FloatingActionButton floatingActionButton4) {
        this.f42370 = floatingActionButton;
        this.f42372 = floatingActionButton2;
        this.f42369 = floatingActionButton3;
        this.f42371 = floatingActionButton4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f42370.setVisibility(4);
        this.f42372.setVisibility(4);
        this.f42369.setVisibility(4);
        this.f42371.setVisibility(4);
    }
}
