package l;

/* JADX INFO: renamed from: l.ۜܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: R6U3 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6878 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final int f23169;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile long f23170 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int f23171;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C16072 f23172;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C6878 f23173;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Object f23174;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C6878 f23175;

    public C6878(Object obj) {
        C13638.requireNonNull(obj);
        this.f23174 = obj;
        this.f23175 = null;
        this.f23173 = null;
        this.f23169 = 1;
        this.f23171 = 1;
    }

    public C6878(C6878 c6878, C6878 c6879) {
        C13638.requireNonNull(c6878);
        this.f23173 = c6878;
        C13638.requireNonNull(c6879);
        this.f23175 = c6879;
        this.f23174 = null;
        this.f23171 = Math.max(c6878.f23171, c6879.f23171) + 1;
        long j = ((long) c6878.f23169) + ((long) c6879.f23169);
        int i = (int) j;
        if (j != i) {
            throw new ArithmeticException();
        }
        this.f23169 = i;
    }
}
