package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ܺ᩸ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y7SB */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17117 implements BinaryOperator {
    public /* synthetic */ BiFunction andThen(Function function) {
        return C3363.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        AbstractC11781 abstractC11781 = (AbstractC11781) obj;
        AbstractC11781 abstractC11782 = (AbstractC11781) obj2;
        C24550 c24550 = (C24550) abstractC11782;
        abstractC11781.getClass();
        for (AbstractC11781 abstractC11783 = abstractC11781; abstractC11783.f38066 != EnumC13603.f43219; abstractC11783 = abstractC11783.f38069) {
            if (abstractC11783 == c24550) {
                return abstractC11781;
            }
        }
        return abstractC11782;
    }
}
