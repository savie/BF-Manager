package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۢܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C9647 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C5689.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        AbstractC23903 abstractC23903 = (AbstractC23903) obj;
        AbstractC23903 abstractC23904 = (AbstractC23903) obj2;
        C22492 c22492 = (C22492) abstractC23904;
        abstractC23903.getClass();
        for (AbstractC23903 abstractC23905 = abstractC23903; abstractC23905.f77452 != EnumC10477.f35867; abstractC23905 = abstractC23905.f77448) {
            if (abstractC23905 == c22492) {
                return abstractC23903;
            }
        }
        return abstractC23904;
    }
}
