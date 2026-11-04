package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܿܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18432 extends AbstractC16962 implements InterfaceC1148 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C18279.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC1148
    public final /* synthetic */ void l(Long l2) {
        AbstractC13956.r(this, l2);
    }

    @Override // l.AbstractC23128, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // l.InterfaceC18873
    public final void i(InterfaceC18873 interfaceC18873) {
        this.b += ((AbstractC16962) interfaceC18873).b;
    }

    @Override // l.AbstractC16962, l.InterfaceC15143
    public final void accept(long j) {
        this.b++;
    }
}
