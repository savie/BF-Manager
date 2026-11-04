package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܳ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6VB */
/* JADX INFO: loaded from: classes5.dex */
public final class C14970 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f48886;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f48887;

    public C14970(String str, int i) {
        this.f48887 = str;
        this.f48886 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14970)) {
            return false;
        }
        C14970 c14970 = (C14970) obj;
        return this.f48886 == c14970.f48886 && C17359.equals(this.f48887, c14970.f48887);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f48887) + (this.f48886 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f48887, Integer.valueOf(this.f48886)};
        String[] strArrSplit = "literal;group".length() == 0 ? new String[0] : "literal;group".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C14970.class, sb, "[");
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
