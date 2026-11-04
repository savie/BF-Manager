package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֨᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1446 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f5063;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC9648 f5064;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC9629 f5065;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C7412 f5066;

    public /* synthetic */ C1446(InterfaceC9629 interfaceC9629, int i, C7412 c7412, EnumC9648 enumC9648, int i2) {
        this(interfaceC9629, i, c7412, enumC9648);
    }

    public C1446(InterfaceC9629 interfaceC9629, int i, C7412 c7412, EnumC9648 enumC9648) {
        this.f5065 = interfaceC9629;
        this.f5063 = i;
        this.f5066 = c7412;
        this.f5064 = enumC9648;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1446)) {
            return false;
        }
        C1446 c1446 = (C1446) obj;
        return this.f5063 == c1446.f5063 && C17359.equals(this.f5065, c1446.f5065) && C17359.equals(this.f5066, c1446.f5066) && C17359.equals(this.f5064, c1446.f5064);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f5064) + ((C17359.hashCode(this.f5066) + ((C17359.hashCode(this.f5065) + (this.f5063 * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f5065, Integer.valueOf(this.f5063), this.f5066, this.f5064};
        String[] strArrSplit = "owner;modifyCount;store;state".length() == 0 ? new String[0] : "owner;modifyCount;store;state".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C1446.class, sb, "[");
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
    public static C1446 m5199(InterfaceC9629 interfaceC9629, int i, int i2) {
        return new C1446(interfaceC9629, i, new C8903().m23813(i2), EnumC9648.IDLE);
    }
}
