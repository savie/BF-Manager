package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۖۨۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes2.dex */
public final class C2502 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C6585 f9909;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f9910;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean f9911;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f9912;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f9913;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C6585 m7635(C2502 c2502) {
        return c2502.f9909;
    }

    public C2502(C6585 c6585, boolean z, int i, boolean z2, boolean z3) {
        this.f9909 = c6585;
        this.f9912 = z;
        this.f9910 = i;
        this.f9911 = z2;
        this.f9913 = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2502)) {
            return false;
        }
        C2502 c2502 = (C2502) obj;
        return this.f9912 == c2502.f9912 && this.f9911 == c2502.f9911 && this.f9913 == c2502.f9913 && this.f9910 == c2502.f9910 && C13638.equals(this.f9909, c2502.f9909);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f9909) + ((((((((this.f9912 ? 1231 : 1237) * 31) + (this.f9911 ? 1231 : 1237)) * 31) + (this.f9913 ? 1231 : 1237)) * 31) + this.f9910) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f9909, Boolean.valueOf(this.f9912), Integer.valueOf(this.f9910), Boolean.valueOf(this.f9911), Boolean.valueOf(this.f9913)};
        String[] strArrSplit = "painter;keepWord;arrowWidth;startArrow;endArrow".length() == 0 ? new String[0] : "painter;keepWord;arrowWidth;startArrow;endArrow".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C2502.class, sb, "[");
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
