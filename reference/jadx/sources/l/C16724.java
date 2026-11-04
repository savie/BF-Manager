package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ܺۡۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes5.dex */
public final class C16724 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2945 f54013;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f54014;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f54015;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC24930 f54016;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f54017;

    public C16724(InterfaceC24930 interfaceC24930, int i, C13101 c13101, int i2, int i3) {
        this.f54016 = interfaceC24930;
        this.f54014 = i;
        this.f54013 = c13101;
        this.f54015 = i2;
        this.f54017 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16724)) {
            return false;
        }
        C16724 c16724 = (C16724) obj;
        return this.f54014 == c16724.f54014 && this.f54015 == c16724.f54015 && this.f54017 == c16724.f54017 && C17359.equals(this.f54016, c16724.f54016) && C17359.equals(this.f54013, c16724.f54013);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f54013) + ((C17359.hashCode(this.f54016) + (((((this.f54014 * 31) + this.f54015) * 31) + this.f54017) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f54016, Integer.valueOf(this.f54014), this.f54013, Integer.valueOf(this.f54015), Integer.valueOf(this.f54017)};
        String[] strArrSplit = "descriptor;generation;callback;width;height".length() == 0 ? new String[0] : "descriptor;generation;callback;width;height".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C16724.class, sb, "[");
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
    public final InterfaceC2945 m39490() {
        return this.f54013;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m39491() {
        return this.f54014;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int m39492() {
        return this.f54015;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m39493() {
        return this.f54017;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC24930 m39494() {
        return this.f54016;
    }
}
