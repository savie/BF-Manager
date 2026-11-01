package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۗ۫۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 778V */
/* JADX INFO: loaded from: classes2.dex */
public final class C3235 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12045;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f12046;

    public C3235(int i, int i2) {
        this.f12046 = i;
        this.f12045 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3235)) {
            return false;
        }
        C3235 c3235 = (C3235) obj;
        return this.f12046 == c3235.f12046 && this.f12045 == c3235.f12045;
    }

    public final int hashCode() {
        return (this.f12046 * 31) + this.f12045;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f12046), Integer.valueOf(this.f12045)};
        String[] strArrSplit = "widthPx;heightPx".length() == 0 ? new String[0] : "widthPx;heightPx".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C3235.class, sb, "[");
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m9688() {
        return this.f12045;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m9689() {
        return this.f12046;
    }
}
