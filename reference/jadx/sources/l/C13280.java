package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۬ᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X6VB */
/* JADX INFO: loaded from: classes4.dex */
public final class C13280 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f44100;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f44101;

    public C13280(String str, int i) {
        this.f44101 = str;
        this.f44100 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13280)) {
            return false;
        }
        C13280 c13280 = (C13280) obj;
        return this.f44100 == c13280.f44100 && C13638.equals(this.f44101, c13280.f44101);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f44101) + (this.f44100 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f44101, Integer.valueOf(this.f44100)};
        String[] strArrSplit = "literal;group".length() == 0 ? new String[0] : "literal;group".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C13280.class, sb, "[");
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
