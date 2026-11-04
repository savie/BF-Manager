package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.֫ۖ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1628 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5643;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ AbstractC0578 f5644;

    public /* synthetic */ C1628(AbstractC0578 abstractC0578, int i) {
        this.f5643 = i;
        this.f5644 = abstractC0578;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f5643) {
            case 0:
                AbstractC22664 abstractC22664 = (AbstractC22664) obj;
                return abstractC22664.mo40452() ? abstractC22664 : ((C0310) this.f5644).f1670.m55152(abstractC22664);
            default:
                return Integer.valueOf(((C20518) this.f5644).f65727.size());
        }
    }
}
