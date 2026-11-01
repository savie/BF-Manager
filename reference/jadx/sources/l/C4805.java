package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 36ZX */
/* JADX INFO: loaded from: classes3.dex */
public final class C4805 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f16892;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C11862 f16893;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f16894;

    public C4805(C11862 c11862, int i, int i2) {
        this.f16893 = c11862;
        this.f16894 = i;
        this.f16892 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4805)) {
            return false;
        }
        C4805 c4805 = (C4805) obj;
        return this.f16894 == c4805.f16894 && this.f16892 == c4805.f16892 && C13638.equals(this.f16893, c4805.f16893);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f16893) + C17922.m41614(this.f16894, 31, this.f16892, 31);
    }

    public final String toString() {
        Object[] objArr = {this.f16893, Integer.valueOf(this.f16894), Integer.valueOf(this.f16892)};
        String[] strArrSplit = "restarts;oldStart;oldEnd".length() == 0 ? new String[0] : "restarts;oldStart;oldEnd".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C4805.class, sb, "[");
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
    public final C11862 m13359() {
        return this.f16893;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m13360() {
        return this.f16892;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m13361() {
        return this.f16894;
    }
}
