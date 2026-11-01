package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۘۖ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: B7KX */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3646 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f13376;

    public /* synthetic */ C3646(int i) {
        this.f13376 = i;
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
        switch (this.f13376) {
            case 0:
                return (C3812) ((AbstractC5930) obj);
            default:
                return ((C3836) obj).f14232;
        }
    }
}
