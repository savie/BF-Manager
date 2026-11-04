package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۜᩳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66IZ */
/* JADX INFO: loaded from: classes4.dex */
public final class C7320 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f24113;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f24114;

    public C7320(String str, int i) {
        this.f24114 = str;
        this.f24113 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7320)) {
            return false;
        }
        C7320 c7320 = (C7320) obj;
        return this.f24113 == c7320.f24113 && C17359.equals(this.f24114, c7320.f24114);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f24114) + (this.f24113 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f24114, Integer.valueOf(this.f24113)};
        String[] strArrSplit = "name;error".length() == 0 ? new String[0] : "name;error".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C7320.class, sb, "[");
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
