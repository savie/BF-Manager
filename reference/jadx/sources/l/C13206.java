package l;

/* JADX INFO: renamed from: l.۫ܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13206 extends AbstractC12592 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5749 f42170;

    @Override // l.AbstractC23781, l.InterfaceC8409
    public final int characteristics() {
        return 16720;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13206(C5749 c5749, int i, int i2) {
        super(i, i2);
        this.f42170 = c5749;
    }

    @Override // l.AbstractC23781
    /* JADX INFO: renamed from: ۙ */
    public final char mo23935(int i) {
        return this.f42170.f19793.f6732[i];
    }

    @Override // l.AbstractC23781
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16321 mo23936(int i, int i2) {
        return new C13206(this.f42170, i, i2);
    }

    @Override // l.AbstractC23781, l.AbstractC2809, l.InterfaceC9154
    /* JADX INFO: renamed from: ۙ */
    public final void forEachRemaining(InterfaceC12089 interfaceC12089) {
        C2020 c2020 = this.f42170.f19793;
        char[] cArr = c2020.f6732;
        int i = c2020.f6731;
        while (true) {
            int i2 = this.f77037;
            if (i2 >= i) {
                return;
            }
            this.f77037 = i2 + 1;
            interfaceC12089.mo10258(cArr[i2]);
        }
    }
}
