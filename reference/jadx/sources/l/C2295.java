package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۖۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2295 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C5118 f8174;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6529 f8175;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC0884 f8176;

    public C2295(C5118 c5118, C6529 c6529, EnumC0884 enumC0884) {
        this.f8174 = c5118;
        this.f8175 = c6529;
        this.f8176 = enumC0884;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2295)) {
            return false;
        }
        C2295 c2295 = (C2295) obj;
        return C13638.equals(this.f8174, c2295.f8174) && C13638.equals(this.f8175, c2295.f8175) && C13638.equals(this.f8176, c2295.f8176);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f8176) + ((C13638.hashCode(this.f8175) + (C13638.hashCode(this.f8174) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f8174, this.f8175, this.f8176};
        String[] strArrSplit = "request;store;state".length() == 0 ? new String[0] : "request;store;state".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C2295.class, sb, "[");
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
