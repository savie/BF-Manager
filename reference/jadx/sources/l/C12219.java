package l;

/* JADX INFO: renamed from: l.ۨ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 86TL */
/* JADX INFO: loaded from: classes3.dex */
public final class C12219 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f39258;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f39259;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C21498 f39260;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C3335 f39261;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f39262;

    public C12219() {
        this(new C3335(), new C21498(-1, -1), 0L, 0L, 16777216L);
    }

    public C12219(C3335 c3335, C21498 c21498, long j, long j2, long j3) {
        if (j2 < 0 || j < 0 || j > j2 || j3 < 0) {
            throw new IllegalArgumentException("Invalid history state");
        }
        C17359.requireNonNull(c3335);
        this.f39261 = c3335;
        C17359.requireNonNull(c21498);
        this.f39260 = c21498;
        this.f39258 = j;
        this.f39262 = j2;
        this.f39259 = j3;
    }
}
