package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܶ᩷֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K5ZN */
/* JADX INFO: loaded from: classes5.dex */
public final class C16347 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14902 f53085;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f53086;

    public C16347(C14902 c14902, int i) {
        this.f53085 = c14902;
        this.f53086 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16347)) {
            return false;
        }
        C16347 c16347 = (C16347) obj;
        return this.f53086 == c16347.f53086 && C17359.equals(this.f53085, c16347.f53085);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f53085) + (this.f53086 * 31);
    }

    public final int position() {
        return this.f53086;
    }

    public final String toString() {
        Object[] objArr = {this.f53085, Integer.valueOf(this.f53086)};
        String[] strArrSplit = "mediaItem;position".length() == 0 ? new String[0] : "mediaItem;position".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C16347.class, sb, "[");
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
    public final C14902 m38844() {
        return this.f53085;
    }
}
