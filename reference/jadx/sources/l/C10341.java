package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۤܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D70T */
/* JADX INFO: loaded from: classes3.dex */
public final class C10341 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC18745 f35455;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18101[] f35456;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f35457;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f35458;

    public C10341(int i, InterfaceC18745 interfaceC18745, int i2, C18101[] c18101Arr) {
        this.f35458 = i;
        this.f35455 = interfaceC18745;
        this.f35457 = i2;
        this.f35456 = c18101Arr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10341)) {
            return false;
        }
        C10341 c10341 = (C10341) obj;
        return this.f35458 == c10341.f35458 && this.f35457 == c10341.f35457 && C13638.equals(this.f35455, c10341.f35455) && C13638.equals(this.f35456, c10341.f35456);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f35456) + ((C13638.hashCode(this.f35455) + C17922.m41614(this.f35458, 31, this.f35457, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f35458), this.f35455, Integer.valueOf(this.f35457), this.f35456};
        String[] strArrSplit = "index;source;occurrenceBytes;backings".length() == 0 ? new String[0] : "index;source;occurrenceBytes;backings".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C10341.class, sb, "[");
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

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int m26245() {
        return this.f35457;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C18101[] m26246() {
        return this.f35456;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m26247() {
        return this.f35458;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final InterfaceC18745 m26248() {
        return this.f35455;
    }
}
