package l;

/* JADX INFO: renamed from: l.᩵ۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C20370 extends C16640 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0407 f65326;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C13830 f65327;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C0407 f65328;

    public C20370(C0407 c0407, C13830 c13830, C0407 c0408) {
        super(c0407);
        this.f65328 = c0407;
        this.f65327 = c13830;
        int unused = c13830.f43898;
        this.f65326 = c0408;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C20370 m46783(C0407 c0407, C16640 c16640) {
        C13830 c13830M33757 = C13830.m33757(c0407);
        if (c13830M33757 == null) {
            return null;
        }
        if (c13830M33757.f43898 != 0 || c13830M33757.f43899) {
            return new C20370(c0407, c13830M33757, c16640);
        }
        return null;
    }
}
