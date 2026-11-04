package l;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.۠ۤܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9R5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8570 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f27977;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9315 f27978;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C9315 f27980;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public Interpolator f27979 = new InterpolatorC2604();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f27976 = true;

    public C8570(Context context) {
        this.f27980 = new C9315(context);
        this.f27978 = new C9315(context);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m23020() {
        return this.f27980.f30272 && this.f27978.f30272;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m23018() {
        return this.f27978.f30277;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m23019() {
        if (m23020()) {
            return false;
        }
        int i = this.f27977;
        C9315 c9315 = this.f27978;
        C9315 c9316 = this.f27980;
        if (i != 0) {
            if (i == 1) {
                if (!c9316.f30272 && !c9316.m24551() && !c9316.m24550()) {
                    c9316.m24552();
                }
                if (!c9315.f30272 && !c9315.m24551() && !c9315.m24550()) {
                    c9315.m24552();
                }
            }
            return true;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - c9316.f30275;
        int i2 = c9316.f30278;
        if (jCurrentAnimationTimeMillis < i2) {
            float interpolation = ((InterpolatorC2604) this.f27979).getInterpolation(jCurrentAnimationTimeMillis / i2);
            c9316.m24547(interpolation);
            c9315.m24547(interpolation);
            return true;
        }
        m23015();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23016(long j, long j2) {
        this.f27977 = 0;
        this.f27980.m24548(0L, 0L);
        this.f27978.m24548(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23017(long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7;
        if (!this.f27976 || m23020()) {
            j5 = j2;
            j6 = 0;
            j7 = j5;
        } else {
            float f = this.f27980.f30267;
            float f2 = this.f27978.f30267;
            float f3 = 0L;
            if (Math.signum(f3) == Math.signum(f)) {
                j5 = j2;
                float f4 = j5;
                if (Math.signum(f4) == Math.signum(f2)) {
                    j6 = (long) (f3 + f);
                    j7 = (long) (f4 + f2);
                }
            } else {
                j5 = j2;
            }
            j6 = 0;
            j7 = j5;
        }
        this.f27977 = 1;
        this.f27980.m24549(0L, j6, 0L, 0L, 0L);
        this.f27978.m24549(j, j7, 0L, j3, j4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m23015() {
        this.f27980.m24552();
        this.f27978.m24552();
    }
}
