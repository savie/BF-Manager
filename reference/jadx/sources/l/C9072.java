package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۡᩴᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9072 extends AbstractC1205 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10483 f30935;

    @Override // l.AbstractC2616, l.InterfaceC20693
    public final int characteristics() {
        return 16720;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9072(C10483 c10483, int i, int i2) {
        super(i, i2);
        this.f30935 = c10483;
    }

    @Override // l.AbstractC2616
    /* JADX INFO: renamed from: ۙ */
    public final int mo1568(int i) {
        return this.f30935.f35924.f25319[i];
    }

    @Override // l.AbstractC2616
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC11790 mo1569(int i, int i2) {
        return new C9072(this.f30935, i, i2);
    }

    @Override // l.AbstractC1622, l.InterfaceC10110
    public final void forEachRemaining(IntConsumer intConsumer) {
        C7660 c7660 = this.f30935.f35924;
        int[] iArr = c7660.f25319;
        int i = c7660.f25321;
        while (true) {
            int i2 = this.f10225;
            if (i2 >= i) {
                return;
            }
            this.f10225 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
