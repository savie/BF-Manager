package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۟᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6PO */
/* JADX INFO: loaded from: classes3.dex */
public final class C7797 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f25666;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f25667;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f25668;

    public C7797(int i, int i2, boolean z) {
        this.f25667 = i;
        this.f25668 = i2;
        this.f25666 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7797)) {
            return false;
        }
        C7797 c7797 = (C7797) obj;
        return this.f25666 == c7797.f25666 && this.f25667 == c7797.f25667 && this.f25668 == c7797.f25668;
    }

    public final int hashCode() {
        return ((((this.f25666 ? 1231 : 1237) * 31) + this.f25667) * 31) + this.f25668;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f25667), Integer.valueOf(this.f25668), Boolean.valueOf(this.f25666)};
        String[] strArrSplit = "start;end;complete".length() == 0 ? new String[0] : "start;end;complete".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C7797.class, sb, "[");
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
