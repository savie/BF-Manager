package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙܶ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: L6Y6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4729 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f16668;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f16669;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f16670;

    public C4729(String str, String str2, String str3) {
        this.f16669 = str;
        this.f16670 = str2;
        this.f16668 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4729)) {
            return false;
        }
        C4729 c4729 = (C4729) obj;
        return C13638.equals(this.f16669, c4729.f16669) && C13638.equals(this.f16670, c4729.f16670) && C13638.equals(this.f16668, c4729.f16668);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f16668) + C0589.m2789(C13638.hashCode(this.f16669) * 31, 31, this.f16670);
    }

    public final String toString() {
        Object[] objArr = {this.f16669, this.f16670, this.f16668};
        String[] strArrSplit = "traversalId;policyRevision;directoryPath".length() == 0 ? new String[0] : "traversalId;policyRevision;directoryPath".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C4729.class, sb, "[");
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
