package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۘ۫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C3937 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Integer f14653;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Integer f14654;

    public C3937(Integer num, Integer num2) {
        this.f14653 = num;
        this.f14654 = num2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3937)) {
            return false;
        }
        C3937 c3937 = (C3937) obj;
        return this.f14653.equals(c3937.f14653) && this.f14654.equals(c3937.f14654);
    }

    public final int hashCode() {
        return this.f14654.hashCode() + (this.f14653.hashCode() * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f14653, this.f14654};
        String[] strArrSplit = "from;to".length() == 0 ? new String[0] : "from;to".split(l.b);
        StringBuilder sb = new StringBuilder("Range[");
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
    public final Comparable m11411() {
        return this.f14653;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11412(Integer num) {
        return this.f14653.compareTo(num) <= 0 && this.f14654.compareTo(num) >= 0;
    }
}
