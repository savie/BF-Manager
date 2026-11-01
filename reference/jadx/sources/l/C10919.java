package l;

/* JADX INFO: renamed from: l.ۧۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10919 extends AbstractC1102 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C23619 f37160;

    @Override // l.AbstractC2513, l.InterfaceC20693
    public final int characteristics() {
        return 16720;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10919(C23619 c23619, int i, int i2) {
        super(i, i2);
        this.f37160 = c23619;
    }

    @Override // l.AbstractC2513
    /* JADX INFO: renamed from: ۙ */
    public final char mo7699(int i) {
        return this.f37160.f76526.f47385[i];
    }

    @Override // l.AbstractC2513
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11687 mo7700(int i, int i2) {
        return new C10919(this.f37160, i, i2);
    }

    @Override // l.AbstractC2513, l.AbstractC10213, l.InterfaceC10110
    /* JADX INFO: renamed from: ۙ */
    public final void forEachRemaining(InterfaceC1164 interfaceC1164) {
        C14447 c14447 = this.f37160.f76526;
        char[] cArr = c14447.f47385;
        int i = c14447.f47387;
        while (true) {
            int i2 = this.f9970;
            if (i2 >= i) {
                return;
            }
            this.f9970 = i2 + 1;
            interfaceC1164.mo4297(cArr[i2]);
        }
    }
}
