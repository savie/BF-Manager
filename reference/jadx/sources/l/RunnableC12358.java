package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ۨ۫ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1H1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC12358 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final ViewGroup f39688;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public boolean f39689;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean f39690;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public boolean f39691;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f39692;

    public RunnableC12358(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f39690 = true;
        this.f39688 = viewGroup;
        this.f39692 = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f39690 = true;
        if (this.f39691) {
            return !this.f39689;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f39691 = true;
            ViewTreeObserverOnPreDrawListenerC12794.m31683(this.f39688, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f39690 = true;
        if (this.f39691) {
            return !this.f39689;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f39691 = true;
            ViewTreeObserverOnPreDrawListenerC12794.m31683(this.f39688, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f39691;
        ViewGroup viewGroup = this.f39688;
        if (!z && this.f39690) {
            this.f39690 = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.f39692);
            this.f39689 = true;
        }
    }
}
