package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܽ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17208 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f56059;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f56060;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f56061;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final long f56062;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f56063;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f56064;

    public C17208(long j, long j2, long j3, String str, int i, long j4) {
        this.f56062 = j;
        this.f56063 = j2;
        this.f56059 = j3;
        this.f56061 = str;
        this.f56064 = i;
        this.f56060 = j4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17208)) {
            return false;
        }
        C17208 c17208 = (C17208) obj;
        return this.f56064 == c17208.f56064 && this.f56062 == c17208.f56062 && this.f56063 == c17208.f56063 && this.f56059 == c17208.f56059 && this.f56060 == c17208.f56060 && C17359.equals(this.f56061, c17208.f56061);
    }

    public final int hashCode() {
        int i = this.f56064 * 31;
        long j = this.f56062;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f56063;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f56059;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f56060;
        return C17359.hashCode(this.f56061) + ((i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f56062), Long.valueOf(this.f56063), Long.valueOf(this.f56059), this.f56061, Integer.valueOf(this.f56064), Long.valueOf(this.f56060)};
        String[] strArrSplit = "number;byteStart;byteEnd;text;contentLength;column".length() == 0 ? new String[0] : "number;byteStart;byteEnd;text;contentLength;column".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C17208.class, sb, "[");
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
    public final long m40423() {
        return this.f56059;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m40425() {
        return this.f56061;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m40426() {
        return this.f56060;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final long m40427() {
        return this.f56062;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m40428() {
        return this.f56064;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m40429() {
        return this.f56063;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17208 m40424(int i) {
        String str = this.f56061;
        if (str.length() <= i) {
            return this;
        }
        int length = str.length() - i;
        if (length > 0 && Character.isLowSurrogate(str.charAt(length))) {
            length++;
        }
        if (length > 0 && str.charAt(length - 1) == '\r' && str.charAt(length) == '\n') {
            length++;
        }
        return new C17208(this.f56062, this.f56063, this.f56059, str.substring(length), Math.max(0, this.f56064 - length), this.f56060 + ((long) str.codePointCount(0, length)));
    }
}
