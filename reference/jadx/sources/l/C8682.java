package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KU */
/* JADX INFO: loaded from: classes3.dex */
public final class C8682 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f29886;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f29887;

    public C8682(String str, String str2) {
        this.f29887 = str;
        this.f29886 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8682)) {
            return false;
        }
        C8682 c8682 = (C8682) obj;
        return C13638.equals(this.f29887, c8682.f29887) && C13638.equals(this.f29886, c8682.f29886);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f29886) + (C13638.hashCode(this.f29887) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f29887, this.f29886};
        String[] strArrSplit = "source;path".length() == 0 ? new String[0] : "source;path".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C8682.class, sb, "[");
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
