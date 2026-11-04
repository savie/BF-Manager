package l;

/* JADX INFO: renamed from: l.ۤܶ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: YCK3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10968 extends AbstractC12592 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C22903 f34651;

    @Override // l.AbstractC23781, l.InterfaceC8409
    public final int characteristics() {
        return 16721;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10968(C22903 c22903, int i, int i2) {
        super(i, i2);
        this.f34651 = c22903;
    }

    @Override // l.AbstractC23781
    /* JADX INFO: renamed from: ۙ */
    public final char mo23935(int i) {
        return this.f34651.f74391.f6736[i];
    }

    @Override // l.AbstractC23781
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC16321 mo23936(int i, int i2) {
        return new C10968(this.f34651, i, i2);
    }

    @Override // l.AbstractC23781, l.AbstractC2809, l.InterfaceC9154
    /* JADX INFO: renamed from: ۙ */
    public final void forEachRemaining(InterfaceC12089 interfaceC12089) {
        C2020 c2020 = this.f34651.f74391;
        char[] cArr = c2020.f6736;
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
