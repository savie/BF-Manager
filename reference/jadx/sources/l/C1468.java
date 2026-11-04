package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֨᩸ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 35OM */
/* JADX INFO: loaded from: classes3.dex */
public final class C1468 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f5119;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f5120;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f5121;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f5122;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C5438 f5123;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* bridge */ /* synthetic */ C5438 m5244(C1468 c1468) {
        return c1468.f5123;
    }

    public C1468(C5438 c5438, boolean z, int i, boolean z2, boolean z3) {
        this.f5123 = c5438;
        this.f5120 = z;
        this.f5119 = i;
        this.f5121 = z2;
        this.f5122 = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1468)) {
            return false;
        }
        C1468 c1468 = (C1468) obj;
        return this.f5120 == c1468.f5120 && this.f5121 == c1468.f5121 && this.f5122 == c1468.f5122 && this.f5119 == c1468.f5119 && C17359.equals(this.f5123, c1468.f5123);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f5123) + ((((((((this.f5120 ? 1231 : 1237) * 31) + (this.f5121 ? 1231 : 1237)) * 31) + (this.f5122 ? 1231 : 1237)) * 31) + this.f5119) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f5123, Boolean.valueOf(this.f5120), Integer.valueOf(this.f5119), Boolean.valueOf(this.f5121), Boolean.valueOf(this.f5122)};
        String[] strArrSplit = "painter;keepWord;arrowWidth;startArrow;endArrow".length() == 0 ? new String[0] : "painter;keepWord;arrowWidth;startArrow;endArrow".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C1468.class, sb, "[");
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
