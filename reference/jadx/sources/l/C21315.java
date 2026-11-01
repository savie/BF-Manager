package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩸ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C21315 extends AbstractC0148 implements InterfaceC19282, LongConsumer {
    public long f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C7993.a(this, consumer);
    }

    @Override // l.InterfaceC20693
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C7993.b(this, consumer);
    }

    @Override // l.AbstractC19939
    public final InterfaceC20693 b(InterfaceC20693 interfaceC20693) {
        return new C21315((InterfaceC19282) interfaceC20693, this);
    }

    @Override // l.AbstractC0148
    public final void g(Object obj) {
        ((LongConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f = j;
    }

    @Override // l.AbstractC0148
    public final AbstractC1862 j(int i) {
        return new C20913(i);
    }
}
