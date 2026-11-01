package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: l.᩺ۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC22968 extends AbstractC14316 implements DoubleConsumer, InterfaceC7535 {
    public final DoublePredicate e;
    public double f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC14884.a(this, doubleConsumer);
    }

    @Override // l.AbstractC14316, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC14884.b(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC14884.g(this, consumer);
    }

    @Override // l.InterfaceC10110
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    public AbstractC22968(InterfaceC7535 interfaceC7535, DoublePredicate doublePredicate) {
        super(interfaceC7535);
        this.e = doublePredicate;
    }

    public AbstractC22968(InterfaceC7535 interfaceC7535, AbstractC22968 abstractC22968) {
        super(interfaceC7535, abstractC22968);
        this.e = abstractC22968.e;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.d = (this.d + 1) & 63;
        this.f = d;
    }

    @Override // l.InterfaceC10110
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((DoubleConsumer) obj);
    }
}
