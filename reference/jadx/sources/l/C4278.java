package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۘܺ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: Z1YZ */
/* JADX INFO: loaded from: classes3.dex */
public final class C4278 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f15542;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final AbstractC12384 f15543;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f15544;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C8007 f15545;

    public C4278(AbstractC12384 abstractC12384, int i, int i2, C8007 c8007) {
        this.f15543 = abstractC12384;
        this.f15544 = i;
        this.f15542 = i2;
        this.f15545 = c8007;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4278)) {
            return false;
        }
        C4278 c4278 = (C4278) obj;
        return this.f15544 == c4278.f15544 && this.f15542 == c4278.f15542 && C17359.equals(this.f15543, c4278.f15543) && C17359.equals(this.f15545, c4278.f15545);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f15545) + ((C17359.hashCode(this.f15543) + C18176.m42345(this.f15544, 31, this.f15542, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f15543, Integer.valueOf(this.f15544), Integer.valueOf(this.f15542), this.f15545};
        String[] strArrSplit = "instruction;index;data;intMatcher".length() == 0 ? new String[0] : "instruction;index;data;intMatcher".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C4278.class, sb, "[");
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
