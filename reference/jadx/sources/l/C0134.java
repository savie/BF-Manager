package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡ۗ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: E762 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0134 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f1133;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f1134;

    public C0134(String str, String str2) {
        this.f1134 = str;
        this.f1133 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0134)) {
            return false;
        }
        C0134 c0134 = (C0134) obj;
        return C13638.equals(this.f1134, c0134.f1134) && C13638.equals(this.f1133, c0134.f1133);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f1133) + (C13638.hashCode(this.f1134) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f1134, this.f1133};
        String[] strArrSplit = "locator;entryName".length() == 0 ? new String[0] : "locator;entryName".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C0134.class, sb, "[");
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
