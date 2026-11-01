package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩳۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C17853 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f56544;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f56545;

    public C17853(String str, String str2) {
        this.f56545 = str;
        this.f56544 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17853)) {
            return false;
        }
        C17853 c17853 = (C17853) obj;
        return C13638.equals(this.f56545, c17853.f56545) && C13638.equals(this.f56544, c17853.f56544);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f56544) + (C13638.hashCode(this.f56545) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f56545, this.f56544};
        String[] strArrSplit = "path;label".length() == 0 ? new String[0] : "path;label".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C17853.class, sb, "[");
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
    public final String m41443() {
        return this.f56544;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m41444() {
        return this.f56545;
    }
}
