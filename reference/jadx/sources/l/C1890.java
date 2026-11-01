package l;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.֫ܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1890 {
    public static final Set a;
    public static final Set b;
    public static final Set c;
    public static final Set d;

    static {
        EnumC23764 enumC23764 = EnumC23764.CONCURRENT;
        EnumC23764 enumC23765 = EnumC23764.UNORDERED;
        EnumC23764 enumC23766 = EnumC23764.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC23764, enumC23765, enumC23766));
        Collections.unmodifiableSet(EnumSet.of(enumC23764, enumC23765));
        a = Collections.unmodifiableSet(EnumSet.of(enumC23766));
        b = Collections.unmodifiableSet(EnumSet.of(enumC23765, enumC23766));
        c = Collections.EMPTY_SET;
        d = Collections.unmodifiableSet(EnumSet.of(enumC23765));
    }

    public static InterfaceC14592 toCollection(Supplier supplier) {
        return new C21618(supplier, new C22935(15), new C22935(16), a);
    }

    public static InterfaceC14592 toList() {
        return new C21618(new C17821(1), new C22935(17), new C22935(23), a);
    }

    public static InterfaceC14592 toUnmodifiableList() {
        return new C21618(new C17821(1), new C22935(17), new C22935(18), new C22935(19), c);
    }

    public static InterfaceC14592 toSet() {
        return new C21618(new C17821(3), new C22935(20), new C22935(28), b);
    }

    public static InterfaceC14592 toUnmodifiableSet() {
        return new C21618(new C17821(3), new C22935(20), new C22935(21), new C22935(22), d);
    }

    public static InterfaceC14592 joining() {
        return new C21618(new C17821(6), new C16377(), new C13858(0), new C13858(1), c);
    }

    public static InterfaceC14592 joining(CharSequence charSequence) {
        return joining(charSequence, "", "");
    }

    public static InterfaceC14592 joining(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        return new C21618(new Supplier() { // from class: l.ܽۙ۠
            @Override // java.util.function.Supplier
            public final Object get() {
                CharSequence charSequence4 = charSequence;
                CharSequence charSequence5 = charSequence2;
                CharSequence charSequence6 = charSequence3;
                Set set = C1890.a;
                return new C0231(charSequence4, charSequence5, charSequence6);
            }
        }, new C22935(25), new C22935(26), new C22935(27), c);
    }

    public static void a(double[] dArr, double d2) {
        double d3 = d2 - dArr[1];
        double d4 = dArr[0];
        double d5 = d4 + d3;
        dArr[1] = (d5 - d4) - d3;
        dArr[0] = d5;
    }

    public static InterfaceC14592 toMap(Function function, Function function2) {
        return new C21618(new C17821(5), new C16273(function, function2, 2), new C22935(14), a);
    }
}
