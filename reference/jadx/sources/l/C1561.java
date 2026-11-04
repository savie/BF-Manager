package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֫֡᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: K9S0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1561 extends AbstractC12220 {

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C11255 f5390;

    @Override // l.AbstractC23409, l.InterfaceC8409
    public final int characteristics() {
        return 17744;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1561(C11255 c11255) {
        super(c11255.f35538, c11255.f35535);
        this.f5390 = c11255;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1561(C11255 c11255, int i, int i2) {
        super(i, i2);
        this.f5390 = c11255;
    }

    @Override // l.AbstractC23409
    /* JADX INFO: renamed from: ۙ */
    public final int mo3336(int i) {
        return this.f5390.f35536[i];
    }

    @Override // l.AbstractC23409
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC15949 mo3337(int i, int i2) {
        return new C1561(this.f5390, i, i2);
    }

    @Override // l.AbstractC2262, l.InterfaceC9154
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int i = this.f75777;
        if (i >= this.f39263) {
            return false;
        }
        int[] iArr = this.f5390.f35536;
        this.f75777 = i + 1;
        intConsumer.accept(iArr[i]);
        return true;
    }

    @Override // l.AbstractC2262, l.InterfaceC9154
    public final void forEachRemaining(IntConsumer intConsumer) {
        int[] iArr = this.f5390.f35536;
        while (true) {
            int i = this.f75777;
            if (i >= this.f39263) {
                return;
            }
            this.f75777 = i + 1;
            intConsumer.accept(iArr[i]);
        }
    }
}
