package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩴᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: S6V7 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18924 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f61227;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f61228;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final long f61229;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f61230;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f61231;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f61232;

    public C18924(long j, long j2, long j3, String str, int i, long j4) {
        this.f61229 = j;
        this.f61231 = j2;
        this.f61228 = j3;
        this.f61232 = str;
        this.f61227 = i;
        this.f61230 = j4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18924)) {
            return false;
        }
        C18924 c18924 = (C18924) obj;
        return this.f61227 == c18924.f61227 && this.f61229 == c18924.f61229 && this.f61231 == c18924.f61231 && this.f61228 == c18924.f61228 && this.f61230 == c18924.f61230 && C13638.equals(this.f61232, c18924.f61232);
    }

    public final int hashCode() {
        int i = this.f61227 * 31;
        long j = this.f61229;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f61231;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f61228;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f61230;
        return C13638.hashCode(this.f61232) + ((i4 + ((int) (j4 ^ (j4 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f61229), Long.valueOf(this.f61231), Long.valueOf(this.f61228), this.f61232, Integer.valueOf(this.f61227), Long.valueOf(this.f61230)};
        String[] strArrSplit = "number;byteStart;byteEnd;text;contentLength;column".length() == 0 ? new String[0] : "number;byteStart;byteEnd;text;contentLength;column".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C18924.class, sb, "[");
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long m43587() {
        return this.f61229;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long m43588() {
        return this.f61230;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m43589() {
        return this.f61228;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long m43591() {
        return this.f61231;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final String m43592() {
        return this.f61232;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m43593() {
        return this.f61227;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18924 m43590(int i) {
        String str = this.f61232;
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
        return new C18924(this.f61229, this.f61231, this.f61228, str.substring(length), Math.max(0, this.f61227 - length), this.f61230 + ((long) str.codePointCount(0, length)));
    }
}
