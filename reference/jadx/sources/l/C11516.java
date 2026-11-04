package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۧۡ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes4.dex */
public final class C11516 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f36231;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f36232;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f36233;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f36234;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f36235;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f36236;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f36237;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f36238;

    public C11516(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f36232 = i;
        this.f36231 = i2;
        this.f36238 = i3;
        this.f36237 = i4;
        this.f36234 = i5;
        this.f36236 = i6;
        this.f36233 = i7;
        this.f36235 = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11516)) {
            return false;
        }
        C11516 c11516 = (C11516) obj;
        return this.f36232 == c11516.f36232 && this.f36231 == c11516.f36231 && this.f36238 == c11516.f36238 && this.f36237 == c11516.f36237 && this.f36234 == c11516.f36234 && this.f36236 == c11516.f36236 && this.f36233 == c11516.f36233 && this.f36235 == c11516.f36235;
    }

    public final int hashCode() {
        return (((((((((((((this.f36232 * 31) + this.f36231) * 31) + this.f36238) * 31) + this.f36237) * 31) + this.f36234) * 31) + this.f36236) * 31) + this.f36233) * 31) + this.f36235;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f36232), Integer.valueOf(this.f36231), Integer.valueOf(this.f36238), Integer.valueOf(this.f36237), Integer.valueOf(this.f36234), Integer.valueOf(this.f36236), Integer.valueOf(this.f36233), Integer.valueOf(this.f36235)};
        String[] strArrSplit = "startIndex;endIndex;leftStart;leftEnd;rightStart;rightEnd;leftLine;rightLine".length() == 0 ? new String[0] : "startIndex;endIndex;leftStart;leftEnd;rightStart;rightEnd;leftLine;rightLine".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C11516.class, sb, "[");
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
