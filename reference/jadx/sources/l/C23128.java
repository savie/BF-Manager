package l;

/* JADX INFO: renamed from: l.᩺ܿۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 06TH */
/* JADX INFO: loaded from: classes.dex */
public final class C23128 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile long f75112 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15346 f75113;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C16072 f75114;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final EnumC9226 f75115;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f75116;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final long f75117;

    public C23128(long j, long j2, EnumC9226 enumC9226, C15346 c15346) {
        if (j <= 0 || c15346.isEmpty() || (enumC9226 != EnumC9226.USER && enumC9226 != EnumC9226.BATCH)) {
            throw new IllegalArgumentException("Invalid undo record");
        }
        this.f75116 = j;
        this.f75117 = j2;
        this.f75115 = enumC9226;
        this.f75113 = c15346;
    }
}
