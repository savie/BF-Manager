package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.᩹᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C23874 extends AbstractC16962 implements InterfaceC13080 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC2946.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC13080
    public final /* synthetic */ void n(Double d) {
        AbstractC13956.n(this, d);
    }

    @Override // l.AbstractC23128, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // l.InterfaceC18873
    public final void i(InterfaceC18873 interfaceC18873) {
        this.b += ((AbstractC16962) interfaceC18873).b;
    }

    @Override // l.AbstractC16962, l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.b++;
    }
}
