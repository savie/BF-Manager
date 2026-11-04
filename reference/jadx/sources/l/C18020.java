package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܿۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes5.dex */
public final class C18020 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f59010;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC23415 f59011;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Uri f59012;

    public C18020(AbstractC23415 abstractC23415, Uri uri, String str) {
        this.f59011 = abstractC23415;
        this.f59012 = uri;
        this.f59010 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18020)) {
            return false;
        }
        C18020 c18020 = (C18020) obj;
        return C17359.equals(this.f59011, c18020.f59011) && C17359.equals(this.f59012, c18020.f59012) && C17359.equals(this.f59010, c18020.f59010);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f59010) + ((C17359.hashCode(this.f59012) + (C17359.hashCode(this.f59011) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f59011, this.f59012, this.f59010};
        String[] strArrSplit = "playlist;finalUri;bodySha256".length() == 0 ? new String[0] : "playlist;finalUri;bodySha256".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C18020.class, sb, "[");
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
