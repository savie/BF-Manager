package l;

import java.nio.file.DirectoryStream;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.֡ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0521 implements DirectoryStream.Filter, Function {
    public static final C0521 a = new C0521();

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
    public Object apply(Object obj) {
        Set set = C5212.a;
        return ((C15339) obj).b;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* JADX INFO: renamed from: accept */
    public /* bridge */ /* synthetic */ boolean mo14669accept(Object obj) {
        return true;
    }
}
