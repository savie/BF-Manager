package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۜܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes4.dex */
public final class C7195 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f23748;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5156 f23749;

    public C7195(C5156 c5156, int i) {
        this.f23749 = c5156;
        this.f23748 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7195)) {
            return false;
        }
        C7195 c7195 = (C7195) obj;
        return this.f23748 == c7195.f23748 && C17359.equals(this.f23749, c7195.f23749);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f23749) + (this.f23748 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f23749, Integer.valueOf(this.f23748)};
        String[] strArrSplit = "source;charset".length() == 0 ? new String[0] : "source;charset".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C7195.class, sb, "[");
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
