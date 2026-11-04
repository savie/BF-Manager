package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܰ֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes5.dex */
public final class C14229 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f44958;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C23533 f44959;

    public C14229(C23533 c23533, String str) {
        this.f44959 = c23533;
        this.f44958 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14229)) {
            return false;
        }
        C14229 c14229 = (C14229) obj;
        return C17359.equals(this.f44959, c14229.f44959) && C17359.equals(this.f44958, c14229.f44958);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f44958) + (C17359.hashCode(this.f44959) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f44959, this.f44958};
        String[] strArrSplit = "share;path".length() == 0 ? new String[0] : "share;path".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C14229.class, sb, "[");
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
