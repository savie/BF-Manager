package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܽۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46OI */
/* JADX INFO: loaded from: classes4.dex */
public final class C16364 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f52670;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f52671;

    public C16364(int i, int i2) {
        this.f52671 = i;
        this.f52670 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16364)) {
            return false;
        }
        C16364 c16364 = (C16364) obj;
        return this.f52671 == c16364.f52671 && this.f52670 == c16364.f52670;
    }

    public final int hashCode() {
        return (this.f52671 * 31) + this.f52670;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f52671), Integer.valueOf(this.f52670)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C16364.class, sb, "[");
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
    public final int m38559() {
        return this.f52670;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m38560() {
        return this.f52671;
    }
}
