package l;

/* JADX INFO: renamed from: l.᩸ܽۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 86TL */
/* JADX INFO: loaded from: classes4.dex */
public final class C21695 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f70375;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f70376;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C8872 f70377;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f70378;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C6899 f70379;

    public C21695() {
        this(new C6899(), new C8872(-1, -1), 0L, 0L, 16777216L);
    }

    public C21695(C6899 c6899, C8872 c8872, long j, long j2, long j3) {
        if (j2 < 0 || j < 0 || j > j2 || j3 < 0) {
            throw new IllegalArgumentException("Invalid history state");
        }
        C13638.requireNonNull(c6899);
        this.f70379 = c6899;
        C13638.requireNonNull(c8872);
        this.f70377 = c8872;
        this.f70376 = j;
        this.f70375 = j2;
        this.f70378 = j3;
    }
}
