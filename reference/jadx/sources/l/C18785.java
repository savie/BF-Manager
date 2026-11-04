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

/* JADX INFO: renamed from: l.ᩳۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C18785 implements InterfaceC16194 {
    public final /* synthetic */ LongStream a;

    public /* synthetic */ C18785(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ InterfaceC16194 b(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C23018 ? ((C23018) longStream).a : new C18785(longStream);
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ boolean allMatch(LongPredicate longPredicate) {
        return this.a.allMatch(longPredicate);
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ boolean anyMatch(LongPredicate longPredicate) {
        return this.a.anyMatch(longPredicate);
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC20648 asDoubleStream() {
        return C1301.b(this.a.asDoubleStream());
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ C21725 average() {
        return AbstractC2946.k(this.a.average());
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC20670 boxed() {
        return C18410.b(this.a.boxed());
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC20648 c() {
        return C1301.b(this.a.mapToDouble(null));
    }

    @Override // l.InterfaceC19924, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC16194 distinct() {
        return b(this.a.distinct());
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC16194 dropWhile(LongPredicate longPredicate) {
        return b(this.a.dropWhile(longPredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.a;
        if (obj instanceof C18785) {
            obj = ((C18785) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC16194 filter(LongPredicate longPredicate) {
        return b(this.a.filter(longPredicate));
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ C19487 findAny() {
        return AbstractC2946.m(this.a.findAny());
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ C19487 findFirst() {
        return AbstractC2946.m(this.a.findFirst());
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // l.InterfaceC16194, l.InterfaceC19924
    public final /* synthetic */ InterfaceC6173 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof C14944 ? ((C14944) it).a : new C6742(it);
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC17686 l() {
        return C25146.convert(this.a.mapToInt(null));
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC16194 limit(long j) {
        return b(this.a.limit(j));
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC16194 map(LongUnaryOperator longUnaryOperator) {
        return b(this.a.map(longUnaryOperator));
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC20670 mapToObj(LongFunction longFunction) {
        return C18410.b(this.a.mapToObj(longFunction));
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ C19487 max() {
        return AbstractC2946.m(this.a.max());
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ C19487 min() {
        return AbstractC2946.m(this.a.min());
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ boolean noneMatch(LongPredicate longPredicate) {
        return this.a.noneMatch(longPredicate);
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 onClose(Runnable runnable) {
        return C3494.b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC16194, l.InterfaceC19924
    public final /* synthetic */ InterfaceC16194 parallel() {
        return b(this.a.parallel());
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 parallel() {
        return C3494.b(this.a.parallel());
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC16194 peek(LongConsumer longConsumer) {
        return b(this.a.peek(longConsumer));
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ C19487 reduce(LongBinaryOperator longBinaryOperator) {
        return AbstractC2946.m(this.a.reduce(longBinaryOperator));
    }

    @Override // l.InterfaceC16194, l.InterfaceC19924
    public final /* synthetic */ InterfaceC16194 sequential() {
        return b(this.a.sequential());
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 sequential() {
        return C3494.b(this.a.sequential());
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC16194 skip(long j) {
        return b(this.a.skip(j));
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC16194 sorted() {
        return b(this.a.sorted());
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC8409 spliterator() {
        return C19553.a(this.a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // l.InterfaceC16194, l.InterfaceC19924
    public final /* synthetic */ InterfaceC9900 spliterator() {
        return C10973.a(this.a.spliterator());
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ InterfaceC16194 takeWhile(LongPredicate longPredicate) {
        return b(this.a.takeWhile(longPredicate));
    }

    @Override // l.InterfaceC16194
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 unordered() {
        return C3494.b(this.a.unordered());
    }

    @Override // l.InterfaceC16194
    public final C11348 summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // l.InterfaceC16194
    public final InterfaceC16194 a(C3249 c3249) {
        LongStream longStream = this.a;
        C3249 c32410 = new C3249(13);
        c32410.b = c3249;
        return b(longStream.flatMap(c32410));
    }
}
