package l;

import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۗۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3123 extends AbstractC15470 implements InterfaceC16194 {
    @Override // l.InterfaceC16194
    public final C19487 findAny() {
        return (C19487) i0(C19376.d);
    }

    @Override // l.InterfaceC16194
    public final C19487 findFirst() {
        return (C19487) i0(C19376.c);
    }

    @Override // l.InterfaceC16194
    public final InterfaceC16194 sorted() {
        return new C24510(this, EnumC21614.q | EnumC21614.o);
    }

    @Override // l.InterfaceC16194
    public void forEach(LongConsumer longConsumer) {
        C17359.requireNonNull(longConsumer);
        i0(new C22031(longConsumer, false));
    }

    @Override // l.InterfaceC16194
    public void forEachOrdered(LongConsumer longConsumer) {
        C17359.requireNonNull(longConsumer);
        i0(new C22031(longConsumer, true));
    }

    public static InterfaceC9900 u0(InterfaceC8409 interfaceC8409) {
        if (interfaceC8409 instanceof InterfaceC9900) {
            return (InterfaceC9900) interfaceC8409;
        }
        if (AbstractC24095.a) {
            AbstractC24095.a(AbstractC15470.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // l.AbstractC15470
    public final EnumC14154 m0() {
        return EnumC14154.LONG_VALUE;
    }

    @Override // l.AbstractC15470
    public final InterfaceC13409 k0(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409, boolean z, IntFunction intFunction) {
        return AbstractC13956.K(abstractC15470, interfaceC8409, z);
    }

    @Override // l.AbstractC15470
    public final InterfaceC8409 t0(AbstractC15470 abstractC15470, Supplier supplier, boolean z) {
        return new C12685(abstractC15470, supplier, z);
    }

    @Override // l.AbstractC15470
    public final boolean l0(InterfaceC8409 interfaceC8409, InterfaceC15143 interfaceC15143) {
        LongConsumer c3758;
        boolean zF;
        InterfaceC9900 interfaceC9900U0 = u0(interfaceC8409);
        if (interfaceC15143 instanceof LongConsumer) {
            c3758 = (LongConsumer) interfaceC15143;
        } else {
            if (AbstractC24095.a) {
                AbstractC24095.a(AbstractC15470.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            C17359.requireNonNull(interfaceC15143);
            c3758 = new C3758(interfaceC15143, 1);
        }
        do {
            zF = interfaceC15143.f();
            if (zF) {
                break;
            }
        } while (interfaceC9900U0.tryAdvance(c3758));
        return zF;
    }

    @Override // l.AbstractC13956
    public final InterfaceC4262 c0(long j, IntFunction intFunction) {
        return AbstractC13956.Y(j);
    }

    @Override // l.InterfaceC19924
    public final InterfaceC6173 iterator() {
        InterfaceC9900 interfaceC9900Spliterator = spliterator();
        C17359.requireNonNull(interfaceC9900Spliterator);
        return new C24775(interfaceC9900Spliterator);
    }

    @Override // l.AbstractC15470, l.InterfaceC19924
    public final InterfaceC9900 spliterator() {
        return u0(super.spliterator());
    }

    @Override // l.InterfaceC16194
    public final InterfaceC20648 asDoubleStream() {
        return new C8956(this, EnumC21614.n, 2);
    }

    @Override // l.InterfaceC16194
    public final InterfaceC20670 boxed() {
        return new C24841(this, 0, new C13189(5), 2);
    }

    @Override // l.InterfaceC16194
    public final InterfaceC16194 map(LongUnaryOperator longUnaryOperator) {
        C17359.requireNonNull(longUnaryOperator);
        return new C14922(this, EnumC21614.p | EnumC21614.n, longUnaryOperator, 1);
    }

    @Override // l.InterfaceC16194
    public final InterfaceC20670 mapToObj(LongFunction longFunction) {
        C17359.requireNonNull(longFunction);
        return new C24841(this, EnumC21614.p | EnumC21614.n, longFunction, 2);
    }

    @Override // l.InterfaceC16194
    public final InterfaceC17686 l() {
        C17359.requireNonNull(null);
        return new C6940(this, EnumC21614.p | EnumC21614.n, 2);
    }

    @Override // l.InterfaceC16194
    public final InterfaceC20648 c() {
        C17359.requireNonNull(null);
        return new C8956(this, EnumC21614.p | EnumC21614.n, 3);
    }

    @Override // l.InterfaceC16194
    public final InterfaceC16194 a(C3249 c3249) {
        C17359.requireNonNull(c3249);
        return new C14922(this, EnumC21614.p | EnumC21614.n | EnumC21614.t, c3249, 2);
    }

    @Override // l.InterfaceC16194
    public final InterfaceC16194 filter(LongPredicate longPredicate) {
        C17359.requireNonNull(longPredicate);
        return new C14922(this, EnumC21614.t, longPredicate, 3);
    }

    @Override // l.InterfaceC16194
    public final InterfaceC16194 peek(LongConsumer longConsumer) {
        C17359.requireNonNull(longConsumer);
        return new C14922(this, longConsumer);
    }

    @Override // l.InterfaceC16194
    public final InterfaceC16194 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC16918.g(this, 0L, j);
    }

    @Override // l.InterfaceC16194
    public final InterfaceC16194 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC16918.g(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // l.InterfaceC16194
    public final InterfaceC16194 takeWhile(LongPredicate longPredicate) {
        int i = AbstractC2990.a;
        C17359.requireNonNull(longPredicate);
        return new C19200(this, AbstractC2990.a, longPredicate);
    }

    @Override // l.InterfaceC16194
    public final InterfaceC16194 dropWhile(LongPredicate longPredicate) {
        int i = AbstractC2990.a;
        C17359.requireNonNull(longPredicate);
        return new C23632(this, AbstractC2990.b, longPredicate);
    }

    @Override // l.InterfaceC16194
    public final InterfaceC16194 distinct() {
        return ((AbstractC24007) boxed()).distinct().mapToLong(new C13189(2));
    }

    @Override // l.InterfaceC16194
    public final long sum() {
        return reduce(0L, new C13189(9));
    }

    @Override // l.InterfaceC16194
    public final C19487 min() {
        return reduce(new C13189(1));
    }

    @Override // l.InterfaceC16194
    public final C19487 max() {
        return reduce(new C13189(8));
    }

    @Override // l.InterfaceC16194
    public final C21725 average() {
        long[] jArr = (long[]) collect(new C8189(15), new C13189(6), new C13189(7));
        long j = jArr[0];
        return j > 0 ? new C21725(jArr[1] / j) : C21725.c;
    }

    @Override // l.InterfaceC16194
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        C17359.requireNonNull(longBinaryOperator);
        return ((Long) i0(new C25168(EnumC14154.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // l.InterfaceC16194
    public final C11348 summaryStatistics() {
        return (C11348) collect(new C8189(4), new C13189(0), new C13189(3));
    }

    @Override // l.InterfaceC16194
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        C17359.requireNonNull(biConsumer);
        C21285 c21285 = new C21285(biConsumer, 2);
        C17359.requireNonNull(supplier);
        C17359.requireNonNull(objLongConsumer);
        C17359.requireNonNull(c21285);
        return i0(new C4240(EnumC14154.LONG_VALUE, c21285, objLongConsumer, supplier, 0));
    }

    @Override // l.InterfaceC16194
    public final boolean anyMatch(LongPredicate longPredicate) {
        return ((Boolean) i0(AbstractC13956.b0(EnumC17381.ANY, longPredicate))).booleanValue();
    }

    @Override // l.InterfaceC16194
    public final boolean allMatch(LongPredicate longPredicate) {
        return ((Boolean) i0(AbstractC13956.b0(EnumC17381.ALL, longPredicate))).booleanValue();
    }

    @Override // l.InterfaceC16194
    public final C19487 reduce(LongBinaryOperator longBinaryOperator) {
        C17359.requireNonNull(longBinaryOperator);
        return (C19487) i0(new C7267(EnumC14154.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // l.InterfaceC16194
    public final boolean noneMatch(LongPredicate longPredicate) {
        return ((Boolean) i0(AbstractC13956.b0(EnumC17381.NONE, longPredicate))).booleanValue();
    }

    @Override // l.InterfaceC16194
    public final long[] toArray() {
        return (long[]) AbstractC13956.V((InterfaceC6478) j0(new C13189(4))).b();
    }

    @Override // l.InterfaceC16194
    public final long count() {
        return ((Long) i0(new C2223(0))).longValue();
    }
}
