package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܶۢ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: O6TJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C16013 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f51959;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f51960;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f51961;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f51962;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16013)) {
            return false;
        }
        C16013 c16013 = (C16013) obj;
        return this.f51960 == c16013.f51960 && this.f51959 == c16013.f51959 && C17359.equals(this.f51961, c16013.f51961) && C17359.equals(this.f51962, c16013.f51962);
    }

    public final int hashCode() {
        int i = this.f51960 ? 1231 : 1237;
        long j = this.f51959;
        return C17359.hashCode(this.f51962) + C24966.m55771(((i * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31, this.f51961);
    }

    public final String toString() {
        Object[] objArr = {this.f51961, this.f51962, Long.valueOf(this.f51959), Boolean.valueOf(this.f51960)};
        String[] strArrSplit = "key;version;byteLength;reopenable".length() == 0 ? new String[0] : "key;version;byteLength;reopenable".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C16013.class, sb, "[");
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
    public final long m38142() {
        return this.f51959;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m38143() {
        return this.f51960;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String m38144() {
        return this.f51962;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m38145() {
        return this.f51961;
    }

    public C16013(String str, String str2, long j, boolean z) {
        C17359.requireNonNull(str);
        C17359.requireNonNull(str2);
        if (!str.isEmpty() && str.length() <= 1024 && str2.length() <= 512 && j >= -1 && (!z || !str2.isEmpty())) {
            this.f51961 = str;
            this.f51962 = str2;
            this.f51959 = j;
            this.f51960 = z;
            return;
        }
        throw new IllegalArgumentException("Invalid text source identity");
    }
}
