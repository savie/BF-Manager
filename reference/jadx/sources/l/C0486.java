package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡ܶۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1YZ */
/* JADX INFO: loaded from: classes2.dex */
public final class C0486 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C11071 f2163;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f2164;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC3384 f2165;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f2166;

    public C0486(AbstractC3384 abstractC3384, int i, int i2, C11071 c11071) {
        this.f2165 = abstractC3384;
        this.f2166 = i;
        this.f2164 = i2;
        this.f2163 = c11071;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0486)) {
            return false;
        }
        C0486 c0486 = (C0486) obj;
        return this.f2166 == c0486.f2166 && this.f2164 == c0486.f2164 && C13638.equals(this.f2165, c0486.f2165) && C13638.equals(this.f2163, c0486.f2163);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f2163) + ((C13638.hashCode(this.f2165) + C17922.m41614(this.f2166, 31, this.f2164, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f2165, Integer.valueOf(this.f2166), Integer.valueOf(this.f2164), this.f2163};
        String[] strArrSplit = "instruction;index;data;intMatcher".length() == 0 ? new String[0] : "instruction;index;data;intMatcher".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C0486.class, sb, "[");
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
