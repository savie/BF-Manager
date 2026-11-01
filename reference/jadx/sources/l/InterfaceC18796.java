package l;

import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ᩴܰ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18796 extends InterfaceC6124 {
    InterfaceC18796 a(C5295 c5295);

    boolean allMatch(LongPredicate longPredicate);

    boolean anyMatch(LongPredicate longPredicate);

    InterfaceC19386 asDoubleStream();

    C16460 average();

    InterfaceC5046 boxed();

    InterfaceC19386 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC18796 distinct();

    InterfaceC18796 dropWhile(LongPredicate longPredicate);

    InterfaceC18796 filter(LongPredicate longPredicate);

    C5876 findAny();

    C5876 findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // l.InterfaceC6124
    InterfaceC12932 iterator();

    InterfaceC13514 k();

    InterfaceC18796 limit(long j);

    InterfaceC18796 map(LongUnaryOperator longUnaryOperator);

    InterfaceC5046 mapToObj(LongFunction longFunction);

    C5876 max();

    C5876 min();

    boolean noneMatch(LongPredicate longPredicate);

    @Override // l.InterfaceC6124, l.InterfaceC19386
    InterfaceC18796 parallel();

    InterfaceC18796 peek(LongConsumer longConsumer);

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    C5876 reduce(LongBinaryOperator longBinaryOperator);

    @Override // l.InterfaceC6124, l.InterfaceC19386
    InterfaceC18796 sequential();

    InterfaceC18796 skip(long j);

    InterfaceC18796 sorted();

    @Override // l.InterfaceC6124
    InterfaceC19282 spliterator();

    long sum();

    C14813 summaryStatistics();

    InterfaceC18796 takeWhile(LongPredicate longPredicate);

    long[] toArray();
}
