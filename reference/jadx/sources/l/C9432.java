package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۡܰ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: VZ3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9432 extends AbstractC12220 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C2721 f30602;

    @Override // l.AbstractC23409, l.InterfaceC8409
    public final int characteristics() {
        return 16721;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9432(C2721 c2721, int i, int i2) {
        super(i, i2);
        this.f30602 = c2721;
    }

    @Override // l.AbstractC23409
    /* JADX INFO: renamed from: ۙ */
    public final int mo3336(int i) {
        return this.f30602.f9080.f72233[i];
    }

    @Override // l.AbstractC23409
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15949 mo3337(int i, int i2) {
        return new C9432(this.f30602, i, i2);
    }

    @Override // l.AbstractC2262, l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        C22311 c22311 = this.f30602.f9080;
        int[] iArr = c22311.f72233;
        int i = c22311.f72228;
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
