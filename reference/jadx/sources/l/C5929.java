package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۚ᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes3.dex */
public final class C5929 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 f20276;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f20277;

    public C5929(InterfaceC2386 interfaceC2386, String str) {
        this.f20276 = interfaceC2386;
        this.f20277 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5929)) {
            return false;
        }
        C5929 c5929 = (C5929) obj;
        return C17359.equals(this.f20276, c5929.f20276) && C17359.equals(this.f20277, c5929.f20277);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f20277) + (C17359.hashCode(this.f20276) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f20276, this.f20277};
        String[] strArrSplit = "fileItem;mimeType".length() == 0 ? new String[0] : "fileItem;mimeType".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C5929.class, sb, "[");
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
    public final InterfaceC2386 m17243() {
        return this.f20276;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m17244() {
        return this.f20277;
    }
}
