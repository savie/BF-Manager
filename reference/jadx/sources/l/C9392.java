package l;

import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ۢۛۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 28WH */
/* JADX INFO: loaded from: classes3.dex */
public final class C9392 extends AbstractC17535 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f31792;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f31793;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f31794;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f31795;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f31796;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f31797;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f31798;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f31799;

    public C9392(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f31797 = i;
        this.f31794 = i2;
        this.f31793 = i3;
        this.f31798 = i4;
        this.f31792 = i5;
        this.f31795 = i6;
        this.f31796 = i7;
        this.f31799 = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9392)) {
            return false;
        }
        C9392 c9392 = (C9392) obj;
        return this.f31797 == c9392.f31797 && this.f31794 == c9392.f31794 && this.f31793 == c9392.f31793 && this.f31798 == c9392.f31798 && this.f31792 == c9392.f31792 && this.f31795 == c9392.f31795 && this.f31796 == c9392.f31796 && this.f31799 == c9392.f31799;
    }

    public final int hashCode() {
        return (((((((((((((this.f31797 * 31) + this.f31794) * 31) + this.f31793) * 31) + this.f31798) * 31) + this.f31792) * 31) + this.f31795) * 31) + this.f31796) * 31) + this.f31799;
    }

    public final String toString() {
        Object[] objArr = {Integer.valueOf(this.f31797), Integer.valueOf(this.f31794), Integer.valueOf(this.f31793), Integer.valueOf(this.f31798), Integer.valueOf(this.f31792), Integer.valueOf(this.f31795), Integer.valueOf(this.f31796), Integer.valueOf(this.f31799)};
        String[] strArrSplit = "startIndex;endIndex;leftStart;leftEnd;rightStart;rightEnd;leftLine;rightLine".length() == 0 ? new String[0] : "startIndex;endIndex;leftStart;leftEnd;rightStart;rightEnd;leftLine;rightLine".split(l.b);
        StringBuilder sb = new StringBuilder();
        C17745.m41311(C9392.class, sb, "[");
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
