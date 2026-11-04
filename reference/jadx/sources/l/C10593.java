package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۤۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: J703 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10593 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f33624;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f33625;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f33626;

    public C10593(int i, int i2, int i3) {
        this.f33625 = i;
        this.f33626 = i2;
        this.f33624 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10593)) {
            return false;
        }
        C10593 c10593 = (C10593) obj;
        return this.f33625 == c10593.f33625 && this.f33626 == c10593.f33626 && this.f33624 == c10593.f33624;
    }

    public final int hashCode() {
        return (((this.f33625 * 31) + this.f33626) * 31) + this.f33624;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f33625), Integer.valueOf(this.f33626), Integer.valueOf(this.f33624)};
        String[] strArrSplit = "oldStart;oldEnd;newLength".length() == 0 ? new String[0] : "oldStart;oldEnd;newLength".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C10593.class, sb, "[");
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
