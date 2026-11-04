package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۬ۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A75O */
/* JADX INFO: loaded from: classes4.dex */
public final class C13675 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f43411;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f43412;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f43413;

    public C13675(int i, int i2, long j) {
        this.f43411 = j;
        this.f43412 = i;
        this.f43413 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C13675)) {
            return false;
        }
        C13675 c13675 = (C13675) obj;
        return this.f43412 == c13675.f43412 && this.f43413 == c13675.f43413 && this.f43411 == c13675.f43411;
    }

    public final int hashCode() {
        int iM42345 = C18176.m42345(this.f43412, 31, this.f43413, 31);
        long j = this.f43411;
        return iM42345 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Long.valueOf(this.f43411), Integer.valueOf(this.f43412), Integer.valueOf(this.f43413)};
        String[] strArrSplit = "bucketIndex;widthPx;heightPx".length() == 0 ? new String[0] : "bucketIndex;widthPx;heightPx".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C13675.class, sb, "[");
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
