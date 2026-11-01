package l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛ֫ᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: RAPC */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5751 implements InterfaceC9280 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC9280 f19548;

    public /* synthetic */ C5751(InterfaceC9280 interfaceC9280) {
        this.f19548 = interfaceC9280;
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
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14219 mo15846(InterfaceC9280 interfaceC9280) {
        return new C14219(this, interfaceC9280);
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
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean mo15848(byte b) {
        return !this.f19548.mo15848(b);
    }

    @Override // l.InterfaceC9280
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C23391 mo15847(InterfaceC9280 interfaceC9280) {
        return new C23391(this, interfaceC9280);
    }

    public final Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }
}
