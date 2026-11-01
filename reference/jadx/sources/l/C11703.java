package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۨ۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes4.dex */
public final class C11703 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f39335;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f39336;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f39337;

    public C11703(int i, String str, String str2) {
        this.f39336 = str;
        this.f39335 = str2;
        this.f39337 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11703)) {
            return false;
        }
        C11703 c11703 = (C11703) obj;
        return this.f39337 == c11703.f39337 && C13638.equals(this.f39336, c11703.f39336) && C13638.equals(this.f39335, c11703.f39335);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f39335) + C0589.m2789(this.f39337 * 31, 31, this.f39336);
    }

    public final String toString() {
        Object[] objArr = {this.f39336, this.f39335, Integer.valueOf(this.f39337)};
        String[] strArrSplit = "suffix;mimeType;priority".length() == 0 ? new String[0] : "suffix;mimeType;priority".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C11703.class, sb, "[");
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m29213() {
        return this.f39336;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m29214() {
        return this.f39335;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m29215() {
        return this.f39337;
    }

    public C11703(String str, String str2) {
        this(Integer.MAX_VALUE, str, str2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11703 m29212(C11703 c11703, int i) {
        return c11703.f39337 == i ? c11703 : new C11703(i, c11703.f39336, c11703.f39335);
    }
}
