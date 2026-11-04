package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۟۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: R8UV */
/* JADX INFO: loaded from: classes4.dex */
public final class C7906 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f26262;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19093 f26263;

    public C7906(C19093 c19093, long j) {
        this.f26263 = c19093;
        this.f26262 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7906)) {
            return false;
        }
        C7906 c7906 = (C7906) obj;
        return this.f26262 == c7906.f26262 && C17359.equals(this.f26263, c7906.f26263);
    }

    public final int hashCode() {
        long j = this.f26262;
        return C17359.hashCode(this.f26263) + (((int) (j ^ (j >>> 32))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f26263, Long.valueOf(this.f26262)};
        String[] strArrSplit = "metadata;duration".length() == 0 ? new String[0] : "metadata;duration".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C7906.class, sb, "[");
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
    public final long m21444() {
        return this.f26262;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19093 m21445() {
        return this.f26263;
    }
}
