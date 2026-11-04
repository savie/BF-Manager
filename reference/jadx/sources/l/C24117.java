package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ۜۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: K6HV */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C24117 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C3363.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return Integer.valueOf(((Integer) obj2).intValue() + ((Integer) obj).intValue());
    }
}
