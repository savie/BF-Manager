package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֨᩺ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: R7YU */
/* JADX INFO: loaded from: classes2.dex */
public final class C1422 extends AbstractC17535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String f5866;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f5867;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f5868;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f5869;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f5870;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f5871;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean f5872;

    public C1422(String str, String str2, String str3, boolean z, String str4, String str5, String str6) {
        this.f5867 = str;
        this.f5868 = str2;
        this.f5871 = str3;
        this.f5872 = z;
        this.f5866 = str4;
        this.f5870 = str5;
        this.f5869 = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1422)) {
            return false;
        }
        C1422 c1422 = (C1422) obj;
        return this.f5872 == c1422.f5872 && C13638.equals(this.f5867, c1422.f5867) && C13638.equals(this.f5868, c1422.f5868) && C13638.equals(this.f5871, c1422.f5871) && C13638.equals(this.f5866, c1422.f5866) && C13638.equals(this.f5870, c1422.f5870) && C13638.equals(this.f5869, c1422.f5869);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f5869) + C0589.m2789(C0589.m2789(C0589.m2789(C0589.m2789(C0589.m2789((this.f5872 ? 1231 : 1237) * 31, 31, this.f5867), 31, this.f5868), 31, this.f5871), 31, this.f5866), 31, this.f5870);
    }

    public final String toString() {
        Object[] objArr = {this.f5867, this.f5868, this.f5871, Boolean.valueOf(this.f5872), this.f5866, this.f5870, this.f5869};
        String[] strArrSplit = "message;checkBox1;checkBox2;verifyEmail;verifyMessage;lastConfirmMessage;successMessage".length() == 0 ? new String[0] : "message;checkBox1;checkBox2;verifyEmail;verifyMessage;lastConfirmMessage;successMessage".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C1422.class, sb, "[");
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
