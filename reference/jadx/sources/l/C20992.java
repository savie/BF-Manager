package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: E708 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20992 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f67113;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f67114;

    public C20992(int i, String str) {
        this.f67113 = i;
        this.f67114 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20992)) {
            return false;
        }
        C20992 c20992 = (C20992) obj;
        return this.f67113 == c20992.f67113 && C17359.equals(this.f67114, c20992.f67114);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f67114) + (this.f67113 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f67113), this.f67114};
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
    public final int m47979() {
        return this.f67113;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m47980() {
        return this.f67114;
    }
}
