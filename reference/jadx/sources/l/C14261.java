package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܳۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C14261 extends AbstractC18548 implements InterfaceC2319, InterfaceC8857 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjDoubleConsumer c;
    public final /* synthetic */ C20146 d;

    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(int i) {
        AbstractC22686.t();
        throw null;
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(long j) {
        AbstractC22686.u();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC14884.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC8857
    public final /* synthetic */ void n(Double d) {
        AbstractC22686.n(this, d);
    }

    @Override // l.InterfaceC2319
    public final void i(InterfaceC2319 interfaceC2319) {
        this.a = this.d.apply(this.a, ((C14261) interfaceC2319).a);
    }

    @Override // l.InterfaceC19171
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // l.InterfaceC19171
    public final void accept(double d) {
        this.c.accept(this.a, d);
    }

    public C14261(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, C20146 c20146) {
        this.b = supplier;
        this.c = objDoubleConsumer;
        this.d = c20146;
    }
}
