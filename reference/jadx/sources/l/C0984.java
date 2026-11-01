package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.֨۠֨, reason: contains not printable characters */
/* JADX INFO: compiled from: R8AK */
/* JADX INFO: loaded from: classes2.dex */
public final class C0984 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C0279 f4622;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f4623;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f4624;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f4625;

    public C0984(byte[] bArr, int i, long j, C0279 c0279) {
        this.f4623 = bArr;
        this.f4624 = i;
        this.f4625 = j;
        this.f4622 = c0279;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0984)) {
            return false;
        }
        C0984 c0984 = (C0984) obj;
        return this.f4624 == c0984.f4624 && this.f4625 == c0984.f4625 && C13638.equals(this.f4623, c0984.f4623) && this.f4622.equals(c0984.f4622);
    }

    public final int hashCode() {
        int i = this.f4624 * 31;
        long j = this.f4625;
        return this.f4622.hashCode() + ((C13638.hashCode(this.f4623) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f4623, Integer.valueOf(this.f4624), Long.valueOf(this.f4625), this.f4622};
        String[] strArrSplit = "buffer;length;fileOffset;pendingWrite".length() == 0 ? new String[0] : "buffer;length;fileOffset;pendingWrite".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C0984.class, sb, "[");
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
