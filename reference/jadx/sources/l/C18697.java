package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩴۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes5.dex */
public final class C18697 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f60657;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final Uri f60658;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f60659;

    public C18697(Uri uri, long j, long j2) {
        this.f60658 = uri;
        this.f60659 = j;
        this.f60657 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18697)) {
            return false;
        }
        C18697 c18697 = (C18697) obj;
        return this.f60659 == c18697.f60659 && this.f60657 == c18697.f60657 && C13638.equals(this.f60658, c18697.f60658);
    }

    public final int hashCode() {
        long j = this.f60659;
        long j2 = this.f60657;
        return C13638.hashCode(this.f60658) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f60658, Long.valueOf(this.f60659), Long.valueOf(this.f60657)};
        String[] strArrSplit = "uri;offset;length".length() == 0 ? new String[0] : "uri;offset;length".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C18697.class, sb, "[");
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
