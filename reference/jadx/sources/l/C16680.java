package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ܽܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16680 extends AbstractC0389 implements InterfaceC10974 {
    public final IntConsumer b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC10974
    public final /* synthetic */ void d(Integer num) {
        AbstractC22686.p(this, num);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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

    public C16680(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // l.AbstractC0389, l.InterfaceC19171
    public final void accept(int i) {
        this.b.accept(i);
    }
}
