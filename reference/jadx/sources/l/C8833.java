package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۠ᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C8833 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f28891;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16159 f28892;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f28893;

    public C8833(long j, boolean z, C16159 c16159) {
        this.f28893 = j;
        this.f28891 = z;
        this.f28892 = c16159;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8833)) {
            return false;
        }
        C8833 c8833 = (C8833) obj;
        return this.f28891 == c8833.f28891 && this.f28893 == c8833.f28893 && C17359.equals(this.f28892, c8833.f28892);
    }

    public final int hashCode() {
        int i = this.f28891 ? 1231 : 1237;
        long j = this.f28893;
        return C17359.hashCode(this.f28892) + (((i * 31) + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f28893), Boolean.valueOf(this.f28891), this.f28892};
        String[] strArrSplit = "generation;changed;historyUiState".length() == 0 ? new String[0] : "generation;changed;historyUiState".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C8833.class, sb, "[");
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
    public final boolean m23698() {
        return this.f28891;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C16159 m23699() {
        return this.f28892;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long m23700() {
        return this.f28893;
    }
}
