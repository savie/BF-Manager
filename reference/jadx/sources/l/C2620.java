package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۖۧۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: E762 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2620 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f8413;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f8414;

    public C2620(long j, String str) {
        this.f8414 = j;
        this.f8413 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2620)) {
            return false;
        }
        C2620 c2620 = (C2620) obj;
        return this.f8414 == c2620.f8414 && C17359.equals(this.f8413, c2620.f8413);
    }

    public final int hashCode() {
        long j = this.f8414;
        return C17359.hashCode(this.f8413) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f8414), this.f8413};
        String[] strArrSplit = "value;hex".length() == 0 ? new String[0] : "value;hex".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C2620.class, sb, "[");
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
