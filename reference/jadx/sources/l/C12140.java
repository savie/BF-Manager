package l;

/* JADX INFO: renamed from: l.۫ۗ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X9M9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12140 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final float f40641;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f40643;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean f40642 = false;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C16373 f40645 = null;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f40644 = Integer.MAX_VALUE;

    public C12140(float f, int i) {
        this.f40641 = f;
        this.f40643 = i;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int m30215(C16373 c16373, float f) {
        float f2 = c16373.f52692;
        float f3 = this.f40641;
        float fAbs = Math.abs((f2 * f3) - f);
        float fAbs2 = Math.abs((c16373.f52691 * f3) - f);
        int i = this.f40643 * 2;
        if (fAbs <= fAbs2) {
            return fAbs <= ((float) i) ? -1 : 0;
        }
        return fAbs2 <= ((float) i) ? 1 : 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16373 m30213() {
        if (this.f40642) {
            return this.f40645;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m30214(C16373 c16373, float f) {
        int iMin;
        float f2 = c16373.f52692;
        float f3 = this.f40641;
        int iAbs = (int) Math.abs((f2 * f3) - f);
        int iAbs2 = (int) Math.abs((c16373.f52691 * f3) - f);
        float f4 = c16373.f52692 * f3;
        int i = this.f40643;
        float f5 = i;
        if (f4 - f5 < f && f < (c16373.f52691 * f3) + f5) {
            iMin = Math.min(iAbs, iAbs2);
        } else {
            iMin = -Math.min(iAbs, iAbs2);
        }
        if (iMin >= 0) {
            this.f40642 = true;
        } else {
            iMin = -iMin;
            if (iMin > i * 4) {
                return;
            }
        }
        if (iMin < this.f40644) {
            this.f40645 = c16373;
            this.f40644 = iMin;
        }
    }
}
