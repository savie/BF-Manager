package l;

import java.util.NoSuchElementException;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩻᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final class C23985 implements InterfaceC22104, IntConsumer, InterfaceC6206 {
    public boolean a = false;
    public int b;
    public final /* synthetic */ InterfaceC18576 c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC3758
    public final /* bridge */ /* synthetic */ void forEachRemaining(Object obj) {
        forEachRemaining((IntConsumer) obj);
    }

    @Override // l.InterfaceC22104
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C5170.$default$forEachRemaining((InterfaceC22104) this, intConsumer);
    }

    @Override // l.InterfaceC22104, java.util.Iterator
    public final /* synthetic */ Integer next() {
        return C5170.$default$next((InterfaceC22104) this);
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return next();
    }

    @Override // l.InterfaceC22104, java.util.Iterator, l.InterfaceC6206
    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        C13638.requireNonNull(consumer);
        if (AbstractC15297.a) {
            AbstractC15297.a(C23985.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
        C13638.requireNonNull(consumer);
        forEachRemaining((IntConsumer) new C24034(consumer, 0));
    }

    public C23985(InterfaceC18576 interfaceC18576) {
        this.c = interfaceC18576;
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

    @Override // l.InterfaceC22104
    public final int nextInt() {
        if (!this.a && !hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = false;
        return this.b;
    }
}
