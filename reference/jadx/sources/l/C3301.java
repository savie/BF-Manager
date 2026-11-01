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

/* JADX INFO: renamed from: l.ۗܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3301 implements InterfaceC13514 {
    public final /* synthetic */ IntStream a;

    public /* synthetic */ C3301(IntStream intStream) {
        this.a = intStream;
    }

    public static /* synthetic */ InterfaceC13514 convert(IntStream intStream) {
        if (intStream == null) {
            return null;
        }
        return intStream instanceof C4340 ? ((C4340) intStream).a : new C3301(intStream);
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ boolean allMatch(IntPredicate intPredicate) {
        return this.a.allMatch(intPredicate);
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ boolean anyMatch(IntPredicate intPredicate) {
        return this.a.anyMatch(intPredicate);
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC19386 asDoubleStream() {
        return C10692.b(this.a.asDoubleStream());
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC18796 asLongStream() {
        return C17116.b(this.a.asLongStream());
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ C16460 average() {
        return AbstractC14884.k(this.a.average());
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC5046 boxed() {
        return C4381.b(this.a.boxed());
    }

    @Override // l.InterfaceC6124, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objIntConsumer, biConsumer);
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC13514 distinct() {
        return convert(this.a.distinct());
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC13514 dropWhile(IntPredicate intPredicate) {
        return convert(this.a.dropWhile(intPredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        IntStream intStream = this.a;
        if (obj instanceof C3301) {
            obj = ((C3301) obj).a;
        }
        return intStream.equals(obj);
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC13514 filter(IntPredicate intPredicate) {
        return convert(this.a.filter(intPredicate));
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ C2347 findAny() {
        return AbstractC14884.l(this.a.findAny());
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ C2347 findFirst() {
        return AbstractC14884.l(this.a.findFirst());
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ void forEach(IntConsumer intConsumer) {
        this.a.forEach(intConsumer);
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ void forEachOrdered(IntConsumer intConsumer) {
        this.a.forEachOrdered(intConsumer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
    @Override // l.InterfaceC13514, l.InterfaceC6124
    public final /* synthetic */ InterfaceC22104 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof C13886 ? ((C13886) it).a : new C9923(it);
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC13514 limit(long j) {
        return convert(this.a.limit(j));
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC13514 map(IntUnaryOperator intUnaryOperator) {
        return convert(this.a.map(intUnaryOperator));
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC19386 mapToDouble(IntToDoubleFunction intToDoubleFunction) {
        return C10692.b(this.a.mapToDouble(intToDoubleFunction));
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC18796 mapToLong(IntToLongFunction intToLongFunction) {
        return C17116.b(this.a.mapToLong(intToLongFunction));
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC5046 mapToObj(IntFunction intFunction) {
        return C4381.b(this.a.mapToObj(intFunction));
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ C2347 max() {
        return AbstractC14884.l(this.a.max());
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ C2347 min() {
        return AbstractC14884.l(this.a.min());
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ boolean noneMatch(IntPredicate intPredicate) {
        return this.a.noneMatch(intPredicate);
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC6124 onClose(Runnable runnable) {
        return C2264.b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC6124 parallel() {
        return C2264.b(this.a.parallel());
    }

    @Override // l.InterfaceC13514, l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC13514 parallel() {
        return convert(this.a.parallel());
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC13514 peek(IntConsumer intConsumer) {
        return convert(this.a.peek(intConsumer));
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ int reduce(int i, IntBinaryOperator intBinaryOperator) {
        return this.a.reduce(i, intBinaryOperator);
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ C2347 reduce(IntBinaryOperator intBinaryOperator) {
        return AbstractC14884.l(this.a.reduce(intBinaryOperator));
    }

    @Override // l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC6124 sequential() {
        return C2264.b(this.a.sequential());
    }

    @Override // l.InterfaceC13514, l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC13514 sequential() {
        return convert(this.a.sequential());
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC13514 skip(long j) {
        return convert(this.a.skip(j));
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC13514 sorted() {
        return convert(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
    @Override // l.InterfaceC13514, l.InterfaceC6124
    public final /* synthetic */ InterfaceC18576 spliterator() {
        return C16003.a(this.a.spliterator());
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC20693 spliterator() {
        return C12696.a(this.a.spliterator());
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ int sum() {
        return this.a.sum();
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ InterfaceC13514 takeWhile(IntPredicate intPredicate) {
        return convert(this.a.takeWhile(intPredicate));
    }

    @Override // l.InterfaceC13514
    public final /* synthetic */ int[] toArray() {
        return this.a.toArray();
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC6124 unordered() {
        return C2264.b(this.a.unordered());
    }

    @Override // l.InterfaceC13514
    public final C11285 summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
    }

    @Override // l.InterfaceC13514
    public final InterfaceC13514 g(C11741 c11741) {
        IntStream intStream = this.a;
        C11741 c11742 = new C11741();
        c11742.a = c11741;
        return convert(intStream.flatMap(c11742));
    }
}
