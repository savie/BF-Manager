package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛ᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes3.dex */
public final class C6307 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f21330;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f21331;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f21332;

    public C6307(int i, int i2, long j) {
        this.f21330 = j;
        this.f21331 = i;
        this.f21332 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6307)) {
            return false;
        }
        C6307 c6307 = (C6307) obj;
        return this.f21331 == c6307.f21331 && this.f21332 == c6307.f21332 && this.f21330 == c6307.f21330;
    }

    public final int hashCode() {
        int iM41614 = C17922.m41614(this.f21331, 31, this.f21332, 31);
        long j = this.f21330;
        return iM41614 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f21330), Integer.valueOf(this.f21331), Integer.valueOf(this.f21332)};
        String[] strArrSplit = "bucketIndex;widthPx;heightPx".length() == 0 ? new String[0] : "bucketIndex;widthPx;heightPx".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C6307.class, sb, "[");
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
