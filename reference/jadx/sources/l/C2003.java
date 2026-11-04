package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.֫ܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2003 extends C7991 implements InterfaceC2792, InterfaceC17160 {
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

    @Override // l.InterfaceC17160, l.InterfaceC4262
    public final InterfaceC2792 build() {
        return this;
    }

    @Override // l.InterfaceC4262
    public final InterfaceC13409 build() {
        return this;
    }

    @Override // l.InterfaceC12334
    public final /* synthetic */ void d(Integer num) {
        AbstractC13956.p(this, num);
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
        return AbstractC13956.D(this, j, j2);
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
        AbstractC13956.x(this, (Integer[]) objArr, i);
    }

    @Override // l.AbstractC22140, l.InterfaceC9459
    public final void e(int i, Object obj) {
        super.e(i, (int[]) obj);
    }

    @Override // l.AbstractC22140, l.InterfaceC9459
    public final void g(Object obj) {
        super.g((IntConsumer) obj);
    }

    @Override // l.C7991, l.AbstractC22140, java.lang.Iterable, l.InterfaceC22091, l.InterfaceC13409
    public final InterfaceC8409 spliterator() {
        return super.spliterator();
    }

    @Override // l.C7991, l.AbstractC22140, java.lang.Iterable, l.InterfaceC22091, l.InterfaceC13409
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
        return (int[]) super.b();
    }
}
