package l;

import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.᩵ۢᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC19386 extends InterfaceC6124 {
    InterfaceC19386 a(C5295 c5295);

    boolean allMatch(DoublePredicate doublePredicate);

    boolean anyMatch(DoublePredicate doublePredicate);

    C16460 average();

    InterfaceC5046 boxed();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC19386 distinct();

    InterfaceC19386 dropWhile(DoublePredicate doublePredicate);

    InterfaceC19386 filter(DoublePredicate doublePredicate);

    C16460 findAny();

    C16460 findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    InterfaceC18796 h();

    InterfaceC13514 i();

    @Override // l.InterfaceC6124
    InterfaceC4983 iterator();

    InterfaceC19386 limit(long j);

    InterfaceC19386 map(DoubleUnaryOperator doubleUnaryOperator);

    InterfaceC5046 mapToObj(DoubleFunction doubleFunction);

    C16460 max();

    C16460 min();

    boolean noneMatch(DoublePredicate doublePredicate);

    InterfaceC19386 parallel();

    InterfaceC19386 peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    C16460 reduce(DoubleBinaryOperator doubleBinaryOperator);

    InterfaceC19386 sequential();

    InterfaceC19386 skip(long j);

    InterfaceC19386 sorted();

    @Override // l.InterfaceC6124
    InterfaceC7535 spliterator();

    double sum();

    C17634 summaryStatistics();

    InterfaceC19386 takeWhile(DoublePredicate doublePredicate);

    double[] toArray();
}
