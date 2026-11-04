package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֡۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: N9ZJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C0279 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18178 f1582;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC16686 f1583;

    public C0279(C18178 c18178, EnumC16686 enumC16686) {
        this.f1582 = c18178;
        this.f1583 = enumC16686;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0279)) {
            return false;
        }
        C0279 c0279 = (C0279) obj;
        return C17359.equals(this.f1582, c0279.f1582) && C17359.equals(this.f1583, c0279.f1583);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f1583) + (C17359.hashCode(this.f1582) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f1582, this.f1583};
        String[] strArrSplit = "context;state".length() == 0 ? new String[0] : "context;state".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C0279.class, sb, "[");
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
