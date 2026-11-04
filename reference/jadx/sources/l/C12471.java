package l;

/* JADX INFO: renamed from: l.ۨܺۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: F1FR */
/* JADX INFO: loaded from: classes4.dex */
public final class C12471 implements InterfaceC4739 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C24406 f40058;

    @Override // l.InterfaceC4739
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // l.InterfaceC4739
    public final void onPageScrolled(int i, float f, int i2) {
    }

    public C12471(C24406 c24406) {
        this.f40058 = c24406;
    }

    @Override // l.InterfaceC4739
    public final void onPageSelected(int i) {
        if (i == 3) {
            this.f40058.f79204.m51332();
        }
    }
}
