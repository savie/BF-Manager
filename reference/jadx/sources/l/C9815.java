package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۢۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K74T */
/* JADX INFO: loaded from: classes4.dex */
public final class C9815 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f31620;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0867 f31621;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final EnumC7029 f31622;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0867 f31623;

    public C9815(EnumC7029 enumC7029, C0867 c0867, C0867 c0868, String str) {
        this.f31622 = enumC7029;
        this.f31621 = c0867;
        this.f31623 = c0868;
        this.f31620 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9815)) {
            return false;
        }
        C9815 c9815 = (C9815) obj;
        return C17359.equals(this.f31622, c9815.f31622) && C17359.equals(this.f31621, c9815.f31621) && C17359.equals(this.f31623, c9815.f31623) && C17359.equals(this.f31620, c9815.f31620);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f31620) + ((C17359.hashCode(this.f31623) + ((C17359.hashCode(this.f31621) + (C17359.hashCode(this.f31622) * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f31622, this.f31621, this.f31623, this.f31620};
        String[] strArrSplit = "containerType;initialization;media;bitmapCacheKey".length() == 0 ? new String[0] : "containerType;initialization;media;bitmapCacheKey".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C9815.class, sb, "[");
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
