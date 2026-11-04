package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۧᩳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: N6TT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11801 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f38117;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Object f38118;

    public C11801(int i, Object obj) {
        this.f38117 = i;
        this.f38118 = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11801)) {
            return false;
        }
        C11801 c11801 = (C11801) obj;
        return this.f38117 == c11801.f38117 && C17359.equals(this.f38118, c11801.f38118);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f38118) + (this.f38117 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f38117), this.f38118};
        String[] strArrSplit = "type;value".length() == 0 ? new String[0] : "type;value".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C11801.class, sb, "[");
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
