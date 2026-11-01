package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۗ֡ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2882 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f10866;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f10867;

    public /* synthetic */ C2882(int i, Object obj) {
        this.f10866 = i;
        this.f10867 = obj;
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
        switch (this.f10866) {
            case 0:
                AbstractC16579 abstractC16579 = (AbstractC16579) obj;
                return abstractC16579.mo9481() ? ((C6761) this.f10867).f22802.m52383(abstractC16579).f77449 : abstractC16579;
            default:
                return ((AbstractC12138) obj).mo15919((AbstractC16579) this.f10867);
        }
    }
}
