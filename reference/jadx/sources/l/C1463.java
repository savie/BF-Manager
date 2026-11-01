package l;

/* JADX INFO: renamed from: l.֫֡ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: E6TD */
/* JADX INFO: loaded from: classes2.dex */
public final class C1463 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C8872 f5959;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public volatile long f5960 = -1;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14744 f5961;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C16072 f5962;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final long f5963;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final int f5964;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final long f5965;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C14744 f5966;

    public C1463(int i, long j, long j2, C8872 c8872, C14744 c14744, C14744 c14745) {
        if (i >= 0) {
            long j3 = i;
            if (((long) c14744.m35339()) + j3 <= 2147483647L && j3 + ((long) c14745.m35339()) <= 2147483647L) {
                if (c14744.f48220 != c14745.f48220 || c14744.f48221 != c14745.f48221 || c14744.f48223 != c14745.f48223) {
                    throw new IllegalArgumentException("History fragments belong to different text stores");
                }
                this.f5964 = i;
                this.f5963 = j;
                this.f5965 = j2;
                C13638.requireNonNull(c8872);
                this.f5959 = c8872;
                this.f5966 = c14744;
                this.f5961 = c14745;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid history text range");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m5088() {
        return this.f5966.m35339() == 0 && this.f5961.m35339() == 0;
    }
}
