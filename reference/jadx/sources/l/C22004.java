package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹ۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes.dex */
public final class C22004 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f71344;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f71345;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f71346;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f71347;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f71348;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f71349;

    public C22004(int i, int i2, int i3, long j, boolean z, boolean z2) {
        this.f71347 = i;
        this.f71346 = i2;
        this.f71344 = i3;
        this.f71349 = j;
        this.f71345 = z;
        this.f71348 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22004)) {
            return false;
        }
        C22004 c22004 = (C22004) obj;
        return this.f71345 == c22004.f71345 && this.f71348 == c22004.f71348 && this.f71347 == c22004.f71347 && this.f71346 == c22004.f71346 && this.f71344 == c22004.f71344 && this.f71349 == c22004.f71349;
    }

    public final int hashCode() {
        int i = (((((((((this.f71345 ? 1231 : 1237) * 31) + (this.f71348 ? 1231 : 1237)) * 31) + this.f71347) * 31) + this.f71346) * 31) + this.f71344) * 31;
        long j = this.f71349;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f71347), Integer.valueOf(this.f71346), Integer.valueOf(this.f71344), Long.valueOf(this.f71349), Boolean.valueOf(this.f71345), Boolean.valueOf(this.f71348)};
        String[] strArrSplit = "height;length;leaves;patchBytes;allDelta;allMemory".length() == 0 ? new String[0] : "height;length;leaves;patchBytes;allDelta;allMemory".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C22004.class, sb, "[");
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
