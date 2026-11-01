package l;

import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: l.ۛۨ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6034 implements InterfaceC2319, InterfaceC10974 {
    public boolean a;
    public int b;
    public final /* synthetic */ IntBinaryOperator c;

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

    public C6034(IntBinaryOperator intBinaryOperator) {
        this.c = intBinaryOperator;
    }

    @Override // l.InterfaceC2319
    public final void i(InterfaceC2319 interfaceC2319) {
        C6034 c6034 = (C6034) interfaceC2319;
        if (c6034.a) {
            return;
        }
        accept(c6034.b);
    }

    @Override // l.InterfaceC19171
    public final void c(long j) {
        this.a = true;
        this.b = 0;
    }

    @Override // l.InterfaceC19171
    public final void accept(int i) {
        if (this.a) {
            this.a = false;
            this.b = i;
        } else {
            this.b = this.c.applyAsInt(this.b, i);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? C2347.c : new C2347(this.b);
    }
}
