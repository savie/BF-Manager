package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۤۗۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 57L9 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C10021 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f34226;

    public /* synthetic */ C10021(int i) {
        this.f34226 = i;
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
        switch (this.f34226) {
            case 0:
                return ((C3836) obj).f14263;
            default:
                return ((C6656) obj).f22478;
        }
    }
}
