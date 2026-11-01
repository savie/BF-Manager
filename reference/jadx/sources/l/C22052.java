package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩹ۙۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: S4H6 */
/* JADX INFO: loaded from: classes.dex */
public final class C22052 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C6529 f71471;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f71472;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC0884 f71473;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0507 f71474;

    public /* synthetic */ C22052(InterfaceC0507 interfaceC0507, int i, C6529 c6529, EnumC0884 enumC0884, int i2) {
        this(interfaceC0507, i, c6529, enumC0884);
    }

    public C22052(InterfaceC0507 interfaceC0507, int i, C6529 c6529, EnumC0884 enumC0884) {
        this.f71474 = interfaceC0507;
        this.f71472 = i;
        this.f71471 = c6529;
        this.f71473 = enumC0884;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C22052)) {
            return false;
        }
        C22052 c22052 = (C22052) obj;
        return this.f71472 == c22052.f71472 && C13638.equals(this.f71474, c22052.f71474) && C13638.equals(this.f71471, c22052.f71471) && C13638.equals(this.f71473, c22052.f71473);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f71473) + ((C13638.hashCode(this.f71471) + ((C13638.hashCode(this.f71474) + (this.f71472 * 31)) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f71474, Integer.valueOf(this.f71472), this.f71471, this.f71473};
        String[] strArrSplit = "owner;modifyCount;store;state".length() == 0 ? new String[0] : "owner;modifyCount;store;state".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C22052.class, sb, "[");
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
    public static C22052 m48999(InterfaceC0507 interfaceC0507, int i, int i2) {
        return new C22052(interfaceC0507, i, new C3706().m10878(i2), EnumC0884.IDLE);
    }
}
