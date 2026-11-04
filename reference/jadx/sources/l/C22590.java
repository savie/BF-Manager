package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩸ۚܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes.dex */
public final class C22590 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C22590 f73037 = new C22590(null, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13856 f73038;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13856 f73039;

    public /* synthetic */ C22590(C13856 c13856, C13856 c13857, int i) {
        this(c13856, c13857);
    }

    public C22590(C13856 c13856, C13856 c13857) {
        this.f73038 = c13856;
        this.f73039 = c13857;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22590)) {
            return false;
        }
        C22590 c22590 = (C22590) obj;
        return C17359.equals(this.f73038, c22590.f73038) && C17359.equals(this.f73039, c22590.f73039);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f73039) + (C17359.hashCode(this.f73038) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f73038, this.f73039};
        String[] strArrSplit = "left;right".length() == 0 ? new String[0] : "left;right".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C22590.class, sb, "[");
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
