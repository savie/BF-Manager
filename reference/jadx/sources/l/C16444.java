package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܽۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes4.dex */
public final class C16444 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f52874;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f52875;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f52876;

    public C16444(int i, int i2, String str) {
        this.f52875 = i;
        this.f52874 = i2;
        this.f52876 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16444)) {
            return false;
        }
        C16444 c16444 = (C16444) obj;
        return this.f52875 == c16444.f52875 && this.f52874 == c16444.f52874 && C13638.equals(this.f52876, c16444.f52876);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f52876) + C17922.m41614(this.f52875, 31, this.f52874, 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f52875), Integer.valueOf(this.f52874), this.f52876};
        String[] strArrSplit = "start;end;replacement".length() == 0 ? new String[0] : "start;end;replacement".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C16444.class, sb, "[");
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
