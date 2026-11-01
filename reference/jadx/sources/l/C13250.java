package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۬ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: O6TJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C13250 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final String f44011;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f44012;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f44013;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f44014;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13250)) {
            return false;
        }
        C13250 c13250 = (C13250) obj;
        return this.f44013 == c13250.f44013 && this.f44012 == c13250.f44012 && C13638.equals(this.f44014, c13250.f44014) && C13638.equals(this.f44011, c13250.f44011);
    }

    public final int hashCode() {
        int i = this.f44013 ? 1231 : 1237;
        long j = this.f44012;
        return C13638.hashCode(this.f44011) + C0589.m2789(((i * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31, this.f44014);
    }

    public final String toString() {
        Object[] objArr = {this.f44014, this.f44011, Long.valueOf(this.f44012), Boolean.valueOf(this.f44013)};
        String[] strArrSplit = "key;version;byteLength;reopenable".length() == 0 ? new String[0] : "key;version;byteLength;reopenable".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C13250.class, sb, "[");
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
    public final boolean m32726() {
        return this.f44013;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long m32727() {
        return this.f44012;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String m32728() {
        return this.f44014;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String m32729() {
        return this.f44011;
    }

    public C13250(String str, String str2, long j, boolean z) {
        C13638.requireNonNull(str);
        C13638.requireNonNull(str2);
        if (!str.isEmpty() && str.length() <= 1024 && str2.length() <= 512 && j >= -1 && (!z || !str2.isEmpty())) {
            this.f44014 = str;
            this.f44011 = str2;
            this.f44012 = j;
            this.f44013 = z;
            return;
        }
        throw new IllegalArgumentException("Invalid text source identity");
    }
}
