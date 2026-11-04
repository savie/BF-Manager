package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۢ۠ۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes4.dex */
public final class C9990 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Integer f32095;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Integer f32096;

    public C9990(Integer num, Integer num2) {
        this.f32095 = num;
        this.f32096 = num2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9990)) {
            return false;
        }
        C9990 c9990 = (C9990) obj;
        return this.f32095.equals(c9990.f32095) && this.f32096.equals(c9990.f32096);
    }

    public final int hashCode() {
        return this.f32096.hashCode() + (this.f32095.hashCode() * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f32095, this.f32096};
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
    public final Comparable m25834() {
        return this.f32095;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m25835(Integer num) {
        return this.f32095.compareTo(num) <= 0 && this.f32096.compareTo(num) >= 0;
    }
}
