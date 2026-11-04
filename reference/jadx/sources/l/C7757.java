package l;

/* JADX INFO: renamed from: l.۟۠ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: 54VR */
/* JADX INFO: loaded from: classes3.dex */
public final class C7757 {

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static final Object f25535 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f25536;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public Object[] f25537;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f25538 = 0;

    public C7757(int i) {
        this.f25536 = new int[i];
        this.f25537 = new Object[i];
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object m21127(int i) {
        Object obj;
        int iM21124 = m21124(this.f25538, i, this.f25536);
        if (iM21124 < 0 || (obj = this.f25537[iM21124]) == f25535) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final void m21128(int i, Object obj) {
        int iM21124 = m21124(this.f25538, i, this.f25536);
        if (iM21124 >= 0) {
            this.f25537[iM21124] = obj;
            return;
        }
        int i2 = ~iM21124;
        int i3 = this.f25538;
        if (i2 < i3) {
            Object[] objArr = this.f25537;
            if (objArr[i2] == f25535) {
                this.f25536[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        int[] iArr = this.f25536;
        if (i3 >= iArr.length) {
            int iMax = Math.max(i3 + 1, iArr.length * 2);
            int[] iArr2 = new int[iMax];
            Object[] objArr2 = new Object[iMax];
            int[] iArr3 = this.f25536;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            Object[] objArr3 = this.f25537;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f25536 = iArr2;
            this.f25537 = objArr2;
        }
        int i4 = this.f25538 - i2;
        if (i4 != 0) {
            int[] iArr4 = this.f25536;
            int i5 = i2 + 1;
            System.arraycopy(iArr4, i2, iArr4, i5, i4);
            Object[] objArr4 = this.f25537;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f25538 - i2);
        }
        this.f25536[i2] = i;
        this.f25537[i2] = obj;
        this.f25538++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21126(int i, Object obj) {
        int i2 = this.f25538;
        if (i2 != 0 && i <= this.f25536[i2 - 1]) {
            m21128(i, obj);
            return;
        }
        int[] iArr = this.f25536;
        if (i2 >= iArr.length) {
            int iMax = Math.max(i2 + 1, iArr.length * 2);
            int[] iArr2 = new int[iMax];
            Object[] objArr = new Object[iMax];
            int[] iArr3 = this.f25536;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            Object[] objArr2 = this.f25537;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f25536 = iArr2;
            this.f25537 = objArr;
        }
        this.f25536[i2] = i;
        this.f25537[i2] = obj;
        this.f25538 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m21125(int i) {
        int[] iArr = this.f25536;
        if (iArr.length < i) {
            int[] iArr2 = new int[i];
            Object[] objArr = new Object[i];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            Object[] objArr2 = this.f25537;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f25536 = iArr2;
            this.f25537 = objArr;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m21124(int i, int i2, int[] iArr) {
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
}
