package l;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۨ᩹۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C11991 extends AbstractC19864 implements InterfaceC10974 {
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

    @Override // l.AbstractC18548, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // l.InterfaceC2319
    public final void i(InterfaceC2319 interfaceC2319) {
        this.b += ((AbstractC19864) interfaceC2319).b;
    }

    @Override // l.AbstractC19864, l.InterfaceC19171
    public final void accept(int i) {
        this.b++;
    }
}
