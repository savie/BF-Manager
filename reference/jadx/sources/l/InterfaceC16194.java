package l;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܶܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC16194 extends InterfaceC19924 {
    InterfaceC16194 a(C3249 c3249);

    boolean allMatch(LongPredicate longPredicate);

    boolean anyMatch(LongPredicate longPredicate);

    InterfaceC20648 asDoubleStream();

    C21725 average();

    InterfaceC20670 boxed();

    InterfaceC20648 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC16194 distinct();

    InterfaceC16194 dropWhile(LongPredicate longPredicate);

    InterfaceC16194 filter(LongPredicate longPredicate);

    C19487 findAny();

    C19487 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // l.InterfaceC19924
    InterfaceC6173 iterator();

    InterfaceC17686 l();

    InterfaceC16194 limit(long j);

    InterfaceC16194 map(LongUnaryOperator longUnaryOperator);

    InterfaceC20670 mapToObj(LongFunction longFunction);

    C19487 max();

    C19487 min();

    boolean noneMatch(LongPredicate longPredicate);

    @Override // l.InterfaceC19924
    InterfaceC16194 parallel();

    InterfaceC16194 peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    C19487 reduce(LongBinaryOperator longBinaryOperator);

    @Override // l.InterfaceC19924
    InterfaceC16194 sequential();

    InterfaceC16194 skip(long j);

    InterfaceC16194 sorted();

    @Override // l.InterfaceC19924
    InterfaceC9900 spliterator();

    long sum();

    C11348 summaryStatistics();

    InterfaceC16194 takeWhile(LongPredicate longPredicate);

    long[] toArray();
}
