package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ᩳۤ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes5.dex */
public final class C17991 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C16325 f57528;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15620 f57529;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Uri f57530;

    public C17991(Uri uri, C16325 c16325, C15620 c15620) {
        this.f57530 = uri;
        this.f57528 = c16325;
        this.f57529 = c15620;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17991)) {
            return false;
        }
        C17991 c17991 = (C17991) obj;
        return C13638.equals(this.f57530, c17991.f57530) && C13638.equals(this.f57528, c17991.f57528) && C13638.equals(this.f57529, c17991.f57529);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f57529) + ((C13638.hashCode(this.f57528) + (C13638.hashCode(this.f57530) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f57530, this.f57528, this.f57529};
        String[] strArrSplit = "playlistUri;playlist;segment".length() == 0 ? new String[0] : "playlistUri;playlist;segment".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C17991.class, sb, "[");
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
