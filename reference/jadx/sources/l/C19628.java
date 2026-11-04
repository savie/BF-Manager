package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩴۛܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: W261 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19628 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f63245;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f63246;

    public final int hashCode() {
        long j = this.f63246;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f63245;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C19628(long j, long j2) {
        this.f63246 = j;
        this.f63245 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19628)) {
            return false;
        }
        C19628 c19628 = (C19628) obj;
        return this.f63246 == c19628.f63246 && this.f63245 == c19628.f63245;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f63246), Long.valueOf(this.f63245)};
        String[] strArrSplit = "minTime;maxTime".length() == 0 ? new String[0] : "minTime;maxTime".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C19628.class, sb, "[");
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
    public final boolean m45272(long j) {
        return this.f63246 <= j && j < this.f63245;
    }
}
