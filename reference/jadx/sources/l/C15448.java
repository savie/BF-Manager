package l;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܳܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C15448 {
    public static InterfaceC5754 of(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, EnumC13211... enumC13211Arr) {
        Set setUnmodifiableSet;
        C17359.requireNonNull(supplier);
        C17359.requireNonNull(biConsumer);
        C17359.requireNonNull(binaryOperator);
        C17359.requireNonNull(enumC13211Arr);
        if (enumC13211Arr.length == 0) {
            setUnmodifiableSet = C2025.a;
        } else {
            setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(EnumC13211.IDENTITY_FINISH, enumC13211Arr));
        }
        return new C17796(supplier, biConsumer, binaryOperator, setUnmodifiableSet);
    }

    public static InterfaceC5754 of(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, EnumC13211... enumC13211Arr) {
        C17359.requireNonNull(supplier);
        C17359.requireNonNull(biConsumer);
        C17359.requireNonNull(binaryOperator);
        C17359.requireNonNull(function);
        C17359.requireNonNull(enumC13211Arr);
        Set setUnmodifiableSet = C2025.c;
        if (enumC13211Arr.length > 0) {
            EnumSet enumSetNoneOf = EnumSet.noneOf(EnumC13211.class);
            Collections.addAll(enumSetNoneOf, enumC13211Arr);
            setUnmodifiableSet = Collections.unmodifiableSet(enumSetNoneOf);
        }
        return new C17796(supplier, biConsumer, binaryOperator, function, setUnmodifiableSet);
    }
}
