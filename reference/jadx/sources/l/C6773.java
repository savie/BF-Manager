package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۜ֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes3.dex */
public final class C6773 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f22588;

    public C6773(boolean z) {
        this.f22588 = z;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6773) && this.f22588 == ((C6773) obj).f22588 && "".equals("") && "".equals("");
    }

    public final int hashCode() {
        return "".hashCode() + (("".hashCode() + ((this.f22588 ? 1231 : 1237) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Boolean.valueOf(this.f22588)};
        String[] strArrSplit = "signingDisabledCandidate".length() == 0 ? new String[0] : "signingDisabledCandidate".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C6773.class, sb, "[");
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
    public final boolean m18895() {
        return this.f22588;
    }
}
