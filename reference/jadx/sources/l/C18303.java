package l;

/* JADX INFO: renamed from: l.ܿۨۙ, reason: contains not printable characters */
/* JADX INFO: compiled from: R3P1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18303 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public static final C18303 f59691 = new C18303(-1, -1);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f59692;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f59693;

    static {
        new C18303(0, 0);
    }

    public C18303(int i, int i2) {
        C20782.m47565((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f59693 = i;
        this.f59692 = i2;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int m42689() {
        return this.f59693;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m42688() {
        return this.f59692;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C18303) {
            C18303 c18303 = (C18303) obj;
            if (this.f59693 == c18303.f59693 && this.f59692 == c18303.f59692) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return this.f59693 + "x" + this.f59692;
    }

    public final int hashCode() {
        int i = this.f59693;
        return ((i >>> 16) | (i << 16)) ^ this.f59692;
    }
}
