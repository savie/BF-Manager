package l;

import android.net.Uri;
import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩴۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 274F */
/* JADX INFO: loaded from: classes5.dex */
public final class C19512 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f62960;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Uri f62961;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f62962;

    public C19512(Uri uri, long j, long j2) {
        this.f62961 = uri;
        this.f62962 = j;
        this.f62960 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19512)) {
            return false;
        }
        C19512 c19512 = (C19512) obj;
        return this.f62962 == c19512.f62962 && this.f62960 == c19512.f62960 && C17359.equals(this.f62961, c19512.f62961);
    }

    public final int hashCode() {
        long j = this.f62962;
        long j2 = this.f62960;
        return C17359.hashCode(this.f62961) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f62961, Long.valueOf(this.f62962), Long.valueOf(this.f62960)};
        String[] strArrSplit = "uri;offset;length".length() == 0 ? new String[0] : "uri;offset;length".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C19512.class, sb, "[");
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
