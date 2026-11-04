package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۡۙᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6PS */
/* JADX INFO: loaded from: classes4.dex */
public final class C9145 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f29718;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f29719;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f29720;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f29721;

    public C9145(int i, int i2, int i3, int i4) {
        this.f29721 = i;
        this.f29718 = i2;
        this.f29719 = i3;
        this.f29720 = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9145)) {
            return false;
        }
        C9145 c9145 = (C9145) obj;
        return this.f29721 == c9145.f29721 && this.f29718 == c9145.f29718 && this.f29719 == c9145.f29719 && this.f29720 == c9145.f29720;
    }

    public final int hashCode() {
        return (((((this.f29721 * 31) + this.f29718) * 31) + this.f29719) * 31) + this.f29720;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f29721), Integer.valueOf(this.f29718), Integer.valueOf(this.f29719), Integer.valueOf(this.f29720)};
        String[] strArrSplit = "start;end;selectionStart;selectionEnd".length() == 0 ? new String[0] : "start;end;selectionStart;selectionEnd".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C9145.class, sb, "[");
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
    public final int m24281() {
        return this.f29718;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m24283() {
        return this.f29719;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m24284() {
        return this.f29721;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m24285() {
        return this.f29720;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m24282(int i) {
        return (i >= this.f29721 && i < this.f29718) || i == this.f29719 || i == this.f29720;
    }
}
