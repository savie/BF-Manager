package l;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: l.ܿۙ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17116 implements InterfaceC18796 {
    public final /* synthetic */ LongStream a;

    public /* synthetic */ C17116(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ InterfaceC18796 b(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C2567 ? ((C2567) longStream).a : new C17116(longStream);
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ boolean allMatch(LongPredicate longPredicate) {
        return this.a.allMatch(longPredicate);
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ boolean anyMatch(LongPredicate longPredicate) {
        return this.a.anyMatch(longPredicate);
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC19386 asDoubleStream() {
        return C10692.b(this.a.asDoubleStream());
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ C16460 average() {
        return AbstractC14884.k(this.a.average());
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC5046 boxed() {
        return C4381.b(this.a.boxed());
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC19386 c() {
        return C10692.b(this.a.mapToDouble(null));
    }

    @Override // l.InterfaceC6124, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC18796 distinct() {
        return b(this.a.distinct());
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC18796 dropWhile(LongPredicate longPredicate) {
        return b(this.a.dropWhile(longPredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.a;
        if (obj instanceof C17116) {
            obj = ((C17116) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC18796 filter(LongPredicate longPredicate) {
        return b(this.a.filter(longPredicate));
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ C5876 findAny() {
        return AbstractC14884.m(this.a.findAny());
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ C5876 findFirst() {
        return AbstractC14884.m(this.a.findFirst());
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // l.InterfaceC18796, l.InterfaceC6124
    public final /* synthetic */ InterfaceC12932 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof C23058 ? ((C23058) it).a : new C13180(it);
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC13514 k() {
        return C3301.convert(this.a.mapToInt(null));
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC18796 limit(long j) {
        return b(this.a.limit(j));
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC18796 map(LongUnaryOperator longUnaryOperator) {
        return b(this.a.map(longUnaryOperator));
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC5046 mapToObj(LongFunction longFunction) {
        return C4381.b(this.a.mapToObj(longFunction));
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ C5876 max() {
        return AbstractC14884.m(this.a.max());
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ C5876 min() {
        return AbstractC14884.m(this.a.min());
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ boolean noneMatch(LongPredicate longPredicate) {
        return this.a.noneMatch(longPredicate);
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC6124 onClose(Runnable runnable) {
        return C2264.b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC6124 parallel() {
        return C2264.b(this.a.parallel());
    }

    @Override // l.InterfaceC18796, l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC18796 parallel() {
        return b(this.a.parallel());
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC18796 peek(LongConsumer longConsumer) {
        return b(this.a.peek(longConsumer));
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ C5876 reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC14884.m(this.a.reduce(longBinaryOperator));
    }

    @Override // l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC6124 sequential() {
        return C2264.b(this.a.sequential());
    }

    @Override // l.InterfaceC18796, l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC18796 sequential() {
        return b(this.a.sequential());
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC18796 skip(long j) {
        return b(this.a.skip(j));
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC18796 sorted() {
        return b(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // l.InterfaceC18796, l.InterfaceC6124
    public final /* synthetic */ InterfaceC19282 spliterator() {
        return C12475.a(this.a.spliterator());
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC20693 spliterator() {
        return C12696.a(this.a.spliterator());
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ InterfaceC18796 takeWhile(LongPredicate longPredicate) {
        return b(this.a.takeWhile(longPredicate));
    }

    @Override // l.InterfaceC18796
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC6124 unordered() {
        return C2264.b(this.a.unordered());
    }

    @Override // l.InterfaceC18796
    public final C14813 summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // l.InterfaceC18796
    public final InterfaceC18796 a(C5295 c5295) {
        LongStream longStream = this.a;
        C5295 c5296 = new C5295(12);
        c5296.b = c5295;
        return b(longStream.flatMap(c5296));
    }
}
