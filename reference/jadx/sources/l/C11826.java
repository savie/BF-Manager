package l;

import java.util.Iterator;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨܽۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: F416 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11826 implements Function {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f39716;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f39717;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f39718;

    public /* synthetic */ C11826(int i, Object obj, Object obj2) {
        this.f39717 = i;
        this.f39718 = obj;
        this.f39716 = obj2;
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
        switch (this.f39717) {
            case 0:
                C6761 c6761 = (C6761) this.f39718;
                Iterator it = (Iterator) this.f39716;
                return c6761.f22834.m47251((InterfaceC12260) it.next(), (AbstractC16579) obj);
            default:
                return ((AbstractC22015) obj).mo3459((AbstractC16579) this.f39718, (AbstractC16579) this.f39716);
        }
    }
}
