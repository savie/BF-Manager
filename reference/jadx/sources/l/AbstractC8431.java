package l;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: l.۠ۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8431 extends AbstractC24620 implements LongConsumer, InterfaceC9900 {
    public final LongPredicate e;
    public long f;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C18279.$default$andThen(this, longConsumer);
    }

    @Override // l.AbstractC24620, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C18851.a(this, consumer);
    }

    @Override // l.InterfaceC9154
    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        C18851.$default$forEachRemaining(this, longConsumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C18851.b(this, consumer);
    }

    public AbstractC8431(InterfaceC9900 interfaceC9900, LongPredicate longPredicate) {
        super(interfaceC9900);
        this.e = longPredicate;
    }

    public AbstractC8431(InterfaceC9900 interfaceC9900, AbstractC8431 abstractC8431) {
        super(interfaceC9900, abstractC8431);
        this.e = abstractC8431.e;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.d = (this.d + 1) & 63;
        this.f = j;
    }

    @Override // l.InterfaceC9154
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((LongConsumer) obj);
    }
}
