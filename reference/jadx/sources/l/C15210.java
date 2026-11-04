package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܳ۠ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4748 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15210 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f49640;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f49641;

    public final int hashCode() {
        int i = this.f49641 ? 1231 : 1237;
        long j = this.f49640;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public C15210(long j, boolean z) {
        this.f49641 = z;
        this.f49640 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15210)) {
            return false;
        }
        C15210 c15210 = (C15210) obj;
        return this.f49641 == c15210.f49641 && this.f49640 == c15210.f49640;
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f49641), Long.valueOf(this.f49640)};
        String[] strArrSplit = "rangeSupported;documentLength".length() == 0 ? new String[0] : "rangeSupported;documentLength".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C15210.class, sb, "[");
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
    public final long m36557() {
        return this.f49640;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m36558() {
        return this.f49641;
    }
}
