package l;

/* JADX INFO: renamed from: l.ۗܿۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C3564 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f12209;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f12210;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f12211;

    public C3564(int i, int i2, int i3) {
        this.f12210 = i;
        this.f12211 = i2;
        this.f12209 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m11612() {
        return this.f12210;
    }

    public final String toString() {
        return this.f12211 + "," + this.f12209 + ":" + this.f12210;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3564.class == obj.getClass()) {
            C3564 c3564 = (C3564) obj;
            if (this.f12210 == c3564.f12210 && this.f12211 == c3564.f12211 && this.f12209 == c3564.f12209) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f12210 * 31) + this.f12211) * 31) + this.f12209;
    }
}
