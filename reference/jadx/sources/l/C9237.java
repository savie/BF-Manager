package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۡ۟᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9237 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C3363.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        C8820 c8820 = (C8820) obj;
        c8820.f28828 = c8820.f28831.m55094(c8820.f28828, ((C8820) obj2).f28828, c8820.f28829);
        return c8820;
    }
}
