package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۫֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OA */
/* JADX INFO: loaded from: classes4.dex */
public final class C12793 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f40921;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f40922;

    public C12793(int i, int i2) {
        this.f40921 = i;
        this.f40922 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12793)) {
            return false;
        }
        C12793 c12793 = (C12793) obj;
        return this.f40921 == c12793.f40921 && this.f40922 == c12793.f40922;
    }

    public final int hashCode() {
        return (this.f40921 * 31) + this.f40922;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f40921), Integer.valueOf(this.f40922)};
        String[] strArrSplit = "end;offset".length() == 0 ? new String[0] : "end;offset".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C12793.class, sb, "[");
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
