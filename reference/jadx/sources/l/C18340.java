package l;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ᩳ᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C18340 extends AbstractC19864 implements InterfaceC21993 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC21993
    public final /* synthetic */ void l(Long l2) {
        AbstractC22686.r(this, l2);
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
    public final void accept(long j) {
        this.b++;
    }
}
