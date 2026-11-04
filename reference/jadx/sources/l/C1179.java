package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֨۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes3.dex */
public final class C1179 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f4313;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f4314;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f4315;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f4316;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f4317;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f4318;

    public C1179(int i, int i2, int i3, long j, boolean z, boolean z2) {
        this.f4314 = i;
        this.f4316 = i2;
        this.f4318 = i3;
        this.f4315 = j;
        this.f4313 = z;
        this.f4317 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1179)) {
            return false;
        }
        C1179 c1179 = (C1179) obj;
        return this.f4313 == c1179.f4313 && this.f4317 == c1179.f4317 && this.f4314 == c1179.f4314 && this.f4316 == c1179.f4316 && this.f4318 == c1179.f4318 && this.f4315 == c1179.f4315;
    }

    public final int hashCode() {
        int i = (((((((((this.f4313 ? 1231 : 1237) * 31) + (this.f4317 ? 1231 : 1237)) * 31) + this.f4314) * 31) + this.f4316) * 31) + this.f4318) * 31;
        long j = this.f4315;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f4314), Integer.valueOf(this.f4316), Integer.valueOf(this.f4318), Long.valueOf(this.f4315), Boolean.valueOf(this.f4313), Boolean.valueOf(this.f4317)};
        String[] strArrSplit = "height;length;leaves;patchBytes;allDelta;allMemory".length() == 0 ? new String[0] : "height;length;leaves;patchBytes;allDelta;allMemory".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C1179.class, sb, "[");
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
