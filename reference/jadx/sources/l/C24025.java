package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩻᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66ND */
/* JADX INFO: loaded from: classes.dex */
public final class C24025 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23289 f77839;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f77840;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f77841;

    public C24025(C23289 c23289, int i, boolean z) {
        this.f77839 = c23289;
        this.f77840 = i;
        this.f77841 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24025)) {
            return false;
        }
        C24025 c24025 = (C24025) obj;
        return this.f77841 == c24025.f77841 && this.f77840 == c24025.f77840 && C13638.equals(this.f77839, c24025.f77839);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f77839) + C17922.m41614(this.f77841 ? 1231 : 1237, 31, this.f77840, 31);
    }

    public final String toString() {
        Object[] objArr = {this.f77839, Integer.valueOf(this.f77840), Boolean.valueOf(this.f77841)};
        String[] strArrSplit = "context;depth;continuation".length() == 0 ? new String[0] : "context;depth;continuation".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C24025.class, sb, "[");
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
