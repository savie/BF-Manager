package l;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.᩺ۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC24007 extends AbstractC15470 implements InterfaceC20670 {
    @Override // l.InterfaceC20670
    public final InterfaceC20670 sorted() {
        return new C2880(this);
    }

    @Override // l.InterfaceC20670
    public final InterfaceC20670 distinct() {
        return new C16809(this, EnumC21614.m | EnumC21614.t);
    }

    @Override // l.InterfaceC20670
    public final C15867 min(Comparator comparator) {
        C17359.requireNonNull(comparator);
        return reduce(new C9328(comparator, 1));
    }

    @Override // l.InterfaceC20670
    public final C15867 findAny() {
        return (C15867) i0(C22515.d);
    }

    @Override // l.InterfaceC20670
    public final C15867 findFirst() {
        return (C15867) i0(C22515.c);
    }

    @Override // l.InterfaceC20670
    public final InterfaceC20670 sorted(Comparator comparator) {
        return new C2880(this, comparator);
    }

    @Override // l.InterfaceC20670
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        C17359.requireNonNull(biFunction);
        C17359.requireNonNull(binaryOperator);
        return i0(new C4240(EnumC14154.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // l.InterfaceC20670
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        C17359.requireNonNull(binaryOperator);
        C17359.requireNonNull(binaryOperator);
        return i0(new C4240(EnumC14154.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        C17359.requireNonNull(consumer);
        i0(new C17555(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        C17359.requireNonNull(consumer);
        i0(new C17555(consumer, true));
    }

    @Override // l.InterfaceC20670
    public final C15867 max(Comparator comparator) {
        C17359.requireNonNull(comparator);
        return reduce(new C9328(comparator, 0));
    }

    @Override // l.AbstractC15470
    public final EnumC14154 m0() {
        return EnumC14154.REFERENCE;
    }

    @Override // l.InterfaceC20670
    public final C15867 reduce(BinaryOperator binaryOperator) {
        C17359.requireNonNull(binaryOperator);
        return (C15867) i0(new C7267(EnumC14154.REFERENCE, binaryOperator, 2));
    }

    @Override // l.AbstractC15470
    public final InterfaceC13409 k0(AbstractC15470 abstractC15470, InterfaceC8409 interfaceC8409, boolean z, IntFunction intFunction) {
        return AbstractC13956.H(abstractC15470, interfaceC8409, z, intFunction);
    }

    @Override // l.AbstractC15470
    public final InterfaceC8409 t0(AbstractC15470 abstractC15470, Supplier supplier, boolean z) {
        return new C13563(abstractC15470, supplier, z);
    }

    @Override // l.AbstractC15470
    public final boolean l0(InterfaceC8409 interfaceC8409, InterfaceC15143 interfaceC15143) {
        boolean zF;
        do {
            zF = interfaceC15143.f();
            if (zF) {
                break;
            }
        } while (interfaceC8409.tryAdvance(interfaceC15143));
        return zF;
    }

    @Override // l.AbstractC13956
    public final InterfaceC4262 c0(long j, IntFunction intFunction) {
        return AbstractC13956.G(j, intFunction);
    }

    @Override // l.InterfaceC19924
    public final Iterator iterator() {
        return C13629.iterator(spliterator());
    }

    @Override // l.InterfaceC20670
    public final InterfaceC20670 filter(Predicate predicate) {
        C17359.requireNonNull(predicate);
        return new C24841(this, EnumC21614.t, predicate, 4);
    }

    @Override // l.InterfaceC20670
    public final InterfaceC20670 map(Function function) {
        C17359.requireNonNull(function);
        return new C14680(this, EnumC21614.p | EnumC21614.n, function, 0);
    }

    @Override // l.InterfaceC20670
    public final InterfaceC17686 mapToInt(ToIntFunction toIntFunction) {
        C17359.requireNonNull(toIntFunction);
        return new C13651(this, EnumC21614.p | EnumC21614.n, toIntFunction, 4);
    }

    @Override // l.InterfaceC20670
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        C17359.requireNonNull(supplier);
        C17359.requireNonNull(biConsumer);
        C17359.requireNonNull(biConsumer2);
        return i0(new C4240(EnumC14154.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // l.InterfaceC20670
    public final InterfaceC16194 mapToLong(ToLongFunction toLongFunction) {
        C17359.requireNonNull(toLongFunction);
        return new C14922(this, EnumC21614.p | EnumC21614.n, toLongFunction, 6);
    }

    @Override // l.InterfaceC20670
    public final InterfaceC20648 mapToDouble(ToDoubleFunction toDoubleFunction) {
        C17359.requireNonNull(toDoubleFunction);
        return new C14397(this, EnumC21614.p | EnumC21614.n, toDoubleFunction, 5);
    }

    @Override // l.InterfaceC20670
    public final long count() {
        return ((Long) i0(new C2223(2))).longValue();
    }

    @Override // l.InterfaceC20670
    public final InterfaceC20670 flatMap(Function function) {
        C17359.requireNonNull(function);
        return new C14680(this, EnumC21614.p | EnumC21614.n | EnumC21614.t, function, 1);
    }

    @Override // l.InterfaceC20670
    public final InterfaceC17686 flatMapToInt(Function function) {
        C17359.requireNonNull(function);
        return new C13651(this, EnumC21614.p | EnumC21614.n | EnumC21614.t, function, 5);
    }

    @Override // l.InterfaceC20670
    public final InterfaceC20648 g(C15801 c15801) {
        C17359.requireNonNull(c15801);
        return new C14397(this, EnumC21614.p | EnumC21614.n | EnumC21614.t, c15801, 6);
    }

    @Override // l.InterfaceC20670
    public final Object collect(InterfaceC5754 interfaceC5754) {
        Object objI0;
        if (!this.h.r || !interfaceC5754.characteristics().contains(EnumC13211.CONCURRENT) || (EnumC21614.ORDERED.p(this.m) && !interfaceC5754.characteristics().contains(EnumC13211.UNORDERED))) {
            Supplier supplier = ((InterfaceC5754) C17359.requireNonNull(interfaceC5754)).supplier();
            objI0 = i0(new C9088(EnumC14154.REFERENCE, interfaceC5754.combiner(), interfaceC5754.accumulator(), supplier, interfaceC5754));
        } else {
            objI0 = interfaceC5754.supplier().get();
            forEach(new C15602(7, interfaceC5754.accumulator(), objI0));
        }
        return interfaceC5754.characteristics().contains(EnumC13211.IDENTITY_FINISH) ? objI0 : interfaceC5754.finisher().apply(objI0);
    }

    @Override // l.InterfaceC20670
    public final InterfaceC16194 k(C15801 c15801) {
        C17359.requireNonNull(c15801);
        return new C14922(this, EnumC21614.p | EnumC21614.n | EnumC21614.t, c15801, 5);
    }

    @Override // l.InterfaceC20670
    public final InterfaceC20670 peek(Consumer consumer) {
        C17359.requireNonNull(consumer);
        return new C24841(this, consumer);
    }

    @Override // l.InterfaceC20670
    public final InterfaceC20670 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC16918.h(this, 0L, j);
    }

    @Override // l.InterfaceC20670
    public final InterfaceC20670 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC16918.h(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // l.InterfaceC20670
    public final InterfaceC20670 takeWhile(Predicate predicate) {
        int i = AbstractC2990.a;
        C17359.requireNonNull(predicate);
        return new C2465(this, AbstractC2990.a, predicate, 0);
    }

    @Override // l.InterfaceC20670
    public final InterfaceC20670 dropWhile(Predicate predicate) {
        int i = AbstractC2990.a;
        C17359.requireNonNull(predicate);
        return new C2465(this, AbstractC2990.b, predicate, 1);
    }

    @Override // l.InterfaceC20670
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC13956.S(j0(intFunction), intFunction).m(intFunction);
    }

    @Override // l.InterfaceC20670
    public final Object[] toArray() {
        return toArray(new C13189(19));
    }

    @Override // l.InterfaceC20670
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) i0(AbstractC13956.d0(EnumC17381.ANY, predicate))).booleanValue();
    }

    @Override // l.InterfaceC20670
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) i0(AbstractC13956.d0(EnumC17381.ALL, predicate))).booleanValue();
    }

    @Override // l.InterfaceC20670
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) i0(AbstractC13956.d0(EnumC17381.NONE, predicate))).booleanValue();
    }

    @Override // l.InterfaceC20670
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }
}
