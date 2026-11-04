package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩴۤ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: V743 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19748 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f63576;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f63577;

    public C19748(long j, String str) {
        this.f63577 = str;
        this.f63576 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C19748)) {
            return false;
        }
        C19748 c19748 = (C19748) obj;
        return this.f63576 == c19748.f63576 && C17359.equals(this.f63577, c19748.f63577);
    }

    public final int hashCode() {
        long j = this.f63576;
        return C17359.hashCode(this.f63577) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f63577, Long.valueOf(this.f63576)};
        String[] strArrSplit = "resourceKey;pageNumber".length() == 0 ? new String[0] : "resourceKey;pageNumber".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C19748.class, sb, "[");
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
