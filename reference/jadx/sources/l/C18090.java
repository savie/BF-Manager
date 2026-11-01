package l;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ᩳܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18090 extends AbstractC0389 implements InterfaceC8857 {
    public final DoubleConsumer b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC14884.a(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // l.InterfaceC8857
    public final /* synthetic */ void n(Double d) {
        AbstractC22686.n(this, d);
    }

    @Override // l.InterfaceC3647
    public final Object b(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693) {
        abstractC5752.f0(interfaceC20693, this);
        return null;
    }

    @Override // l.InterfaceC3647
    public final /* bridge */ /* synthetic */ Object e(AbstractC22686 abstractC22686, InterfaceC20693 interfaceC20693) {
        a(abstractC22686, interfaceC20693);
        return null;
    }

    public C18090(DoubleConsumer doubleConsumer, boolean z) {
        super(z);
        this.b = doubleConsumer;
    }

    @Override // l.AbstractC0389, l.InterfaceC19171
    public final void accept(double d) {
        this.b.accept(d);
    }
}
