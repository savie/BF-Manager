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

/* JADX INFO: renamed from: l.ۙۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4381 implements InterfaceC5046 {
    public final /* synthetic */ Stream a;

    public /* synthetic */ C4381(Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ InterfaceC5046 b(Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof C2223 ? ((C2223) stream).a : new C4381(stream);
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.a.allMatch(predicate);
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.a.anyMatch(predicate);
    }

    @Override // l.InterfaceC6124, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ Object collect(InterfaceC14592 interfaceC14592) {
        Collector c11472;
        Stream stream = this.a;
        if (interfaceC14592 == null) {
            c11472 = null;
        } else {
            c11472 = interfaceC14592 instanceof C12144 ? ((C12144) interfaceC14592).a : new C11472(interfaceC14592);
        }
        return stream.collect(c11472);
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC5046 distinct() {
        return b(this.a.distinct());
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC5046 dropWhile(Predicate predicate) {
        return b(this.a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Stream stream = this.a;
        if (obj instanceof C4381) {
            obj = ((C4381) obj).a;
        }
        return stream.equals(obj);
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC19386 f(C5295 c5295) {
        return C10692.b(this.a.flatMapToDouble(AbstractC22686.W(c5295)));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC5046 filter(Predicate predicate) {
        return b(this.a.filter(predicate));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ C11521 findAny() {
        return AbstractC14884.j(this.a.findAny());
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ C11521 findFirst() {
        return AbstractC14884.j(this.a.findFirst());
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC5046 flatMap(Function function) {
        return b(this.a.flatMap(AbstractC22686.W(function)));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC13514 flatMapToInt(Function function) {
        return C3301.convert(this.a.flatMapToInt(AbstractC22686.W(function)));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.a.forEach(consumer);
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC18796 l(C5295 c5295) {
        return C17116.b(this.a.flatMapToLong(AbstractC22686.W(c5295)));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC5046 limit(long j) {
        return b(this.a.limit(j));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC5046 map(Function function) {
        return b(this.a.map(function));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC19386 mapToDouble(ToDoubleFunction toDoubleFunction) {
        return C10692.b(this.a.mapToDouble(toDoubleFunction));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC13514 mapToInt(ToIntFunction toIntFunction) {
        return C3301.convert(this.a.mapToInt(toIntFunction));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC18796 mapToLong(ToLongFunction toLongFunction) {
        return C17116.b(this.a.mapToLong(toLongFunction));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ C11521 max(Comparator comparator) {
        return AbstractC14884.j(this.a.max(comparator));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ C11521 min(Comparator comparator) {
        return AbstractC14884.j(this.a.min(comparator));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.a.noneMatch(predicate);
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC6124 onClose(Runnable runnable) {
        return C2264.b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC6124 parallel() {
        return C2264.b(this.a.parallel());
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC5046 peek(Consumer consumer) {
        return b(this.a.peek(consumer));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, binaryOperator);
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ C11521 reduce(BinaryOperator binaryOperator) {
        return AbstractC14884.j(this.a.reduce(binaryOperator));
    }

    @Override // l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC6124 sequential() {
        return C2264.b(this.a.sequential());
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC5046 skip(long j) {
        return b(this.a.skip(j));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC5046 sorted() {
        return b(this.a.sorted());
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC5046 sorted(Comparator comparator) {
        return b(this.a.sorted(comparator));
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC20693 spliterator() {
        return C12696.a(this.a.spliterator());
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ InterfaceC5046 takeWhile(Predicate predicate) {
        return b(this.a.takeWhile(predicate));
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ Object[] toArray() {
        return this.a.toArray();
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.a.toArray(intFunction);
    }

    @Override // l.InterfaceC5046
    public final /* synthetic */ List toList() {
        return this.a.toList();
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC6124 unordered() {
        return C2264.b(this.a.unordered());
    }
}
