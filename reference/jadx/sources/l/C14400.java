package l;

/* JADX INFO: renamed from: l.ܳ۠ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54VR */
/* JADX INFO: loaded from: classes4.dex */
public final class C14400 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Object f47209 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f47210;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Object[] f47211;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f47212 = 0;

    public C14400(int i) {
        this.f47210 = new int[i];
        this.f47211 = new Object[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m34665(int i, int i2, int[] iArr) {
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
    public final Object m34666(int i) {
        Object obj;
        int iM34665 = m34665(this.f47212, i, this.f47210);
        if (iM34665 < 0 || (obj = this.f47211[iM34665]) == f47209) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m34667(int i, Comparable comparable) {
        int iM34665 = m34665(this.f47212, i, this.f47210);
        if (iM34665 >= 0) {
            this.f47211[iM34665] = comparable;
            return;
        }
        int i2 = ~iM34665;
        int i3 = this.f47212;
        if (i2 < i3) {
            Object[] objArr = this.f47211;
            if (objArr[i2] == f47209) {
                this.f47210[i2] = i;
                objArr[i2] = comparable;
                return;
            }
        }
        int[] iArr = this.f47210;
        if (i3 >= iArr.length) {
            int iMax = Math.max(i3 + 1, iArr.length * 2);
            int[] iArr2 = new int[iMax];
            Object[] objArr2 = new Object[iMax];
            int[] iArr3 = this.f47210;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            Object[] objArr3 = this.f47211;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f47210 = iArr2;
            this.f47211 = objArr2;
        }
        int i4 = this.f47212 - i2;
        if (i4 != 0) {
            int[] iArr4 = this.f47210;
            int i5 = i2 + 1;
            System.arraycopy(iArr4, i2, iArr4, i5, i4);
            Object[] objArr4 = this.f47211;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f47212 - i2);
        }
        this.f47210[i2] = i;
        this.f47211[i2] = comparable;
        this.f47212++;
    }
}
