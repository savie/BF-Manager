package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܺۜܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes4.dex */
public final class C16667 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f53841;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f53842 = false;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public float f53843;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public float f53844;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public float f53845;

    public C16667(float f, float f2, float f3, float f4) {
        this.f53841 = 0.0f;
        this.f53844 = 0.0f;
        this.f53845 = f;
        this.f53843 = f2;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            this.f53841 = (float) (((double) f3) / dSqrt);
            this.f53844 = (float) (((double) f4) / dSqrt);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39376(float f, float f2) {
        float f3 = f - this.f53845;
        float f4 = f2 - this.f53843;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            f3 = (float) (((double) f3) / dSqrt);
            f4 = (float) (((double) f4) / dSqrt);
        }
        float f5 = this.f53841;
        if (f3 == (-f5) && f4 == (-this.f53844)) {
            this.f53842 = true;
            this.f53841 = -f4;
            this.f53844 = f3;
        } else {
            this.f53841 = f5 + f3;
            this.f53844 += f4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39377(C16667 c16667) {
        float f = c16667.f53841;
        float f2 = this.f53841;
        if (f == (-f2)) {
            float f3 = c16667.f53844;
            if (f3 == (-this.f53844)) {
                this.f53842 = true;
                this.f53841 = -f3;
                this.f53844 = c16667.f53841;
                return;
            }
        }
        this.f53841 = f2 + f;
        this.f53844 += c16667.f53844;
    }

    public final String toString() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f53845 + "," + this.f53843 + " " + this.f53841 + "," + this.f53844 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
