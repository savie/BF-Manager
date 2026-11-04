package l;

/* JADX INFO: renamed from: l.ۡܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N70B */
/* JADX INFO: loaded from: classes3.dex */
public final class C9472 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C2761 f30690;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public boolean f30691;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C20661 f30692;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13947 f30693;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C22528 f30694;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long f30695;

    public C9472(C13947 c13947, long j, C20661 c20661, C2761 c2761, C22528 c22528) {
        this.f30693 = c13947;
        this.f30695 = j;
        this.f30692 = c20661;
        this.f30690 = c2761;
        this.f30694 = c22528;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m24851(C9472 c9472, C13947 c13947, boolean z) {
        synchronized (c9472) {
            if (c9472.f30693 != c13947) {
                throw new IllegalArgumentException("Syntax request belongs to another session");
            }
            if (z != (c9472.f30690 != null)) {
                throw new IllegalArgumentException("Syntax request type does not match construction");
            }
            if (c9472.f30691) {
                throw new IllegalStateException("Syntax request was already constructed");
            }
            c9472.f30691 = true;
        }
    }
}
