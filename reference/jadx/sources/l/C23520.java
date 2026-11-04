package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩹ۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: 66ND */
/* JADX INFO: loaded from: classes.dex */
public final class C23520 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f76005;

    public C23520(int i) {
        this.f76005 = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C23520) && this.f76005 == ((C23520) obj).f76005;
    }

    public final int hashCode() {
        return this.f76005;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f76005)};
        String[] strArrSplit = "extra".length() == 0 ? new String[0] : "extra".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C23520.class, sb, "[");
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
