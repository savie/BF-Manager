package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֨ܺۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: C766 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1282 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C9007 f4595;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f4596;

    public C1282(C9007 c9007, long j) {
        this.f4595 = c9007;
        this.f4596 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1282)) {
            return false;
        }
        C1282 c1282 = (C1282) obj;
        return this.f4596 == c1282.f4596 && C17359.equals(this.f4595, c1282.f4595);
    }

    public final int hashCode() {
        long j = this.f4596;
        return C17359.hashCode(this.f4595) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f4595, Long.valueOf(this.f4596)};
        String[] strArrSplit = "mapping;targetVirtualAddress".length() == 0 ? new String[0] : "mapping;targetVirtualAddress".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C1282.class, sb, "[");
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
