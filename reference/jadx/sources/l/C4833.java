package l;

import java.nio.file.DirectoryStream;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: renamed from: l.ۙۤۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: N673 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4833 implements DirectoryStream.Filter, Function {
    public static final C4833 a = new C4833();

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Set set = C3445.a;
        return ((C21570) obj).b;
    }

    @Override // java.nio.file.DirectoryStream.Filter
    /* JADX INFO: renamed from: accept */
    public /* bridge */ /* synthetic */ boolean mo10607accept(Object obj) {
        return true;
    }
}
