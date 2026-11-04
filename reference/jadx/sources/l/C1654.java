package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֫ۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1654 implements InterfaceC20343, IntConsumer, InterfaceC19597 {
    public boolean a = false;
    public int b;
    public final /* synthetic */ InterfaceC7664 c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C4109.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC24073
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // l.InterfaceC20343
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C3189.$default$forEachRemaining((InterfaceC20343) this, intConsumer);
    }

    @Override // l.InterfaceC20343, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return C3189.$default$next((InterfaceC20343) this);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return next();
    }

    @Override // l.InterfaceC20343, java.util.Iterator, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        C17359.requireNonNull(consumer);
        if (AbstractC21658.a) {
            AbstractC21658.a(C1654.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        C17359.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new C13453(consumer, 0));
    }

    public C1654(InterfaceC7664 interfaceC7664) {
        this.c = interfaceC7664;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.a = true;
        this.b = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((IntConsumer) this);
        }
        return this.a;
    }

    @Override // l.InterfaceC20343
    public final int nextInt() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
