package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۜۖ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes3.dex */
public final class C6481 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C6481 f21872 = new C6481(0, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f21873;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C22710 f21874;

    public final int length() {
        C22710 c22710 = this.f21874;
        if (c22710 == null) {
            return 0;
        }
        return c22710.f73964;
    }

    public C6481(int i, C22710 c22710) {
        this.f21873 = i;
        this.f21874 = c22710;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6481)) {
            return false;
        }
        C6481 c6481 = (C6481) obj;
        return this.f21873 == c6481.f21873 && C13638.equals(this.f21874, c6481.f21874);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f21874) + (this.f21873 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f21873), this.f21874};
        String[] strArrSplit = "offset;spans".length() == 0 ? new String[0] : "offset;spans".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C6481.class, sb, "[");
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
    public final int m17676() {
        return this.f21873;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C22710 m17677() {
        return this.f21874;
    }
}
