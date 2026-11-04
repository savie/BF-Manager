package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.᩷ۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C22031 extends AbstractC18301 implements InterfaceC1148 {
    public final LongConsumer b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C18279.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // l.InterfaceC1148
    public final /* synthetic */ void l(Long l2) {
        AbstractC13956.r(this, l2);
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

    public C22031(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // l.AbstractC18301, l.InterfaceC15143
    public final void accept(long j) {
        this.b.accept(j);
    }
}
