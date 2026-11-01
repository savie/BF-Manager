package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes3.dex */
public final class C4572 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f16218;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f16219;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f16220;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f16221;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f16222;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f16223;

    public C4572(long j, int i, long j2, long j3, boolean z, boolean z2) {
        this.f16218 = j;
        this.f16221 = i;
        this.f16222 = j2;
        this.f16220 = j3;
        this.f16223 = z;
        this.f16219 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4572)) {
            return false;
        }
        C4572 c4572 = (C4572) obj;
        return this.f16223 == c4572.f16223 && this.f16219 == c4572.f16219 && this.f16221 == c4572.f16221 && this.f16218 == c4572.f16218 && this.f16222 == c4572.f16222 && this.f16220 == c4572.f16220;
    }

    public final int hashCode() {
        int i = (((((this.f16223 ? 1231 : 1237) * 31) + (this.f16219 ? 1231 : 1237)) * 31) + this.f16221) * 31;
        long j = this.f16218;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f16222;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f16220;
        return i3 + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f16218), Integer.valueOf(this.f16221), Long.valueOf(this.f16222), Long.valueOf(this.f16220), Boolean.valueOf(this.f16223), Boolean.valueOf(this.f16219)};
        String[] strArrSplit = "offset;crc;compressedSize;size;zip64Sizes;allow32BitSizes".length() == 0 ? new String[0] : "offset;crc;compressedSize;size;zip64Sizes;allow32BitSizes".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C4572.class, sb, "[");
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
