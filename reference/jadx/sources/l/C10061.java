package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: l.ۤۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10061 extends AbstractC18548 implements InterfaceC2319 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ BiFunction c;
    public final /* synthetic */ BinaryOperator d;

    @Override // l.InterfaceC19171
    public final /* synthetic */ void accept(double d) {
        AbstractC22686.m();
        throw null;
    }

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

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
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
        this.a = this.d.apply(this.a, ((C10061) interfaceC2319).a);
    }

    @Override // l.InterfaceC19171
    public final void c(long j) {
        this.a = this.b;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void n(Object obj) {
        this.a = this.c.apply(this.a, obj);
    }

    public C10061(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.b = obj;
        this.c = biFunction;
        this.d = binaryOperator;
    }
}
