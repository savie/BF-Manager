package l;

import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: l.۠ܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8714 implements InterfaceC18873, InterfaceC13080 {
    public boolean a;
    public double b;
    public final /* synthetic */ DoubleBinaryOperator c;

    @Override // l.InterfaceC15143
    public final /* synthetic */ void accept(int i) {
        AbstractC13956.t();
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
        n((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return AbstractC2946.a(this, doubleConsumer);
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC13080
    public final /* synthetic */ void n(Double d) {
        AbstractC13956.n(this, d);
    }

    public C8714(DoubleBinaryOperator doubleBinaryOperator) {
        this.c = doubleBinaryOperator;
    }

    @Override // l.InterfaceC18873
    public final void i(InterfaceC18873 interfaceC18873) {
        C8714 c8714 = (C8714) interfaceC18873;
        if (c8714.a) {
            return;
        }
        accept(c8714.b);
    }

    @Override // l.InterfaceC15143
    public final void c(long j) {
        this.a = true;
        this.b = 0.0d;
    }

    @Override // l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
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
        return this.a ? C21725.c : new C21725(this.b);
    }
}
