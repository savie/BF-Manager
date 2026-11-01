package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۜᩳ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: X6VB */
/* JADX INFO: loaded from: classes3.dex */
public final class C6929 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f23299;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f23300;

    public C6929(String str, int i) {
        this.f23300 = str;
        this.f23299 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6929)) {
            return false;
        }
        C6929 c6929 = (C6929) obj;
        return this.f23299 == c6929.f23299 && C13638.equals(this.f23300, c6929.f23300);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f23300) + (this.f23299 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f23300, Integer.valueOf(this.f23299)};
        String[] strArrSplit = "text;replacements".length() == 0 ? new String[0] : "text;replacements".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C6929.class, sb, "[");
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
    public final int m18586() {
        return this.f23299;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m18587() {
        return this.f23300;
    }
}
