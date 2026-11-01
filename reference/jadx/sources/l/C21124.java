package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩷᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C21124 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f68793;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f68794;

    public C21124(int i, Runnable runnable) {
        this.f68794 = i;
        this.f68793 = runnable;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21124)) {
            return false;
        }
        C21124 c21124 = (C21124) obj;
        return this.f68794 == c21124.f68794 && C13638.equals(this.f68793, c21124.f68793);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f68793) + (this.f68794 * 31);
    }

    public final int position() {
        return this.f68794;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f68794), this.f68793};
        String[] strArrSplit = "position;callback".length() == 0 ? new String[0] : "position;callback".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C21124.class, sb, "[");
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
    public final Runnable m47550() {
        return this.f68793;
    }
}
