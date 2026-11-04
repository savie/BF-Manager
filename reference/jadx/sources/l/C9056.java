package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۡ֫ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: G7TV */
/* JADX INFO: loaded from: classes4.dex */
public final class C9056 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final byte[] f29453;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f29454;

    public C9056(int i, byte[] bArr) {
        this.f29454 = i;
        this.f29453 = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9056)) {
            return false;
        }
        C9056 c9056 = (C9056) obj;
        return this.f29454 == c9056.f29454 && C17359.equals(this.f29453, c9056.f29453);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f29453) + (this.f29454 * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f29454), this.f29453};
        String[] strArrSplit = "type;data".length() == 0 ? new String[0] : "type;data".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C9056.class, sb, "[");
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
