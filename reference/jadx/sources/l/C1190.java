package l;

import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: l.֨۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V5Y3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1190 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public float f4342;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f4344;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f4345;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public float f4346;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f4349;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int f4351;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public long f4348 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public long f4347 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f4343 = 0;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f4350 = 0;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final void m4385() {
        this.f4349 = 500;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final void m4387() {
        this.f4351 = 500;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m4382() {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f4348 = jCurrentAnimationTimeMillis;
        this.f4347 = -1L;
        this.f4343 = jCurrentAnimationTimeMillis;
        this.f4344 = 0.5f;
        this.f4350 = 0;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final void m4388() {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (int) (jCurrentAnimationTimeMillis - this.f4348);
        int i2 = this.f4351;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.f4345 = i;
        this.f4344 = m4381(jCurrentAnimationTimeMillis);
        this.f4347 = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m4389() {
        return this.f4347 > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f4347 + ((long) this.f4345);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m4381(long j) {
        long j2 = this.f4348;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f4347;
        if (j3 < 0 || j < j3) {
            return AbstractViewOnTouchListenerC2681.m8851((j - j2) / this.f4349, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f4344;
        return (f * AbstractViewOnTouchListenerC2681.m8851((j - j3) / this.f4345, 0.0f, 1.0f)) + (1.0f - f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4383() {
        if (this.f4343 == 0) {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float fM4381 = m4381(jCurrentAnimationTimeMillis);
        long j = jCurrentAnimationTimeMillis - this.f4343;
        this.f4343 = jCurrentAnimationTimeMillis;
        this.f4350 = (int) (j * ((fM4381 * 4.0f) + ((-4.0f) * fM4381 * fM4381)) * this.f4346);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4384(float f, float f2) {
        this.f4342 = f;
        this.f4346 = f2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final void m4386() {
        Math.abs(this.f4342);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int m4391() {
        float f = this.f4346;
        return (int) (f / Math.abs(f));
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m4390() {
        return this.f4350;
    }
}
