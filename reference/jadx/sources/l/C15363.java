package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܳ۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15363 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f50118;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f50119;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f50120;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C13035 f50121;

    public C15363(int i, long j, C13035 c13035, byte[] bArr) {
        this.f50118 = bArr;
        this.f50119 = i;
        this.f50120 = j;
        this.f50121 = c13035;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15363)) {
            return false;
        }
        C15363 c15363 = (C15363) obj;
        return this.f50119 == c15363.f50119 && this.f50120 == c15363.f50120 && C17359.equals(this.f50118, c15363.f50118) && C17359.equals(this.f50121, c15363.f50121);
    }

    public final int hashCode() {
        int i = this.f50119 * 31;
        long j = this.f50120;
        return C17359.hashCode(this.f50121) + ((C17359.hashCode(this.f50118) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f50118, Integer.valueOf(this.f50119), Long.valueOf(this.f50120), this.f50121};
        String[] strArrSplit = "data;length;keyframeTimeUs;reservation".length() == 0 ? new String[0] : "data;length;keyframeTimeUs;reservation".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C15363.class, sb, "[");
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
