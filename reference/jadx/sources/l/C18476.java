package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩴۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes5.dex */
public final class C18476 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C18476 f58879 = new C18476(null, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22710 f58880;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22710 f58881;

    public /* synthetic */ C18476(C22710 c22710, C22710 c22711, int i) {
        this(c22710, c22711);
    }

    public C18476(C22710 c22710, C22710 c22711) {
        this.f58880 = c22710;
        this.f58881 = c22711;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18476)) {
            return false;
        }
        C18476 c18476 = (C18476) obj;
        return C13638.equals(this.f58880, c18476.f58880) && C13638.equals(this.f58881, c18476.f58881);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f58881) + (C13638.hashCode(this.f58880) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f58880, this.f58881};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C18476.class, sb, "[");
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
