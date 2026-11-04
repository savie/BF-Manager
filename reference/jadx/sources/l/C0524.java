package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֡ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: M701 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0524 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f2216;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f2217;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0524)) {
            return false;
        }
        C0524 c0524 = (C0524) obj;
        return this.f2217 == c0524.f2217 && this.f2216 == c0524.f2216;
    }

    public final int hashCode() {
        return (this.f2217 * 31) + this.f2216;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f2217), Integer.valueOf(this.f2216)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C0524.class, sb, "[");
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
    public final int m2486() {
        return this.f2216;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m2487() {
        return this.f2217;
    }

    public C0524(int i, int i2) {
        if (i < 0 || i2 <= i) {
            throw new IllegalArgumentException("Invalid syntax difference range");
        }
        this.f2217 = i;
        this.f2216 = i2;
    }
}
