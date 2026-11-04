package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۧܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes4.dex */
public final class C11684 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f37843;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f37844;

    public C11684(int i, int i2) {
        this.f37843 = i;
        this.f37844 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11684)) {
            return false;
        }
        C11684 c11684 = (C11684) obj;
        return this.f37843 == c11684.f37843 && this.f37844 == c11684.f37844;
    }

    public final int hashCode() {
        return (this.f37843 * 31) + this.f37844;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f37843), Integer.valueOf(this.f37844)};
        String[] strArrSplit = "blockCount;lastLength".length() == 0 ? new String[0] : "blockCount;lastLength".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C11684.class, sb, "[");
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
