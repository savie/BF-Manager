package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.֫ۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1740 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f6865;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f6866;

    public /* synthetic */ C1740(int i, Object obj) {
        this.f6865 = i;
        this.f6866 = obj;
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
        switch (this.f6865) {
            case 0:
                return ((AbstractC22015) obj).m35939((C20563) this.f6866);
            default:
                C6656 c6656 = (C6656) obj;
                C5286 c5286 = ((C17864) this.f6866).f56560.f59063.f20045;
                return c5286.m14596(c6656.f22476, c6656.f22478, c5286.m14644(), (AbstractC5930) null);
        }
    }
}
