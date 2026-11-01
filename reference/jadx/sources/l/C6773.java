package l;

import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۜ۬֨, reason: contains not printable characters */
/* JADX INFO: compiled from: 5AHS */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6773 implements BiFunction {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C5689.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        C21590 c21590 = (C21590) obj2;
        if (c21590 == null || System.currentTimeMillis() - c21590.f70050 > 10000) {
            return new C21590();
        }
        c21590.f70050 = System.currentTimeMillis();
        return c21590;
    }
}
