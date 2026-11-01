package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۟ܺ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: R8UV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7573 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f25102;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C20979 f25103;

    public C7573(C20979 c20979, long j) {
        this.f25103 = c20979;
        this.f25102 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7573)) {
            return false;
        }
        C7573 c7573 = (C7573) obj;
        return this.f25102 == c7573.f25102 && C13638.equals(this.f25103, c7573.f25103);
    }

    public final int hashCode() {
        long j = this.f25102;
        return C13638.hashCode(this.f25103) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f25103, Long.valueOf(this.f25102)};
        String[] strArrSplit = "metadata;duration".length() == 0 ? new String[0] : "metadata;duration".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C7573.class, sb, "[");
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
    public final long m20098() {
        return this.f25102;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C20979 m20099() {
        return this.f25103;
    }
}
