package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܳۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: X6PO */
/* JADX INFO: loaded from: classes5.dex */
public final class C15314 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f50053;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f50054;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f50055;

    public C15314(int i, int i2, boolean z) {
        this.f50054 = i;
        this.f50055 = i2;
        this.f50053 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15314)) {
            return false;
        }
        C15314 c15314 = (C15314) obj;
        return this.f50053 == c15314.f50053 && this.f50054 == c15314.f50054 && this.f50055 == c15314.f50055;
    }

    public final int hashCode() {
        return ((((this.f50053 ? 1231 : 1237) * 31) + this.f50054) * 31) + this.f50055;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f50054), Integer.valueOf(this.f50055), Boolean.valueOf(this.f50053)};
        String[] strArrSplit = "start;end;complete".length() == 0 ? new String[0] : "start;end;complete".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C15314.class, sb, "[");
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
