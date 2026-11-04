package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۤ֫ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10536 implements InterfaceC16787, DoubleConsumer, InterfaceC19597 {
    public boolean a = false;
    public double b;
    public final /* synthetic */ InterfaceC3012 c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC2946.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC24073
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        C17359.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (AbstractC21658.a) {
            AbstractC21658.a(C10536.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // l.InterfaceC16787, java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        C17359.requireNonNull(consumer);
        if (AbstractC21658.a) {
            AbstractC21658.a(C10536.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        C17359.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new C5317(consumer, 0));
    }

    public C10536(InterfaceC3012 interfaceC3012) {
        this.c = interfaceC3012;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a = true;
        this.b = d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((DoubleConsumer) this);
        }
        return this.a;
    }

    @Override // l.InterfaceC16787
    public final double nextDouble() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
