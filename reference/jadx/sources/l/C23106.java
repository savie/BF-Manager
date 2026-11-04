package l;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: renamed from: l.᩸᩹ۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23106 implements InterfaceC5754 {
    public final /* synthetic */ Collector a;

    public /* synthetic */ C23106(Collector collector) {
        this.a = collector;
    }

    @Override // l.InterfaceC5754
    public final /* synthetic */ BiConsumer accumulator() {
        return this.a.accumulator();
    }

    @Override // l.InterfaceC5754
    public final /* synthetic */ Set characteristics() {
        return AbstractC5206.a(this.a.characteristics());
    }

    @Override // l.InterfaceC5754
    public final /* synthetic */ BinaryOperator combiner() {
        return this.a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.a;
        if (obj instanceof C23106) {
            obj = ((C23106) obj).a;
        }
        return collector.equals(obj);
    }

    @Override // l.InterfaceC5754
    public final /* synthetic */ Function finisher() {
        return this.a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC5754
    public final /* synthetic */ Supplier supplier() {
        return this.a.supplier();
    }
}
