package l;

/* JADX INFO: renamed from: l.ۘܽ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: X9M9 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4283 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f15550;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final float f15552;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f15548 = false;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C24421 f15551 = null;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f15549 = Integer.MAX_VALUE;

    public C4283(float f, int i) {
        this.f15552 = f;
        this.f15550 = i;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m13662(C24421 c24421, float f) {
        float f2 = c24421.f79289;
        float f3 = this.f15552;
        float fAbs = Math.abs((f2 * f3) - f);
        float fAbs2 = Math.abs((c24421.f79288 * f3) - f);
        int i = this.f15550 * 2;
        if (fAbs <= fAbs2) {
            return fAbs <= ((float) i) ? -1 : 0;
        }
        return fAbs2 <= ((float) i) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24421 m13660() {
        if (this.f15548) {
            return this.f15551;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m13661(C24421 c24421, float f) {
        int iMin;
        float f2 = c24421.f79289;
        float f3 = this.f15552;
        int iAbs = (int) Math.abs((f2 * f3) - f);
        int iAbs2 = (int) Math.abs((c24421.f79288 * f3) - f);
        float f4 = c24421.f79289 * f3;
        int i = this.f15550;
        float f5 = i;
        if (f4 - f5 < f && f < (c24421.f79288 * f3) + f5) {
            iMin = Math.min(iAbs, iAbs2);
        } else {
            iMin = -Math.min(iAbs, iAbs2);
        }
        if (iMin >= 0) {
            this.f15548 = true;
        } else {
            iMin = -iMin;
            if (iMin > i * 4) {
                return;
            }
        }
        if (iMin < this.f15549) {
            this.f15551 = c24421;
            this.f15549 = iMin;
        }
    }
}
