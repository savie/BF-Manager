package l;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: renamed from: l.ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes2.dex */
public final class C6421 implements TimeInterpolator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f21756;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f21757;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f21758;

    public C6421(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.f21758 = numberOfFrames;
        int[] iArr = this.f21756;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.f21756 = new int[numberOfFrames];
        }
        int[] iArr2 = this.f21756;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr2[i2] = duration;
            i += duration;
        }
        this.f21757 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m17601() {
        return this.f21757;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i;
        int i2;
        int i3 = (int) ((f * this.f21757) + 0.5f);
        int i4 = 0;
        while (true) {
            i = this.f21758;
            if (i4 >= i || i3 < (i2 = this.f21756[i4])) {
                break;
            }
            i3 -= i2;
            i4++;
        }
        return (i4 / i) + (i4 < i ? i3 / this.f21757 : 0.0f);
    }
}
