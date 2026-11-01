package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩹ۤܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: TB7B */
/* JADX INFO: loaded from: classes.dex */
public final class C22227 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public float f72684;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public float f72685;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public float f72686;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f72687 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public float f72688;

    public C22227(float f, float f2, float f3, float f4) {
        this.f72685 = 0.0f;
        this.f72688 = 0.0f;
        this.f72684 = f;
        this.f72686 = f2;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            this.f72685 = (float) (((double) f3) / dSqrt);
            this.f72688 = (float) (((double) f4) / dSqrt);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49351(float f, float f2) {
        float f3 = f - this.f72684;
        float f4 = f2 - this.f72686;
        double dSqrt = Math.sqrt((f4 * f4) + (f3 * f3));
        if (dSqrt != 0.0d) {
            f3 = (float) (((double) f3) / dSqrt);
            f4 = (float) (((double) f4) / dSqrt);
        }
        float f5 = this.f72685;
        if (f3 == (-f5) && f4 == (-this.f72688)) {
            this.f72687 = true;
            this.f72685 = -f4;
            this.f72688 = f3;
        } else {
            this.f72685 = f5 + f3;
            this.f72688 += f4;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m49352(C22227 c22227) {
        float f = c22227.f72685;
        float f2 = this.f72685;
        if (f == (-f2)) {
            float f3 = c22227.f72688;
            if (f3 == (-this.f72688)) {
                this.f72687 = true;
                this.f72685 = -f3;
                this.f72688 = c22227.f72685;
                return;
            }
        }
        this.f72685 = f2 + f;
        this.f72688 += c22227.f72688;
    }

    public final String toString() {
        return MotionUtils.EASING_TYPE_FORMAT_START + this.f72684 + "," + this.f72686 + " " + this.f72685 + "," + this.f72688 + MotionUtils.EASING_TYPE_FORMAT_END;
    }
}
