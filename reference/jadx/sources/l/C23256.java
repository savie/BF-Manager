package l;

/* JADX INFO: renamed from: l.᩺᩸ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: N70B */
/* JADX INFO: loaded from: classes.dex */
public final class C23256 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final long f75440;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C15495 f75441;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C19022 f75442;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public boolean f75443;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21033 f75444;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C1900 f75445;

    public C23256(C19022 c19022, long j, C1900 c1900, C15495 c15495, C21033 c21033) {
        this.f75442 = c19022;
        this.f75440 = j;
        this.f75445 = c1900;
        this.f75441 = c15495;
        this.f75444 = c21033;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m51325(C23256 c23256, C19022 c19022, boolean z) {
        synchronized (c23256) {
            if (c23256.f75442 != c19022) {
                throw new IllegalArgumentException("Syntax request belongs to another session");
            }
            if (z != (c23256.f75441 != null)) {
                throw new IllegalArgumentException("Syntax request type does not match construction");
            }
            if (c23256.f75443) {
                throw new IllegalStateException("Syntax request was already constructed");
            }
            c23256.f75443 = true;
        }
    }
}
