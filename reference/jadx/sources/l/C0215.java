package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֡ۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes2.dex */
public final class C0215 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f1392;

    public C0215(int i) {
        this.f1392 = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0215) && this.f1392 == ((C0215) obj).f1392;
    }

    public final int hashCode() {
        return this.f1392;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f1392)};
        String[] strArrSplit = "indent".length() == 0 ? new String[0] : "indent".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C0215.class, sb, "[");
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
