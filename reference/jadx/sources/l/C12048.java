package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۫֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 56R4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12048 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f40319;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f40320;

    public C12048(String str, int i) {
        this.f40320 = str;
        this.f40319 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12048)) {
            return false;
        }
        C12048 c12048 = (C12048) obj;
        return this.f40319 == c12048.f40319 && C13638.equals(this.f40320, c12048.f40320);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f40320) + (this.f40319 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f40320, Integer.valueOf(this.f40319)};
        String[] strArrSplit = "text;restoredHash".length() == 0 ? new String[0] : "text;restoredHash".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C12048.class, sb, "[");
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
    public final int m29943() {
        return this.f40319;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m29944() {
        return this.f40320;
    }
}
