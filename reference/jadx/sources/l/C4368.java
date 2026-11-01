package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4368 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3144 f15611;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C3144 f15612;

    public C4368(C3144 c3144, C3144 c3145) {
        this.f15611 = c3144;
        this.f15612 = c3145;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4368)) {
            return false;
        }
        C4368 c4368 = (C4368) obj;
        return C13638.equals(this.f15611, c4368.f15611) && C13638.equals(this.f15612, c4368.f15612);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f15612) + (C13638.hashCode(this.f15611) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f15611, this.f15612};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C4368.class, sb, "[");
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
