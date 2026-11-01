package l;

import java.util.HashSet;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۖۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: W7SR */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2341 implements Function {
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
        C0930 c0930 = new C0930((C18570) obj);
        c0930.f3728 = new HashSet();
        return c0930;
    }
}
