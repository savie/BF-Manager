package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܳ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 06RI */
/* JADX INFO: loaded from: classes5.dex */
public final class C15202 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C20424 f49620;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f49621;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3335 f49622;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f49623;

    public C15202() {
        throw null;
    }

    public C15202(C20424 c20424, C3335 c3335, long j, long j2) {
        this.f49620 = c20424;
        this.f49622 = c3335;
        this.f49621 = j;
        this.f49623 = j2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15202)) {
            return false;
        }
        C15202 c15202 = (C15202) obj;
        return this.f49621 == c15202.f49621 && this.f49623 == c15202.f49623 && C17359.equals(this.f49620, c15202.f49620) && C17359.equals(this.f49622, c15202.f49622);
    }

    public final int hashCode() {
        long j = this.f49621;
        long j2 = this.f49623;
        return C17359.hashCode(this.f49622) + ((C17359.hashCode(this.f49620) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f49620, this.f49622, Long.valueOf(this.f49621), Long.valueOf(this.f49623)};
        String[] strArrSplit = "changes;history;mark;markCount".length() == 0 ? new String[0] : "changes;history;mark;markCount".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C15202.class, sb, "[");
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
