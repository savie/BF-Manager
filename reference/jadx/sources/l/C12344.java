package l;

import com.alipay.sdk.m.y.l;
import java.util.concurrent.Future;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۨۨܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9E4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12344 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Future f39646;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f39647;

    public C12344() {
        throw null;
    }

    public C12344(C12453 c12453, int i) {
        this.f39646 = c12453;
        this.f39647 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12344)) {
            return false;
        }
        C12344 c12344 = (C12344) obj;
        return this.f39647 == c12344.f39647 && C17359.equals(this.f39646, c12344.f39646);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f39646) + (this.f39647 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f39646, Integer.valueOf(this.f39647)};
        String[] strArrSplit = "future;length".length() == 0 ? new String[0] : "future;length".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C12344.class, sb, "[");
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
