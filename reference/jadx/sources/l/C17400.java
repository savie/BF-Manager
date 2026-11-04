package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܽۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes5.dex */
public final class C17400 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f56569;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f56570;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String f56571;

    public C17400(int i, int i2, String str) {
        this.f56570 = i;
        this.f56569 = i2;
        this.f56571 = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17400)) {
            return false;
        }
        C17400 c17400 = (C17400) obj;
        return this.f56570 == c17400.f56570 && this.f56569 == c17400.f56569 && C17359.equals(this.f56571, c17400.f56571);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f56571) + C18176.m42345(this.f56570, 31, this.f56569, 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f56570), Integer.valueOf(this.f56569), this.f56571};
        String[] strArrSplit = "start;end;replacement".length() == 0 ? new String[0] : "start;end;replacement".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C17400.class, sb, "[");
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
