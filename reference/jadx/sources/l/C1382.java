package l;

/* JADX INFO: renamed from: l.֨᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1382 extends AbstractC13378 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int[] f5767;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C15682[] f5768;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1382(int[] iArr, C15682[] c15682Arr) {
        boolean z = false;
        int i = 0;
        for (int i2 : iArr) {
            long j = ((long) i) + ((long) (i2 & Integer.MAX_VALUE));
            i = (int) j;
            if (j != i) {
                throw new ArithmeticException();
            }
        }
        int length = iArr.length;
        for (C15682 c15682 : c15682Arr) {
            if ((c15682.m37375() >>> 24) == 6 || (c15682.m37378() >>> 24) == 6) {
                z = true;
                break;
            }
        }
        super(i, length, 1, z);
        this.f5767 = iArr;
        this.f5768 = c15682Arr;
    }
}
