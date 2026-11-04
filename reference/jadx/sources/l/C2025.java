package l;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֫ܺۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2025 {
    public static final Set a;
    public static final Set b;
    public static final Set c;
    public static final Set d;

    static {
        EnumC13211 enumC13211 = EnumC13211.CONCURRENT;
        EnumC13211 enumC13212 = EnumC13211.UNORDERED;
        EnumC13211 enumC13213 = EnumC13211.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC13211, enumC13212, enumC13213));
        Collections.unmodifiableSet(EnumSet.of(enumC13211, enumC13212));
        a = Collections.unmodifiableSet(EnumSet.of(enumC13213));
        b = Collections.unmodifiableSet(EnumSet.of(enumC13212, enumC13213));
        c = Collections.EMPTY_SET;
        d = Collections.unmodifiableSet(EnumSet.of(enumC13212));
    }

    public static InterfaceC5754 toCollection(Supplier supplier) {
        return new C17796(supplier, new C14435(15), new C14435(16), a);
    }

    public static InterfaceC5754 toList() {
        return new C17796(new C8189(1), new C14435(17), new C14435(23), a);
    }

    public static InterfaceC5754 toUnmodifiableList() {
        return new C17796(new C8189(1), new C14435(17), new C14435(18), new C14435(19), c);
    }

    public static InterfaceC5754 toSet() {
        return new C17796(new C8189(3), new C14435(20), new C14435(28), b);
    }

    public static InterfaceC5754 toUnmodifiableSet() {
        return new C17796(new C8189(3), new C14435(20), new C14435(21), new C14435(22), d);
    }

    public static InterfaceC5754 joining() {
        return new C17796(new C8189(6), new C16392(), new C22272(0), new C22272(1), c);
    }

    public static InterfaceC5754 joining(CharSequence charSequence) {
        return joining(charSequence, "", "");
    }

    public static InterfaceC5754 joining(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        return new C17796(new Supplier() { // from class: l.֡ۗۗ
            @Override // java.util.function.Supplier
            public final Object get() {
                CharSequence charSequence4 = charSequence;
                CharSequence charSequence5 = charSequence2;
                CharSequence charSequence6 = charSequence3;
                Set set = C2025.a;
                return new C4571(charSequence4, charSequence5, charSequence6);
            }
        }, new C14435(25), new C14435(26), new C14435(27), c);
    }

    public static void a(double[] dArr, double d2) {
        double d3 = d2 - dArr[1];
        double d4 = dArr[0];
        double d5 = d4 + d3;
        dArr[1] = (d5 - d4) - d3;
        dArr[0] = d5;
    }

    public static InterfaceC5754 groupingBy(Function function) {
        InterfaceC5754 list = toList();
        C8189 c8189 = new C8189(5);
        C10580 c10580 = new C10580(function, list.supplier(), list.accumulator(), 1);
        C3249 c3249 = new C3249(11, list.combiner());
        return list.characteristics().contains(EnumC13211.IDENTITY_FINISH) ? new C17796(c8189, c10580, c3249, a) : new C17796(c8189, c10580, c3249, new C15801(list.finisher(), 1), c);
    }

    public static InterfaceC5754 toMap(Function function, Function function2) {
        return new C17796(new C8189(5), new C7092(function, function2, 2), new C14435(14), a);
    }

    public static InterfaceC5754 toMap(Function function, Function function2, BinaryOperator binaryOperator) {
        return new C17796(new C8189(5), new C10580(function, function2, binaryOperator, 0), new C3249(11, binaryOperator), a);
    }
}
