package l;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: l.ܰۚ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13610 extends C5848 implements InterfaceC7163, InterfaceC15021 {
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

    @Override // l.InterfaceC15021, l.InterfaceC23280
    public final InterfaceC7163 build() {
        return this;
    }

    @Override // l.InterfaceC23280
    public final InterfaceC8616 build() {
        return this;
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
        return AbstractC22686.C(this, j, j2);
    }

    @Override // l.InterfaceC8616
    public final /* synthetic */ Object[] m(IntFunction intFunction) {
        return AbstractC22686.v(this, intFunction);
    }

    @Override // l.InterfaceC8857
    public final /* synthetic */ void n(Double d) {
        AbstractC22686.n(this, d);
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
        AbstractC22686.w(this, (Double[]) objArr, i);
    }

    @Override // l.AbstractC21502, l.InterfaceC0853
    public final void e(int i, Object obj) {
        super.e(i, (double[]) obj);
    }

    @Override // l.AbstractC21502, l.InterfaceC0853
    public final void g(Object obj) {
        super.g((DoubleConsumer) obj);
    }

    @Override // l.C5848, l.AbstractC21502, java.lang.Iterable, l.InterfaceC16585, l.InterfaceC10441, java.util.Set, l.InterfaceC22810
    public final InterfaceC10110 spliterator() {
        return super.spliterator();
    }

    @Override // l.C5848, l.AbstractC21502, java.lang.Iterable, l.InterfaceC16585, l.InterfaceC10441, java.util.Set, l.InterfaceC22810
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
        return (double[]) super.b();
    }
}
