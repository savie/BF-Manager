package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܺܳ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: D6JB */
/* JADX INFO: loaded from: classes5.dex */
public final class C16912 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f55306;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC25118 f55307;

    public C16912(String str, EnumC25118 enumC25118) {
        this.f55306 = str;
        this.f55307 = enumC25118;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16912)) {
            return false;
        }
        C16912 c16912 = (C16912) obj;
        return C17359.equals(this.f55306, c16912.f55306) && C17359.equals(this.f55307, c16912.f55307);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f55307) + (C17359.hashCode(this.f55306) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f55306, this.f55307};
        String[] strArrSplit = "archiveName;kind".length() == 0 ? new String[0] : "archiveName;kind".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C16912.class, sb, "[");
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
    public final String m39897() {
        return this.f55306;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC25118 m39898() {
        return this.f55307;
    }
}
