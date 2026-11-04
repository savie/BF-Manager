package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.֫֫᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: M6OA */
/* JADX INFO: loaded from: classes3.dex */
public final class C1607 extends AbstractC2323 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean f5517;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f5518;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f5519;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f5520;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f5521;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean f5522;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean f5523;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f5524;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f5525;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f5526;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f5527;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f5528;

    public C1607(int i, int i2, int i3, int i4, int i5, String str, boolean z, boolean z2, boolean z3, boolean z4, int i6, boolean z5) {
        this.f5528 = i;
        this.f5526 = i2;
        this.f5524 = i3;
        this.f5519 = i4;
        this.f5525 = i5;
        this.f5527 = str;
        this.f5522 = z;
        this.f5517 = z2;
        this.f5521 = z3;
        this.f5518 = z4;
        this.f5520 = i6;
        this.f5523 = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1607)) {
            return false;
        }
        C1607 c1607 = (C1607) obj;
        return this.f5522 == c1607.f5522 && this.f5517 == c1607.f5517 && this.f5521 == c1607.f5521 && this.f5518 == c1607.f5518 && this.f5523 == c1607.f5523 && this.f5528 == c1607.f5528 && this.f5526 == c1607.f5526 && this.f5524 == c1607.f5524 && this.f5519 == c1607.f5519 && this.f5525 == c1607.f5525 && this.f5520 == c1607.f5520 && C17359.equals(this.f5527, c1607.f5527);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f5527) + ((((((((((((((((((((((this.f5522 ? 1231 : 1237) * 31) + (this.f5517 ? 1231 : 1237)) * 31) + (this.f5521 ? 1231 : 1237)) * 31) + (this.f5518 ? 1231 : 1237)) * 31) + (this.f5523 ? 1231 : 1237)) * 31) + this.f5528) * 31) + this.f5526) * 31) + this.f5524) * 31) + this.f5519) * 31) + this.f5525) * 31) + this.f5520) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f5528), Integer.valueOf(this.f5526), Integer.valueOf(this.f5524), Integer.valueOf(this.f5519), Integer.valueOf(this.f5525), this.f5527, Boolean.valueOf(this.f5522), Boolean.valueOf(this.f5517), Boolean.valueOf(this.f5521), Boolean.valueOf(this.f5518), Integer.valueOf(this.f5520), Boolean.valueOf(this.f5523)};
        String[] strArrSplit = "start;end;type;indent;gapEnd;gap;hardBreak;protectedText;softBefore;continuation;functionEnd;groupBefore".length() == 0 ? new String[0] : "start;end;type;indent;gapEnd;gap;hardBreak;protectedText;softBefore;continuation;functionEnd;groupBefore".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C1607.class, sb, "[");
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
