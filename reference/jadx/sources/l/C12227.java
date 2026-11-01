package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۫ۛᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12227 implements InterfaceC4983, DoubleConsumer, InterfaceC6206 {
    public boolean a = false;
    public double b;
    public final /* synthetic */ InterfaceC7535 c;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC14884.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC3758
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        C13638.requireNonNull(doubleConsumer);
        while (hasNext()) {
            doubleConsumer.accept(nextDouble());
        }
    }

    @Override // java.util.Iterator
    public final Double next() {
        if (AbstractC15297.a) {
            AbstractC15297.a(C12227.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }
        return Double.valueOf(nextDouble());
    }

    @Override // l.InterfaceC4983, java.util.Iterator
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            forEachRemaining((DoubleConsumer) consumer);
            return;
        }
        C13638.requireNonNull(consumer);
        if (AbstractC15297.a) {
            AbstractC15297.a(C12227.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
            throw null;
        }
        C13638.requireNonNull(consumer);
        forEachRemaining((DoubleConsumer) new C14344(consumer, 0));
    }

    public C12227(InterfaceC7535 interfaceC7535) {
        this.c = interfaceC7535;
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

    @Override // l.InterfaceC4983
    public final double nextDouble() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
