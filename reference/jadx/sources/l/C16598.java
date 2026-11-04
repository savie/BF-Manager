package l;

/* JADX INFO: renamed from: l.ܺۙۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: QAND */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC4079(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {73}, m = "emit")
public final class C16598 extends AbstractC6317 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f53695;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public /* synthetic */ Object f53696;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17344 f53697;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16598(C17344 c17344, AbstractC6317 abstractC6317) {
        super(abstractC6317);
        this.f53697 = c17344;
    }

    @Override // l.AbstractC20487
    /* JADX INFO: renamed from: ᩷ */
    public final Object mo10983(Object obj) {
        this.f53696 = obj;
        this.f53695 |= Integer.MIN_VALUE;
        return this.f53697.mo10365(null, this);
    }
}
