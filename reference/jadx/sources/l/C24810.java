package l;

/* JADX INFO: renamed from: l.᩻ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: XAZX */
/* JADX INFO: loaded from: classes.dex */
public final class C24810 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f80277;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f80278;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f80279;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C1689 f80280;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public char[] f80281;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f80282;

    public C24810(C1689 c1689, int i, int i2) {
        this.f80280 = c1689;
        this.f80277 = i;
        this.f80279 = i2;
        this.f80278 = new int[c1689.f5801.length + 1];
        for (int i3 = 0; i3 < c1689.f5804; i3++) {
            if (i3 < i || i3 >= i2) {
                int i4 = i3 + 1;
                int iM6044 = c1689.m6044(i3) - c1689.m6046(i3);
                int[] iArr = this.f80278;
                iArr[i3] = iArr[i3] + iM6044;
                iArr[i4] = iArr[i4] - iM6044;
            }
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m55332() {
        int iM6044;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            C1689 c1689 = this.f80280;
            int i4 = c1689.f5804;
            int[] iArr = this.f80278;
            if (i >= i4) {
                iArr[i4] = i2;
                if (i2 == 0) {
                    return;
                }
                this.f80281 = new char[i2];
                this.f80282 = (int[]) iArr.clone();
                for (int i5 = 0; i5 < c1689.f5804; i5++) {
                    if ((i5 < this.f80277 || i5 >= this.f80279) && (iM6044 = c1689.m6044(i5) - c1689.m6046(i5)) != 0) {
                        System.arraycopy(c1689.f5803, c1689.m6046(i5), this.f80281, iArr[i5], iM6044);
                    }
                }
                return;
            }
            i3 += iArr[i];
            iArr[i] = i2;
            long j = ((long) i2) + ((long) i3);
            i2 = (int) j;
            if (j != i2) {
                throw new ArithmeticException();
            }
            i++;
        }
    }
}
