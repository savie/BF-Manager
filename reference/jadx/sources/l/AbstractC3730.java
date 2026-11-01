package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.ۘۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3730 extends AbstractC14316 implements LongConsumer, InterfaceC19282 {
    public final LongPredicate e;
    public long f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }

    @Override // l.AbstractC14316, l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C7993.a(this, consumer);
    }

    @Override // l.InterfaceC10110
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C7993.$default$forEachRemaining(this, longConsumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C7993.b(this, consumer);
    }

    public AbstractC3730(InterfaceC19282 interfaceC19282, LongPredicate longPredicate) {
        super(interfaceC19282);
        this.e = longPredicate;
    }

    public AbstractC3730(InterfaceC19282 interfaceC19282, AbstractC3730 abstractC3730) {
        super(interfaceC19282, abstractC3730);
        this.e = abstractC3730.e;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.d = (this.d + 1) & 63;
        this.f = j;
    }

    @Override // l.InterfaceC10110
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((LongConsumer) obj);
    }
}
