package l;

import java.util.Iterator;
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
import java.util.stream.IntStream;

/* JADX INFO: renamed from: l.᩻ܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C25146 implements InterfaceC17686 {
    public final /* synthetic */ IntStream a;

    public /* synthetic */ C25146(IntStream intStream) {
        this.a = intStream;
    }

    public static /* synthetic */ InterfaceC17686 convert(IntStream intStream) {
        if (intStream == null) {
            return null;
        }
        return intStream instanceof C16940 ? ((C16940) intStream).a : new C25146(intStream);
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
        return this.a.allMatch(intPredicate);
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
        return this.a.anyMatch(intPredicate);
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC20648 asDoubleStream() {
        return C1301.b(this.a.asDoubleStream());
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC16194 asLongStream() {
        return C18785.b(this.a.asLongStream());
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ C21725 average() {
        return AbstractC2946.k(this.a.average());
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC20670 boxed() {
        return C18410.b(this.a.boxed());
    }

    @Override // l.InterfaceC19924, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objIntConsumer, biConsumer);
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC17686 distinct() {
        return convert(this.a.distinct());
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC17686 dropWhile(IntPredicate intPredicate) {
        return convert(this.a.dropWhile(intPredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntStream intStream = this.a;
        if (obj instanceof C25146) {
            obj = ((C25146) obj).a;
        }
        return intStream.equals(obj);
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC17686 filter(IntPredicate intPredicate) {
        return convert(this.a.filter(intPredicate));
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ C23327 findAny() {
        return AbstractC2946.l(this.a.findAny());
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ C23327 findFirst() {
        return AbstractC2946.l(this.a.findFirst());
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ void forEach(IntConsumer intConsumer) {
        this.a.forEach(intConsumer);
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        this.a.forEachOrdered(intConsumer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
    @Override // l.InterfaceC17686, l.InterfaceC19924
    public final /* synthetic */ InterfaceC20343 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof C17928 ? ((C17928) it).a : new C11961(it);
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC17686 limit(long j) {
        return convert(this.a.limit(j));
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC17686 map(IntUnaryOperator intUnaryOperator) {
        return convert(this.a.map(intUnaryOperator));
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC20648 mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        return C1301.b(this.a.mapToDouble(intToDoubleFunction));
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC16194 mapToLong(IntToLongFunction intToLongFunction) {
        return C18785.b(this.a.mapToLong(intToLongFunction));
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC20670 mapToObj(IntFunction intFunction) {
        return C18410.b(this.a.mapToObj(intFunction));
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ C23327 max() {
        return AbstractC2946.l(this.a.max());
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ C23327 min() {
        return AbstractC2946.l(this.a.min());
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
        return this.a.noneMatch(intPredicate);
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 onClose(Runnable runnable) {
        return C3494.b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC17686, l.InterfaceC19924
    public final /* synthetic */ InterfaceC17686 parallel() {
        return convert(this.a.parallel());
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 parallel() {
        return C3494.b(this.a.parallel());
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC17686 peek(IntConsumer intConsumer) {
        return convert(this.a.peek(intConsumer));
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
        return this.a.reduce(i, intBinaryOperator);
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ C23327 reduce(IntBinaryOperator intBinaryOperator) {
        return AbstractC2946.l(this.a.reduce(intBinaryOperator));
    }

    @Override // l.InterfaceC17686, l.InterfaceC19924
    public final /* synthetic */ InterfaceC17686 sequential() {
        return convert(this.a.sequential());
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 sequential() {
        return C3494.b(this.a.sequential());
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC17686 skip(long j) {
        return convert(this.a.skip(j));
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC17686 sorted() {
        return convert(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
    @Override // l.InterfaceC17686, l.InterfaceC19924
    public final /* synthetic */ InterfaceC7664 spliterator() {
        return C7487.a(this.a.spliterator());
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC8409 spliterator() {
        return C19553.a(this.a.spliterator());
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ int sum() {
        return this.a.sum();
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ InterfaceC17686 takeWhile(IntPredicate intPredicate) {
        return convert(this.a.takeWhile(intPredicate));
    }

    @Override // l.InterfaceC17686
    public final /* synthetic */ int[] toArray() {
        return this.a.toArray();
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 unordered() {
        return C3494.b(this.a.unordered());
    }

    @Override // l.InterfaceC17686
    public final C5383 summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
    }

    @Override // l.InterfaceC17686
    public final InterfaceC17686 f(C11083 c11083) {
        IntStream intStream = this.a;
        C11083 c11084 = new C11083();
        c11084.a = c11083;
        return convert(intStream.flatMap(c11084));
    }
}
