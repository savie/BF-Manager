package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۧ۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 47G4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11465 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f36049;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC16686 f36050;

    public C11465(EnumC16686 enumC16686, boolean z) {
        this.f36050 = enumC16686;
        this.f36049 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11465)) {
            return false;
        }
        C11465 c11465 = (C11465) obj;
        return this.f36049 == c11465.f36049 && C17359.equals(this.f36050, c11465.f36050);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f36050) + ((this.f36049 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f36050, Boolean.valueOf(this.f36049)};
        String[] strArrSplit = "state;stale".length() == 0 ? new String[0] : "state;stale".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C11465.class, sb, "[");
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28821() {
        return this.f36049;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC16686 m28822() {
        return this.f36050;
    }
}
