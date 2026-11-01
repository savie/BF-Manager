package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۫ۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12199 extends AbstractC19864 implements InterfaceC8857 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC14884.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC8857
    public final /* synthetic */ void n(Double d) {
        AbstractC22686.n(this, d);
    }

    @Override // l.AbstractC18548, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // l.InterfaceC2319
    public final void i(InterfaceC2319 interfaceC2319) {
        this.b += ((AbstractC19864) interfaceC2319).b;
    }

    @Override // l.AbstractC19864, l.InterfaceC19171
    public final void accept(double d) {
        this.b++;
    }
}
