package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06RI */
/* JADX INFO: loaded from: classes3.dex */
public final class C4761 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f16772;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15346 f16773;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f16774;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6899 f16775;

    public C4761() {
        throw null;
    }

    public C4761(C15346 c15346, C6899 c6899, long j, long j2) {
        this.f16773 = c15346;
        this.f16775 = c6899;
        this.f16774 = j;
        this.f16772 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4761)) {
            return false;
        }
        C4761 c4761 = (C4761) obj;
        return this.f16774 == c4761.f16774 && this.f16772 == c4761.f16772 && C13638.equals(this.f16773, c4761.f16773) && C13638.equals(this.f16775, c4761.f16775);
    }

    public final int hashCode() {
        long j = this.f16774;
        long j2 = this.f16772;
        return C13638.hashCode(this.f16775) + ((C13638.hashCode(this.f16773) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f16773, this.f16775, Long.valueOf(this.f16774), Long.valueOf(this.f16772)};
        String[] strArrSplit = "changes;history;mark;markCount".length() == 0 ? new String[0] : "changes;history;mark;markCount".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C4761.class, sb, "[");
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
