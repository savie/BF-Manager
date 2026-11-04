package l;

/* JADX INFO: renamed from: l.ۖۧۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4EU */
/* JADX INFO: loaded from: classes2.dex */
public final class C2624 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static long f8420;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static C9335 f8421;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C9335 m8765() {
        synchronized (C2624.class) {
            C9335 c9335 = f8421;
            if (c9335 != null) {
                f8421 = c9335.f30344;
                c9335.f30344 = null;
                f8420 -= 8192;
                return c9335;
            }
            return new C9335();
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m8766(C9335 c9335) {
        if (c9335.f30344 != null || c9335.f30346 != null) {
            throw new IllegalArgumentException();
        }
        if (c9335.f30345) {
            return;
        }
        synchronized (C2624.class) {
            long j = f8420 + 8192;
            if (j > 65536) {
                return;
            }
            f8420 = j;
            c9335.f30344 = f8421;
            c9335.f30348 = 0;
            c9335.f30347 = 0;
            f8421 = c9335;
        }
    }
}
