package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶ᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6U5 */
/* JADX INFO: loaded from: classes.dex */
public final class C21498 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f68721;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f68722;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21498)) {
            return false;
        }
        C21498 c21498 = (C21498) obj;
        return this.f68722 == c21498.f68722 && this.f68721 == c21498.f68721;
    }

    public final int hashCode() {
        return (this.f68722 * 31) + this.f68721;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f68722), Integer.valueOf(this.f68721)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(l.b);
        StringBuilder sb = new StringBuilder("TextSelection[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48906() {
        return this.f68721;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m48908() {
        return this.f68722;
    }

    public C21498(int i, int i2) {
        if (i < -1 || i2 < -1) {
            throw new IllegalArgumentException("Invalid text selection");
        }
        this.f68722 = i;
        this.f68721 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21498 m48907(int i, int i2, int i3) {
        return new C21498(m48905(this.f68722, i, i2, i3), m48905(this.f68721, i, i2, i3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m48905(int i, int i2, int i3, int i4) {
        if (i < i2) {
            return i;
        }
        if (i < i3) {
            return (i == i2 || i4 == 0) ? i2 : i2 + ((int) ((((long) (i - i2)) * ((long) i4)) / ((long) (i3 - i2))));
        }
        long j = (((long) i) - ((long) (i3 - i2))) + ((long) i4);
        int i5 = (int) j;
        if (j == i5) {
            return i5;
        }
        throw new ArithmeticException();
    }
}
