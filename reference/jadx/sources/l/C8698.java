package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.۠ܳۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: U998 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8698 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f28355;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f28356;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f28357;

    public C8698(String str, int i, int i2) {
        this.f28357 = str;
        this.f28355 = i;
        this.f28356 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8698)) {
            return false;
        }
        C8698 c8698 = (C8698) obj;
        return this.f28355 == c8698.f28355 && this.f28356 == c8698.f28356 && this.f28357.equals(c8698.f28357);
    }

    public final int hashCode() {
        return this.f28357.hashCode() + C18176.m42345(this.f28355, 31, this.f28356, 31);
    }

    public final String toString() {
        Object[] objArr = {this.f28357, Integer.valueOf(this.f28355), Integer.valueOf(this.f28356)};
        String[] strArrSplit = "name;colorRes;styleRes".length() == 0 ? new String[0] : "name;colorRes;styleRes".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C8698.class, sb, "[");
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
    public final int m23388() {
        return this.f28355;
    }
}
