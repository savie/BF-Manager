package l;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۙۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C0V */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C4361 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m12205(InterfaceC13535 interfaceC13535, final Predicate predicate) {
        return interfaceC13535.mo6888(predicate instanceof InterfaceC1539 ? (InterfaceC1539) predicate : new InterfaceC1539() { // from class: l.ۗۨᩴ
            @Override // java.util.function.DoublePredicate
            public final /* synthetic */ boolean test(double d) {
                return C14241.m34371(this, d);
            }

            public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
                return C14241.m34370(this, doublePredicate);
            }

            public final /* synthetic */ DoublePredicate or(DoublePredicate doublePredicate) {
                return C14241.m34373(this, doublePredicate);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ boolean test(Object obj) {
                return C14241.m34372(this, (Float) obj);
            }

            @Override // l.InterfaceC1539
            /* JADX INFO: renamed from: ܰ */
            public final C10713 mo5316(InterfaceC1539 interfaceC1539) {
                return new C10713(this, interfaceC1539);
            }

            @Override // java.util.function.Predicate
            public final Predicate and(Predicate predicate2) {
                return C8512.$default$and(this, predicate2);
            }

            public final DoublePredicate negate() {
                return new C17062(this);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate, reason: collision with other method in class */
            public final Predicate mo9645negate() {
                return new C17062(this);
            }

            @Override // l.InterfaceC1539
            /* JADX INFO: renamed from: ۙ */
            public final C23413 mo5314(InterfaceC1539 interfaceC1539) {
                return new C23413(this, interfaceC1539);
            }

            public final Predicate or(Predicate predicate2) {
                return C8512.$default$or(this, predicate2);
            }

            @Override // l.InterfaceC1539
            /* JADX INFO: renamed from: ۨ */
            public final boolean mo5315(float f) {
                return predicate.test(Float.valueOf(C21273.m47736(f)));
            }
        });
    }
}
