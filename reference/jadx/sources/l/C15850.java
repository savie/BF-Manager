package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܺۢۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: V6PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C15850 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f51309;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f51310;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f51311;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f51312;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f51313;

    public C15850(int i, int i2, int i3, boolean z, boolean z2) {
        this.f51309 = i;
        this.f51313 = i2;
        this.f51311 = i3;
        this.f51310 = z;
        this.f51312 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15850)) {
            return false;
        }
        C15850 c15850 = (C15850) obj;
        return this.f51310 == c15850.f51310 && this.f51312 == c15850.f51312 && this.f51309 == c15850.f51309 && this.f51313 == c15850.f51313 && this.f51311 == c15850.f51311;
    }

    public final int hashCode() {
        return ((((((((this.f51310 ? 1231 : 1237) * 31) + (this.f51312 ? 1231 : 1237)) * 31) + this.f51309) * 31) + this.f51313) * 31) + this.f51311;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f51309), Integer.valueOf(this.f51313), Integer.valueOf(this.f51311), Boolean.valueOf(this.f51310), Boolean.valueOf(this.f51312)};
        String[] strArrSplit = "start;end;type;breakBefore;protectedText".length() == 0 ? new String[0] : "start;end;type;breakBefore;protectedText".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C15850.class, sb, "[");
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
