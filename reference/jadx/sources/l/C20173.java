package l;

/* JADX INFO: renamed from: l.ᩴ᩻ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4QP */
/* JADX INFO: loaded from: classes5.dex */
public final class C20173 implements Cloneable {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long[] f64789;

    public C20173(long[] jArr) {
        this.f64789 = jArr;
    }

    public C20173() {
        this.f64789 = new long[1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46402(C20173 c20173) {
        if (c20173 == null) {
            return;
        }
        long[] jArr = c20173.f64789;
        int length = jArr.length;
        long[] jArr2 = this.f64789;
        if (length > jArr2.length) {
            int length2 = jArr.length;
            long[] jArr3 = new long[length2];
            System.arraycopy(this.f64789, 0, jArr3, 0, Math.min(length2, jArr2.length));
            this.f64789 = jArr3;
        }
        int iMin = Math.min(this.f64789.length, c20173.f64789.length);
        while (true) {
            iMin--;
            if (iMin < 0) {
                return;
            }
            long[] jArr4 = this.f64789;
            jArr4[iMin] = jArr4[iMin] | c20173.f64789[iMin];
        }
    }

    public final Object clone() {
        try {
            C20173 c20173 = (C20173) super.clone();
            long[] jArr = new long[this.f64789.length];
            c20173.f64789 = jArr;
            long[] jArr2 = this.f64789;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            return c20173;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C20173)) {
            return false;
        }
        C20173 c20173 = (C20173) obj;
        int iMin = Math.min(this.f64789.length, c20173.f64789.length);
        for (int i = 0; i < iMin; i++) {
            if (this.f64789[i] != c20173.f64789[i]) {
                return false;
            }
        }
        if (this.f64789.length > iMin) {
            int i2 = iMin + 1;
            while (true) {
                long[] jArr = this.f64789;
                if (i2 >= jArr.length) {
                    break;
                }
                if (jArr[i2] != 0) {
                    return false;
                }
                i2++;
            }
        } else if (c20173.f64789.length > iMin) {
            int i3 = iMin + 1;
            while (true) {
                long[] jArr2 = c20173.f64789;
                if (i3 >= jArr2.length) {
                    break;
                }
                if (jArr2[i3] != 0) {
                    return false;
                }
                i3++;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m46403(int i) {
        if (i < 0) {
            return false;
        }
        int i2 = i >> 6;
        long[] jArr = this.f64789;
        return i2 < jArr.length && (jArr[i2] & (1 << (i & 63))) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m46401() {
        long[] jArr = this.f64789;
        if (jArr.length > 0) {
            jArr[0] = jArr[0] & (-3);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean z = false;
        for (int i = 0; i < (this.f64789.length << 6); i++) {
            if (m46403(i)) {
                if (i > 0 && z) {
                    sb.append(",");
                }
                sb.append(i);
                z = true;
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
