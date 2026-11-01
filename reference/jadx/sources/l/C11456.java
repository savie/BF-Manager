package l;

/* JADX INFO: renamed from: l.ۨۘܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: 88UO */
/* JADX INFO: loaded from: classes3.dex */
public final class C11456 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final long f38558;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public long f38559;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f38560;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public long f38561;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public long f38562;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final long f38563;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f38564;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public long f38565;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m28593(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || j2 + 1 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return C17983.m41829(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
    }

    public C11456(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f38558 = j;
        this.f38563 = j2;
        this.f38561 = j3;
        this.f38562 = j4;
        this.f38559 = j5;
        this.f38564 = j6;
        this.f38560 = j7;
        this.f38565 = m28593(j2, j3, j4, j5, j6, j7);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static long m28598(C11456 c11456) {
        return c11456.f38559;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long m28594(C11456 c11456) {
        return c11456.f38564;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static long m28596(C11456 c11456) {
        return c11456.f38563;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static long m28592(C11456 c11456) {
        return c11456.f38558;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static void m28599(C11456 c11456, long j, long j2) {
        c11456.f38561 = j;
        c11456.f38559 = j2;
        c11456.f38565 = m28593(c11456.f38563, j, c11456.f38562, j2, c11456.f38564, c11456.f38560);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m28595(C11456 c11456, long j, long j2) {
        c11456.f38562 = j;
        c11456.f38564 = j2;
        c11456.f38565 = m28593(c11456.f38563, c11456.f38561, j, c11456.f38559, j2, c11456.f38560);
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static long m28597(C11456 c11456) {
        return c11456.f38565;
    }
}
