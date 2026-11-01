package l;

/* JADX INFO: renamed from: l.ܶۧ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: QAND */
/* JADX INFO: loaded from: classes5.dex */
@InterfaceC19564(c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", f = "Distinct.kt", l = {81}, m = "emit")
public final class C15186 extends AbstractC18858 {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public /* synthetic */ Object f49574;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public int f49575;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C21535 f49576;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15186(C21535 c21535, AbstractC18858 abstractC18858) {
        super(abstractC18858);
        this.f49576 = c21535;
    }

    @Override // l.AbstractC21680
    /* JADX INFO: renamed from: ܰ */
    public final Object mo11546(Object obj) {
        this.f49574 = obj;
        this.f49575 |= Integer.MIN_VALUE;
        return this.f49576.mo21429(null, this);
    }
}
