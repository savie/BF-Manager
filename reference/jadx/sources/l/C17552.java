package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܽۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17552 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2353 f57046;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f57047;

    public C17552() {
        throw null;
    }

    public C17552(ArrayList arrayList, C2353 c2353) {
        this.f57047 = arrayList;
        this.f57046 = c2353;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17552)) {
            return false;
        }
        C17552 c17552 = (C17552) obj;
        return C17359.equals(this.f57047, c17552.f57047) && C17359.equals(this.f57046, c17552.f57046);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f57046) + (C17359.hashCode(this.f57047) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f57047, this.f57046};
        String[] strArrSplit = "tokens;root".length() == 0 ? new String[0] : "tokens;root".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C17552.class, sb, "[");
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
