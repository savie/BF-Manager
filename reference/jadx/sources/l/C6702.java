package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۜۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: O741 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6702 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f22590;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f22591;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final Uri f22592;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f22593;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20723 f22594;

    public C6702(long j, long j2, Uri uri, InterfaceC20723 interfaceC20723, String str) {
        this.f22592 = uri;
        this.f22591 = str;
        this.f22590 = j;
        this.f22593 = j2;
        this.f22594 = interfaceC20723;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6702)) {
            return false;
        }
        C6702 c6702 = (C6702) obj;
        return this.f22590 == c6702.f22590 && this.f22593 == c6702.f22593 && C13638.equals(this.f22592, c6702.f22592) && C13638.equals(this.f22591, c6702.f22591) && C13638.equals(this.f22594, c6702.f22594);
    }

    public final int hashCode() {
        long j = this.f22590;
        long j2 = this.f22593;
        return C13638.hashCode(this.f22594) + C0589.m2789((C13638.hashCode(this.f22592) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.f22591);
    }

    public final String toString() {
        Object[] objArr = {this.f22592, this.f22591, Long.valueOf(this.f22590), Long.valueOf(this.f22593), this.f22594};
        String[] strArrSplit = "uri;cacheKey;offset;length;cacheOnlyFactory".length() == 0 ? new String[0] : "uri;cacheKey;offset;length;cacheOnlyFactory".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C6702.class, sb, "[");
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
