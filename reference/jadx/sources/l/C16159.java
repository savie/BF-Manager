package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܶܳܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes5.dex */
public final class C16159 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean f52460;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f52461;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f52462;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f52463;

    public C16159(int i, int i2, boolean z, boolean z2) {
        this.f52463 = i;
        this.f52461 = i2;
        this.f52462 = z;
        this.f52460 = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16159)) {
            return false;
        }
        C16159 c16159 = (C16159) obj;
        return this.f52462 == c16159.f52462 && this.f52460 == c16159.f52460 && this.f52463 == c16159.f52463 && this.f52461 == c16159.f52461;
    }

    public final int hashCode() {
        return ((((((this.f52462 ? 1231 : 1237) * 31) + (this.f52460 ? 1231 : 1237)) * 31) + this.f52463) * 31) + this.f52461;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f52463), Integer.valueOf(this.f52461), Boolean.valueOf(this.f52462), Boolean.valueOf(this.f52460)};
        String[] strArrSplit = "selectionStart;selectionEnd;selectHexFirstChar;multiSelect".length() == 0 ? new String[0] : "selectionStart;selectionEnd;selectHexFirstChar;multiSelect".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C16159.class, sb, "[");
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
    public final boolean m38335() {
        return this.f52460;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m38336() {
        return this.f52461;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m38337() {
        return this.f52463;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean m38338() {
        return this.f52462;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m38334(C16159 c16159, int i) {
        int i2 = c16159.f52461;
        int i3 = c16159.f52463;
        if (c16159.f52460) {
            if (i == 0 || i3 < 0 || i2 < i3 || i2 >= i) {
                throw new IllegalArgumentException("Invalid history range selection");
            }
            return;
        }
        if (i3 < 0 || i3 != i2 || i3 > i || (i3 == i && !c16159.f52462)) {
            throw new IllegalArgumentException("Invalid history cursor selection");
        }
    }
}
