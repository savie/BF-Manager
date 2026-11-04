package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܿᩴ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: NB79 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18528 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f60223;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f60224;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f60225;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f60226;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f60227;

    public C18528(String str, int i, String str2, int i2, int i3) {
        this.f60224 = i;
        this.f60227 = str;
        this.f60223 = str2;
        this.f60225 = i2;
        this.f60226 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18528)) {
            return false;
        }
        C18528 c18528 = (C18528) obj;
        return this.f60224 == c18528.f60224 && this.f60225 == c18528.f60225 && this.f60226 == c18528.f60226 && C17359.equals(this.f60227, c18528.f60227) && C17359.equals(this.f60223, c18528.f60223);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f60223) + C24966.m55771(((((this.f60224 * 31) + this.f60225) * 31) + this.f60226) * 31, 31, this.f60227);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f60224), this.f60227, this.f60223, Integer.valueOf(this.f60225), Integer.valueOf(this.f60226)};
        String[] strArrSplit = "index;name;cacheTag;size;dataIconMark".length() == 0 ? new String[0] : "index;name;cacheTag;size;dataIconMark".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C18528.class, sb, "[");
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
