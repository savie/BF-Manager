package l;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.᩻ۖᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPJ */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C23413 implements InterfaceC1539 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1539 f75818;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1539 f75819;

    public /* synthetic */ C23413(InterfaceC1539 interfaceC1539, InterfaceC1539 interfaceC15310) {
        this.f75818 = interfaceC1539;
        this.f75819 = interfaceC15310;
    }

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
    public final Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    public final DoublePredicate negate() {
        return new C17062(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final Predicate mo9645negate() {
        return new C17062(this);
    }

    @Override // l.InterfaceC1539
    /* JADX INFO: renamed from: ۙ */
    public final C23413 mo5314(InterfaceC1539 interfaceC1539) {
        return new C23413(this, interfaceC1539);
    }

    @Override // l.InterfaceC1539
    /* JADX INFO: renamed from: ۨ */
    public final boolean mo5315(float f) {
        return this.f75818.mo5315(f) || this.f75819.mo5315(f);
    }

    public final Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }
}
