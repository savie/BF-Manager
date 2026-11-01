package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩳۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes5.dex */
public final class C17770 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C17770 f56360 = new C17770(0, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f56361;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f56362;

    public final int hashCode() {
        long j = this.f56361;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f56362;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C17770(long j, long j2) {
        this.f56361 = j;
        this.f56362 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17770)) {
            return false;
        }
        C17770 c17770 = (C17770) obj;
        return this.f56361 == c17770.f56361 && this.f56362 == c17770.f56362;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f56361), Long.valueOf(this.f56362)};
        String[] strArrSplit = "deltaSourceBytes;historySourceBytes".length() == 0 ? new String[0] : "deltaSourceBytes;historySourceBytes".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C17770.class, sb, "[");
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
    public final long m41336() {
        return this.f56361;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m41337() {
        return this.f56362;
    }
}
