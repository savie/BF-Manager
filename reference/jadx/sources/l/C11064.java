package l;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۧܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C11064 {
    public static InterfaceC14592 of(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, EnumC23764... enumC23764Arr) {
        Set setUnmodifiableSet;
        C13638.requireNonNull(supplier);
        C13638.requireNonNull(biConsumer);
        C13638.requireNonNull(binaryOperator);
        C13638.requireNonNull(enumC23764Arr);
        if (enumC23764Arr.length == 0) {
            setUnmodifiableSet = C1890.a;
        } else {
            setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(EnumC23764.IDENTITY_FINISH, enumC23764Arr));
        }
        return new C21618(supplier, biConsumer, binaryOperator, setUnmodifiableSet);
    }

    public static InterfaceC14592 of(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, EnumC23764... enumC23764Arr) {
        C13638.requireNonNull(supplier);
        C13638.requireNonNull(biConsumer);
        C13638.requireNonNull(binaryOperator);
        C13638.requireNonNull(function);
        C13638.requireNonNull(enumC23764Arr);
        Set setUnmodifiableSet = C1890.c;
        if (enumC23764Arr.length > 0) {
            EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC23764.class);
            Collections.addAll(enumSetNoneOf, enumC23764Arr);
            setUnmodifiableSet = Collections.unmodifiableSet(enumSetNoneOf);
        }
        return new C21618(supplier, biConsumer, binaryOperator, function, setUnmodifiableSet);
    }
}
