package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤ֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K7HV */
/* JADX INFO: loaded from: classes3.dex */
public final class C9969 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f34074;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f34075;

    public C9969(String str, int i) {
        this.f34074 = str;
        this.f34075 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9969)) {
            return false;
        }
        C9969 c9969 = (C9969) obj;
        return this.f34075 == c9969.f34075 && C13638.equals(this.f34074, c9969.f34074);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f34074) + (this.f34075 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f34074, Integer.valueOf(this.f34075)};
        String[] strArrSplit = "path;sortingData".length() == 0 ? new String[0] : "path;sortingData".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C9969.class, sb, "[");
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
    public final String m25236() {
        return this.f34074;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m25237() {
        return this.f34075;
    }
}
