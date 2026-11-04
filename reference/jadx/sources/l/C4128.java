package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۘۧ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: E6PC */
/* JADX INFO: loaded from: classes3.dex */
public final class C4128 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int[] f13997;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f13998;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C5949 f13999;

    public C4128(int[] iArr, int i, C5949 c5949) {
        this.f13997 = iArr;
        this.f13998 = i;
        this.f13999 = c5949;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4128)) {
            return false;
        }
        C4128 c4128 = (C4128) obj;
        return this.f13998 == c4128.f13998 && C17359.equals(this.f13997, c4128.f13997) && C17359.equals(this.f13999, c4128.f13999);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f13999) + ((C17359.hashCode(this.f13997) + (this.f13998 * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f13997, Integer.valueOf(this.f13998), this.f13999};
        String[] strArrSplit = "choices;lastPart;diagnostic".length() == 0 ? new String[0] : "choices;lastPart;diagnostic".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C4128.class, sb, "[");
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
