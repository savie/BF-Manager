package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ᩳۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: W8GL */
/* JADX INFO: loaded from: classes5.dex */
public final class C18897 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Runnable f61314;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f61315;

    public C18897(int i, Runnable runnable) {
        this.f61315 = i;
        this.f61314 = runnable;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C18897)) {
            return false;
        }
        C18897 c18897 = (C18897) obj;
        return this.f61315 == c18897.f61315 && C17359.equals(this.f61314, c18897.f61314);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f61314) + (this.f61315 * 31);
    }

    public final int position() {
        return this.f61315;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f61315), this.f61314};
        String[] strArrSplit = "position;callback".length() == 0 ? new String[0] : "position;callback".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C18897.class, sb, "[");
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
    public final Runnable m43820() {
        return this.f61314;
    }
}
