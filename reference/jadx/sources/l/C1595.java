package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֫ۙۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 37EB */
/* JADX INFO: loaded from: classes2.dex */
public final class C1595 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10332 f6451;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f6452;

    public C1595(String str, C10332 c10332) {
        this.f6452 = str;
        this.f6451 = c10332;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1595)) {
            return false;
        }
        C1595 c1595 = (C1595) obj;
        return C13638.equals(this.f6452, c1595.f6452) && C13638.equals(this.f6451, c1595.f6451);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f6451) + (C13638.hashCode(this.f6452) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f6452, this.f6451};
        String[] strArrSplit = "strBsm;cpx2Const".length() == 0 ? new String[0] : "strBsm;cpx2Const".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C1595.class, sb, "[");
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
    public final C10332 m5437() {
        return this.f6451;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m5438() {
        return this.f6452;
    }
}
