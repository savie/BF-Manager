package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܿۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: I749 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18216 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f59472;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Uri f59473;

    public C18216(Uri uri, byte[] bArr) {
        this.f59472 = bArr;
        this.f59473 = uri;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18216)) {
            return false;
        }
        C18216 c18216 = (C18216) obj;
        return C17359.equals(this.f59472, c18216.f59472) && C17359.equals(this.f59473, c18216.f59473);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f59473) + (C17359.hashCode(this.f59472) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f59472, this.f59473};
        String[] strArrSplit = "body;finalUri".length() == 0 ? new String[0] : "body;finalUri".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C18216.class, sb, "[");
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

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m42365() {
        return this.f59472;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Uri m42366() {
        return this.f59473;
    }
}
