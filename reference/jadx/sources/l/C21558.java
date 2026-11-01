package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: V7EY */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21558 implements Function {
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
        return Short.toString(((C20148) obj).f67744);
    }
}
