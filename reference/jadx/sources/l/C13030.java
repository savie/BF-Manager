package l;

import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.۬ۢۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7LF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C13030 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f43467;

    public /* synthetic */ C13030(int i) {
        this.f43467 = i;
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
        switch (this.f43467) {
            case 0:
                return new HashSet();
            default:
                return ((C3836) obj).f14291;
        }
    }
}
