package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩷᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22360 extends AbstractC17884 implements InterfaceC9900, LongConsumer {
    public long f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C18279.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C18851.a(this, consumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C18851.b(this, consumer);
    }

    @Override // l.AbstractC16547
    public final InterfaceC8409 b(InterfaceC8409 interfaceC8409) {
        return new C22360((InterfaceC9900) interfaceC8409, this);
    }

    @Override // l.AbstractC17884
    public final void g(Object obj) {
        ((LongConsumer) obj).accept(this.f);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f = j;
    }

    @Override // l.AbstractC17884
    public final AbstractC4372 j(int i) {
        return new C11829(i);
    }
}
