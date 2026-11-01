package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܺ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes4.dex */
public final class C15803 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f51153;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9570 f51154;

    public C15803(C9570 c9570, String str) {
        this.f51154 = c9570;
        this.f51153 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15803)) {
            return false;
        }
        C15803 c15803 = (C15803) obj;
        return C13638.equals(this.f51154, c15803.f51154) && C13638.equals(this.f51153, c15803.f51153);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f51153) + (C13638.hashCode(this.f51154) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f51154, this.f51153};
        String[] strArrSplit = "share;path".length() == 0 ? new String[0] : "share;path".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C15803.class, sb, "[");
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
