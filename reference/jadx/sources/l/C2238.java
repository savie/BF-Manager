package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۖۖۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: I7DX */
/* JADX INFO: loaded from: classes2.dex */
public final class C2238 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f8028;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f8029;

    public C2238(int i, int i2) {
        this.f8029 = i;
        this.f8028 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2238)) {
            return false;
        }
        C2238 c2238 = (C2238) obj;
        return this.f8029 == c2238.f8029 && this.f8028 == c2238.f8028;
    }

    public final int hashCode() {
        return (this.f8029 * 31) + this.f8028;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f8029), Integer.valueOf(this.f8028)};
        String[] strArrSplit = "visibleParameterAnnotationsCount;invisibleParameterAnnotationsCount".length() == 0 ? new String[0] : "visibleParameterAnnotationsCount;invisibleParameterAnnotationsCount".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C2238.class, sb, "[");
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
    public final int m6873() {
        return this.f8029;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int m6875() {
        return this.f8028;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6874() {
        return this.f8029 > 0 || this.f8028 > 0;
    }
}
