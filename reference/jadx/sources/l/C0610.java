package l;

/* JADX INFO: renamed from: l.֡᩵ۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 1AOV */
/* JADX INFO: loaded from: classes2.dex */
public final class C0610 implements InterfaceC21499 {
    @Override // l.InterfaceC21499
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // l.InterfaceC21499
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // l.InterfaceC21499
    public final void onPageSelected(int i) {
        if (C16839.f53882 != i) {
            C16839.f53882 = i;
            C4716.m13050("tfcgi", 5000L, new RunnableC20367());
        }
    }
}
