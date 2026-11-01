package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes.dex */
public final class C22550 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f73527;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f73528;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22550)) {
            return false;
        }
        C22550 c22550 = (C22550) obj;
        return this.f73528 == c22550.f73528 && this.f73527 == c22550.f73527;
    }

    public final int hashCode() {
        return (this.f73528 * 31) + this.f73527;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f73528), Integer.valueOf(this.f73527)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C22550.class, sb, "[");
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
    public final int m50064() {
        return this.f73527;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m50065() {
        return this.f73528;
    }

    public C22550(int i, int i2) {
        if (i < 0 || i2 <= i) {
            throw new IllegalArgumentException("Invalid syntax difference range");
        }
        this.f73528 = i;
        this.f73527 = i2;
    }
}
