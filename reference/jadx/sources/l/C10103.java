package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۢۨۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: X6CH */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10103 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C3363.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return ((C4571) obj).merge((C4571) obj2);
    }
}
