package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q6U5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C8872 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f30424;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f30425;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8872)) {
            return false;
        }
        C8872 c8872 = (C8872) obj;
        return this.f30425 == c8872.f30425 && this.f30424 == c8872.f30424;
    }

    public final int hashCode() {
        return (this.f30425 * 31) + this.f30424;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f30425), Integer.valueOf(this.f30424)};
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
    public final int m23014() {
        return this.f30424;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m23016() {
        return this.f30425;
    }

    public C8872(int i, int i2) {
        if (i < -1 || i2 < -1) {
            throw new IllegalArgumentException("Invalid text selection");
        }
        this.f30425 = i;
        this.f30424 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8872 m23015(int i, int i2, int i3) {
        return new C8872(m23013(this.f30425, i, i2, i3), m23013(this.f30424, i, i2, i3));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m23013(int i, int i2, int i3, int i4) {
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
