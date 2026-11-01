package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩺ۡᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C59 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22894 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C5689.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        C17954 c17954 = (C17954) obj;
        c17954.addAll((C17954) obj2);
        return c17954;
    }
}
