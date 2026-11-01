package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.۬ۖۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: 97UL */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C12818 implements Function {
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
        return new C3644();
    }
}
