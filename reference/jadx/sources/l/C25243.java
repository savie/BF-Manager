package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩻ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes.dex */
public final class C25243 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f81562;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f81563;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long f81564;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f81565;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f81566;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f81567;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f81568;

    public C25243(int i, int i2, boolean z, boolean z2, boolean z3, long j, long j2) {
        this.f81568 = i;
        this.f81565 = i2;
        this.f81562 = z;
        this.f81563 = z2;
        this.f81566 = z3;
        this.f81567 = j;
        this.f81564 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C25243)) {
            return false;
        }
        C25243 c25243 = (C25243) obj;
        return this.f81562 == c25243.f81562 && this.f81563 == c25243.f81563 && this.f81566 == c25243.f81566 && this.f81568 == c25243.f81568 && this.f81565 == c25243.f81565 && this.f81567 == c25243.f81567 && this.f81564 == c25243.f81564;
    }

    public final int hashCode() {
        int i = (((((((((this.f81562 ? 1231 : 1237) * 31) + (this.f81563 ? 1231 : 1237)) * 31) + (this.f81566 ? 1231 : 1237)) * 31) + this.f81568) * 31) + this.f81565) * 31;
        long j = this.f81567;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f81564;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f81568), Integer.valueOf(this.f81565), Boolean.valueOf(this.f81562), Boolean.valueOf(this.f81563), Boolean.valueOf(this.f81566), Long.valueOf(this.f81567), Long.valueOf(this.f81564)};
        String[] strArrSplit = "height;length;any;firstValue;lastValue;bitmapBytes;retainedBytes".length() == 0 ? new String[0] : "height;length;any;firstValue;lastValue;bitmapBytes;retainedBytes".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C25243.class, sb, "[");
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
