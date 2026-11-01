package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۗ᩷۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B749 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3484 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2884 f12787;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f12788;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f12789;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f12790;

    public C3484(int i, long j, C2884 c2884, byte[] bArr) {
        this.f12788 = bArr;
        this.f12789 = i;
        this.f12790 = j;
        this.f12787 = c2884;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3484)) {
            return false;
        }
        C3484 c3484 = (C3484) obj;
        return this.f12789 == c3484.f12789 && this.f12790 == c3484.f12790 && C13638.equals(this.f12788, c3484.f12788) && C13638.equals(this.f12787, c3484.f12787);
    }

    public final int hashCode() {
        int i = this.f12789 * 31;
        long j = this.f12790;
        return C13638.hashCode(this.f12787) + ((C13638.hashCode(this.f12788) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f12788, Integer.valueOf(this.f12789), Long.valueOf(this.f12790), this.f12787};
        String[] strArrSplit = "data;length;keyframeTimeUs;reservation".length() == 0 ? new String[0] : "data;length;keyframeTimeUs;reservation".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C3484.class, sb, "[");
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
