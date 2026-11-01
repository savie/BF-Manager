package l;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: renamed from: l.۫ۗᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12144 implements InterfaceC14592 {
    public final /* synthetic */ Collector a;

    public /* synthetic */ C12144(Collector collector) {
        this.a = collector;
    }

    @Override // l.InterfaceC14592
    public final /* synthetic */ BiConsumer accumulator() {
        return this.a.accumulator();
    }

    @Override // l.InterfaceC14592
    public final /* synthetic */ Set characteristics() {
        return AbstractC14966.a(this.a.characteristics());
    }

    @Override // l.InterfaceC14592
    public final /* synthetic */ BinaryOperator combiner() {
        return this.a.combiner();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.a;
        if (obj instanceof C12144) {
            obj = ((C12144) obj).a;
        }
        return collector.equals(obj);
    }

    @Override // l.InterfaceC14592
    public final /* synthetic */ Function finisher() {
        return this.a.finisher();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // l.InterfaceC14592
    public final /* synthetic */ Supplier supplier() {
        return this.a.supplier();
    }
}
