package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֡᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0643 extends AbstractC18301 implements InterfaceC12334 {
    public final IntConsumer b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C4109.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC12334
    public final /* synthetic */ void d(Integer num) {
        AbstractC13956.p(this, num);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
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

    public C0643(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // l.AbstractC18301, l.InterfaceC15143
    public final void accept(int i) {
        this.b.accept(i);
    }
}
