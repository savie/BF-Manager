package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.۬ܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13907 extends AbstractC4741 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C5157 f44117;

    @Override // l.AbstractC8512, l.InterfaceC8409
    public final int characteristics() {
        return 16464;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13907(C5157 c5157, int i, int i2) {
        super(i, i2);
        this.f44117 = c5157;
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1161(int i) {
        return this.f44117.f17998.f72229[i];
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2546 mo1162(int i, int i2) {
        return new C13907(this.f44117, i, i2);
    }

    @Override // l.AbstractC8512, l.AbstractC12023, l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C22311 c22311 = this.f44117.f17998;
        Object[] objArr = c22311.f72229;
        int i = c22311.f72228;
        while (true) {
            int i2 = this.f27823;
            if (i2 >= i) {
                return;
            }
            this.f27823 = i2 + 1;
            consumer.accept(objArr[i2]);
        }
    }
}
