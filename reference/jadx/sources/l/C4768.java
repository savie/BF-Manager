package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۙ۠ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 26C0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4768 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19684 f16723;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1345 f16724;

    public C4768(C1345 c1345, C19684 c19684) {
        this.f16724 = c1345;
        this.f16723 = c19684;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4768)) {
            return false;
        }
        C4768 c4768 = (C4768) obj;
        return C17359.equals(this.f16724, c4768.f16724) && C17359.equals(this.f16723, c4768.f16723);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f16723) + (C17359.hashCode(this.f16724) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f16724, this.f16723};
        String[] strArrSplit = "type;handler".length() == 0 ? new String[0] : "type;handler".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C4768.class, sb, "[");
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
    public final C19684 m14718() {
        return this.f16723;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C1345 m14719() {
        return this.f16724;
    }
}
