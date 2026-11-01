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

/* JADX INFO: renamed from: l.ۡ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8575 extends AbstractC5752 implements InterfaceC19386 {
    @Override // l.InterfaceC19386
    public final C16460 findAny() {
        return (C16460) i0(C5087.d);
    }

    @Override // l.InterfaceC19386
    public final C16460 findFirst() {
        return (C16460) i0(C5087.c);
    }

    @Override // l.InterfaceC19386
    public final InterfaceC19386 sorted() {
        return new C3978(this, EnumC2970.q | EnumC2970.o);
    }

    public static InterfaceC7535 u0(InterfaceC20693 interfaceC20693) {
        if (interfaceC20693 instanceof InterfaceC7535) {
            return (InterfaceC7535) interfaceC20693;
        }
        if (AbstractC14233.a) {
            AbstractC14233.a(AbstractC5752.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        C13638.requireNonNull(doubleConsumer);
        i0(new C18090(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        C13638.requireNonNull(doubleConsumer);
        i0(new C18090(doubleConsumer, true));
    }

    @Override // l.AbstractC5752
    public final EnumC22761 m0() {
        return EnumC22761.DOUBLE_VALUE;
    }

    @Override // l.AbstractC5752
    public final InterfaceC8616 k0(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693, boolean z, IntFunction intFunction) {
        return AbstractC22686.I(abstractC5752, interfaceC20693, z);
    }

    @Override // l.AbstractC5752
    public final InterfaceC20693 t0(AbstractC5752 abstractC5752, Supplier supplier, boolean z) {
        return new C9999(abstractC5752, supplier, z);
    }

    @Override // l.AbstractC5752
    public final boolean l0(InterfaceC20693 interfaceC20693, InterfaceC19171 interfaceC19171) {
        DoubleConsumer c14344;
        boolean zF;
        InterfaceC7535 interfaceC7535U0 = u0(interfaceC20693);
        if (interfaceC19171 instanceof DoubleConsumer) {
            c14344 = (DoubleConsumer) interfaceC19171;
        } else {
            if (AbstractC14233.a) {
                AbstractC14233.a(AbstractC5752.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            C13638.requireNonNull(interfaceC19171);
            c14344 = new C14344(interfaceC19171, 1);
        }
        do {
            zF = interfaceC19171.f();
            if (zF) {
                break;
            }
        } while (interfaceC7535U0.tryAdvance(c14344));
        return zF;
    }

    @Override // l.AbstractC22686
    public final InterfaceC23280 c0(long j, IntFunction intFunction) {
        return AbstractC22686.O(j);
    }

    @Override // l.InterfaceC6124
    public final InterfaceC4983 iterator() {
        InterfaceC7535 interfaceC7535Spliterator = spliterator();
        C13638.requireNonNull(interfaceC7535Spliterator);
        return new C12227(interfaceC7535Spliterator);
    }

    @Override // l.AbstractC5752, l.InterfaceC6124
    public final InterfaceC7535 spliterator() {
        return u0(super.spliterator());
    }

    @Override // l.InterfaceC19386
    public final InterfaceC5046 boxed() {
        return new C22699(this, 0, new C13858(10), 0);
    }

    @Override // l.InterfaceC19386
    public final InterfaceC19386 map(DoubleUnaryOperator doubleUnaryOperator) {
        C13638.requireNonNull(doubleUnaryOperator);
        return new C15644(this, EnumC2970.p | EnumC2970.n, doubleUnaryOperator, 0);
    }

    @Override // l.InterfaceC19386
    public final InterfaceC5046 mapToObj(DoubleFunction doubleFunction) {
        C13638.requireNonNull(doubleFunction);
        return new C22699(this, EnumC2970.p | EnumC2970.n, doubleFunction, 0);
    }

    @Override // l.InterfaceC19386
    public final InterfaceC13514 i() {
        C13638.requireNonNull(null);
        return new C9294(this, EnumC2970.p | EnumC2970.n, 0);
    }

    @Override // l.InterfaceC19386
    public final InterfaceC18796 h() {
        C13638.requireNonNull(null);
        return new C6553(this, EnumC2970.p | EnumC2970.n, 0);
    }

    @Override // l.InterfaceC19386
    public final InterfaceC19386 a(C5295 c5295) {
        C13638.requireNonNull(c5295);
        return new C15644(this, EnumC2970.p | EnumC2970.n | EnumC2970.t, c5295, 1);
    }

    @Override // l.InterfaceC19386
    public final InterfaceC19386 filter(DoublePredicate doublePredicate) {
        C13638.requireNonNull(doublePredicate);
        return new C15644(this, EnumC2970.t, doublePredicate, 2);
    }

    @Override // l.InterfaceC19386
    public final InterfaceC19386 peek(DoubleConsumer doubleConsumer) {
        C13638.requireNonNull(doubleConsumer);
        return new C15644(this, doubleConsumer);
    }

    @Override // l.InterfaceC19386
    public final InterfaceC19386 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC20092.e(this, 0L, j);
    }

    @Override // l.InterfaceC19386
    public final InterfaceC19386 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC20092.e(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // l.InterfaceC19386
    public final InterfaceC19386 takeWhile(DoublePredicate doublePredicate) {
        int i = AbstractC13402.a;
        C13638.requireNonNull(doublePredicate);
        return new C17787(this, AbstractC13402.a, doublePredicate, 0);
    }

    @Override // l.InterfaceC19386
    public final InterfaceC19386 dropWhile(DoublePredicate doublePredicate) {
        int i = AbstractC13402.a;
        C13638.requireNonNull(doublePredicate);
        return new C17787(this, AbstractC13402.b, doublePredicate, 1);
    }

    @Override // l.InterfaceC19386
    public final InterfaceC19386 distinct() {
        return ((AbstractC14295) boxed()).distinct().mapToDouble(new C13858(11));
    }

    @Override // l.InterfaceC19386
    public final double sum() {
        double[] dArr = (double[]) collect(new C17821(9), new C13858(14), new C13858(4));
        Set set = C1890.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // l.InterfaceC19386
    public final C16460 min() {
        return reduce(new C13858(5));
    }

    @Override // l.InterfaceC19386
    public final C16460 max() {
        return reduce(new C13858(13));
    }

    @Override // l.InterfaceC19386
    public final C16460 average() {
        double[] dArr = (double[]) collect(new C17821(8), new C13858(6), new C13858(7));
        if (dArr[2] <= 0.0d) {
            return C16460.c;
        }
        Set set = C1890.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new C16460(d / dArr[2]);
    }

    @Override // l.InterfaceC19386
    public final C17634 summaryStatistics() {
        return (C17634) collect(new C17821(0), new C13858(8), new C13858(9));
    }

    @Override // l.InterfaceC19386
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        C13638.requireNonNull(biConsumer);
        C20146 c20146 = new C20146(biConsumer, 0);
        C13638.requireNonNull(supplier);
        C13638.requireNonNull(objDoubleConsumer);
        C13638.requireNonNull(c20146);
        return i0(new C1746(EnumC22761.DOUBLE_VALUE, c20146, objDoubleConsumer, supplier, 1));
    }

    @Override // l.InterfaceC19386
    public final boolean anyMatch(DoublePredicate doublePredicate) {
        return ((Boolean) i0(AbstractC22686.Z(EnumC0120.ANY, doublePredicate))).booleanValue();
    }

    @Override // l.InterfaceC19386
    public final boolean allMatch(DoublePredicate doublePredicate) {
        return ((Boolean) i0(AbstractC22686.Z(EnumC0120.ALL, doublePredicate))).booleanValue();
    }

    @Override // l.InterfaceC19386
    public final boolean noneMatch(DoublePredicate doublePredicate) {
        return ((Boolean) i0(AbstractC22686.Z(EnumC0120.NONE, doublePredicate))).booleanValue();
    }

    @Override // l.InterfaceC19386
    public final double[] toArray() {
        return (double[]) AbstractC22686.T((InterfaceC7163) j0(new C13858(12))).b();
    }

    @Override // l.InterfaceC19386
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        C13638.requireNonNull(doubleBinaryOperator);
        return ((Double) i0(new C12883(EnumC22761.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // l.InterfaceC19386
    public final C16460 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        C13638.requireNonNull(doubleBinaryOperator);
        return (C16460) i0(new C6685(EnumC22761.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // l.InterfaceC19386
    public final long count() {
        return ((Long) i0(new C7204(1))).longValue();
    }
}
