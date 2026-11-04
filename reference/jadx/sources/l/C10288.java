package l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۢܿ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 51QH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10288 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m26521(InterfaceC1340 interfaceC1340, final Predicate predicate) {
        return interfaceC1340.mo4932(predicate instanceof IntPredicate ? (IntPredicate) predicate : new IntPredicate() { // from class: l.ᩳܿ᩹
            public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return C14549.$default$and(this, intPredicate);
            }

            public /* synthetic */ IntPredicate negate() {
                return C14549.$default$negate(this);
            }

            public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return C14549.$default$or(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return predicate.test(Integer.valueOf(i));
            }
        });
    }
}
