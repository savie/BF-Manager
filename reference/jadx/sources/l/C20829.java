package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩷ۧۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OA */
/* JADX INFO: loaded from: classes5.dex */
public final class C20829 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f67692;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f67693;

    public C20829(int i, int i2) {
        this.f67692 = i;
        this.f67693 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20829)) {
            return false;
        }
        C20829 c20829 = (C20829) obj;
        return this.f67692 == c20829.f67692 && this.f67693 == c20829.f67693;
    }

    public final int hashCode() {
        return (this.f67692 * 31) + this.f67693;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f67692), Integer.valueOf(this.f67693)};
        String[] strArrSplit = "end;offset".length() == 0 ? new String[0] : "end;offset".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C20829.class, sb, "[");
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
