package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܽᩴܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A70P */
/* JADX INFO: loaded from: classes5.dex */
public final class C17783 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C17037 f58367;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C17037 f58368;

    public C17783(C17037 c17037, C17037 c17038) {
        this.f58368 = c17037;
        this.f58367 = c17038;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17783)) {
            return false;
        }
        C17783 c17783 = (C17783) obj;
        return C17359.equals(this.f58368, c17783.f58368) && C17359.equals(this.f58367, c17783.f58367);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f58367) + (C17359.hashCode(this.f58368) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f58368, this.f58367};
        String[] strArrSplit = "rest;leaf".length() == 0 ? new String[0] : "rest;leaf".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C17783.class, sb, "[");
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
