package l;

/* JADX INFO: renamed from: l.ۙܽ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Q2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4779 extends AbstractC11836 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f16804;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] f16805;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public int f16806;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f16807;

    public C4779(String[] strArr, int i) {
        this.f16805 = strArr;
        this.f16807 = i;
        int length = 0;
        for (int i2 = 0; i2 < i; i2++) {
            length += strArr[i2].length();
        }
        this.f16804 = length;
    }

    @Override // l.AbstractC11836
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4779.class != obj.getClass()) {
            throw new RuntimeException();
        }
        C4779 c4779 = (C4779) obj;
        int i = c4779.f16807;
        int i2 = this.f16807;
        if (i2 != i || this.f16804 != c4779.f16804) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!this.f16805[i3].equals(c4779.f16805[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC11836
    public final int hashCode() {
        int iHashCode = this.f16806;
        if (iHashCode == 0 && this.f16804 > 0) {
            for (int i = 0; i < this.f16807; i++) {
                iHashCode = (iHashCode * 31) + this.f16805[i].hashCode();
            }
            this.f16806 = iHashCode;
        }
        return iHashCode;
    }

    @Override // l.AbstractC11836
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String mo13250() {
        StringBuilder sb = new StringBuilder(this.f16804);
        for (int i = 0; i < this.f16807; i++) {
            sb.append(this.f16805[i]);
        }
        return sb.toString();
    }
}
