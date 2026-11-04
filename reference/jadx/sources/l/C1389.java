package l;

import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.֨᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1389 implements InterfaceC18873, InterfaceC12334 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ IntBinaryOperator c;

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

    public C1389(int i, IntBinaryOperator intBinaryOperator) {
        this.b = i;
        this.c = intBinaryOperator;
    }

    @Override // l.InterfaceC18873
    public final void i(InterfaceC18873 interfaceC18873) {
        accept(((C1389) interfaceC18873).a);
    }

    @Override // l.InterfaceC15143
    public final void c(long j) {
        this.a = this.b;
    }

    @Override // l.InterfaceC15143
    public final void accept(int i) {
        this.a = this.c.applyAsInt(this.a, i);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Integer.valueOf(this.a);
    }
}
