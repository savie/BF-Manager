package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۗۚ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 37EB */
/* JADX INFO: loaded from: classes3.dex */
public final class C3207 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6936 f10459;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f10460;

    public C3207(String str, C6936 c6936) {
        this.f10460 = str;
        this.f10459 = c6936;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3207)) {
            return false;
        }
        C3207 c3207 = (C3207) obj;
        return C17359.equals(this.f10460, c3207.f10460) && C17359.equals(this.f10459, c3207.f10459);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f10459) + (C17359.hashCode(this.f10460) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f10460, this.f10459};
        String[] strArrSplit = "strBsm;cpx2Const".length() == 0 ? new String[0] : "strBsm;cpx2Const".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C3207.class, sb, "[");
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
    public final C6936 m10548() {
        return this.f10459;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m10549() {
        return this.f10460;
    }
}
