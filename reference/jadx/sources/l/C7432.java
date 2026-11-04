package l;

/* JADX INFO: renamed from: l.ۜ᩸ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A3Q2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7432 extends AbstractC5107 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final String[] f24465;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f24466;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f24467;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f24468;

    public C7432(String[] strArr, int i) {
        this.f24465 = strArr;
        this.f24467 = i;
        int length = 0;
        for (int i2 = 0; i2 < i; i2++) {
            length += strArr[i2].length();
        }
        this.f24468 = length;
    }

    @Override // l.AbstractC5107
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7432.class != obj.getClass()) {
            throw new RuntimeException();
        }
        C7432 c7432 = (C7432) obj;
        int i = c7432.f24467;
        int i2 = this.f24467;
        if (i2 != i || this.f24468 != c7432.f24468) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!this.f24465[i3].equals(c7432.f24465[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // l.AbstractC5107
    public final int hashCode() {
        int iHashCode = this.f24466;
        if (iHashCode == 0 && this.f24468 > 0) {
            for (int i = 0; i < this.f24467; i++) {
                iHashCode = (iHashCode * 31) + this.f24465[i].hashCode();
            }
            this.f24466 = iHashCode;
        }
        return iHashCode;
    }

    @Override // l.AbstractC5107
    /* JADX INFO: renamed from: ۙ */
    public final String mo15452() {
        StringBuilder sb = new StringBuilder(this.f24468);
        for (int i = 0; i < this.f24467; i++) {
            sb.append(this.f24465[i]);
        }
        return sb.toString();
    }
}
