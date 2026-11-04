package l;

/* JADX INFO: renamed from: l.۟ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7982 extends AbstractC19169 {

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C11974[] f26520;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int[] f26521;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7982(int[] iArr, C11974[] c11974Arr) {
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
        for (C11974 c11974 : c11974Arr) {
            if ((c11974.m30046() >>> 24) == 6 || (c11974.m30047() >>> 24) == 6) {
                z = true;
                break;
            }
        }
        super(i, length, 1, z);
        this.f26521 = iArr;
        this.f26520 = c11974Arr;
    }
}
