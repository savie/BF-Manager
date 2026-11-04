package l;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: l.֨۬᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 872H */
/* JADX INFO: loaded from: classes2.dex */
public final class C1207 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final int f4376;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f4377;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f4378;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f4379;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final WeakReference f4380;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f4381;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f4382;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final int f4383;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f4384;

    public C1207(int i, int i2, int i3, int i4, int i5, int i6, int i7, InterfaceC19106 interfaceC19106, int i8) {
        this.f4381 = i;
        this.f4382 = i2;
        this.f4384 = i3;
        this.f4378 = i4;
        this.f4383 = i5;
        this.f4377 = i6;
        this.f4379 = i7;
        this.f4380 = new WeakReference(interfaceC19106);
        this.f4376 = i8;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m4422(int i, int i2, int i3, int i4, int i5, InterfaceC19106 interfaceC19106, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12 = this.f4381;
        if (i12 <= 0 || interfaceC19106 != this.f4380.get() || i6 != this.f4376 || i5 != this.f4379 || i3 != (i7 = this.f4383) || i4 != (i8 = this.f4377) || (i9 = this.f4382) < 0 || i9 > (i10 = this.f4378) || (i11 = this.f4384) < 0 || i11 > i10) {
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
                long jM4421 = m4421(i3, i4, j2, j4);
                long jM4422 = m4421(i3, i4, j3, j5);
                if (jM4422 < 10 && jM4422 < jM4421) {
                    return i12;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m4421(int i, int i2, long j, long j2) {
        long j3 = i;
        long j4 = i2;
        return Math.min(Math.min(Math.abs(j - j3), Math.abs(j - j4)), Math.min(Math.abs(j2 - j3), Math.abs(j2 - j4)));
    }
}
