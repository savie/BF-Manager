package l;

/* JADX INFO: renamed from: l.ۡۨۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 81J9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9356 implements InterfaceC4739 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C13831 f30419;

    @Override // l.InterfaceC4739
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // l.InterfaceC4739
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C9356(C13831 c13831) {
        this.f30419 = c13831;
    }

    @Override // l.InterfaceC4739
    public final void onPageSelected(int i) {
        C13831 c13831 = this.f30419;
        if (i == 3) {
            c13831.f43903.m51325();
        }
        c13831.m33766();
    }
}
