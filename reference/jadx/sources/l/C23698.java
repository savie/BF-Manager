package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩻۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes.dex */
public final class C23698 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f76676;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f76677;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f76678;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f76679;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f76680;

    public C23698(int i, int i2, int i3, int i4, long j) {
        this.f76679 = i;
        this.f76677 = i2;
        this.f76676 = j;
        this.f76678 = i3;
        this.f76680 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23698)) {
            return false;
        }
        C23698 c23698 = (C23698) obj;
        return this.f76679 == c23698.f76679 && this.f76677 == c23698.f76677 && this.f76678 == c23698.f76678 && this.f76680 == c23698.f76680 && this.f76676 == c23698.f76676;
    }

    public final int hashCode() {
        int i = ((((((this.f76679 * 31) + this.f76677) * 31) + this.f76678) * 31) + this.f76680) * 31;
        long j = this.f76676;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f76679), Integer.valueOf(this.f76677), Long.valueOf(this.f76676), Integer.valueOf(this.f76678), Integer.valueOf(this.f76680)};
        String[] strArrSplit = "mediaToken;generation;positionMs;widthPx;heightPx".length() == 0 ? new String[0] : "mediaToken;generation;positionMs;widthPx;heightPx".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C23698.class, sb, "[");
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
