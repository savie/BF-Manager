package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.ܰۢۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 872H */
/* JADX INFO: loaded from: classes3.dex */
public final class C13729 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final WeakReference f45252;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f45253;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final int f45254;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f45255;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f45256;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f45257;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f45258;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f45259;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f45260;

    public C13729(int i, int i2, int i3, int i4, int i5, int i6, int i7, InterfaceC2916 interfaceC2916, int i8) {
        this.f45260 = i;
        this.f45256 = i2;
        this.f45253 = i3;
        this.f45258 = i4;
        this.f45259 = i5;
        this.f45255 = i6;
        this.f45257 = i7;
        this.f45252 = new WeakReference(interfaceC2916);
        this.f45254 = i8;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m33429(int i, int i2, int i3, int i4, int i5, InterfaceC2916 interfaceC2916, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = this.f45260;
        if (i12 <= 0 || interfaceC2916 != this.f45252.get() || i6 != this.f45254 || i5 != this.f45257 || i3 != (i7 = this.f45259) || i4 != (i8 = this.f45255) || (i9 = this.f45256) < 0 || i9 > (i10 = this.f45258) || (i11 = this.f45253) < 0 || i11 > i10) {
            return 0;
        }
        long j = i12;
        if (((long) i9) + j == i7 && ((long) i11) + j == i8) {
            if (i < 0 || i > i10 || i2 < 0 || i2 > i10) {
                return 0;
            }
            long j2 = i;
            long j3 = j2 + j;
            long j4 = i2;
            long j5 = j + j4;
            long j6 = i5;
            if (j3 <= j6 && j5 <= j6) {
                long jM33428 = m33428(i3, i4, j2, j4);
                long jM33429 = m33428(i3, i4, j3, j5);
                if (jM33429 < 10 && jM33429 < jM33428) {
                    return i12;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m33428(int i, int i2, long j, long j2) {
        long j3 = i;
        long j4 = i2;
        return Math.min(Math.min(Math.abs(j - j3), Math.abs(j - j4)), Math.min(Math.abs(j2 - j3), Math.abs(j2 - j4)));
    }
}
