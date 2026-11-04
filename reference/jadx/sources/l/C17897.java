package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܽ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6VU */
/* JADX INFO: loaded from: classes5.dex */
public final class C17897 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f58630;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C11974 f58631;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f58632;

    public C17897(int i, int i2, C11974 c11974) {
        this.f58632 = i;
        this.f58630 = i2;
        this.f58631 = c11974;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17897)) {
            return false;
        }
        C17897 c17897 = (C17897) obj;
        return this.f58632 == c17897.f58632 && this.f58630 == c17897.f58630 && C17359.equals(this.f58631, c17897.f58631);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f58631) + C18176.m42345(this.f58632, 31, this.f58630, 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f58632), Integer.valueOf(this.f58630), this.f58631};
        String[] strArrSplit = "start;end;style".length() == 0 ? new String[0] : "start;end;style".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C17897.class, sb, "[");
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
