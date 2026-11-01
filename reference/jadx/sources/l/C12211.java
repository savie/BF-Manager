package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۫ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes4.dex */
public final class C12211 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f40816;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f40817;

    public C12211(int i, int i2) {
        this.f40817 = i;
        this.f40816 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12211)) {
            return false;
        }
        C12211 c12211 = (C12211) obj;
        return this.f40817 == c12211.f40817 && this.f40816 == c12211.f40816;
    }

    public final int hashCode() {
        return (this.f40817 * 31) + this.f40816;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f40817), Integer.valueOf(this.f40816)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C12211.class, sb, "[");
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
