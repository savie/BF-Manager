package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚ۫ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes3.dex */
public final class C5343 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f18453;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f18454;

    public C5343(int i, Object obj) {
        this.f18453 = i;
        this.f18454 = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5343)) {
            return false;
        }
        C5343 c5343 = (C5343) obj;
        return this.f18453 == c5343.f18453 && C13638.equals(this.f18454, c5343.f18454);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f18454) + (this.f18453 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f18453), this.f18454};
        String[] strArrSplit = "type;value".length() == 0 ? new String[0] : "type;value".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C5343.class, sb, "[");
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
