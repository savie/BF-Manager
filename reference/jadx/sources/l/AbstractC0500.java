package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.֡ܶᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: EBWB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0500 implements InterfaceC1288, InterfaceC6206 {
    @Override // l.InterfaceC12932, java.util.Iterator, l.InterfaceC6206
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C22456.m49957(this, consumer);
    }

    @Override // l.InterfaceC3758
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C0936.$default$forEachRemaining((InterfaceC12932) this, longConsumer);
    }

    @Override // l.InterfaceC12932, java.util.Iterator
    public /* synthetic */ Long next() {
        return C0936.$default$next((InterfaceC12932) this);
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return next();
    }
}
