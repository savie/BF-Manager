package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֫᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46W4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2160 extends AbstractC2323 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f7117;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f7118;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f7119;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f7120;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final String f7121;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final Long f7122;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f7123;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Long f7124;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f7125;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f7126;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean f7127;

    public C2160(String str, boolean z, boolean z2, boolean z3, long j, long j2, Long l2, Long l3, String str2, boolean z4, boolean z5) {
        this.f7121 = str;
        this.f7127 = z;
        this.f7126 = z2;
        this.f7117 = z3;
        this.f7119 = j;
        this.f7123 = j2;
        this.f7122 = l2;
        this.f7124 = l3;
        this.f7125 = str2;
        this.f7120 = z4;
        this.f7118 = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2160)) {
            return false;
        }
        C2160 c2160 = (C2160) obj;
        return this.f7127 == c2160.f7127 && this.f7126 == c2160.f7126 && this.f7117 == c2160.f7117 && this.f7120 == c2160.f7120 && this.f7118 == c2160.f7118 && this.f7119 == c2160.f7119 && this.f7123 == c2160.f7123 && C17359.equals(this.f7121, c2160.f7121) && C17359.equals(this.f7122, c2160.f7122) && C17359.equals(this.f7124, c2160.f7124) && C17359.equals(this.f7125, c2160.f7125);
    }

    public final int hashCode() {
        int i = (((((((this.f7127 ? 1231 : 1237) * 31) + (this.f7126 ? 1231 : 1237)) * 31) + (this.f7117 ? 1231 : 1237)) * 31) + (this.f7120 ? 1231 : 1237)) * 31;
        int i2 = this.f7118 ? 1231 : 1237;
        long j = this.f7119;
        int i3 = (((i + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f7123;
        return C17359.hashCode(this.f7125) + ((C17359.hashCode(this.f7124) + ((C17359.hashCode(this.f7122) + C24966.m55771((i3 + ((int) (j2 ^ (j2 >>> 32)))) * 31, 31, this.f7121)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f7121, Boolean.valueOf(this.f7127), Boolean.valueOf(this.f7126), Boolean.valueOf(this.f7117), Long.valueOf(this.f7119), Long.valueOf(this.f7123), this.f7122, this.f7124, this.f7125, Boolean.valueOf(this.f7120), Boolean.valueOf(this.f7118)};
        String[] strArrSplit = "namePattern;nameRegex;exactName;nameCaseSensitive;minSize;maxSize;minModifiedAt;maxModifiedAt;contentPattern;contentRegex;contentCaseSensitive".length() == 0 ? new String[0] : "namePattern;nameRegex;exactName;nameCaseSensitive;minSize;maxSize;minModifiedAt;maxModifiedAt;contentPattern;contentRegex;contentCaseSensitive".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C2160.class, sb, "[");
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
