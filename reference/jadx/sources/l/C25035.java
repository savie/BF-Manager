package l;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: renamed from: l.᩻۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes.dex */
public final class C25035 extends AbstractC17575 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ObjectAnimator f81002;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f81003;

    public C25035(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C16829 c16829 = new C16829(animationDrawable, z);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c16829.m39745());
        objectAnimatorOfInt.setInterpolator(c16829);
        this.f81003 = z2;
        this.f81002 = objectAnimatorOfInt;
    }

    @Override // l.AbstractC17575
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo41239() {
        return this.f81003;
    }

    @Override // l.AbstractC17575
    /* JADX INFO: renamed from: ۤ */
    public final void mo16628() {
        this.f81002.start();
    }

    @Override // l.AbstractC17575
    /* JADX INFO: renamed from: ᩷ */
    public final void mo41240() {
        this.f81002.reverse();
    }

    @Override // l.AbstractC17575
    /* JADX INFO: renamed from: ᩸ */
    public final void mo16629() {
        this.f81002.cancel();
    }
}
