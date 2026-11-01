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

/* JADX INFO: renamed from: l.ۚ֫ᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC5046 extends InterfaceC6124 {
    boolean allMatch(Predicate predicate);

    boolean anyMatch(Predicate predicate);

    Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2);

    Object collect(InterfaceC14592 interfaceC14592);

    long count();

    InterfaceC5046 distinct();

    InterfaceC5046 dropWhile(Predicate predicate);

    InterfaceC19386 f(C5295 c5295);

    InterfaceC5046 filter(Predicate predicate);

    C11521 findAny();

    C11521 findFirst();

    InterfaceC5046 flatMap(Function function);

    InterfaceC13514 flatMapToInt(Function function);

    void forEach(Consumer consumer);

    void forEachOrdered(Consumer consumer);

    InterfaceC18796 l(C5295 c5295);

    InterfaceC5046 limit(long j);

    InterfaceC5046 map(Function function);

    InterfaceC19386 mapToDouble(ToDoubleFunction toDoubleFunction);

    InterfaceC13514 mapToInt(ToIntFunction toIntFunction);

    InterfaceC18796 mapToLong(ToLongFunction toLongFunction);

    C11521 max(Comparator comparator);

    C11521 min(Comparator comparator);

    boolean noneMatch(Predicate predicate);

    InterfaceC5046 peek(Consumer consumer);

    Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator);

    Object reduce(Object obj, BinaryOperator binaryOperator);

    C11521 reduce(BinaryOperator binaryOperator);

    InterfaceC5046 skip(long j);

    InterfaceC5046 sorted();

    InterfaceC5046 sorted(Comparator comparator);

    InterfaceC5046 takeWhile(Predicate predicate);

    Object[] toArray();

    Object[] toArray(IntFunction intFunction);

    List toList();
}
