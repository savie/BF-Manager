package l;

import com.alipay.sdk.m.y.l;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֡ۛ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes3.dex */
public final class C0236 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f1498;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List f1499;

    public C0236(List list, List list2) {
        this.f1499 = list;
        this.f1498 = list2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0236)) {
            return false;
        }
        C0236 c0236 = (C0236) obj;
        return C17359.equals(this.f1499, c0236.f1499) && C17359.equals(this.f1498, c0236.f1498);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f1498) + (C17359.hashCode(this.f1499) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f1499, this.f1498};
        String[] strArrSplit = "uidList;gidList".length() == 0 ? new String[0] : "uidList;gidList".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C0236.class, sb, "[");
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
    public final List m1716() {
        return this.f1498;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m1717() {
        return this.f1499;
    }
}
