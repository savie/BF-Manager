package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۜ۫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: P71B */
/* JADX INFO: loaded from: classes4.dex */
public final class C7145 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C7145 f23635 = new C7145(0, null);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f23636;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13856 f23637;

    public final int length() {
        C13856 c13856 = this.f23637;
        if (c13856 == null) {
            return 0;
        }
        return c13856.f43959;
    }

    public C7145(int i, C13856 c13856) {
        this.f23636 = i;
        this.f23637 = c13856;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7145)) {
            return false;
        }
        C7145 c7145 = (C7145) obj;
        return this.f23636 == c7145.f23636 && C17359.equals(this.f23637, c7145.f23637);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f23637) + (this.f23636 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f23636), this.f23637};
        String[] strArrSplit = "offset;spans".length() == 0 ? new String[0] : "offset;spans".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C7145.class, sb, "[");
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
    public final int m19710() {
        return this.f23636;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13856 m19711() {
        return this.f23637;
    }
}
