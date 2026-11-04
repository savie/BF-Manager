package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۙܽܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes3.dex */
public final class C5041 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f17458;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f17459;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f17460;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f17461;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f17462;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f17463;

    public C5041(long j, int i, long j2, long j3, boolean z, boolean z2) {
        this.f17463 = j;
        this.f17459 = i;
        this.f17462 = j2;
        this.f17461 = j3;
        this.f17460 = z;
        this.f17458 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5041)) {
            return false;
        }
        C5041 c5041 = (C5041) obj;
        return this.f17460 == c5041.f17460 && this.f17458 == c5041.f17458 && this.f17459 == c5041.f17459 && this.f17463 == c5041.f17463 && this.f17462 == c5041.f17462 && this.f17461 == c5041.f17461;
    }

    public final int hashCode() {
        int i = (((((this.f17460 ? 1231 : 1237) * 31) + (this.f17458 ? 1231 : 1237)) * 31) + this.f17459) * 31;
        long j = this.f17463;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f17462;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f17461;
        return i3 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f17463), Integer.valueOf(this.f17459), Long.valueOf(this.f17462), Long.valueOf(this.f17461), Boolean.valueOf(this.f17460), Boolean.valueOf(this.f17458)};
        String[] strArrSplit = "offset;crc;compressedSize;size;zip64Sizes;allow32BitSizes".length() == 0 ? new String[0] : "offset;crc;compressedSize;size;zip64Sizes;allow32BitSizes".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C5041.class, sb, "[");
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
