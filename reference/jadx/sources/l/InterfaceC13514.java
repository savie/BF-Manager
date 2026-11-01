package l;

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

/* JADX INFO: renamed from: l.ܰ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC13514 extends InterfaceC6124 {
    boolean allMatch(IntPredicate intPredicate);

    boolean anyMatch(IntPredicate intPredicate);

    InterfaceC19386 asDoubleStream();

    InterfaceC18796 asLongStream();

    C16460 average();

    InterfaceC5046 boxed();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC13514 distinct();

    InterfaceC13514 dropWhile(IntPredicate intPredicate);

    InterfaceC13514 filter(IntPredicate intPredicate);

    C2347 findAny();

    C2347 findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    InterfaceC13514 g(C11741 c11741);

    @Override // l.InterfaceC6124
    InterfaceC22104 iterator();

    InterfaceC13514 limit(long j);

    InterfaceC13514 map(IntUnaryOperator intUnaryOperator);

    InterfaceC19386 mapToDouble(IntToDoubleFunction intToDoubleFunction);

    InterfaceC18796 mapToLong(IntToLongFunction intToLongFunction);

    InterfaceC5046 mapToObj(IntFunction intFunction);

    C2347 max();

    C2347 min();

    boolean noneMatch(IntPredicate intPredicate);

    @Override // l.InterfaceC6124, l.InterfaceC19386
    InterfaceC13514 parallel();

    InterfaceC13514 peek(IntConsumer intConsumer);

    int reduce(int i, IntBinaryOperator intBinaryOperator);

    C2347 reduce(IntBinaryOperator intBinaryOperator);

    @Override // l.InterfaceC6124, l.InterfaceC19386
    InterfaceC13514 sequential();

    InterfaceC13514 skip(long j);

    InterfaceC13514 sorted();

    @Override // l.InterfaceC6124
    InterfaceC18576 spliterator();

    int sum();

    C11285 summaryStatistics();

    InterfaceC13514 takeWhile(IntPredicate intPredicate);

    int[] toArray();
}
