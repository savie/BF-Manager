package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۠ܰۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6Y6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8673 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f28320;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f28321;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f28322;

    public C8673(String str, String str2, String str3) {
        this.f28321 = str;
        this.f28322 = str2;
        this.f28320 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8673)) {
            return false;
        }
        C8673 c8673 = (C8673) obj;
        return C17359.equals(this.f28321, c8673.f28321) && C17359.equals(this.f28322, c8673.f28322) && C17359.equals(this.f28320, c8673.f28320);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f28320) + C24966.m55771(C17359.hashCode(this.f28321) * 31, 31, this.f28322);
    }

    public final String toString() {
        Object[] objArr = {this.f28321, this.f28322, this.f28320};
        String[] strArrSplit = "traversalId;policyRevision;directoryPath".length() == 0 ? new String[0] : "traversalId;policyRevision;directoryPath".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C8673.class, sb, "[");
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
