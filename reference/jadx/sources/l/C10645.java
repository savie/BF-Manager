package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۧ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10645 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f36315;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f36316;

    public /* synthetic */ C10645(int i, Object obj) {
        this.f36315 = i;
        this.f36316 = obj;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo33696andThen(Function function) {
        return C4277.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C4277.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f36315) {
            case 0:
                AbstractC16579 abstractC16579 = (AbstractC16579) obj;
                return abstractC16579.mo9481() ? abstractC16579 : ((C6761) this.f36316).f22802.m52437(abstractC16579);
            default:
                return ((C23800) this.f36316).m52368((InterfaceC7299) obj);
        }
    }
}
