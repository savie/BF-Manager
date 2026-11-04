package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܳ᩸᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: PB28 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15640 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f50784;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final byte[] f50785;

    public C15640(int i, byte[] bArr) {
        this.f50784 = i;
        this.f50785 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15640)) {
            return false;
        }
        C15640 c15640 = (C15640) obj;
        return this.f50784 == c15640.f50784 && C17359.equals(this.f50785, c15640.f50785);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f50785) + (this.f50784 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f50784), this.f50785};
        String[] strArrSplit = "algorithmId;signature".length() == 0 ? new String[0] : "algorithmId;signature".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C15640.class, sb, "[");
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
