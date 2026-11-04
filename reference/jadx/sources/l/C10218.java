package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۢܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10218 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC19169 f32660;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final AbstractC19169 f32661;

    public C10218(AbstractC19169 abstractC19169, AbstractC19169 abstractC191610) {
        this.f32660 = abstractC19169;
        this.f32661 = abstractC191610;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10218)) {
            return false;
        }
        C10218 c10218 = (C10218) obj;
        return C17359.equals(this.f32660, c10218.f32660) && C17359.equals(this.f32661, c10218.f32661);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f32661) + (C17359.hashCode(this.f32660) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f32660, this.f32661};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C10218.class, sb, "[");
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
