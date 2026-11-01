package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩺ۖۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: PB28 */
/* JADX INFO: loaded from: classes.dex */
public final class C22693 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f73922;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final byte[] f73923;

    public C22693(int i, byte[] bArr) {
        this.f73922 = i;
        this.f73923 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22693)) {
            return false;
        }
        C22693 c22693 = (C22693) obj;
        return this.f73922 == c22693.f73922 && C13638.equals(this.f73923, c22693.f73923);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f73923) + (this.f73922 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f73922), this.f73923};
        String[] strArrSplit = "algorithmId;signature".length() == 0 ? new String[0] : "algorithmId;signature".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C22693.class, sb, "[");
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
