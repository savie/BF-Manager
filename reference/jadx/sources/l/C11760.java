package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۧܽ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: V6PG */
/* JADX INFO: loaded from: classes4.dex */
public final class C11760 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f38008;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f38009;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f38010;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f38011;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean f38012;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f38013;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean f38014;

    public C11760(int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f38011 = i;
        this.f38013 = i2;
        this.f38010 = i3;
        this.f38008 = z;
        this.f38012 = z2;
        this.f38009 = z3;
        this.f38014 = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11760)) {
            return false;
        }
        C11760 c11760 = (C11760) obj;
        return this.f38008 == c11760.f38008 && this.f38012 == c11760.f38012 && this.f38009 == c11760.f38009 && this.f38014 == c11760.f38014 && this.f38011 == c11760.f38011 && this.f38013 == c11760.f38013 && this.f38010 == c11760.f38010;
    }

    public final int hashCode() {
        return ((((((((((((this.f38008 ? 1231 : 1237) * 31) + (this.f38012 ? 1231 : 1237)) * 31) + (this.f38009 ? 1231 : 1237)) * 31) + (this.f38014 ? 1231 : 1237)) * 31) + this.f38011) * 31) + this.f38013) * 31) + this.f38010;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f38011), Integer.valueOf(this.f38013), Integer.valueOf(this.f38010), Boolean.valueOf(this.f38008), Boolean.valueOf(this.f38012), Boolean.valueOf(this.f38009), Boolean.valueOf(this.f38014)};
        String[] strArrSplit = "start;end;type;breakBefore;protectedText;groupBefore;protectedGap".length() == 0 ? new String[0] : "start;end;type;breakBefore;protectedText;groupBefore;protectedGap".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C11760.class, sb, "[");
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
