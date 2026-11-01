package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܽۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZD */
/* JADX INFO: loaded from: classes4.dex */
public final class C16592 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f53242;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f53243;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f53244;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f53245;

    public C16592(int i, int i2, int i3, int i4) {
        this.f53245 = i;
        this.f53244 = i2;
        this.f53242 = i3;
        this.f53243 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16592)) {
            return false;
        }
        C16592 c16592 = (C16592) obj;
        return this.f53245 == c16592.f53245 && this.f53244 == c16592.f53244 && this.f53242 == c16592.f53242 && this.f53243 == c16592.f53243;
    }

    public final int hashCode() {
        return (((((this.f53245 * 31) + this.f53244) * 31) + this.f53242) * 31) + this.f53243;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f53245), Integer.valueOf(this.f53244), Integer.valueOf(this.f53242), Integer.valueOf(this.f53243)};
        String[] strArrSplit = "left;top;width;height".length() == 0 ? new String[0] : "left;top;width;height".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C16592.class, sb, "[");
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m39023() {
        return this.f53244;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m39024() {
        return this.f53243;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m39025() {
        return this.f53245;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m39026() {
        return this.f53242;
    }
}
