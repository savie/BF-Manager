package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۙ᩻۬, reason: contains not printable characters */
/* JADX INFO: compiled from: H74F */
/* JADX INFO: loaded from: classes3.dex */
public final class C4979 extends AbstractC17535 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f17358;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7648 f17359;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f17360;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C1693 f17361;

    public C4979(C1693 c1693, int i, C7648 c7648, int i2) {
        this.f17361 = c1693;
        this.f17358 = i;
        this.f17359 = c7648;
        this.f17360 = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4979)) {
            return false;
        }
        C4979 c4979 = (C4979) obj;
        return this.f17358 == c4979.f17358 && this.f17360 == c4979.f17360 && C13638.equals(this.f17361, c4979.f17361) && C13638.equals(this.f17359, c4979.f17359);
    }

    public final int hashCode() {
        return C13638.hashCode(this.f17359) + ((C13638.hashCode(this.f17361) + C17922.m41614(this.f17358, 31, this.f17360, 31)) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.f17361, Integer.valueOf(this.f17358), this.f17359, Integer.valueOf(this.f17360)};
        String[] strArrSplit = "group;trackIndex;format;sourceOrder".length() == 0 ? new String[0] : "group;trackIndex;format;sourceOrder".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C4979.class, sb, "[");
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
    public final int m13807() {
        return this.f17360;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7648 m13808() {
        return this.f17359;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1693 m13809() {
        return this.f17361;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int m13810() {
        return this.f17358;
    }
}
