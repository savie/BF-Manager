package l;

/* JADX INFO: renamed from: l.ۗۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes3.dex */
public final class C3216 extends C16640 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2885 f10480;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C13830 f10481;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int f10482;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22782 f10483;

    public C3216(C22782 c22782, C6615 c6615, C13830 c13830) {
        super(c22782);
        this.f10483 = c22782;
        this.f10480 = c6615.f71066;
        this.f10481 = c13830;
        this.f10482 = c22782.f73902;
        int unused = c13830.f43898;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C3216 m10554(C0407 c0407) {
        C22782 c22782;
        int i;
        if (!(c0407 instanceof C22782) || (i = (c22782 = (C22782) c0407).f73902) <= 0 || i != c22782.f73899) {
            return null;
        }
        C0407 c0408 = c22782.f73901;
        if (!(c0408 instanceof C6615)) {
            return null;
        }
        C6615 c6615 = (C6615) c0408;
        C13830 c13830M33754 = C13830.m33754(c22782.f1952, c6615.f71066, i);
        if (c13830M33754 == null) {
            return null;
        }
        return new C3216(c22782, c6615, c13830M33754);
    }
}
