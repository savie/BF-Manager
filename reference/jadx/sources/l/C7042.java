package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۜۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: UAZD */
/* JADX INFO: loaded from: classes3.dex */
public final class C7042 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f23228;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f23229;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f23230;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f23231;

    public C7042(int i, int i2, int i3, int i4) {
        this.f23230 = i;
        this.f23229 = i2;
        this.f23231 = i3;
        this.f23228 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7042)) {
            return false;
        }
        C7042 c7042 = (C7042) obj;
        return this.f23230 == c7042.f23230 && this.f23229 == c7042.f23229 && this.f23231 == c7042.f23231 && this.f23228 == c7042.f23228;
    }

    public final int hashCode() {
        return (((((this.f23230 * 31) + this.f23229) * 31) + this.f23231) * 31) + this.f23228;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f23230), Integer.valueOf(this.f23229), Integer.valueOf(this.f23231), Integer.valueOf(this.f23228)};
        String[] strArrSplit = "left;top;width;height".length() == 0 ? new String[0] : "left;top;width;height".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C7042.class, sb, "[");
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
    public final int m19363() {
        return this.f23228;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m19364() {
        return this.f23229;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m19365() {
        return this.f23231;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m19366() {
        return this.f23230;
    }
}
