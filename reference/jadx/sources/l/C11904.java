package l;

/* JADX INFO: renamed from: l.ۧ᩸ܳ, reason: contains not printable characters */
/* JADX INFO: compiled from: X4M8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11904 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C19143 f38339;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int f38340;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f38341;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f38342;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f38343;

    public C11904(C19143 c19143, int i, int i2, boolean z, long j) {
        this.f38339 = c19143;
        this.f38342 = c19143.m44373();
        this.f38341 = i;
        if (z) {
            long j2 = ((long) i2) + 1;
            int i3 = (int) j2;
            if (j2 != i3) {
                throw new ArithmeticException();
            }
            i = i3;
        }
        this.f38340 = i;
        this.f38343 = j;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m29785(C12628 c12628) {
        return c12628.f40509.m17198(this.f38339, this.f38342, this.f38343);
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C11904 m29784(C12628 c12628) {
        C19143 c19143M17213 = c12628.f40509.m17213();
        C5917 c5917 = c12628.f40509;
        int iM17202 = c5917.m17202();
        int iM17208 = c5917.m17208();
        boolean zM17206 = c5917.m17206();
        long jM17187 = c5917.m17187();
        if (iM17202 < 0 || iM17208 < iM17202) {
            return null;
        }
        if (zM17206 && iM17208 >= c19143M17213.length()) {
            return null;
        }
        if (zM17206 || (iM17202 == iM17208 && iM17202 <= c19143M17213.length())) {
            return new C11904(c19143M17213, iM17202, iM17208, zM17206, jM17187);
        }
        return null;
    }
}
