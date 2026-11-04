package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.۟᩺ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8211 extends AbstractC16962 implements InterfaceC12334 {
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

    @Override // l.AbstractC23128, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // l.InterfaceC18873
    public final void i(InterfaceC18873 interfaceC18873) {
        this.b += ((AbstractC16962) interfaceC18873).b;
    }

    @Override // l.AbstractC16962, l.InterfaceC15143
    public final void accept(int i) {
        this.b++;
    }
}
