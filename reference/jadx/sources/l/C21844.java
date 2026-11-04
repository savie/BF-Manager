package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩷ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes.dex */
public final class C21844 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8636 f69600;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13856 f69601;

    public C21844(C13856 c13856, C8636 c8636) {
        this.f69601 = c13856;
        this.f69600 = c8636;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21844)) {
            return false;
        }
        C21844 c21844 = (C21844) obj;
        return C17359.equals(this.f69601, c21844.f69601) && C17359.equals(this.f69600, c21844.f69600);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f69600) + (C17359.hashCode(this.f69601) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f69601, this.f69600};
        String[] strArrSplit = "rest;extent".length() == 0 ? new String[0] : "rest;extent".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C21844.class, sb, "[");
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
