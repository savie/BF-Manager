package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܿۛ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: KAHM */
/* JADX INFO: loaded from: classes5.dex */
public final class C18135 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f59308;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f59309;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f59310;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f59311;

    public C18135(boolean z, long j, long j2, String str) {
        this.f59310 = z;
        this.f59311 = j;
        this.f59309 = j2;
        this.f59308 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18135)) {
            return false;
        }
        C18135 c18135 = (C18135) obj;
        return this.f59310 == c18135.f59310 && this.f59311 == c18135.f59311 && this.f59309 == c18135.f59309 && C17359.equals(this.f59308, c18135.f59308);
    }

    public final int hashCode() {
        int i = this.f59310 ? 1231 : 1237;
        long j = this.f59311;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f59309;
        return C17359.hashCode(this.f59308) + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f59310), Long.valueOf(this.f59311), Long.valueOf(this.f59309), this.f59308};
        String[] strArrSplit = "lan;warmupMillis;splitTimeThresholdSeconds;downloadHost".length() == 0 ? new String[0] : "lan;warmupMillis;splitTimeThresholdSeconds;downloadHost".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C18135.class, sb, "[");
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
    public final long m42248() {
        return this.f59309;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m42249() {
        return this.f59311;
    }
}
