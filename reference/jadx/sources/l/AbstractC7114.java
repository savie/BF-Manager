package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: l.ۜۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7114 extends AbstractC24620 implements IntConsumer, InterfaceC7664 {
    public final IntPredicate e;
    public int f;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C4109.$default$andThen(this, intConsumer);
    }

    @Override // l.AbstractC24620, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C0206.a(this, consumer);
    }

    @Override // l.InterfaceC9154
    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        C0206.$default$forEachRemaining(this, intConsumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C0206.b(this, consumer);
    }

    public AbstractC7114(InterfaceC7664 interfaceC7664, IntPredicate intPredicate) {
        super(interfaceC7664);
        this.e = intPredicate;
    }

    public AbstractC7114(InterfaceC7664 interfaceC7664, AbstractC7114 abstractC7114) {
        super(interfaceC7664, abstractC7114);
        this.e = abstractC7114.e;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.d = (this.d + 1) & 63;
        this.f = i;
    }

    @Override // l.InterfaceC9154
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((IntConsumer) obj);
    }
}
