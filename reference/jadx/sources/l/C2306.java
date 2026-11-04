package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۖ֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 56R4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2306 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f7468;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f7469;

    public C2306(String str, int i) {
        this.f7469 = str;
        this.f7468 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2306)) {
            return false;
        }
        C2306 c2306 = (C2306) obj;
        return this.f7468 == c2306.f7468 && C17359.equals(this.f7469, c2306.f7469);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f7469) + (this.f7468 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f7469, Integer.valueOf(this.f7468)};
        String[] strArrSplit = "text;restoredHash".length() == 0 ? new String[0] : "text;restoredHash".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C2306.class, sb, "[");
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
    public final int m7787() {
        return this.f7468;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m7788() {
        return this.f7469;
    }
}
