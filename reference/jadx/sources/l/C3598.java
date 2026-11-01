package l;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: renamed from: l.ۘ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes2.dex */
public final class C3598 extends AbstractC22650 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ObjectAnimator f13236;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f13237;

    public C3598(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        C6421 c6421 = new C6421(animationDrawable, z);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        objectAnimatorOfInt.setAutoCancel(true);
        objectAnimatorOfInt.setDuration(c6421.m17601());
        objectAnimatorOfInt.setInterpolator(c6421);
        this.f13237 = z2;
        this.f13236 = objectAnimatorOfInt;
    }

    @Override // l.AbstractC22650
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo10674() {
        return this.f13237;
    }

    @Override // l.AbstractC22650
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo10675() {
        this.f13236.start();
    }

    @Override // l.AbstractC22650
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo10676() {
        this.f13236.reverse();
    }

    @Override // l.AbstractC22650
    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final void mo10673() {
        this.f13236.cancel();
    }
}
