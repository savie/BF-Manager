package l;

/* JADX INFO: renamed from: l.᩹ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 964V */
/* JADX INFO: loaded from: classes.dex */
public final class C23383 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f75691;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f75692;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int f75693;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f75694;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19143 f75695;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f75696;

    public C23383(C19143 c19143, long j, int i, int i2, int i3) {
        this.f75695 = c19143;
        this.f75696 = j;
        this.f75693 = i;
        this.f75692 = i2;
        long j2 = (((long) i2) - ((long) i)) + 1;
        int i4 = (int) j2;
        if (j2 != i4) {
            throw new ArithmeticException();
        }
        this.f75694 = i4;
        this.f75691 = i3;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m52547(C12628 c12628) {
        C5917 c5917 = c12628.f40509;
        C19143 c19143M17213 = c5917.m17213();
        C19143 c19143 = this.f75695;
        return c19143M17213 == c19143 && c19143.m44373() == this.f75696 && c5917.m17206() && c5917.m17202() == this.f75693 && c5917.m17208() == this.f75692;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C23383 m52546(C12628 c12628) {
        C5917 c5917 = c12628.f40509;
        if (!c5917.m17206()) {
            return null;
        }
        C19143 c19143M17213 = c5917.m17213();
        int iM17202 = c5917.m17202();
        int iM17208 = c5917.m17208();
        int iM17204 = c5917.m17204();
        if (iM17202 < 0 || iM17208 < iM17202 || iM17208 >= c19143M17213.length() || iM17204 <= 0) {
            return null;
        }
        return new C23383(c19143M17213, c19143M17213.m44373(), iM17202, iM17208, iM17204);
    }
}
