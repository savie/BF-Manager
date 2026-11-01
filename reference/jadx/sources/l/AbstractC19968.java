package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.᩶ۚᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: I1PG */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC19968 implements InterfaceC13431, InterfaceC6206 {
    @Override // l.InterfaceC13431, l.InterfaceC22104, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C1435.m5012(this, consumer);
    }

    @Override // l.InterfaceC3758
    public /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C5170.$default$forEachRemaining((InterfaceC22104) this, intConsumer);
    }

    @Override // l.InterfaceC22104, java.util.Iterator
    public /* synthetic */ Integer next() {
        return C5170.$default$next((InterfaceC22104) this);
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public /* bridge */ /* synthetic */ Object next() {
        return next();
    }
}
