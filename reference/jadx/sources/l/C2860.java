package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۖ᩻ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes2.dex */
public final class C2860 implements Predicate {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C19524 f10798;

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C8512.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo9645negate() {
        return C8512.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C8512.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC16579 abstractC16579 = (AbstractC16579) obj;
        return (abstractC16579.mo1926() || abstractC16579.m39005(this.f10798.f62771) || abstractC16579.m39001(EnumC6617.BOT)) ? false : true;
    }

    public C2860(C19524 c19524) {
        this.f10798 = c19524;
    }
}
