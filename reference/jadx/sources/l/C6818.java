package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۜ֫ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D6KU */
/* JADX INFO: loaded from: classes3.dex */
public final class C6818 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String f22682;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f22683;

    public C6818(String str, String str2) {
        this.f22683 = str;
        this.f22682 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6818)) {
            return false;
        }
        C6818 c6818 = (C6818) obj;
        return C17359.equals(this.f22683, c6818.f22683) && C17359.equals(this.f22682, c6818.f22682);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f22682) + (C17359.hashCode(this.f22683) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f22683, this.f22682};
        String[] strArrSplit = "source;path".length() == 0 ? new String[0] : "source;path".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C6818.class, sb, "[");
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
