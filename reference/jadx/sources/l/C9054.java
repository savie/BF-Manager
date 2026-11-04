package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۡ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KJ */
/* JADX INFO: loaded from: classes4.dex */
public final class C9054 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f29447;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f29448;

    public C9054(String str, String str2) {
        this.f29448 = str;
        this.f29447 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9054)) {
            return false;
        }
        C9054 c9054 = (C9054) obj;
        return C17359.equals(this.f29448, c9054.f29448) && C17359.equals(this.f29447, c9054.f29447);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f29447) + (C17359.hashCode(this.f29448) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f29448, this.f29447};
        String[] strArrSplit = "path;label".length() == 0 ? new String[0] : "path;label".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C9054.class, sb, "[");
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
    public final String m24188() {
        return this.f29447;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m24189() {
        return this.f29448;
    }
}
