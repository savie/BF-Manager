package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۢۨۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10096 extends AbstractC23128 implements InterfaceC18873, InterfaceC12334 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjIntConsumer c;
    public final /* synthetic */ C21285 d;

    @Override // l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        AbstractC13956.m();
        throw null;
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void accept(long j) {
        AbstractC13956.u();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C4109.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC12334
    public final /* synthetic */ void d(Integer num) {
        AbstractC13956.p(this, num);
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC18873
    public final void i(InterfaceC18873 interfaceC18873) {
        this.a = this.d.apply(this.a, ((C10096) interfaceC18873).a);
    }

    @Override // l.InterfaceC15143
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // l.InterfaceC15143
    public final void accept(int i) {
        this.c.accept(this.a, i);
    }

    public C10096(Supplier supplier, ObjIntConsumer objIntConsumer, C21285 c21285) {
        this.b = supplier;
        this.c = objIntConsumer;
        this.d = c21285;
    }
}
