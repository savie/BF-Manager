package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۛ᩷ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: B6QO */
/* JADX INFO: loaded from: classes3.dex */
public final class C6297 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f21316;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23937 f21317;

    public C6297(C23937 c23937, int i) {
        this.f21317 = c23937;
        this.f21316 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6297)) {
            return false;
        }
        C6297 c6297 = (C6297) obj;
        return this.f21316 == c6297.f21316 && C13638.equals(this.f21317, c6297.f21317);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f21317) + (this.f21316 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f21317, Integer.valueOf(this.f21316)};
        String[] strArrSplit = "source;charset".length() == 0 ? new String[0] : "source;charset".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C6297.class, sb, "[");
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
