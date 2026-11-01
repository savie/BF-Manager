package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܰۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13796 extends AbstractC0389 implements InterfaceC21993 {
    public final LongConsumer b;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // l.InterfaceC21993
    public final /* synthetic */ void l(Long l2) {
        AbstractC22686.r(this, l2);
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

    public C13796(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // l.AbstractC0389, l.InterfaceC19171
    public final void accept(long j) {
        this.b.accept(j);
    }
}
