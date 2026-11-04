package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩳ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19345 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C10394 f62505;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C7412 f62506;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC9648 f62507;

    public C19345(C10394 c10394, C7412 c7412, EnumC9648 enumC9648) {
        this.f62505 = c10394;
        this.f62506 = c7412;
        this.f62507 = enumC9648;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19345)) {
            return false;
        }
        C19345 c19345 = (C19345) obj;
        return C17359.equals(this.f62505, c19345.f62505) && C17359.equals(this.f62506, c19345.f62506) && C17359.equals(this.f62507, c19345.f62507);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f62507) + ((C17359.hashCode(this.f62506) + (C17359.hashCode(this.f62505) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f62505, this.f62506, this.f62507};
        String[] strArrSplit = "request;store;state".length() == 0 ? new String[0] : "request;store;state".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C19345.class, sb, "[");
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
