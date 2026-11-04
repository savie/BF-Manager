package l;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.۫ۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPJ */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12923 implements InterfaceC1737 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1737 f41392;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1737 f41393;

    public /* synthetic */ C12923(InterfaceC1737 interfaceC1737, InterfaceC1737 interfaceC1738) {
        this.f41392 = interfaceC1737;
        this.f41393 = interfaceC1738;
    }

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
    public final Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
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

    @Override // l.InterfaceC1737
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo6144(float f) {
        return this.f41392.mo6144(f) || this.f41393.mo6144(f);
    }

    public final Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }
}
