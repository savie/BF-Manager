package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩷ܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 16WT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20958 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f68289;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f68290;

    public final int hashCode() {
        long j = this.f68290;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f68289;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C20958(long j, long j2) {
        this.f68290 = j;
        this.f68289 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20958)) {
            return false;
        }
        C20958 c20958 = (C20958) obj;
        return this.f68290 == c20958.f68290 && this.f68289 == c20958.f68289;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f68290), Long.valueOf(this.f68289)};
        String[] strArrSplit = "line;column".length() == 0 ? new String[0] : "line;column".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C20958.class, sb, "[");
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
    public final long m47130() {
        return this.f68289;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m47131() {
        return this.f68290;
    }
}
