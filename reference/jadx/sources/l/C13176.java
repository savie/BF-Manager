package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۫ܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C13176 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f42106;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f42107;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15413 f42108;

    public C13176(C15413 c15413, int i, long j) {
        this.f42108 = c15413;
        this.f42106 = i;
        this.f42107 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13176)) {
            return false;
        }
        C13176 c13176 = (C13176) obj;
        return this.f42106 == c13176.f42106 && this.f42107 == c13176.f42107 && C17359.equals(this.f42108, c13176.f42108);
    }

    public final int hashCode() {
        int i = this.f42106 * 31;
        long j = this.f42107;
        return C17359.hashCode(this.f42108) + ((i + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f42108, Integer.valueOf(this.f42106), Long.valueOf(this.f42107)};
        String[] strArrSplit = "ownerSetKey;occurrenceBytes;savingBytes".length() == 0 ? new String[0] : "ownerSetKey;occurrenceBytes;savingBytes".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C13176.class, sb, "[");
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
    public final int m32692() {
        return this.f42106;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long m32693() {
        return this.f42107;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C15413 m32694() {
        return this.f42108;
    }
}
