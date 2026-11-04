package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩻ۘۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C24775 implements InterfaceC6173, LongConsumer, InterfaceC19597 {
    public boolean a = false;
    public long b;
    public final /* synthetic */ InterfaceC9900 c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C18279.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC24073
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((LongConsumer) obj);
    }

    @Override // l.InterfaceC6173
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C12138.$default$forEachRemaining((InterfaceC6173) this, longConsumer);
    }

    @Override // l.InterfaceC6173, java.util.Iterator
    public final /* synthetic */ Long next() {
        return C12138.$default$next((InterfaceC6173) this);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return next();
    }

    @Override // l.InterfaceC6173, l.InterfaceC19597
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        C17359.requireNonNull(consumer);
        if (AbstractC21658.a) {
            AbstractC21658.a(C24775.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        C17359.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new C3758(consumer, 0));
    }

    public C24775(InterfaceC9900 interfaceC9900) {
        this.c = interfaceC9900;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.a = true;
        this.b = j;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.a) {
            this.c.tryAdvance((LongConsumer) this);
        }
        return this.a;
    }

    @Override // l.InterfaceC6173
    public final long nextLong() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
