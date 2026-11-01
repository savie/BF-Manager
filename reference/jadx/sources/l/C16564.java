package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܽۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16564 extends AbstractC0148 implements InterfaceC7535, DoubleConsumer {
    public double f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC14884.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC14884.b(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC14884.g(this, consumer);
    }

    @Override // l.AbstractC19939
    public final InterfaceC20693 b(InterfaceC20693 interfaceC20693) {
        return new C16564((InterfaceC7535) interfaceC20693, this);
    }

    @Override // l.AbstractC0148
    public final void g(Object obj) {
        ((DoubleConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f = d;
    }

    @Override // l.AbstractC0148
    public final AbstractC1862 j(int i) {
        return new C9356(i);
    }
}
