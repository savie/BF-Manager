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

/* JADX INFO: renamed from: l.۠ۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7944 extends AbstractC5752 implements InterfaceC18796 {
    @Override // l.InterfaceC18796
    public final C5876 findAny() {
        return (C5876) i0(C17082.d);
    }

    @Override // l.InterfaceC18796
    public final C5876 findFirst() {
        return (C5876) i0(C17082.c);
    }

    @Override // l.InterfaceC18796
    public final InterfaceC18796 sorted() {
        return new C14564(this, EnumC2970.q | EnumC2970.o);
    }

    @Override // l.InterfaceC18796
    public void forEach(LongConsumer longConsumer) {
        C13638.requireNonNull(longConsumer);
        i0(new C13796(longConsumer, false));
    }

    @Override // l.InterfaceC18796
    public void forEachOrdered(LongConsumer longConsumer) {
        C13638.requireNonNull(longConsumer);
        i0(new C13796(longConsumer, true));
    }

    public static InterfaceC19282 u0(InterfaceC20693 interfaceC20693) {
        if (interfaceC20693 instanceof InterfaceC19282) {
            return (InterfaceC19282) interfaceC20693;
        }
        if (AbstractC14233.a) {
            AbstractC14233.a(AbstractC5752.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // l.AbstractC5752
    public final EnumC22761 m0() {
        return EnumC22761.LONG_VALUE;
    }

    @Override // l.AbstractC5752
    public final InterfaceC8616 k0(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693, boolean z, IntFunction intFunction) {
        return AbstractC22686.K(abstractC5752, interfaceC20693, z);
    }

    @Override // l.AbstractC5752
    public final InterfaceC20693 t0(AbstractC5752 abstractC5752, Supplier supplier, boolean z) {
        return new C10788(abstractC5752, supplier, z);
    }

    @Override // l.AbstractC5752
    public final boolean l0(InterfaceC20693 interfaceC20693, InterfaceC19171 interfaceC19171) {
        LongConsumer c5418;
        boolean zF;
        InterfaceC19282 interfaceC19282U0 = u0(interfaceC20693);
        if (interfaceC19171 instanceof LongConsumer) {
            c5418 = (LongConsumer) interfaceC19171;
        } else {
            if (AbstractC14233.a) {
                AbstractC14233.a(AbstractC5752.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            C13638.requireNonNull(interfaceC19171);
            c5418 = new C5418(interfaceC19171, 1);
        }
        do {
            zF = interfaceC19171.f();
            if (zF) {
                break;
            }
        } while (interfaceC19282U0.tryAdvance(c5418));
        return zF;
    }

    @Override // l.AbstractC22686
    public final InterfaceC23280 c0(long j, IntFunction intFunction) {
        return AbstractC22686.Y(j);
    }

    @Override // l.InterfaceC6124
    public final InterfaceC12932 iterator() {
        InterfaceC19282 interfaceC19282Spliterator = spliterator();
        C13638.requireNonNull(interfaceC19282Spliterator);
        return new C2111(interfaceC19282Spliterator);
    }

    @Override // l.AbstractC5752, l.InterfaceC6124
    public final InterfaceC19282 spliterator() {
        return u0(super.spliterator());
    }

    @Override // l.InterfaceC18796
    public final InterfaceC19386 asDoubleStream() {
        return new C1614(this, EnumC2970.n, 2);
    }

    @Override // l.InterfaceC18796
    public final InterfaceC5046 boxed() {
        return new C22699(this, 0, new C1040(5), 2);
    }

    @Override // l.InterfaceC18796
    public final InterfaceC18796 map(LongUnaryOperator longUnaryOperator) {
        C13638.requireNonNull(longUnaryOperator);
        return new C15727(this, EnumC2970.p | EnumC2970.n, longUnaryOperator, 1);
    }

    @Override // l.InterfaceC18796
    public final InterfaceC5046 mapToObj(LongFunction longFunction) {
        C13638.requireNonNull(longFunction);
        return new C22699(this, EnumC2970.p | EnumC2970.n, longFunction, 2);
    }

    @Override // l.InterfaceC18796
    public final InterfaceC13514 k() {
        C13638.requireNonNull(null);
        return new C9294(this, EnumC2970.p | EnumC2970.n, 2);
    }

    @Override // l.InterfaceC18796
    public final InterfaceC19386 c() {
        C13638.requireNonNull(null);
        return new C1614(this, EnumC2970.p | EnumC2970.n, 3);
    }

    @Override // l.InterfaceC18796
    public final InterfaceC18796 a(C5295 c5295) {
        C13638.requireNonNull(c5295);
        return new C15727(this, EnumC2970.p | EnumC2970.n | EnumC2970.t, c5295, 2);
    }

    @Override // l.InterfaceC18796
    public final InterfaceC18796 filter(LongPredicate longPredicate) {
        C13638.requireNonNull(longPredicate);
        return new C15727(this, EnumC2970.t, longPredicate, 3);
    }

    @Override // l.InterfaceC18796
    public final InterfaceC18796 peek(LongConsumer longConsumer) {
        C13638.requireNonNull(longConsumer);
        return new C15727(this, longConsumer);
    }

    @Override // l.InterfaceC18796
    public final InterfaceC18796 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC20092.g(this, 0L, j);
    }

    @Override // l.InterfaceC18796
    public final InterfaceC18796 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC20092.g(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // l.InterfaceC18796
    public final InterfaceC18796 takeWhile(LongPredicate longPredicate) {
        int i = AbstractC13402.a;
        C13638.requireNonNull(longPredicate);
        return new C2451(this, AbstractC13402.a, longPredicate);
    }

    @Override // l.InterfaceC18796
    public final InterfaceC18796 dropWhile(LongPredicate longPredicate) {
        int i = AbstractC13402.a;
        C13638.requireNonNull(longPredicate);
        return new C12331(this, AbstractC13402.b, longPredicate);
    }

    @Override // l.InterfaceC18796
    public final InterfaceC18796 distinct() {
        return ((AbstractC14295) boxed()).distinct().mapToLong(new C1040(2));
    }

    @Override // l.InterfaceC18796
    public final long sum() {
        return reduce(0L, new C1040(9));
    }

    @Override // l.InterfaceC18796
    public final C5876 min() {
        return reduce(new C1040(1));
    }

    @Override // l.InterfaceC18796
    public final C5876 max() {
        return reduce(new C1040(8));
    }

    @Override // l.InterfaceC18796
    public final C16460 average() {
        long[] jArr = (long[]) collect(new C17821(15), new C1040(6), new C1040(7));
        long j = jArr[0];
        return j > 0 ? new C16460(jArr[1] / j) : C16460.c;
    }

    @Override // l.InterfaceC18796
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        C13638.requireNonNull(longBinaryOperator);
        return ((Long) i0(new C15631(EnumC22761.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // l.InterfaceC18796
    public final C14813 summaryStatistics() {
        return (C14813) collect(new C17821(4), new C1040(0), new C1040(3));
    }

    @Override // l.InterfaceC18796
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        C13638.requireNonNull(biConsumer);
        C20146 c20146 = new C20146(biConsumer, 2);
        C13638.requireNonNull(supplier);
        C13638.requireNonNull(objLongConsumer);
        C13638.requireNonNull(c20146);
        return i0(new C1746(EnumC22761.LONG_VALUE, c20146, objLongConsumer, supplier, 0));
    }

    @Override // l.InterfaceC18796
    public final boolean anyMatch(LongPredicate longPredicate) {
        return ((Boolean) i0(AbstractC22686.b0(EnumC0120.ANY, longPredicate))).booleanValue();
    }

    @Override // l.InterfaceC18796
    public final boolean allMatch(LongPredicate longPredicate) {
        return ((Boolean) i0(AbstractC22686.b0(EnumC0120.ALL, longPredicate))).booleanValue();
    }

    @Override // l.InterfaceC18796
    public final C5876 reduce(LongBinaryOperator longBinaryOperator) {
        C13638.requireNonNull(longBinaryOperator);
        return (C5876) i0(new C6685(EnumC22761.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // l.InterfaceC18796
    public final boolean noneMatch(LongPredicate longPredicate) {
        return ((Boolean) i0(AbstractC22686.b0(EnumC0120.NONE, longPredicate))).booleanValue();
    }

    @Override // l.InterfaceC18796
    public final long[] toArray() {
        return (long[]) AbstractC22686.V((InterfaceC23620) j0(new C1040(4))).b();
    }

    @Override // l.InterfaceC18796
    public final long count() {
        return ((Long) i0(new C7204(0))).longValue();
    }
}
