package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۚ۟۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 67G0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5500 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Throwable f19130;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC16686 f19131;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f19132;

    public C5500(EnumC16686 enumC16686, Throwable th, boolean z) {
        this.f19131 = enumC16686;
        this.f19130 = th;
        this.f19132 = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5500)) {
            return false;
        }
        C5500 c5500 = (C5500) obj;
        return this.f19132 == c5500.f19132 && C17359.equals(this.f19131, c5500.f19131) && C17359.equals(this.f19130, c5500.f19130);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f19130) + ((C17359.hashCode(this.f19131) + ((this.f19132 ? 1231 : 1237) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f19131, this.f19130, Boolean.valueOf(this.f19132)};
        String[] strArrSplit = "state;error;signingDisabledCandidate".length() == 0 ? new String[0] : "state;error;signingDisabledCandidate".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C5500.class, sb, "[");
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
    public final Throwable m16327() {
        return this.f19130;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final EnumC16686 m16328() {
        return this.f19131;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m16329() {
        return this.f19132;
    }
}
