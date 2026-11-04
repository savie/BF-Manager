package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩶ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21200 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f67676;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f67677;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Uri f67678;

    public C21200(long j, Uri uri, String str) {
        this.f67676 = j;
        this.f67677 = str;
        this.f67678 = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C21200)) {
            return false;
        }
        C21200 c21200 = (C21200) obj;
        return this.f67676 == c21200.f67676 && C17359.equals(this.f67677, c21200.f67677) && C17359.equals(this.f67678, c21200.f67678);
    }

    public final int hashCode() {
        long j = this.f67676;
        return C17359.hashCode(this.f67678) + C24966.m55771(((int) (j ^ (j >>> 32))) * 31, 31, this.f67677);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f67676), this.f67677, this.f67678};
        String[] strArrSplit = "bodyLength;sha256;finalUri".length() == 0 ? new String[0] : "bodyLength;sha256;finalUri".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C21200.class, sb, "[");
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
