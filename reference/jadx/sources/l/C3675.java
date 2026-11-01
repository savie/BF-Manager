package l;

import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.ۘۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3675 implements InterfaceC2319, InterfaceC8857 {
    public boolean a;
    public double b;
    public final /* synthetic */ DoubleBinaryOperator c;

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

    public C3675(DoubleBinaryOperator doubleBinaryOperator) {
        this.c = doubleBinaryOperator;
    }

    @Override // l.InterfaceC2319
    public final void i(InterfaceC2319 interfaceC2319) {
        C3675 c3675 = (C3675) interfaceC2319;
        if (c3675.a) {
            return;
        }
        accept(c3675.b);
    }

    @Override // l.InterfaceC19171
    public final void c(long j) {
        this.a = true;
        this.b = 0.0d;
    }

    @Override // l.InterfaceC19171
    public final void accept(double d) {
        if (this.a) {
            this.a = false;
            this.b = d;
        } else {
            this.b = this.c.applyAsDouble(this.b, d);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? C16460.c : new C16460(this.b);
    }
}
