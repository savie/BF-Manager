package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩻ܶ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 986Q */
/* JADX INFO: loaded from: classes.dex */
public final class C23770 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f76881;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f76882;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f76883;

    public C23770(String str, String str2, String str3) {
        this.f76883 = str;
        this.f76882 = str2;
        this.f76881 = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23770)) {
            return false;
        }
        C23770 c23770 = (C23770) obj;
        return C13638.equals(this.f76883, c23770.f76883) && C13638.equals(this.f76882, c23770.f76882) && C13638.equals(this.f76881, c23770.f76881);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f76881) + C0589.m2789(C13638.hashCode(this.f76883) * 31, 31, this.f76882);
    }

    public final String toString() {
        Object[] objArr = {this.f76883, this.f76882, this.f76881};
        String[] strArrSplit = "name;region;endpoint".length() == 0 ? new String[0] : "name;region;endpoint".split(l.b);
        StringBuilder sb = new StringBuilder("BucketInfo[");
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String m52314() {
        return this.f76882;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String m52315() {
        return this.f76881;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m52316() {
        return this.f76883;
    }
}
