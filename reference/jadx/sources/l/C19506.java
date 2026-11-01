package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩵ܰ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: C766 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19506 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18129 f62739;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f62740;

    public C19506(C18129 c18129, long j) {
        this.f62739 = c18129;
        this.f62740 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19506)) {
            return false;
        }
        C19506 c19506 = (C19506) obj;
        return this.f62740 == c19506.f62740 && C13638.equals(this.f62739, c19506.f62739);
    }

    public final int hashCode() {
        long j = this.f62740;
        return C13638.hashCode(this.f62739) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f62739, Long.valueOf(this.f62740)};
        String[] strArrSplit = "mapping;targetVirtualAddress".length() == 0 ? new String[0] : "mapping;targetVirtualAddress".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C19506.class, sb, "[");
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
