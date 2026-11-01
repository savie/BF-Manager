package l;

import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩻֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC23392 extends AbstractC5752 implements InterfaceC13514 {
    @Override // l.InterfaceC13514
    public final C2347 findAny() {
        return (C2347) i0(C7910.d);
    }

    @Override // l.InterfaceC13514
    public final C2347 findFirst() {
        return (C2347) i0(C7910.c);
    }

    @Override // l.InterfaceC13514
    public final InterfaceC13514 sorted() {
        return new C7507(this, EnumC2970.q | EnumC2970.o);
    }

    public void forEach(IntConsumer intConsumer) {
        C13638.requireNonNull(intConsumer);
        i0(new C16680(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        C13638.requireNonNull(intConsumer);
        i0(new C16680(intConsumer, true));
    }

    public static InterfaceC18576 u0(InterfaceC20693 interfaceC20693) {
        if (interfaceC20693 instanceof InterfaceC18576) {
            return (InterfaceC18576) interfaceC20693;
        }
        if (AbstractC14233.a) {
            AbstractC14233.a(AbstractC5752.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // l.AbstractC5752
    public final EnumC22761 m0() {
        return EnumC22761.INT_VALUE;
    }

    @Override // l.AbstractC5752
    public final InterfaceC8616 k0(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693, boolean z, IntFunction intFunction) {
        return AbstractC22686.J(abstractC5752, interfaceC20693, z);
    }

    @Override // l.AbstractC5752
    public final InterfaceC20693 t0(AbstractC5752 abstractC5752, Supplier supplier, boolean z) {
        return new C0908(abstractC5752, supplier, z);
    }

    @Override // l.AbstractC5752
    public final boolean l0(InterfaceC20693 interfaceC20693, InterfaceC19171 interfaceC19171) {
        IntConsumer c24034;
        boolean zF;
        InterfaceC18576 interfaceC18576U0 = u0(interfaceC20693);
        if (interfaceC19171 instanceof IntConsumer) {
            c24034 = (IntConsumer) interfaceC19171;
        } else {
            if (AbstractC14233.a) {
                AbstractC14233.a(AbstractC5752.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            C13638.requireNonNull(interfaceC19171);
            c24034 = new C24034(interfaceC19171, 1);
        }
        do {
            zF = interfaceC19171.f();
            if (zF) {
                break;
            }
        } while (interfaceC18576U0.tryAdvance(c24034));
        return zF;
    }

    @Override // l.AbstractC22686
    public final InterfaceC23280 c0(long j, IntFunction intFunction) {
        return AbstractC22686.X(j);
    }

    @Override // l.InterfaceC6124
    public final InterfaceC22104 iterator() {
        InterfaceC18576 interfaceC18576Spliterator = spliterator();
        C13638.requireNonNull(interfaceC18576Spliterator);
        return new C23985(interfaceC18576Spliterator);
    }

    @Override // l.AbstractC5752, l.InterfaceC6124
    public final InterfaceC18576 spliterator() {
        return u0(super.spliterator());
    }

    @Override // l.InterfaceC13514
    public final InterfaceC18796 asLongStream() {
        return new C6553(this, 0, 1);
    }

    @Override // l.InterfaceC13514
    public final InterfaceC19386 asDoubleStream() {
        return new C1614(this, 0, 1);
    }

    @Override // l.InterfaceC13514
    public final InterfaceC5046 boxed() {
        return new C22699(this, 0, new C13858(22), 1);
    }

    @Override // l.InterfaceC13514
    public final InterfaceC13514 map(IntUnaryOperator intUnaryOperator) {
        C13638.requireNonNull(intUnaryOperator);
        return new C2942(this, EnumC2970.p | EnumC2970.n, intUnaryOperator, 1);
    }

    @Override // l.InterfaceC13514
    public final InterfaceC5046 mapToObj(IntFunction intFunction) {
        C13638.requireNonNull(intFunction);
        return new C22699(this, EnumC2970.p | EnumC2970.n, intFunction, 1);
    }

    @Override // l.InterfaceC13514
    public final InterfaceC18796 mapToLong(IntToLongFunction intToLongFunction) {
        C13638.requireNonNull(intToLongFunction);
        return new C15727(this, EnumC2970.p | EnumC2970.n, intToLongFunction, 0);
    }

    @Override // l.InterfaceC13514
    public final InterfaceC19386 mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        C13638.requireNonNull(intToDoubleFunction);
        return new C15644(this, EnumC2970.p | EnumC2970.n, intToDoubleFunction, 4);
    }

    @Override // l.InterfaceC13514
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        C13638.requireNonNull(intBinaryOperator);
        return ((Integer) i0(new C19440(EnumC22761.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // l.InterfaceC13514
    public final InterfaceC13514 g(C11741 c11741) {
        C13638.requireNonNull(c11741);
        return new C2942(this, EnumC2970.p | EnumC2970.n | EnumC2970.t, c11741, 2);
    }

    @Override // l.InterfaceC13514
    public final C2347 reduce(IntBinaryOperator intBinaryOperator) {
        C13638.requireNonNull(intBinaryOperator);
        return (C2347) i0(new C6685(EnumC22761.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // l.InterfaceC13514
    public final InterfaceC13514 filter(IntPredicate intPredicate) {
        C13638.requireNonNull(intPredicate);
        return new C2942(this, EnumC2970.t, intPredicate, 3);
    }

    @Override // l.InterfaceC13514
    public final InterfaceC13514 peek(IntConsumer intConsumer) {
        C13638.requireNonNull(intConsumer);
        return new C2942(this, intConsumer);
    }

    @Override // l.InterfaceC13514
    public final InterfaceC13514 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC20092.f(this, 0L, j);
    }

    @Override // l.InterfaceC13514
    public final InterfaceC13514 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC20092.f(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // l.InterfaceC13514
    public final InterfaceC13514 takeWhile(IntPredicate intPredicate) {
        int i = AbstractC13402.a;
        C13638.requireNonNull(intPredicate);
        return new C1406(this, AbstractC13402.a, intPredicate);
    }

    @Override // l.InterfaceC13514
    public final InterfaceC13514 dropWhile(IntPredicate intPredicate) {
        int i = AbstractC13402.a;
        C13638.requireNonNull(intPredicate);
        return new C7869(this, AbstractC13402.b, intPredicate);
    }

    @Override // l.InterfaceC13514
    public final long count() {
        return ((Long) i0(new C7204(3))).longValue();
    }

    @Override // l.InterfaceC13514
    public final InterfaceC13514 distinct() {
        return ((AbstractC14295) boxed()).distinct().mapToInt(new C13858(21));
    }

    @Override // l.InterfaceC13514
    public final int sum() {
        return reduce(0, new C13858(26));
    }

    @Override // l.InterfaceC13514
    public final C2347 min() {
        return reduce(new C13858(23));
    }

    @Override // l.InterfaceC13514
    public final C2347 max() {
        return reduce(new C13858(27));
    }

    @Override // l.InterfaceC13514
    public final C16460 average() {
        long[] jArr = (long[]) collect(new C17821(14), new C13858(28), new C13858(29));
        long j = jArr[0];
        return j > 0 ? new C16460(jArr[1] / j) : C16460.c;
    }

    @Override // l.InterfaceC13514
    public final C11285 summaryStatistics() {
        return (C11285) collect(new C17821(2), new C13858(24), new C13858(25));
    }

    @Override // l.InterfaceC13514
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        C13638.requireNonNull(biConsumer);
        C20146 c20146 = new C20146(biConsumer, 1);
        C13638.requireNonNull(supplier);
        C13638.requireNonNull(objIntConsumer);
        C13638.requireNonNull(c20146);
        return i0(new C1746(EnumC22761.INT_VALUE, c20146, objIntConsumer, supplier, 4));
    }

    @Override // l.InterfaceC13514
    public final boolean anyMatch(IntPredicate intPredicate) {
        return ((Boolean) i0(AbstractC22686.a0(EnumC0120.ANY, intPredicate))).booleanValue();
    }

    @Override // l.InterfaceC13514
    public final boolean allMatch(IntPredicate intPredicate) {
        return ((Boolean) i0(AbstractC22686.a0(EnumC0120.ALL, intPredicate))).booleanValue();
    }

    @Override // l.InterfaceC13514
    public final boolean noneMatch(IntPredicate intPredicate) {
        return ((Boolean) i0(AbstractC22686.a0(EnumC0120.NONE, intPredicate))).booleanValue();
    }

    @Override // l.InterfaceC13514
    public final int[] toArray() {
        return (int[]) AbstractC22686.U((InterfaceC13036) j0(new C13858(20))).b();
    }
}
