package l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۡۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 51QH */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8720 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m22565(InterfaceC10131 interfaceC10131, final Predicate predicate) {
        return interfaceC10131.mo3171(predicate instanceof IntPredicate ? (IntPredicate) predicate : new IntPredicate() { // from class: l.᩵ۜᩴ
            public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                return C23329.$default$and(this, intPredicate);
            }

            public /* synthetic */ IntPredicate negate() {
                return C23329.$default$negate(this);
            }

            public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                return C23329.$default$or(this, intPredicate);
            }

            @Override // java.util.function.IntPredicate
            public final boolean test(int i) {
                return predicate.test(Integer.valueOf(i));
            }
        });
    }
}
