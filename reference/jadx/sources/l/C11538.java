package l;

/* JADX INFO: renamed from: l.ۨۜ۬, reason: contains not printable characters */
/* JADX INFO: compiled from: F70I */
/* JADX INFO: loaded from: classes3.dex */
public final class C11538 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C13655 f38772;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC2364 f38773;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static final C11538 f38771 = new C11538(EnumC2364.NOT_FOUND, null);

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final C11538 f38770 = new C11538(EnumC2364.UNAVAILABLE, null);

    public C11538(EnumC2364 enumC2364, C13655 c13655) {
        this.f38773 = enumC2364;
        this.f38772 = c13655;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C11538 m28712(C13655 c13655) {
        return new C11538(EnumC2364.FOUND, c13655);
    }
}
