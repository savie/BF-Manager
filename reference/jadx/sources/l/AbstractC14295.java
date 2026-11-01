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

/* JADX INFO: renamed from: l.ܳۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC14295 extends AbstractC5752 implements InterfaceC5046 {
    @Override // l.InterfaceC5046
    public final InterfaceC5046 sorted() {
        return new C13090(this);
    }

    @Override // l.InterfaceC5046
    public final InterfaceC5046 distinct() {
        return new C15207(this, EnumC2970.m | EnumC2970.t);
    }

    @Override // l.InterfaceC5046
    public final C11521 min(Comparator comparator) {
        C13638.requireNonNull(comparator);
        return reduce(new C10629(comparator, 1));
    }

    @Override // l.InterfaceC5046
    public final C11521 findAny() {
        return (C11521) i0(C2298.d);
    }

    @Override // l.InterfaceC5046
    public final C11521 findFirst() {
        return (C11521) i0(C2298.c);
    }

    @Override // l.InterfaceC5046
    public final InterfaceC5046 sorted(Comparator comparator) {
        return new C13090(this, comparator);
    }

    @Override // l.InterfaceC5046
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        C13638.requireNonNull(biFunction);
        C13638.requireNonNull(binaryOperator);
        return i0(new C1746(EnumC22761.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // l.InterfaceC5046
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        C13638.requireNonNull(binaryOperator);
        C13638.requireNonNull(binaryOperator);
        return i0(new C1746(EnumC22761.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        C13638.requireNonNull(consumer);
        i0(new C21556(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        C13638.requireNonNull(consumer);
        i0(new C21556(consumer, true));
    }

    @Override // l.InterfaceC5046
    public final C11521 max(Comparator comparator) {
        C13638.requireNonNull(comparator);
        return reduce(new C10629(comparator, 0));
    }

    @Override // l.AbstractC5752
    public final EnumC22761 m0() {
        return EnumC22761.REFERENCE;
    }

    @Override // l.InterfaceC5046
    public final C11521 reduce(BinaryOperator binaryOperator) {
        C13638.requireNonNull(binaryOperator);
        return (C11521) i0(new C6685(EnumC22761.REFERENCE, binaryOperator, 2));
    }

    @Override // l.AbstractC5752
    public final InterfaceC8616 k0(AbstractC5752 abstractC5752, InterfaceC20693 interfaceC20693, boolean z, IntFunction intFunction) {
        return AbstractC22686.H(abstractC5752, interfaceC20693, z, intFunction);
    }

    @Override // l.AbstractC5752
    public final InterfaceC20693 t0(AbstractC5752 abstractC5752, Supplier supplier, boolean z) {
        return new C23030(abstractC5752, supplier, z);
    }

    @Override // l.AbstractC5752
    public final boolean l0(InterfaceC20693 interfaceC20693, InterfaceC19171 interfaceC19171) {
        boolean zF;
        do {
            zF = interfaceC19171.f();
            if (zF) {
                break;
            }
        } while (interfaceC20693.tryAdvance(interfaceC19171));
        return zF;
    }

    @Override // l.AbstractC22686
    public final InterfaceC23280 c0(long j, IntFunction intFunction) {
        return AbstractC22686.G(j, intFunction);
    }

    @Override // l.InterfaceC6124
    public final Iterator iterator() {
        return C19988.iterator(spliterator());
    }

    @Override // l.InterfaceC5046
    public final InterfaceC5046 filter(Predicate predicate) {
        C13638.requireNonNull(predicate);
        return new C22699(this, EnumC2970.t, predicate, 4);
    }

    @Override // l.InterfaceC5046
    public final InterfaceC5046 map(Function function) {
        C13638.requireNonNull(function);
        return new C9509(this, EnumC2970.p | EnumC2970.n, function, 0);
    }

    @Override // l.InterfaceC5046
    public final InterfaceC13514 mapToInt(ToIntFunction toIntFunction) {
        C13638.requireNonNull(toIntFunction);
        return new C2942(this, EnumC2970.p | EnumC2970.n, toIntFunction, 4);
    }

    @Override // l.InterfaceC5046
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        C13638.requireNonNull(supplier);
        C13638.requireNonNull(biConsumer);
        C13638.requireNonNull(biConsumer2);
        return i0(new C1746(EnumC22761.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // l.InterfaceC5046
    public final InterfaceC18796 mapToLong(ToLongFunction toLongFunction) {
        C13638.requireNonNull(toLongFunction);
        return new C15727(this, EnumC2970.p | EnumC2970.n, toLongFunction, 6);
    }

    @Override // l.InterfaceC5046
    public final InterfaceC19386 mapToDouble(ToDoubleFunction toDoubleFunction) {
        C13638.requireNonNull(toDoubleFunction);
        return new C15644(this, EnumC2970.p | EnumC2970.n, toDoubleFunction, 5);
    }

    @Override // l.InterfaceC5046
    public final long count() {
        return ((Long) i0(new C7204(2))).longValue();
    }

    @Override // l.InterfaceC5046
    public final InterfaceC5046 flatMap(Function function) {
        C13638.requireNonNull(function);
        return new C9509(this, EnumC2970.p | EnumC2970.n | EnumC2970.t, function, 1);
    }

    @Override // l.InterfaceC5046
    public final InterfaceC13514 flatMapToInt(Function function) {
        C13638.requireNonNull(function);
        return new C2942(this, EnumC2970.p | EnumC2970.n | EnumC2970.t, function, 5);
    }

    @Override // l.InterfaceC5046
    public final InterfaceC19386 f(C5295 c5295) {
        C13638.requireNonNull(c5295);
        return new C15644(this, EnumC2970.p | EnumC2970.n | EnumC2970.t, c5295, 6);
    }

    @Override // l.InterfaceC5046
    public final Object collect(InterfaceC14592 interfaceC14592) {
        Object objI0;
        if (!this.h.r || !interfaceC14592.characteristics().contains(EnumC23764.CONCURRENT) || (EnumC2970.ORDERED.s(this.m) && !interfaceC14592.characteristics().contains(EnumC23764.UNORDERED))) {
            Supplier supplier = ((InterfaceC14592) C13638.requireNonNull(interfaceC14592)).supplier();
            objI0 = i0(new C1156(EnumC22761.REFERENCE, interfaceC14592.combiner(), interfaceC14592.accumulator(), supplier, interfaceC14592));
        } else {
            objI0 = interfaceC14592.supplier().get();
            forEach(new C11251(7, interfaceC14592.accumulator(), objI0));
        }
        return interfaceC14592.characteristics().contains(EnumC23764.IDENTITY_FINISH) ? objI0 : interfaceC14592.finisher().apply(objI0);
    }

    @Override // l.InterfaceC5046
    public final InterfaceC18796 l(C5295 c5295) {
        C13638.requireNonNull(c5295);
        return new C15727(this, EnumC2970.p | EnumC2970.n | EnumC2970.t, c5295, 5);
    }

    @Override // l.InterfaceC5046
    public final InterfaceC5046 peek(Consumer consumer) {
        C13638.requireNonNull(consumer);
        return new C22699(this, consumer);
    }

    @Override // l.InterfaceC5046
    public final InterfaceC5046 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC20092.h(this, 0L, j);
    }

    @Override // l.InterfaceC5046
    public final InterfaceC5046 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC20092.h(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // l.InterfaceC5046
    public final InterfaceC5046 takeWhile(Predicate predicate) {
        int i = AbstractC13402.a;
        C13638.requireNonNull(predicate);
        return new C12904(this, AbstractC13402.a, predicate, 0);
    }

    @Override // l.InterfaceC5046
    public final InterfaceC5046 dropWhile(Predicate predicate) {
        int i = AbstractC13402.a;
        C13638.requireNonNull(predicate);
        return new C12904(this, AbstractC13402.b, predicate, 1);
    }

    @Override // l.InterfaceC5046
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC22686.S(j0(intFunction), intFunction).m(intFunction);
    }

    @Override // l.InterfaceC5046
    public final Object[] toArray() {
        return toArray(new C1040(19));
    }

    @Override // l.InterfaceC5046
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) i0(AbstractC22686.d0(EnumC0120.ANY, predicate))).booleanValue();
    }

    @Override // l.InterfaceC5046
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) i0(AbstractC22686.d0(EnumC0120.ALL, predicate))).booleanValue();
    }

    @Override // l.InterfaceC5046
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) i0(AbstractC22686.d0(EnumC0120.NONE, predicate))).booleanValue();
    }

    @Override // l.InterfaceC5046
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }
}
