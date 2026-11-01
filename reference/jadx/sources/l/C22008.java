package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹ۗۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6PS */
/* JADX INFO: loaded from: classes.dex */
public final class C22008 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f71354;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f71355;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f71356;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f71357;

    public C22008(int i, int i2, int i3, int i4) {
        this.f71354 = i;
        this.f71355 = i2;
        this.f71356 = i3;
        this.f71357 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22008)) {
            return false;
        }
        C22008 c22008 = (C22008) obj;
        return this.f71354 == c22008.f71354 && this.f71355 == c22008.f71355 && this.f71356 == c22008.f71356 && this.f71357 == c22008.f71357;
    }

    public final int hashCode() {
        return (((((this.f71354 * 31) + this.f71355) * 31) + this.f71356) * 31) + this.f71357;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f71354), Integer.valueOf(this.f71355), Integer.valueOf(this.f71356), Integer.valueOf(this.f71357)};
        String[] strArrSplit = "start;end;selectionStart;selectionEnd".length() == 0 ? new String[0] : "start;end;selectionStart;selectionEnd".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C22008.class, sb, "[");
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
    public final int m48893() {
        return this.f71356;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m48894() {
        return this.f71355;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m48896() {
        return this.f71357;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m48897() {
        return this.f71354;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m48895(int i) {
        return (i >= this.f71354 && i < this.f71355) || i == this.f71356 || i == this.f71357;
    }
}
