package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۚ֡ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6VB */
/* JADX INFO: loaded from: classes3.dex */
public final class C5276 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f18586;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f18587;

    public C5276(String str, int i) {
        this.f18587 = str;
        this.f18586 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5276)) {
            return false;
        }
        C5276 c5276 = (C5276) obj;
        return this.f18586 == c5276.f18586 && C17359.equals(this.f18587, c5276.f18587);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f18587) + (this.f18586 * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f18587, Integer.valueOf(this.f18586)};
        String[] strArrSplit = "text;replacements".length() == 0 ? new String[0] : "text;replacements".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C5276.class, sb, "[");
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
    public final int m15863() {
        return this.f18586;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m15864() {
        return this.f18587;
    }
}
