package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۬ۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5YY */
/* JADX INFO: loaded from: classes4.dex */
public final class C13023 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f43433;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f43434;

    public C13023(int i, int i2) {
        this.f43433 = i;
        this.f43434 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13023)) {
            return false;
        }
        C13023 c13023 = (C13023) obj;
        return this.f43433 == c13023.f43433 && this.f43434 == c13023.f43434;
    }

    public final int hashCode() {
        return (this.f43433 * 31) + this.f43434;
    }

    public final int length() {
        return this.f43434;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f43433), Integer.valueOf(this.f43434)};
        String[] strArrSplit = "index;length".length() == 0 ? new String[0] : "index;length".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C13023.class, sb, "[");
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
    public final int m32202() {
        return this.f43433;
    }
}
