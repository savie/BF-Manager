package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨֨᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: W1E0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0837 extends AbstractC12220 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9040 f3145;

    @Override // l.AbstractC23409, l.InterfaceC8409
    public final int characteristics() {
        return 16720;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0837(C9040 c9040, int i, int i2) {
        super(i, i2);
        this.f3145 = c9040;
    }

    @Override // l.AbstractC23409
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int mo3336(int i) {
        return this.f3145.f29416.f7511[i];
    }

    @Override // l.AbstractC23409
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC15949 mo3337(int i, int i2) {
        return new C0837(this.f3145, i, i2);
    }

    @Override // l.AbstractC2262, l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        C2329 c2329 = this.f3145.f29416;
        int[] iArr = c2329.f7511;
        int i = c2329.f7510;
        while (true) {
            int i2 = this.f75777;
            if (i2 >= i) {
                return;
            }
            this.f75777 = i2 + 1;
            intConsumer.accept(iArr[i2]);
        }
    }
}
