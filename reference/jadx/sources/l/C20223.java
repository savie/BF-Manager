package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩶ܳۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes5.dex */
public final class C20223 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f65636;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC12359 f65637;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f65638;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f65639;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2916 f65640;

    public C20223(AbstractC12359 abstractC12359, InterfaceC2916 interfaceC2916, int i, int i2, int i3) {
        this.f65637 = abstractC12359;
        this.f65640 = interfaceC2916;
        this.f65639 = i;
        this.f65636 = i2;
        this.f65638 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C20223)) {
            return false;
        }
        C20223 c20223 = (C20223) obj;
        return this.f65639 == c20223.f65639 && this.f65636 == c20223.f65636 && this.f65638 == c20223.f65638 && C13638.equals(this.f65637, c20223.f65637) && C13638.equals(this.f65640, c20223.f65640);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f65640) + ((C13638.hashCode(this.f65637) + (((((this.f65639 * 31) + this.f65636) * 31) + this.f65638) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f65637, this.f65640, Integer.valueOf(this.f65639), Integer.valueOf(this.f65636), Integer.valueOf(this.f65638)};
        String[] strArrSplit = "layout;owner;version;x;y".length() == 0 ? new String[0] : "layout;owner;version;x;y".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C20223.class, sb, "[");
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
