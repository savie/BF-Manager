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

/* JADX INFO: renamed from: l.ۡܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9503 extends AbstractC15470 implements InterfaceC17686 {
    @Override // l.InterfaceC17686
    public final C23327 findAny() {
        return (C23327) i0(C3714.d);
    }

    @Override // l.InterfaceC17686
    public final C23327 findFirst() {
        return (C23327) i0(C3714.c);
    }

    @Override // l.InterfaceC17686
    public final InterfaceC17686 sorted() {
        return new C2135(this, EnumC21614.q | EnumC21614.o);
    }

    public void forEach(IntConsumer intConsumer) {
        C17359.requireNonNull(intConsumer);
        i0(new C0643(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        C17359.requireNonNull(intConsumer);
        i0(new C0643(intConsumer, true));
    }

    public static InterfaceC7664 u0(InterfaceC8409 interfaceC8409) {
        if (interfaceC8409 instanceof InterfaceC7664) {
            return (InterfaceC7664) interfaceC8409;
        }
        if (AbstractC24095.a) {
            AbstractC24095.a(AbstractC15470.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // l.AbstractC15470
    public final EnumC14154 m0() {
        return EnumC14154.INT_VALUE;
    }

    @Override // l.AbstractC15470
    public final InterfaceC13409 k0(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409, boolean z, IntFunction intFunction) {
        return AbstractC13956.J(abstractC15470, interfaceC8409, z);
    }

    @Override // l.AbstractC15470
    public final InterfaceC8409 t0(AbstractC15470 abstractC15470, Supplier supplier, boolean z) {
        return new C9176(abstractC15470, supplier, z);
    }

    @Override // l.AbstractC15470
    public final boolean l0(InterfaceC8409 interfaceC8409, InterfaceC15143 interfaceC15143) {
        IntConsumer c13453;
        boolean zF;
        InterfaceC7664 interfaceC7664U0 = u0(interfaceC8409);
        if (interfaceC15143 instanceof IntConsumer) {
            c13453 = (IntConsumer) interfaceC15143;
        } else {
            if (AbstractC24095.a) {
                AbstractC24095.a(AbstractC15470.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            C17359.requireNonNull(interfaceC15143);
            c13453 = new C13453(interfaceC15143, 1);
        }
        do {
            zF = interfaceC15143.f();
            if (zF) {
                break;
            }
        } while (interfaceC7664U0.tryAdvance(c13453));
        return zF;
    }

    @Override // l.AbstractC13956
    public final InterfaceC4262 c0(long j, IntFunction intFunction) {
        return AbstractC13956.X(j);
    }

    @Override // l.InterfaceC19924
    public final InterfaceC20343 iterator() {
        InterfaceC7664 interfaceC7664Spliterator = spliterator();
        C17359.requireNonNull(interfaceC7664Spliterator);
        return new C1654(interfaceC7664Spliterator);
    }

    @Override // l.AbstractC15470, l.InterfaceC19924
    public final InterfaceC7664 spliterator() {
        return u0(super.spliterator());
    }

    @Override // l.InterfaceC17686
    public final InterfaceC16194 asLongStream() {
        return new C11939(this, 0, 1);
    }

    @Override // l.InterfaceC17686
    public final InterfaceC20648 asDoubleStream() {
        return new C8956(this, 0, 1);
    }

    @Override // l.InterfaceC17686
    public final InterfaceC20670 boxed() {
        return new C24841(this, 0, new C22272(22), 1);
    }

    @Override // l.InterfaceC17686
    public final InterfaceC17686 map(IntUnaryOperator intUnaryOperator) {
        C17359.requireNonNull(intUnaryOperator);
        return new C13651(this, EnumC21614.p | EnumC21614.n, intUnaryOperator, 1);
    }

    @Override // l.InterfaceC17686
    public final InterfaceC20670 mapToObj(IntFunction intFunction) {
        C17359.requireNonNull(intFunction);
        return new C24841(this, EnumC21614.p | EnumC21614.n, intFunction, 1);
    }

    @Override // l.InterfaceC17686
    public final InterfaceC16194 mapToLong(IntToLongFunction intToLongFunction) {
        C17359.requireNonNull(intToLongFunction);
        return new C14922(this, EnumC21614.p | EnumC21614.n, intToLongFunction, 0);
    }

    @Override // l.InterfaceC17686
    public final InterfaceC20648 mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        C17359.requireNonNull(intToDoubleFunction);
        return new C14397(this, EnumC21614.p | EnumC21614.n, intToDoubleFunction, 4);
    }

    @Override // l.InterfaceC17686
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        C17359.requireNonNull(intBinaryOperator);
        return ((Integer) i0(new C15317(EnumC14154.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // l.InterfaceC17686
    public final InterfaceC17686 f(C11083 c11083) {
        C17359.requireNonNull(c11083);
        return new C13651(this, EnumC21614.p | EnumC21614.n | EnumC21614.t, c11083, 2);
    }

    @Override // l.InterfaceC17686
    public final C23327 reduce(IntBinaryOperator intBinaryOperator) {
        C17359.requireNonNull(intBinaryOperator);
        return (C23327) i0(new C7267(EnumC14154.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // l.InterfaceC17686
    public final InterfaceC17686 filter(IntPredicate intPredicate) {
        C17359.requireNonNull(intPredicate);
        return new C13651(this, EnumC21614.t, intPredicate, 3);
    }

    @Override // l.InterfaceC17686
    public final InterfaceC17686 peek(IntConsumer intConsumer) {
        C17359.requireNonNull(intConsumer);
        return new C13651(this, intConsumer);
    }

    @Override // l.InterfaceC17686
    public final InterfaceC17686 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC16918.f(this, 0L, j);
    }

    @Override // l.InterfaceC17686
    public final InterfaceC17686 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC16918.f(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // l.InterfaceC17686
    public final InterfaceC17686 takeWhile(IntPredicate intPredicate) {
        int i = AbstractC2990.a;
        C17359.requireNonNull(intPredicate);
        return new C9701(this, AbstractC2990.a, intPredicate);
    }

    @Override // l.InterfaceC17686
    public final InterfaceC17686 dropWhile(IntPredicate intPredicate) {
        int i = AbstractC2990.a;
        C17359.requireNonNull(intPredicate);
        return new C19946(this, AbstractC2990.b, intPredicate);
    }

    @Override // l.InterfaceC17686
    public final long count() {
        return ((Long) i0(new C2223(3))).longValue();
    }

    @Override // l.InterfaceC17686
    public final InterfaceC17686 distinct() {
        return ((AbstractC24007) boxed()).distinct().mapToInt(new C22272(21));
    }

    @Override // l.InterfaceC17686
    public final int sum() {
        return reduce(0, new C22272(26));
    }

    @Override // l.InterfaceC17686
    public final C23327 min() {
        return reduce(new C22272(23));
    }

    @Override // l.InterfaceC17686
    public final C23327 max() {
        return reduce(new C22272(27));
    }

    @Override // l.InterfaceC17686
    public final C21725 average() {
        long[] jArr = (long[]) collect(new C8189(14), new C22272(28), new C22272(29));
        long j = jArr[0];
        return j > 0 ? new C21725(jArr[1] / j) : C21725.c;
    }

    @Override // l.InterfaceC17686
    public final C5383 summaryStatistics() {
        return (C5383) collect(new C8189(2), new C22272(24), new C22272(25));
    }

    @Override // l.InterfaceC17686
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        C17359.requireNonNull(biConsumer);
        C21285 c21285 = new C21285(biConsumer, 1);
        C17359.requireNonNull(supplier);
        C17359.requireNonNull(objIntConsumer);
        C17359.requireNonNull(c21285);
        return i0(new C4240(EnumC14154.INT_VALUE, c21285, objIntConsumer, supplier, 4));
    }

    @Override // l.InterfaceC17686
    public final boolean anyMatch(IntPredicate intPredicate) {
        return ((Boolean) i0(AbstractC13956.a0(EnumC17381.ANY, intPredicate))).booleanValue();
    }

    @Override // l.InterfaceC17686
    public final boolean allMatch(IntPredicate intPredicate) {
        return ((Boolean) i0(AbstractC13956.a0(EnumC17381.ALL, intPredicate))).booleanValue();
    }

    @Override // l.InterfaceC17686
    public final boolean noneMatch(IntPredicate intPredicate) {
        return ((Boolean) i0(AbstractC13956.a0(EnumC17381.NONE, intPredicate))).booleanValue();
    }

    @Override // l.InterfaceC17686
    public final int[] toArray() {
        return (int[]) AbstractC13956.U((InterfaceC2792) j0(new C22272(20))).b();
    }
}
