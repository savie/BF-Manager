package l;

import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ۗۛۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3211 implements InterfaceC18873, InterfaceC1148 {
    public boolean a;
    public long b;
    public final /* synthetic */ LongBinaryOperator c;

    @Override // l.InterfaceC15143, l.InterfaceC13080, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        AbstractC13956.m();
        throw null;
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void accept(int i) {
        AbstractC13956.t();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C12312.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C18279.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC1148
    public final /* synthetic */ void l(Long l2) {
        AbstractC13956.r(this, l2);
    }

    public C3211(LongBinaryOperator longBinaryOperator) {
        this.c = longBinaryOperator;
    }

    @Override // l.InterfaceC18873
    public final void i(InterfaceC18873 interfaceC18873) {
        C3211 c3211 = (C3211) interfaceC18873;
        if (c3211.a) {
            return;
        }
        accept(c3211.b);
    }

    @Override // l.InterfaceC15143
    public final void c(long j) {
        this.a = true;
        this.b = 0L;
    }

    @Override // l.InterfaceC15143
    public final void accept(long j) {
        if (this.a) {
            this.a = false;
            this.b = j;
        } else {
            this.b = this.c.applyAsLong(this.b, j);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? C19487.c : new C19487(this.b);
    }
}
