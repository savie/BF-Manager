package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: renamed from: l.۬᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14066 extends AbstractC24620 implements DoubleConsumer, InterfaceC3012 {
    public final DoublePredicate e;
    public double f;

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC2946.a(this, doubleConsumer);
    }

    @Override // l.AbstractC24620, l.InterfaceC8409
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        AbstractC2946.b(this, consumer);
    }

    @Override // l.InterfaceC8409, l.InterfaceC7664
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return AbstractC2946.g(this, consumer);
    }

    @Override // l.InterfaceC9154
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    public AbstractC14066(InterfaceC3012 interfaceC3012, DoublePredicate doublePredicate) {
        super(interfaceC3012);
        this.e = doublePredicate;
    }

    public AbstractC14066(InterfaceC3012 interfaceC3012, AbstractC14066 abstractC14066) {
        super(interfaceC3012, abstractC14066);
        this.e = abstractC14066.e;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.d = (this.d + 1) & 63;
        this.f = d;
    }

    @Override // l.InterfaceC9154
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        return tryAdvance((DoubleConsumer) obj);
    }
}
