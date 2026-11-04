package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۙᩳ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: EBWB */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5091 implements InterfaceC12285, InterfaceC19597 {
    @Override // l.InterfaceC6173, l.InterfaceC19597
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C20490.m46990(this, consumer);
    }

    @Override // l.InterfaceC24073
    public /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C12138.$default$forEachRemaining((InterfaceC6173) this, longConsumer);
    }

    @Override // l.InterfaceC6173, java.util.Iterator
    public /* synthetic */ Long next() {
        return C12138.$default$next((InterfaceC6173) this);
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return next();
    }
}
