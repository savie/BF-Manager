package l;

/* JADX INFO: renamed from: l.۫ۨ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AOV */
/* JADX INFO: loaded from: classes4.dex */
public final class C13096 implements InterfaceC4739 {
    @Override // l.InterfaceC4739
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // l.InterfaceC4739
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // l.InterfaceC4739
    public final void onPageSelected(int i) {
        if (C5639.f19496 != i) {
            C5639.f19496 = i;
            C5261.m15835("tfcgi", 5000L, new RunnableC15333());
        }
    }
}
