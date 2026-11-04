package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩹᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 46OI */
/* JADX INFO: loaded from: classes.dex */
public final class C23821 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f77160;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f77161;

    public C23821(int i, int i2) {
        this.f77161 = i;
        this.f77160 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C23821)) {
            return false;
        }
        C23821 c23821 = (C23821) obj;
        return this.f77161 == c23821.f77161 && this.f77160 == c23821.f77160;
    }

    public final int hashCode() {
        return (this.f77161 * 31) + this.f77160;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f77161), Integer.valueOf(this.f77160)};
        String[] strArrSplit = "start;end".length() == 0 ? new String[0] : "start;end".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C23821.class, sb, "[");
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
    public final int m53153() {
        return this.f77160;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m53154() {
        return this.f77161;
    }
}
