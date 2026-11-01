package l;

/* JADX INFO: renamed from: l.۟۬ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: A4TV */
/* JADX INFO: loaded from: classes3.dex */
public final class C7483 implements InterfaceC3685 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C6222 f24927;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C15682 f24928;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C14690 f24929;

    public C7483(C14690 c14690, C15682 c15682) {
        this.f24929 = c14690;
        this.f24927 = c14690.matcher("");
        this.f24928 = c15682;
    }

    @Override // l.InterfaceC3685
    /* JADX INFO: renamed from: ۙ */
    public final C15682 mo10853(int i, int i2, CharSequence charSequence) {
        C6222 c6222 = this.f24927;
        try {
            c6222.m17276reset(charSequence);
            c6222.m17275region(i, i2);
            if (c6222.matches()) {
                return this.f24928;
            }
            return null;
        } finally {
            c6222.m17276reset((CharSequence) "");
        }
    }
}
