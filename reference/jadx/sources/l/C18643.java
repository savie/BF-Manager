package l;

/* JADX INFO: renamed from: l.ܿ᩹ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 470W */
/* JADX INFO: loaded from: classes4.dex */
public final class C18643 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final C20661 f60613;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C3727 f60614;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C21627 f60615;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C14913 f60616;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C22528 f60617;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C10438 f60618;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final long f60619;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final long f60620;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f60621;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final Object f60622;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f60623;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20925 f60624;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f60625;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final int f60626;

    public C18643(C10438 c10438, long j, C20661 c20661, Object obj, long j2, int i, int i2, int i3, C14913 c14913, C3727 c3727, C20925 c20925, C22528 c22528, C21627 c21627) {
        this.f60618 = c10438;
        this.f60619 = j;
        this.f60613 = c20661;
        this.f60622 = obj;
        this.f60620 = j2;
        this.f60621 = i;
        this.f60626 = i2;
        this.f60623 = i3;
        this.f60616 = c14913;
        this.f60614 = c3727;
        this.f60624 = c20925;
        this.f60617 = c22528;
        this.f60615 = c21627;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m43397(C18643 c18643, C10438 c10438) {
        synchronized (c18643) {
            if (c18643.f60618 != c10438) {
                throw new IllegalArgumentException("Syntax window request belongs to another session");
            }
            if (c18643.f60625) {
                throw new IllegalStateException("Syntax window request was already constructed");
            }
            c18643.f60625 = true;
        }
    }
}
