package l;

import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: l.ۤۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10580 implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C10580(Function function, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = function;
        this.c = obj;
        this.d = obj2;
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 0:
                break;
        }
        return C23501.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Function function = this.b;
        switch (i) {
            case 0:
                Set set = C2025.a;
                C11392.merge((Map) obj, function.apply(obj2), ((Function) obj4).apply(obj2), (BinaryOperator) obj3);
                break;
            default:
                Set set2 = C2025.a;
                ((BiConsumer) obj3).accept(C11392.computeIfAbsent((Map) obj, C17359.requireNonNull(function.apply(obj2), "element cannot be mapped to a null key"), new C3249(10, (Supplier) obj4)), obj2);
                break;
        }
    }
}
