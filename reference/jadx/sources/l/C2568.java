package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۖۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2568 extends AbstractC4741 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8534 f8251;

    @Override // l.AbstractC8512, l.InterfaceC8409
    public final int characteristics() {
        return 16464;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2568(C8534 c8534, int i, int i2) {
        super(i, i2);
        this.f8251 = c8534;
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1161(int i) {
        return this.f8251.f27883.f23233[i];
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2546 mo1162(int i, int i2) {
        return new C2568(this.f8251, i, i2);
    }

    @Override // l.AbstractC8512, l.AbstractC12023, l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C7043 c7043 = this.f8251.f27883;
        Object[] objArr = c7043.f23233;
        int i = c7043.f23232;
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
