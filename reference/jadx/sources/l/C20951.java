package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩶֡᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: E6SY */
/* JADX INFO: loaded from: classes5.dex */
public final class C20951 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f67019;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21697 f67020;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12219 f67021;

    public C20951(C21697 c21697, C12219 c12219, int i) {
        this.f67020 = c21697;
        this.f67021 = c12219;
        this.f67019 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20951)) {
            return false;
        }
        C20951 c20951 = (C20951) obj;
        return this.f67019 == c20951.f67019 && C17359.equals(this.f67020, c20951.f67020) && C17359.equals(this.f67021, c20951.f67021);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f67021) + ((C17359.hashCode(this.f67020) + (this.f67019 * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f67020, this.f67021, Integer.valueOf(this.f67019)};
        String[] strArrSplit = "text;history;activePageOffset".length() == 0 ? new String[0] : "text;history;activePageOffset".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C20951.class, sb, "[");
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
    public final int m47905() {
        return this.f67019;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C21697 m47906() {
        return this.f67020;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C12219 m47907() {
        return this.f67021;
    }
}
