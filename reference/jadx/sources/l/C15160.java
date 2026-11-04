package l;

import java.util.function.DoublePredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳۛ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: JAPJ */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C15160 implements InterfaceC1737 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1737 f49452;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC1737 f49453;

    public /* synthetic */ C15160(InterfaceC1737 interfaceC1737, InterfaceC1737 interfaceC1738) {
        this.f49452 = interfaceC1737;
        this.f49453 = interfaceC1738;
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
    /* JADX INFO: renamed from: ۤ */
    public final boolean mo6144(float f) {
        return this.f49452.mo6144(f) && this.f49453.mo6144(f);
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

    public final Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }
}
