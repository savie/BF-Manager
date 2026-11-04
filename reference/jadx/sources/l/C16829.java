package l;

import android.animation.TimeInterpolator;
import android.graphics.drawable.AnimationDrawable;

/* JADX INFO: renamed from: l.ܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: Y22J */
/* JADX INFO: loaded from: classes4.dex */
public final class C16829 implements TimeInterpolator {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f54285;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f54286;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f54287;

    public C16829(AnimationDrawable animationDrawable, boolean z) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        this.f54287 = numberOfFrames;
        int[] iArr = this.f54285;
        if (iArr == null || iArr.length < numberOfFrames) {
            this.f54285 = new int[numberOfFrames];
        }
        int[] iArr2 = this.f54285;
        int i = 0;
        for (int i2 = 0; i2 < numberOfFrames; i2++) {
            int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
            iArr2[i2] = duration;
            i += duration;
        }
        this.f54286 = i;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39745() {
        return this.f54286;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i;
        int i2;
        int i3 = (int) ((f * this.f54286) + 0.5f);
        int i4 = 0;
        while (true) {
            i = this.f54287;
            if (i4 >= i || i3 < (i2 = this.f54285[i4])) {
                break;
            }
            i3 -= i2;
            i4++;
        }
        return (i4 / i) + (i4 < i ? i3 / this.f54286 : 0.0f);
    }
}
