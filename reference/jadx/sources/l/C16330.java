package l;

/* JADX INFO: renamed from: l.ܶ᩶ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54VR */
/* JADX INFO: loaded from: classes4.dex */
public final class C16330 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Object f53013 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f53014;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Object[] f53015;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f53016 = 0;

    public C16330(int i) {
        this.f53014 = new int[i];
        this.f53015 = new Object[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38761(int i, int i2, int[] iArr) {
        int i3 = -1;
        int i4 = i;
        while (i4 - i3 > 1) {
            int i5 = (i4 + i3) / 2;
            if (iArr[i5] < i2) {
                i3 = i5;
            } else {
                i4 = i5;
            }
        }
        if (i4 == i) {
            return ~i;
        }
        return iArr[i4] == i2 ? i4 : ~i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m38762(int i) {
        Object obj;
        int iM38761 = m38761(this.f53016, i, this.f53014);
        if (iM38761 < 0 || (obj = this.f53015[iM38761]) == f53013) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m38763(int i, Comparable comparable) {
        int iM38761 = m38761(this.f53016, i, this.f53014);
        if (iM38761 >= 0) {
            this.f53015[iM38761] = comparable;
            return;
        }
        int i2 = ~iM38761;
        int i3 = this.f53016;
        if (i2 < i3) {
            Object[] objArr = this.f53015;
            if (objArr[i2] == f53013) {
                this.f53014[i2] = i;
                objArr[i2] = comparable;
                return;
            }
        }
        int[] iArr = this.f53014;
        if (i3 >= iArr.length) {
            int iMax = Math.max(i3 + 1, iArr.length * 2);
            int[] iArr2 = new int[iMax];
            Object[] objArr2 = new Object[iMax];
            int[] iArr3 = this.f53014;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            Object[] objArr3 = this.f53015;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f53014 = iArr2;
            this.f53015 = objArr2;
        }
        int i4 = this.f53016 - i2;
        if (i4 != 0) {
            int[] iArr4 = this.f53014;
            int i5 = i2 + 1;
            System.arraycopy(iArr4, i2, iArr4, i5, i4);
            Object[] objArr4 = this.f53015;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f53016 - i2);
        }
        this.f53014[i2] = i;
        this.f53015[i2] = comparable;
        this.f53016++;
    }
}
