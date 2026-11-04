package l;

/* JADX INFO: renamed from: l.ۤ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: E6TD */
/* JADX INFO: loaded from: classes3.dex */
public final class C10727 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C21697 f34064;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f34065;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final long f34066;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C21498 f34067;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21697 f34068;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C10046 f34069;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final long f34070;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public volatile long f34071 = -1;

    public C10727(int i, long j, long j2, C21498 c21498, C21697 c21697, C21697 c21698) {
        if (i >= 0) {
            long j3 = i;
            if (((long) c21697.m49259()) + j3 <= 2147483647L && j3 + ((long) c21698.m49259()) <= 2147483647L) {
                if (c21697.f69247 != c21698.f69247 || c21697.f69244 != c21698.f69244 || c21697.f69246 != c21698.f69246) {
                    throw new IllegalArgumentException("History fragments belong to different text stores");
                }
                this.f34065 = i;
                this.f34066 = j;
                this.f34070 = j2;
                C17359.requireNonNull(c21498);
                this.f34067 = c21498;
                this.f34068 = c21697;
                this.f34064 = c21698;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid history text range");
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m27316() {
        return this.f34068.m49259() == 0 && this.f34064.m49259() == 0;
    }
}
