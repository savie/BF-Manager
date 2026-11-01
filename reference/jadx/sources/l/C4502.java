package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙ۟۬, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes3.dex */
public final class C4502 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f16009;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final AbstractC10681 f16010;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Uri f16011;

    public C4502(AbstractC10681 abstractC10681, Uri uri, String str) {
        this.f16010 = abstractC10681;
        this.f16011 = uri;
        this.f16009 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4502)) {
            return false;
        }
        C4502 c4502 = (C4502) obj;
        return C13638.equals(this.f16010, c4502.f16010) && C13638.equals(this.f16011, c4502.f16011) && C13638.equals(this.f16009, c4502.f16009);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f16009) + ((C13638.hashCode(this.f16011) + (C13638.hashCode(this.f16010) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f16010, this.f16011, this.f16009};
        String[] strArrSplit = "playlist;finalUri;bodySha256".length() == 0 ? new String[0] : "playlist;finalUri;bodySha256".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C4502.class, sb, "[");
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
