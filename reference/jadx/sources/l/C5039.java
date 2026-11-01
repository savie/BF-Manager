package l;

import java.util.function.Function;

/* JADX INFO: renamed from: l.ۚ֫ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: B7FA */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5039 implements Function {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C9398 f17604;

    public /* synthetic */ C5039(C9398 c9398) {
        this.f17604 = c9398;
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
        C12738 c12738 = this.f17604.f20884;
        c12738.getClass();
        return c12738.m31657(EnumC13776.f45430, (C19879) obj);
    }
}
