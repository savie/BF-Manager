package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܺܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C16905 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC22808 f55287;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13856 f55288;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ InterfaceC22808 m39885(C16905 c16905) {
        return c16905.f55287;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C13856 m39886(C16905 c16905) {
        return c16905.f55288;
    }

    public C16905(C13856 c13856, InterfaceC22808 interfaceC22808) {
        this.f55288 = c13856;
        this.f55287 = interfaceC22808;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16905)) {
            return false;
        }
        C16905 c16905 = (C16905) obj;
        return C17359.equals(this.f55288, c16905.f55288) && C17359.equals(this.f55287, c16905.f55287);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f55287) + (C17359.hashCode(this.f55288) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f55288, this.f55287};
        String[] strArrSplit = "spans;creatorLease".length() == 0 ? new String[0] : "spans;creatorLease".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C16905.class, sb, "[");
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
