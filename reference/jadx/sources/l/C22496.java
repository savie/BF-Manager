package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩸ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes.dex */
public final class C22496 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C24907 f72786;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C5515 f72787;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Uri f72788;

    public C22496(Uri uri, C24907 c24907, C5515 c5515) {
        this.f72788 = uri;
        this.f72786 = c24907;
        this.f72787 = c5515;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22496)) {
            return false;
        }
        C22496 c22496 = (C22496) obj;
        return C17359.equals(this.f72788, c22496.f72788) && C17359.equals(this.f72786, c22496.f72786) && C17359.equals(this.f72787, c22496.f72787);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f72787) + ((C17359.hashCode(this.f72786) + (C17359.hashCode(this.f72788) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f72788, this.f72786, this.f72787};
        String[] strArrSplit = "playlistUri;playlist;segment".length() == 0 ? new String[0] : "playlistUri;playlist;segment".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C22496.class, sb, "[");
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
