package l;

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
import java.util.stream.Collector;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ܿܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18410 implements InterfaceC20670 {
    public final /* synthetic */ Stream a;

    public /* synthetic */ C18410(Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ InterfaceC20670 b(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof C3516 ? ((C3516) stream).a : new C18410(stream);
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.a.allMatch(predicate);
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.a.anyMatch(predicate);
    }

    @Override // l.InterfaceC19924, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ Object collect(InterfaceC5754 interfaceC5754) {
        Collector c23852;
        Stream stream = this.a;
        if (interfaceC5754 == null) {
            c23852 = null;
        } else {
            c23852 = interfaceC5754 instanceof C23106 ? ((C23106) interfaceC5754).a : new C23852(interfaceC5754);
        }
        return stream.collect(c23852);
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC20670 distinct() {
        return b(this.a.distinct());
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC20670 dropWhile(Predicate predicate) {
        return b(this.a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Stream stream = this.a;
        if (obj instanceof C18410) {
            obj = ((C18410) obj).a;
        }
        return stream.equals(obj);
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC20670 filter(Predicate predicate) {
        return b(this.a.filter(predicate));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ C15867 findAny() {
        return AbstractC2946.j(this.a.findAny());
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ C15867 findFirst() {
        return AbstractC2946.j(this.a.findFirst());
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC20670 flatMap(Function function) {
        return b(this.a.flatMap(AbstractC13956.W(function)));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC17686 flatMapToInt(Function function) {
        return C25146.convert(this.a.flatMapToInt(AbstractC13956.W(function)));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.a.forEach(consumer);
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.a.forEachOrdered(consumer);
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC20648 g(C15801 c15801) {
        return C1301.b(this.a.flatMapToDouble(AbstractC13956.W(c15801)));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC16194 k(C15801 c15801) {
        return C18785.b(this.a.flatMapToLong(AbstractC13956.W(c15801)));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC20670 limit(long j) {
        return b(this.a.limit(j));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC20670 map(Function function) {
        return b(this.a.map(function));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC20648 mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C1301.b(this.a.mapToDouble(toDoubleFunction));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC17686 mapToInt(ToIntFunction toIntFunction) {
        return C25146.convert(this.a.mapToInt(toIntFunction));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC16194 mapToLong(ToLongFunction toLongFunction) {
        return C18785.b(this.a.mapToLong(toLongFunction));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ C15867 max(Comparator comparator) {
        return AbstractC2946.j(this.a.max(comparator));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ C15867 min(Comparator comparator) {
        return AbstractC2946.j(this.a.min(comparator));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.a.noneMatch(predicate);
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 onClose(Runnable runnable) {
        return C3494.b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 parallel() {
        return C3494.b(this.a.parallel());
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC20670 peek(Consumer consumer) {
        return b(this.a.peek(consumer));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, binaryOperator);
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ C15867 reduce(BinaryOperator binaryOperator) {
        return AbstractC2946.j(this.a.reduce(binaryOperator));
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 sequential() {
        return C3494.b(this.a.sequential());
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC20670 skip(long j) {
        return b(this.a.skip(j));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC20670 sorted() {
        return b(this.a.sorted());
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC20670 sorted(Comparator comparator) {
        return b(this.a.sorted(comparator));
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC8409 spliterator() {
        return C19553.a(this.a.spliterator());
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ InterfaceC20670 takeWhile(Predicate predicate) {
        return b(this.a.takeWhile(predicate));
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ Object[] toArray() {
        return this.a.toArray();
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.a.toArray(intFunction);
    }

    @Override // l.InterfaceC20670
    public final /* synthetic */ List toList() {
        return this.a.toList();
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 unordered() {
        return C3494.b(this.a.unordered());
    }
}
