package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۫ۚܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AG9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12895 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f41243;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f41244;

    public C12895(int i, int i2) {
        this.f41244 = i;
        this.f41243 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12895)) {
            return false;
        }
        C12895 c12895 = (C12895) obj;
        return this.f41244 == c12895.f41244 && this.f41243 == c12895.f41243;
    }

    public final int hashCode() {
        return (this.f41244 * 31) + this.f41243;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f41244), Integer.valueOf(this.f41243)};
        String[] strArrSplit = "revealStart;revealEnd".length() == 0 ? new String[0] : "revealStart;revealEnd".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C12895.class, sb, "[");
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
    public final int m31936() {
        return this.f41243;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m31937() {
        return this.f41244;
    }
}
