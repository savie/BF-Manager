package l;

import java.util.function.Predicate;

/* JADX INFO: renamed from: l.ۛܳۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C6457 implements Predicate {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC24357 f21708;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22664 f21709;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC22664 f21710;

    public /* synthetic */ C6457(AbstractC24357 abstractC24357, AbstractC22664 abstractC22664, AbstractC22664 abstractC22665) {
        this.f21708 = abstractC24357;
        this.f21710 = abstractC22664;
        this.f21709 = abstractC22665;
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate and(Predicate predicate) {
        return C19025.$default$and(this, predicate);
    }

    @Override // java.util.function.Predicate
    /* JADX INFO: renamed from: negate */
    public /* synthetic */ Predicate mo7134negate() {
        return C19025.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return C19025.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        AbstractC24357 abstractC24357 = this.f21708;
        abstractC24357.getClass();
        C14769 c14769Mo50621 = ((C7395) obj).f38067.mo50621();
        C1917 c1917 = abstractC24357.f79026;
        return c1917.f6446.m55149((AbstractC22664) c14769Mo50621.f48335, this.f21710) && c1917.f6446.m55149((AbstractC22664) c14769Mo50621.f48336.f48335, this.f21709);
    }
}
