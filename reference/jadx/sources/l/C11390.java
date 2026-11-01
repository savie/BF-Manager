package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۨ֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C11390 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9398 f38388;

    public /* synthetic */ C11390(C9398 c9398) {
        this.f38388 = c9398;
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
        return this.f38388.f20884.m31655((String) obj);
    }
}
