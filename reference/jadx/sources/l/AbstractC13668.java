package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۬ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: I1PG */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13668 implements InterfaceC6036, InterfaceC19597 {
    @Override // l.InterfaceC6036, l.InterfaceC20343, java.util.Iterator, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C12001.m30186(this, consumer);
    }

    @Override // l.InterfaceC24073
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C3189.$default$forEachRemaining((InterfaceC20343) this, intConsumer);
    }

    @Override // l.InterfaceC20343, java.util.Iterator
    public /* synthetic */ Integer next() {
        return C3189.$default$next((InterfaceC20343) this);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public /* bridge */ /* synthetic */ Object next() {
        return next();
    }
}
