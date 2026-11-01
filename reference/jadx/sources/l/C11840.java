package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۨܿۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: U998 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11840 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f39741;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f39742;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f39743;

    public C11840(String str, int i, int i2) {
        this.f39743 = str;
        this.f39741 = i;
        this.f39742 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11840)) {
            return false;
        }
        C11840 c11840 = (C11840) obj;
        return this.f39741 == c11840.f39741 && this.f39742 == c11840.f39742 && this.f39743.equals(c11840.f39743);
    }

    public final int hashCode() {
        return this.f39743.hashCode() + C17922.m41614(this.f39741, 31, this.f39742, 31);
    }

    public final String toString() {
        Object[] objArr = {this.f39743, Integer.valueOf(this.f39741), Integer.valueOf(this.f39742)};
        String[] strArrSplit = "name;colorRes;styleRes".length() == 0 ? new String[0] : "name;colorRes;styleRes".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C11840.class, sb, "[");
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
    public final int m29536() {
        return this.f39741;
    }
}
