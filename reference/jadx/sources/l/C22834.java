package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩺ۜ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W261 */
/* JADX INFO: loaded from: classes.dex */
public final class C22834 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f74289;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f74290;

    public final int hashCode() {
        long j = this.f74290;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f74289;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C22834(long j, long j2) {
        this.f74290 = j;
        this.f74289 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22834)) {
            return false;
        }
        C22834 c22834 = (C22834) obj;
        return this.f74290 == c22834.f74290 && this.f74289 == c22834.f74289;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f74290), Long.valueOf(this.f74289)};
        String[] strArrSplit = "minTime;maxTime".length() == 0 ? new String[0] : "minTime;maxTime".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C22834.class, sb, "[");
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

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m50575(long j) {
        return this.f74290 <= j && j < this.f74289;
    }
}
