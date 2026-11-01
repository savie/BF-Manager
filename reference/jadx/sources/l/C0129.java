package l;

/* JADX INFO: renamed from: l.֡ۖ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: A4QP */
/* JADX INFO: loaded from: classes2.dex */
public final class C0129 implements Cloneable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public long[] f1117;

    public C0129(long[] jArr) {
        this.f1117 = jArr;
    }

    public C0129() {
        this.f1117 = new long[1];
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1194(C0129 c0129) {
        if (c0129 == null) {
            return;
        }
        long[] jArr = c0129.f1117;
        int length = jArr.length;
        long[] jArr2 = this.f1117;
        if (length > jArr2.length) {
            int length2 = jArr.length;
            long[] jArr3 = new long[length2];
            System.arraycopy(this.f1117, 0, jArr3, 0, Math.min(length2, jArr2.length));
            this.f1117 = jArr3;
        }
        int iMin = Math.min(this.f1117.length, c0129.f1117.length);
        while (true) {
            iMin--;
            if (iMin < 0) {
                return;
            }
            long[] jArr4 = this.f1117;
            jArr4[iMin] = jArr4[iMin] | c0129.f1117[iMin];
        }
    }

    public final Object clone() {
        try {
            C0129 c0129 = (C0129) super.clone();
            long[] jArr = new long[this.f1117.length];
            c0129.f1117 = jArr;
            long[] jArr2 = this.f1117;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            return c0129;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0129)) {
            return false;
        }
        C0129 c0129 = (C0129) obj;
        int iMin = Math.min(this.f1117.length, c0129.f1117.length);
        for (int i = 0; i < iMin; i++) {
            if (this.f1117[i] != c0129.f1117[i]) {
                return false;
            }
        }
        if (this.f1117.length > iMin) {
            int i2 = iMin + 1;
            while (true) {
                long[] jArr = this.f1117;
                if (i2 >= jArr.length) {
                    break;
                }
                if (jArr[i2] != 0) {
                    return false;
                }
                i2++;
            }
        } else if (c0129.f1117.length > iMin) {
            int i3 = iMin + 1;
            while (true) {
                long[] jArr2 = c0129.f1117;
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
    public final boolean m1195(int i) {
        if (i < 0) {
            return false;
        }
        int i2 = i >> 6;
        long[] jArr = this.f1117;
        return i2 < jArr.length && (jArr[i2] & (1 << (i & 63))) != 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m1193() {
        long[] jArr = this.f1117;
        if (jArr.length > 0) {
            jArr[0] = jArr[0] & (-3);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean z = false;
        for (int i = 0; i < (this.f1117.length << 6); i++) {
            if (m1195(i)) {
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
