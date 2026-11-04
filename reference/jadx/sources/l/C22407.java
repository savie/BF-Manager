package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩷᩻ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E762 */
/* JADX INFO: loaded from: classes.dex */
public final class C22407 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f72580;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f72581;

    public C22407(String str, String str2) {
        this.f72581 = str;
        this.f72580 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22407)) {
            return false;
        }
        C22407 c22407 = (C22407) obj;
        return C17359.equals(this.f72581, c22407.f72581) && C17359.equals(this.f72580, c22407.f72580);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f72580) + (C17359.hashCode(this.f72581) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f72581, this.f72580};
        String[] strArrSplit = "locator;entryName".length() == 0 ? new String[0] : "locator;entryName".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C22407.class, sb, "[");
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
