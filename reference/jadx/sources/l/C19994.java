package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶ۜ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes5.dex */
public final class C19994 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f63991;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f63992;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f63993;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f63994;

    public C19994(boolean z, long j, long j2, String str) {
        this.f63994 = z;
        this.f63991 = j;
        this.f63993 = j2;
        this.f63992 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19994)) {
            return false;
        }
        C19994 c19994 = (C19994) obj;
        return this.f63994 == c19994.f63994 && this.f63991 == c19994.f63991 && this.f63993 == c19994.f63993 && C13638.equals(this.f63992, c19994.f63992);
    }

    public final int hashCode() {
        int i = this.f63994 ? 1231 : 1237;
        long j = this.f63991;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f63993;
        return C13638.hashCode(this.f63992) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f63994), Long.valueOf(this.f63991), Long.valueOf(this.f63993), this.f63992};
        String[] strArrSplit = "lan;warmupMillis;splitTimeThresholdSeconds;downloadHost".length() == 0 ? new String[0] : "lan;warmupMillis;splitTimeThresholdSeconds;downloadHost".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C19994.class, sb, "[");
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
    public final long m45282() {
        return this.f63993;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m45283() {
        return this.f63991;
    }
}
