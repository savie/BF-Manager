package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩷᩵ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 097P */
/* JADX INFO: loaded from: classes5.dex */
public final class C21075 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f68652;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f68653;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f68654;

    public C21075(int i, int i2, boolean z) {
        this.f68653 = i;
        this.f68654 = i2;
        this.f68652 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21075)) {
            return false;
        }
        C21075 c21075 = (C21075) obj;
        return this.f68652 == c21075.f68652 && this.f68653 == c21075.f68653 && this.f68654 == c21075.f68654;
    }

    public final int hashCode() {
        return ((((this.f68652 ? 1231 : 1237) * 31) + this.f68653) * 31) + this.f68654;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f68653), Integer.valueOf(this.f68654), Boolean.valueOf(this.f68652)};
        String[] strArrSplit = "total;failed;canceled".length() == 0 ? new String[0] : "total;failed;canceled".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C21075.class, sb, "[");
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
    public final boolean m47486() {
        return this.f68652;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m47487() {
        return this.f68654;
    }
}
