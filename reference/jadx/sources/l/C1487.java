package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֫֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E708 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1487 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f6024;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f6025;

    public C1487(int i, String str) {
        this.f6024 = i;
        this.f6025 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1487)) {
            return false;
        }
        C1487 c1487 = (C1487) obj;
        return this.f6024 == c1487.f6024 && C13638.equals(this.f6025, c1487.f6025);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f6025) + (this.f6024 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f6024), this.f6025};
        String[] strArrSplit = "group;name".length() == 0 ? new String[0] : "group;name".split(l.b);
        StringBuilder sb = new StringBuilder("CaptureExport[");
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
    public final int m5133() {
        return this.f6024;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m5134() {
        return this.f6025;
    }
}
