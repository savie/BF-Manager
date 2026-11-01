package l;

import android.graphics.Insets;

/* JADX INFO: renamed from: l.ܰܿ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1B7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13954 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C13954 f45911 = new C13954(0, 0, 0, 0);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f45912;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f45913;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f45914;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f45915;

    public C13954(int i, int i2, int i3, int i4) {
        this.f45915 = i;
        this.f45912 = i2;
        this.f45914 = i3;
        this.f45913 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13954 m33793(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f45911;
        }
        return new C13954(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13954 m33795(C13954 c13954, C13954 c13955) {
        return m33793(Math.max(c13954.f45915, c13955.f45915), Math.max(c13954.f45912, c13955.f45912), Math.max(c13954.f45914, c13955.f45914), Math.max(c13954.f45913, c13955.f45913));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13954.class != obj.getClass()) {
            return false;
        }
        C13954 c13954 = (C13954) obj;
        return this.f45913 == c13954.f45913 && this.f45915 == c13954.f45915 && this.f45914 == c13954.f45914 && this.f45912 == c13954.f45912;
    }

    public final int hashCode() {
        return (((((this.f45915 * 31) + this.f45912) * 31) + this.f45914) * 31) + this.f45913;
    }

    public final String toString() {
        return "Insets{left=" + this.f45915 + ", top=" + this.f45912 + ", right=" + this.f45914 + ", bottom=" + this.f45913 + '}';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13954 m33794(Insets insets) {
        return m33793(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Insets m33796() {
        return C4780.m13251(this.f45915, this.f45912, this.f45914, this.f45913);
    }
}
