package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩸ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes5.dex */
public final class C21298 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3658 f69307;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22710 f69308;

    public C21298(C22710 c22710, C3658 c3658) {
        this.f69308 = c22710;
        this.f69307 = c3658;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21298)) {
            return false;
        }
        C21298 c21298 = (C21298) obj;
        return C13638.equals(this.f69308, c21298.f69308) && C13638.equals(this.f69307, c21298.f69307);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f69307) + (C13638.hashCode(this.f69308) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f69308, this.f69307};
        String[] strArrSplit = "rest;extent".length() == 0 ? new String[0] : "rest;extent".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C21298.class, sb, "[");
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
