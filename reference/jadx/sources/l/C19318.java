package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.᩵۟ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19318 implements Function {
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
        C9129 c9129 = (C9129) obj;
        return c9129.f31070 ? c9129.f31067.m52347(c9129.f31068) : c9129.f31068;
    }
}
