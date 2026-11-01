package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۖ۠۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W6LP */
/* JADX INFO: loaded from: classes2.dex */
public final class C2406 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f9670;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f9671;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f9672;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f9673;

    public C2406(String str, int i, String str2, boolean z) {
        this.f9672 = str;
        this.f9671 = str2;
        this.f9673 = z;
        this.f9670 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2406)) {
            return false;
        }
        C2406 c2406 = (C2406) obj;
        return this.f9673 == c2406.f9673 && this.f9670 == c2406.f9670 && C13638.equals(this.f9672, c2406.f9672) && C13638.equals(this.f9671, c2406.f9671);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f9671) + C0589.m2789(C17922.m41614(this.f9673 ? 1231 : 1237, 31, this.f9670, 31), 31, this.f9672);
    }

    public final String toString() {
        Object[] objArr = {this.f9672, this.f9671, Boolean.valueOf(this.f9673), Integer.valueOf(this.f9670)};
        String[] strArrSplit = "entryPath;destinationPath;directory;index".length() == 0 ? new String[0] : "entryPath;destinationPath;directory;index".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C2406.class, sb, "[");
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
