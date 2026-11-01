package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: E762 */
/* JADX INFO: loaded from: classes3.dex */
public final class C10013 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f34189;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f34190;

    public C10013(long j, String str) {
        this.f34190 = j;
        this.f34189 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10013)) {
            return false;
        }
        C10013 c10013 = (C10013) obj;
        return this.f34190 == c10013.f34190 && C13638.equals(this.f34189, c10013.f34189);
    }

    public final int hashCode() {
        long j = this.f34190;
        return C13638.hashCode(this.f34189) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f34190), this.f34189};
        String[] strArrSplit = "value;hex".length() == 0 ? new String[0] : "value;hex".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C10013.class, sb, "[");
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
}
