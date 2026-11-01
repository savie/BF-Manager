package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۘ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4204 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC13378 f15273;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final AbstractC13378 f15274;

    public C4204(AbstractC13378 abstractC13378, AbstractC13378 abstractC13379) {
        this.f15273 = abstractC13378;
        this.f15274 = abstractC13379;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4204)) {
            return false;
        }
        C4204 c4204 = (C4204) obj;
        return C13638.equals(this.f15273, c4204.f15273) && C13638.equals(this.f15274, c4204.f15274);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f15274) + (C13638.hashCode(this.f15273) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f15273, this.f15274};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C4204.class, sb, "[");
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
