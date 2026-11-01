package l;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: renamed from: l.ᩴۗۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J9R5 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18483 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C21305 f58901;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21305 f58903;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f58904;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Interpolator f58905 = new InterpolatorC17777();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f58902 = true;

    public C18483(Context context) {
        this.f58901 = new C21305(context);
        this.f58903 = new C21305(context);
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m42851() {
        return this.f58901.f69328 && this.f58903.f69328;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m42855() {
        return this.f58903.f69323;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m42856() {
        if (m42851()) {
            return false;
        }
        int i = this.f58904;
        C21305 c21305 = this.f58903;
        C21305 c21306 = this.f58901;
        if (i != 0) {
            if (i == 1) {
                if (!c21306.f69328 && !c21306.m47774() && !c21306.m47773()) {
                    c21306.m47775();
                }
                if (!c21305.f69328 && !c21305.m47774() && !c21305.m47773()) {
                    c21305.m47775();
                }
            }
            return true;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis() - c21306.f69327;
        int i2 = c21306.f69316;
        if (jCurrentAnimationTimeMillis < i2) {
            float interpolation = ((InterpolatorC17777) this.f58905).getInterpolation(jCurrentAnimationTimeMillis / i2);
            c21306.m47770(interpolation);
            c21305.m47770(interpolation);
            return true;
        }
        m42852();
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42853(long j, long j2) {
        this.f58904 = 0;
        this.f58901.m47771(0L, 0L);
        this.f58903.m47771(j, j2);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003d  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42854(long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        long j7;
        if (!this.f58902 || m42851()) {
            j5 = j2;
            j6 = 0;
            j7 = j5;
        } else {
            float f = this.f58901.f69318;
            float f2 = this.f58903.f69318;
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
        this.f58904 = 1;
        this.f58901.m47772(0L, j6, 0L, 0L, 0L);
        this.f58903.m47772(j, j7, 0L, j3, j4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m42852() {
        this.f58901.m47775();
        this.f58903.m47775();
    }
}
