package l;

import android.graphics.Insets;

/* JADX INFO: renamed from: l.۫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: R1B7 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13275 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C13275 f42404 = new C13275(0, 0, 0, 0);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f42405;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f42406;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f42407;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f42408;

    public C13275(int i, int i2, int i3, int i4) {
        this.f42407 = i;
        this.f42408 = i2;
        this.f42406 = i3;
        this.f42405 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13275 m32819(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f42404;
        }
        return new C13275(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13275 m32821(C13275 c13275, C13275 c13276) {
        return m32819(Math.max(c13275.f42407, c13276.f42407), Math.max(c13275.f42408, c13276.f42408), Math.max(c13275.f42406, c13276.f42406), Math.max(c13275.f42405, c13276.f42405));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13275.class != obj.getClass()) {
            return false;
        }
        C13275 c13275 = (C13275) obj;
        return this.f42405 == c13275.f42405 && this.f42407 == c13275.f42407 && this.f42406 == c13275.f42406 && this.f42408 == c13275.f42408;
    }

    public final int hashCode() {
        return (((((this.f42407 * 31) + this.f42408) * 31) + this.f42406) * 31) + this.f42405;
    }

    public final String toString() {
        return "Insets{left=" + this.f42407 + ", top=" + this.f42408 + ", right=" + this.f42406 + ", bottom=" + this.f42405 + '}';
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C13275 m32820(Insets insets) {
        return m32819(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Insets m32822() {
        return C15512.m37181(this.f42407, this.f42408, this.f42406, this.f42405);
    }
}
