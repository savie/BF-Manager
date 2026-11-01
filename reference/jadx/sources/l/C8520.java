package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۡ֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6SY */
/* JADX INFO: loaded from: classes3.dex */
public final class C8520 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29502;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14744 f29503;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21695 f29504;

    public C8520(C14744 c14744, C21695 c21695, int i) {
        this.f29503 = c14744;
        this.f29504 = c21695;
        this.f29502 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8520)) {
            return false;
        }
        C8520 c8520 = (C8520) obj;
        return this.f29502 == c8520.f29502 && C13638.equals(this.f29503, c8520.f29503) && C13638.equals(this.f29504, c8520.f29504);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f29504) + ((C13638.hashCode(this.f29503) + (this.f29502 * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f29503, this.f29504, Integer.valueOf(this.f29502)};
        String[] strArrSplit = "text;history;activePageOffset".length() == 0 ? new String[0] : "text;history;activePageOffset".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C8520.class, sb, "[");
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14744 m22249() {
        return this.f29503;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m22250() {
        return this.f29502;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C21695 m22251() {
        return this.f29504;
    }
}
