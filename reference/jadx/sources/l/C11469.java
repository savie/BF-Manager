package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۨۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11469 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean f38613;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f38614;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f38615;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f38616;

    public C11469(String str, int i, boolean z, boolean z2) {
        this.f38615 = str;
        this.f38613 = z;
        this.f38614 = z2;
        this.f38616 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11469)) {
            return false;
        }
        C11469 c11469 = (C11469) obj;
        return this.f38613 == c11469.f38613 && this.f38614 == c11469.f38614 && this.f38616 == c11469.f38616 && C13638.equals(this.f38615, c11469.f38615);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f38615) + ((((((this.f38613 ? 1231 : 1237) * 31) + (this.f38614 ? 1231 : 1237)) * 31) + this.f38616) * 31);
    }

    public final int size() {
        return this.f38616;
    }

    public final String toString() {
        Object[] objArr = {this.f38615, Boolean.valueOf(this.f38613), Boolean.valueOf(this.f38614), Integer.valueOf(this.f38616)};
        String[] strArrSplit = "text;warning;searching;size".length() == 0 ? new String[0] : "text;warning;searching;size".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C11469.class, sb, "[");
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
    public final boolean m28658() {
        return this.f38613;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m28659() {
        return this.f38614;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m28660() {
        return this.f38615;
    }
}
