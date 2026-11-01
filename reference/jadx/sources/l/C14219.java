package l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ܳ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAPC */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C14219 implements InterfaceC9280 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9280 f46615;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9280 f46616;

    public /* synthetic */ C14219(InterfaceC9280 interfaceC9280, InterfaceC9280 interfaceC9281) {
        this.f46615 = interfaceC9280;
        this.f46616 = interfaceC9281;
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return C1517.m5287(this, i);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C1517.m5286(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return C1517.m5289(this, intPredicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return C1517.m5288(this, (Byte) obj);
    }

    @Override // l.InterfaceC9280
    /* JADX INFO: renamed from: ۙ */
    public final C14219 mo15846(InterfaceC9280 interfaceC9280) {
        return new C14219(this, interfaceC9280);
    }

    @Override // l.InterfaceC9280
    /* JADX INFO: renamed from: ܰ */
    public final boolean mo15848(byte b) {
        return this.f46615.mo15848(b) && this.f46616.mo15848(b);
    }

    @Override // java.util.function.Predicate
    public final Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    public final IntPredicate negate() {
        return new C5751(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final Predicate mo9645negate() {
        return new C5751(this);
    }

    @Override // l.InterfaceC9280
    /* JADX INFO: renamed from: ܰ */
    public final C23391 mo15847(InterfaceC9280 interfaceC9280) {
        return new C23391(this, interfaceC9280);
    }

    public final Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }
}
