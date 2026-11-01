package l;

import java.util.function.Consumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.۠ۖ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7882 implements InterfaceC2319, InterfaceC21993 {
    public long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ LongBinaryOperator c;

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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void n(Object obj) {
        l((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return C1455.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return C21917.$default$andThen(this, longConsumer);
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ void end() {
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC21993
    public final /* synthetic */ void l(Long l2) {
        AbstractC22686.r(this, l2);
    }

    public C7882(long j, LongBinaryOperator longBinaryOperator) {
        this.b = j;
        this.c = longBinaryOperator;
    }

    @Override // l.InterfaceC2319
    public final void i(InterfaceC2319 interfaceC2319) {
        accept(((C7882) interfaceC2319).a);
    }

    @Override // l.InterfaceC19171
    public final void c(long j) {
        this.a = this.b;
    }

    @Override // l.InterfaceC19171
    public final void accept(long j) {
        this.a = this.c.applyAsLong(this.a, j);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.a);
    }
}
