package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۛ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 16WT */
/* JADX INFO: loaded from: classes3.dex */
public final class C6635 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f22161;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f22162;

    public final int hashCode() {
        long j = this.f22162;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f22161;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C6635(long j, long j2) {
        this.f22162 = j;
        this.f22161 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6635)) {
            return false;
        }
        C6635 c6635 = (C6635) obj;
        return this.f22162 == c6635.f22162 && this.f22161 == c6635.f22161;
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f22162), Long.valueOf(this.f22161)};
        String[] strArrSplit = "line;column".length() == 0 ? new String[0] : "line;column".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C6635.class, sb, "[");
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
    public final long m18574() {
        return this.f22161;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m18575() {
        return this.f22162;
    }
}
