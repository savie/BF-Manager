package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۬ۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: O741 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13740 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f43598;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f43599;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final Uri f43600;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC15670 f43601;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f43602;

    public C13740(long j, long j2, Uri uri, InterfaceC15670 interfaceC15670, String str) {
        this.f43600 = uri;
        this.f43598 = str;
        this.f43602 = j;
        this.f43599 = j2;
        this.f43601 = interfaceC15670;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13740)) {
            return false;
        }
        C13740 c13740 = (C13740) obj;
        return this.f43602 == c13740.f43602 && this.f43599 == c13740.f43599 && C17359.equals(this.f43600, c13740.f43600) && C17359.equals(this.f43598, c13740.f43598) && C17359.equals(this.f43601, c13740.f43601);
    }

    public final int hashCode() {
        long j = this.f43602;
        long j2 = this.f43599;
        return C17359.hashCode(this.f43601) + C24966.m55771((C17359.hashCode(this.f43600) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31, 31, this.f43598);
    }

    public final String toString() {
        Object[] objArr = {this.f43600, this.f43598, Long.valueOf(this.f43602), Long.valueOf(this.f43599), this.f43601};
        String[] strArrSplit = "uri;cacheKey;offset;length;cacheOnlyFactory".length() == 0 ? new String[0] : "uri;cacheKey;offset;length;cacheOnlyFactory".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C13740.class, sb, "[");
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
