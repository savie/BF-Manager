package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֫᩸֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N7FV */
/* JADX INFO: loaded from: classes3.dex */
public final class C2200 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2386 f7226;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f7227;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f7228;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f7229;

    public C2200(InterfaceC2386 interfaceC2386, String str, boolean z, int i) {
        this.f7226 = interfaceC2386;
        this.f7228 = str;
        this.f7229 = z;
        this.f7227 = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2200)) {
            return false;
        }
        C2200 c2200 = (C2200) obj;
        return this.f7229 == c2200.f7229 && this.f7227 == c2200.f7227 && C17359.equals(this.f7226, c2200.f7226) && C17359.equals(this.f7228, c2200.f7228);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f7228) + ((C17359.hashCode(this.f7226) + C18176.m42345(this.f7229 ? 1231 : 1237, 31, this.f7227, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f7226, this.f7228, Boolean.valueOf(this.f7229), Integer.valueOf(this.f7227)};
        String[] strArrSplit = "fileItem;mimeType;sameBaseName;priority".length() == 0 ? new String[0] : "fileItem;mimeType;sameBaseName;priority".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C2200.class, sb, "[");
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
    public final InterfaceC2386 m7510() {
        return this.f7226;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m7511() {
        return this.f7227;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m7512() {
        return this.f7229;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m7513() {
        return this.f7228;
    }
}
