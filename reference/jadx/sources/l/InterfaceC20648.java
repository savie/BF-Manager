package l;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩵ܶۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20648 extends InterfaceC19924 {
    InterfaceC20648 a(C3249 c3249);

    boolean allMatch(DoublePredicate doublePredicate);

    boolean anyMatch(DoublePredicate doublePredicate);

    C21725 average();

    InterfaceC20670 boxed();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC20648 distinct();

    InterfaceC20648 dropWhile(DoublePredicate doublePredicate);

    InterfaceC20648 filter(DoublePredicate doublePredicate);

    C21725 findAny();

    C21725 findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    InterfaceC16194 h();

    InterfaceC17686 i();

    @Override // l.InterfaceC19924
    InterfaceC16787 iterator();

    InterfaceC20648 limit(long j);

    InterfaceC20648 map(DoubleUnaryOperator doubleUnaryOperator);

    InterfaceC20670 mapToObj(DoubleFunction doubleFunction);

    C21725 max();

    C21725 min();

    boolean noneMatch(DoublePredicate doublePredicate);

    @Override // l.InterfaceC19924
    InterfaceC20648 parallel();

    InterfaceC20648 peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    C21725 reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // l.InterfaceC19924
    InterfaceC20648 sequential();

    InterfaceC20648 skip(long j);

    InterfaceC20648 sorted();

    @Override // l.InterfaceC19924
    InterfaceC3012 spliterator();

    double sum();

    C15077 summaryStatistics();

    InterfaceC20648 takeWhile(DoublePredicate doublePredicate);

    double[] toArray();
}
