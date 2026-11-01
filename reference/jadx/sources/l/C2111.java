package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.֫᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2111 implements InterfaceC12932, LongConsumer, InterfaceC6206 {
    public boolean a = false;
    public long b;
    public final /* synthetic */ InterfaceC19282 c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC3758
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((LongConsumer) obj);
    }

    @Override // l.InterfaceC12932
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C0936.$default$forEachRemaining((InterfaceC12932) this, longConsumer);
    }

    @Override // l.InterfaceC12932, java.util.Iterator
    public final /* synthetic */ Long next() {
        return C0936.$default$next((InterfaceC12932) this);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return next();
    }

    @Override // l.InterfaceC12932, java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            forEachRemaining((LongConsumer) consumer);
            return;
        }
        C13638.requireNonNull(consumer);
        if (AbstractC15297.a) {
            AbstractC15297.a(C2111.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
            throw null;
        }
        C13638.requireNonNull(consumer);
        forEachRemaining((LongConsumer) new C5418(consumer, 0));
    }

    public C2111(InterfaceC19282 interfaceC19282) {
        this.c = interfaceC19282;
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

    @Override // l.InterfaceC12932
    public final long nextLong() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
