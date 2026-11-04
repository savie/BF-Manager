package l;

import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: l.᩵ܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC20670 extends InterfaceC19924 {
    boolean allMatch(Predicate predicate);

    boolean anyMatch(Predicate predicate);

    Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2);

    Object collect(InterfaceC5754 interfaceC5754);

    long count();

    InterfaceC20670 distinct();

    InterfaceC20670 dropWhile(Predicate predicate);

    InterfaceC20670 filter(Predicate predicate);

    C15867 findAny();

    C15867 findFirst();

    InterfaceC20670 flatMap(Function function);

    InterfaceC17686 flatMapToInt(Function function);

    void forEach(Consumer consumer);

    void forEachOrdered(Consumer consumer);

    InterfaceC20648 g(C15801 c15801);

    InterfaceC16194 k(C15801 c15801);

    InterfaceC20670 limit(long j);

    InterfaceC20670 map(Function function);

    InterfaceC20648 mapToDouble(ToDoubleFunction toDoubleFunction);

    InterfaceC17686 mapToInt(ToIntFunction toIntFunction);

    InterfaceC16194 mapToLong(ToLongFunction toLongFunction);

    C15867 max(Comparator comparator);

    C15867 min(Comparator comparator);

    boolean noneMatch(Predicate predicate);

    InterfaceC20670 peek(Consumer consumer);

    Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator);

    Object reduce(Object obj, BinaryOperator binaryOperator);

    C15867 reduce(BinaryOperator binaryOperator);

    InterfaceC20670 skip(long j);

    InterfaceC20670 sorted();

    InterfaceC20670 sorted(Comparator comparator);

    InterfaceC20670 takeWhile(Predicate predicate);

    Object[] toArray();

    Object[] toArray(IntFunction intFunction);

    List toList();
}
