package l;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘ᩷۟, reason: contains not printable characters */
/* JADX INFO: compiled from: L42O */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4185 implements BinaryOperator {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f15239;

    public /* synthetic */ C4185(int i) {
        this.f15239 = i;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return C5689.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f15239) {
            case 0:
                C19003 c19003 = (C19003) obj;
                c19003.addAll((C19003) obj2);
                return c19003;
            default:
                C8387 c8387 = (C8387) obj;
                c8387.m22020(c8387.size(), (C8387) obj2);
                return c8387;
        }
    }
}
