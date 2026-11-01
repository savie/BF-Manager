package l;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: l.ۤ֨ۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: G1H1 */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9954 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public boolean f34017;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean f34018;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f34019;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final ViewGroup f34020;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final View f34021;

    public RunnableC9954(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f34019 = true;
        this.f34020 = viewGroup;
        this.f34021 = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f34019 = true;
        if (this.f34017) {
            return !this.f34018;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f34017 = true;
            ViewTreeObserverOnPreDrawListenerC22337.m49503(this.f34020, this);
        }
        return true;
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f34019 = true;
        if (this.f34017) {
            return !this.f34018;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f34017 = true;
            ViewTreeObserverOnPreDrawListenerC22337.m49503(this.f34020, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f34017;
        ViewGroup viewGroup = this.f34020;
        if (!z && this.f34019) {
            this.f34019 = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.f34021);
            this.f34018 = true;
        }
    }
}
