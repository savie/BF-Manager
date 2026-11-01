package l;

import com.alipay.sdk.m.p.a;

/* JADX INFO: renamed from: l.ۡ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 75UL */
/* JADX INFO: loaded from: classes3.dex */
public final class C8746 implements Cloneable {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final Object f30060 = new Object();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f30061;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public boolean f30062 = false;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public Object[] f30063;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public long[] f30064;

    public C8746() {
        int i;
        int i2 = 4;
        while (true) {
            i = 80;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (80 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 8;
        this.f30064 = new long[i4];
        this.f30063 = new Object[i4];
    }

    public final C8746 clone() {
        try {
            C8746 c8746 = (C8746) super.clone();
            c8746.f30064 = (long[]) this.f30064.clone();
            c8746.f30063 = (Object[]) this.f30063.clone();
            return c8746;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object m22709(long j, Long l2) {
        Object obj;
        int iM44321 = C19329.m44321(j, this.f30064, this.f30061);
        return (iM44321 < 0 || (obj = this.f30063[iM44321]) == f30060) ? l2 : obj;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m22710(long j) {
        int iM44321 = C19329.m44321(j, this.f30064, this.f30061);
        if (iM44321 >= 0) {
            Object[] objArr = this.f30063;
            Object obj = objArr[iM44321];
            Object obj2 = f30060;
            if (obj != obj2) {
                objArr[iM44321] = obj2;
                this.f30062 = true;
            }
        }
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m22708(int i) {
        Object[] objArr = this.f30063;
        Object obj = objArr[i];
        Object obj2 = f30060;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f30062 = true;
        }
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private void m22700() {
        int i = this.f30061;
        long[] jArr = this.f30064;
        Object[] objArr = this.f30063;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f30060) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f30062 = false;
        this.f30061 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22706(long j, Object obj) {
        int iM44321 = C19329.m44321(j, this.f30064, this.f30061);
        if (iM44321 >= 0) {
            this.f30063[iM44321] = obj;
            return;
        }
        int i = ~iM44321;
        int i2 = this.f30061;
        if (i < i2) {
            Object[] objArr = this.f30063;
            if (objArr[i] == f30060) {
                this.f30064[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.f30062 && i2 >= this.f30064.length) {
            m22700();
            i = ~C19329.m44321(j, this.f30064, this.f30061);
        }
        int i3 = this.f30061;
        if (i3 >= this.f30064.length) {
            int i4 = (i3 + 1) * 8;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 8;
            long[] jArr = new long[i7];
            Object[] objArr2 = new Object[i7];
            long[] jArr2 = this.f30064;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f30063;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f30064 = jArr;
            this.f30063 = objArr2;
        }
        int i8 = this.f30061 - i;
        if (i8 != 0) {
            long[] jArr3 = this.f30064;
            int i9 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i9, i8);
            Object[] objArr4 = this.f30063;
            System.arraycopy(objArr4, i, objArr4, i9, this.f30061 - i);
        }
        this.f30064[i] = j;
        this.f30063[i] = obj;
        this.f30061++;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m22707() {
        if (this.f30062) {
            m22700();
        }
        return this.f30061;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m22703(int i) {
        if (this.f30062) {
            m22700();
        }
        return this.f30064[i];
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final Object m22701(int i) {
        if (this.f30062) {
            m22700();
        }
        return this.f30063[i];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22702(long j) {
        if (this.f30062) {
            m22700();
        }
        return C19329.m44321(j, this.f30064, this.f30061);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22704() {
        int i = this.f30061;
        Object[] objArr = this.f30063;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f30061 = 0;
        this.f30062 = false;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m22705(long j, Long l2) {
        int i = this.f30061;
        if (i != 0 && j <= this.f30064[i - 1]) {
            m22706(j, (Object) l2);
            return;
        }
        if (this.f30062 && i >= this.f30064.length) {
            m22700();
        }
        int i2 = this.f30061;
        if (i2 >= this.f30064.length) {
            int i3 = (i2 + 1) * 8;
            for (int i4 = 4; i4 < 32; i4++) {
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
            }
            int i6 = i3 / 8;
            long[] jArr = new long[i6];
            Object[] objArr = new Object[i6];
            long[] jArr2 = this.f30064;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f30063;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f30064 = jArr;
            this.f30063 = objArr;
        }
        this.f30064[i2] = j;
        this.f30063[i2] = l2;
        this.f30061 = i2 + 1;
    }

    public final String toString() {
        if (m22707() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f30061 * 28);
        sb.append('{');
        for (int i = 0; i < this.f30061; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m22703(i));
            sb.append(a.h);
            Object objM22701 = m22701(i);
            if (objM22701 != this) {
                sb.append(objM22701);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
