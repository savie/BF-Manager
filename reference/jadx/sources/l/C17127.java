package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܿۙ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes4.dex */
public final class C17127 extends AbstractC17535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f54614;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f54615;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f54616;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f54617;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f54618;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f54619;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f54620;

    public C17127(int i, int i2, boolean z, boolean z2, boolean z3, long j, long j2) {
        this.f54615 = i;
        this.f54620 = i2;
        this.f54616 = z;
        this.f54618 = z2;
        this.f54617 = z3;
        this.f54619 = j;
        this.f54614 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17127)) {
            return false;
        }
        C17127 c17127 = (C17127) obj;
        return this.f54616 == c17127.f54616 && this.f54618 == c17127.f54618 && this.f54617 == c17127.f54617 && this.f54615 == c17127.f54615 && this.f54620 == c17127.f54620 && this.f54619 == c17127.f54619 && this.f54614 == c17127.f54614;
    }

    public final int hashCode() {
        int i = (((((((((this.f54616 ? 1231 : 1237) * 31) + (this.f54618 ? 1231 : 1237)) * 31) + (this.f54617 ? 1231 : 1237)) * 31) + this.f54615) * 31) + this.f54620) * 31;
        long j = this.f54619;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f54614;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f54615), Integer.valueOf(this.f54620), Boolean.valueOf(this.f54616), Boolean.valueOf(this.f54618), Boolean.valueOf(this.f54617), Long.valueOf(this.f54619), Long.valueOf(this.f54614)};
        String[] strArrSplit = "height;length;any;firstValue;lastValue;bitmapBytes;retainedBytes".length() == 0 ? new String[0] : "height;length;any;firstValue;lastValue;bitmapBytes;retainedBytes".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C17127.class, sb, "[");
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
