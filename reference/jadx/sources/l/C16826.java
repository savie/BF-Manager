package l;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܺۨ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: 0C0V */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C16826 {
    @Deprecated
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m39744(InterfaceC17572 interfaceC17572, final Predicate predicate) {
        return interfaceC17572.mo2880(predicate instanceof InterfaceC1737 ? (InterfaceC1737) predicate : new InterfaceC1737() { // from class: l.᩻ۨ᩹
            @Override // java.util.function.DoublePredicate
            public final /* synthetic */ boolean test(double d) {
                return C5466.m16296(this, d);
            }

            public final /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
                return C5466.m16295(this, doublePredicate);
            }

            public final /* synthetic */ DoublePredicate or(DoublePredicate doublePredicate) {
                return C5466.m16298(this, doublePredicate);
            }

            @Override // java.util.function.Predicate
            public final /* synthetic */ boolean test(Object obj) {
                return C5466.m16297(this, (Float) obj);
            }

            @Override // l.InterfaceC1737
            /* JADX INFO: renamed from: ᩷ */
            public final C15160 mo6145(InterfaceC1737 interfaceC1737) {
                return new C15160(this, interfaceC1737);
            }

            @Override // java.util.function.Predicate
            public final Predicate and(Predicate predicate2) {
                return C19025.$default$and(this, predicate2);
            }

            public final DoublePredicate negate() {
                return new C22620(this);
            }

            @Override // java.util.function.Predicate
            /* JADX INFO: renamed from: negate */
            public final Predicate mo7134negate() {
                return new C22620(this);
            }

            @Override // l.InterfaceC1737
            /* JADX INFO: renamed from: ۙ */
            public final C12923 mo6143(InterfaceC1737 interfaceC1737) {
                return new C12923(this, interfaceC1737);
            }

            public final Predicate or(Predicate predicate2) {
                return C19025.$default$or(this, predicate2);
            }

            @Override // l.InterfaceC1737
            /* JADX INFO: renamed from: ۤ */
            public final boolean mo6144(float f) {
                return predicate.test(Float.valueOf(C8485.m22800(f)));
            }
        });
    }
}
