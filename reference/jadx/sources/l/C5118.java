package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۚۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5118 extends AbstractC17535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f17822;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f17823;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f17824;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f17825;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C14690 f17826;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f17827;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC0507 f17828;

    public C5118(int i, C14690 c14690, InterfaceC0507 interfaceC0507, int i2, int i3, int i4, int i5) {
        this.f17824 = i;
        this.f17826 = c14690;
        this.f17828 = interfaceC0507;
        this.f17827 = i2;
        this.f17822 = i3;
        this.f17825 = i4;
        this.f17823 = i5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5118)) {
            return false;
        }
        C5118 c5118 = (C5118) obj;
        return this.f17824 == c5118.f17824 && this.f17827 == c5118.f17827 && this.f17822 == c5118.f17822 && this.f17825 == c5118.f17825 && this.f17823 == c5118.f17823 && C13638.equals(this.f17826, c5118.f17826) && C13638.equals(this.f17828, c5118.f17828);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f17828) + ((C13638.hashCode(this.f17826) + (((((((((this.f17824 * 31) + this.f17827) * 31) + this.f17822) * 31) + this.f17825) * 31) + this.f17823) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f17824), this.f17826, this.f17828, Integer.valueOf(this.f17827), Integer.valueOf(this.f17822), Integer.valueOf(this.f17825), Integer.valueOf(this.f17823)};
        String[] strArrSplit = "generation;pattern;text;modifyCount;textLength;rangeStart;rangeEnd".length() == 0 ? new String[0] : "generation;pattern;text;modifyCount;textLength;rangeStart;rangeEnd".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C5118.class, sb, "[");
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

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static boolean m14269(C5118 c5118) {
        return c5118.f17825 >= 0;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static boolean m14265(C5118 c5118) {
        InterfaceC0507 interfaceC0507 = c5118.f17828;
        int iMo2395 = interfaceC0507.mo2395();
        int i = c5118.f17827;
        return iMo2395 == i && interfaceC0507.length() == c5118.f17822 && interfaceC0507.mo2395() == i;
    }
}
