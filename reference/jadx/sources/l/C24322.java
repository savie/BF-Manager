package l;

/* JADX INFO: renamed from: l.᩺۬ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 27JF */
/* JADX INFO: loaded from: classes.dex */
public final class C24322 implements InterfaceC4739 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC11641 f78735;

    @Override // l.InterfaceC4739
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // l.InterfaceC4739
    public final void onPageSelected(int i) {
    }

    public C24322(AbstractC11641 abstractC11641) {
        this.f78735 = abstractC11641;
    }

    @Override // l.InterfaceC4739
    public final void onPageScrolled(int i, float f, int i2) {
        this.f78735.m29248(f, i);
    }
}
