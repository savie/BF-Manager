package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۚۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C5059 extends AbstractC18548 implements InterfaceC2319, InterfaceC10974 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjIntConsumer c;
    public final /* synthetic */ C20146 d;

    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(double d) {
        AbstractC22686.m();
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
        d((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return C7100.$default$andThen(this, intConsumer);
    }

    @Override // l.InterfaceC10974
    public final /* synthetic */ void d(Integer num) {
        AbstractC22686.p(this, num);
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC2319
    public final void i(InterfaceC2319 interfaceC2319) {
        this.a = this.d.apply(this.a, ((C5059) interfaceC2319).a);
    }

    @Override // l.InterfaceC19171
    public final void c(long j) {
        this.a = this.b.get();
    }

    @Override // l.InterfaceC19171
    public final void accept(int i) {
        this.c.accept(this.a, i);
    }

    public C5059(Supplier supplier, ObjIntConsumer objIntConsumer, C20146 c20146) {
        this.b = supplier;
        this.c = objIntConsumer;
        this.d = c20146;
    }
}
