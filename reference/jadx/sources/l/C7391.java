package l;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.۟ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C7391 extends C8463 implements InterfaceC13036, InterfaceC19960 {
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

    @Override // l.InterfaceC23280
    public final InterfaceC8616 build() {
        return this;
    }

    @Override // l.InterfaceC19960, l.InterfaceC23280
    public final InterfaceC13036 build() {
        return this;
    }

    @Override // l.InterfaceC10974
    public final /* synthetic */ void d(Integer num) {
        AbstractC22686.p(this, num);
    }

    @Override // l.InterfaceC19171
    public final void end() {
    }

    @Override // l.InterfaceC19171
    public final /* synthetic */ boolean f() {
        return false;
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ InterfaceC8616 j(long j, long j2, IntFunction intFunction) {
        return AbstractC22686.D(this, j, j2);
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC22686.v(this, intFunction);
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ int o() {
        return 0;
    }

    @Override // l.InterfaceC8616, l.InterfaceC0853
    public final /* bridge */ /* synthetic */ InterfaceC8616 a(int i) {
        a(i);
        throw null;
    }

    @Override // l.InterfaceC0853
    public final InterfaceC0853 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ void k(Object[] objArr, int i) {
        AbstractC22686.x(this, (Integer[]) objArr, i);
    }

    @Override // l.AbstractC21502, l.InterfaceC0853
    public final void e(int i, Object obj) {
        super.e(i, (int[]) obj);
    }

    @Override // l.AbstractC21502, l.InterfaceC0853
    public final void g(Object obj) {
        super.g((IntConsumer) obj);
    }

    @Override // l.C8463, l.AbstractC21502, java.lang.Iterable, l.InterfaceC16585, l.InterfaceC10441, java.util.Set, l.InterfaceC22810
    public final InterfaceC10110 spliterator() {
        return super.spliterator();
    }

    @Override // l.C8463, l.AbstractC21502, java.lang.Iterable, l.InterfaceC16585, l.InterfaceC10441, java.util.Set, l.InterfaceC22810
    public final InterfaceC20693 spliterator() {
        return super.spliterator();
    }

    @Override // l.InterfaceC19171
    public final void c(long j) {
        clear();
        s(j);
    }

    @Override // l.AbstractC21502, l.InterfaceC0853
    public final Object b() {
        return (int[]) super.b();
    }
}
