package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ܿ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 85M9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C17212 implements Cloneable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Object f54858 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f54859;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f54860;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object[] f54861;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int[] f54862;

    public C17212() {
        this(10);
    }

    public C17212(int i) {
        this.f54860 = false;
        if (i != 0) {
            int i2 = i * 4;
            for (int i3 = 4; i3 < 32; i3++) {
                int i4 = (1 << i3) - 12;
                if (i2 <= i4) {
                    i2 = i4;
                    break;
                }
            }
            int i5 = i2 / 4;
            this.f54862 = new int[i5];
            this.f54861 = new Object[i5];
            return;
        }
        this.f54862 = C19329.f62345;
        this.f54861 = C19329.f62346;
    }

    public final C17212 clone() {
        try {
            C17212 c17212 = (C17212) super.clone();
            c17212.f54862 = (int[]) this.f54862.clone();
            c17212.f54861 = (Object[]) this.f54861.clone();
            return c17212;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object m40144(int i, Integer num) {
        Object obj;
        int iM44320 = C19329.m44320(this.f54859, i, this.f54862);
        return (iM44320 < 0 || (obj = this.f54861[iM44320]) == f54858) ? num : obj;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40148(int i) {
        int iM44320 = C19329.m44320(this.f54859, i, this.f54862);
        if (iM44320 >= 0) {
            Object[] objArr = this.f54861;
            Object obj = objArr[iM44320];
            Object obj2 = f54858;
            if (obj != obj2) {
                objArr[iM44320] = obj2;
                this.f54860 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m40140() {
        int i = this.f54859;
        int[] iArr = this.f54862;
        Object[] objArr = this.f54861;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f54858) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f54860 = false;
        this.f54859 = i2;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m40149(int i, Object obj) {
        int iM44320 = C19329.m44320(this.f54859, i, this.f54862);
        if (iM44320 >= 0) {
            this.f54861[iM44320] = obj;
            return;
        }
        int i2 = ~iM44320;
        int i3 = this.f54859;
        if (i2 < i3) {
            Object[] objArr = this.f54861;
            if (objArr[i2] == f54858) {
                this.f54862[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f54860 && i3 >= this.f54862.length) {
            m40140();
            i2 = ~C19329.m44320(this.f54859, i, this.f54862);
        }
        int i4 = this.f54859;
        if (i4 >= this.f54862.length) {
            int i5 = (i4 + 1) * 4;
            for (int i6 = 4; i6 < 32; i6++) {
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
            }
            int i8 = i5 / 4;
            int[] iArr = new int[i8];
            Object[] objArr2 = new Object[i8];
            int[] iArr2 = this.f54862;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f54861;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f54862 = iArr;
            this.f54861 = objArr2;
        }
        int i9 = this.f54859 - i2;
        if (i9 != 0) {
            int[] iArr3 = this.f54862;
            int i10 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i10, i9);
            Object[] objArr4 = this.f54861;
            System.arraycopy(objArr4, i2, objArr4, i10, this.f54859 - i2);
        }
        this.f54862[i2] = i;
        this.f54861[i2] = obj;
        this.f54859++;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m40147() {
        if (this.f54860) {
            m40140();
        }
        return this.f54859;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40142(int i) {
        if (this.f54860) {
            m40140();
        }
        return this.f54862[i];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object m40141(int i) {
        if (this.f54860) {
            m40140();
        }
        return this.f54861[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m40143(C22006 c22006) {
        if (this.f54860) {
            m40140();
        }
        for (int i = 0; i < this.f54859; i++) {
            if (this.f54861[i] == c22006) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40145() {
        int i = this.f54859;
        Object[] objArr = this.f54861;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f54859 = 0;
        this.f54860 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m40146(int i, Object obj) {
        int i2 = this.f54859;
        if (i2 != 0 && i <= this.f54862[i2 - 1]) {
            m40149(i, obj);
            return;
        }
        if (this.f54860 && i2 >= this.f54862.length) {
            m40140();
        }
        int i3 = this.f54859;
        if (i3 >= this.f54862.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            int[] iArr = new int[i7];
            Object[] objArr = new Object[i7];
            int[] iArr2 = this.f54862;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f54861;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f54862 = iArr;
            this.f54861 = objArr;
        }
        this.f54862[i3] = i;
        this.f54861[i3] = obj;
        this.f54859 = i3 + 1;
    }

    public final String toString() {
        if (m40147() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f54859 * 28);
        sb.append('{');
        for (int i = 0; i < this.f54859; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m40142(i));
            sb.append(a.h);
            Object objM40141 = m40141(i);
            if (objM40141 != this) {
                sb.append(objM40141);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
