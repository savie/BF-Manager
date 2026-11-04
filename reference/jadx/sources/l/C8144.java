package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۟᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T72Q */
/* JADX INFO: loaded from: classes4.dex */
public final class C8144 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C12184 f26859;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f26860;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f26861;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f26862;

    public C8144(C12184 c12184, boolean z, int i, long j) {
        this.f26859 = c12184;
        this.f26861 = z;
        this.f26860 = i;
        this.f26862 = j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8144)) {
            return false;
        }
        C8144 c8144 = (C8144) obj;
        return this.f26861 == c8144.f26861 && this.f26860 == c8144.f26860 && this.f26862 == c8144.f26862 && C17359.equals(this.f26859, c8144.f26859);
    }

    public final int hashCode() {
        int iM42345 = C18176.m42345(this.f26861 ? 1231 : 1237, 31, this.f26860, 31);
        long j = this.f26862;
        return C17359.hashCode(this.f26859) + ((iM42345 + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f26859, Boolean.valueOf(this.f26861), Integer.valueOf(this.f26860), Long.valueOf(this.f26862)};
        String[] strArrSplit = "arguments;historyChanged;pausedPosition;sourceGeneration".length() == 0 ? new String[0] : "arguments;historyChanged;pausedPosition;sourceGeneration".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C8144.class, sb, "[");
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
    public final C12184 m22022() {
        return this.f26859;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m22023() {
        return this.f26860;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long m22024() {
        return this.f26862;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m22025() {
        return this.f26861;
    }
}
