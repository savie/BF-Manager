package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֫֡۬, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1473 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f5996;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f5997;

    public C1473(long j, String str) {
        this.f5997 = str;
        this.f5996 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1473)) {
            return false;
        }
        C1473 c1473 = (C1473) obj;
        return this.f5996 == c1473.f5996 && C13638.equals(this.f5997, c1473.f5997);
    }

    public final int hashCode() {
        long j = this.f5996;
        return C13638.hashCode(this.f5997) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f5997, Long.valueOf(this.f5996)};
        String[] strArrSplit = "resourceKey;pageNumber".length() == 0 ? new String[0] : "resourceKey;pageNumber".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C1473.class, sb, "[");
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
