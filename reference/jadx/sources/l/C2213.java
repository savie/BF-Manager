package l;

/* JADX INFO: renamed from: l.ۖ֫ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes2.dex */
public final class C2213 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f7973;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f7974;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f7975;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int f7976;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C2516 f7977;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final int f7978;

    public C2213(C2516 c2516, long j, int i, int i2, int i3) {
        this.f7977 = c2516;
        this.f7973 = j;
        this.f7978 = i;
        this.f7976 = i2;
        long j2 = (((long) i2) - ((long) i)) + 1;
        int i4 = (int) j2;
        if (j2 != i4) {
            throw new ArithmeticException();
        }
        this.f7975 = i4;
        this.f7974 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m6829(C13026 c13026) {
        C13732 c13732 = c13026.f43452;
        C2516 c2516M33458 = c13732.m33458();
        C2516 c2516 = this.f7977;
        return c2516M33458 == c2516 && c2516.m7808() == this.f7973 && c13732.m33475() && c13732.m33443() == this.f7978 && c13732.m33465() == this.f7976;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static C2213 m6828(C13026 c13026) {
        C13732 c13732 = c13026.f43452;
        if (!c13732.m33475()) {
            return null;
        }
        C2516 c2516M33458 = c13732.m33458();
        int iM33443 = c13732.m33443();
        int iM33465 = c13732.m33465();
        int iM33464 = c13732.m33464();
        if (iM33443 < 0 || iM33465 < iM33443 || iM33465 >= c2516M33458.length() || iM33464 <= 0) {
            return null;
        }
        return new C2213(c2516M33458, c2516M33458.m7808(), iM33443, iM33465, iM33464);
    }
}
