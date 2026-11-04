package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܶۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes5.dex */
public final class C15908 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f51678;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f51679;

    public C15908(int i, int i2) {
        this.f51679 = i;
        this.f51678 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15908)) {
            return false;
        }
        C15908 c15908 = (C15908) obj;
        return this.f51679 == c15908.f51679 && this.f51678 == c15908.f51678;
    }

    public final int hashCode() {
        return (this.f51679 * 31) + this.f51678;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f51679), Integer.valueOf(this.f51678)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C15908.class, sb, "[");
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
