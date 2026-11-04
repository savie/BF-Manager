package l;

import com.alipay.sdk.m.y.l;
import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۬᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6MY */
/* JADX INFO: loaded from: classes4.dex */
public final class C14145 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f44729;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f44730;

    public C14145(ArrayList arrayList, int i) {
        this.f44729 = arrayList;
        this.f44730 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14145)) {
            return false;
        }
        C14145 c14145 = (C14145) obj;
        return this.f44730 == c14145.f44730 && C17359.equals(this.f44729, c14145.f44729);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f44729) + (this.f44730 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f44729, Integer.valueOf(this.f44730)};
        String[] strArrSplit = "parts;rows".length() == 0 ? new String[0] : "parts;rows".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C14145.class, sb, "[");
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

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final List m34358() {
        return this.f44729;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m34357() {
        return ((C5109) C7750.m21093(1, this.f44729)).f17813;
    }
}
