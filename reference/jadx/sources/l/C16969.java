package l;

/* JADX INFO: renamed from: l.ܽ᩻ۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: M6O6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16969 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long f54301 = System.nanoTime();

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m39762() {
        C3894.m11326();
        if (System.nanoTime() - this.f54301 > 5000000000L) {
            throw C6385.m17523(EnumC8129.LIMIT, "Formatting time limit exceeded");
        }
    }
}
