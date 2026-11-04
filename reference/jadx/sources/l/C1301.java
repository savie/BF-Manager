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

/* JADX INFO: renamed from: l.֨ܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1301 implements InterfaceC20648 {
    public final /* synthetic */ DoubleStream a;

    public /* synthetic */ C1301(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ InterfaceC20648 b(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof C15426 ? ((C15426) doubleStream).a : new C1301(doubleStream);
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ boolean allMatch(DoublePredicate doublePredicate) {
        return this.a.allMatch(doublePredicate);
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ boolean anyMatch(DoublePredicate doublePredicate) {
        return this.a.anyMatch(doublePredicate);
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ C21725 average() {
        return AbstractC2946.k(this.a.average());
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ InterfaceC20670 boxed() {
        return C18410.b(this.a.boxed());
    }

    @Override // l.InterfaceC19924, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ InterfaceC20648 distinct() {
        return b(this.a.distinct());
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ InterfaceC20648 dropWhile(DoublePredicate doublePredicate) {
        return b(this.a.dropWhile(doublePredicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof C1301) {
            obj = ((C1301) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ InterfaceC20648 filter(DoublePredicate doublePredicate) {
        return b(this.a.filter(doublePredicate));
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ C21725 findAny() {
        return AbstractC2946.k(this.a.findAny());
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ C21725 findFirst() {
        return AbstractC2946.k(this.a.findFirst());
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ InterfaceC16194 h() {
        return C18785.b(this.a.mapToLong(null));
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ InterfaceC17686 i() {
        return C25146.convert(this.a.mapToInt(null));
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // l.InterfaceC20648, l.InterfaceC19924
    public final /* synthetic */ InterfaceC16787 iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof C1872 ? ((C1872) it).a : new C15295(it);
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ InterfaceC20648 limit(long j) {
        return b(this.a.limit(j));
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ InterfaceC20648 map(DoubleUnaryOperator doubleUnaryOperator) {
        return b(this.a.map(doubleUnaryOperator));
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ InterfaceC20670 mapToObj(DoubleFunction doubleFunction) {
        return C18410.b(this.a.mapToObj(doubleFunction));
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ C21725 max() {
        return AbstractC2946.k(this.a.max());
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ C21725 min() {
        return AbstractC2946.k(this.a.min());
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ boolean noneMatch(DoublePredicate doublePredicate) {
        return this.a.noneMatch(doublePredicate);
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 onClose(Runnable runnable) {
        return C3494.b(this.a.onClose(runnable));
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 parallel() {
        return C3494.b(this.a.parallel());
    }

    @Override // l.InterfaceC20648, l.InterfaceC19924
    public final /* synthetic */ InterfaceC20648 parallel() {
        return b(this.a.parallel());
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ InterfaceC20648 peek(DoubleConsumer doubleConsumer) {
        return b(this.a.peek(doubleConsumer));
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ C21725 reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return AbstractC2946.k(this.a.reduce(doubleBinaryOperator));
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 sequential() {
        return C3494.b(this.a.sequential());
    }

    @Override // l.InterfaceC20648, l.InterfaceC19924
    public final /* synthetic */ InterfaceC20648 sequential() {
        return b(this.a.sequential());
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ InterfaceC20648 skip(long j) {
        return b(this.a.skip(j));
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ InterfaceC20648 sorted() {
        return b(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // l.InterfaceC20648, l.InterfaceC19924
    public final /* synthetic */ InterfaceC3012 spliterator() {
        return C19420.a(this.a.spliterator());
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC8409 spliterator() {
        return C19553.a(this.a.spliterator());
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ InterfaceC20648 takeWhile(DoublePredicate doublePredicate) {
        return b(this.a.takeWhile(doublePredicate));
    }

    @Override // l.InterfaceC20648
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // l.InterfaceC19924
    public final /* synthetic */ InterfaceC19924 unordered() {
        return C3494.b(this.a.unordered());
    }

    @Override // l.InterfaceC20648
    public final C15077 summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // l.InterfaceC20648
    public final InterfaceC20648 a(C3249 c3249) {
        DoubleStream doubleStream = this.a;
        C3249 c32410 = new C3249(12);
        c32410.b = c3249;
        return b(doubleStream.flatMap(c32410));
    }
}
