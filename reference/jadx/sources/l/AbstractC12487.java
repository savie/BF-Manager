package l;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۨܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12487 extends AbstractC15470 implements InterfaceC20648 {
    @Override // l.InterfaceC20648
    public final C21725 findAny() {
        return (C21725) i0(C20122.d);
    }

    @Override // l.InterfaceC20648
    public final C21725 findFirst() {
        return (C21725) i0(C20122.c);
    }

    @Override // l.InterfaceC20648
    public final InterfaceC20648 sorted() {
        return new C8343(this, EnumC21614.q | EnumC21614.o);
    }

    public static InterfaceC3012 u0(InterfaceC8409 interfaceC8409) {
        if (interfaceC8409 instanceof InterfaceC3012) {
            return (InterfaceC3012) interfaceC8409;
        }
        if (AbstractC24095.a) {
            AbstractC24095.a(AbstractC15470.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        C17359.requireNonNull(doubleConsumer);
        i0(new C16304(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        C17359.requireNonNull(doubleConsumer);
        i0(new C16304(doubleConsumer, true));
    }

    @Override // l.AbstractC15470
    public final EnumC14154 m0() {
        return EnumC14154.DOUBLE_VALUE;
    }

    @Override // l.AbstractC15470
    public final InterfaceC13409 k0(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409, boolean z, IntFunction intFunction) {
        return AbstractC13956.I(abstractC15470, interfaceC8409, z);
    }

    @Override // l.AbstractC15470
    public final InterfaceC8409 t0(AbstractC15470 abstractC15470, Supplier supplier, boolean z) {
        return new C5449(abstractC15470, supplier, z);
    }

    @Override // l.AbstractC15470
    public final boolean l0(InterfaceC8409 interfaceC8409, InterfaceC15143 interfaceC15143) {
        DoubleConsumer c5317;
        boolean zF;
        InterfaceC3012 interfaceC3012U0 = u0(interfaceC8409);
        if (interfaceC15143 instanceof DoubleConsumer) {
            c5317 = (DoubleConsumer) interfaceC15143;
        } else {
            if (AbstractC24095.a) {
                AbstractC24095.a(AbstractC15470.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            C17359.requireNonNull(interfaceC15143);
            c5317 = new C5317(interfaceC15143, 1);
        }
        do {
            zF = interfaceC15143.f();
            if (zF) {
                break;
            }
        } while (interfaceC3012U0.tryAdvance(c5317));
        return zF;
    }

    @Override // l.AbstractC13956
    public final InterfaceC4262 c0(long j, IntFunction intFunction) {
        return AbstractC13956.O(j);
    }

    @Override // l.InterfaceC19924
    public final InterfaceC16787 iterator() {
        InterfaceC3012 interfaceC3012Spliterator = spliterator();
        C17359.requireNonNull(interfaceC3012Spliterator);
        return new C10536(interfaceC3012Spliterator);
    }

    @Override // l.AbstractC15470, l.InterfaceC19924
    public final InterfaceC3012 spliterator() {
        return u0(super.spliterator());
    }

    @Override // l.InterfaceC20648
    public final InterfaceC20670 boxed() {
        return new C24841(this, 0, new C22272(10), 0);
    }

    @Override // l.InterfaceC20648
    public final InterfaceC20648 map(DoubleUnaryOperator doubleUnaryOperator) {
        C17359.requireNonNull(doubleUnaryOperator);
        return new C14397(this, EnumC21614.p | EnumC21614.n, doubleUnaryOperator, 0);
    }

    @Override // l.InterfaceC20648
    public final InterfaceC20670 mapToObj(DoubleFunction doubleFunction) {
        C17359.requireNonNull(doubleFunction);
        return new C24841(this, EnumC21614.p | EnumC21614.n, doubleFunction, 0);
    }

    @Override // l.InterfaceC20648
    public final InterfaceC17686 i() {
        C17359.requireNonNull(null);
        return new C6940(this, EnumC21614.p | EnumC21614.n, 0);
    }

    @Override // l.InterfaceC20648
    public final InterfaceC16194 h() {
        C17359.requireNonNull(null);
        return new C11939(this, EnumC21614.p | EnumC21614.n, 0);
    }

    @Override // l.InterfaceC20648
    public final InterfaceC20648 a(C3249 c3249) {
        C17359.requireNonNull(c3249);
        return new C14397(this, EnumC21614.p | EnumC21614.n | EnumC21614.t, c3249, 1);
    }

    @Override // l.InterfaceC20648
    public final InterfaceC20648 filter(DoublePredicate doublePredicate) {
        C17359.requireNonNull(doublePredicate);
        return new C14397(this, EnumC21614.t, doublePredicate, 2);
    }

    @Override // l.InterfaceC20648
    public final InterfaceC20648 peek(DoubleConsumer doubleConsumer) {
        C17359.requireNonNull(doubleConsumer);
        return new C14397(this, doubleConsumer);
    }

    @Override // l.InterfaceC20648
    public final InterfaceC20648 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC16918.e(this, 0L, j);
    }

    @Override // l.InterfaceC20648
    public final InterfaceC20648 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC16918.e(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // l.InterfaceC20648
    public final InterfaceC20648 takeWhile(DoublePredicate doublePredicate) {
        int i = AbstractC2990.a;
        C17359.requireNonNull(doublePredicate);
        return new C11171(this, AbstractC2990.a, doublePredicate, 0);
    }

    @Override // l.InterfaceC20648
    public final InterfaceC20648 dropWhile(DoublePredicate doublePredicate) {
        int i = AbstractC2990.a;
        C17359.requireNonNull(doublePredicate);
        return new C11171(this, AbstractC2990.b, doublePredicate, 1);
    }

    @Override // l.InterfaceC20648
    public final InterfaceC20648 distinct() {
        return ((AbstractC24007) boxed()).distinct().mapToDouble(new C22272(11));
    }

    @Override // l.InterfaceC20648
    public final double sum() {
        double[] dArr = (double[]) collect(new C8189(9), new C22272(14), new C22272(4));
        Set set = C2025.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // l.InterfaceC20648
    public final C21725 min() {
        return reduce(new C22272(5));
    }

    @Override // l.InterfaceC20648
    public final C21725 max() {
        return reduce(new C22272(13));
    }

    @Override // l.InterfaceC20648
    public final C21725 average() {
        double[] dArr = (double[]) collect(new C8189(8), new C22272(6), new C22272(7));
        if (dArr[2] <= 0.0d) {
            return C21725.c;
        }
        Set set = C2025.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new C21725(d / dArr[2]);
    }

    @Override // l.InterfaceC20648
    public final C15077 summaryStatistics() {
        return (C15077) collect(new C8189(0), new C22272(8), new C22272(9));
    }

    @Override // l.InterfaceC20648
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        C17359.requireNonNull(biConsumer);
        C21285 c21285 = new C21285(biConsumer, 0);
        C17359.requireNonNull(supplier);
        C17359.requireNonNull(objDoubleConsumer);
        C17359.requireNonNull(c21285);
        return i0(new C4240(EnumC14154.DOUBLE_VALUE, c21285, objDoubleConsumer, supplier, 1));
    }

    @Override // l.InterfaceC20648
    public final boolean anyMatch(DoublePredicate doublePredicate) {
        return ((Boolean) i0(AbstractC13956.Z(EnumC17381.ANY, doublePredicate))).booleanValue();
    }

    @Override // l.InterfaceC20648
    public final boolean allMatch(DoublePredicate doublePredicate) {
        return ((Boolean) i0(AbstractC13956.Z(EnumC17381.ALL, doublePredicate))).booleanValue();
    }

    @Override // l.InterfaceC20648
    public final boolean noneMatch(DoublePredicate doublePredicate) {
        return ((Boolean) i0(AbstractC13956.Z(EnumC17381.NONE, doublePredicate))).booleanValue();
    }

    @Override // l.InterfaceC20648
    public final double[] toArray() {
        return (double[]) AbstractC13956.T((InterfaceC2047) j0(new C22272(12))).b();
    }

    @Override // l.InterfaceC20648
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        C17359.requireNonNull(doubleBinaryOperator);
        return ((Double) i0(new C2968(EnumC14154.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // l.InterfaceC20648
    public final C21725 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        C17359.requireNonNull(doubleBinaryOperator);
        return (C21725) i0(new C7267(EnumC14154.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // l.InterfaceC20648
    public final long count() {
        return ((Long) i0(new C2223(1))).longValue();
    }
}
