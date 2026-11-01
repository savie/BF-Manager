package l;

/* JADX INFO: renamed from: l.ۨۚܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BCD */
/* JADX INFO: loaded from: classes4.dex */
public final class C11499 extends AbstractC13616 implements InterfaceC14239 {

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C1909 f38673;

    public C11499(C6143 c6143, int i, C0498 c0498, C9300 c9300) {
        super(c6143, i, c0498, c9300);
        String string = mo30818().getString();
        C3320 c3320M17128 = c6143.m17128();
        boolean z = (i & 8) != 0;
        boolean zM2377 = c0498.m2377();
        C1909 c1909M6216 = C1909.m6216(string);
        if (!z) {
            c1909M6216 = c1909M6216.m6220(zM2377 ? c3320M17128.m9833(Integer.MAX_VALUE) : c3320M17128);
        }
        this.f38673 = c1909M6216;
    }

    @Override // l.InterfaceC14239
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C1909 mo28689() {
        return this.f38673;
    }
}
