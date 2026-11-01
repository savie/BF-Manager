package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۠۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C8029 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C5689.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        C9129 c9129 = (C9129) obj;
        c9129.f31068 = c9129.f31067.m52379(c9129.f31068, ((C9129) obj2).f31068, c9129.f31069);
        return c9129;
    }
}
