package l;

import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ᩳۡ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: S24 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18976 extends AbstractC4741 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10025 f61521;

    @Override // l.AbstractC8512, l.InterfaceC8409
    public final int characteristics() {
        return 16465;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18976(C10025 c10025, int i, int i2) {
        super(i, i2);
        this.f61521 = c10025;
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ */
    public final Object mo1161(int i) {
        return this.f61521.f32152.f23237[i];
    }

    @Override // l.AbstractC8512
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC2546 mo1162(int i, int i2) {
        return new C18976(this.f61521, i, i2);
    }

    @Override // l.AbstractC8512, l.AbstractC12023, l.InterfaceC8409
    public final void forEachRemaining(Consumer consumer) {
        C7043 c7043 = this.f61521.f32152;
        Object[] objArr = c7043.f23237;
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
