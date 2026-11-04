package l;

import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* JADX INFO: renamed from: l.ܶۗۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15801 implements BiFunction, Function {
    public final /* synthetic */ int a;
    public Function b;

    public /* synthetic */ C15801() {
        this.a = 2;
    }

    public /* synthetic */ C15801(Function function, int i) {
        this.a = i;
        this.b = function;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return C3363.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        switch (this.a) {
            case 1:
                break;
        }
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 1:
                break;
        }
        return C24247.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                Function function = this.b;
                Map map = (Map) obj;
                Set set = C2025.a;
                C11392.replaceAll(map, new C15801(function, 0));
                return map;
            default:
                Object objApply = this.b.apply(obj);
                if (objApply == null) {
                    return null;
                }
                if (objApply instanceof InterfaceC20670) {
                    return C3516.convert((InterfaceC20670) objApply);
                }
                if (objApply instanceof Stream) {
                    return C18410.b((Stream) objApply);
                }
                if (objApply instanceof InterfaceC17686) {
                    return C16940.convert((InterfaceC17686) objApply);
                }
                if (objApply instanceof IntStream) {
                    return C25146.convert((IntStream) objApply);
                }
                if (objApply instanceof InterfaceC20648) {
                    return C15426.b((InterfaceC20648) objApply);
                }
                if (objApply instanceof DoubleStream) {
                    return C1301.b((DoubleStream) objApply);
                }
                if (objApply instanceof InterfaceC16194) {
                    return C23018.b((InterfaceC16194) objApply);
                }
                if (objApply instanceof LongStream) {
                    return C18785.b((LongStream) objApply);
                }
                C16041.a(objApply.getClass(), "java.util.stream.*Stream");
                throw null;
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        Function function = this.b;
        Set set = C2025.a;
        return function.apply(obj2);
    }
}
