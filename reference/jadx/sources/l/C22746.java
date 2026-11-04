package l;

import java.util.function.BooleanSupplier;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩸ۤᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: L6NC */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C22746 implements Function {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C17505 f73815;

    public /* synthetic */ C22746(C17505 c17505) {
        this.f73815 = c17505;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public /* synthetic */ Function mo10608andThen(Function function) {
        return C24247.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return this.f73815.m41088((BooleanSupplier) obj);
    }

    @Override // java.util.function.Function
    public /* synthetic */ Function compose(Function function) {
        return C24247.$default$compose(this, function);
    }
}
