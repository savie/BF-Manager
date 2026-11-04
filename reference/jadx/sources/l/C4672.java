package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۙۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q5YY */
/* JADX INFO: loaded from: classes3.dex */
public final class C4672 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f16491;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f16492;

    public C4672(int i, int i2) {
        this.f16491 = i;
        this.f16492 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4672)) {
            return false;
        }
        C4672 c4672 = (C4672) obj;
        return this.f16491 == c4672.f16491 && this.f16492 == c4672.f16492;
    }

    public final int hashCode() {
        return (this.f16491 * 31) + this.f16492;
    }

    public final int length() {
        return this.f16492;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f16491), Integer.valueOf(this.f16492)};
        String[] strArrSplit = "index;length".length() == 0 ? new String[0] : "index;length".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C4672.class, sb, "[");
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
    public final int m14523() {
        return this.f16491;
    }
}
