package l;

import com.alipay.sdk.m.y.l;
import java.util.IdentityHashMap;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֫ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C1990 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f6651;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4227 f6652;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f6653;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap f6654;

    public C1990() {
        throw null;
    }

    public C1990(IdentityHashMap identityHashMap, int i, C4227 c4227, long j) {
        this.f6654 = identityHashMap;
        this.f6653 = i;
        this.f6652 = c4227;
        this.f6651 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1990)) {
            return false;
        }
        C1990 c1990 = (C1990) obj;
        return this.f6653 == c1990.f6653 && this.f6651 == c1990.f6651 && C17359.equals(this.f6654, c1990.f6654) && C17359.equals(this.f6652, c1990.f6652);
    }

    public final int hashCode() {
        int i = this.f6653 * 31;
        long j = this.f6651;
        return C17359.hashCode(this.f6652) + ((C17359.hashCode(this.f6654) + ((i + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f6654, Integer.valueOf(this.f6653), this.f6652, Long.valueOf(this.f6651)};
        String[] strArrSplit = "sources;occurrenceBytes;requiredArena;allocationBeforeOffset".length() == 0 ? new String[0] : "sources;occurrenceBytes;requiredArena;allocationBeforeOffset".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C1990.class, sb, "[");
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
    public final long m6819() {
        return this.f6651;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C4227 m6820() {
        return this.f6652;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final IdentityHashMap m6821() {
        return this.f6654;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m6822() {
        return this.f6653;
    }
}
