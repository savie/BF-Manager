package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۚᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: 778V */
/* JADX INFO: loaded from: classes3.dex */
public final class C5841 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f20065;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f20066;

    public C5841(int i, int i2) {
        this.f20066 = i;
        this.f20065 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5841)) {
            return false;
        }
        C5841 c5841 = (C5841) obj;
        return this.f20066 == c5841.f20066 && this.f20065 == c5841.f20065;
    }

    public final int hashCode() {
        return (this.f20066 * 31) + this.f20065;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f20066), Integer.valueOf(this.f20065)};
        String[] strArrSplit = "widthPx;heightPx".length() == 0 ? new String[0] : "widthPx;heightPx".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C5841.class, sb, "[");
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
    public final int m17024() {
        return this.f20065;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m17025() {
        return this.f20066;
    }
}
