package l;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ܽ᩵ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17796 implements InterfaceC5754 {
    public final Supplier a;
    public final BiConsumer b;
    public final BinaryOperator c;
    public final Function d;
    public final Set e;

    public C17796(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.a = supplier;
        this.b = biConsumer;
        this.c = binaryOperator;
        this.d = function;
        this.e = set;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C17796(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Set set) {
        this(supplier, biConsumer, binaryOperator, new C14435(24), set);
        Set set2 = C2025.a;
    }

    @Override // l.InterfaceC5754
    public final BiConsumer accumulator() {
        return this.b;
    }

    @Override // l.InterfaceC5754
    public final Supplier supplier() {
        return this.a;
    }

    @Override // l.InterfaceC5754
    public final BinaryOperator combiner() {
        return this.c;
    }

    @Override // l.InterfaceC5754
    public final Function finisher() {
        return this.d;
    }

    @Override // l.InterfaceC5754
    public final Set characteristics() {
        return this.e;
    }
}
