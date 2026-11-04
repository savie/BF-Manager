package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۙۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes3.dex */
public final class C4690 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13856 f16565;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f16566;

    public C4690(C13856 c13856, boolean z) {
        this.f16565 = c13856;
        this.f16566 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4690)) {
            return false;
        }
        C4690 c4690 = (C4690) obj;
        return this.f16566 == c4690.f16566 && C17359.equals(this.f16565, c4690.f16565);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f16565) + ((this.f16566 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f16565, Boolean.valueOf(this.f16566)};
        String[] strArrSplit = "node;removedPatternIdentity".length() == 0 ? new String[0] : "node;removedPatternIdentity".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C4690.class, sb, "[");
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
    public final C13856 m14565() {
        return this.f16565;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m14566() {
        return this.f16566;
    }
}
