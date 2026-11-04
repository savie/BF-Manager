package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۡ֡۫, reason: contains not printable characters */
/* JADX INFO: compiled from: R9JP */
/* JADX INFO: loaded from: classes4.dex */
public final class C9009 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC2298 f29354;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC13484 f29355;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9973 f29356;

    public C9009(C9973 c9973, EnumC13484 enumC13484, EnumC2298 enumC2298) {
        this.f29356 = c9973;
        this.f29355 = enumC13484;
        this.f29354 = enumC2298;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9009)) {
            return false;
        }
        C9009 c9009 = (C9009) obj;
        return C17359.equals(this.f29356, c9009.f29356) && C17359.equals(this.f29355, c9009.f29355) && C17359.equals(this.f29354, c9009.f29354);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f29354) + ((C17359.hashCode(this.f29355) + (C17359.hashCode(this.f29356) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f29356, this.f29355, this.f29354};
        String[] strArrSplit = "key;signingMode;dialectMode".length() == 0 ? new String[0] : "key;signingMode;dialectMode".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C9009.class, sb, "[");
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
    public final EnumC2298 m24044() {
        return this.f29354;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC13484 m24045() {
        return this.f29355;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C9973 m24046() {
        return this.f29356;
    }
}
