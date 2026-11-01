package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܺۡ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: B75R */
/* JADX INFO: loaded from: classes4.dex */
public final class C15835 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f51247;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20170 f51248;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f51249;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f51250;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20773 f51251;

    public C15835(InterfaceC20773 interfaceC20773, int i, C11662 c11662, int i2, int i3) {
        this.f51251 = interfaceC20773;
        this.f51250 = i;
        this.f51248 = c11662;
        this.f51249 = i2;
        this.f51247 = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15835)) {
            return false;
        }
        C15835 c15835 = (C15835) obj;
        return this.f51250 == c15835.f51250 && this.f51249 == c15835.f51249 && this.f51247 == c15835.f51247 && C13638.equals(this.f51251, c15835.f51251) && C13638.equals(this.f51248, c15835.f51248);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f51248) + ((C13638.hashCode(this.f51251) + (((((this.f51250 * 31) + this.f51249) * 31) + this.f51247) * 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f51251, Integer.valueOf(this.f51250), this.f51248, Integer.valueOf(this.f51249), Integer.valueOf(this.f51247)};
        String[] strArrSplit = "descriptor;generation;callback;width;height".length() == 0 ? new String[0] : "descriptor;generation;callback;width;height".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C15835.class, sb, "[");
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int m37643() {
        return this.f51249;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m37644() {
        return this.f51250;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20170 m37645() {
        return this.f51248;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final InterfaceC20773 m37646() {
        return this.f51251;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m37647() {
        return this.f51247;
    }
}
