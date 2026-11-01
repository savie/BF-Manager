package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۢ۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes3.dex */
public final class C9453 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f31999;

    public C9453(boolean z) {
        this.f31999 = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C9453) && this.f31999 == ((C9453) obj).f31999 && "".equals("") && "".equals("");
    }

    public final int hashCode() {
        return "".hashCode() + (("".hashCode() + ((this.f31999 ? 1231 : 1237) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f31999)};
        String[] strArrSplit = "signingDisabledCandidate".length() == 0 ? new String[0] : "signingDisabledCandidate".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C9453.class, sb, "[");
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
    public final boolean m24211() {
        return this.f31999;
    }
}
