package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܺۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes5.dex */
public final class C16654 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f53801;

    public C16654(int i) {
        this.f53801 = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C16654) && this.f53801 == ((C16654) obj).f53801;
    }

    public final int hashCode() {
        return this.f53801;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f53801)};
        String[] strArrSplit = "indent".length() == 0 ? new String[0] : "indent".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C16654.class, sb, "[");
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
