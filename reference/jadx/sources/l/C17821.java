package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܽ᩶ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: P6V4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17821 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23922 f58468;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f58469;

    public C17821(C23922 c23922, long j) {
        this.f58468 = c23922;
        this.f58469 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17821)) {
            return false;
        }
        C17821 c17821 = (C17821) obj;
        return this.f58469 == c17821.f58469 && C17359.equals(this.f58468, c17821.f58468);
    }

    public final int hashCode() {
        long j = this.f58469;
        return C17359.hashCode(this.f58468) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f58468, Long.valueOf(this.f58469)};
        String[] strArrSplit = "scanner;touched".length() == 0 ? new String[0] : "scanner;touched".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C17821.class, sb, "[");
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
