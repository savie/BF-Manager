package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩸ᩴ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: M799 */
/* JADX INFO: loaded from: classes.dex */
public final class C22995 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f74648;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f74649;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f74650;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f74651;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f74652;

    public C22995(int i, int i2, int i3, int i4, long j) {
        this.f74649 = i;
        this.f74648 = i2;
        this.f74652 = j;
        this.f74650 = i3;
        this.f74651 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22995)) {
            return false;
        }
        C22995 c22995 = (C22995) obj;
        return this.f74649 == c22995.f74649 && this.f74648 == c22995.f74648 && this.f74650 == c22995.f74650 && this.f74651 == c22995.f74651 && this.f74652 == c22995.f74652;
    }

    public final int hashCode() {
        int i = ((((((this.f74649 * 31) + this.f74648) * 31) + this.f74650) * 31) + this.f74651) * 31;
        long j = this.f74652;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f74649), Integer.valueOf(this.f74648), Long.valueOf(this.f74652), Integer.valueOf(this.f74650), Integer.valueOf(this.f74651)};
        String[] strArrSplit = "mediaToken;generation;positionMs;widthPx;heightPx".length() == 0 ? new String[0] : "mediaToken;generation;positionMs;widthPx;heightPx".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C22995.class, sb, "[");
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
