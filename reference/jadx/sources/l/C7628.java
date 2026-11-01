package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.۟ᩳۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: J703 */
/* JADX INFO: loaded from: classes3.dex */
public final class C7628 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f25185;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f25186;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f25187;

    public C7628(int i, int i2, int i3) {
        this.f25186 = i;
        this.f25187 = i2;
        this.f25185 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7628)) {
            return false;
        }
        C7628 c7628 = (C7628) obj;
        return this.f25186 == c7628.f25186 && this.f25187 == c7628.f25187 && this.f25185 == c7628.f25185;
    }

    public final int hashCode() {
        return (((this.f25186 * 31) + this.f25187) * 31) + this.f25185;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f25186), Integer.valueOf(this.f25187), Integer.valueOf(this.f25185)};
        String[] strArrSplit = "oldStart;oldEnd;newLength".length() == 0 ? new String[0] : "oldStart;oldEnd;newLength".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C7628.class, sb, "[");
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
