package l;

/* JADX INFO: renamed from: l.᩸ۛܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: 2BCD */
/* JADX INFO: loaded from: classes.dex */
public final class C22614 extends AbstractC10679 implements InterfaceC8616 {

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C6994 f73075;

    public C22614(C1028 c1028, int i, C0282 c0282, C13836 c13836) {
        super(c1028, i, c0282, c13836);
        String string = mo8781().getString();
        C5085 c5085M3933 = c1028.m3933();
        boolean z = (i & 8) != 0;
        boolean zM1844 = c0282.m1844();
        C6994 c6994M19304 = C6994.m19304(string);
        if (!z) {
            c6994M19304 = c6994M19304.m19307(zM1844 ? c5085M3933.m15368(Integer.MAX_VALUE) : c5085M3933);
        }
        this.f73075 = c6994M19304;
    }

    @Override // l.InterfaceC8616
    /* JADX INFO: renamed from: ۙ */
    public final C6994 mo23245() {
        return this.f73075;
    }
}
