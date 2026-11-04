package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.᩻ۛ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6RB */
/* JADX INFO: loaded from: classes.dex */
public final class C24860 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f80460;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f80461;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f80462;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f80463;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f80464;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f80465;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f80466;

    public C24860(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f80465 = i;
        this.f80461 = i2;
        this.f80462 = i3;
        this.f80463 = i4;
        this.f80460 = i5;
        this.f80464 = i6;
        this.f80466 = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C24860)) {
            return false;
        }
        C24860 c24860 = (C24860) obj;
        return this.f80465 == c24860.f80465 && this.f80461 == c24860.f80461 && this.f80462 == c24860.f80462 && this.f80463 == c24860.f80463 && this.f80460 == c24860.f80460 && this.f80464 == c24860.f80464 && this.f80466 == c24860.f80466;
    }

    public final int hashCode() {
        return (((((((((((this.f80465 * 31) + this.f80461) * 31) + this.f80462) * 31) + this.f80463) * 31) + this.f80460) * 31) + this.f80464) * 31) + this.f80466;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f80465), Integer.valueOf(this.f80461), Integer.valueOf(this.f80462), Integer.valueOf(this.f80463), Integer.valueOf(this.f80460), Integer.valueOf(this.f80464), Integer.valueOf(this.f80466)};
        String[] strArrSplit = "first;last;type;start;end;line;level".length() == 0 ? new String[0] : "first;last;type;start;end;line;level".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C24860.class, sb, "[");
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
