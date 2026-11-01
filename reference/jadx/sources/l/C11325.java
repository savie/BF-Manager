package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۧ᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 66ND */
/* JADX INFO: loaded from: classes4.dex */
public final class C11325 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f38223;

    public C11325(int i) {
        this.f38223 = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C11325) && this.f38223 == ((C11325) obj).f38223;
    }

    public final int hashCode() {
        return this.f38223;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f38223)};
        String[] strArrSplit = "extra".length() == 0 ? new String[0] : "extra".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C11325.class, sb, "[");
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
