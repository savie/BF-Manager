package l;

/* JADX INFO: renamed from: l.ۘۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6VB */
/* JADX INFO: loaded from: classes2.dex */
public final class C3768 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final InterfaceC0507 f13629;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1569 f13630;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final int f13631;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C1900 f13632;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f13633;

    public C3768(C1900 c1900, InterfaceC0507 interfaceC0507, int i, int i2, int i3) {
        C13638.requireNonNull(c1900);
        this.f13632 = c1900;
        C13638.requireNonNull(interfaceC0507);
        this.f13629 = interfaceC0507;
        this.f13633 = i;
        this.f13631 = i2;
        this.f13630 = new C1569(i2, i3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11011() {
        InterfaceC0507 interfaceC0507 = this.f13629;
        try {
            int iMo2395 = interfaceC0507.mo2395();
            int i = this.f13633;
            return iMo2395 == i && interfaceC0507.length() == this.f13631 && interfaceC0507.mo2395() == i;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
