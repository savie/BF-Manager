package l;

import android.view.animation.AnimationUtils;

/* JADX INFO: renamed from: l.֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: V5Y3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1544 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public int f6266;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public float f6267;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f6269;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public float f6270;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f6271;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public float f6272;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f6274 = Long.MIN_VALUE;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public long f6265 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public long f6268 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f6273 = 0;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final void m5327() {
        this.f6269 = 500;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final void m5320() {
        this.f6266 = 500;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m5322() {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f6274 = jCurrentAnimationTimeMillis;
        this.f6265 = -1L;
        this.f6268 = jCurrentAnimationTimeMillis;
        this.f6272 = 0.5f;
        this.f6273 = 0;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final void m5329() {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i = (int) (jCurrentAnimationTimeMillis - this.f6274);
        int i2 = this.f6266;
        if (i > i2) {
            i = i2;
        } else if (i < 0) {
            i = 0;
        }
        this.f6271 = i;
        this.f6272 = m5319(jCurrentAnimationTimeMillis);
        this.f6265 = jCurrentAnimationTimeMillis;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m5325() {
        return this.f6265 > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f6265 + ((long) this.f6271);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    private float m5319(long j) {
        long j2 = this.f6274;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f6265;
        if (j3 < 0 || j < j3) {
            return AbstractViewOnTouchListenerC2955.m8779((j - j2) / this.f6269, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f6272;
        return (f * AbstractViewOnTouchListenerC2955.m8779((j - j3) / this.f6271, 0.0f, 1.0f)) + (1.0f - f);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5323() {
        if (this.f6268 == 0) {
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float fM5319 = m5319(jCurrentAnimationTimeMillis);
        long j = jCurrentAnimationTimeMillis - this.f6268;
        this.f6268 = jCurrentAnimationTimeMillis;
        this.f6273 = (int) (j * ((fM5319 * 4.0f) + ((-4.0f) * fM5319 * fM5319)) * this.f6270);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5324(float f, float f2) {
        this.f6267 = f;
        this.f6270 = f2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m5326() {
        Math.abs(this.f6267);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m5321() {
        float f = this.f6270;
        return (int) (f / Math.abs(f));
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m5328() {
        return this.f6273;
    }
}
