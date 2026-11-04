package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܳ᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15668 extends AbstractC0555 implements InterfaceC3012 {
    public final /* synthetic */ C20890 g;

    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2946.b(this, consumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2946.g(this, consumer);
    }

    @Override // l.AbstractC0555
    public final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // l.AbstractC0555
    public final InterfaceC9154 b(Object obj, int i, int i2) {
        double[] dArr = (double[]) obj;
        int i3 = i2 + i;
        C13629.a(((double[]) C17359.requireNonNull(dArr)).length, i, i3);
        return new C13058(dArr, i, i3, 1040);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15668(C20890 c20890, int i, int i2, int i3, int i4) {
        super(c20890, i, i2, i3, i4);
        this.g = c20890;
    }

    @Override // l.AbstractC0555
    public final InterfaceC9154 c(int i, int i2, int i3, int i4) {
        return new C15668(this.g, i, i2, i3, i4);
    }
}
