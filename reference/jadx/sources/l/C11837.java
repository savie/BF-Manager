package l;

import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧ᩵۫, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AHS */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11837 implements BiFunction {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C3363.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        C17804 c17804 = (C17804) obj2;
        if (c17804 == null || System.currentTimeMillis() - c17804.f58424 > 10000) {
            return new C17804();
        }
        c17804.f58424 = System.currentTimeMillis();
        return c17804;
    }
}
