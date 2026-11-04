package l;

import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: l.ܳ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15558 extends C16216 implements InterfaceC6478, InterfaceC21636 {
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

    @Override // l.InterfaceC21636, l.InterfaceC4262
    public final InterfaceC6478 build() {
        return this;
    }

    @Override // l.InterfaceC4262
    public final InterfaceC13409 build() {
        return this;
    }

    @Override // l.InterfaceC15143
    public final void end() {
    }

    @Override // l.InterfaceC15143
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ InterfaceC13409 j(long j, long j2, IntFunction intFunction) {
        return AbstractC13956.E(this, j, j2);
    }

    @Override // l.InterfaceC1148
    public final /* synthetic */ void l(Long l2) {
        AbstractC13956.r(this, l2);
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC13956.v(this, intFunction);
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // l.InterfaceC13409
    public final /* bridge */ /* synthetic */ InterfaceC13409 a(int i) {
        a(i);
        throw null;
    }

    @Override // l.InterfaceC9459, l.InterfaceC13409
    public final InterfaceC9459 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC13409
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC13956.y(this, (Long[]) objArr, i);
    }

    @Override // l.AbstractC22140, l.InterfaceC9459
    public final void e(int i, Object obj) {
        super.e(i, (long[]) obj);
    }

    @Override // l.AbstractC22140, l.InterfaceC9459
    public final void g(Object obj) {
        super.g((LongConsumer) obj);
    }

    @Override // l.C16216, l.AbstractC22140, java.lang.Iterable, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return super.spliterator();
    }

    @Override // l.C16216, l.AbstractC22140, java.lang.Iterable, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC9154 spliterator() {
        return super.spliterator();
    }

    @Override // l.InterfaceC15143
    public final void c(long j) {
        clear();
        s(j);
    }

    @Override // l.AbstractC22140, l.InterfaceC9459
    public final Object b() {
        return (long[]) super.b();
    }
}
