package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۢۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes3.dex */
public final class C9485 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f32082;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f32083;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Uri f32084;

    public C9485(long j, Uri uri, String str) {
        this.f32082 = j;
        this.f32083 = str;
        this.f32084 = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9485)) {
            return false;
        }
        C9485 c9485 = (C9485) obj;
        return this.f32082 == c9485.f32082 && C13638.equals(this.f32083, c9485.f32083) && C13638.equals(this.f32084, c9485.f32084);
    }

    public final int hashCode() {
        long j = this.f32082;
        return C13638.hashCode(this.f32084) + C0589.m2789(((int) (j ^ (j >>> 32))) * 31, 31, this.f32083);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f32082), this.f32083, this.f32084};
        String[] strArrSplit = "bodyLength;sha256;finalUri".length() == 0 ? new String[0] : "bodyLength;sha256;finalUri".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C9485.class, sb, "[");
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
