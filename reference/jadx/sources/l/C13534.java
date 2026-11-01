package l;

import com.alipay.sdk.m.y.l;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: l.ܰۖᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13534 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Future f44691;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f44692;

    public C13534() {
        throw null;
    }

    public C13534(C13557 c13557, int i) {
        this.f44691 = c13557;
        this.f44692 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13534)) {
            return false;
        }
        C13534 c13534 = (C13534) obj;
        return this.f44692 == c13534.f44692 && C13638.equals(this.f44691, c13534.f44691);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f44691) + (this.f44692 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f44691, Integer.valueOf(this.f44692)};
        String[] strArrSplit = "future;length".length() == 0 ? new String[0] : "future;length".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C13534.class, sb, "[");
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
