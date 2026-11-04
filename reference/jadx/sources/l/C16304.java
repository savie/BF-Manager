package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ܶ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16304 extends AbstractC18301 implements InterfaceC13080 {
    public final DoubleConsumer b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC2946.a(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // l.InterfaceC13080
    public final /* synthetic */ void n(Double d) {
        AbstractC13956.n(this, d);
    }

    @Override // l.InterfaceC8605
    public final Object b(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409) {
        abstractC15470.f0(interfaceC8409, this);
        return null;
    }

    @Override // l.InterfaceC8605
    public final /* bridge */ /* synthetic */ Object e(AbstractC13956 abstractC13956, InterfaceC8409 interfaceC8409) {
        a(abstractC13956, interfaceC8409);
        return null;
    }

    public C16304(DoubleConsumer doubleConsumer, boolean z) {
        super(z);
        this.b = doubleConsumer;
    }

    @Override // l.AbstractC18301, l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.b.accept(d);
    }
}
