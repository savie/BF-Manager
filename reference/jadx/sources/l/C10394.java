package l;

import com.alipay.sdk.m.y.l;
import org.bouncycastle.asn1.bc.ExternalValue$$ExternalSyntheticOutline0;

/* JADX INFO: renamed from: l.ۢ᩷ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10394 extends AbstractC2323 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f33041;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C18415 f33042;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final int f33043;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final InterfaceC9629 f33044;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f33045;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f33046;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f33047;

    public C10394(int i, C18415 c18415, InterfaceC9629 interfaceC9629, int i2, int i3, int i4, int i5) {
        this.f33041 = i;
        this.f33042 = c18415;
        this.f33044 = interfaceC9629;
        this.f33046 = i2;
        this.f33043 = i3;
        this.f33045 = i4;
        this.f33047 = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10394)) {
            return false;
        }
        C10394 c10394 = (C10394) obj;
        return this.f33041 == c10394.f33041 && this.f33046 == c10394.f33046 && this.f33043 == c10394.f33043 && this.f33045 == c10394.f33045 && this.f33047 == c10394.f33047 && C17359.equals(this.f33042, c10394.f33042) && C17359.equals(this.f33044, c10394.f33044);
    }

    public final int hashCode() {
        return C17359.hashCode(this.f33044) + ((C17359.hashCode(this.f33042) + (((((((((this.f33041 * 31) + this.f33046) * 31) + this.f33043) * 31) + this.f33045) * 31) + this.f33047) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f33041), this.f33042, this.f33044, Integer.valueOf(this.f33046), Integer.valueOf(this.f33043), Integer.valueOf(this.f33045), Integer.valueOf(this.f33047)};
        String[] strArrSplit = "generation;pattern;text;modifyCount;textLength;rangeStart;rangeEnd".length() == 0 ? new String[0] : "generation;pattern;text;modifyCount;textLength;rangeStart;rangeEnd".split(l.b);
        StringBuilder sb = new StringBuilder();
        ExternalValue$$ExternalSyntheticOutline0.m(C10394.class, sb, "[");
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

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static boolean m26704(C10394 c10394) {
        return c10394.f33045 >= 0;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static boolean m26702(C10394 c10394) {
        InterfaceC9629 interfaceC9629 = c10394.f33044;
        int iMo15344 = interfaceC9629.mo15344();
        int i = c10394.f33046;
        return iMo15344 == i && interfaceC9629.length() == c10394.f33043 && interfaceC9629.mo15344() == i;
    }
}
