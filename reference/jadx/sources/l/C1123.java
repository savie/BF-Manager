package l;

/* JADX INFO: renamed from: l.֨۫᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 54VR */
/* JADX INFO: loaded from: classes2.dex */
public final class C1123 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final Object f5048 = new Object();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int[] f5049;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public Object[] f5050;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f5051 = 0;

    public C1123(int i) {
        this.f5049 = new int[i];
        this.f5050 = new Object[i];
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m4151(int i) {
        Object obj;
        int iM4148 = m4148(this.f5051, i, this.f5049);
        if (iM4148 < 0 || (obj = this.f5050[iM4148]) == f5048) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m4152(int i, Object obj) {
        int iM4148 = m4148(this.f5051, i, this.f5049);
        if (iM4148 >= 0) {
            this.f5050[iM4148] = obj;
            return;
        }
        int i2 = ~iM4148;
        int i3 = this.f5051;
        if (i2 < i3) {
            Object[] objArr = this.f5050;
            if (objArr[i2] == f5048) {
                this.f5049[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        int[] iArr = this.f5049;
        if (i3 >= iArr.length) {
            int iMax = Math.max(i3 + 1, iArr.length * 2);
            int[] iArr2 = new int[iMax];
            Object[] objArr2 = new Object[iMax];
            int[] iArr3 = this.f5049;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            Object[] objArr3 = this.f5050;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f5049 = iArr2;
            this.f5050 = objArr2;
        }
        int i4 = this.f5051 - i2;
        if (i4 != 0) {
            int[] iArr4 = this.f5049;
            int i5 = i2 + 1;
            System.arraycopy(iArr4, i2, iArr4, i5, i4);
            Object[] objArr4 = this.f5050;
            System.arraycopy(objArr4, i2, objArr4, i5, this.f5051 - i2);
        }
        this.f5049[i2] = i;
        this.f5050[i2] = obj;
        this.f5051++;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4150(int i, Object obj) {
        int i2 = this.f5051;
        if (i2 != 0 && i <= this.f5049[i2 - 1]) {
            m4152(i, obj);
            return;
        }
        int[] iArr = this.f5049;
        if (i2 >= iArr.length) {
            int iMax = Math.max(i2 + 1, iArr.length * 2);
            int[] iArr2 = new int[iMax];
            Object[] objArr = new Object[iMax];
            int[] iArr3 = this.f5049;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            Object[] objArr2 = this.f5050;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f5049 = iArr2;
            this.f5050 = objArr;
        }
        this.f5049[i2] = i;
        this.f5050[i2] = obj;
        this.f5051 = i2 + 1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m4149(int i) {
        int[] iArr = this.f5049;
        if (iArr.length < i) {
            int[] iArr2 = new int[i];
            Object[] objArr = new Object[i];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            Object[] objArr2 = this.f5050;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f5049 = iArr2;
            this.f5050 = objArr;
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m4148(int i, int i2, int[] iArr) {
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
