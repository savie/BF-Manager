package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛ᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6321 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f21353;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15682 f21354;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f21355;

    public C6321(int i, int i2, C15682 c15682) {
        this.f21355 = i;
        this.f21353 = i2;
        this.f21354 = c15682;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6321)) {
            return false;
        }
        C6321 c6321 = (C6321) obj;
        return this.f21355 == c6321.f21355 && this.f21353 == c6321.f21353 && C13638.equals(this.f21354, c6321.f21354);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f21354) + C17922.m41614(this.f21355, 31, this.f21353, 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f21355), Integer.valueOf(this.f21353), this.f21354};
        String[] strArrSplit = "start;end;style".length() == 0 ? new String[0] : "start;end;style".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C6321.class, sb, "[");
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
