package l;

/* JADX INFO: renamed from: l.ۨۚۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11491 implements InterfaceC21499 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C0906 f38661;

    @Override // l.InterfaceC21499
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // l.InterfaceC21499
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C11491(C0906 c0906) {
        this.f38661 = c0906;
    }

    @Override // l.InterfaceC21499
    public final void onPageSelected(int i) {
        C0906 c0906 = this.f38661;
        if (i == 3) {
            c0906.f3634.m42643();
        }
        c0906.m3612();
    }
}
