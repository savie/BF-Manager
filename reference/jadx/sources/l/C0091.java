package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.֡֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0091 extends AbstractC4741 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C7549 f1000;

    @Override // l.AbstractC8512, l.InterfaceC8409
    public final int characteristics() {
        return 16465;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0091(C7549 c7549, int i, int i2) {
        super(i, i2);
        this.f1000 = c7549;
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Object mo1161(int i) {
        return this.f1000.f24901.f7515[i];
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2546 mo1162(int i, int i2) {
        return new C0091(this.f1000, i, i2);
    }

    @Override // l.AbstractC8512, l.AbstractC12023, l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C2329 c2329 = this.f1000.f24901;
        Object[] objArr = c2329.f7515;
        int i = c2329.f7510;
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
