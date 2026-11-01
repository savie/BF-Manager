package l;

import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: renamed from: l.ۧ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10692 implements InterfaceC19386 {
    public final /* synthetic */ DoubleStream a;

    public /* synthetic */ C10692(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ InterfaceC19386 b(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof C22208 ? ((C22208) doubleStream).a : new C10692(doubleStream);
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ boolean allMatch(DoublePredicate doublePredicate) {
        return this.a.allMatch(doublePredicate);
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ boolean anyMatch(DoublePredicate doublePredicate) {
        return this.a.anyMatch(doublePredicate);
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ C16460 average() {
        return AbstractC14884.k(this.a.average());
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC5046 boxed() {
        return C4381.b(this.a.boxed());
    }

    @Override // l.InterfaceC6124, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC19386 distinct() {
        return b(this.a.distinct());
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC19386 dropWhile(DoublePredicate doublePredicate) {
        return b(this.a.dropWhile(doublePredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof C10692) {
            obj = ((C10692) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC19386 filter(DoublePredicate doublePredicate) {
        return b(this.a.filter(doublePredicate));
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ C16460 findAny() {
        return AbstractC14884.k(this.a.findAny());
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ C16460 findFirst() {
        return AbstractC14884.k(this.a.findFirst());
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC18796 h() {
        return C17116.b(this.a.mapToLong(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC13514 i() {
        return C3301.convert(this.a.mapToInt(null));
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // l.InterfaceC19386, l.InterfaceC6124
    public final /* synthetic */ InterfaceC4983 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof C1787 ? ((C1787) it).a : new C10961(it);
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC19386 limit(long j) {
        return b(this.a.limit(j));
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC19386 map(DoubleUnaryOperator doubleUnaryOperator) {
        return b(this.a.map(doubleUnaryOperator));
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC5046 mapToObj(DoubleFunction doubleFunction) {
        return C4381.b(this.a.mapToObj(doubleFunction));
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ C16460 max() {
        return AbstractC14884.k(this.a.max());
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ C16460 min() {
        return AbstractC14884.k(this.a.min());
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ boolean noneMatch(DoublePredicate doublePredicate) {
        return this.a.noneMatch(doublePredicate);
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC6124 onClose(Runnable runnable) {
        return C2264.b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC6124 parallel() {
        return C2264.b(this.a.parallel());
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC19386 parallel() {
        return b(this.a.parallel());
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC19386 peek(DoubleConsumer doubleConsumer) {
        return b(this.a.peek(doubleConsumer));
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ C16460 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC14884.k(this.a.reduce(doubleBinaryOperator));
    }

    @Override // l.InterfaceC6124, l.InterfaceC19386
    public final /* synthetic */ InterfaceC6124 sequential() {
        return C2264.b(this.a.sequential());
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC19386 sequential() {
        return b(this.a.sequential());
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC19386 skip(long j) {
        return b(this.a.skip(j));
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC19386 sorted() {
        return b(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // l.InterfaceC19386, l.InterfaceC6124
    public final /* synthetic */ InterfaceC7535 spliterator() {
        return C8241.a(this.a.spliterator());
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC20693 spliterator() {
        return C12696.a(this.a.spliterator());
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ InterfaceC19386 takeWhile(DoublePredicate doublePredicate) {
        return b(this.a.takeWhile(doublePredicate));
    }

    @Override // l.InterfaceC19386
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // l.InterfaceC6124
    public final /* synthetic */ InterfaceC6124 unordered() {
        return C2264.b(this.a.unordered());
    }

    @Override // l.InterfaceC19386
    public final C17634 summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // l.InterfaceC19386
    public final InterfaceC19386 a(C5295 c5295) {
        DoubleStream doubleStream = this.a;
        C5295 c5296 = new C5295(10);
        c5296.b = c5295;
        return b(doubleStream.flatMap(c5296));
    }
}
