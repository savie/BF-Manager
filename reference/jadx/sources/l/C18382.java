package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܿܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 3B3L */
/* JADX INFO: loaded from: classes5.dex */
public final class C18382 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f59886;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17636 f59887;

    public C18382(boolean z, C17636 c17636) {
        this.f59886 = z;
        this.f59887 = c17636;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18382)) {
            return false;
        }
        C18382 c18382 = (C18382) obj;
        return this.f59886 == c18382.f59886 && C17359.equals(this.f59887, c18382.f59887);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f59887) + ((this.f59886 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f59886), this.f59887};
        String[] strArrSplit = "active;inactive".length() == 0 ? new String[0] : "active;inactive".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C18382.class, sb, "[");
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
