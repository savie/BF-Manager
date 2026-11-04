package l;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۤ᩵᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: UAPK */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11100 implements InterfaceC13338 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ InterfaceC13338 f35011;

    public /* synthetic */ C11100(InterfaceC13338 interfaceC13338) {
        this.f35011 = interfaceC13338;
    }

    @Override // java.util.function.IntPredicate
    public final /* synthetic */ boolean test(int i) {
        return C15575.m37298(this, i);
    }

    public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return C15575.m37297(this, intPredicate);
    }

    public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return C15575.m37300(this, intPredicate);
    }

    @Override // java.util.function.Predicate
    public final /* synthetic */ boolean test(Object obj) {
        return C15575.m37299(this, (Character) obj);
    }

    @Override // l.InterfaceC13338
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C23035 mo28050(InterfaceC13338 interfaceC13338) {
        return new C23035(this, interfaceC13338);
    }

    @Override // java.util.function.Predicate
    public final Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    public final IntPredicate negate() {
        return new C11100(this);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public final Predicate mo7134negate() {
        return new C11100(this);
    }

    @Override // l.InterfaceC13338
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean mo28051(char c) {
        return !this.f35011.mo28051(c);
    }

    @Override // l.InterfaceC13338
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C20051 mo28052(InterfaceC13338 interfaceC13338) {
        return new C20051(this, interfaceC13338);
    }

    public final Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }
}
