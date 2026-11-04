package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۟ۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6N8 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7655 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C0197 f25226;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C0197 f25227;

    public C7655(C0197 c0197, C0197 c0198) {
        this.f25226 = c0197;
        this.f25227 = c0198;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7655)) {
            return false;
        }
        C7655 c7655 = (C7655) obj;
        return C17359.equals(this.f25226, c7655.f25226) && C17359.equals(this.f25227, c7655.f25227);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f25227) + (C17359.hashCode(this.f25226) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f25226, this.f25227};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C7655.class, sb, "[");
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
