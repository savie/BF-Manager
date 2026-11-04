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

/* JADX INFO: renamed from: l.ܽܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC17686 extends InterfaceC19924 {
    boolean allMatch(IntPredicate intPredicate);

    boolean anyMatch(IntPredicate intPredicate);

    InterfaceC20648 asDoubleStream();

    InterfaceC16194 asLongStream();

    C21725 average();

    InterfaceC20670 boxed();

    Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC17686 distinct();

    InterfaceC17686 dropWhile(IntPredicate intPredicate);

    InterfaceC17686 f(C11083 c11083);

    InterfaceC17686 filter(IntPredicate intPredicate);

    C23327 findAny();

    C23327 findFirst();

    void forEach(IntConsumer intConsumer);

    void forEachOrdered(IntConsumer intConsumer);

    @Override // l.InterfaceC19924
    InterfaceC20343 iterator();

    InterfaceC17686 limit(long j);

    InterfaceC17686 map(IntUnaryOperator intUnaryOperator);

    InterfaceC20648 mapToDouble(IntToDoubleFunction intToDoubleFunction);

    InterfaceC16194 mapToLong(IntToLongFunction intToLongFunction);

    InterfaceC20670 mapToObj(IntFunction intFunction);

    C23327 max();

    C23327 min();

    boolean noneMatch(IntPredicate intPredicate);

    @Override // l.InterfaceC19924
    InterfaceC17686 parallel();

    InterfaceC17686 peek(IntConsumer intConsumer);

    int reduce(int i, IntBinaryOperator intBinaryOperator);

    C23327 reduce(IntBinaryOperator intBinaryOperator);

    @Override // l.InterfaceC19924
    InterfaceC17686 sequential();

    InterfaceC17686 skip(long j);

    InterfaceC17686 sorted();

    @Override // l.InterfaceC19924
    InterfaceC7664 spliterator();

    int sum();

    C5383 summaryStatistics();

    InterfaceC17686 takeWhile(IntPredicate intPredicate);

    int[] toArray();
}
