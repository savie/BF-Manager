package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩵۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 4748 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19320 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f62318;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f62319;

    public final int hashCode() {
        int i = this.f62319 ? 1231 : 1237;
        long j = this.f62318;
        return (i * 31) + ((int) (j ^ (j >>> 32)));
    }

    public C19320(long j, boolean z) {
        this.f62319 = z;
        this.f62318 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19320)) {
            return false;
        }
        C19320 c19320 = (C19320) obj;
        return this.f62319 == c19320.f62319 && this.f62318 == c19320.f62318;
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f62319), Long.valueOf(this.f62318)};
        String[] strArrSplit = "rangeSupported;documentLength".length() == 0 ? new String[0] : "rangeSupported;documentLength".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C19320.class, sb, "[");
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
    public final long m44298() {
        return this.f62318;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m44299() {
        return this.f62319;
    }
}
