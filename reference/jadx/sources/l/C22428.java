package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩸֡ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M3ZI */
/* JADX INFO: loaded from: classes.dex */
public final class C22428 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22664 f72621;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f72622;

    public C22428(AbstractC22664 abstractC22664, boolean z) {
        this.f72621 = abstractC22664;
        this.f72622 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22428)) {
            return false;
        }
        C22428 c22428 = (C22428) obj;
        return this.f72622 == c22428.f72622 && C17359.equals(this.f72621, c22428.f72621);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f72621) + ((this.f72622 ? 1231 : 1237) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f72621, Boolean.valueOf(this.f72622)};
        String[] strArrSplit = "type;unconditional".length() == 0 ? new String[0] : "type;unconditional".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C22428.class, sb, "[");
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
    public final AbstractC22664 m50572() {
        return this.f72621;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m50573() {
        return this.f72622;
    }
}
