package l;

/* JADX INFO: renamed from: l.ܽۢᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16563 extends AbstractC1102 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12330 f53194;

    @Override // l.AbstractC2513, l.InterfaceC20693
    public final int characteristics() {
        return 16721;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16563(C12330 c12330, int i, int i2) {
        super(i, i2);
        this.f53194 = c12330;
    }

    @Override // l.AbstractC2513
    /* JADX INFO: renamed from: ۙ */
    public final char mo7699(int i) {
        return this.f53194.f41219.f47389[i];
    }

    @Override // l.AbstractC2513
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11687 mo7700(int i, int i2) {
        return new C16563(this.f53194, i, i2);
    }

    @Override // l.AbstractC2513, l.AbstractC10213, l.InterfaceC10110
    /* JADX INFO: renamed from: ۙ */
    public final void forEachRemaining(InterfaceC1164 interfaceC1164) {
        C14447 c14447 = this.f53194.f41219;
        char[] cArr = c14447.f47389;
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
